package X;

import Y.ARunnableS85S0200000_16;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0dQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050110dQv {
    public final List<MotionEvent> LIZ = new ArrayList();
    public final Set<String> LIZIZ = Collections.synchronizedSet(new HashSet());

    public final boolean LIZ(MotionEvent motionEvent) {
        if (motionEvent != null && this.LIZIZ != null) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            long downTime = motionEvent.getDownTime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(downTime);
            sbLIZ.append("_");
            sbLIZ.append(pointerId);
            return this.LIZIZ.contains(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public final void LIZJ(C19JH c19jh) {
        T t;
        if (!((ArrayList) this.LIZ).isEmpty() && this.LIZIZ != null && c19jh != null && (t = c19jh.LLILZ) != 0 && t.getRootView() != null) {
            C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS85S0200000_16(c19jh.LLILZ.getRootView(), this, 40));
        }
    }

    public final void LIZIZ(C19JH c19jh, MotionEvent motionEvent) {
        if (c19jh != null && motionEvent != null && this.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GesThrough_");
            sbLIZ.append(c19jh.LLJ);
            C2188811AlT.LIZIZ(sbLIZ);
            int[] iArr = new int[2];
            c19jh.LLILZ.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (motionEvent.getAction() == 0) {
                ((ArrayList) this.LIZ).clear();
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(i, i2);
            ((ArrayList) this.LIZ).add(motionEventObtain);
        }
    }
}
