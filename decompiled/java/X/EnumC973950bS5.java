package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973950bS5 {
    public static final EnumC973950bS5 INFO_BAR;
    public static final /* synthetic */ EnumC973950bS5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC973950bS5 SWITCH_ICON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC973950bS5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC973950bS5 enumC973950bS5 = new EnumC973950bS5("SWITCH_ICON", 0, "switch_icon");
        SWITCH_ICON = enumC973950bS5;
        EnumC973950bS5 enumC973950bS52 = new EnumC973950bS5("INFO_BAR", 1, "info_bar");
        INFO_BAR = enumC973950bS52;
        EnumC973950bS5[] enumC973950bS5Arr = {enumC973950bS5, enumC973950bS52};
        LLILLJJLI = enumC973950bS5Arr;
        LLILLL = new C2254308sP(enumC973950bS5Arr);
    }

    public static EnumC973950bS5[] values() {
        return (EnumC973950bS5[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC973950bS5 valueOf(String str) {
        return (EnumC973950bS5) C08FF.LIZ(EnumC973950bS5.class, str);
    }

    public EnumC973950bS5(String str, int i, String str2) {
        this.LL = str2;
    }
}
