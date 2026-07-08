package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589560NAk {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(AtomicBoolean atomicBoolean, Handler handler, InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY, final Function1<? super Integer, Unit> function1, final Integer num) {
        if (atomicBoolean.compareAndSet(false, true)) {
            handler.removeCallbacksAndMessages(null);
            interfaceC1320200kSY.close();
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0NAj
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BoardImageSizeFetcher@bb0f.fetch$finish$1");
                    try {
                        function1.invoke(num);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BoardImageSizeFetcher@bb0f.fetch$finish$1");
                }
            });
        }
    }
}
