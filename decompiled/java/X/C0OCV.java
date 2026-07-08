package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OCV implements InterfaceC613740O5k<C0OCZ> {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OCV)) {
            return false;
        }
        C0OCV c0ocv = (C0OCV) obj;
        return Intrinsics.LJFF(this.LIZ, c0ocv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ocv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ocv.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAIPortraitDetailQuery(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", origPromptId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rootPromptId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r8, X.InterfaceC1364105Vn<? super X.C0OCZ> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0OCW
            if (r0 == 0) goto L48
            r6 = r9
            X.0OCW r6 = (X.C0OCW) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel r1 = (com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel) r1
            X.0OCZ r0 = new X.0OCZ
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r8)
            java.lang.Class<X.0OCT> r0 = X.C0OCT.class
            java.lang.Object r3 = r1.create(r0)
            X.0OCT r3 = (X.C0OCT) r3
            java.lang.String r2 = r7.LIZ
            java.lang.String r1 = r7.LIZIZ
            java.lang.String r0 = r7.LIZJ
            r6.LLILLL = r4
            java.lang.Object r1 = r3.LIZ(r2, r1, r0, r6)
            if (r1 != r5) goto L22
            return r5
        L48:
            X.0OCW r6 = new X.0OCW
            r6.<init>(r7, r9)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OCV.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C0OCV(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
