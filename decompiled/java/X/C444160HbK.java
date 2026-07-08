package X;

import android.animation.ObjectAnimator;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0HbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444160HbK {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new BPEAHandler(Looper.getMainLooper());
    }

    public static void LIZ(View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.5f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.start();
    }
}
