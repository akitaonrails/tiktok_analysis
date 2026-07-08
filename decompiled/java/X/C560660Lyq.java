package X;

/* JADX INFO: renamed from: X.0Lyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560660Lyq {
    public final EnumC371580EhY LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final Integer LJFF;
    public final boolean LJI;

    public C560660Lyq() {
        this(0);
    }

    public /* synthetic */ C560660Lyq(int i) {
        this(EnumC371580EhY.HIDE, false, 0.0f, null, null, null, false);
    }

    public C560660Lyq(EnumC371580EhY enumC371580EhY, boolean z, float f, String str, Boolean bool, Integer num, boolean z2) {
        this.LIZ = enumC371580EhY;
        this.LIZIZ = z;
        this.LIZJ = f;
        this.LIZLLL = str;
        this.LJ = bool;
        this.LJFF = num;
        this.LJI = z2;
    }

    public static C560660Lyq LIZ(C560660Lyq c560660Lyq, EnumC371580EhY enumC371580EhY, boolean z, float f, String str, Boolean bool, Integer num, boolean z2, int i) {
        boolean z3 = z2;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str2 = str;
        float f2 = f;
        boolean z4 = z;
        EnumC371580EhY enumC371580EhY2 = enumC371580EhY;
        if ((i & 1) != 0) {
            enumC371580EhY2 = c560660Lyq.LIZ;
        }
        if ((i & 2) != 0) {
            z4 = c560660Lyq.LIZIZ;
        }
        if ((i & 4) != 0) {
            f2 = c560660Lyq.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c560660Lyq.LIZLLL;
        }
        if ((i & 16) != 0) {
            bool2 = c560660Lyq.LJ;
        }
        if ((i & 32) != 0) {
            num2 = c560660Lyq.LJFF;
        }
        if ((i & 64) != 0) {
            z3 = c560660Lyq.LJI;
        }
        c560660Lyq.getClass();
        return new C560660Lyq(enumC371580EhY2, z4, f2, str2, bool2, num2, z3);
    }
}
