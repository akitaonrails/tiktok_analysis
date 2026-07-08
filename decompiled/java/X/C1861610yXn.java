package X;

/* JADX INFO: renamed from: X.0yXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861610yXn {
    public final Long LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;

    public C1861610yXn(Long l, Integer num, boolean z, String str, String str2, String str3, Integer num2) {
        this.LIZ = l;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = num2;
    }

    public static C1861610yXn LIZ(C1861610yXn c1861610yXn, Long l, Integer num, boolean z, String str, String str2, String str3, Integer num2, int i) {
        Integer num3 = num2;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        boolean z2 = z;
        Integer num4 = num;
        Long l2 = l;
        if ((i & 1) != 0) {
            l2 = c1861610yXn.LIZ;
        }
        if ((i & 2) != 0) {
            num4 = c1861610yXn.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c1861610yXn.LIZJ;
        }
        if ((i & 8) != 0) {
            str6 = c1861610yXn.LIZLLL;
        }
        if ((i & 16) != 0) {
            str5 = c1861610yXn.LJ;
        }
        if ((i & 32) != 0) {
            str4 = c1861610yXn.LJFF;
        }
        if ((i & 64) != 0) {
            num3 = c1861610yXn.LJI;
        }
        c1861610yXn.getClass();
        return new C1861610yXn(l2, num4, z2, str6, str5, str4, num3);
    }
}
