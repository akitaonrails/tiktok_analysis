package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613180O3g implements InterfaceC613740O5k<C0O3O> {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final Integer LJII;
    public final int LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C613180O3g)) {
            return false;
        }
        C613180O3g c613180O3g = (C613180O3g) obj;
        return Intrinsics.LJFF(this.LIZ, c613180O3g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c613180O3g.LIZIZ) && this.LIZJ == c613180O3g.LIZJ && this.LIZLLL == c613180O3g.LIZLLL && Intrinsics.LJFF(this.LJ, c613180O3g.LJ) && Intrinsics.LJFF(this.LJFF, c613180O3g.LJFF) && this.LJI == c613180O3g.LJI && Intrinsics.LJFF(this.LJII, c613180O3g.LJII) && this.LJIIIIZZ == c613180O3g.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        Integer num = this.LJII;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetMixVideoListQuery(mixId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pullType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", authorUid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", authorSecUid=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fromShare=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", defaultPageType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r16, X.InterfaceC1364105Vn<? super X.C0O3O> r17) {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C613190O3h
            if (r0 == 0) goto L56
            r14 = r3
            X.0O3h r14 = (X.C613190O3h) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r3 = r14.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L5c
            X.C155000ia.LIZIZ(r3)
        L24:
            com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse r3 = (com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse) r3
            X.0O3O r0 = new X.0O3O
            r0.<init>(r3)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.0O3U r3 = X.C0O7F.LIZLLL(r16)
            java.lang.Class<com.ss.android.ugc.aweme.mix.api.MixFeedApi> r0 = com.ss.android.ugc.aweme.mix.api.MixFeedApi.class
            java.lang.Object r3 = r3.create(r0)
            com.ss.android.ugc.aweme.mix.api.MixFeedApi r3 = (com.ss.android.ugc.aweme.mix.api.MixFeedApi) r3
            java.lang.String r4 = r15.LIZ
            java.lang.String r5 = r15.LIZIZ
            long r6 = r15.LIZJ
            int r8 = r15.LIZLLL
            java.lang.String r9 = r15.LJ
            java.lang.String r10 = r15.LJFF
            boolean r11 = r15.LJI
            java.lang.Integer r12 = r15.LJII
            int r13 = r15.LJIIIIZZ
            r14.LLILLL = r1
            java.lang.Object r3 = r3.getMixVideoList(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r2) goto L24
            return r2
        L56:
            X.0O3h r14 = new X.0O3h
            r14.<init>(r15, r3)
            goto L14
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613180O3g.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C613180O3g(int i, int i2, long j, Integer num, String str, String str2, String str3, String str4, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z;
        this.LJII = num;
        this.LJIIIIZZ = i2;
    }
}
