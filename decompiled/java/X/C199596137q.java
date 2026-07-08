package X;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: renamed from: X.137q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199596137q<K, V> implements C139P<K, V>, Serializable {
    public static final long serialVersionUID = 1;
    public final ConcurrentMapC199594137o<K, V> LL;

    @Override // X.C139P
    public final void LIZJ() {
        this.LL.clear();
    }

    @Override // X.C139P
    public final long size() {
        long jMax = 0;
        for (C199595137p<K, V> c199595137p : this.LL.LLILLL) {
            jMax += (long) Math.max(0, c199595137p.LLILLJJLI);
        }
        return jMax;
    }

    public Object writeReplace() {
        return new C199597137r(this.LL);
    }

    public C199596137q(C199593137n<? super K, ? super V> c199593137n) {
        this.LL = new ConcurrentMapC199594137o<>(c199593137n);
    }

    public final void LIZIZ(Iterable<?> iterable) {
        ConcurrentMapC199594137o<K, V> concurrentMapC199594137o = this.LL;
        concurrentMapC199594137o.getClass();
        Iterator<?> it2 = iterable.iterator();
        while (it2.hasNext()) {
            concurrentMapC199594137o.remove(it2.next());
        }
    }

    @Override // X.C139P
    public final V LJIIIZ(Object obj) {
        ConcurrentMapC199594137o<K, V> concurrentMapC199594137o = this.LL;
        concurrentMapC199594137o.getClass();
        obj.getClass();
        int iLIZLLL = concurrentMapC199594137o.LIZLLL(obj);
        V v = (V) concurrentMapC199594137o.LJI(iLIZLLL).LJII(iLIZLLL, obj);
        if (v == null) {
            concurrentMapC199594137o.LLJJIJI.LIZLLL();
            return v;
        }
        concurrentMapC199594137o.LLJJIJI.LIZIZ();
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: ExecutionException -> 0x0055, all -> 0x0074, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x0055, blocks: (B:3:0x0019, B:5:0x001d, B:7:0x0023, B:9:0x0031, B:10:0x003e, B:12:0x0048, B:13:0x004d), top: B:30:0x0019, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V LIZ(K r12, java.util.concurrent.Callable<? extends V> r13) {
        /*
            r11 = this;
            X.137o<K, V> r0 = r11.LL
            X.135N r10 = new X.135N
            r10.<init>(r13)
            r0.getClass()
            r5 = r12
            r5.getClass()
            int r6 = r0.LIZLLL(r5)
            X.137p r3 = r0.LJI(r6)
            r3.getClass()
            int r0 = r3.LLILLJJLI     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            if (r0 == 0) goto L4d
            X.136k r4 = r3.LJIIIZ(r6, r5)     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            if (r4 == 0) goto L4d
            X.137o<K, V> r0 = r3.LL     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            X.138F r0 = r0.LLJJI     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            long r8 = r0.LIZ()     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            java.lang.Object r7 = r3.LJIIJ(r4, r8)     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            if (r7 == 0) goto L3e
            r3.LJIILL(r4, r8)     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            X.1386 r0 = r3.LLJILLL     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            r0.LIZIZ()     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            java.lang.Object r0 = r3.LJIL(r4, r5, r6, r7, r8, r10)     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            goto L51
        L3e:
            X.135A r1 = r4.LIZJ()     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            boolean r0 = r1.isLoading()     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.LJJII(r4, r5, r1)     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
            goto L51
        L4d:
            java.lang.Object r0 = r3.LJIIJJI(r5, r6, r10)     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.Throwable -> L74
        L51:
            r3.LJIIL()
            return r0
        L55:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.Throwable r1 = r2.getCause()     // Catch: java.lang.Throwable -> L74
            boolean r0 = r1 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L6c
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L6b
            X.0ja9 r0 = new X.0ja9     // Catch: java.lang.Throwable -> L74
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L6b:
            throw r2     // Catch: java.lang.Throwable -> L74
        L6c:
            X.1388 r0 = new X.1388     // Catch: java.lang.Throwable -> L74
            java.lang.Error r1 = (java.lang.Error) r1     // Catch: java.lang.Throwable -> L74
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L74
            r3.LJIIL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199596137q.LIZ(java.lang.Object, java.util.concurrent.Callable):java.lang.Object");
    }

    @Override // X.C139P
    public final void put(K k, V v) {
        this.LL.put(k, v);
    }
}
