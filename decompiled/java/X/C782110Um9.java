package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: renamed from: X.0Um9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C782110Um9 extends AbstractC782280UmQ<C782110Um9> {
    public CharSequence LIZJ;
    public View LIZLLL;
    public CharSequence LJ;
    public C753530Th9 LJFF;
    public ColorStateList LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public float LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public DialogInterface.OnShowListener LJIIZILJ;
    public DialogInterface.OnDismissListener LJIJ;
    public DialogInterface.OnCancelListener LJIJI;
    public InterfaceC517220KQe LJIJJ;
    public C494730Jah LJIJJLI;
    public C773790UWz LJIL;
    public C0TZ2 LJJ;
    public C0TZ3 LJJI;
    public C782070Um5 LJJIFFI;
    public C0UQI LJJII;
    public InterfaceC782250UmN LJJIII;
    public int LJJIIJ;

    public final void LIZIZ() {
        this.LJFF = null;
        this.LJII = false;
        this.LJI = null;
        this.LJIIIIZZ = -2;
        this.LJIIIZ = -2;
    }

    public final LiveDialog LIZ() {
        return new LiveDialog(this.LIZ, this);
    }

    public C782110Um9(Context context) {
        super(context);
        this.LJIIIIZZ = -2;
        this.LJIIIZ = -2;
        this.LJIILL = true;
        this.LJIILLIIL = true;
    }

    public final void LIZJ(C494730Jah c494730Jah) {
        this.LJIJJLI = c494730Jah;
        this.LJIL = null;
    }

    public final void LIZLLL(C773790UWz c773790UWz) {
        this.LJIL = c773790UWz;
        this.LJIJJLI = null;
    }

    public final void LJFF(int i) {
        this.LJII = C783380UoC.LIZ.LIZIZ(i, false);
        LJI(C783370UoB.LIZ(i, this.LIZ));
    }

    public final void LJI(Drawable drawable) {
        if (this.LJFF == null && drawable == null) {
            return;
        }
        LIZIZ();
        this.LJFF = new C753530Th9(drawable, 1);
    }

    public final void LJII(int i) {
        LJIIIZ(this.LIZ.getResources().getString(i));
    }

    public final void LJIIIIZZ(View view) {
        if (this.LIZLLL != null || view != null) {
            this.LIZLLL = view;
            this.LJ = "";
        }
    }

    public final void LJIIIZ(CharSequence charSequence) {
        if (!TextUtils.isEmpty(this.LJ) || !TextUtils.isEmpty(charSequence)) {
            this.LJ = charSequence;
            this.LIZLLL = null;
        }
    }

    public final void LJIIL(int i) {
        LJIILIIL(i, new C304701Gb());
    }

    public final void LJIIZILJ(int i) {
        this.LIZJ = this.LIZ.getResources().getString(i);
    }

    public C782110Um9(Context context, int i) {
        super(context, i);
        this.LJIIIIZZ = -2;
        this.LJIIIZ = -2;
        this.LJIILL = true;
        this.LJIILLIIL = true;
    }

    public final void LJ(C753530Th9 c753530Th9, float f) {
        LIZIZ();
        c753530Th9.LIZJ = 3;
        this.LJFF = c753530Th9;
        this.LJIIL = f;
        this.LJIILIIL = true;
    }

    public final void LJIIJ(int i, InterfaceC743640TFa interfaceC743640TFa) {
        LJIIJJI(this.LIZ.getResources().getString(i), interfaceC743640TFa);
    }

    public final void LJIIJJI(CharSequence charSequence, InterfaceC743640TFa interfaceC743640TFa) {
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = charSequence;
        c755630TkX.LIZJ = interfaceC743640TFa;
        this.LJJI = new C0TZ3(c755630TkX);
        C494720Jag c494720Jag = new C494720Jag();
        c494720Jag.LIZ(this.LJJ);
        c494720Jag.LIZ(this.LJJI);
        LIZJ(new C494730Jah(c494720Jag));
    }

    public final void LJIILIIL(int i, InterfaceC743640TFa interfaceC743640TFa) {
        LJIILJJIL(this.LIZ.getResources().getString(i), interfaceC743640TFa);
    }

    public final void LJIILJJIL(CharSequence charSequence, InterfaceC743640TFa interfaceC743640TFa) {
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = charSequence;
        c755620TkW.LIZJ = interfaceC743640TFa;
        this.LJJ = new C0TZ2(c755620TkW);
        C494720Jag c494720Jag = new C494720Jag();
        c494720Jag.LIZ(this.LJJ);
        c494720Jag.LIZ(this.LJJI);
        LIZJ(new C494730Jah(c494720Jag));
    }

    public final void LJIILL(CharSequence charSequence, InterfaceC743640TFa interfaceC743640TFa) {
        C782180UmG c782180UmG = new C782180UmG();
        c782180UmG.LIZ = charSequence;
        c782180UmG.LIZJ = interfaceC743640TFa;
        this.LJJIFFI = new C782070Um5(c782180UmG);
        C773780UWy c773780UWy = new C773780UWy();
        c773780UWy.LIZ(this.LJJIFFI);
        c773780UWy.LIZ(this.LJJII);
        LIZLLL(new C773790UWz(c773780UWy));
    }

    public final void LJIILLIIL(CharSequence charSequence, InterfaceC743640TFa interfaceC743640TFa) {
        C782210UmJ c782210UmJ = new C782210UmJ();
        c782210UmJ.LIZ = charSequence;
        c782210UmJ.LIZJ = interfaceC743640TFa;
        this.LJJII = new C0UQI(c782210UmJ);
        C773780UWy c773780UWy = new C773780UWy();
        c773780UWy.LIZ(this.LJJIFFI);
        c773780UWy.LIZ(this.LJJII);
        LIZLLL(new C773790UWz(c773780UWy));
    }
}
