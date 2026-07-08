package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OE7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OE7 implements InterfaceC613740O5k<C615770ODf> {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OE7)) {
            return false;
        }
        C0OE7 c0oe7 = (C0OE7) obj;
        return Intrinsics.LJFF(this.LIZ, c0oe7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0oe7.LIZIZ) && this.LIZJ == c0oe7.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMusicListQuery(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isGroup=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    public C0OE7(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r8, X.InterfaceC1364105Vn<? super X.C615770ODf> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0OE8
            if (r0 == 0) goto L48
            r6 = r9
            X.0OE8 r6 = (X.C0OE8) r6
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
            com.ss.android.ugc.aweme.music.search.SearchMusicList r1 = (com.ss.android.ugc.aweme.music.search.SearchMusicList) r1
            X.0ODf r0 = new X.0ODf
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r8)
            java.lang.Class<X.0OE9> r0 = X.C0OE9.class
            java.lang.Object r3 = r1.create(r0)
            X.0OE9 r3 = (X.C0OE9) r3
            java.lang.String r2 = r7.LIZ
            java.lang.String r1 = r7.LIZIZ
            boolean r0 = r7.LIZJ
            r6.LLILLL = r4
            java.lang.Object r1 = r3.LIZ(r2, r1, r0, r6)
            if (r1 != r5) goto L22
            return r5
        L48:
            X.0OE8 r6 = new X.0OE8
            r6.<init>(r7, r9)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OE7.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
