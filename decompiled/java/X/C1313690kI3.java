package X;

import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;

/* JADX INFO: renamed from: X.0kI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313690kI3 {
    public final AbstractC1317090kNX LIZ;
    public BackgroundDrawable LIZIZ;
    public C1314380kJA LIZJ;
    public float LIZLLL;
    public int LJ;

    public BackgroundDrawable LIZ() {
        return new BackgroundDrawable(this.LIZ, this.LIZLLL);
    }

    public final BackgroundDrawable LIZIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZ();
            this.LIZIZ.setCallback(this.LIZJ);
        }
        return this.LIZIZ;
    }

    public C1313690kI3(AbstractC1317090kNX abstractC1317090kNX) {
        this.LIZ = abstractC1317090kNX;
    }

    public final void LIZJ(int i) {
        if (this.LJ == i) {
            return;
        }
        this.LJ = i;
        if (i == 0 && this.LIZIZ == null) {
            return;
        }
        LIZIZ().setColor(i);
    }

    public final void LIZLLL(int i, C1314120kIk c1314120kIk) {
        BackgroundDrawable backgroundDrawableLIZIZ = LIZIZ();
        backgroundDrawableLIZIZ.getClass();
        if (i > 0 && i <= 8) {
            C1313750kI9 c1313750kI9 = backgroundDrawableLIZIZ.LJIL;
            if (c1313750kI9 == null) {
                backgroundDrawableLIZIZ.LJIL = new C1313750kI9();
                backgroundDrawableLIZIZ.LJIILL();
            } else {
                c1313750kI9.LJ = null;
            }
            C1313750kI9 c1313750kI92 = backgroundDrawableLIZIZ.LJIL;
            int i2 = i - 1;
            c1313750kI92.getClass();
            if (i2 >= 0 && i2 < 8) {
                if (c1313750kI92.LIZLLL == null) {
                    c1313750kI92.LIZLLL = new C1314120kIk[8];
                }
                C1314120kIk c1314120kIk2 = c1313750kI92.LIZLLL[i2];
                if (c1314120kIk2 != null && C1314140kIm.LIZ(c1314120kIk.LIZ, c1314120kIk2.LIZ) && C1314140kIm.LIZ(c1314120kIk.LIZIZ, c1314120kIk2.LIZIZ) && c1314120kIk.LIZJ == c1314120kIk2.LIZJ && c1314120kIk.LIZLLL == c1314120kIk2.LIZLLL) {
                    return;
                }
                c1313750kI92.LIZLLL[i2] = c1314120kIk;
                backgroundDrawableLIZIZ.LJIIZILJ = true;
                backgroundDrawableLIZIZ.invalidateSelf();
            }
        }
    }
}
