package X;

import Y.ARunnableS134S0100000_34;
import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.aigc.AIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseAIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseGetAvatars;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Bn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215331Bn9 implements InterfaceC1221470htJ {
    public static final C2215371BnD Companion = new Object() { // from class: X.1BnD
    };
    public static final C01GW<ExecutorService> executor$delegate = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(36));
    public ResponseGetAvatars LLILLJJLI;
    public final C01GW LLILZ;
    public final ARunnableS134S0100000_34 LLILZIL;
    public final AIGCApi api;
    public ResponseAIGCTaskStatus currentProcess;
    public int errorTimes;
    public boolean isRunning;
    public final List<InterfaceC1221660htc> listeners;
    public final String taskId;
    public final String LL = "slow_path";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(39));

    public final void stop() {
        this.isRunning = false;
    }

    public final ResponseGetAvatars getAvatarResult() throws InterruptedException {
        List<String> list;
        ResponseGetAvatars responseGetAvatars = this.LLILLJJLI;
        if (responseGetAvatars != null) {
            return responseGetAvatars;
        }
        AIGCApi aIGCApi = this.api;
        String str = this.taskId;
        aIGCApi.getClass();
        ResponseGetAvatars responseGetAvatarsLIZIZ = AIGCApi.LIZIZ(str);
        this.LLILLJJLI = responseGetAvatarsLIZIZ;
        if (responseGetAvatarsLIZIZ == null || (list = responseGetAvatarsLIZIZ.avatarUrls) == null || list.isEmpty()) {
            Thread.sleep(500L);
            AIGCApi aIGCApi2 = this.api;
            String str2 = this.taskId;
            aIGCApi2.getClass();
            this.LLILLJJLI = AIGCApi.LIZIZ(str2);
        }
        return this.LLILLJJLI;
    }

    public final String getDefaultErrorMessage() {
        return (String) this.LLILZ.getValue();
    }

    public final long getPollingFrequency() {
        return ((Number) this.LLILLL.getValue()).longValue();
    }

    @Override // X.InterfaceC1221470htJ
    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        Companion.getClass();
        executor$delegate.getValue().submit(this.LLILZIL);
    }

    public final ResponseGetAvatars getLastResult() {
        return this.LLILLJJLI;
    }

    public final ResponseAIGCTaskStatus getLastTask() {
        return this.currentProcess;
    }

    public final String getType() {
        return this.LL;
    }

    @Override // X.InterfaceC1221470htJ
    public void registerListener(InterfaceC1221660htc interfaceC1221660htc) {
        this.listeners.add(interfaceC1221660htc);
        ResponseAIGCTaskStatus responseAIGCTaskStatus = this.currentProcess;
        if (responseAIGCTaskStatus != null) {
            int i = responseAIGCTaskStatus.status_code;
            AIGCTaskStatus aIGCTaskStatus = null;
            String str = responseAIGCTaskStatus.status_msg;
            List<AIGCTaskStatus> list = responseAIGCTaskStatus.tasks;
            if (list != null) {
                aIGCTaskStatus = (AIGCTaskStatus) C13LP.LJJJLL(list);
            }
            callback(i, str, aIGCTaskStatus, Collections.singletonList(interfaceC1221660htc));
        }
    }

    @Override // X.InterfaceC1221470htJ
    public void unregisterListener(InterfaceC1221660htc interfaceC1221660htc) {
        this.listeners.remove(interfaceC1221660htc);
    }

    public C2215331Bn9(String str, AIGCApi aIGCApi, ResponseAIGCTaskStatus responseAIGCTaskStatus) {
        this.taskId = str;
        this.api = aIGCApi;
        if (responseAIGCTaskStatus != null) {
            this.currentProcess = responseAIGCTaskStatus;
        }
        this.listeners = new ArrayList();
        this.LLILZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(38));
        this.LLILZIL = new ARunnableS134S0100000_34(this, 17);
    }

    public final void callback(int i, String str, AIGCTaskStatus aIGCTaskStatus, List<? extends InterfaceC1221660htc> list) {
        Integer num;
        C1221710hth c1221710hth;
        List<String> list2;
        Integer numValueOf = null;
        if (aIGCTaskStatus != null) {
            num = aIGCTaskStatus.status;
        } else {
            num = null;
        }
        int status = EnumC2215361BnC.SUBMIT.getStatus();
        if (num != null && num.intValue() == status) {
            c1221710hth = new C1221710hth(EnumC1221680hte.WAITING, i, this.taskId, null, null, null, aIGCTaskStatus.jobType, aIGCTaskStatus.waitingTime, 112);
        } else {
            int status2 = EnumC2215361BnC.PROCESS.getStatus();
            if (num != null && num.intValue() == status2) {
                EnumC1221680hte enumC1221680hte = EnumC1221680hte.IN_PROGRESS;
                Float f = aIGCTaskStatus.percentage;
                if (f != null) {
                    numValueOf = Integer.valueOf((int) (f.floatValue() * 100));
                }
                c1221710hth = new C1221710hth(enumC1221680hte, i, this.taskId, null, numValueOf, null, aIGCTaskStatus.jobType, null, 336);
            } else {
                int status3 = EnumC2215361BnC.SUCCESS.getStatus();
                if (num != null && num.intValue() == status3) {
                    this.isRunning = false;
                    EnumC1221680hte enumC1221680hte2 = EnumC1221680hte.SUCCESS;
                    ResponseGetAvatars avatarResult = getAvatarResult();
                    if (avatarResult != null) {
                        list2 = avatarResult.avatarUrls;
                    } else {
                        list2 = null;
                    }
                    c1221710hth = new C1221710hth(enumC1221680hte2, i, this.taskId, null, null, new C1221640hta(list2, null, null), aIGCTaskStatus.jobType, null, 304);
                } else {
                    int status4 = EnumC2215361BnC.FAILED.getStatus();
                    if (num != null && num.intValue() == status4) {
                        this.isRunning = false;
                        c1221710hth = new C1221710hth(EnumC1221680hte.FAIL, i, this.taskId, aIGCTaskStatus.statusMessage, null, null, aIGCTaskStatus.jobType, null, 352);
                    } else {
                        this.isRunning = false;
                        c1221710hth = new C1221710hth(EnumC1221680hte.NONE, i, this.taskId, null, null, null, null, null, 496);
                    }
                }
            }
        }
        Iterator<? extends InterfaceC1221660htc> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().onUpdate(c1221710hth);
        }
    }
}
