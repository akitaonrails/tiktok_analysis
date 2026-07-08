package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0Utv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786930Utv {
    public static boolean LIZIZ;
    public static final C786930Utv LIZ = new C786930Utv();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(427));

    public final synchronized void LIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C01GW c01gw = LIZJ;
        ((HandlerThread) c01gw.getValue()).start();
        new BPEAHandler(C786410Ut5.W2((HandlerThread) c01gw.getValue()));
    }
}
