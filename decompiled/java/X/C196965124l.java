package X;

import android.os.Build;

/* JADX INFO: renamed from: X.124l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196965124l extends C196967124n<C124Y> implements C0F50 {
    @Override // X.C0F50
    public final void LIZ() {
    }

    @Override // X.C0F50
    public final void LIZIZ() {
        C196966124m c196966124m = this.LIZIZ;
        float progress = c196966124m.LIZ.getProgress();
        float min = Build.VERSION.SDK_INT >= 26 ? c196966124m.LIZ.getMin() : 0;
        float max = c196966124m.LIZ.getMax();
        float f = c196966124m.LIZJ;
        float f2 = c196966124m.LIZLLL;
        if (progress > min) {
            f = progress >= max ? f2 : ((f * (max - progress)) + (f2 * (progress - min))) / (max - min);
        }
        if (LIZLLL() / LIZJ() != f) {
            LJI(LIZJ() * f);
        }
    }

    @Override // X.C196967124n
    public final float LIZJ() {
        return ((C124Y) this.LIZ).getDefaultTextSize();
    }

    @Override // X.C196967124n
    public final float LIZLLL() {
        return ((float) ((C124Y) this.LIZ).getEditFontSize()) > 0.0f ? ((C124Y) this.LIZ).getEditFontSize() : super.LIZLLL();
    }

    @Override // X.C196967124n
    public final void LJ() {
        super.LJ();
        ((C124Y) this.LIZ).setFontTypeChangedListener(this);
    }

    @Override // X.C196967124n
    public final void LJFF() {
        super.LJFF();
        ((C124Y) this.LIZ).setFontTypeChangedListener(null);
    }

    @Override // X.C196967124n
    public final void LJI(float f) {
        int iLIZIZ = C814420VxA.LIZIZ(f);
        if (iLIZIZ != ((C124Y) this.LIZ).getEditFontSize()) {
            ((C124Y) this.LIZ).setFontSize(iLIZIZ);
        }
    }

    public C196965124l(C124Y c124y, C196966124m c196966124m, C389630FPl c389630FPl) {
        super(c124y, c196966124m, c389630FPl);
    }
}
