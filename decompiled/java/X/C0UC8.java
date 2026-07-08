package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UC8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UC8 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public String LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final boolean LJIILJJIL;
    public final long LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public final long LJIJI;
    public final int LJIJJ;
    public final String LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;
    public boolean LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final boolean LJJIII;
    public final String LJJIIJ;
    public final int LJJIIJZLJL;

    public final boolean equals(Object obj) {
        if (this.LJIJ) {
            if (obj instanceof C0UC8) {
                C0UC8 c0uc8 = (C0UC8) obj;
                if (c0uc8.LJIJ && this.LIZ == c0uc8.LIZ && Intrinsics.LJFF(this.LJIIIZ, c0uc8.LJIIIZ)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if ((obj instanceof C0UC8) && this.LIZ == ((C0UC8) obj).LIZ) {
            return true;
        }
        return false;
    }

    public C0UC8(long j, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, boolean z4, long j2, boolean z5, String str11, boolean z6, long j3, int i, String str12, boolean z7, boolean z8, boolean z9, String str13, String str14, boolean z10, String str15, int i2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
        this.LJIIJJI = str8;
        this.LJIIL = str9;
        this.LJIILIIL = str10;
        this.LJIILJJIL = z4;
        this.LJIILL = j2;
        this.LJIILLIIL = z5;
        this.LJIIZILJ = str11;
        this.LJIJ = z6;
        this.LJIJI = j3;
        this.LJIJJ = i;
        this.LJIJJLI = str12;
        this.LJIL = z7;
        this.LJJ = z8;
        this.LJJI = z9;
        this.LJJIFFI = str13;
        this.LJJII = str14;
        this.LJJIII = z10;
        this.LJJIIJ = str15;
        this.LJJIIJZLJL = i2;
    }

    public /* synthetic */ C0UC8(long j, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, boolean z4, long j2, boolean z5, String str11, boolean z6, long j3, int i, String str12, boolean z7, boolean z8, boolean z9, String str13, String str14, boolean z10, String str15, int i2, int i3) {
        this(j, str, str2, z, str3, str4, z2, z3, str5, str6, str7, str8, str9, str10, (i3 & 16384) != 0 ? false : z4, (32768 & i3) != 0 ? C158B.LIZ() : j2, (65536 & i3) != 0 ? false : z5, str11, z6, (524288 & i3) != 0 ? 0L : j3, i, str12, (4194304 & i3) != 0 ? false : z7, z8, z9, (33554432 & i3) != 0 ? null : str13, (67108864 & i3) == 0 ? str14 : null, (134217728 & i3) != 0 ? false : z10, (268435456 & i3) != 0 ? "" : str15, (i3 & 536870912) != 0 ? 0 : i2);
    }
}
