package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.094k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23128094k {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C094D<?> r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof X.C23129094l
            if (r0 == 0) goto L22
            r4 = r8
            X.094l r4 = (X.C23129094l) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2c
            kotlin.jvm.functions.Function0 r7 = r4.LLILLJJLI
            goto L28
        L22:
            X.094l r4 = new X.094l
            r4.<init>(r8)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7b
            goto L75
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            kotlin.coroutines.CoroutineContext r1 = r4.getContext()
            X.08zJ r0 = X.C09AE.LJJLJ
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            if (r0 != r6) goto L47
            r0 = 1
        L44:
            if (r0 == 0) goto L80
            goto L49
        L47:
            r0 = 0
            goto L44
        L49:
            r4.LL = r6     // Catch: java.lang.Throwable -> L7b
            r4.LLILLJJLI = r7     // Catch: java.lang.Throwable -> L7b
            r4.LLILZ = r3     // Catch: java.lang.Throwable -> L7b
            X.1DEt r2 = new X.1DEt     // Catch: java.lang.Throwable -> L7b
            X.05Vn r0 = X.C099M.LIZLLL(r4)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7b
            r2.LJIJJ()     // Catch: java.lang.Throwable -> L7b
            X.020f r1 = new X.020f     // Catch: java.lang.Throwable -> L7b
            r0 = 251(0xfb, float:3.52E-43)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L7b
            r6.LIZJ(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r2.LJIJ()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L7b
            if (r1 != r0) goto L72
            X.C099Q.LIZJ(r4)     // Catch: java.lang.Throwable -> L7b
        L72:
            if (r1 != r5) goto L75
            return r5
        L75:
            r7.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7b:
            r0 = move-exception
            r7.invoke()
            throw r0
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "awaitClose() can only be invoked from the producer context"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23128094k.LIZ(X.094D, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    public static AnonymousClass0952 LIZIZ(InterfaceC497601wk interfaceC497601wk, int i, Function2 function2, int i2) {
        C23271099x c23271099x;
        if ((i2 & 1) != 0) {
            c23271099x = C23271099x.INSTANCE;
        } else {
            c23271099x = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.SUSPEND;
        C099V c099v = C099V.DEFAULT;
        AnonymousClass0952 anonymousClass0952 = new AnonymousClass0952(C23252099e.LIZIZ(interfaceC497601wk, c23271099x), C095G.LIZ(i, enumC2252401DDy, 4));
        c099v.invoke(function2, anonymousClass0952, anonymousClass0952);
        return anonymousClass0952;
    }
}
