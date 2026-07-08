package X;

import android.graphics.drawable.Drawable;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fF5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119650fF5 implements InterfaceC1119640fF4 {
    public final /* synthetic */ C1119590fEz LIZ;
    public final /* synthetic */ LiveIconView LIZIZ;

    @Override // X.InterfaceC1119640fF4
    public final void LIZIZ() {
        C786410Ut5.LLJJIJIL(this.LIZIZ, 8);
        C1119590fEz c1119590fEz = this.LIZ;
        c1119590fEz.LJJIIJ = true;
        C1119750fFF c1119750fFF = c1119590fEz.LJIILL;
        if (c1119750fFF != null) {
            c1119750fFF.LIZ();
        }
    }

    @Override // X.InterfaceC1119640fF4
    public final void LIZ(Drawable drawable) {
        EnumC1119730fFD enumC1119730fFDLIZ;
        C1119590fEz c1119590fEz = this.LIZ;
        if (c1119590fEz.LJJII) {
            AbstractC1119600fF0 abstractC1119600fF0 = c1119590fEz.LJIILIIL;
            if (abstractC1119600fF0 != null) {
                enumC1119730fFDLIZ = abstractC1119600fF0.LIZ();
            } else {
                enumC1119730fFDLIZ = null;
            }
            if (enumC1119730fFDLIZ == EnumC1119730fFD.ATTR) {
                drawable.setTint(C20736316Cj.LIZIZ(R.attr.ezq, C1834150xpV.LJIIIIZZ(this.LIZ.LIZ)));
            }
        }
        if (this.LIZ.LJJIFFI) {
            C443530HaJ c443530HaJ = new C443530HaJ(this.LIZ.LIZ.getResources(), C1319770kRr.LIZIZ(drawable));
            c443530HaJ.LIZIZ();
            this.LIZIZ.setIcon(c443530HaJ);
        } else {
            this.LIZIZ.setIcon(drawable);
        }
        C1119590fEz c1119590fEz2 = this.LIZ;
        c1119590fEz2.LJIJI = c1119590fEz2.LIZ.getResources().getDimensionPixelSize(R.dimen.b0d);
        C1119590fEz c1119590fEz3 = this.LIZ;
        c1119590fEz3.LJIJJ = c1119590fEz3.LIZ.getResources().getDimensionPixelSize(R.dimen.b0d);
        C1119590fEz c1119590fEz4 = this.LIZ;
        c1119590fEz4.LJIJJLI = c1119590fEz4.LIZ.getResources().getDimensionPixelSize(R.dimen.b0b);
        C1119590fEz c1119590fEz5 = this.LIZ;
        c1119590fEz5.LJIL = c1119590fEz5.LIZ.getResources().getDimensionPixelSize(R.dimen.b0d);
        C1119590fEz c1119590fEz6 = this.LIZ;
        c1119590fEz6.LJJIIJ = true;
        C1119750fFF c1119750fFF = c1119590fEz6.LJIILL;
        if (c1119750fFF != null) {
            c1119750fFF.LIZ();
        }
    }

    public C1119650fF5(C1119590fEz c1119590fEz, LiveIconView liveIconView) {
        this.LIZ = c1119590fEz;
        this.LIZIZ = liveIconView;
    }
}
