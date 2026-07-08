package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561190qjF {
    public static final HashMap<LifecycleOwner, C1558390qej> LIZ = new HashMap<>();

    public static InterfaceC665370Q7z LIZ(String str, LifecycleOwner lifecycleOwner) {
        C1558390qej c1558390qej = LIZ.get(lifecycleOwner);
        InterfaceC665370Q7z interfaceC665370Q7z = null;
        if (c1558390qej == null || !Intrinsics.LJFF(str, c1558390qej.LL)) {
            return null;
        }
        try {
            interfaceC665370Q7z = c1558390qej.get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(c1558390qej.cancel(true)));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        LIZ.remove(lifecycleOwner);
        return interfaceC665370Q7z;
    }
}
