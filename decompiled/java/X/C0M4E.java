package X;

import java.util.List;

/* JADX INFO: renamed from: X.0M4E, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4E {
    public final EnumC562200M3e LIZ;
    public final C0M4N LIZIZ;
    public final List<String> LIZJ;
    public final boolean LIZLLL;
    public final EnumC562220M3g LJ;
    public final C0M4F LJFF;
    public final C562260M3k LJI;
    public final C0M0Z LJII;
    public final boolean LJIIIIZZ;
    public final Long LJIIIZ;

    public C0M4E(EnumC562200M3e enumC562200M3e, C0M4N c0m4n, List list, boolean z, EnumC562220M3g enumC562220M3g, C0M4F c0m4f, C562260M3k c562260M3k, C0M0Z c0m0z, boolean z2, Long l, int i) {
        enumC562200M3e = (i & 1) != 0 ? EnumC562200M3e.FIRST_SAVE_TIME : enumC562200M3e;
        c0m4n = (i & 2) != 0 ? null : c0m4n;
        list = (i & 4) != 0 ? C0M4D.LJIIIIZZ() : list;
        z = (i & 8) != 0 ? true : z;
        enumC562220M3g = (i & 16) != 0 ? EnumC562220M3g.NORMAL : enumC562220M3g;
        c0m4f = (i & 32) != 0 ? C0M4F.EXCEPT_TTN : c0m4f;
        c562260M3k = (i & 64) != 0 ? null : c562260M3k;
        c0m0z = (i & 128) != 0 ? null : c0m0z;
        z2 = (i & 256) != 0 ? false : z2;
        l = (i & 512) != 0 ? null : l;
        this.LIZ = enumC562200M3e;
        this.LIZIZ = c0m4n;
        this.LIZJ = list;
        this.LIZLLL = z;
        this.LJ = enumC562220M3g;
        this.LJFF = c0m4f;
        this.LJI = c562260M3k;
        this.LJII = c0m0z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = l;
    }
}
