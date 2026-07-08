package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC606160Nq2 {
    public static final EnumC606160Nq2 EVENT;
    public static final /* synthetic */ EnumC606160Nq2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC606160Nq2 METHOD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC606160Nq2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC606160Nq2 enumC606160Nq2 = new EnumC606160Nq2("METHOD", 0, "method");
        METHOD = enumC606160Nq2;
        EnumC606160Nq2 enumC606160Nq22 = new EnumC606160Nq2("EVENT", 1, "event");
        EVENT = enumC606160Nq22;
        EnumC606160Nq2[] enumC606160Nq2Arr = {enumC606160Nq2, enumC606160Nq22};
        LLILLJJLI = enumC606160Nq2Arr;
        LLILLL = new C2254308sP(enumC606160Nq2Arr);
    }

    public static EnumC606160Nq2[] values() {
        return (EnumC606160Nq2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC606160Nq2 valueOf(String str) {
        return (EnumC606160Nq2) C08FF.LIZ(EnumC606160Nq2.class, str);
    }

    public EnumC606160Nq2(String str, int i, String str2) {
        this.LL = str2;
    }
}
