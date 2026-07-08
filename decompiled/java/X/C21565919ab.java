package X;

import android.view.View;

/* JADX INFO: renamed from: X.19ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21565919ab implements InterfaceC21576019cE {
    public float LIZ;
    public float LIZIZ = 0.8f;
    public float LIZJ = 1.0f;
    public float LIZLLL = 0.8f;
    public float LJ = 1.0f;

    @Override // X.InterfaceC21576019cE
    public final void LLJJLIIIJLLLLLLLZ(View view) {
        if (view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
            C786410Ut5.Jc(view, 0.0f);
            C786410Ut5.ed(view, 0.0f);
        }
    }

    @Override // X.InterfaceC21576019cE
    public final void LLJL(C21606519h9 c21606519h9, View view, boolean z, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (c21606519h9 != null && this.LIZJ >= this.LIZIZ && this.LJ >= this.LIZLLL && c21606519h9.getChildExpectSize() > 0) {
            float fAbs = Math.abs(i);
            int childExpectSize = c21606519h9.getChildExpectSize();
            float f6 = this.LIZJ;
            float f7 = this.LIZIZ;
            float f8 = childExpectSize;
            float f9 = this.LJ;
            float f10 = f9 - (((f9 - this.LIZLLL) * fAbs) / f8);
            float fLIZ = C419990GdR.LIZ(f6 - (((f6 - f7) * fAbs) / f8), f7, f6);
            float fLIZ2 = C419990GdR.LIZ(f10, this.LIZLLL, this.LJ);
            C786410Ut5.Ob(view, fLIZ);
            C786410Ut5.pc(view, fLIZ2);
            float f11 = this.LIZ;
            if (f11 > 0.0f) {
                if (z) {
                    f = f11 * f8;
                    f2 = 2.0f - this.LJ;
                    f3 = this.LIZLLL;
                } else {
                    f = f11 * f8;
                    f2 = 2.0f - this.LIZJ;
                    f3 = this.LIZIZ;
                }
                float f12 = (f * (f2 - f3)) / 2.0f;
                float fMin = Math.min(fAbs, f8);
                float f13 = f8 / 2.0f;
                float fAbs2 = 1.0f - (Math.abs(fMin - f13) / f13);
                if (i > 0) {
                    if (fMin >= f13) {
                        f5 = (-f12) + (fAbs2 * 0.5f * f12);
                    } else {
                        f4 = fAbs2 * (-0.5f);
                        f5 = f4 * f12;
                    }
                } else {
                    f4 = fAbs2 * 0.5f;
                    if (fMin > f13) {
                        f5 = f12 - (f4 * f12);
                    } else {
                        f5 = f4 * f12;
                    }
                }
                if (z) {
                    C786410Ut5.ed(view, f5);
                } else {
                    C786410Ut5.Jc(view, f5);
                }
            }
        }
    }
}
