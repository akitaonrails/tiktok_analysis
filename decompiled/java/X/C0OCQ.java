package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OCQ implements InterfaceC613740O5k<C0OCS> {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ = 12;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OCQ)) {
            return false;
        }
        C0OCQ c0ocq = (C0OCQ) obj;
        return Intrinsics.LJFF(this.LIZ, c0ocq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ocq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ocq.LIZJ) && this.LIZLLL == c0ocq.LIZLLL && this.LJ == c0ocq.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAIPortraitDetailListQuery(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", origPromptId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rootPromptId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", count=");
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
    public final java.lang.Object LIZIZ(X.C0O8O r14, X.InterfaceC1364105Vn<? super X.C0OCS> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C0OCR
            if (r0 == 0) goto L4c
            r12 = r15
            X.0OCR r12 = (X.C0OCR) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r12.LLILLL = r2
        L12:
            java.lang.Object r1 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L52
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel r1 = (com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel) r1
            X.0OCS r0 = new X.0OCS
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r14)
            java.lang.Class<X.0OCT> r0 = X.C0OCT.class
            java.lang.Object r4 = r1.create(r0)
            X.0OCT r4 = (X.C0OCT) r4
            java.lang.String r5 = r13.LIZ
            java.lang.String r6 = r13.LIZIZ
            java.lang.String r7 = r13.LIZJ
            long r8 = r13.LIZLLL
            long r10 = r13.LJ
            r12.LLILLL = r2
            java.lang.Object r1 = r4.LIZIZ(r5, r6, r7, r8, r10, r12)
            if (r1 != r3) goto L22
            return r3
        L4c:
            X.0OCR r12 = new X.0OCR
            r12.<init>(r13, r15)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OCQ.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C0OCQ(long j, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
    }
}
