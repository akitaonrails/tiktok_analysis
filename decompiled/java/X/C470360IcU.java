package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470360IcU {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZ(Function0<Unit> function0) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            function0.invoke();
        }
    }

    public static final void LIZIZ(Runnable runnable, long j, TimeUnit timeUnit) {
        int i = C470370IcV.LIZ[timeUnit.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C786410Ut5.LJLIIL(j, LIZ, runnable);
            }
        } else {
            C786410Ut5.LJLIIL(j * 1000, LIZ, runnable);
        }
    }
}
