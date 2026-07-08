package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ok2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627920Ok2 implements InterfaceC613740O5k<C627950Ok5> {
    public final int LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL = 20;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C627920Ok2)) {
            return false;
        }
        C627920Ok2 c627920Ok2 = (C627920Ok2) obj;
        return this.LIZ == c627920Ok2.LIZ && Intrinsics.LJFF(this.LIZIZ, c627920Ok2.LIZIZ) && this.LIZJ == c627920Ok2.LIZJ && this.LIZLLL == c627920Ok2.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetCreativeToolDetailListQuery(anchorType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", detailPageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r12, X.InterfaceC1364105Vn<? super X.C627950Ok5> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C627940Ok4
            if (r0 == 0) goto L4a
            r10 = r13
            X.0Ok4 r10 = (X.C627940Ok4) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L50
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel r1 = (com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel) r1
            X.0Ok5 r0 = new X.0Ok5
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r12)
            java.lang.Class<X.0Ojm> r0 = X.InterfaceC627760Ojm.class
            java.lang.Object r4 = r1.create(r0)
            X.0Ojm r4 = (X.InterfaceC627760Ojm) r4
            int r5 = r11.LIZ
            java.lang.String r6 = r11.LIZIZ
            long r7 = r11.LIZJ
            int r9 = r11.LIZLLL
            r10.LLILLL = r2
            java.lang.Object r1 = r4.LIZIZ(r5, r6, r7, r9, r10)
            if (r1 != r3) goto L22
            return r3
        L4a:
            X.0Ok4 r10 = new X.0Ok4
            r10.<init>(r11, r13)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627920Ok2.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C627920Ok2(int i, long j, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
