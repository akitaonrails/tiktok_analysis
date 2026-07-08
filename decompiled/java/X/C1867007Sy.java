package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.07Sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1867007Sy {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1867007Sy() {
        String str = null;
        this(str, str, str, str, str, str, str, str, str, str, 2047);
    }

    public static C1867007Sy LIZ(C1867007Sy c1867007Sy, String str) {
        return new C1867007Sy(c1867007Sy.LIZ, c1867007Sy.LIZIZ, c1867007Sy.LIZJ, c1867007Sy.LIZLLL, c1867007Sy.LJ, c1867007Sy.LJFF, c1867007Sy.LJI, c1867007Sy.LJII, c1867007Sy.LJIIIIZZ, str, c1867007Sy.LJIIJ);
    }

    public /* synthetic */ C1867007Sy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? CardStruct.IStatusCode.DEFAULT : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "", false);
    }

    public C1867007Sy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = str10;
        this.LJIIJ = z;
    }
}
