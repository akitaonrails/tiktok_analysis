package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ra1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1593910ra1 {
    public static final EnumC1593910ra1 CLICK_BUBBLE;
    public static final EnumC1593910ra1 CLICK_TAB;
    public static final /* synthetic */ EnumC1593910ra1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1593910ra1 OTHER;
    public static final EnumC1593910ra1 SWITCH_TAB;
    public static final EnumC1593910ra1 WEB_TO_APP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1593910ra1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1593910ra1 enumC1593910ra1 = new EnumC1593910ra1("CLICK_TAB", 0, "click_tab");
        CLICK_TAB = enumC1593910ra1;
        EnumC1593910ra1 enumC1593910ra12 = new EnumC1593910ra1("SWITCH_TAB", 1, "switch_tab");
        SWITCH_TAB = enumC1593910ra12;
        EnumC1593910ra1 enumC1593910ra13 = new EnumC1593910ra1("CLICK_BUBBLE", 2, "click_bubble");
        CLICK_BUBBLE = enumC1593910ra13;
        EnumC1593910ra1 enumC1593910ra14 = new EnumC1593910ra1("WEB_TO_APP", 3, "webtoapp");
        WEB_TO_APP = enumC1593910ra14;
        EnumC1593910ra1 enumC1593910ra15 = new EnumC1593910ra1("OTHER", 4, "other");
        OTHER = enumC1593910ra15;
        EnumC1593910ra1[] enumC1593910ra1Arr = {enumC1593910ra1, enumC1593910ra12, enumC1593910ra13, enumC1593910ra14, enumC1593910ra15};
        LLILLJJLI = enumC1593910ra1Arr;
        LLILLL = new C2254308sP(enumC1593910ra1Arr);
    }

    public static EnumC1593910ra1[] values() {
        return (EnumC1593910ra1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1593910ra1 valueOf(String str) {
        return (EnumC1593910ra1) C08FF.LIZ(EnumC1593910ra1.class, str);
    }

    public EnumC1593910ra1(String str, int i, String str2) {
        this.LL = str2;
    }
}
