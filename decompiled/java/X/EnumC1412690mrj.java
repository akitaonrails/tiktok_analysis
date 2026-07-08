package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mrj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1412690mrj {
    public static final EnumC1412690mrj AUTO_SHOW;
    public static final EnumC1412690mrj BOTTOM_BUTTON;
    public static final /* synthetic */ EnumC1412690mrj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1412690mrj PAGE_SWIPE;
    public static final EnumC1412690mrj UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1412690mrj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1412690mrj enumC1412690mrj = new EnumC1412690mrj("AUTO_SHOW", 0, "auto_show");
        AUTO_SHOW = enumC1412690mrj;
        EnumC1412690mrj enumC1412690mrj2 = new EnumC1412690mrj("PAGE_SWIPE", 1, "page_swipe");
        PAGE_SWIPE = enumC1412690mrj2;
        EnumC1412690mrj enumC1412690mrj3 = new EnumC1412690mrj("BOTTOM_BUTTON", 2, "bottom_button");
        BOTTOM_BUTTON = enumC1412690mrj3;
        EnumC1412690mrj enumC1412690mrj4 = new EnumC1412690mrj("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC1412690mrj4;
        EnumC1412690mrj[] enumC1412690mrjArr = {enumC1412690mrj, enumC1412690mrj2, enumC1412690mrj3, enumC1412690mrj4};
        LLILLJJLI = enumC1412690mrjArr;
        LLILLL = new C2254308sP(enumC1412690mrjArr);
    }

    public static EnumC1412690mrj[] values() {
        return (EnumC1412690mrj[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1412690mrj valueOf(String str) {
        return (EnumC1412690mrj) C08FF.LIZ(EnumC1412690mrj.class, str);
    }

    public EnumC1412690mrj(String str, int i, String str2) {
        this.LL = str2;
    }
}
