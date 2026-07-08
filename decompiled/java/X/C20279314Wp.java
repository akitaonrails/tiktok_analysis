package X;

/* JADX INFO: renamed from: X.14Wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20279314Wp {
    public final Long LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C20279314Wp(Integer num, Long l, String str, String str2, boolean z) {
        this.LIZ = l;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
    }

    public static C20279314Wp LIZ(C20279314Wp c20279314Wp, Long l, Integer num, String str, String str2, int i) {
        boolean z;
        String str3 = str2;
        String str4 = str;
        Integer num2 = num;
        Long l2 = l;
        if ((i & 1) != 0) {
            l2 = c20279314Wp.LIZ;
        }
        if ((i & 2) != 0) {
            num2 = c20279314Wp.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c20279314Wp.LIZJ;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str4 = c20279314Wp.LIZLLL;
        }
        if ((i & 16) != 0) {
            str3 = c20279314Wp.LJ;
        }
        c20279314Wp.getClass();
        return new C20279314Wp(num2, l2, str4, str3, z);
    }
}
