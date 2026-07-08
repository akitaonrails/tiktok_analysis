package X;

import java.io.File;

/* JADX INFO: renamed from: X.0kUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321590kUn {
    public final InterfaceC1326920kdO LIZ;

    public C1321590kUn() {
        Class<?> cls = C1322200kVm.LIZ;
        this.LIZ = C1328130kfL.LJIILIIL().LJIILL();
    }

    public final String LIZIZ(C1325710kbR c1325710kbR) {
        C1335740krc c1335740krc;
        File file;
        InterfaceC1326920kdO interfaceC1326920kdO = this.LIZ;
        C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
        c1324810kZzLJI.getClass();
        InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = interfaceC1326920kdO.LJIIJ(c1324810kZzLJI.LJ(c1325710kbR.LIZIZ));
        if (!(interfaceC1317730kOZLJIIJ instanceof C1335740krc) || (c1335740krc = (C1335740krc) interfaceC1317730kOZLJIIJ) == null || (file = c1335740krc.LIZ) == null) {
            return null;
        }
        return file.getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r9, X.InterfaceC1364105Vn<? super java.util.List<java.lang.String>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C317450CcR
            if (r0 == 0) goto L98
            r5 = r10
            X.0CcR r5 = (X.C317450CcR) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 1
            if (r0 == 0) goto L45
            if (r0 != r6) goto La0
            java.lang.Object r3 = r5.LL
            java.util.List r3 = (java.util.List) r3
            X.C155000ia.LIZIZ(r1)
        L26:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r3.iterator()
        L2f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r1.next()
            X.0kbR r0 = (X.C1325710kbR) r0
            java.lang.String r0 = r8.LIZIZ(r0)
            if (r0 == 0) goto L2f
            r2.add(r0)
            goto L2f
        L45:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r9, r0)
            r3.<init>(r0)
            java.util.Iterator r7 = r9.iterator()
        L57:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "x-tt-pns-dt-pass-id"
            java.lang.String r0 = "268435457"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
            android.net.Uri r0 = r0.build()
            X.0kbQ r1 = X.C1325700kbQ.LIZLLL(r0)
            X.0kka r0 = X.EnumC1331380kka.HIGH
            r1.LJIIL = r0
            X.0kbR r0 = r1.LIZ()
            r3.add(r0)
            goto L57
        L87:
            X.0CcO r1 = new X.0CcO
            r0 = 0
            r1.<init>(r8, r3, r0)
            r5.LL = r3
            r5.LLILZ = r6
            java.lang.Object r0 = X.C1499990p8X.LIZ(r1, r5)
            if (r0 != r4) goto L26
            return r4
        L98:
            X.0CcR r5 = new X.0CcR
            r5.<init>(r8, r10)
            goto L12
        L9f:
            return r2
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321590kUn.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }
}
