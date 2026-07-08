package X;

import android.util.SparseArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0kI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313730kI7 {
    public static final C1593460rZI LIZ = new SparseArray<BaseInterpolator>() { // from class: X.0rZI
        {
            put(0, new LinearInterpolator());
            put(1, new AccelerateInterpolator());
            put(2, new DecelerateInterpolator());
            put(3, new AccelerateDecelerateInterpolator());
        }
    };

    public static Interpolator LIZ(C1313710kI5 c1313710kI5) {
        int i = c1313710kI5.LLILZIL;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return LIZ.get(i);
            case 4:
                return C0GY9.LIZ(c1313710kI5.LLILZLL, c1313710kI5.LLIZ);
            case 5:
                return C0GY9.LIZIZ(c1313710kI5.LLILZLL, c1313710kI5.LLIZ, c1313710kI5.LLIZLLLIL, c1313710kI5.LLJ);
            case 6:
                final int i2 = (int) c1313710kI5.LLILZLL;
                final int i3 = c1313710kI5.LLJI;
                return new Interpolator(i2, i3) { // from class: X.0kJJ
                    public final int LIZ;
                    public final int LIZIZ;

                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        int i4;
                        int i5;
                        float f2;
                        int i6 = this.LIZIZ;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        return 0.0f;
                                    }
                                    int i7 = this.LIZ;
                                    int i8 = ((int) (f * i7)) + 1;
                                    if (i8 > i7) {
                                        i8 = i7;
                                    }
                                    f2 = i8;
                                    i4 = i7 + 1;
                                } else {
                                    int i9 = this.LIZ;
                                    int i10 = (int) (f * i9);
                                    if (i10 == i9) {
                                        i10--;
                                    }
                                    f2 = i10;
                                    i4 = i9 - 1;
                                }
                                return f2 / i4;
                            }
                            i4 = this.LIZ;
                            i5 = (int) (f * i4);
                            if (i5 == i4) {
                                i5--;
                            }
                        } else {
                            i4 = this.LIZ;
                            i5 = ((int) (f * i4)) + 1;
                            if (i5 > i4) {
                                i5 = i4;
                            }
                        }
                        f2 = i5;
                        return f2 / i4;
                    }

                    {
                        this.LIZ = i2;
                        this.LIZIZ = i3;
                    }
                };
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layout animation don't support interpolator:");
                sbLIZ.append(i);
                C1314420kJE.LIZIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                throw null;
        }
    }
}
