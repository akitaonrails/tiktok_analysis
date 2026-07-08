package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OGS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OGS implements InterfaceC613720O5i<C0OGU> {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OGS)) {
            return false;
        }
        C0OGS c0ogs = (C0OGS) obj;
        return Intrinsics.LJFF(this.LIZ, c0ogs.LIZ) && this.LIZIZ == c0ogs.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ogs.LIZJ) && this.LIZLLL == c0ogs.LIZLLL && this.LJ == c0ogs.LJ && this.LJFF == c0ogs.LJFF && Intrinsics.LJFF(this.LJI, c0ogs.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        return ((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetLandingPageDataMutation(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", aggregationType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(0, 3000L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r14, X.InterfaceC1364105Vn<? super X.C0OGU> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C0OGT
            if (r0 == 0) goto L50
            r12 = r15
            X.0OGT r12 = (X.C0OGT) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r12.LLILLL = r2
        L12:
            java.lang.Object r1 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L56
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.api.LandingPageDataResponse r1 = (com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.api.LandingPageDataResponse) r1
            X.0OGU r0 = new X.0OGU
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r14)
            java.lang.Class<X.05rb> r0 = X.InterfaceC1484905rb.class
            java.lang.Object r4 = r1.create(r0)
            X.05rb r4 = (X.InterfaceC1484905rb) r4
            java.lang.String r5 = r13.LIZ
            int r6 = r13.LIZIZ
            java.lang.String r7 = r13.LIZJ
            int r8 = r13.LIZLLL
            int r9 = r13.LJ
            int r10 = r13.LJFF
            java.lang.String r11 = r13.LJI
            r12.LLILLL = r2
            java.lang.Object r1 = r4.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r3) goto L22
            return r3
        L50:
            X.0OGT r12 = new X.0OGT
            r12.<init>(r13, r15)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OGS.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C0OGS(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = str3;
    }
}
