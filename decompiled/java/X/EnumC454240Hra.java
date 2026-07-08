package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454240Hra {
    public static final EnumC454240Hra FAIL;
    public static final /* synthetic */ EnumC454240Hra[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454240Hra SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC454240Hra> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454240Hra enumC454240Hra = new EnumC454240Hra("SUCCESS", 0, "success");
        SUCCESS = enumC454240Hra;
        EnumC454240Hra enumC454240Hra2 = new EnumC454240Hra("FAIL", 1, "fail");
        FAIL = enumC454240Hra2;
        EnumC454240Hra[] enumC454240HraArr = {enumC454240Hra, enumC454240Hra2};
        LLILLJJLI = enumC454240HraArr;
        LLILLL = new C2254308sP(enumC454240HraArr);
    }

    public static EnumC454240Hra[] values() {
        return (EnumC454240Hra[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC454240Hra valueOf(String str) {
        return (EnumC454240Hra) C08FF.LIZ(EnumC454240Hra.class, str);
    }

    public EnumC454240Hra(String str, int i, String str2) {
        this.LL = str2;
    }
}
