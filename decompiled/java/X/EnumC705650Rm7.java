package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC705650Rm7 {
    public static final C705670Rm9 Companion;
    public static final EnumC705650Rm7 FAILED;
    public static final /* synthetic */ EnumC705650Rm7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC705650Rm7 PENDING;
    public static final EnumC705650Rm7 SUCCESS;
    public static final EnumC705650Rm7 TNS_VIOLATION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC705650Rm7> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Rm9] */
    static {
        EnumC705650Rm7 enumC705650Rm7 = new EnumC705650Rm7("SUCCESS", 0, "domain_accepted");
        SUCCESS = enumC705650Rm7;
        EnumC705650Rm7 enumC705650Rm72 = new EnumC705650Rm7("FAILED", 1, "domain_rejected");
        FAILED = enumC705650Rm72;
        EnumC705650Rm7 enumC705650Rm73 = new EnumC705650Rm7("PENDING", 2, "domain_pending");
        PENDING = enumC705650Rm73;
        EnumC705650Rm7 enumC705650Rm74 = new EnumC705650Rm7("TNS_VIOLATION", 3, "tns_violation");
        TNS_VIOLATION = enumC705650Rm74;
        EnumC705650Rm7[] enumC705650Rm7Arr = {enumC705650Rm7, enumC705650Rm72, enumC705650Rm73, enumC705650Rm74};
        LLILLJJLI = enumC705650Rm7Arr;
        LLILLL = new C2254308sP(enumC705650Rm7Arr);
        Companion = new Object() { // from class: X.0Rm9
        };
    }

    public static EnumC705650Rm7[] values() {
        return (EnumC705650Rm7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC705650Rm7 valueOf(String str) {
        return (EnumC705650Rm7) C08FF.LIZ(EnumC705650Rm7.class, str);
    }

    public EnumC705650Rm7(String str, int i, String str2) {
        this.LL = str2;
    }
}
