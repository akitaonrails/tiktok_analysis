package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OG9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OG9 implements InterfaceC613740O5k<C0OG8> {
    public final String LIZ;
    public final int LIZIZ = 0;
    public final int LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OG9)) {
            return false;
        }
        C0OG9 c0og9 = (C0OG9) obj;
        return Intrinsics.LJFF(this.LIZ, c0og9.LIZ) && this.LIZIZ == c0og9.LIZIZ && this.LIZJ == c0og9.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0og9.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Map<String, String> map = this.LIZLLL;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryMusicExtraQuery(mcId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isMCAUser=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extra=");
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
    public final java.lang.Object LIZIZ(X.C0O8O r11, X.InterfaceC1364105Vn<? super X.C0OG8> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C0OGA
            if (r0 == 0) goto L4a
            r9 = r12
            X.0OGA r9 = (X.C0OGA) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L50
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.music.model.MusicDetail r1 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r1
            X.0OG8 r0 = new X.0OG8
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r11)
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApiV2> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApiV2.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApiV2 r4 = (com.ss.android.ugc.aweme.music.api.MusicDetailApiV2) r4
            java.lang.String r5 = r10.LIZ
            int r6 = r10.LIZIZ
            int r7 = r10.LIZJ
            java.util.Map<java.lang.String, java.lang.String> r8 = r10.LIZLLL
            r9.LLILLL = r2
            java.lang.Object r1 = r4.queryMusicExtra(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L22
            return r3
        L4a:
            X.0OGA r9 = new X.0OGA
            r9.<init>(r10, r12)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OG9.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C0OG9(int i, String str, Map map) {
        this.LIZ = str;
        this.LIZJ = i;
        this.LIZLLL = map;
    }
}
