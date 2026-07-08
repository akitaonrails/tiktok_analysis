package X;

import android.os.Build;
import android.widget.SeekBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FM3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FM3 extends C2217421BqW implements Function1<Float, Unit> {
    public C0FM3(C0FM0 c0fm0) {
        super(1, c0fm0, C0FM0.class, "restoreProgress", "restoreProgress(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        int min;
        float fFloatValue = f.floatValue();
        C0FM0 c0fm0 = (C0FM0) this.receiver;
        if (c0fm0.LJFF) {
            SeekBar seekBar = c0fm0.LIZ;
            float f2 = c0fm0.LIZLLL;
            float f3 = c0fm0.LJ;
            if (Build.VERSION.SDK_INT >= 26) {
                min = seekBar.getMin();
            } else {
                min = 0;
            }
            float f4 = min;
            float max = c0fm0.LIZ.getMax();
            if (fFloatValue > f2) {
                if (fFloatValue >= f3) {
                    f4 = max;
                } else {
                    f4 = ((f4 * (f3 - fFloatValue)) + (max * (fFloatValue - f2))) / (f3 - f2);
                }
            }
            seekBar.setProgress(C814420VxA.LIZIZ(f4));
            c0fm0.LJFF = false;
        }
        return Unit.LIZ;
    }
}
