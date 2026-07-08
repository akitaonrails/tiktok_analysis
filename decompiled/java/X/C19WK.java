package X;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatDelegateImpl;
import u4.q0;

/* JADX INFO: renamed from: X.19WK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19WK implements InterfaceC21549419Vc {
    public final InterfaceC21549419Vc LIZ;
    public final /* synthetic */ AppCompatDelegateImpl LIZIZ;

    @Override // X.InterfaceC21549419Vc
    public final void LIZJ(AbstractC21549319Vb abstractC21549319Vb) {
        this.LIZ.LIZJ(abstractC21549319Vb);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LIZIZ;
        if (appCompatDelegateImpl.LLJJJJ != null) {
            appCompatDelegateImpl.LLJILJIL.getDecorView().removeCallbacks(this.LIZIZ.LLJJJJJIL);
        }
        AppCompatDelegateImpl appCompatDelegateImpl2 = this.LIZIZ;
        if (appCompatDelegateImpl2.LLJJJIL != null) {
            C19WF c19wf = appCompatDelegateImpl2.LLJJJJLIIL;
            if (c19wf != null) {
                c19wf.LIZIZ();
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = this.LIZIZ;
            C19WF c19wfLIZIZ = q0.LIZIZ(appCompatDelegateImpl3.LLJJJIL);
            c19wfLIZIZ.LIZ(0.0f);
            appCompatDelegateImpl3.LLJJJJLIIL = c19wfLIZIZ;
            this.LIZIZ.LLJJJJLIIL.LJ(new C21550819Vq() { // from class: X.19WN
                @Override // X.C19WE
                public final void LIZ() {
                    C786410Ut5.LLILII(this.LIZ.LIZIZ.LLJJJIL, 8);
                    AppCompatDelegateImpl appCompatDelegateImpl4 = this.LIZ.LIZIZ;
                    PopupWindow popupWindow = appCompatDelegateImpl4.LLJJJJ;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    } else if (appCompatDelegateImpl4.LLJJJIL.getParent() instanceof View) {
                        C20097313kJ.LIZJ((View) this.LIZ.LIZIZ.LLJJJIL.getParent());
                    }
                    this.LIZ.LIZIZ.LLJJJIL.LJII();
                    this.LIZ.LIZIZ.LLJJJJLIIL.LJ(null);
                    AppCompatDelegateImpl appCompatDelegateImpl5 = this.LIZ.LIZIZ;
                    appCompatDelegateImpl5.LLJJJJLIIL = null;
                    C20097313kJ.LIZJ(appCompatDelegateImpl5.LLJL);
                }
            });
        }
        AppCompatDelegateImpl appCompatDelegateImpl4 = this.LIZIZ;
        C19WW c19ww = appCompatDelegateImpl4.LLJILLL;
        if (c19ww != null) {
            c19ww.onSupportActionModeFinished(appCompatDelegateImpl4.LLJJJ);
        }
        AppCompatDelegateImpl appCompatDelegateImpl5 = this.LIZIZ;
        appCompatDelegateImpl5.LLJJJ = null;
        C20097313kJ.LIZJ(appCompatDelegateImpl5.LLJL);
        this.LIZIZ.LJJL();
    }

    public C19WK(AppCompatDelegateImpl appCompatDelegateImpl, InterfaceC21549419Vc interfaceC21549419Vc) {
        this.LIZIZ = appCompatDelegateImpl;
        this.LIZ = interfaceC21549419Vc;
    }

    @Override // X.InterfaceC21549419Vc
    public final boolean LIZ(AbstractC21549319Vb abstractC21549319Vb, C19V6 c19v6) {
        C20097313kJ.LIZJ(this.LIZIZ.LLJL);
        return this.LIZ.LIZ(abstractC21549319Vb, c19v6);
    }

    @Override // X.InterfaceC21549419Vc
    public final boolean LIZIZ(AbstractC21549319Vb abstractC21549319Vb, C19V6 c19v6) {
        return this.LIZ.LIZIZ(abstractC21549319Vb, c19v6);
    }

    @Override // X.InterfaceC21549419Vc
    public final boolean LIZLLL(AbstractC21549319Vb abstractC21549319Vb, MenuItem menuItem) {
        return this.LIZ.LIZLLL(abstractC21549319Vb, menuItem);
    }
}
