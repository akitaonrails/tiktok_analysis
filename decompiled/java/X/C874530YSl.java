package X;

/* JADX INFO: renamed from: X.0YSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874530YSl {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(java.util.List<? extends X.C09KT<?, ?>> r8, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r9, kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof X.C874520YSk
            if (r0 == 0) goto L26
            r7 = r11
            X.0YSk r7 = (X.C874520YSk) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r6 = r7.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L41
            if (r0 == r3) goto L38
            if (r0 != r4) goto L30
            kotlin.jvm.functions.Function1 r10 = r7.LL
            goto L2c
        L26:
            X.0YSk r7 = new X.0YSk
            r7.<init>(r11)
            goto L12
        L2c:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L79
            goto L80
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            java.lang.Object r1 = r7.LLILLL
            java.util.Iterator r1 = (java.util.Iterator) r1
            kotlin.jvm.functions.Function1 r10 = r7.LLILLJJLI
            kotlin.jvm.functions.Function1 r9 = r7.LL
            goto L4c
        L41:
            X.C155000ia.LIZIZ(r6)
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Exception -> L79
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Exception -> L79
            r6 = r2
            goto L4f
        L4c:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L79
        L4f:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L79
            X.09KT r0 = (X.C09KT) r0     // Catch: java.lang.Exception -> L79
            r7.LL = r9     // Catch: java.lang.Exception -> L79
            r7.LLILLJJLI = r10     // Catch: java.lang.Exception -> L79
            r7.LLILLL = r1     // Catch: java.lang.Exception -> L79
            r7.LLILZIL = r3     // Catch: java.lang.Exception -> L79
            java.lang.Object r6 = r0.LIZ(r6, r7)     // Catch: java.lang.Exception -> L79
            if (r6 != r5) goto L4f
            return r5
        L6a:
            r7.LL = r10     // Catch: java.lang.Exception -> L79
            r7.LLILLJJLI = r2     // Catch: java.lang.Exception -> L79
            r7.LLILLL = r2     // Catch: java.lang.Exception -> L79
            r7.LLILZIL = r4     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r9.invoke(r7)     // Catch: java.lang.Exception -> L79
            if (r0 != r5) goto L80
            return r5
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r10.invoke(r0)
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874530YSl.LIZ(java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
