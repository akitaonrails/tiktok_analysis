package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.guide.model.FirstRechargeMeta;
import com.bytedance.android.livesdk.guide.model.LocalCurrencyGiftInfo;
import com.bytedance.android.livesdk.guide.model.TaskEntranceInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoExtra;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.guide.model.TaskUtilExtra;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: renamed from: X.0fc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@InterfaceC1294060jmO
public final class C1133940fc8 implements InterfaceC1133710fbl {
    public static final C1133940fc8 LIZIZ = new C1133940fc8();
    public static GiftsInfo LIZJ;

    static {
        C1548820qPI.LIZLLL("live_frozen_coins_start_countdown", new InterfaceC1141530foN() { // from class: X.0fc9
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
                C1133940fc8.LJIILLIIL(4, null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ImageModel LJ() {
        TaskInfo taskInfo;
        TaskInfoExtra taskInfoExtra;
        TaskEntranceInfo taskEntranceInfo;
        TaskInfo taskInfo2;
        TaskInfoExtra taskInfoExtra2;
        TaskEntranceInfo taskEntranceInfo2;
        ImageModel imageModel;
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        C1134410fct c1134410fctLJI = taskManagerV2.LJI(102);
        if (c1134410fctLJI != null && (taskInfo2 = (TaskInfo) c1134410fctLJI.LIZ) != null && (taskInfoExtra2 = taskInfo2.extra) != null && (taskEntranceInfo2 = taskInfoExtra2.entrance) != null && (imageModel = taskEntranceInfo2.image) != null) {
            return imageModel;
        }
        C1134410fct c1134410fctLJI2 = taskManagerV2.LJI(106);
        if (c1134410fctLJI2 == null || (taskInfo = (TaskInfo) c1134410fctLJI2.LIZ) == null || (taskInfoExtra = taskInfo.extra) == null || (taskEntranceInfo = taskInfoExtra.entrance) == null) {
            return null;
        }
        return taskEntranceInfo.image;
    }

    public static final Gift LJFF() {
        C006A c006aLIZJ;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        GiftsInfo giftsInfo = LIZJ;
        long j = (giftsInfo == null || (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) == null) ? 6890L : liveLimitedTimeDiscountGiftInfo.giftId;
        try {
            c006aLIZJ = C1161920gLG.LIZJ(IGiftService.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c006aLIZJ = null;
        }
        IGiftService iGiftService = (IGiftService) c006aLIZJ;
        if (iGiftService != null) {
            return iGiftService.findGiftById(j);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static final int LJII() {
        TaskInfo taskInfo;
        Long lValueOf;
        TaskInfo taskInfo2;
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        C1134410fct c1134410fctLJI = taskManagerV2.LJI(102);
        if (c1134410fctLJI == null || (taskInfo2 = (TaskInfo) c1134410fctLJI.LIZ) == null) {
            C1134410fct c1134410fctLJI2 = taskManagerV2.LJI(106);
            if (c1134410fctLJI2 == null || (taskInfo = (TaskInfo) c1134410fctLJI2.LIZ) == null) {
                return 0;
            }
            lValueOf = Long.valueOf(taskInfo.rewardAmount);
        } else {
            lValueOf = Long.valueOf(taskInfo2.rewardAmount);
        }
        if (lValueOf != null) {
            return (int) lValueOf.longValue();
        }
        return 0;
    }

    public static final long LJIIIIZZ() {
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = C1134860fdc.LIZJ;
        if (firstRechargeCampaignV2 != null) {
            return firstRechargeCampaignV2.expireTime;
        }
        return 0L;
    }

    public static final boolean LJIIJJI() {
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        return LJIIL(taskManagerV2.LJI(102)) || LJIIL(taskManagerV2.LJI(103)) || LJIIL(taskManagerV2.LJI(106));
    }

    public static final boolean LJIILJJIL() {
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = C1134860fdc.LIZJ;
        return firstRechargeCampaignV2 != null && firstRechargeCampaignV2.isShowCountdown;
    }

    @Override // X.InterfaceC1133710fbl
    public final GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 LIZ() {
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
        return C1134860fdc.LIZJ;
    }

    @Override // X.InterfaceC1133710fbl
    public final boolean LIZIZ() {
        return TaskManagerV2.LIZ.LJIIJJI(103);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1133710fbl
    public final boolean LIZJ() {
        TaskInfo taskInfo;
        TaskInfoExtra taskInfoExtra;
        FirstRechargeMeta firstRechargeMeta;
        C1134410fct c1134410fctLJI = TaskManagerV2.LIZ.LJI(102);
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = C1134860fdc.LIZJ;
        Boolean boolValueOf = null;
        if (C500260Jjc.LJJJI(firstRechargeCampaignV2 != null ? Boolean.valueOf(firstRechargeCampaignV2.isCashFirstCharge) : null)) {
            return false;
        }
        if (c1134410fctLJI != null && (taskInfo = (TaskInfo) c1134410fctLJI.LIZ) != null && (taskInfoExtra = taskInfo.extra) != null && (firstRechargeMeta = taskInfoExtra.firstRecharge) != null) {
            boolValueOf = Boolean.valueOf(firstRechargeMeta.isFirstCashRecharge);
        }
        return (C500260Jjc.LJJJI(boolValueOf) || LIZLLL()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1133710fbl
    public final boolean kb() {
        TaskInfo taskInfo;
        TaskInfoExtra taskInfoExtra;
        FirstRechargeMeta firstRechargeMeta;
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        C1134410fct c1134410fctLJI = taskManagerV2.LJI(102);
        return C500260Jjc.LJJJI(((c1134410fctLJI == null && (c1134410fctLJI = taskManagerV2.LJI(106)) == null) || (taskInfo = (TaskInfo) c1134410fctLJI.LIZ) == null || (taskInfoExtra = taskInfo.extra) == null || (firstRechargeMeta = taskInfoExtra.firstRecharge) == null) ? null : Boolean.valueOf(firstRechargeMeta.isFirstCashRecharge));
    }

    public C1133940fc8() {
        new C1103530ep5();
    }

    public static final LocalCurrencyGiftInfo LJIIIZ() {
        TaskInfoResponse.Data data;
        TaskUtilExtra taskUtilExtra;
        IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
        if (iRevenueStrategyServiceLIZIZ == null || iRevenueStrategyServiceLIZIZ.KE0() == null || (data = TaskManagerV2.LIZLLL) == null || (taskUtilExtra = data.taskUtilExtra) == null) {
            return null;
        }
        return taskUtilExtra.localCurrencyGiftInfo;
    }

    public final boolean LIZLLL() {
        long jLJIIIIZZ = LJIIIIZZ();
        return jLJIIIIZZ <= 0 || jLJIIIIZZ <= (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1;
    }

    public final long LJI() {
        Gift giftLJFF = LJFF();
        if (giftLJFF != null) {
            return giftLJFF.id;
        }
        return 0L;
    }

    public final boolean LJIIJ() {
        if (Intrinsics.LJFF(String.valueOf(UserService.getInstance().user().getCurrentUserId()), C1127240fRK.LJ())) {
            return false;
        }
        return LIZIZ() ? LJIILL() : LJIIJJI() || kb();
    }

    public final boolean LJIILL() {
        if (!LIZIZ()) {
            return false;
        }
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = C1134860fdc.LIZJ;
        return C500260Jjc.LJJJI(firstRechargeCampaignV2 != null ? Boolean.valueOf(firstRechargeCampaignV2.isCashFirstCharge) : null) && !LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIIL(C1134410fct c1134410fct) {
        Boolean boolValueOf;
        TaskInfo taskInfo;
        TaskInfoExtra taskInfoExtra;
        FirstRechargeMeta firstRechargeMeta;
        if (c1134410fct != null && (taskInfo = (TaskInfo) c1134410fct.LIZ) != null && (taskInfoExtra = taskInfo.extra) != null && (firstRechargeMeta = taskInfoExtra.firstRecharge) != null) {
            boolValueOf = Boolean.valueOf(firstRechargeMeta.isFirstCharge);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public final boolean LJIILIIL(String str) {
        if (Intrinsics.LJFF(str, "short_video")) {
            return false;
        }
        return LJIIJJI();
    }

    @InterfaceC1294060jmO
    public static final void LJIILLIIL(int i, Function1<? super GetFirstRechargeInfoV2Resp.Data, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1133960fcA(i, null, function1), 3);
    }
}
