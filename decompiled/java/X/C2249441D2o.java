package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249441D2o {
    public final InterfaceC1773310wFN LIZ;
    public final C21316218bQ LIZIZ;
    public final C19508511Ud LIZJ;
    public final Function1<String, Unit> LIZLLL;

    public static boolean LJFF(View view) {
        Drawable background = view.getBackground();
        if (background == null) {
            return false;
        }
        if (!(background instanceof C423780GjY) && !(background instanceof C2248341CzI)) {
            return false;
        }
        view.setBackground(null);
        return true;
    }

    public final void LIZ(DynamicColorConfig dynamicColorConfig) {
        ECMixMallStyleDTO eCMixMallStyleDTO;
        C1772690wEN c1772690wEN;
        C19508411Uc c19508411UcLIZ = C429610Gsx.LIZ(this.LIZ.LIZLLL().LJ.getBodyImage());
        if (c19508411UcLIZ == null) {
            Function1<String, Unit> function1 = this.LIZLLL;
            if (function1 != null) {
                function1.invoke("applyBodyBackground skipped: bodyBackgroundView is null");
                return;
            }
            return;
        }
        C1772630wEH c1772630wEHC82 = this.LIZ.LJIIIZ().c82();
        if (c1772630wEHC82 != null && (c1772690wEN = c1772630wEHC82.LIZLLL) != null) {
            eCMixMallStyleDTO = c1772690wEN.LIZ;
        } else {
            eCMixMallStyleDTO = null;
        }
        LIZIZ(c19508411UcLIZ, dynamicColorConfig, eCMixMallStyleDTO);
    }

    public final void LIZJ(DynamicColorConfig dynamicColorConfig) {
        ECMixMallStyleDTO eCMixMallStyleDTO;
        C1773780wG8 c1773780wG8;
        C19508411Uc c19508411UcLIZ = C429610Gsx.LIZ(this.LIZ.LIZLLL().LJ.getHeaderImage());
        if (c19508411UcLIZ == null) {
            Function1<String, Unit> function1 = this.LIZLLL;
            if (function1 != null) {
                function1.invoke("applyHeaderBackground skipped: headerBackgroundView is null");
                return;
            }
            return;
        }
        C1772630wEH c1772630wEHC82 = this.LIZ.LJIIIZ().c82();
        if (c1772630wEHC82 != null && (c1773780wG8 = c1772630wEHC82.LIZJ) != null) {
            eCMixMallStyleDTO = c1773780wG8.LIZIZ;
        } else {
            eCMixMallStyleDTO = null;
        }
        LIZIZ(c19508411UcLIZ, dynamicColorConfig, eCMixMallStyleDTO);
    }

    public final void LJ(DynamicColorConfig dynamicColorConfig) {
        ECMixMallStyleDTO eCMixMallStyleDTO;
        C19508411Uc c19508411UcLIZ = C429610Gsx.LIZ(this.LIZ.LIZLLL().LJ.getContainerImage());
        if (c19508411UcLIZ == null) {
            Function1<String, Unit> function1 = this.LIZLLL;
            if (function1 != null) {
                function1.invoke("applyPageBackground skipped: pageBackgroundView is null");
                return;
            }
            return;
        }
        C1772630wEH c1772630wEHC82 = this.LIZ.LJIIIZ().c82();
        if (c1772630wEHC82 != null) {
            eCMixMallStyleDTO = c1772630wEHC82.LIZIZ;
        } else {
            eCMixMallStyleDTO = null;
        }
        LIZIZ(c19508411UcLIZ, dynamicColorConfig, eCMixMallStyleDTO);
    }

    public final void LIZLLL(View view, DynamicColorConfig dynamicColorConfig) {
        ECMixMallBgColorDTO eCMixMallBgColorDTO;
        Drawable c2248341CzI;
        if (dynamicColorConfig.itemId == null || (eCMixMallBgColorDTO = dynamicColorConfig.color) == null) {
            return;
        }
        this.LIZJ.getClass();
        C1868920yja c1868920yjaLIZJ = C19508511Ud.LIZJ(eCMixMallBgColorDTO, view);
        ECMixMallGradientColor eCMixMallGradientColor = c1868920yjaLIZJ.LIZIZ;
        if (eCMixMallGradientColor != null) {
            c2248341CzI = new C423780GjY(eCMixMallGradientColor, c1868920yjaLIZJ.LIZ);
        } else {
            Integer num = c1868920yjaLIZJ.LIZ;
            if (num != null) {
                c2248341CzI = new C2248341CzI(num.intValue());
            } else {
                return;
            }
        }
        view.setBackground(c2248341CzI);
    }

    public static void LIZIZ(C19508411Uc c19508411Uc, DynamicColorConfig dynamicColorConfig, ECMixMallStyleDTO eCMixMallStyleDTO) {
        ECMixMallStyleDTO eCMixMallStyleDTO2 = eCMixMallStyleDTO;
        if (dynamicColorConfig != null) {
            eCMixMallStyleDTO2 = new ECMixMallStyleDTO(0, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, dynamicColorConfig.color, null, null);
        }
        c19508411Uc.LIZ(eCMixMallStyleDTO2);
    }

    public C2249441D2o(InterfaceC1773310wFN interfaceC1773310wFN, C21316218bQ c21316218bQ, C19508511Ud c19508511Ud, AwS614S0100000_35 awS614S0100000_35) {
        this.LIZ = interfaceC1773310wFN;
        this.LIZIZ = c21316218bQ;
        this.LIZJ = c19508511Ud;
        this.LIZLLL = awS614S0100000_35;
    }
}
