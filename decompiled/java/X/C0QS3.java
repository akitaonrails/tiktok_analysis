package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.viewmodel.TakoButtonViewModel;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS6S0000001_10;

/* JADX INFO: renamed from: X.0QS3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QS3 implements InterfaceC670010QPv {
    public final /* synthetic */ BaseTakoFloatingButtonAssem LIZ;

    public C0QS3(BaseTakoFloatingButtonAssem baseTakoFloatingButtonAssem) {
        this.LIZ = baseTakoFloatingButtonAssem;
    }

    @Override // X.InterfaceC670010QPv
    public final void LIZ(C669990QPt c669990QPt) {
        int i;
        float f;
        TakoButtonViewModel takoButtonViewModelVo = this.LIZ.Vo();
        boolean z = c669990QPt.LIZ;
        if (z) {
            i = takoButtonViewModelVo.LLILLJJLI + c669990QPt.LIZIZ;
        } else {
            i = takoButtonViewModelVo.LL;
        }
        float f2 = i;
        if (z) {
            f = takoButtonViewModelVo.LLILLL;
        } else {
            f = 0.0f;
        }
        takoButtonViewModelVo.setStateImmediate(new AwS6S0000001_10(f2, 1));
        takoButtonViewModelVo.setStateImmediate(new AwS6S0000001_10(f, 0));
        takoButtonViewModelVo.LLJI = c669990QPt.LIZ;
        if (C301360Bra.LIZ()) {
            if (c669990QPt.LIZ) {
                takoButtonViewModelVo.yQ2(true);
            } else {
                takoButtonViewModelVo.yQ2(false);
            }
        }
        boolean z2 = c669990QPt.LIZ;
        if (C1112104Wp.LIZ() && z2) {
            C0QSB.LIZ.getClass();
            if (C0QSB.LIZ()) {
                takoButtonViewModelVo.setStateImmediate(AFwS241S0000000_10.get$arr$(16));
            }
        }
        boolean z3 = c669990QPt.LIZ;
        if (C1112104Wp.LIZ() && !z3) {
            takoButtonViewModelVo.setStateImmediate(AFwS241S0000000_10.get$arr$(15));
        }
        takoButtonViewModelVo.LLJIJIL = false;
    }

    @Override // X.InterfaceC670010QPv
    public final void LIZIZ(C669990QPt c669990QPt) {
        int i;
        float f;
        TakoButtonViewModel takoButtonViewModelVo = this.LIZ.Vo();
        takoButtonViewModelVo.LLJIJIL = true;
        boolean z = c669990QPt.LIZ;
        if (z) {
            i = takoButtonViewModelVo.LLILLJJLI + c669990QPt.LIZIZ;
        } else {
            i = takoButtonViewModelVo.LL;
        }
        takoButtonViewModelVo.LLILZLL = i;
        if (z) {
            f = takoButtonViewModelVo.LLILLL;
        } else {
            f = 0.0f;
        }
        takoButtonViewModelVo.LLIZ = f;
        takoButtonViewModelVo.LLJI = z;
        if (C1112104Wp.LIZ() && !z) {
            takoButtonViewModelVo.setStateImmediate(AFwS241S0000000_10.get$arr$(15));
        }
        if (C301360Bra.LIZ()) {
            if (c669990QPt.LIZ) {
                takoButtonViewModelVo.yQ2(true);
            } else {
                takoButtonViewModelVo.yQ2(false);
            }
        }
    }

    @Override // X.InterfaceC670010QPv
    public final void LIZJ(C669990QPt c669990QPt) {
        float translationY;
        float translationX;
        float f;
        this.LIZ.dp();
        TakoButtonViewModel takoButtonViewModelVo = this.LIZ.Vo();
        View view = this.LIZ.LLJIJIL;
        float f2 = 0.0f;
        if (view != null) {
            translationY = view.getTranslationY();
        } else {
            translationY = 0.0f;
        }
        View view2 = this.LIZ.LLJIJIL;
        if (view2 != null) {
            translationX = view2.getTranslationX();
        } else {
            translationX = 0.0f;
        }
        boolean z = c669990QPt.LIZ;
        if (z) {
            f = -translationY;
        } else {
            f = takoButtonViewModelVo.LL;
        }
        takoButtonViewModelVo.LLILZ = f;
        if (z) {
            f2 = -translationX;
        }
        takoButtonViewModelVo.LLILZIL = f2;
    }

    @Override // X.InterfaceC670010QPv
    public final void onProgress(float f) {
        TakoButtonViewModel takoButtonViewModelVo = this.LIZ.Vo();
        float f2 = 1 - f;
        float f3 = (takoButtonViewModelVo.LLILZ * f2) + (takoButtonViewModelVo.LLILZLL * f);
        float f4 = (takoButtonViewModelVo.LLILZIL * f2) + (takoButtonViewModelVo.LLIZ * f);
        takoButtonViewModelVo.setStateImmediate(new AwS6S0000001_10(f3, 1));
        takoButtonViewModelVo.setStateImmediate(new AwS6S0000001_10(f4, 0));
    }
}
