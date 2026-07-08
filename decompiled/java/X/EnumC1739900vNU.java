package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1739900vNU {
    public static final EnumC1739900vNU EXECUTE_ERROR;
    public static final /* synthetic */ EnumC1739900vNU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1739900vNU REQUEST_FAILED;
    public static final EnumC1739900vNU REQUEST_SUCCESS;
    public static final EnumC1739900vNU REQUEST_TIMEOUT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1739900vNU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1739900vNU enumC1739900vNU = new EnumC1739900vNU("REQUEST_SUCCESS", 0, 1);
        REQUEST_SUCCESS = enumC1739900vNU;
        EnumC1739900vNU enumC1739900vNU2 = new EnumC1739900vNU("REQUEST_FAILED", 1, 0);
        REQUEST_FAILED = enumC1739900vNU2;
        EnumC1739900vNU enumC1739900vNU3 = new EnumC1739900vNU("REQUEST_TIMEOUT", 2, -1);
        REQUEST_TIMEOUT = enumC1739900vNU3;
        EnumC1739900vNU enumC1739900vNU4 = new EnumC1739900vNU("EXECUTE_ERROR", 3, -2);
        EXECUTE_ERROR = enumC1739900vNU4;
        EnumC1739900vNU[] enumC1739900vNUArr = {enumC1739900vNU, enumC1739900vNU2, enumC1739900vNU3, enumC1739900vNU4};
        LLILLJJLI = enumC1739900vNUArr;
        LLILLL = new C2254308sP(enumC1739900vNUArr);
    }

    public static EnumC1739900vNU[] values() {
        return (EnumC1739900vNU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1739900vNU valueOf(String str) {
        return (EnumC1739900vNU) C08FF.LIZ(EnumC1739900vNU.class, str);
    }

    public EnumC1739900vNU(String str, int i, int i2) {
        this.LL = i2;
    }
}
