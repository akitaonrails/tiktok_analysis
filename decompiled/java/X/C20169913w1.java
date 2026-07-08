package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13w1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20169913w1<P> {
    public final C20168613vo LIZ;
    public final Long LIZIZ;
    public final Function2<C20169813w0<P>, InterfaceC1364105Vn<? super C20170413w6>, Object> LIZJ;

    public Object LJ(C20169813w0<P> c20169813w0, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
        return LJFF(this, c20169813w0, interfaceC1364105Vn);
    }

    public Function2<C20169813w0<P>, InterfaceC1364105Vn<? super C20170413w6>, Object> LIZ() {
        return this.LIZJ;
    }

    public C20168613vo LIZIZ() {
        return this.LIZ;
    }

    public Long LIZLLL() {
        return this.LIZIZ;
    }

    public C20169913w1(C20168613vo c20168613vo, Long l, Function2 function2) {
        this.LIZ = c20168613vo;
        this.LIZIZ = l;
        this.LIZJ = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <P> java.lang.Object LJFF(X.C20169913w1<P> r5, X.C20169813w0<P> r6, X.InterfaceC1364105Vn<? super X.C20170413w6> r7) {
        /*
            boolean r0 = r7 instanceof X.C20170013w2
            if (r0 == 0) goto L4d
            r4 = r7
            X.13w2 r4 = (X.C20170013w2) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L53
            X.13w0 r6 = r4.LLILLJJLI
            X.13w1 r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L26:
            if (r3 != 0) goto L36
        L28:
            P r2 = r6.LIZ
            X.13vz r1 = X.EnumC20169713vz.SKIPPED
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.13w6 r3 = r5.LIZJ(r2, r1, r0)
        L36:
            return r3
        L37:
            X.C155000ia.LIZIZ(r3)
            kotlin.jvm.functions.Function2 r0 = r5.LIZ()
            if (r0 == 0) goto L28
            r4.LL = r5
            r4.LLILLJJLI = r6
            r4.LLILZIL = r1
            java.lang.Object r3 = r0.invoke(r6, r4)
            if (r3 != r2) goto L26
            return r2
        L4d:
            X.13w2 r4 = new X.13w2
            r4.<init>(r5, r7)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20169913w1.LJFF(X.13w1, X.13w0, X.05Vn):java.lang.Object");
    }

    public C20170413w6 LIZJ(P p, EnumC20169713vz enumC20169713vz, Integer num) {
        return new C20170413w6(LIZIZ(), enumC20169713vz, 0L, null, num, false, false, 0, 236);
    }

    public /* synthetic */ C20169913w1(C20168613vo c20168613vo, Function2 function2, int i) {
        this(c20168613vo, (Long) null, (i & 8) != 0 ? null : function2);
    }
}
