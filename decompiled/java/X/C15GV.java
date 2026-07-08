package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.15GV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15GV extends C15GR<C20448614zs> {
    @Override // X.C15GR
    public final AbstractC683590Qrd LIZIZ() {
        C20494715Hl c20494715Hl = new C20494715Hl(this.LJIIIIZZ, EnumC20491915Gj.COLLECT_MUSIC);
        c20494715Hl.LLJILJILJ = this.LJIIJ;
        return c20494715Hl;
    }

    @Override // X.C15GR
    public void LJ() {
        super.LJ();
    }

    public C15GV(Context context, View view, C15GU c15gu, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i) {
        super(context, view, c15gu, 2131838148, c0p6p, interfaceC20494515Hj, i, 0);
        C786410Ut5.LLLLZLLLI(this.LIZ, 8);
        ((ViewGroup.MarginLayoutParams) this.LIZIZ.getLayoutParams()).topMargin = (int) C12ES.LIZJ(10.0f, this.LIZIZ.getContext());
        this.LIZIZ.setOverScrollMode(2);
    }
}
