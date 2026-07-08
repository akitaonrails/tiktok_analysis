package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531210pwt {
    public static final ConcurrentHashMap<String, WeakReference<C1531990py9<C1531820pxs>>> LIZ = new ConcurrentHashMap<>();

    public static final void LIZ(String str, C013C c013c) {
        if (!c013c.element) {
            return;
        }
        C1531200pws.LIZIZ(str);
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(new C0VSJ(C1529330ptr.LIZ(), str).delete()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
