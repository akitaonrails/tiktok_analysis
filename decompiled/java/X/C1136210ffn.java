package X;

import android.os.Build;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136210ffn<K, V> {
    public final Map<K, C1136760fgg<K, V>> LIZ;
    public final ReferenceQueue<V> LIZIZ;

    public final void LIZ() {
        C1136760fgg c1136760fgg;
        while (true) {
            Reference<? extends V> referencePoll = this.LIZIZ.poll();
            if (referencePoll == null) {
                return;
            }
            if ((!this.LIZ.isEmpty()) && (referencePoll instanceof C1136760fgg) && (c1136760fgg = (C1136760fgg) referencePoll) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cleanUp: weakRef.key = ");
                sbLIZ.append(c1136760fgg.LIZ);
                C1133910fc5.LJ("GiftWeakValueHashMap", C2188811AlT.LIZIZ(sbLIZ));
                if (Build.VERSION.SDK_INT >= 24) {
                    this.LIZ.remove(c1136760fgg.LIZ, c1136760fgg);
                } else if (Intrinsics.LJFF(this.LIZ.get(c1136760fgg.LIZ), c1136760fgg)) {
                    this.LIZ.remove(c1136760fgg.LIZ);
                }
            }
        }
    }

    public C1136210ffn(boolean z) {
        Map<K, C1136760fgg<K, V>> map;
        if (z) {
            map = new ConcurrentHashMap<>();
        } else {
            map = new HashMap<>();
        }
        this.LIZ = map;
        this.LIZIZ = new ReferenceQueue<>();
    }
}
