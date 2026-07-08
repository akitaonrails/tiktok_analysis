package X;

import Y.AObserverS231S0100000_29;
import android.os.HandlerThread;
import com.ss.android.ugc.aweme.shortvideo.ui.task.ToolsTaskManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.110s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194320110s extends AbstractC2255721DQs<InterfaceC194318110q> implements InterfaceC194318110q {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(276));
    public final InterfaceC194318110q LLILZ = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C194320110s.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    private final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    public final ToolsTaskManager Z1() {
        return (ToolsTaskManager) this.LLILLL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().ww2().observe(this, new AObserverS231S0100000_29(this, 110));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ToolsTaskManager toolsTaskManagerZ1 = Z1();
        toolsTaskManagerZ1.LIZ = false;
        ((LinkedHashMap) toolsTaskManagerZ1.LIZJ).clear();
        toolsTaskManagerZ1.LIZ().removeCallbacksAndMessages(null);
        ((HandlerThread) toolsTaskManagerZ1.LIZIZ.getValue()).quit();
    }

    public InterfaceC194318110q W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C194320110s(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
    }

    @Override // X.InterfaceC194318110q
    public void Ns(InterfaceC1408530ml1 interfaceC1408530ml1) {
        ToolsTaskManager toolsTaskManagerZ1 = Z1();
        if (toolsTaskManagerZ1.LIZ && !toolsTaskManagerZ1.LIZ().hasMessages(EnumC585790MyH.TASK_EXEC.ordinal())) {
            C1408220mkW.LIZ(interfaceC1408530ml1);
            return;
        }
        if (C564150MAr.LIZ[interfaceC1408530ml1.LIZJ().ordinal()] == 1) {
            C1408220mkW.LIZ(interfaceC1408530ml1);
            return;
        }
        Map<EnumC194317110p, ConcurrentLinkedQueue<InterfaceC1408530ml1>> map = toolsTaskManagerZ1.LIZJ;
        EnumC194317110p enumC194317110pLIZJ = interfaceC1408530ml1.LIZJ();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object concurrentLinkedQueue = linkedHashMap.get(enumC194317110pLIZJ);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            linkedHashMap.put(enumC194317110pLIZJ, concurrentLinkedQueue);
        }
        ((ConcurrentLinkedQueue) concurrentLinkedQueue).offer(interfaceC1408530ml1);
    }
}
