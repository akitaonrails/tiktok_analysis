package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0O7T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O7T {
    public final AbstractC614210O7f LIZ;
    public volatile boolean LIZIZ;
    public C2252611DEt LIZLLL;
    public final LinkedBlockingQueue<C0O7X> LIZJ = new LinkedBlockingQueue<>();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(446));

    public C0O7T(AbstractC614210O7f abstractC614210O7f) {
        this.LIZ = abstractC614210O7f;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0O7U(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0O7W
            if (r0 == 0) goto L26
            r5 = r8
            X.0O7W r5 = (X.C0O7W) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L34
            if (r0 != r6) goto L2c
            X.1DEV r3 = r5.LL
            X.C155000ia.LIZIZ(r2)
            goto L44
        L26:
            X.0O7W r5 = new X.0O7W
            r5.<init>(r7, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            X.1DEV r3 = X.C0O7R.LIZLLL
            r5.LL = r3
            r5.LLILZ = r6
            java.lang.Object r0 = r3.LIZLLL(r4, r5)
            if (r0 != r1) goto L44
            return r1
        L44:
            java.util.concurrent.LinkedBlockingQueue<X.0O7X> r0 = r7.LIZJ     // Catch: java.lang.Throwable -> Lbc
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbc
            r0 = 0
            if (r1 == 0) goto L50
            r7.LIZIZ = r0     // Catch: java.lang.Throwable -> Lbc
            goto Lb6
        L50:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbc
            r2.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.concurrent.LinkedBlockingQueue<X.0O7X> r0 = r7.LIZJ     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> Lbc
            X.0O7X r5 = (X.C0O7X) r5     // Catch: java.lang.Throwable -> Lbc
            r2.add(r5)     // Catch: java.lang.Throwable -> Lbc
            X.0O7f r0 = r7.LIZ     // Catch: java.lang.Throwable -> Lbc
            X.0O7j r1 = r0.LIZIZ()     // Catch: java.lang.Throwable -> Lbc
            X.0O7k r0 = X.C614260O7k.LIZIZ     // Catch: java.lang.Throwable -> Lbc
            int r1 = r1.LIZ     // Catch: java.lang.Throwable -> Lbc
            int r0 = r0.LIZ     // Catch: java.lang.Throwable -> Lbc
            r1 = r1 & r0
            if (r1 != 0) goto L70
            r6 = 0
        L70:
            if (r6 == 0) goto L94
            java.util.concurrent.LinkedBlockingQueue<X.0O7X> r0 = r7.LIZJ     // Catch: java.lang.Throwable -> Lbc
            java.util.List r1 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> Lbc
            r2.addAll(r1)     // Catch: java.lang.Throwable -> Lbc
            java.util.concurrent.LinkedBlockingQueue<X.0O7X> r0 = r7.LIZJ     // Catch: java.lang.Throwable -> Lbc
            r0.clear()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r5 = X.C13LP.LJJLIIIJL(r2)     // Catch: java.lang.Throwable -> Lbc
            r0 = r5
            X.0O7X r0 = (X.C0O7X) r0     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L94
            java.util.List<X.0O7X> r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L94
            boolean r0 = r0.addAll(r1)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lbc
        L94:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbc
        L98:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lb6
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lbc
            X.0O7X r1 = (X.C0O7X) r1     // Catch: java.lang.Throwable -> Lbc
            if (r1 != r5) goto Lb3
            X.0O7Y r0 = X.C0O7Y.Running     // Catch: java.lang.Throwable -> Lbc
        La8:
            r1.LIZJ = r0     // Catch: java.lang.Throwable -> Lbc
            X.14Gf<X.0O7X> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lbc
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> Lbc
            r0.resumeWith(r1)     // Catch: java.lang.Throwable -> Lbc
            goto L98
        Lb3:
            X.0O7Y r0 = X.C0O7Y.Merged     // Catch: java.lang.Throwable -> Lbc
            goto La8
        Lb6:
            r3.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbc
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O7T.LIZIZ(X.05Vn):java.lang.Object");
    }

    public static void LIZ(C0O7A c0o7a, C0O7X c0o7x) {
        List arrayList = c0o7a.LIZ;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c0o7a.LIZ = arrayList;
        List<C0O7X> list = c0o7x.LIZLLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0O7X> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LIZ);
        }
        arrayList.addAll(arrayList2);
    }
}
