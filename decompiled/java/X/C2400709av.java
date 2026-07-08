package X;

import java.util.List;

/* JADX INFO: renamed from: X.09av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2400709av {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String[] LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public C2400709av(String str, List list, long j, long j2, String str2, String str3, String[] strArr, boolean z, boolean z2, boolean z3, int i) {
        String str4 = str2;
        String str5 = str3;
        boolean z4 = z;
        boolean z5 = z2;
        str = (i & 1) != 0 ? null : str;
        list = (i & 2) != 0 ? null : list;
        j = (i & 4) != 0 ? -1L : j;
        long j3 = (i & 8) == 0 ? j2 : -1L;
        str4 = (i & 16) != 0 ? "DESC" : str4;
        str5 = (i & 32) != 0 ? null : str5;
        String[] strArr2 = (i & 64) == 0 ? strArr : null;
        z4 = (i & 128) != 0 ? false : z4;
        z5 = (i & 256) != 0 ? false : z5;
        boolean z6 = (i & 512) == 0 ? z3 : false;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = j;
        this.LIZLLL = j3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = strArr2;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = z6;
    }
}
