package X;

import java.util.List;

/* JADX INFO: renamed from: X.0aM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931750aM1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public String LJII;
    public final List<String> LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C931750aM1(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, int i) {
        String str8;
        String str9;
        List list2 = list;
        String str10 = str5;
        if ((i & 16) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        if ((i & 32) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        this(str, str2, str3, str4, str8, str9, (i & 64) != 0 ? "" : null, (i & 128) != 0 ? "" : str10, (i & 256) != 0 ? C13BV.INSTANCE : list2, (i & 512) == 0 ? str6 : "", str7);
    }

    public C931750aM1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = list;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
    }
}
