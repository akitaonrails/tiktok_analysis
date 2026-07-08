package X;

import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E56, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E56 {
    public final Function1<Long, Unit> LIZ;
    public final C0E5C LIZIZ;
    public long LIZJ;
    public final ValueAnimator LIZLLL;
    public AwS406S0200000_5 LJ;
    public long LJFF;
    public long LJI;
    public Pair<Long, Long> LJII;
    public final long LJIIIIZZ;
    public final BPEAHandler LJIIIZ;

    public final void LIZ() {
        this.LIZLLL.cancel();
        this.LJI = 0L;
        this.LJII = null;
        this.LJIIIZ.removeCallbacksAndMessages(null);
    }

    public C0E56(AwS584S0100000_5 awS584S0100000_5, C0E58 c0e58) {
        this.LIZ = awS584S0100000_5;
        this.LIZIZ = c0e58;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, 1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new AUListenerS255S0100000_5(this, 33));
        this.LIZLLL = valueAnimator;
        this.LJIIIIZZ = 1000L;
        this.LJIIIZ = new BPEAHandler(Looper.getMainLooper());
    }
}
