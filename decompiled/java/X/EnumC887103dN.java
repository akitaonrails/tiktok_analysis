package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC887103dN {
    public static final EnumC887103dN CANCEL;
    public static final EnumC887103dN FAIL;
    public static final /* synthetic */ EnumC887103dN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC887103dN SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC887103dN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC887103dN enumC887103dN = new EnumC887103dN("SUCCESS", 0, "success");
        SUCCESS = enumC887103dN;
        EnumC887103dN enumC887103dN2 = new EnumC887103dN("CANCEL", 1, "cancel");
        CANCEL = enumC887103dN2;
        EnumC887103dN enumC887103dN3 = new EnumC887103dN("FAIL", 2, "fail");
        FAIL = enumC887103dN3;
        EnumC887103dN[] enumC887103dNArr = {enumC887103dN, enumC887103dN2, enumC887103dN3};
        LLILLJJLI = enumC887103dNArr;
        LLILLL = new C2254308sP(enumC887103dNArr);
    }

    public static EnumC887103dN[] values() {
        return (EnumC887103dN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC887103dN valueOf(String str) {
        return (EnumC887103dN) C08FF.LIZ(EnumC887103dN.class, str);
    }

    public EnumC887103dN(String str, int i, String str2) {
        this.LL = str2;
    }
}
