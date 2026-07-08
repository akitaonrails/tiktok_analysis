package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YWT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWT {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final List<String> LJFF;
    public final String LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final Map<String, String> LJIIJJI;
    public final Map<String, String> LJIIL;

    public C0YWT() {
        this(0, null, null, null, null, null, null, 0, 0, null, 0, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YWT)) {
            return false;
        }
        C0YWT c0ywt = (C0YWT) obj;
        return this.LIZ == c0ywt.LIZ && Intrinsics.LJFF(this.LIZIZ, c0ywt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ywt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ywt.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ywt.LJ) && Intrinsics.LJFF(this.LJFF, c0ywt.LJFF) && Intrinsics.LJFF(this.LJI, c0ywt.LJI) && this.LJII == c0ywt.LJII && this.LJIIIIZZ == c0ywt.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c0ywt.LJIIIZ) && this.LJIIJ == c0ywt.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0ywt.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0ywt.LJIIL);
    }

    public C0YWT(int i, String str, String str2, String str3, String str4, List list, String str5, int i2, int i3, String str6, int i4, int i5) {
        i = (i5 & 1) != 0 ? -1 : i;
        str = (i5 & 2) != 0 ? "" : str;
        str2 = (i5 & 4) != 0 ? "" : str2;
        str3 = (i5 & 8) != 0 ? "" : str3;
        str4 = (i5 & 16) != 0 ? "" : str4;
        list = (i5 & 32) != 0 ? C13BV.INSTANCE : list;
        str5 = (i5 & 64) != 0 ? "" : str5;
        i2 = (i5 & 128) != 0 ? -1 : i2;
        i3 = (i5 & 256) != 0 ? -1 : i3;
        str6 = (i5 & 512) != 0 ? "" : str6;
        i4 = (i5 & 1024) != 0 ? -1 : i4;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = list;
        this.LJI = str5;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = str6;
        this.LJIIJ = i4;
        this.LJIIJJI = null;
        this.LJIIL = null;
    }
}
