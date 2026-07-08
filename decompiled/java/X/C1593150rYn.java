package X;

import Y.ARunnableS124S0100000_24;
import android.graphics.drawable.AnimationDrawable;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0rYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593150rYn extends AnimationDrawable {
    public final BPEAHandler LL;

    public C1593150rYn() {
        setOneShot(false);
        this.LL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void start() {
        BPEAHandler bPEAHandler;
        super.start();
        if (getNumberOfFrames() <= 0 || getDuration(0) <= 0 || (bPEAHandler = this.LL) == null) {
            return;
        }
        C786410Ut5.LJLIIL(getNumberOfFrames() * getDuration(0) * 4, bPEAHandler, new ARunnableS124S0100000_24(this, 172));
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        BPEAHandler bPEAHandler = this.LL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
    }
}
