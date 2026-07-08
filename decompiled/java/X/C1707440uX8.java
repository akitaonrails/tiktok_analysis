package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707440uX8 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Set<InterfaceC1548890qPP> LIZIZ = Collections.synchronizedSet(new LinkedHashSet());

    public static final void LIZ(AtomicBoolean atomicBoolean, C259800zU<Runnable> c259800zU, C259800zU<InterfaceC1548890qPP> c259800zU2, Function1<? super C1265004xE, Unit> function1, C1548870qPN c1548870qPN, boolean z, String str) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        Runnable runnable = c259800zU.element;
        if (runnable != null) {
            LIZ.removeCallbacks(runnable);
        }
        InterfaceC1548890qPP interfaceC1548890qPP = c259800zU2.element;
        if (interfaceC1548890qPP != null) {
            c1548870qPN.LJI("pipo_post_payment_bind_retain_result", interfaceC1548890qPP);
            LIZIZ.remove(interfaceC1548890qPP);
        }
        function1.invoke(new C1265004xE(z, str));
    }
}
