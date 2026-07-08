package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OG1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OG1 implements InterfaceC613720O5i<C0OG0> {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OG1)) {
            return false;
        }
        C0OG1 c0og1 = (C0OG1) obj;
        return Intrinsics.LJFF(this.LIZ, c0og1.LIZ) && this.LIZIZ == c0og1.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectMusicMutation(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(3, 3000L, true);
    }

    public C0OG1(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r7, X.InterfaceC1364105Vn<? super X.C0OG0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0OG2
            if (r0 == 0) goto L46
            r5 = r8
            X.0OG2 r5 = (X.C0OG2) r5
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
            com.ss.android.ugc.aweme.music.model.CollectMusicResponse r1 = (com.ss.android.ugc.aweme.music.model.CollectMusicResponse) r1
            X.0OG0 r0 = new X.0OG0
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r7)
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApiV2> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApiV2.class
            java.lang.Object r2 = r1.create(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApiV2 r2 = (com.ss.android.ugc.aweme.music.api.MusicDetailApiV2) r2
            java.lang.String r1 = r6.LIZ
            int r0 = r6.LIZIZ
            r5.LLILLL = r3
            java.lang.Object r1 = r2.collectMusic(r1, r0, r5)
            if (r1 != r4) goto L22
            return r4
        L46:
            X.0OG2 r5 = new X.0OG2
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OG1.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
