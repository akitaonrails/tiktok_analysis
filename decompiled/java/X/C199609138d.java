package X;

import a75.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.138d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199609138d<K, V> extends C11T1<K, V> {
    public final C199608138c<K, V> LIZIZ;

    public /* synthetic */ C199609138d() {
        this(-1L);
    }

    @Override // X.C11T1
    public final List<Pair<K, V>> LJ() {
        C199608138c<K, V> c199608138c = this.LIZIZ;
        c199608138c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, V> entry : ((C199607138b) c199608138c.LIZ).LL.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public final void LJI() {
        ((C199607138b) this.LIZIZ.LIZ).LL.clear();
    }

    public C199609138d(long j) {
        C199607138b c199607138bLIZ;
        if (j > 0) {
            C138X c138x = new C138X();
            long j2 = c138x.LIZJ;
            if (j2 == -1) {
                long j3 = c138x.LIZLLL;
                if (j3 == -1) {
                    c138x.LIZJ = j;
                    c199607138bLIZ = c138x.LIZ();
                } else {
                    throw new IllegalStateException(C08KK.LIZ("maximum weight was already set to %s", Long.valueOf(j3)));
                }
            } else {
                throw new IllegalStateException(C08KK.LIZ("maximum size was already set to %s", Long.valueOf(j2)));
            }
        } else {
            c199607138bLIZ = new C138X().LIZ();
        }
        this.LIZIZ = new C199608138c<>(c199607138bLIZ);
    }

    @Override // X.C11T1
    public final V LIZ(K k) {
        c<K, V> cVar = ((C199607138b) this.LIZIZ.LIZ).LL;
        cVar.getClass();
        k.getClass();
        int iLIZLLL = cVar.LIZLLL(k);
        return (V) cVar.LJI(iLIZLLL).LJII(iLIZLLL, k);
    }

    @Override // X.C11T1
    public final void LJFF(K k, V v) {
        C199608138c<K, V> c199608138c = this.LIZIZ;
        if (v != null) {
            ((C199607138b) c199608138c.LIZ).LL.put(k, v);
            return;
        }
        C199607138b c199607138b = (C199607138b) c199608138c.LIZ;
        c199607138b.getClass();
        k.getClass();
        c199607138b.LL.remove(k);
    }
}
