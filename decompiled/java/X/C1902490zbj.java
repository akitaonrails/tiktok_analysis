package X;

import android.os.HandlerThread;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.Condition;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeFrequencyControlConfig;
import com.ss.android.ugc.aweme.notification.frequency.AbsNoticeFrequencyActionManager;
import com.ss.android.ugc.aweme.notification.frequency.NoticeReportBehaviorModel;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902490zbj implements InterfaceC1902550zbp, InterfaceC1902560zbq {
    public static final C1902490zbj LIZ = new C1902490zbj();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(273));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(596));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(274));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(597));
    public static volatile boolean LJFF;

    public static Map LIZLLL() {
        return (Map) LJ.getValue();
    }

    public static final void LIZ(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("afterRefresh position: ");
        sbLIZ.append(str);
        C1720106oR.LJI("NoticeFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : LIZLLL().entrySet()) {
            if (entry.getValue() instanceof InterfaceC1902550zbp) {
                entry.getValue().getClass();
            }
        }
    }

    public static final void LIZIZ(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterPageAction position: ");
        sbLIZ.append(str);
        C1720106oR.LJI("NoticeFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : LIZLLL().entrySet()) {
            if (entry.getValue() instanceof InterfaceC1902550zbp) {
                NoticeReportBehaviorModel noticeReportBehaviorModel = (NoticeReportBehaviorModel) entry.getValue();
                noticeReportBehaviorModel.LJI = str;
                HandlerThread handlerThread = new HandlerThread("ReportThread");
                noticeReportBehaviorModel.LIZLLL = handlerThread;
                handlerThread.start();
                noticeReportBehaviorModel.LJ = new NoticeReportBehaviorModel.ReportHandler(C786410Ut5.W2(handlerThread), new AwS572S0100000_28(noticeReportBehaviorModel, 320));
            }
        }
    }

    public static final void LIZJ(String str) {
        Object c098200Yq;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exitPageAction position: ");
        sbLIZ.append(str);
        C1720106oR.LJI("NoticeFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : LIZLLL().entrySet()) {
            if (entry.getValue() instanceof InterfaceC1902550zbp) {
                NoticeReportBehaviorModel noticeReportBehaviorModel = (NoticeReportBehaviorModel) entry.getValue();
                noticeReportBehaviorModel.LIZ(true);
                HandlerThread handlerThread = noticeReportBehaviorModel.LIZLLL;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                noticeReportBehaviorModel.LIZLLL = null;
                noticeReportBehaviorModel.LJ = null;
            }
        }
        Iterator it2 = ((Map) LIZLLL.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            AbsNoticeFrequencyActionManager absNoticeFrequencyActionManager = (AbsNoticeFrequencyActionManager) ((Map.Entry) it2.next()).getValue();
            absNoticeFrequencyActionManager.getClass();
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("NoticeFrequencyManager(");
            absNoticeFrequencyActionManager.LIZ();
            sbLIZ2.append("Read");
            sbLIZ2.append(')');
            C1720106oR.LJI(C2188811AlT.LIZIZ(sbLIZ2), "clearCache Frequency");
            try {
                Keva kevaLIZJ = AbsNoticeFrequencyActionManager.LIZJ();
                if (!absNoticeFrequencyActionManager.LIZIZ.isEmpty()) {
                    String strLIZLLL = absNoticeFrequencyActionManager.LIZLLL();
                    LinkedHashMap<String, NoticeFrequencyControlConfig> linkedHashMap = absNoticeFrequencyActionManager.LIZIZ;
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry<String, NoticeFrequencyControlConfig> entry2 : linkedHashMap.entrySet()) {
                        arrayList.add(new AbsNoticeFrequencyActionManager.FrequencyLocalEntry(entry2.getKey(), entry2.getValue()));
                    }
                    kevaLIZJ.storeString(strLIZLLL, JsonParseUtils.LJ(arrayList));
                }
                absNoticeFrequencyActionManager.LIZIZ.clear();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("NoticeFrequencyManager(");
                absNoticeFrequencyActionManager.LIZ();
                sbLIZ3.append("Read");
                sbLIZ3.append(')');
                C1720106oR.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), "storeNidCountMap error", thM5exceptionOrNullimpl);
            }
            absNoticeFrequencyActionManager.LIZJ = false;
        }
    }

    public static void LJ(MusNotice musNotice) {
        List<NoticeFrequencyControlConfig> list;
        NoticeFrequencyControlConfig next;
        NoticeFrequencyControlConfig noticeFrequencyControlConfig;
        if (musNotice != null && (list = musNotice.noticeFrequencyList) != null && !list.isEmpty()) {
            LIZ.getClass();
            if (((Map) LIZLLL.getValue()).get(2) != null) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("triggerFrequencyAction Action: ");
                sbLIZ.append(2);
                C1720106oR.LJI("NoticeFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
                Iterator<NoticeFrequencyControlConfig> it2 = musNotice.noticeFrequencyList.iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (next.userAction != 2);
                NoticeFrequencyControlConfig noticeFrequencyControlConfig2 = next;
                if (noticeFrequencyControlConfig2 != null) {
                    LIZ.getClass();
                    AbsNoticeFrequencyActionManager absNoticeFrequencyActionManager = (AbsNoticeFrequencyActionManager) ((Map) LIZLLL.getValue()).get(2);
                    if (absNoticeFrequencyActionManager != null) {
                        String str = musNotice.nid;
                        if (!absNoticeFrequencyActionManager.LIZJ) {
                            try {
                                if (absNoticeFrequencyActionManager.LIZIZ.isEmpty()) {
                                    int i2 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("NoticeFrequencyManager(");
                                    absNoticeFrequencyActionManager.LIZ();
                                    sbLIZ2.append("Read");
                                    sbLIZ2.append(')');
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("initFrequencyMap From: ");
                                    sbLIZ3.append(absNoticeFrequencyActionManager.LIZLLL());
                                    C1720106oR.LJI(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3));
                                    String string = AbsNoticeFrequencyActionManager.LIZJ().getString(absNoticeFrequencyActionManager.LIZLLL(), "");
                                    if (string != null && string.length() != 0) {
                                        for (AbsNoticeFrequencyActionManager.FrequencyLocalEntry frequencyLocalEntry : JsonParseUtils.LIZJ(AbsNoticeFrequencyActionManager.FrequencyLocalEntry.class, string)) {
                                            String str2 = frequencyLocalEntry.nid;
                                            if (str2 != null && (noticeFrequencyControlConfig = frequencyLocalEntry.config) != null) {
                                                absNoticeFrequencyActionManager.LIZIZ.put(str2, noticeFrequencyControlConfig);
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C098200Yq c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                if (thM5exceptionOrNullimpl != null) {
                                    int i3 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("NoticeFrequencyManager(");
                                    absNoticeFrequencyActionManager.LIZ();
                                    sbLIZ4.append("Read");
                                    sbLIZ4.append(')');
                                    C1720106oR.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4), "Init Local FrequencyMap error", thM5exceptionOrNullimpl);
                                }
                            }
                            absNoticeFrequencyActionManager.LIZJ = true;
                        }
                        int i4 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("NoticeFrequencyManager(");
                        absNoticeFrequencyActionManager.LIZ();
                        sbLIZ5.append("Read");
                        sbLIZ5.append(')');
                        C2188811AlT.LIZIZ(sbLIZ5);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("registerNotice + ");
                        sbLIZ6.append(str);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        NoticeFrequencyControlConfig noticeFrequencyControlConfig3 = absNoticeFrequencyActionManager.LIZIZ.get(str);
                        LinkedHashMap<String, NoticeFrequencyControlConfig> linkedHashMap = absNoticeFrequencyActionManager.LIZIZ;
                        if (linkedHashMap.size() >= absNoticeFrequencyActionManager.LIZIZ() && linkedHashMap.entrySet().iterator().hasNext() && noticeFrequencyControlConfig3 == null) {
                            linkedHashMap.remove(linkedHashMap.entrySet().iterator().next().getKey());
                        }
                        LinkedHashMap<String, NoticeFrequencyControlConfig> linkedHashMap2 = absNoticeFrequencyActionManager.LIZIZ;
                        if (noticeFrequencyControlConfig3 != null) {
                            noticeFrequencyControlConfig2.condition.LIZ = noticeFrequencyControlConfig3.condition.LIZ;
                        }
                        linkedHashMap2.put(str, noticeFrequencyControlConfig2);
                        NoticeFrequencyControlConfig noticeFrequencyControlConfig4 = absNoticeFrequencyActionManager.LIZIZ.get(musNotice.nid);
                        if (noticeFrequencyControlConfig4 != null) {
                            Condition condition = noticeFrequencyControlConfig4.condition;
                            int i5 = condition.LIZ + 1;
                            condition.LIZ = i5;
                            if (i5 >= condition.threshold) {
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("NoticeFrequencyManager(");
                                absNoticeFrequencyActionManager.LIZ();
                                sbLIZ7.append("Read");
                                sbLIZ7.append(')');
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("executeNoticeBehavior  behavior: ");
                                sbLIZ8.append(noticeFrequencyControlConfig4.behavior.action);
                                C1720106oR.LJI(strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ8));
                                absNoticeFrequencyActionManager.LIZ.LIZ(musNotice, noticeFrequencyControlConfig4);
                            }
                        }
                    }
                }
            }
        }
    }
}
