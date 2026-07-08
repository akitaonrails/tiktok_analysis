package X;

import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTest;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestList;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReplyTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHosTimeoutStrategy;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHosTimeoutStrategyGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ayY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955640ayY {
    public static final long LIZ;
    public static final boolean LIZIZ;
    public static final int LIZJ;
    public static final Map<String, Object> LIZLLL;

    static {
        MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        LIZ = MtCoHostReplyTimeOutSetting.INSTANCE.getValue();
        LiveCoHosTimeoutStrategyGroup liveCoHosTimeoutStrategyGroup = LiveCoHosTimeoutStrategyGroup.INSTANCE;
        LIZIZ = liveCoHosTimeoutStrategyGroup.isDefaultGroup();
        LIZJ = liveCoHosTimeoutStrategyGroup.getValue();
        LIZLLL = LiveCoHosTimeoutStrategy.INSTANCE.getValue();
    }

    public static long LIZ(long j, List list) {
        CohostABTestList cohostABTestList;
        List<CohostABTest> list2;
        Double d;
        if (!LIZIZ && j != 0 && list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CohostABTestSetting cohostABTestSetting = (CohostABTestSetting) it2.next();
                if (j == cohostABTestSetting.key && (cohostABTestList = cohostABTestSetting.value) != null && (list2 = cohostABTestList.abTestList) != null) {
                    for (CohostABTest cohostABTest : list2) {
                        if (cohostABTest.abTestType == 1 && cohostABTest.group == LIZJ) {
                            C954660awy.LJIILJJIL.add(Long.valueOf(j));
                            Object obj = LIZLLL.get("handler_timeout");
                            if ((obj instanceof Double) && (d = (Double) obj) != null) {
                                return (long) d.doubleValue();
                            }
                            return LIZ;
                        }
                    }
                }
            }
            return LIZ;
        }
        return LIZ;
    }

    public static long LIZIZ(long j, List list) {
        CohostABTestList cohostABTestList;
        List<CohostABTest> list2;
        Double d;
        if (!LIZIZ && j != 0 && list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CohostABTestSetting cohostABTestSetting = (CohostABTestSetting) it2.next();
                if (j == cohostABTestSetting.key && (cohostABTestList = cohostABTestSetting.value) != null && (list2 = cohostABTestList.abTestList) != null) {
                    for (CohostABTest cohostABTest : list2) {
                        if (cohostABTest.abTestType == 1 && cohostABTest.group == LIZJ) {
                            C954660awy.LJIILJJIL.add(Long.valueOf(j));
                            Object obj = LIZLLL.get("invitee_timeout");
                            if ((obj instanceof Double) && (d = (Double) obj) != null) {
                                return (long) d.doubleValue();
                            }
                            return LIZ;
                        }
                    }
                }
            }
            return LIZ;
        }
        return LIZ;
    }
}
