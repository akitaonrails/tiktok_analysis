package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC318740CeW {
    public static final EnumC318740CeW FLOATING;
    public static final /* synthetic */ EnumC318740CeW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC318740CeW NONE;
    public static final EnumC318740CeW TOP_BANNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC318740CeW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC318740CeW enumC318740CeW = new EnumC318740CeW("TOP_BANNER", 0, "top_banner");
        TOP_BANNER = enumC318740CeW;
        EnumC318740CeW enumC318740CeW2 = new EnumC318740CeW("FLOATING", 1, "float");
        FLOATING = enumC318740CeW2;
        EnumC318740CeW enumC318740CeW3 = new EnumC318740CeW("NONE", 2, "");
        NONE = enumC318740CeW3;
        EnumC318740CeW[] enumC318740CeWArr = {enumC318740CeW, enumC318740CeW2, enumC318740CeW3};
        LLILLJJLI = enumC318740CeWArr;
        LLILLL = new C2254308sP(enumC318740CeWArr);
    }

    public static EnumC318740CeW[] values() {
        return (EnumC318740CeW[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC318740CeW valueOf(String str) {
        return (EnumC318740CeW) C08FF.LIZ(EnumC318740CeW.class, str);
    }

    public EnumC318740CeW(String str, int i, String str2) {
        this.LL = str2;
    }
}
