package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614600O8s implements InterfaceC613720O5i<C614620O8u> {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614600O8s)) {
            return false;
        }
        C614600O8s c614600O8s = (C614600O8s) obj;
        return Intrinsics.LJFF(this.LIZ, c614600O8s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c614600O8s.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdatePinnedAwemeMutation(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(0, 3000L, false);
    }

    public C614600O8s(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r7, X.InterfaceC1364105Vn<? super X.C614620O8u> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C614610O8t
            if (r0 == 0) goto L46
            r5 = r8
            X.0O8t r5 = (X.C614610O8t) r5
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
            com.ss.android.ugc.aweme.music.model.MusicBaseResponse r1 = (com.ss.android.ugc.aweme.music.model.MusicBaseResponse) r1
            X.0O8u r0 = new X.0O8u
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r7)
            java.lang.Class<com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi> r0 = com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi.class
            java.lang.Object r2 = r1.create(r0)
            com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi r2 = (com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi) r2
            java.lang.String r1 = r6.LIZ
            java.lang.String r0 = r6.LIZIZ
            r5.LLILLL = r3
            java.lang.Object r1 = r2.updatePinnedAweme(r1, r0, r5)
            if (r1 != r4) goto L22
            return r4
        L46:
            X.0O8t r5 = new X.0O8t
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614600O8s.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
