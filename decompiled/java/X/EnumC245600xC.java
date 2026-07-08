package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC245600xC {
    public static final EnumC245600xC CLICK_TO_DISAPPEAR;
    public static final EnumC245600xC CLICK_TO_ROUTE;
    public static final /* synthetic */ EnumC245600xC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC245600xC SHOW_ONLY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC245600xC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC245600xC enumC245600xC = new EnumC245600xC("SHOW_ONLY", 0, "show_only");
        SHOW_ONLY = enumC245600xC;
        EnumC245600xC enumC245600xC2 = new EnumC245600xC("CLICK_TO_DISAPPEAR", 1, "click_to_disappear");
        CLICK_TO_DISAPPEAR = enumC245600xC2;
        EnumC245600xC enumC245600xC3 = new EnumC245600xC("CLICK_TO_ROUTE", 2, "click_to_route");
        CLICK_TO_ROUTE = enumC245600xC3;
        EnumC245600xC[] enumC245600xCArr = {enumC245600xC, enumC245600xC2, enumC245600xC3};
        LLILLJJLI = enumC245600xCArr;
        LLILLL = new C2254308sP(enumC245600xCArr);
    }

    public static EnumC245600xC[] values() {
        return (EnumC245600xC[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC245600xC valueOf(String str) {
        return (EnumC245600xC) C08FF.LIZ(EnumC245600xC.class, str);
    }

    public EnumC245600xC(String str, int i, String str2) {
        this.LL = str2;
    }
}
