package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Vn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808190Vn7<K, V, E> implements InterfaceC808120Vn0<K, V> {
    public final InterfaceC808200Vn8<K, V, E> LIZ;

    @Override // X.InterfaceC808120Vn0
    public final Unit release() {
        return Unit.LIZ;
    }

    public C808190Vn7(InterfaceC808200Vn8<K, V, E> interfaceC808200Vn8) {
        this.LIZ = interfaceC808200Vn8;
    }

    @Override // X.InterfaceC808120Vn0
    public final String LIZJ(V v) {
        return this.LIZ.LIZJ(v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC808120Vn0
    public final Object LIZ(List list, C808150Vn3 c808150Vn3) {
        if (list.isEmpty()) {
            return Unit.LIZ;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<E> it2 = list.iterator();
        while (it2.hasNext()) {
            C808220VnA c808220VnA = (C808220VnA) it2.next();
            long jCurrentTimeMillis = c808220VnA.LIZLLL;
            if (jCurrentTimeMillis <= 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            arrayList.add(this.LIZ.LJ(jCurrentTimeMillis, c808220VnA.LIZ, c808220VnA.LIZIZ));
        }
        Object objLIZ = this.LIZ.LIZ(arrayList, c808150Vn3);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // X.InterfaceC808120Vn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.Set<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.Map<K, ? extends V>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C808210Vn9
            if (r0 == 0) goto L74
            r4 = r7
            X.0Vn9 r4 = (X.C808210Vn9) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 != r1) goto L7b
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L34
            r1 = 16
        L34:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L3d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r3.next()
            X.0Vn8<K, V, E> r0 = r5.LIZ
            kotlin.Pair r0 = r0.LJI(r1)
            java.lang.Object r2 = r0.getFirst()
            java.lang.Object r1 = r0.getSecond()
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            java.lang.Object r1 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r4.put(r1, r0)
            goto L3d
        L66:
            X.C155000ia.LIZIZ(r3)
            X.0Vn8<K, V, E> r0 = r5.LIZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L74:
            X.0Vn9 r4 = new X.0Vn9
            r4.<init>(r5, r7)
            goto L12
        L7a:
            return r4
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808190Vn7.LIZLLL(java.util.Set, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC808120Vn0
    public final Object LJ(String str, C808150Vn3 c808150Vn3) {
        return this.LIZ.LJFF(str, c808150Vn3);
    }

    @Override // X.InterfaceC808120Vn0
    public final Object LIZIZ(int i, String str, C808150Vn3 c808150Vn3) {
        if (i <= 0) {
            return Unit.LIZ;
        }
        Object objLIZIZ = this.LIZ.LIZIZ(i, str, c808150Vn3);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
