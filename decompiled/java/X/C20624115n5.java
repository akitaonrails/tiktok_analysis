package X;

import Y.ACListenerS165S0100000_31;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15n5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20624115n5 implements InterfaceC20623415my {
    public final C19GS LIZ;
    public final LinearLayout LIZIZ;
    public final int LIZJ;
    public C197039127h LIZLLL;
    public C197039127h LJ;
    public Function0<Unit> LJFF;
    public Function0<Unit> LJI;

    @Override // X.InterfaceC20623415my
    public final void LIZ() {
        C197039127h c197039127h = this.LJ;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
    }

    @Override // X.InterfaceC20623415my
    public final void LIZIZ() {
        C197039127h c197039127h = this.LJ;
        if (c197039127h != null) {
            c197039127h.setEnabled(true);
        }
    }

    public final void LIZJ() {
        LinearLayout linearLayout = this.LIZIZ;
        C19GS c19gs = this.LIZ;
        LinearLayout linearLayout2 = new LinearLayout(c19gs);
        linearLayout2.setOrientation(0);
        C197039127h c197039127h = new C197039127h(c19gs, null, 6, 0);
        c197039127h.setText(c19gs.getString(2131838242));
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginEnd(this.LIZJ);
        C786410Ut5.J6(c197039127h, layoutParams);
        this.LIZLLL = c197039127h;
        C197039127h c197039127h2 = new C197039127h(c19gs, null, 6, 0);
        c197039127h2.setText(c19gs.getString(2131838244));
        c197039127h2.setButtonSize(3);
        c197039127h2.setEnabled(false);
        C786410Ut5.J6(c197039127h2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.LJ = c197039127h2;
        linearLayout2.addView(this.LIZLLL);
        linearLayout2.addView(this.LJ);
        C197039127h c197039127h3 = this.LJ;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS165S0100000_31(this, 199));
        }
        C197039127h c197039127h4 = this.LIZLLL;
        if (c197039127h4 != null) {
            C786410Ut5.U8(c197039127h4, new ACListenerS165S0100000_31(this, 200));
        }
        linearLayout.addView(linearLayout2);
    }

    public final void LIZLLL() {
        LinearLayout linearLayout = this.LIZIZ;
        C19GS c19gs = this.LIZ;
        C197039127h c197039127h = new C197039127h(c19gs, null, 6, 0);
        c197039127h.setText(c19gs.getString(2131838244));
        c197039127h.setButtonSize(3);
        c197039127h.setEnabled(false);
        this.LJ = c197039127h;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C197039127h c197039127h2 = this.LJ;
        if (c197039127h2 != null) {
            C786410Ut5.J6(c197039127h2, layoutParams);
        }
        C197039127h c197039127h3 = this.LJ;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS165S0100000_31(this, 201));
        }
        linearLayout.addView(c197039127h);
    }

    public C20624115n5(C19GS c19gs, LinearLayout linearLayout) {
        this.LIZ = c19gs;
        this.LIZIZ = linearLayout;
        C11VU.LIZ(12.0f);
        this.LIZJ = (int) C11VU.LIZ(8.0f);
    }
}
