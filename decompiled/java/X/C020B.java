package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.020B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020B extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f100i0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020B(int i) {
        super(0);
        this.$t = i;
        this.f100i0 = 5;
    }

    public static final Object invoke$0(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayComplete increment play_oder= ");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[movePagerByAweme] ");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: onComplete: no chunk received (chunkIndex=");
        sbLIZ.append(c020b.f100i0);
        sbLIZ.append("), update to Exception");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitResponse: unrecognized dispatch for response_type=");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldRecreateBodyListForSupplementInsert: visible items present (size=");
        sbLIZ.append(c020b.f100i0);
        sbLIZ.append("), skip recreate to keep already-rendered first-screen wrappers alive");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeResource: removed empty resource for tagType=");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveResource: saved resource for tagType=");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowReferralBannerV2 type: ");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(C020B c020b) {
        String str;
        C20441214yg.LJ("MultiLiveAsAnchorListDialogV2", "close all media cancel");
        if (6 == c020b.f100i0) {
            str = "camera";
        } else {
            str = "microphone";
        }
        C932160aMg.LIZJ("cancel", str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020B c020b) {
        C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", "onClickCloseAllGuestMedia onSuccess");
        if (c020b.f100i0 == 6) {
            C766270U4b.LIZLLL(2131854370);
        } else {
            C766270U4b.LIZLLL(2131854367);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadFirstScreen skip FULL_PRELOAD invalid count=");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: insert cart successful with index : ");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: start insert cart with index : ");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showToastOpt:");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartType: startType=");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(C020B c020b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: startType=");
        sbLIZ.append(c020b.f100i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020B(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f100i0 = i;
    }
}
