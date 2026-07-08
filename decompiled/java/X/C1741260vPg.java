package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741260vPg {
    public final EnumC1741180vPY LIZ;
    public final EnumC1741180vPY LIZIZ;
    public final C1741150vPV LIZJ;

    public final EnumC1741270vPh LIZ() {
        switch (C1741190vPZ.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 5:
                switch (C1741190vPZ.LIZIZ[this.LIZJ.LIZ.ordinal()]) {
                    case 1:
                        return EnumC1741270vPh.TAB_SWITCH;
                    case 2:
                        return EnumC1741270vPh.MALL_ROUTE_IN_HOMEPAGE;
                    case 3:
                        return EnumC1741270vPh.FROM_BACKGROUND;
                    case 4:
                        return EnumC1741270vPh.FROM_SUBPAGE;
                    case 5:
                    case 6:
                        return EnumC1741270vPh.FROM_SUBPAGE;
                    case 7:
                        return EnumC1741270vPh.FROM_SPLIT_SCREEN;
                    case 8:
                        return EnumC1741270vPh.FROM_SPLIT_SCREEN;
                    default:
                        C1741370vPr.LIZ(C1741370vPr.LIZ, "convertMallStatusToLifecycleSourceType", "unexpected desc", this, 56);
                        return EnumC1741270vPh.FROM_SUBPAGE;
                }
            case 2:
                return EnumC1741270vPh.TAB_SWITCH;
            case 3:
            case 6:
                return EnumC1741270vPh.TO_BACKGROUND;
            case 4:
            case 7:
                switch (C1741190vPZ.LIZIZ[this.LIZJ.LIZ.ordinal()]) {
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return EnumC1741270vPh.TO_SUBPAGE;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        return EnumC1741270vPh.TO_SPLIT_SCREEN;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        return EnumC1741270vPh.TO_SPLIT_SCREEN;
                    default:
                        C1741370vPr.LIZ(C1741370vPr.LIZ, "convertMallStatusToLifecycleSourceType", "unexpected desc", this, 56);
                        return EnumC1741270vPh.TO_SUBPAGE;
                }
            default:
                throw new C1954807lC();
        }
    }

    public final boolean LIZJ() {
        switch (C1741190vPZ.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new C1954807lC();
        }
    }

    public final boolean LIZLLL() {
        switch (C1741190vPZ.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                return false;
            case 4:
            case 7:
                return true;
            default:
                throw new C1954807lC();
        }
    }

    public final boolean LJ() {
        switch (C1741190vPZ.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 5:
                return true;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                return false;
            default:
                throw new C1954807lC();
        }
    }

    public final boolean LJFF() {
        switch (C1741190vPZ.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 5:
                return false;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                return true;
            default:
                throw new C1954807lC();
        }
    }

    public final boolean LIZIZ(C1767790w6T c1767790w6T) {
        EnumC1741180vPY enumC1741180vPY;
        if (this.LIZJ.LIZIZ && c1767790w6T != null) {
            if (c1767790w6T.LIZ == EnumC1767410w5r.ROUTE && Intrinsics.LJFF(c1767790w6T.LJIIL, "1")) {
                EnumC1741180vPY enumC1741180vPY2 = this.LIZIZ;
                if (enumC1741180vPY2 != EnumC1741180vPY.IN_MALL_HOMEPAGE || ((enumC1741180vPY = this.LIZ) != EnumC1741180vPY.IN_MALL_COVERED_BY_PAGE && enumC1741180vPY != EnumC1741180vPY.IN_MALL_APP_NOT_ACTIVE)) {
                    if (enumC1741180vPY2 == EnumC1741180vPY.IN_MALL_NOT_LOGIN) {
                        EnumC1741180vPY enumC1741180vPY3 = this.LIZ;
                        if (enumC1741180vPY3 != EnumC1741180vPY.IN_MALL_NOT_LOGIN_COVERED_BY_PAGE && enumC1741180vPY3 != EnumC1741180vPY.IN_MALL_NOT_LOGIN_APP_NOT_ACTIVE) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public C1741260vPg(EnumC1741180vPY enumC1741180vPY, EnumC1741180vPY enumC1741180vPY2, C1741150vPV c1741150vPV) {
        this.LIZ = enumC1741180vPY;
        this.LIZIZ = enumC1741180vPY2;
        this.LIZJ = c1741150vPV;
    }
}
