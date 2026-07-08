package X;

import Y.ACListenerS163S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12JL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12JL implements InterfaceC19732212Ie {
    public final View LIZ;
    public final C12J0 LIZIZ;
    public final C12JK LIZJ;
    public final ViewGroup LIZLLL;
    public final C19735712Jn LJ;

    @Override // X.InterfaceC19732212Ie
    public final void LIZ() {
        if (this.LIZIZ.LIZ) {
            C19735712Jn c19735712Jn = this.LJ;
            if (c19735712Jn.LLIZLLLIL) {
                return;
            }
            c19735712Jn.setChecked(true);
        }
    }

    @Override // X.InterfaceC19732212Ie
    public final boolean LIZIZ() {
        return this.LIZIZ.LIZ;
    }

    @Override // X.InterfaceC19732212Ie
    public final void LIZJ() {
        if (this.LIZIZ.LIZ) {
            C19735712Jn c19735712Jn = this.LJ;
            if (c19735712Jn.LLIZLLLIL) {
                return;
            }
            c19735712Jn.setChecked(true);
        }
    }

    @Override // X.InterfaceC19732212Ie
    public final void LIZLLL() {
        if (!this.LIZIZ.LIZ) {
            this.LJ.setChecked(true);
            C786410Ut5.LJLZ(8, this.LIZLLL);
            return;
        }
        this.LJ.setEnableTouch(false);
        this.LJ.setChecked(this.LIZJ.LIZ.Le());
        C12JK c12jk = this.LIZJ;
        boolean z = this.LJ.LLIZLLLIL;
        C12J7 c12j7 = c12jk.LIZIZ;
        if (c12j7 != null) {
            c12j7.LIZJ(z);
        }
        c12jk.LIZLLL.LIZLLL(!z);
        c12jk.LIZ.Ze(z);
        this.LJ.setOnCheckedChangeListener(new InterfaceC19734812Je() { // from class: X.12JM
            @Override // X.InterfaceC19734812Je
            public final void LIZ(boolean z2) {
                C12JK c12jk2 = this.LIZ.LIZJ;
                C12J7 c12j72 = c12jk2.LIZIZ;
                if (c12j72 != null) {
                    c12j72.LIZJ(z2);
                }
                c12jk2.LIZLLL.LIZLLL(!z2);
                c12jk2.LIZ.Ze(z2);
            }
        });
        C786410Ut5.K7(this.LIZLLL, new ACListenerS163S0100000_29(this, 169));
        this.LIZJ.LJ.LIZ();
        C786410Ut5.LJLZ(0, this.LIZLLL);
    }

    @Override // X.InterfaceC19732212Ie
    public final boolean LJ() {
        return this.LJ.LLIZLLLIL;
    }

    public C12JL(View view, C12J0 c12j0, C12JK c12jk) {
        this.LIZ = view;
        this.LIZIZ = c12j0;
        this.LIZJ = c12jk;
        this.LIZLLL = (ViewGroup) view.findViewById(R.id.i4c);
        this.LJ = (C19735712Jn) view.findViewById(R.id.hyg);
    }
}
