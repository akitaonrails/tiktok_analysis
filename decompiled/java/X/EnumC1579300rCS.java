package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1579300rCS {
    public static final EnumC1579300rCS CLICK_CREATE;
    public static final EnumC1579300rCS CLICK_RESET;
    public static final EnumC1579300rCS CLICK_RETRY;
    public static final /* synthetic */ EnumC1579300rCS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1579300rCS SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1579300rCS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1579300rCS enumC1579300rCS = new EnumC1579300rCS("SHOW", 0, "show");
        SHOW = enumC1579300rCS;
        EnumC1579300rCS enumC1579300rCS2 = new EnumC1579300rCS("CLICK_RESET", 1, "click_reset");
        CLICK_RESET = enumC1579300rCS2;
        EnumC1579300rCS enumC1579300rCS3 = new EnumC1579300rCS("CLICK_CREATE", 2, "click_create");
        CLICK_CREATE = enumC1579300rCS3;
        EnumC1579300rCS enumC1579300rCS4 = new EnumC1579300rCS("CLICK_RETRY", 3, "click_retry");
        CLICK_RETRY = enumC1579300rCS4;
        EnumC1579300rCS[] enumC1579300rCSArr = {enumC1579300rCS, enumC1579300rCS2, enumC1579300rCS3, enumC1579300rCS4};
        LLILLJJLI = enumC1579300rCSArr;
        LLILLL = new C2254308sP(enumC1579300rCSArr);
    }

    public static EnumC1579300rCS[] values() {
        return (EnumC1579300rCS[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC1579300rCS valueOf(String str) {
        return (EnumC1579300rCS) C08FF.LIZ(EnumC1579300rCS.class, str);
    }

    public EnumC1579300rCS(String str, int i, String str2) {
        this.LL = str2;
    }
}
