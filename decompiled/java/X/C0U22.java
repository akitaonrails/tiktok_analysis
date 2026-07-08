package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U22, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U22 extends C0U23 {
    public static final C0U22 LJIJ;
    public final C0U3A LJII;
    public final C0U3A LJIIIIZZ;
    public final C0U36 LJIIIZ;
    public final boolean LJIIJ;
    public final EnumC038300Bp LJIIJJI;
    public final boolean LJIIL;
    public final C0U24 LJIILIIL;
    public final C0U2R LJIILJJIL;
    public int LJIILL;
    public C0U2X LJIILLIIL;
    public final C01GW LJIIZILJ;

    static {
        C0U3A c0u3a = C0U3A.LIZLLL;
        boolean z = false;
        LJIJ = new C0U22(-1L, c0u3a, c0u3a, C0U36.LJFF, "", "", 0L, C13BV.INSTANCE, z, EnumC038300Bp.UN_ADD, z, C0U24.NOT_REQUESTED);
    }

    public final long LJIIIIZZ() {
        C0U2X c0u2x = this.LJIILLIIL;
        if (c0u2x != null) {
            return c0u2x.LIZIZ;
        }
        return -1L;
    }

    public final String LJIIIZ() {
        return this.LJI.getString("panel", "normal");
    }

    public final List<ImageModel> LJIIJ() {
        return (List) this.LJIIZILJ.getValue();
    }

    public final boolean LJIIJJI() {
        return this.LIZ == -1;
    }

    public final boolean LJIIL() {
        return this.LIZ == -2;
    }

    @Override // X.C0U23
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KaraokeSongInfo(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFavorite=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", addStatus=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", isRequested=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", isRequestedForSelf=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", playStatus=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", viewerCount=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", singer=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", lyricInfo=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0U22 LIZLLL(boolean z) {
        C0U22 c0u22 = new C0U22(this.LIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, z, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL);
        LJII(c0u22);
        return c0u22;
    }

    public final C0U22 LJ(C0U2R c0u2r) {
        C0U22 c0u22 = new C0U22(this.LIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, c0u2r);
        LJII(c0u22);
        return c0u22;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0U22 LJFF(X.C0U24 r24) {
        /*
            r23 = this;
            X.0U24 r0 = X.C0U24.REQUESTING
            r1 = r24
            r5 = r23
            if (r1 != r0) goto L3b
            X.0U24 r0 = r5.LJIILIIL
            X.0U24 r4 = X.C0U24.REQUESTED
            if (r0 != r4) goto L3b
        Le:
            X.0U22 r7 = new X.0U22
            long r8 = r5.LIZ
            X.0U3A r10 = r5.LJII
            X.0U3A r11 = r5.LJIIIIZZ
            X.0U36 r12 = r5.LJIIIZ
            java.lang.String r13 = r5.LIZJ
            java.lang.String r14 = r5.LIZLLL
            long r15 = r5.LJ
            java.util.List<java.lang.String> r6 = r5.LJFF
            boolean r3 = r5.LJIIJ
            X.00Bp r2 = r5.LJIIJJI
            boolean r1 = r5.LJIIL
            X.0U2R r0 = r5.LJIILJJIL
            r22 = r0
            r21 = r4
            r20 = r1
            r19 = r2
            r18 = r3
            r17 = r6
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            r5.LJII(r7)
            return r7
        L3b:
            r4 = r1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U22.LJFF(X.0U24):X.0U22");
    }

    public final C0U22 LJI(boolean z) {
        C0U22 c0u22 = new C0U22(this.LIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJIIJ, this.LJIIJJI, z, this.LJIILIIL, this.LJIILJJIL);
        LJII(c0u22);
        return c0u22;
    }

    public final void LJII(C0U22 c0u22) {
        c0u22.LJIILL = this.LJIILL;
        c0u22.LJIIJ().addAll(LJIIJ());
        c0u22.LJIILLIIL = this.LJIILLIIL;
    }

    public final boolean equals(Object obj) {
        C0U22 c0u22;
        Long lValueOf;
        Long lValueOf2 = null;
        if (obj instanceof C0U22) {
            c0u22 = (C0U22) obj;
        } else {
            c0u22 = null;
        }
        if (c0u22 == null || this.LIZ != c0u22.LIZ) {
            return false;
        }
        C0U2X c0u2x = this.LJIILLIIL;
        if (c0u2x != null) {
            lValueOf = Long.valueOf(c0u2x.LIZIZ);
        } else {
            lValueOf = null;
        }
        C0U2X c0u2x2 = c0u22.LJIILLIIL;
        if (c0u2x2 != null) {
            lValueOf2 = Long.valueOf(c0u2x2.LIZIZ);
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0U22 LIZIZ(X.EnumC038300Bp r20, boolean r21, X.C0U24 r22) {
        /*
            r19 = this;
            X.00Bp r0 = X.EnumC038300Bp.ADDING
            r1 = r20
            r2 = r19
            if (r1 != r0) goto L3f
            X.00Bp r0 = r2.LJIIJJI
            X.00Bp r15 = X.EnumC038300Bp.ADDED
            if (r0 != r15) goto L3f
        Le:
            X.0U24 r0 = X.C0U24.REQUESTING
            r3 = r22
            if (r3 != r0) goto L3d
            X.0U24 r0 = r2.LJIILIIL
            X.0U24 r1 = X.C0U24.REQUESTED
            if (r0 != r1) goto L3d
        L1a:
            X.0U22 r3 = new X.0U22
            long r4 = r2.LIZ
            X.0U3A r6 = r2.LJII
            X.0U3A r7 = r2.LJIIIIZZ
            X.0U36 r8 = r2.LJIIIZ
            java.lang.String r9 = r2.LIZJ
            java.lang.String r10 = r2.LIZLLL
            long r11 = r2.LJ
            java.util.List<java.lang.String> r13 = r2.LJFF
            boolean r14 = r2.LJIIJ
            X.0U2R r0 = r2.LJIILJJIL
            r16 = r21
            r18 = r0
            r17 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            r2.LJII(r3)
            return r3
        L3d:
            r1 = r3
            goto L1a
        L3f:
            r15 = r1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U22.LIZIZ(X.00Bp, boolean, X.0U24):X.0U22");
    }

    public /* synthetic */ C0U22(long j, C0U3A c0u3a, C0U3A c0u3a2, C0U36 c0u36, String str, String str2, long j2, List list, boolean z, EnumC038300Bp enumC038300Bp, boolean z2, C0U24 c0u24) {
        this(j, c0u3a, c0u3a2, c0u36, str, str2, j2, list, z, enumC038300Bp, z2, c0u24, C0U2R.IDLE);
    }

    public C0U22(long j, C0U3A c0u3a, C0U3A c0u3a2, C0U36 c0u36, String str, String str2, long j2, List<String> list, boolean z, EnumC038300Bp enumC038300Bp, boolean z2, C0U24 c0u24, C0U2R c0u2r) {
        super(j, c0u3a, str, str2, j2, list);
        this.LJII = c0u3a;
        this.LJIIIIZZ = c0u3a2;
        this.LJIIIZ = c0u36;
        this.LJIIJ = z;
        this.LJIIJJI = enumC038300Bp;
        this.LJIIL = z2;
        this.LJIILIIL = c0u24;
        this.LJIILJJIL = c0u2r;
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(527));
    }
}
