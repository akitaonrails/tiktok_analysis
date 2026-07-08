package X;

import android.util.LruCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546570qLf extends C09AY implements Function0<C1528850pt5<String, InterfaceC1105930esx>> {
    public final /* synthetic */ C1546510qLZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546570qLf(C1546510qLZ c1546510qLZ) {
        super(0);
        this.LL = c1546510qLZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pt5, X.0pt5<java.lang.String, X.0esx>] */
    @Override // kotlin.jvm.functions.Function0
    public final C1528850pt5<String, InterfaceC1105930esx> invoke() {
        C1546510qLZ c1546510qLZ = this.LL;
        final int i = c1546510qLZ.LIZLLL;
        final C1546550qLd c1546550qLd = new C1546550qLd(c1546510qLZ);
        return new LruCache<K, V>(i, c1546550qLd) { // from class: X.0pt5
            public final Function2<K, V, Unit> LIZ;

            {
                this.LIZ = c1546550qLd;
            }

            @Override // android.util.LruCache
            public final void entryRemoved(boolean z, K k, V v, V v2) {
                Function2<K, V, Unit> function2;
                super.entryRemoved(z, k, v, v2);
                if (z && (function2 = this.LIZ) != null) {
                    function2.invoke(k, v);
                }
            }
        };
    }
}
