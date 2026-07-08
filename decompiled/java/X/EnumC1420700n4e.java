package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1420700n4e {
    public static final EnumC1420700n4e BOTTOM_BUTTON;
    public static final EnumC1420700n4e FEATURE_LIST;
    public static final /* synthetic */ EnumC1420700n4e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1420700n4e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1420700n4e enumC1420700n4e = new EnumC1420700n4e("FEATURE_LIST", 0, "feature_list");
        FEATURE_LIST = enumC1420700n4e;
        EnumC1420700n4e enumC1420700n4e2 = new EnumC1420700n4e("BOTTOM_BUTTON", 1, "bottom_button");
        BOTTOM_BUTTON = enumC1420700n4e2;
        EnumC1420700n4e[] enumC1420700n4eArr = {enumC1420700n4e, enumC1420700n4e2};
        LLILLJJLI = enumC1420700n4eArr;
        LLILLL = new C2254308sP(enumC1420700n4eArr);
    }

    public static EnumC1420700n4e[] values() {
        return (EnumC1420700n4e[]) LLILLJJLI.clone();
    }

    public final String getLogValue() {
        return this.LL;
    }

    public static EnumC1420700n4e valueOf(String str) {
        return (EnumC1420700n4e) C08FF.LIZ(EnumC1420700n4e.class, str);
    }

    public EnumC1420700n4e(String str, int i, String str2) {
        this.LL = str2;
    }
}
