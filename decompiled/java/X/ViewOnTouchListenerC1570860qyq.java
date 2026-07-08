package X;

import Y.ARunnableS124S0100000_24;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0qyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnTouchListenerC1570860qyq implements View.OnTouchListener {
    public boolean LLILLJJLI;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS124S0100000_24 LLILLL = new ARunnableS124S0100000_24(this, 64);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILLJJLI = false;
                C786410Ut5.LJLIIL(10000L, this.LL, this.LLILLL);
                return false;
            }
            if (numValueOf != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 3)) {
                this.LL.removeCallbacks(this.LLILLL);
                if (!this.LLILLJJLI) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
