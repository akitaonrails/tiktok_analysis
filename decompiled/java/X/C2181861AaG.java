package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181861AaG {
    public final C1AZU LIZ;
    public final C2181431AYz LIZIZ;
    public final List<C2181251AYh> LIZJ;
    public final C2182101Aae LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final List<C1777690wMR> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2181861AaG)) {
            return false;
        }
        C2181861AaG c2181861AaG = (C2181861AaG) obj;
        return this.LIZ == c2181861AaG.LIZ && Intrinsics.LJFF(this.LIZIZ, c2181861AaG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2181861AaG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2181861AaG.LIZLLL) && Intrinsics.LJFF(this.LJ, c2181861AaG.LJ) && Intrinsics.LJFF(this.LJFF, c2181861AaG.LJFF) && Intrinsics.LJFF(this.LJI, c2181861AaG.LJI) && Intrinsics.LJFF(this.LJII, c2181861AaG.LJII);
    }

    public C2181861AaG(C1AZU c1azu, C2181431AYz c2181431AYz, List<C2181251AYh> list, C2182101Aae c2182101Aae, String str, String str2, String str3, List<C1777690wMR> list2) {
        this.LIZ = c1azu;
        this.LIZIZ = c2181431AYz;
        this.LIZJ = list;
        this.LIZLLL = c2182101Aae;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = list2;
    }
}
