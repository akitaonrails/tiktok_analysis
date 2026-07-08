package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.124k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196964124k extends C1DYT {
    public final C196966124m LLIZLLLIL;
    public TextView LLJ;
    public Float LLJI;
    public C0FM5 LLJIJIL;

    public final float getTouchDownSize() {
        Float f = this.LLJI;
        if (f != null) {
            return f.floatValue();
        }
        return 28.0f;
    }

    public final float getTouchUpSize() {
        C196966124m c196966124m = this.LLIZLLLIL;
        C196967124n<?> c196967124n = c196966124m.LIZIZ;
        if (c196967124n == null) {
            return 28.0f;
        }
        float fLIZJ = c196967124n.LIZJ();
        float progress = c196966124m.LIZ.getProgress();
        float min = Build.VERSION.SDK_INT >= 26 ? c196966124m.LIZ.getMin() : 0;
        float max = c196966124m.LIZ.getMax();
        float f = c196966124m.LIZJ;
        float f2 = c196966124m.LIZLLL;
        if (progress > min) {
            f = progress >= max ? f2 : ((f * (max - progress)) + (f2 * (progress - min))) / (max - min);
        }
        if (Float.valueOf(fLIZJ * f) != null) {
            return C814420VxA.LIZIZ(r0.floatValue());
        }
        return 28.0f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !C297910Bm1.LIZ();
    }

    @Override // X.C1DYT, android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0FM5 c0fm5;
        int min = 0;
        if (getVisibility() != 0) {
            return false;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            int action = motionEvent.getAction();
            Float fValueOf = null;
            if (action != 0) {
                if (action == 1 || action == 3) {
                    Float f = this.LLJI;
                    C196966124m c196966124m = this.LLIZLLLIL;
                    C196967124n<?> c196967124n = c196966124m.LIZIZ;
                    if (c196967124n != null) {
                        float fLIZJ = c196967124n.LIZJ();
                        float progress = c196966124m.LIZ.getProgress();
                        if (Build.VERSION.SDK_INT >= 26) {
                            min = c196966124m.LIZ.getMin();
                        }
                        float f2 = min;
                        float max = c196966124m.LIZ.getMax();
                        float f3 = c196966124m.LIZJ;
                        float f4 = c196966124m.LIZLLL;
                        if (progress > f2) {
                            if (progress >= max) {
                                f3 = f4;
                            } else {
                                f3 = ((f3 * (max - progress)) + (f4 * (progress - f2))) / (max - f2);
                            }
                        }
                        if (Float.valueOf(fLIZJ * f3) != null) {
                            fValueOf = Float.valueOf(C814420VxA.LIZIZ(r0.floatValue()));
                        }
                    }
                    if (!Intrinsics.LJ(f, fValueOf) && (c0fm5 = this.LLJIJIL) != null) {
                        c0fm5.LIZ();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prevSize: ");
                    sbLIZ.append(f);
                    sbLIZ.append(", size: ");
                    sbLIZ.append(fValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return zOnTouchEvent;
                }
            } else {
                C196967124n<?> c196967124n2 = this.LLIZLLLIL.LIZIZ;
                if (c196967124n2 != null) {
                    fValueOf = Float.valueOf(c196967124n2.LIZLLL());
                }
                this.LLJI = fValueOf;
                return zOnTouchEvent;
            }
        }
        return zOnTouchEvent;
    }

    public final void setOnAdjustTextRollbarListener(Function0<Unit> function0) {
        this.LLIZLLLIL.LJI = function0;
    }

    public final void setOnTextSizeChangedListener(C0FM5 c0fm5) {
        this.LLJIJIL = c0fm5;
    }

    public C196964124k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = new C196966124m(this);
    }

    public final void LJIIIIZZ(int i, Integer num, Integer num2) {
        C196966124m c196966124m = this.LLIZLLLIL;
        c196966124m.getClass();
        if (num != null) {
            c196966124m.LIZJ = num.intValue() / i;
        }
        if (num2 != null) {
            c196966124m.LIZLLL = num2.intValue() / i;
        }
    }
}
