package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235240iFW {
    public static final EnumC1235240iFW CLICK_CONTINUE;
    public static final EnumC1235240iFW GO_BACK;
    public static final /* synthetic */ EnumC1235240iFW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235240iFW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235240iFW enumC1235240iFW = new EnumC1235240iFW("CLICK_CONTINUE", 0, "click_continue");
        CLICK_CONTINUE = enumC1235240iFW;
        EnumC1235240iFW enumC1235240iFW2 = new EnumC1235240iFW("GO_BACK", 1, "go_back");
        GO_BACK = enumC1235240iFW2;
        EnumC1235240iFW[] enumC1235240iFWArr = {enumC1235240iFW, enumC1235240iFW2};
        LLILLJJLI = enumC1235240iFWArr;
        LLILLL = new C2254308sP(enumC1235240iFWArr);
    }

    public static EnumC1235240iFW[] values() {
        return (EnumC1235240iFW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235240iFW valueOf(String str) {
        return (EnumC1235240iFW) C08FF.LIZ(EnumC1235240iFW.class, str);
    }

    public EnumC1235240iFW(String str, int i, String str2) {
        this.LL = str2;
    }
}
