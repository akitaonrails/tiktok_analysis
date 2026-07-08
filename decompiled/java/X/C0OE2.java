package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OE2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OE2 implements InterfaceC613740O5k<C615970ODz> {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OE2)) {
            return false;
        }
        C0OE2 c0oe2 = (C0OE2) obj;
        return Intrinsics.LJFF(this.LIZ, c0oe2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0oe2.LIZIZ) && this.LIZJ == c0oe2.LIZJ && this.LIZLLL == c0oe2.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetOriginMusicListQuery(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secUid=");
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r12, X.InterfaceC1364105Vn<? super X.C615970ODz> r13) {
        /*
            r11 = this;
            r0 = 138013(0x21b1d, float:1.93397E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r13 instanceof X.C0OE3
            if (r0 == 0) goto L33
            r10 = r13
            X.0OE3 r10 = (X.C0OE3) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r10.LLILLL = r2
        L19:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 == r2) goto L5e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r4 == 0) goto L32
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L32:
            throw r1
        L33:
            X.0OE3 r10 = new X.0OE3
            r10.<init>(r11, r13)
            goto L19
        L39:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r12)
            java.lang.Class<X.0OE5> r0 = X.C0OE5.class
            java.lang.Object r5 = r1.create(r0)
            X.0OE5 r5 = (X.C0OE5) r5
            java.lang.String r6 = r11.LIZ
            java.lang.String r7 = r11.LIZIZ
            int r8 = r11.LIZJ
            int r9 = r11.LIZLLL
            r10.LLILLL = r2
            java.lang.Object r1 = r5.LIZJ(r6, r7, r8, r9, r10)
            if (r1 != r3) goto L61
            if (r4 == 0) goto L5d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5d:
            return r3
        L5e:
            X.C155000ia.LIZIZ(r1)
        L61:
            com.ss.android.ugc.aweme.music.model.OriginalMusicList r1 = (com.ss.android.ugc.aweme.music.model.OriginalMusicList) r1
            X.0ODz r0 = new X.0ODz
            r0.<init>(r1)
            if (r4 == 0) goto L6d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OE2.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C0OE2(String str, String str2, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
