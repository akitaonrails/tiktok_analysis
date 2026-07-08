package X;

import Y.ARunnableS104S0100000_4;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311390CIn implements C11HC {
    public final EnumC311370CIl LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public boolean LIZJ = true;

    public C311390CIn(EnumC311370CIl enumC311370CIl) {
        this.LIZ = enumC311370CIl;
    }

    @Override // X.C11HC
    public final void LIZ(Lifecycle.Event event, Function0 function0) {
        if (!this.LIZJ) {
            function0.invoke();
            return;
        }
        int i = C311380CIm.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                function0.invoke();
                return;
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                function0.invoke();
                return;
            } else {
                C786410Ut5.LJLJL(this.LIZIZ, Message.obtain(this.LIZIZ, new ARunnableS104S0100000_4(function0, 22)), 1L);
                return;
            }
        }
        C786410Ut5.LJLJL(this.LIZIZ, Message.obtain(this.LIZIZ, new ARunnableS104S0100000_4(function0, 22)), 1L);
    }
}
