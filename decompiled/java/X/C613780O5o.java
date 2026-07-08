package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613780O5o implements InterfaceC613720O5i<C613760O5m> {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C613780O5o)) {
            return false;
        }
        C613780O5o c613780O5o = (C613780O5o) obj;
        return Intrinsics.LJFF(this.LIZ, c613780O5o.LIZ) && this.LIZIZ == c613780O5o.LIZIZ && this.LIZJ == c613780O5o.LIZJ && Intrinsics.LJFF(this.LIZLLL, c613780O5o.LIZLLL) && Intrinsics.LJFF(this.LJ, c613780O5o.LJ) && Intrinsics.LJFF(this.LJFF, c613780O5o.LJFF) && Intrinsics.LJFF(this.LJI, c613780O5o.LJI) && Intrinsics.LJFF(this.LJII, c613780O5o.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c613780O5o.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c613780O5o.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c613780O5o.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c613780O5o.LJIIJJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        String str2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJII;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIJ;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIJJI;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        return "CollectAwemeMutation(awemeId=" + this.LIZ + ", action=" + this.LIZIZ + ", privacySetting=" + this.LIZJ + ", adId=" + this.LIZLLL + ", creativeId=" + this.LJ + ", logExtra=" + this.LJFF + ", userAgent=" + this.LJI + ", networkAccessType=" + this.LJII + ", packageName=" + this.LJIIIIZZ + ", googleAid=" + this.LJIIIZ + ", duration=" + this.LJIIJ + ", playOrder=" + this.LJIIJJI + ')';
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(0, 3000L, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r32, X.InterfaceC1364105Vn<? super X.C613760O5m> r33) {
        /*
            r31 = this;
            r0 = 137784(0x21a38, float:1.93077E-40)
            boolean r16 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r3 = r33
            boolean r0 = r3 instanceof X.C613790O5p
            r14 = r31
            if (r0 == 0) goto L37
            r13 = r3
            X.0O5p r13 = (X.C613790O5p) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r13.LLILLL = r2
        L1d:
            java.lang.Object r1 = r13.LL
            java.lang.Object r12 = X.C099R.LJFF()
            int r0 = r13.LLILLL
            r11 = 1
            if (r0 == 0) goto L3d
            if (r0 == r11) goto L8e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r16 == 0) goto L36
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L36:
            throw r1
        L37:
            X.0O5p r13 = new X.0O5p
            r13.<init>(r14, r3)
            goto L1d
        L3d:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r32)
            java.lang.Class<X.0O5n> r0 = X.InterfaceC613770O5n.class
            java.lang.Object r15 = r1.create(r0)
            X.0O5n r15 = (X.InterfaceC613770O5n) r15
            java.lang.String r10 = r14.LIZ
            int r9 = r14.LIZIZ
            int r8 = r14.LIZJ
            java.lang.String r7 = r14.LIZLLL
            java.lang.String r6 = r14.LJ
            java.lang.String r5 = r14.LJFF
            java.lang.String r4 = r14.LJI
            java.lang.String r3 = r14.LJII
            java.lang.String r2 = r14.LJIIIIZZ
            java.lang.String r1 = r14.LJIIIZ
            java.lang.String r0 = r14.LJIIJ
            java.lang.String r14 = r14.LJIIJJI
            r13.LLILLL = r11
            r28 = r0
            r29 = r14
            r30 = r13
            r26 = r2
            r27 = r1
            r25 = r3
            r24 = r4
            r23 = r5
            r22 = r6
            r21 = r7
            r20 = r8
            r19 = r9
            r18 = r10
            r17 = r15
            java.lang.Object r1 = r17.LIZIZ(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r1 != r12) goto L91
            if (r16 == 0) goto L8d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L8d:
            return r12
        L8e:
            X.C155000ia.LIZIZ(r1)
        L91:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            X.0O5m r0 = new X.0O5m
            r0.<init>(r1)
            if (r16 == 0) goto L9d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613780O5o.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C613780O5o(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
    }
}
