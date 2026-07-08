package X;

/* JADX INFO: renamed from: X.0EXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366220EXk {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(X.InterfaceC366210EXj r9, X.C0EXH r10, X.C0EY3 r11, boolean r12, X.InterfaceC1364105Vn<? super java.lang.Long> r13) {
        /*
            boolean r0 = r13 instanceof X.C366230EXl
            if (r0 == 0) goto L96
            r6 = r13
            X.0EXl r6 = (X.C366230EXl) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r8 = r6.LLILZIL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILZLL
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 == r0) goto L49
            if (r1 != r7) goto L9d
            long r1 = r6.LLILZ
            X.C155000ia.LIZIZ(r8)
        L27:
            java.lang.Long r0 = X.C2286608xc.LJFF(r1)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r8)
            if (r12 == 0) goto L46
            long r3 = java.lang.System.currentTimeMillis()
            r6.LL = r9
            r6.LLILLJJLI = r10
            r6.LLILLL = r11
            r6.LLILZ = r3
            r6.LLILZLL = r0
            java.lang.Object r0 = r9.LJI(r10, r11, r6)
            if (r0 != r5) goto L54
            return r5
        L46:
            r1 = 0
            goto L84
        L49:
            long r3 = r6.LLILZ
            X.0EY3 r11 = r6.LLILLL
            X.0EXH r10 = r6.LLILLJJLI
            X.0EXj r9 = r6.LL
            X.C155000ia.LIZIZ(r8)
        L54:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            X.0M8t r4 = X.C563650M8t.LIZIZ
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onSyncDataWithTimeLog, sync Task: "
            r3.append(r0)
            java.lang.Class r0 = r9.getClass()
            X.12Dl r0 = X.C13LE.LIZ(r0)
            java.lang.String r0 = r0.LJI()
            r3.append(r0)
            java.lang.String r0 = ", timeCost: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r3)
            java.lang.String r0 = "IDataSyncTask"
            X.C201955140j.LIZLLL(r4, r0, r3)
        L84:
            r0 = 0
            r6.LL = r0
            r6.LLILLJJLI = r0
            r6.LLILLL = r0
            r6.LLILZ = r1
            r6.LLILZLL = r7
            java.lang.Object r0 = r9.LIZLLL(r10, r11, r6)
            if (r0 != r5) goto L27
            return r5
        L96:
            X.0EXl r6 = new X.0EXl
            r6.<init>(r13)
            goto L12
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366220EXk.LIZ(X.0EXj, X.0EXH, X.0EY3, boolean, X.05Vn):java.lang.Object");
    }
}
