package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749060vcG {
    public static final EnumC1749060vcG CPF_FORMAT_ERROR;
    public static final EnumC1749060vcG CPF_LENGTH_ERROR;
    public static final EnumC1749060vcG FAIL_OTHER;
    public static final /* synthetic */ EnumC1749060vcG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1749060vcG SUCCESS;
    public static final EnumC1749060vcG VENDOR_VALIDATE_FAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1749060vcG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1749060vcG enumC1749060vcG = new EnumC1749060vcG("SUCCESS", 0, "success");
        SUCCESS = enumC1749060vcG;
        EnumC1749060vcG enumC1749060vcG2 = new EnumC1749060vcG("CPF_LENGTH_ERROR", 1, "cpf_length_error");
        CPF_LENGTH_ERROR = enumC1749060vcG2;
        EnumC1749060vcG enumC1749060vcG3 = new EnumC1749060vcG("CPF_FORMAT_ERROR", 2, "cpf_format_error");
        CPF_FORMAT_ERROR = enumC1749060vcG3;
        EnumC1749060vcG enumC1749060vcG4 = new EnumC1749060vcG("VENDOR_VALIDATE_FAIL", 3, "vendor_validate_fail");
        VENDOR_VALIDATE_FAIL = enumC1749060vcG4;
        EnumC1749060vcG enumC1749060vcG5 = new EnumC1749060vcG("FAIL_OTHER", 4, "fail_other");
        FAIL_OTHER = enumC1749060vcG5;
        EnumC1749060vcG[] enumC1749060vcGArr = {enumC1749060vcG, enumC1749060vcG2, enumC1749060vcG3, enumC1749060vcG4, enumC1749060vcG5};
        LLILLJJLI = enumC1749060vcGArr;
        LLILLL = new C2254308sP(enumC1749060vcGArr);
    }

    public static EnumC1749060vcG[] values() {
        return (EnumC1749060vcG[]) LLILLJJLI.clone();
    }

    public final String getFailReason() {
        return this.LL;
    }

    public static EnumC1749060vcG valueOf(String str) {
        return (EnumC1749060vcG) C08FF.LIZ(EnumC1749060vcG.class, str);
    }

    public EnumC1749060vcG(String str, int i, String str2) {
        this.LL = str2;
    }
}
