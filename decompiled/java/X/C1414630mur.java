package X;

/* JADX INFO: renamed from: X.0mur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414630mur {
    public final Long LIZ;
    public final Long LIZIZ;
    public final EnumC1412690mrj LIZJ;
    public final Long LIZLLL;
    public final Integer LJ;
    public final Long LJFF;
    public final String LJI;
    public final Integer LJII;

    public C1414630mur() {
        this(0);
    }

    public /* synthetic */ C1414630mur(int i) {
        this(null, null, null, null, null, null, null, null);
    }

    public C1414630mur(Long l, Long l2, EnumC1412690mrj enumC1412690mrj, Long l3, Integer num, Long l4, String str, Integer num2) {
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = enumC1412690mrj;
        this.LIZLLL = l3;
        this.LJ = num;
        this.LJFF = l4;
        this.LJI = str;
        this.LJII = num2;
    }

    public static C1414630mur LIZ(C1414630mur c1414630mur, Long l, Long l2, EnumC1412690mrj enumC1412690mrj, Long l3, Integer num, Long l4, String str, Integer num2, int i) {
        Integer num3 = num2;
        String str2 = str;
        Long l5 = l4;
        Integer num4 = num;
        Long l6 = l3;
        EnumC1412690mrj enumC1412690mrj2 = enumC1412690mrj;
        Long l7 = l2;
        Long l8 = l;
        if ((i & 1) != 0) {
            l8 = c1414630mur.LIZ;
        }
        if ((i & 2) != 0) {
            l7 = c1414630mur.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC1412690mrj2 = c1414630mur.LIZJ;
        }
        if ((i & 8) != 0) {
            l6 = c1414630mur.LIZLLL;
        }
        if ((i & 16) != 0) {
            num4 = c1414630mur.LJ;
        }
        if ((i & 32) != 0) {
            l5 = c1414630mur.LJFF;
        }
        if ((i & 64) != 0) {
            str2 = c1414630mur.LJI;
        }
        if ((i & 128) != 0) {
            num3 = c1414630mur.LJII;
        }
        return new C1414630mur(l8, l7, enumC1412690mrj2, l6, num4, l5, str2, num3);
    }
}
