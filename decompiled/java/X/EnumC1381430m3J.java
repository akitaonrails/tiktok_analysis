package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1381430m3J {
    public static final EnumC1381430m3J FUNCTIONAL;
    public static final /* synthetic */ EnumC1381430m3J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1381430m3J ORDER;
    public static final EnumC1381430m3J VIOLATION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1381430m3J> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1381430m3J enumC1381430m3J = new EnumC1381430m3J("VIOLATION", 0, "violation");
        VIOLATION = enumC1381430m3J;
        EnumC1381430m3J enumC1381430m3J2 = new EnumC1381430m3J("FUNCTIONAL", 1, "functional");
        FUNCTIONAL = enumC1381430m3J2;
        EnumC1381430m3J enumC1381430m3J3 = new EnumC1381430m3J("ORDER", 2, "order");
        ORDER = enumC1381430m3J3;
        EnumC1381430m3J[] enumC1381430m3JArr = {enumC1381430m3J, enumC1381430m3J2, enumC1381430m3J3};
        LLILLJJLI = enumC1381430m3JArr;
        LLILLL = new C2254308sP(enumC1381430m3JArr);
    }

    public static EnumC1381430m3J[] values() {
        return (EnumC1381430m3J[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1381430m3J valueOf(String str) {
        return (EnumC1381430m3J) C08FF.LIZ(EnumC1381430m3J.class, str);
    }

    public EnumC1381430m3J(String str, int i, String str2) {
        this.LL = str2;
    }
}
