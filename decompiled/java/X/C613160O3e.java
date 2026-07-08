package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613160O3e implements InterfaceC613740O5k<C0O3L> {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL = true;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C613160O3e)) {
            return false;
        }
        C613160O3e c613160O3e = (C613160O3e) obj;
        return Intrinsics.LJFF(this.LIZ, c613160O3e.LIZ) && this.LIZIZ == c613160O3e.LIZIZ && Intrinsics.LJFF(this.LIZJ, c613160O3e.LIZJ) && this.LIZLLL == c613160O3e.LIZLLL && Intrinsics.LJFF(this.LJ, c613160O3e.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetUserPlaylistQuery(createUID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", needCover=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mixId=");
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
    public final java.lang.Object LIZIZ(X.C0O8O r13, X.InterfaceC1364105Vn<? super X.C0O3L> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C613170O3f
            if (r0 == 0) goto L4c
            r11 = r14
            X.0O3f r11 = (X.C613170O3f) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r11.LLILLL = r2
        L12:
            java.lang.Object r1 = r11.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L52
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.mix.model.MixListResponse r1 = (com.ss.android.ugc.aweme.mix.model.MixListResponse) r1
            X.0O3L r0 = new X.0O3L
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r13)
            java.lang.Class<com.ss.android.ugc.aweme.mix.api.MixFeedApi> r0 = com.ss.android.ugc.aweme.mix.api.MixFeedApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.mix.api.MixFeedApi r4 = (com.ss.android.ugc.aweme.mix.api.MixFeedApi) r4
            java.lang.String r5 = r12.LIZ
            long r6 = r12.LIZIZ
            java.lang.String r8 = r12.LIZJ
            boolean r9 = r12.LIZLLL
            java.lang.String r10 = r12.LJ
            r11.LLILLL = r2
            java.lang.Object r1 = r4.getUserPlaylist(r5, r6, r8, r9, r10, r11)
            if (r1 != r3) goto L22
            return r3
        L4c:
            X.0O3f r11 = new X.0O3f
            r11.<init>(r12, r14)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613160O3e.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C613160O3e(long j, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LJ = str3;
    }
}
