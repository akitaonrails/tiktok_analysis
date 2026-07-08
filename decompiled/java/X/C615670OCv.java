package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615670OCv implements InterfaceC613740O5k<C615690OCx> {
    public final String LIZ;
    public final int LIZIZ = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C615670OCv)) {
            return false;
        }
        C615670OCv c615670OCv = (C615670OCv) obj;
        return Intrinsics.LJFF(this.LIZ, c615670OCv.LIZ) && this.LIZIZ == c615670OCv.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAIMEDetailQuery(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    public C615670OCv(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r7, X.InterfaceC1364105Vn<? super X.C615690OCx> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C615680OCw
            if (r0 == 0) goto L46
            r5 = r8
            X.0OCw r5 = (X.C615680OCw) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L4c
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.aime.model.AIMEDetailModel r1 = (com.ss.android.ugc.aweme.aime.model.AIMEDetailModel) r1
            X.0OCx r0 = new X.0OCx
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r7)
            java.lang.Class<X.0OCs> r0 = X.InterfaceC615640OCs.class
            java.lang.Object r2 = r1.create(r0)
            X.0OCs r2 = (X.InterfaceC615640OCs) r2
            java.lang.String r1 = r6.LIZ
            int r0 = r6.LIZIZ
            r5.LLILLL = r3
            java.lang.Object r1 = r2.LIZ(r1, r0, r5)
            if (r1 != r4) goto L22
            return r4
        L46:
            X.0OCw r5 = new X.0OCw
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615670OCv.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
