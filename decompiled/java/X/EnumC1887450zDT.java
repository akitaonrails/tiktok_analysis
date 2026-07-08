package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zDT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1887450zDT {
    public static final C1887490zDX Companion;
    public static final EnumC1887450zDT DARK;
    public static final EnumC1887450zDT LIGHT;
    public static final /* synthetic */ EnumC1887450zDT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1887450zDT UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1887450zDT> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0zDX] */
    static {
        EnumC1887450zDT enumC1887450zDT = new EnumC1887450zDT("DARK", 0, "dark");
        DARK = enumC1887450zDT;
        EnumC1887450zDT enumC1887450zDT2 = new EnumC1887450zDT("LIGHT", 1, "light");
        LIGHT = enumC1887450zDT2;
        EnumC1887450zDT enumC1887450zDT3 = new EnumC1887450zDT("UNKNOWN", 2, null);
        UNKNOWN = enumC1887450zDT3;
        EnumC1887450zDT[] enumC1887450zDTArr = {enumC1887450zDT, enumC1887450zDT2, enumC1887450zDT3};
        LLILLJJLI = enumC1887450zDTArr;
        LLILLL = new C2254308sP(enumC1887450zDTArr);
        Companion = new Object() { // from class: X.0zDX
        };
    }

    public static EnumC1887450zDT[] values() {
        return (EnumC1887450zDT[]) LLILLJJLI.clone();
    }

    public final String getStyle() {
        return this.LL;
    }

    public static EnumC1887450zDT valueOf(String str) {
        return (EnumC1887450zDT) C08FF.LIZ(EnumC1887450zDT.class, str);
    }

    public EnumC1887450zDT(String str, int i, String str2) {
        this.LL = str2;
    }
}
