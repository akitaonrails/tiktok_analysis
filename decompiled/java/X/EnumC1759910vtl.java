package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759910vtl {
    public static final EnumC1759910vtl COMPONENT_BUTTON;
    public static final EnumC1759910vtl COMPONENT_COUNTDOWN;
    public static final EnumC1759910vtl COMPONENT_ICON;
    public static final EnumC1759910vtl COMPONENT_TEXT;
    public static final EnumC1759910vtl COMPONENT_THUMBNAIL;
    public static final /* synthetic */ EnumC1759910vtl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1759910vtl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1759910vtl enumC1759910vtl = new EnumC1759910vtl("COMPONENT_ICON", 0, 1);
        COMPONENT_ICON = enumC1759910vtl;
        EnumC1759910vtl enumC1759910vtl2 = new EnumC1759910vtl("COMPONENT_TEXT", 1, 2);
        COMPONENT_TEXT = enumC1759910vtl2;
        EnumC1759910vtl enumC1759910vtl3 = new EnumC1759910vtl("COMPONENT_BUTTON", 2, 3);
        COMPONENT_BUTTON = enumC1759910vtl3;
        EnumC1759910vtl enumC1759910vtl4 = new EnumC1759910vtl("COMPONENT_COUNTDOWN", 3, 4);
        COMPONENT_COUNTDOWN = enumC1759910vtl4;
        EnumC1759910vtl enumC1759910vtl5 = new EnumC1759910vtl("COMPONENT_THUMBNAIL", 4, 5);
        COMPONENT_THUMBNAIL = enumC1759910vtl5;
        EnumC1759910vtl[] enumC1759910vtlArr = {enumC1759910vtl, enumC1759910vtl2, enumC1759910vtl3, enumC1759910vtl4, enumC1759910vtl5};
        LLILLJJLI = enumC1759910vtlArr;
        LLILLL = new C2254308sP(enumC1759910vtlArr);
    }

    public static EnumC1759910vtl[] values() {
        return (EnumC1759910vtl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759910vtl valueOf(String str) {
        return (EnumC1759910vtl) C08FF.LIZ(EnumC1759910vtl.class, str);
    }

    public EnumC1759910vtl(String str, int i, int i2) {
        this.LL = i2;
    }
}
