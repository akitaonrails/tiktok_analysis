package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534370q1z {
    public final C1534510q2D LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0q2D] */
    public C1534370q1z(final int i) {
        this.LIZ = new LruCache<String, C1534840q2k>(i) { // from class: X.0q2D
            @Override // android.util.LruCache
            public final /* bridge */ /* synthetic */ int sizeOf(String str, C1534840q2k c1534840q2k) {
                return 1;
            }

            @Override // android.util.LruCache
            public final void entryRemoved(boolean z, String str, C1534840q2k c1534840q2k, C1534840q2k c1534840q2k2) {
                Object obj;
                AbstractC1534220q1k<?> abstractC1534220q1k;
                C1534840q2k c1534840q2k3 = c1534840q2k;
                super.entryRemoved(z, str, c1534840q2k3, c1534840q2k2);
                Unit unit = null;
                if (c1534840q2k3 != null && (abstractC1534220q1k = c1534840q2k3.LIZIZ) != null) {
                    obj = abstractC1534220q1k.LIZLLL;
                } else {
                    obj = null;
                }
                if (!(obj instanceof C1534010q1P)) {
                    if (c1534840q2k3 != null) {
                        try {
                            AbstractC1534220q1k<?> abstractC1534220q1k2 = c1534840q2k3.LIZIZ;
                            if (abstractC1534220q1k2 != null) {
                                abstractC1534220q1k2.LIZJ();
                                unit = Unit.LIZ;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            return;
                        }
                    }
                    C189200o6.m2constructorimpl(unit);
                }
            }
        };
    }

    public final void LIZ(C1534840q2k c1534840q2k) {
        boolean z;
        C1533790q13 c1533790q13 = c1534840q2k.LIZ;
        if (Intrinsics.LJFF(c1533790q13.LJ, "builtin")) {
            return;
        }
        String str = c1533790q13.LIZ.LJJJZ;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1534250q1n.LIZ(C1534250q1n.LIZ, "MemoryManager", "updateByteArrayCache: cache key is empty or data is empty");
            return;
        }
        try {
            put(str, c1534840q2k);
            c1533790q13.LJIJI = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1534250q1n.LIZIZ("MemoryManager", "error occurs when put bytes to lru cache", e);
        }
    }
}
