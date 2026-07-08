package X;

import java.util.List;

/* JADX INFO: renamed from: X.0DpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350820DpA {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final List<String> LJIIIZ;

    public C350820DpA(String str, int i, String str2, long j, boolean z, String str3, String str4, String str5, int i2) {
        this(str, i, str2, j, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, false, (i2 & 512) != 0 ? C13BV.INSTANCE : null);
    }

    public C350820DpA(String str, int i, String str2, long j, boolean z, String str3, String str4, String str5, boolean z2, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = z;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = list;
    }
}
