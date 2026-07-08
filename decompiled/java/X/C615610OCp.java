package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615610OCp implements InterfaceC613740O5k<C615630OCr> {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ = 12;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C615610OCp)) {
            return false;
        }
        C615610OCp c615610OCp = (C615610OCp) obj;
        return Intrinsics.LJFF(this.LIZ, c615610OCp.LIZ) && this.LIZIZ == c615610OCp.LIZIZ && this.LIZJ == c615610OCp.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAIMEDetailListQuery(styleId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    public C615610OCp(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r12, X.InterfaceC1364105Vn<? super X.C615630OCr> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C615620OCq
            if (r0 == 0) goto L48
            r10 = r13
            X.0OCq r10 = (X.C615620OCq) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel r1 = (com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel) r1
            X.0OCr r0 = new X.0OCr
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r12)
            java.lang.Class<X.0OCs> r0 = X.InterfaceC615640OCs.class
            java.lang.Object r4 = r1.create(r0)
            X.0OCs r4 = (X.InterfaceC615640OCs) r4
            java.lang.String r5 = r11.LIZ
            long r6 = r11.LIZIZ
            long r8 = r11.LIZJ
            r10.LLILLL = r2
            java.lang.Object r1 = r4.LIZIZ(r5, r6, r8, r10)
            if (r1 != r3) goto L22
            return r3
        L48:
            X.0OCq r10 = new X.0OCq
            r10.<init>(r11, r13)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615610OCp.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
