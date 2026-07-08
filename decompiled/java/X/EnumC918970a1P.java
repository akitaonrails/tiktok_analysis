package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918970a1P {
    public static final EnumC918970a1P FLOATING;
    public static final EnumC918970a1P FLOATING_FIX;
    public static final EnumC918970a1P GRID;
    public static final EnumC918970a1P GRID_FIX;
    public static final /* synthetic */ EnumC918970a1P[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC918970a1P NORMAL;
    public String LL;

    public static InterfaceC2044707zh<EnumC918970a1P> getEntries() {
        return LLILLL;
    }

    static {
        EnumC918970a1P enumC918970a1P = new EnumC918970a1P("FLOATING_FIX", 0, "float_fix");
        FLOATING_FIX = enumC918970a1P;
        EnumC918970a1P enumC918970a1P2 = new EnumC918970a1P("FLOATING", 1, "float");
        FLOATING = enumC918970a1P2;
        EnumC918970a1P enumC918970a1P3 = new EnumC918970a1P("GRID_FIX", 2, "grid_fix");
        GRID_FIX = enumC918970a1P3;
        EnumC918970a1P enumC918970a1P4 = new EnumC918970a1P("GRID", 3, "grid");
        GRID = enumC918970a1P4;
        EnumC918970a1P enumC918970a1P5 = new EnumC918970a1P("NORMAL", 4, "normal");
        NORMAL = enumC918970a1P5;
        EnumC918970a1P[] enumC918970a1PArr = {enumC918970a1P, enumC918970a1P2, enumC918970a1P3, enumC918970a1P4, enumC918970a1P5};
        LLILLJJLI = enumC918970a1PArr;
        LLILLL = new C2254308sP(enumC918970a1PArr);
    }

    public static EnumC918970a1P[] values() {
        return (EnumC918970a1P[]) LLILLJJLI.clone();
    }

    public final String getStrVal() {
        return this.LL;
    }

    public static EnumC918970a1P valueOf(String str) {
        return (EnumC918970a1P) C08FF.LIZ(EnumC918970a1P.class, str);
    }

    public final void setStrVal(String str) {
        this.LL = str;
    }

    public EnumC918970a1P(String str, int i, String str2) {
        this.LL = str2;
    }
}
