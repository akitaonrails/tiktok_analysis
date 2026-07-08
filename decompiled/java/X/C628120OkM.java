package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628120OkM implements InterfaceC613740O5k<C628170OkR> {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C628120OkM)) {
            return false;
        }
        C628120OkM c628120OkM = (C628120OkM) obj;
        return Intrinsics.LJFF(this.LIZ, c628120OkM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c628120OkM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c628120OkM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c628120OkM.LIZLLL) && Intrinsics.LJFF(this.LJ, c628120OkM.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetTemplateDetailQuery(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", appVersion=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", featureBits=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r12, X.InterfaceC1364105Vn<? super X.C628170OkR> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C628150OkP
            if (r0 == 0) goto L4c
            r10 = r13
            X.0OkP r10 = (X.C628150OkP) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L52
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel r1 = (com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel) r1
            X.0OkR r0 = new X.0OkR
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r12)
            java.lang.Class<X.0OkO> r0 = X.InterfaceC628140OkO.class
            java.lang.Object r4 = r1.create(r0)
            X.0OkO r4 = (X.InterfaceC628140OkO) r4
            java.lang.String r5 = r11.LIZ
            java.lang.Integer r6 = r11.LIZIZ
            java.lang.Integer r7 = r11.LIZJ
            java.lang.String r8 = r11.LIZLLL
            java.lang.String r9 = r11.LJ
            r10.LLILLL = r2
            java.lang.Object r1 = r4.LIZ(r5, r6, r7, r8, r9, r10)
            if (r1 != r3) goto L22
            return r3
        L4c:
            X.0OkP r10 = new X.0OkP
            r10.<init>(r11, r13)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C628120OkM.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C628120OkM(String str, Integer num, Integer num2, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
