package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Okg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628320Okg implements InterfaceC613720O5i<C628380Okm> {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C628320Okg)) {
            return false;
        }
        C628320Okg c628320Okg = (C628320Okg) obj;
        return Intrinsics.LJFF(this.LIZ, c628320Okg.LIZ) && this.LIZIZ == c628320Okg.LIZIZ && Intrinsics.LJFF(this.LIZJ, c628320Okg.LIZJ) && this.LIZLLL == c628320Okg.LIZLLL && this.LJ == c628320Okg.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetEntityCardLandingPageMutation(searchId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", docId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageUniqueId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(0, 3000L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r13, X.InterfaceC1364105Vn<? super X.C628380Okm> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C628330Okh
            if (r0 == 0) goto L4c
            r11 = r14
            X.0Okh r11 = (X.C628330Okh) r11
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
            com.ss.android.ugc.aweme.search.pages.result.entitycard.api.EntityCardLandingPageResponse r1 = (com.ss.android.ugc.aweme.search.pages.result.entitycard.api.EntityCardLandingPageResponse) r1
            X.0Okm r0 = new X.0Okm
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r13)
            java.lang.Class<X.0Okj> r0 = X.InterfaceC628350Okj.class
            java.lang.Object r4 = r1.create(r0)
            X.0Okj r4 = (X.InterfaceC628350Okj) r4
            java.lang.String r5 = r12.LIZ
            long r6 = r12.LIZIZ
            java.lang.String r8 = r12.LIZJ
            int r9 = r12.LIZLLL
            int r10 = r12.LJ
            r11.LLILLL = r2
            java.lang.Object r1 = r4.LIZ(r5, r6, r8, r9, r10, r11)
            if (r1 != r3) goto L22
            return r3
        L4c:
            X.0Okh r11 = new X.0Okh
            r11.<init>(r12, r14)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C628320Okg.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C628320Okg(int i, long j, int i2, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
