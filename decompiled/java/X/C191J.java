package X;

import android.animation.FloatEvaluator;
import android.util.Property;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.191J, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191J extends C191C {
    public View LLILZIL;
    public View LLILZLL;

    @Override // X.C191C
    public final void LIZIZ(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.T4(view2, f);
        }
    }

    @Override // X.C191C
    public final C191E LIZJ(boolean z) {
        float f;
        this.LLILZIL = this.LLILLL.findViewById(R.id.jju);
        View viewFindViewById = this.LLILLL.findViewById(R.id.ccd);
        this.LLILZLL = viewFindViewById;
        if (this.LLILZIL == null && viewFindViewById == null) {
            return C191E.LIZJ;
        }
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        final Class<Number> cls = Number.class;
        return new C191M(new C191N(this.LLILLL, new Property<View, Number>(cls) { // from class: X.191L
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ Number get(View view) {
                return null;
            }

            @Override // android.util.Property
            public final void set(View view, Number number) {
                Number number2 = number;
                if (number2 != null) {
                    float fFloatValue = number2.floatValue();
                    View view2 = this.LIZ.LLILZIL;
                    if (view2 != null) {
                        C786410Ut5.T4(view2, fFloatValue);
                    }
                    View view3 = this.LIZ.LLILZLL;
                    if (view3 != null) {
                        C786410Ut5.T4(view3, fFloatValue);
                    }
                }
            }
        }, new FloatEvaluator(), Float.valueOf(f), Float.valueOf(f2), new InterpolatorC448120Hhi(4.0f)));
    }
}
