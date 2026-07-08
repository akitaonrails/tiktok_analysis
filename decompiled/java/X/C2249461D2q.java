package X;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249461D2q {
    public final InterfaceC1773310wFN LIZ;
    public final C21316218bQ LIZIZ;
    public final C2249441D2o LIZJ;
    public final C19508511Ud LIZLLL;
    public final Function1<String, Unit> LJ;
    public ValueAnimator LJFF;

    public final void LIZ(C2249471D2r c2249471D2r, float f) {
        LinearGradient linearGradientLIZ;
        int iIntValue;
        C1868920yja c1868920yjaLIZIZ = this.LIZLLL.LIZIZ(c2249471D2r.LIZIZ, c2249471D2r.LIZJ, f);
        C19508411Uc c19508411Uc = c2249471D2r.LIZ;
        Integer num = c1868920yjaLIZIZ.LIZ;
        ECMixMallGradientColor eCMixMallGradientColor = c1868920yjaLIZIZ.LIZIZ;
        if (eCMixMallGradientColor != null && c19508411Uc.getWidth() > 0 && c19508411Uc.getHeight() > 0) {
            linearGradientLIZ = C423800Gja.LIZ(eCMixMallGradientColor, c19508411Uc);
        } else {
            linearGradientLIZ = null;
        }
        c19508411Uc.LLILLL = linearGradientLIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c19508411Uc.setBackgroundColor(iIntValue);
        c19508411Uc.invalidate();
    }

    public final C2249471D2r LIZIZ(C19508411Uc c19508411Uc, DynamicColorConfig dynamicColorConfig, DynamicColorConfig dynamicColorConfig2) {
        ECMixMallBgColorDTO eCMixMallBgColorDTO;
        ECMixMallBgColorDTO eCMixMallBgColorDTO2;
        if (c19508411Uc == null || dynamicColorConfig == null || (eCMixMallBgColorDTO = dynamicColorConfig.color) == null) {
            return null;
        }
        this.LIZLLL.getClass();
        C1868920yja c1868920yjaLIZJ = C19508511Ud.LIZJ(eCMixMallBgColorDTO, c19508411Uc);
        if (dynamicColorConfig2 == null || (eCMixMallBgColorDTO2 = dynamicColorConfig2.color) == null) {
            return null;
        }
        this.LIZLLL.getClass();
        C1868920yja c1868920yjaLIZJ2 = C19508511Ud.LIZJ(eCMixMallBgColorDTO2, c19508411Uc);
        this.LIZLLL.getClass();
        if (!C19508511Ud.LIZ(c19508411Uc, c1868920yjaLIZJ, c1868920yjaLIZJ2) || Intrinsics.LJFF(c1868920yjaLIZJ, c1868920yjaLIZJ2)) {
            return null;
        }
        return new C2249471D2r(c19508411Uc, c1868920yjaLIZJ, c1868920yjaLIZJ2);
    }

    public C2249461D2q(InterfaceC1773310wFN interfaceC1773310wFN, C21316218bQ c21316218bQ, C2249441D2o c2249441D2o, C19508511Ud c19508511Ud, AwS614S0100000_35 awS614S0100000_35) {
        this.LIZ = interfaceC1773310wFN;
        this.LIZIZ = c21316218bQ;
        this.LIZJ = c2249441D2o;
        this.LIZLLL = c19508511Ud;
        this.LJ = awS614S0100000_35;
    }
}
