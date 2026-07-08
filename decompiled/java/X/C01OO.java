package X;

/* JADX INFO: renamed from: X.01OO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01OO {
    public static final C01OO LIZ = new C01OO();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.android.livesdk.model.message.common.Text r6, X.InterfaceC1364105Vn<? super android.text.Spannable> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C01OP
            if (r0 == 0) goto L22
            r4 = r7
            X.01OP r4 = (X.C01OP) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            com.bytedance.android.livesdk.model.message.common.Text r6 = r4.LL
            goto L28
        L22:
            X.01OP r4 = new X.01OP
            r4.<init>(r5, r7)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L53
            goto L70
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            if (r6 != 0) goto L40
            java.lang.String r0 = ""
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            return r0
        L40:
            X.01ON r2 = new X.01ON     // Catch: java.lang.Exception -> L53
            r0 = 0
            r2.<init>(r6, r0)     // Catch: java.lang.Exception -> L53
            r4.LL = r6     // Catch: java.lang.Exception -> L53
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L53
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.C099A.LIZIZ(r0, r2, r4)     // Catch: java.lang.Exception -> L53
            if (r0 != r3) goto L70
            return r3
        L53:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getSpannable exception = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "InteractTextParseUtils"
            X.C20441214yg.LJIIIZ(r0, r1)
        L70:
            java.lang.String r0 = r6.defaultPattern
            android.text.Spannable r0 = X.C1133830fbx.LJIILIIL(r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01OO.LIZ(com.bytedance.android.livesdk.model.message.common.Text, X.05Vn):java.lang.Object");
    }
}
