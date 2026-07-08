package X;

import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.UgTaskDetailPageSourceSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131530fYF {
    public static final /* synthetic */ int LIZ = 0;

    public static final C1134410fct LIZLLL() {
        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
        C1134410fct c1134410fctLJI = iRevenueStrategyService.KE0().LJI(13);
        return c1134410fctLJI == null ? iRevenueStrategyService.KE0().LJI(14) : c1134410fctLJI;
    }

    public static final boolean LJI() {
        C1134410fct c1134410fctLJI = C1126800fQc.LIZ.KE0().LJI(14);
        return c1134410fctLJI != null && c1134410fctLJI.LJIIJJI() && c1134410fctLJI.LIZJ() == EnumC1134460fcy.TASK_IN_PROGRESS;
    }

    public static final long LIZJ() {
        C1134410fct c1134410fctLIZLLL = LIZLLL();
        if (c1134410fctLIZLLL != null) {
            return c1134410fctLIZLLL.LJIIIZ().LIZ;
        }
        return 0L;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJ(String str) {
        C1134410fct c1134410fctLIZLLL;
        if (str == null) {
            c1134410fctLIZLLL = LIZLLL();
            return c1134410fctLIZLLL != null ? false : false;
        }
        switch (str.hashCode()) {
            case -822866928:
                if (!str.equals("ug_task_detail_page")) {
                }
                break;
            case -193936721:
                if (str.equals("heartme_ug_task_detail_page")) {
                    return true;
                }
                break;
            case 1111897724:
                if (!str.equals("gift_guide_ug_task_gift_popup")) {
                }
                break;
            case 1729125001:
                if (!str.equals("gift_guide_ug_task_show_popup")) {
                }
                break;
        }
        c1134410fctLIZLLL = LIZLLL();
        if (c1134410fctLIZLLL != null || ((TaskInfo) c1134410fctLIZLLL.LIZ).taskType != 13 || !c1134410fctLIZLLL.LJIIJJI()) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(String str) {
        return UgTaskDetailPageSourceSettings.INSTANCE.contains(str);
    }

    public static final long LIZIZ(long j, DataChannel dataChannel) {
        C1134410fct c1134410fctLIZLLL;
        C1134410fct c1134410fctLIZLLL2 = LIZLLL();
        if (c1134410fctLIZLLL2 != null && C1126800fQc.LIZ.u21().LIZ(j, c1134410fctLIZLLL2, dataChannel, "") && (c1134410fctLIZLLL = LIZLLL()) != null) {
            return c1134410fctLIZLLL.LJIIIZ().LIZLLL;
        }
        return 0L;
    }

    public static final boolean LIZ(long j, DataChannel dataChannel, String str) {
        C1134410fct c1134410fctLIZLLL = LIZLLL();
        if (c1134410fctLIZLLL != null) {
            return C1126800fQc.LIZ.u21().LIZ(j, c1134410fctLIZLLL, dataChannel, str);
        }
        return false;
    }
}
