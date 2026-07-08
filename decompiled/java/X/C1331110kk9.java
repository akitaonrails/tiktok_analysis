package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0kk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331110kk9 extends C1331060kk4 {
    public final Drawable[] LLJ;
    public int LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public final int[] LLJILJILJ;
    public final int[] LLJILLL;
    public int LLJJ;
    public final boolean[] LLJJI;
    public int LLJJIII;

    public final void LIZLLL() {
        this.LLJI = 2;
        for (int i = 0; i < this.LLJ.length; i++) {
            this.LLJILLL[i] = this.LLJJI[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.LLJJIII == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLJJ;
    }

    public C1331110kk9(Drawable[] drawableArr) {
        boolean z;
        super(drawableArr);
        if (drawableArr.length >= 1) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJ("At least one layer required!", z);
        this.LLJ = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.LLJILJILJ = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.LLJILLL = iArr2;
        this.LLJJ = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.LLJJI = zArr;
        this.LLJJIII = 0;
        this.LLJI = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void LJ(int i) {
        int iIntValue = ((Number) C303110BuP.LIZJ.getValue()).intValue();
        if (iIntValue == 1 || (iIntValue == 2 && C303110BuP.LIZ)) {
            i = 0;
        }
        this.LLJIJIL = i;
        if (this.LLJI == 1) {
            this.LLJI = 0;
        }
    }

    public final boolean LJI(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.LLJ.length; i2++) {
            boolean z2 = this.LLJJI[i2];
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            int[] iArr = this.LLJILLL;
            int i3 = (int) (this.LLJILJILJ[i2] + (i * 255 * f));
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (z2) {
                if (iArr[i2] < 255) {
                    z = false;
                }
            } else if (iArr[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C1331060kk4, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        boolean zLJI;
        boolean z;
        int i = this.LLJI;
        int i2 = 2;
        int i3 = 0;
        if (i != 0) {
            if (i != 1) {
                zLJI = true;
            } else {
                if (this.LLJIJIL > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C1322350kW1.LJFF(z);
                zLJI = LJI((SystemClock.uptimeMillis() - this.LLJILJIL) / this.LLJIJIL);
                if (!zLJI) {
                    i2 = 1;
                }
                this.LLJI = i2;
            }
        } else {
            System.arraycopy(this.LLJILLL, 0, this.LLJILJILJ, 0, this.LLJ.length);
            this.LLJILJIL = SystemClock.uptimeMillis();
            if (this.LLJIJIL == 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            zLJI = LJI(f);
            if (!zLJI) {
                i2 = 1;
            }
            this.LLJI = i2;
        }
        while (true) {
            Drawable[] drawableArr = this.LLJ;
            if (i3 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i3];
            int i4 = (this.LLJILLL[i3] * this.LLJJ) / 255;
            if (drawable != null && i4 > 0) {
                this.LLJJIII++;
                drawable.mutate().setAlpha(i4);
                this.LLJJIII--;
                drawable.draw(canvas);
            }
            i3++;
        }
        if (!zLJI) {
            invalidateSelf();
        }
    }

    @Override // X.C1331060kk4, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LLJJ != i) {
            this.LLJJ = i;
            invalidateSelf();
        }
    }
}
