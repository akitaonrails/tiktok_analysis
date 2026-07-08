package X;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839310WwD {
    public static final C1091810eWB LIZ;
    public static final Map<String, InterfaceC826050Wap> LIZIZ;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0eWB, java.lang.Object] */
    static {
        ?? r3 = new InterfaceC826050Wap() { // from class: X.0eWB
            public final ConcurrentHashMap<String, SoftReference<C1091820eWC>> LIZ = new ConcurrentHashMap<>();

            @Override // X.InterfaceC826050Wap
            public final void LIZ(String str) {
                this.LIZ.remove(str);
            }

            @Override // X.InterfaceC826050Wap
            public final Object get(String str) {
                C1091820eWC c1091820eWC;
                SoftReference<C1091820eWC> softReference = this.LIZ.get(str);
                if (softReference == null || (c1091820eWC = softReference.get()) == null) {
                    return null;
                }
                return c1091820eWC.LIZ;
            }

            @Override // X.InterfaceC826050Wap
            public final boolean pc(String str) {
                SoftReference<C1091820eWC> softReference;
                if (!this.LIZ.containsKey(str) || (softReference = this.LIZ.get(str)) == null || softReference.get() == null) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC826050Wap
            public final void LIZIZ(String str, Object obj) {
                this.LIZ.put(str, new SoftReference<>(new C1091820eWC(obj)));
            }
        };
        LIZ = r3;
        LIZIZ = C2097608Jq.LJIIJ(new Pair("map", r3));
    }
}
