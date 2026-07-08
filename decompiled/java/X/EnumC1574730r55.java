package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1574730r55 {
    public static final EnumC1574730r55 AWEME_PRELOAD;
    public static final EnumC1574730r55 COMPONENT_PRELOAD;
    public static final /* synthetic */ EnumC1574730r55[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1574730r55 TAB_PRELOAD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1574730r55> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1574730r55 enumC1574730r55 = new EnumC1574730r55("TAB_PRELOAD", 0, "tab_preload");
        TAB_PRELOAD = enumC1574730r55;
        EnumC1574730r55 enumC1574730r552 = new EnumC1574730r55("AWEME_PRELOAD", 1, "aweme_preload");
        AWEME_PRELOAD = enumC1574730r552;
        EnumC1574730r55 enumC1574730r553 = new EnumC1574730r55("COMPONENT_PRELOAD", 2, "component_preload");
        COMPONENT_PRELOAD = enumC1574730r553;
        EnumC1574730r55[] enumC1574730r55Arr = {enumC1574730r55, enumC1574730r552, enumC1574730r553};
        LLILLJJLI = enumC1574730r55Arr;
        LLILLL = new C2254308sP(enumC1574730r55Arr);
    }

    public static EnumC1574730r55[] values() {
        return (EnumC1574730r55[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1574730r55 valueOf(String str) {
        return (EnumC1574730r55) C08FF.LIZ(EnumC1574730r55.class, str);
    }

    public EnumC1574730r55(String str, int i, String str2) {
        this.LL = str2;
    }
}
