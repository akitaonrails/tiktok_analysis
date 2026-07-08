package X;

import android.util.SparseArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0kHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313380kHY {
    public static final C1593470rZJ LIZ = new SparseArray<BaseInterpolator>() { // from class: X.0rZJ
        {
            put(0, new LinearInterpolator());
            put(1, new AccelerateInterpolator());
            put(2, new DecelerateInterpolator());
            put(3, new AccelerateDecelerateInterpolator());
        }
    };

    public static Interpolator LIZ(C1313370kHX c1313370kHX) {
        int i = c1313370kHX.LLILZIL;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return LIZ.get(i);
            case 4:
                if (!LIZIZ(c1313370kHX.LLILZLL)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid square-bezier control point x=");
                    sbLIZ.append(c1313370kHX.LLILZLL);
                    sbLIZ.append(", fallback to linear.");
                    LynxLog.w("InterpolatorFactory", C2188811AlT.LIZIZ(sbLIZ));
                    return LIZ.get(0);
                }
                return C0GY9.LIZ(c1313370kHX.LLILZLL, c1313370kHX.LLIZ);
            case 5:
                if (LIZIZ(c1313370kHX.LLILZLL) && LIZIZ(c1313370kHX.LLIZLLLIL)) {
                    return C0GY9.LIZIZ(c1313370kHX.LLILZLL, c1313370kHX.LLIZ, c1313370kHX.LLIZLLLIL, c1313370kHX.LLJ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Invalid cubic-bezier control points x1=");
                sbLIZ2.append(c1313370kHX.LLILZLL);
                sbLIZ2.append(", x2=");
                sbLIZ2.append(c1313370kHX.LLIZLLLIL);
                sbLIZ2.append(", fallback to linear.");
                LynxLog.w("InterpolatorFactory", C2188811AlT.LIZIZ(sbLIZ2));
                return LIZ.get(0);
            case 6:
                final int i2 = (int) c1313370kHX.LLILZLL;
                final int i3 = c1313370kHX.LLJI;
                return new Interpolator(i2, i3) { // from class: X.0kJK
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
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("layout animation don't support interpolator:");
                sbLIZ3.append(i);
                LynxLog.DTHROW(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
                return LIZ.get(0);
        }
    }

    public static boolean LIZIZ(float f) {
        if (!Float.isNaN(f) && !Float.isInfinite(f) && f >= 0.0f && f <= 1.0f) {
            return true;
        }
        return false;
    }
}
