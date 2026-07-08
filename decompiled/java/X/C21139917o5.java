package X;

/* JADX INFO: renamed from: X.17o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21139917o5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Object LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public static C21139917o5 LIZ(C21139917o5 c21139917o5, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        String str11 = null;
        if ((i & 1) != 0) {
            str4 = c21139917o5.LIZ;
        } else {
            str4 = null;
        }
        if ((i & 2) != 0) {
            str10 = c21139917o5.LIZIZ;
        }
        if ((i & 4) != 0) {
            str9 = c21139917o5.LIZJ;
        }
        if ((i & 8) != 0) {
            str5 = c21139917o5.LIZLLL;
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            obj = c21139917o5.LJ;
        } else {
            obj = null;
        }
        if ((i & 32) != 0) {
            str6 = c21139917o5.LJFF;
        } else {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = c21139917o5.LJI;
        } else {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str11 = c21139917o5.LJII;
        }
        if ((i & 256) != 0) {
            str8 = c21139917o5.LJIIIIZZ;
        }
        c21139917o5.getClass();
        return new C21139917o5(str4, str10, str9, str5, obj, str6, str7, str11, str8);
    }

    public /* synthetic */ C21139917o5(String str, String str2, String str3, String str4, Object obj, String str5, String str6, String str7, int i) {
        this(str, str2, (i & 4) != 0 ? "" : str3, str4, obj, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? null : "");
    }

    public C21139917o5(String str, String str2, String str3, String str4, Object obj, String str5, String str6, String str7, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = obj;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
    }
}
