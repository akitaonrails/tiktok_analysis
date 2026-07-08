package X;

import android.view.Choreographer;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;

/* JADX INFO: renamed from: X.0oGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class ChoreographerFrameCallbackC1466710oGr implements Choreographer.FrameCallback {
    public final int $t;
    public Object l0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.$t) {
            case 0:
                doFrame$0(this, j);
                break;
            case 1:
                doFrame$1(this, j);
                break;
        }
    }

    public ChoreographerFrameCallbackC1466710oGr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void doFrame$0(ChoreographerFrameCallbackC1466710oGr choreographerFrameCallbackC1466710oGr, long j) {
        C1450640nqw c1450640nqw = (C1450640nqw) choreographerFrameCallbackC1466710oGr.l0;
        VEVideoTransformFilterParam vEVideoTransformFilterParam = c1450640nqw.LLJJJ;
        if (vEVideoTransformFilterParam != null) {
            c1450640nqw.LLJJJ = null;
            c1450640nqw.Z1(vEVideoTransformFilterParam);
        }
    }

    public static final void doFrame$1(ChoreographerFrameCallbackC1466710oGr choreographerFrameCallbackC1466710oGr, long j) {
        C1449870nph c1449870nph = (C1449870nph) choreographerFrameCallbackC1466710oGr.l0;
        c1449870nph.LJIILL = false;
        c1449870nph.LJIIIIZZ();
    }
}
