package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587180N1g {
    public static volatile boolean LIZ;
    public static final CopyOnWriteArrayList<WeakReference<InterfaceC587190N1h>> LIZIZ = new CopyOnWriteArrayList<>();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public static final CopyOnWriteArrayList<WeakReference<Runnable>> LIZLLL = new CopyOnWriteArrayList<>();

    public static void LIZ(InterfaceC587190N1h interfaceC587190N1h) {
        if (interfaceC587190N1h == null) {
            return;
        }
        Iterator<WeakReference<InterfaceC587190N1h>> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().get(), interfaceC587190N1h)) {
                return;
            }
        }
        LIZIZ.add(new WeakReference<>(interfaceC587190N1h));
    }

    public static void LIZIZ(boolean z) {
        Iterator<WeakReference<InterfaceC587190N1h>> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC587190N1h interfaceC587190N1h = it2.next().get();
            if (interfaceC587190N1h != null) {
                interfaceC587190N1h.LIZ(z);
            }
        }
    }

    public static void LIZJ(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        for (WeakReference<Runnable> weakReference : LIZLLL) {
            if (Intrinsics.LJFF(weakReference.get(), runnable)) {
                LIZLLL.remove(weakReference);
                return;
            }
        }
    }
}
