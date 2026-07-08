package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614660O8y implements InterfaceC613740O5k<C0O90> {
    public final long LIZ = 0;
    public final int LIZIZ = 100;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614660O8y)) {
            return false;
        }
        C614660O8y c614660O8y = (C614660O8y) obj;
        return this.LIZ == c614660O8y.LIZ && this.LIZIZ == c614660O8y.LIZIZ && Intrinsics.LJFF(this.LIZJ, c614660O8y.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetArtistMusicAwemeListQuery(cursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", filterMid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    public C614660O8y(String str) {
        this.LIZJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r11, X.InterfaceC1364105Vn<? super X.C0O90> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C614670O8z
            if (r0 == 0) goto L48
            r9 = r12
            X.0O8z r9 = (X.C614670O8z) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.api.ArtistMusicAwemeResponse r1 = (com.ss.android.ugc.aweme.api.ArtistMusicAwemeResponse) r1
            X.0O90 r0 = new X.0O90
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r11)
            java.lang.Class<com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi> r0 = com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi r4 = (com.ss.android.ugc.aweme.api.MusicPinnedAwemeApi) r4
            long r5 = r10.LIZ
            int r7 = r10.LIZIZ
            java.lang.String r8 = r10.LIZJ
            r9.LLILLL = r2
            java.lang.Object r1 = r4.getArtistMusicAwemeList(r5, r7, r8, r9)
            if (r1 != r3) goto L22
            return r3
        L48:
            X.0O8z r9 = new X.0O8z
            r9.<init>(r10, r12)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614660O8y.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
