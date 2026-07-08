package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1042620dEq {
    public static final /* synthetic */ EnumC1042620dEq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1042620dEq NORMAL;
    public static final EnumC1042620dEq REDIRECT;
    public static final EnumC1042620dEq UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1042620dEq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1042620dEq enumC1042620dEq = new EnumC1042620dEq("REDIRECT", 0, "redirect_page");
        REDIRECT = enumC1042620dEq;
        EnumC1042620dEq enumC1042620dEq2 = new EnumC1042620dEq("NORMAL", 1, "normal_page");
        NORMAL = enumC1042620dEq2;
        EnumC1042620dEq enumC1042620dEq3 = new EnumC1042620dEq("UNKNOWN", 2, "unknown_page");
        UNKNOWN = enumC1042620dEq3;
        EnumC1042620dEq[] enumC1042620dEqArr = {enumC1042620dEq, enumC1042620dEq2, enumC1042620dEq3};
        LLILLJJLI = enumC1042620dEqArr;
        LLILLL = new C2254308sP(enumC1042620dEqArr);
    }

    public static EnumC1042620dEq[] values() {
        return (EnumC1042620dEq[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1042620dEq valueOf(String str) {
        return (EnumC1042620dEq) C08FF.LIZ(EnumC1042620dEq.class, str);
    }

    public EnumC1042620dEq(String str, int i, String str2) {
        this.LL = str2;
    }
}
