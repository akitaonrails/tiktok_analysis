package X;

import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Q8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665430Q8f {
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC665370Q7z>> LIZ = new ConcurrentHashMap<>();

    public static InterfaceC665370Q7z LIZ(String str) {
        WeakReference<InterfaceC665370Q7z> weakReference = LIZ.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LIZIZ(String str, InterfaceC665370Q7z interfaceC665370Q7z, LifecycleOwner lifecycleOwner) {
        LIZ.put(str, new WeakReference<>(interfaceC665370Q7z));
        C665410Q8d.LIZIZ(new C665440Q8g(lifecycleOwner, lifecycleOwner.getLifecycle(), str));
    }
}
