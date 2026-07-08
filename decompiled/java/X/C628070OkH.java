package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628070OkH implements InterfaceC613740O5k<C628090OkJ> {
    public final String LIZ;
    public final long LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C628070OkH)) {
            return false;
        }
        C628070OkH c628070OkH = (C628070OkH) obj;
        return Intrinsics.LJFF(this.LIZ, c628070OkH.LIZ) && this.LIZIZ == c628070OkH.LIZIZ && Intrinsics.LJFF(this.LIZJ, c628070OkH.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c628070OkH.LIZLLL) && Intrinsics.LJFF(this.LJ, c628070OkH.LJ) && this.LJFF == c628070OkH.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZLLL;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetTemplateDetailListQuery(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageExtra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", appVersion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", lazyLoading=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r14, X.InterfaceC1364105Vn<? super X.C628090OkJ> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C628080OkI
            if (r0 == 0) goto L4e
            r12 = r15
            X.0OkI r12 = (X.C628080OkI) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r12.LLILLL = r2
        L12:
            java.lang.Object r1 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L54
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel r1 = (com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel) r1
            X.0OkJ r0 = new X.0OkJ
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r14)
            java.lang.Class<X.0OkO> r0 = X.InterfaceC628140OkO.class
            java.lang.Object r4 = r1.create(r0)
            X.0OkO r4 = (X.InterfaceC628140OkO) r4
            java.lang.String r5 = r13.LIZ
            long r6 = r13.LIZIZ
            java.lang.Integer r8 = r13.LIZJ
            java.lang.String r9 = r13.LIZLLL
            java.lang.String r10 = r13.LJ
            int r11 = r13.LJFF
            r12.LLILLL = r2
            java.lang.Object r1 = r4.LIZIZ(r5, r6, r8, r9, r10, r11, r12)
            if (r1 != r3) goto L22
            return r3
        L4e:
            X.0OkI r12 = new X.0OkI
            r12.<init>(r13, r15)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C628070OkH.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C628070OkH(long j, String str, int i, Integer num, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = i;
    }
}
