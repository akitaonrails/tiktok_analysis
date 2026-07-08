package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994370bz1 {
    public static final /* synthetic */ EnumC994370bz1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC994370bz1 NAVIGATE_PAGE;
    public static final EnumC994370bz1 POPUP_SHOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC994370bz1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC994370bz1 enumC994370bz1 = new EnumC994370bz1("NAVIGATE_PAGE", 0, "navigate_page");
        NAVIGATE_PAGE = enumC994370bz1;
        EnumC994370bz1 enumC994370bz12 = new EnumC994370bz1("POPUP_SHOWN", 1, "popup_shown");
        POPUP_SHOWN = enumC994370bz12;
        EnumC994370bz1[] enumC994370bz1Arr = {enumC994370bz1, enumC994370bz12};
        LLILLJJLI = enumC994370bz1Arr;
        LLILLL = new C2254308sP(enumC994370bz1Arr);
    }

    public static EnumC994370bz1[] values() {
        return (EnumC994370bz1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC994370bz1 valueOf(String str) {
        return (EnumC994370bz1) C08FF.LIZ(EnumC994370bz1.class, str);
    }

    public EnumC994370bz1(String str, int i, String str2) {
        this.LL = str2;
    }
}
