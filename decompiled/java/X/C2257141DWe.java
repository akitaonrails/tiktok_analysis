package X;

import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1DWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2257141DWe implements Cloneable {
    public final float LL;
    public final EnumC2257261DWq LLILLJJLI;

    public final boolean LJFF() {
        return this.LL < 0.0f;
    }

    public final boolean LJI() {
        return this.LL == 0.0f;
    }

    public C2257141DWe() {
        this.LL = 0.0f;
        this.LLILLJJLI = EnumC2257261DWq.px;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(this.LL));
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final float LIZIZ(C2257171DWh c2257171DWh) {
        float f;
        if (this.LLILLJJLI == EnumC2257261DWq.percent) {
            C2257121DWc c2257121DWc = c2257171DWh.LJ;
            C2257131DWd c2257131DWd = c2257121DWc.LJI;
            if (c2257131DWd == null && (c2257131DWd = c2257121DWc.LJFF) == null) {
                return this.LL;
            }
            float fSqrt = c2257131DWd.LIZJ;
            if (fSqrt == c2257131DWd.LIZLLL) {
                f = this.LL;
            } else {
                fSqrt = (float) (Math.sqrt((fSqrt * fSqrt) + (r1 * r1)) / 1.414213562373095d);
                f = this.LL;
            }
            return (f * fSqrt) / 100.0f;
        }
        return LIZLLL(c2257171DWh);
    }

    public final float LIZJ(C2257171DWh c2257171DWh) {
        if (this.LLILLJJLI == EnumC2257261DWq.percent) {
            return (this.LL * 1.0f) / 100.0f;
        }
        return LIZLLL(c2257171DWh);
    }

    public final float LIZLLL(C2257171DWh c2257171DWh) {
        switch (this.LLILLJJLI.ordinal()) {
            case 1:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL);
                sbLIZ.append(this.LLILLJJLI.toString());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                float f = c2257171DWh.LIZIZ;
                return C1312920kGo.LIZIZ(strLIZIZ, f, f, 0.0f, 0.0f, 0.0f, DisplayMetricsHolder.LIZIZ());
            case 2:
                return this.LL * (c2257171DWh.LIZIZ / 2.0f);
            case 3:
                float f2 = this.LL;
                c2257171DWh.getClass();
                return f2 * 96.0f;
            case 4:
                float f3 = this.LL;
                c2257171DWh.getClass();
                return (f3 * 96.0f) / 2.54f;
            case 5:
                float f4 = this.LL;
                c2257171DWh.getClass();
                return (f4 * 96.0f) / 25.4f;
            case 6:
                float f5 = this.LL;
                c2257171DWh.getClass();
                return (f5 * 96.0f) / 72.0f;
            case 7:
                float f6 = this.LL;
                c2257171DWh.getClass();
                return (f6 * 96.0f) / 6.0f;
            case 8:
                C2257121DWc c2257121DWc = c2257171DWh.LJ;
                C2257131DWd c2257131DWd = c2257121DWc.LJI;
                if (c2257131DWd == null && (c2257131DWd = c2257121DWc.LJFF) == null) {
                    return this.LL;
                }
                return (this.LL * c2257131DWd.LIZJ) / 100.0f;
            default:
                return this.LL;
        }
    }

    public final float LJ(C2257171DWh c2257171DWh) {
        if (this.LLILLJJLI == EnumC2257261DWq.percent) {
            C2257121DWc c2257121DWc = c2257171DWh.LJ;
            C2257131DWd c2257131DWd = c2257121DWc.LJI;
            if (c2257131DWd == null && (c2257131DWd = c2257121DWc.LJFF) == null) {
                return this.LL;
            }
            return (this.LL * c2257131DWd.LIZLLL) / 100.0f;
        }
        return LIZLLL(c2257171DWh);
    }

    public C2257141DWe(float f, EnumC2257261DWq enumC2257261DWq) {
        this.LL = f;
        this.LLILLJJLI = enumC2257261DWq;
    }

    public final float LIZ(float f, float f2) {
        switch (this.LLILLJJLI.ordinal()) {
            case 1:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL);
                sbLIZ.append(this.LLILLJJLI.toString());
                return C1312920kGo.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), f, f2, 0.0f, 0.0f, 0.0f, DisplayMetricsHolder.LIZIZ());
            case 2:
            case 8:
            default:
                return this.LL;
            case 3:
                return this.LL * 96.0f;
            case 4:
                return (this.LL * 96.0f) / 2.54f;
            case 5:
                return (this.LL * 96.0f) / 25.4f;
            case 6:
                return (this.LL * 96.0f) / 72.0f;
            case 7:
                return (this.LL * 96.0f) / 6.0f;
        }
    }
}
