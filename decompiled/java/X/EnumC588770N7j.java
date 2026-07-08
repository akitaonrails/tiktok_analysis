package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588770N7j {
    public static final EnumC588770N7j ERROR_REASON;
    public static final EnumC588770N7j ERROR_STAGE;
    public static final /* synthetic */ EnumC588770N7j[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC588770N7j OPERATION_REGISTER;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC588770N7j> getEntries() {
        return LLILZ;
    }

    static {
        EnumC588770N7j enumC588770N7j = new EnumC588770N7j("ERROR_REASON", 0, 0, "error_reason");
        ERROR_REASON = enumC588770N7j;
        EnumC588770N7j enumC588770N7j2 = new EnumC588770N7j("ERROR_STAGE", 1, 1, "error_stage");
        ERROR_STAGE = enumC588770N7j2;
        EnumC588770N7j enumC588770N7j3 = new EnumC588770N7j("OPERATION_REGISTER", 2, 2, "operation_register");
        OPERATION_REGISTER = enumC588770N7j3;
        EnumC588770N7j[] enumC588770N7jArr = {enumC588770N7j, enumC588770N7j2, enumC588770N7j3};
        LLILLL = enumC588770N7jArr;
        LLILZ = new C2254308sP(enumC588770N7jArr);
    }

    public static EnumC588770N7j[] values() {
        return (EnumC588770N7j[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getReason() {
        return this.LLILLJJLI;
    }

    public static EnumC588770N7j valueOf(String str) {
        return (EnumC588770N7j) C08FF.LIZ(EnumC588770N7j.class, str);
    }

    public EnumC588770N7j(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
