package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2235608pO {
    public static final EnumC2235608pO CLICK_BACK;
    public static final EnumC2235608pO CLICK_CONFIRM;
    public static final /* synthetic */ EnumC2235608pO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2235608pO SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2235608pO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2235608pO enumC2235608pO = new EnumC2235608pO("SHOW", 0, "show");
        SHOW = enumC2235608pO;
        EnumC2235608pO enumC2235608pO2 = new EnumC2235608pO("CLICK_CONFIRM", 1, "click_confirm");
        CLICK_CONFIRM = enumC2235608pO2;
        EnumC2235608pO enumC2235608pO3 = new EnumC2235608pO("CLICK_BACK", 2, "click_back");
        CLICK_BACK = enumC2235608pO3;
        EnumC2235608pO[] enumC2235608pOArr = {enumC2235608pO, enumC2235608pO2, enumC2235608pO3};
        LLILLJJLI = enumC2235608pOArr;
        LLILLL = new C2254308sP(enumC2235608pOArr);
    }

    public static EnumC2235608pO[] values() {
        return (EnumC2235608pO[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC2235608pO valueOf(String str) {
        return (EnumC2235608pO) C08FF.LIZ(EnumC2235608pO.class, str);
    }

    public EnumC2235608pO(String str, int i, String str2) {
        this.LL = str2;
    }
}
