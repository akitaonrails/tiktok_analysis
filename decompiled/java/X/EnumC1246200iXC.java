package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1246200iXC {
    public static final EnumC1246200iXC BANNER;
    public static final EnumC1246200iXC BUTTON;
    public static final EnumC1246200iXC CLOSE_X;
    public static final /* synthetic */ EnumC1246200iXC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1246200iXC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1246200iXC enumC1246200iXC = new EnumC1246200iXC("BANNER", 0, "click_banner");
        BANNER = enumC1246200iXC;
        EnumC1246200iXC enumC1246200iXC2 = new EnumC1246200iXC("BUTTON", 1, "click_button");
        BUTTON = enumC1246200iXC2;
        EnumC1246200iXC enumC1246200iXC3 = new EnumC1246200iXC("CLOSE_X", 2, "close_x");
        CLOSE_X = enumC1246200iXC3;
        EnumC1246200iXC[] enumC1246200iXCArr = {enumC1246200iXC, enumC1246200iXC2, enumC1246200iXC3};
        LLILLJJLI = enumC1246200iXCArr;
        LLILLL = new C2254308sP(enumC1246200iXCArr);
    }

    public static EnumC1246200iXC[] values() {
        return (EnumC1246200iXC[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1246200iXC valueOf(String str) {
        return (EnumC1246200iXC) C08FF.LIZ(EnumC1246200iXC.class, str);
    }

    public EnumC1246200iXC(String str, int i, String str2) {
        this.LL = str2;
    }
}
