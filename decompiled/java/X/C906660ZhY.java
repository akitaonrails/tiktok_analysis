package X;

import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;

/* JADX INFO: renamed from: X.0ZhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906660ZhY implements InterfaceC906020ZgW {
    public final C906700Zhc LIZ;

    @Override // X.InterfaceC906020ZgW
    public final void cancel() {
    }

    public C906660ZhY(C906700Zhc c906700Zhc) {
        this.LIZ = c906700Zhc;
    }

    @Override // X.InterfaceC906020ZgW
    public final InterfaceC346201Wa<StreamingResponseData> LIZ(C906210Zgp c906210Zgp) {
        return C09IC.LJIL(C09IC.LJ(new C906650ZhX(this, c906210Zgp, null)), C0PEM.LIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // X.InterfaceC906020ZgW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C906200Zgo r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.im.streaming.api.StreamingInterruptResponseData>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C906680Zha
            if (r0 == 0) goto L3d
            r5 = r8
            X.0Zha r5 = (X.C906680Zha) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0ZhZ r1 = new X.0ZhZ
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L3d:
            X.0Zha r5 = new X.0Zha
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C906660ZhY.LIZIZ(X.0Zgo, X.05Vn):java.lang.Object");
    }
}
