package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.055z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12977055z {
    public static final /* synthetic */ EnumC12977055z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12977055z PRIORITY1;
    public static final EnumC12977055z PRIORITY2;
    public static final EnumC12977055z PRIORITY3;
    public static final EnumC12977055z PRIORITY4;
    public static final EnumC12977055z PRIORITY5;
    public static final EnumC12977055z PRIORITY_MUST_SHOW;
    public int LL;

    public static InterfaceC2044707zh<EnumC12977055z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC12977055z enumC12977055z = new EnumC12977055z("PRIORITY_MUST_SHOW", 0, 0);
        PRIORITY_MUST_SHOW = enumC12977055z;
        EnumC12977055z enumC12977055z2 = new EnumC12977055z("PRIORITY1", 1, 1);
        PRIORITY1 = enumC12977055z2;
        EnumC12977055z enumC12977055z3 = new EnumC12977055z("PRIORITY2", 2, 2);
        PRIORITY2 = enumC12977055z3;
        EnumC12977055z enumC12977055z4 = new EnumC12977055z("PRIORITY3", 3, 3);
        PRIORITY3 = enumC12977055z4;
        EnumC12977055z enumC12977055z5 = new EnumC12977055z("PRIORITY4", 4, 4);
        PRIORITY4 = enumC12977055z5;
        EnumC12977055z enumC12977055z6 = new EnumC12977055z("PRIORITY5", 5, 5);
        PRIORITY5 = enumC12977055z6;
        EnumC12977055z[] enumC12977055zArr = {enumC12977055z, enumC12977055z2, enumC12977055z3, enumC12977055z4, enumC12977055z5, enumC12977055z6};
        LLILLJJLI = enumC12977055zArr;
        LLILLL = new C2254308sP(enumC12977055zArr);
    }

    public static EnumC12977055z[] values() {
        return (EnumC12977055z[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC12977055z valueOf(String str) {
        return (EnumC12977055z) C08FF.LIZ(EnumC12977055z.class, str);
    }

    public final void setPriority(int i) {
        this.LL = i;
    }

    public EnumC12977055z(String str, int i, int i2) {
        this.LL = i2;
    }
}
