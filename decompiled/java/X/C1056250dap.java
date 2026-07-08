package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056250dap {
    public final String LIZ;
    public C1056290dat LIZIZ = new C1056290dat();
    public C1056290dat LIZJ = new C1056290dat();
    public C1056290dat LIZLLL = new C1056290dat();
    public long LJ = -1;
    public long LJFF = -1;
    public Boolean LJI;

    public final void LIZ() {
        long jMax;
        if (this.LJ == -1) {
            if (Intrinsics.LJFF(this.LJI, Boolean.TRUE)) {
                long j = this.LIZIZ.LIZ;
                if (j < 0) {
                    j = 0;
                }
                long j2 = this.LIZJ.LIZ;
                jMax = Math.max(j, j2 >= 0 ? j2 : 0L) + this.LIZLLL.LIZ;
            } else {
                jMax = this.LIZLLL.LIZ;
            }
            this.LJ = jMax;
            int i = C2187451AjH.LIZ;
            String str = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("compute total: ");
            sbLIZ.append(this.LJ);
            C1720106oR.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("total: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isSync: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MAF: ");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Contact: ");
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Facebook: ");
        sbLIZ4.append(this.LIZJ);
        sbLIZ4.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        return sb.toString();
    }

    public C1056250dap(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r9, X.C1056110dab r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1056260daq
            if (r0 == 0) goto L6b
            r7 = r9
            X.0daq r7 = (X.C1056260daq) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L51
            if (r0 != r5) goto L71
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            X.00o6 r0 = (X.C189200o6) r0
            java.lang.Object r5 = r0.m10unboximpl()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            X.0dat r4 = r8.LIZIZ
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r0 == 0) goto L4e
            X.0dao r1 = X.EnumC1056240dao.FAIL
        L42:
            r0 = 10
            X.0dat r0 = X.C1056290dat.LIZ(r4, r2, r1, r0)
            r8.LIZIZ = r0
            X.C155000ia.LIZIZ(r5)
            return r5
        L4e:
            X.0dao r1 = X.EnumC1056240dao.SUCCESS
            goto L42
        L51:
            X.C155000ia.LIZIZ(r1)
            X.0dat r4 = r8.LIZIZ
            X.0dao r3 = X.EnumC1056240dao.REQ
            r2 = 11
            r0 = 0
            X.0dat r0 = X.C1056290dat.LIZ(r4, r0, r3, r2)
            r8.LIZIZ = r0
            r7.LLILLL = r5
            java.lang.Object r1 = r8.LIZLLL(r7, r10)
            if (r1 != r6) goto L22
            return r6
        L6b:
            X.0daq r7 = new X.0daq
            r7.<init>(r8, r9)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056250dap.LIZIZ(X.05Vn, X.0dab):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn r9, X.C1002340cBs r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1056270dar
            if (r0 == 0) goto L6b
            r7 = r9
            X.0dar r7 = (X.C1056270dar) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L51
            if (r0 != r5) goto L71
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            X.00o6 r0 = (X.C189200o6) r0
            java.lang.Object r5 = r0.m10unboximpl()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            X.0dat r4 = r8.LIZJ
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r0 == 0) goto L4e
            X.0dao r1 = X.EnumC1056240dao.FAIL
        L42:
            r0 = 10
            X.0dat r0 = X.C1056290dat.LIZ(r4, r2, r1, r0)
            r8.LIZJ = r0
            X.C155000ia.LIZIZ(r5)
            return r5
        L4e:
            X.0dao r1 = X.EnumC1056240dao.SUCCESS
            goto L42
        L51:
            X.C155000ia.LIZIZ(r1)
            X.0dat r4 = r8.LIZJ
            X.0dao r3 = X.EnumC1056240dao.REQ
            r2 = 11
            r0 = 0
            X.0dat r0 = X.C1056290dat.LIZ(r4, r0, r3, r2)
            r8.LIZJ = r0
            r7.LLILLL = r5
            java.lang.Object r1 = r8.LIZLLL(r7, r10)
            if (r1 != r6) goto L22
            return r6
        L6b:
            X.0dar r7 = new X.0dar
            r7.<init>(r8, r9)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056250dap.LIZJ(X.05Vn, X.0cBs):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn r8, kotlin.jvm.functions.Function1 r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1056280das
            if (r0 == 0) goto L22
            r6 = r8
            X.0das r6 = (X.C1056280das) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            long r3 = r6.LL
            goto L42
        L22:
            X.0das r6 = new X.0das
            r6.<init>(r7, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r2)
            long r3 = java.lang.System.currentTimeMillis()
            r6.LL = r3     // Catch: java.lang.Throwable -> L49
            r6.LLILZ = r0     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = r9.invoke(r6)     // Catch: java.lang.Throwable -> L49
            if (r2 != r5) goto L45
            return r5
        L42:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L4b
        L45:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L4b
            goto L57
        L49:
            r0 = move-exception
            goto L4c
        L4b:
            r0 = move-exception
        L4c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L57:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            X.00o6 r2 = X.C189200o6.m1boximpl(r2)
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056250dap.LIZLLL(X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
