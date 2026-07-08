package X;

import Y.ALAdapterS2S0200000_5;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;

/* JADX INFO: renamed from: X.0F5D, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5D {
    public final C0F5K LIZ;
    public final C0F5L LIZIZ;

    public final void LIZJ() {
        LIZIZ(true);
        ConstraintLayout constraintLayoutQT = this.LIZ.LIZ.qT();
        if (constraintLayoutQT != null) {
            LIZ(constraintLayoutQT, this.LIZ.LIZ.rT());
        }
        this.LIZ.LIZ.LLLZZIL.LIZ(C0F58.MULTI_SELECT_PAGE);
    }

    public final void LIZIZ(boolean z) {
        int i = 8;
        C786410Ut5.LJZL(8, this.LIZIZ.LIZIZ);
        ViewGroup viewGroup = this.LIZIZ.LJJIII;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        if (((Boolean) C277750Aub.LIZ.getValue()).booleanValue()) {
            if (this.LIZ.LIZ.LLLLLLIL.contains(((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage())) {
                TuxTextView tuxTextView = this.LIZIZ.LJIJJLI;
                if (tuxTextView != null) {
                    tuxTextView.setTextSize(2, 12.0f);
                }
                TuxTextView tuxTextView2 = this.LIZIZ.LJIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextSize(2, 13.0f);
                }
            }
        }
        TuxTextView tuxTextView3 = this.LIZIZ.LJIL;
        if (tuxTextView3 != null) {
            if (!C357780E0y.LIZ()) {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, i);
        }
        TuxTextView tuxTextView4 = this.LIZIZ.LJIJJLI;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 0);
        }
        C0F5K c0f5k = this.LIZ;
        c0f5k.LJI.LJIILJJIL = false;
        C384570F5z c384570F5z = this.LIZIZ.LJJIJIIJIL;
        if (c384570F5z != null) {
            c384570F5z.LLLIL(LifecycleOwnerKt.getLifecycleScope(c0f5k.LIZ), false, z);
        }
        this.LIZ.LIZ.YT(true, true);
        this.LIZ.LJI.LJIJJLI = "bulk_edit_panel";
    }

    public C0F5D(C0F5K c0f5k, C0F5L c0f5l) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f5l;
    }

    public static void LIZ(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        int iLIZ = C0EGK.LIZ(30);
        float translationY = constraintLayout.getTranslationY();
        C786410Ut5.jd(constraintLayout, iLIZ + translationY);
        C786410Ut5.LL(0, constraintLayout);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, "translationY", constraintLayout.getTranslationY(), translationY);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        objectAnimatorOfFloat.addListener(new ALAdapterS2S0200000_5(constraintLayout2, constraintLayout, 12));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
