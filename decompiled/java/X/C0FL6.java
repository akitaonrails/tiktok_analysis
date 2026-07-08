package X;

import android.view.View;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FL6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FL6 extends AbstractC388230FKb implements C0FLA {
    public final C388200FJy LIZIZ;
    public final C01GW LIZJ;
    public C0FLM LIZLLL;
    public View LJ;
    public C0FL4 LJFF;

    @Override // X.C0FLA
    public final Integer LIZ() {
        return null;
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        this.LJFF = null;
    }

    @Override // X.C0FLA
    public final void LJFF() {
        C0FL9 c0fl9 = this.LIZIZ.LJIJI;
        if (c0fl9 != null) {
            c0fl9.LIZJ();
        }
        C0FL9 c0fl92 = this.LIZIZ.LJIJI;
        if (c0fl92 != null) {
            c0fl92.LJ();
        }
        this.LIZIZ.LJIIL.LIZIZ.invoke();
        C388200FJy c388200FJy = this.LIZIZ;
        C0FL9 c0fl93 = c388200FJy.LJIJI;
        if (c0fl93 != null) {
            c0fl93.LIZLLL(c388200FJy.LJ.LIZ, new C0FL7(this));
        }
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        C0FLM c0flm = this.LIZLLL;
        if (c0flm != null) {
            int visibility = c0flm.getVisibility();
            c0flm.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0flm);
        }
        View view = this.LJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.C0FLA
    public final Integer LIZJ() {
        return 2131829762;
    }

    public C0FL6(C388200FJy c388200FJy) {
        super(c388200FJy);
        this.LIZIZ = c388200FJy;
        this.LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1599));
    }

    @Override // X.C0FLA
    public final void LIZLLL(C0FLM c0flm) {
        this.LIZLLL = c0flm;
    }

    @Override // X.C0FLA
    public final void LJ(View view) {
        this.LJ = view;
    }

    @Override // X.AbstractC388230FKb
    public final void LJIIIIZZ(C0FL4 c0fl4) {
        this.LJFF = c0fl4;
    }
}
