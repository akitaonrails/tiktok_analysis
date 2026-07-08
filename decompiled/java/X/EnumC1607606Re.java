package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1607606Re {
    public static final EnumC1607606Re EXTERNAL;
    public static final EnumC1607606Re INTERNAL;
    public static final /* synthetic */ EnumC1607606Re[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1607606Re> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1607606Re enumC1607606Re = new EnumC1607606Re("INTERNAL", 0, "internal");
        INTERNAL = enumC1607606Re;
        EnumC1607606Re enumC1607606Re2 = new EnumC1607606Re("EXTERNAL", 1, "external");
        EXTERNAL = enumC1607606Re2;
        EnumC1607606Re[] enumC1607606ReArr = {enumC1607606Re, enumC1607606Re2};
        LLILLJJLI = enumC1607606ReArr;
        LLILLL = new C2254308sP(enumC1607606ReArr);
    }

    public static EnumC1607606Re[] values() {
        return (EnumC1607606Re[]) LLILLJJLI.clone();
    }

    public final String getLocation() {
        return this.LL;
    }

    public static EnumC1607606Re valueOf(String str) {
        return (EnumC1607606Re) C08FF.LIZ(EnumC1607606Re.class, str);
    }

    public EnumC1607606Re(String str, int i, String str2) {
        this.LL = str2;
    }
}
