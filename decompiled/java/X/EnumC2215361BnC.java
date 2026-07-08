package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2215361BnC {
    public static final EnumC2215361BnC DISCARD_FAILED;
    public static final EnumC2215361BnC DISCARD_PROCESS;
    public static final EnumC2215361BnC DISCARD_SUBMIT;
    public static final EnumC2215361BnC FAILED;
    public static final /* synthetic */ EnumC2215361BnC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2215361BnC PROCESS;
    public static final EnumC2215361BnC SUBMIT;
    public static final EnumC2215361BnC SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2215361BnC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2215361BnC enumC2215361BnC = new EnumC2215361BnC("SUBMIT", 0, 1);
        SUBMIT = enumC2215361BnC;
        EnumC2215361BnC enumC2215361BnC2 = new EnumC2215361BnC("PROCESS", 1, 2);
        PROCESS = enumC2215361BnC2;
        EnumC2215361BnC enumC2215361BnC3 = new EnumC2215361BnC("SUCCESS", 2, 3);
        SUCCESS = enumC2215361BnC3;
        EnumC2215361BnC enumC2215361BnC4 = new EnumC2215361BnC("FAILED", 3, 4);
        FAILED = enumC2215361BnC4;
        EnumC2215361BnC enumC2215361BnC5 = new EnumC2215361BnC("DISCARD_SUBMIT", 4, 5);
        DISCARD_SUBMIT = enumC2215361BnC5;
        EnumC2215361BnC enumC2215361BnC6 = new EnumC2215361BnC("DISCARD_PROCESS", 5, 6);
        DISCARD_PROCESS = enumC2215361BnC6;
        EnumC2215361BnC enumC2215361BnC7 = new EnumC2215361BnC("DISCARD_FAILED", 6, 7);
        DISCARD_FAILED = enumC2215361BnC7;
        EnumC2215361BnC[] enumC2215361BnCArr = {enumC2215361BnC, enumC2215361BnC2, enumC2215361BnC3, enumC2215361BnC4, enumC2215361BnC5, enumC2215361BnC6, enumC2215361BnC7};
        LLILLJJLI = enumC2215361BnCArr;
        LLILLL = new C2254308sP(enumC2215361BnCArr);
    }

    public static EnumC2215361BnC[] values() {
        return (EnumC2215361BnC[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC2215361BnC valueOf(String str) {
        return (EnumC2215361BnC) C08FF.LIZ(EnumC2215361BnC.class, str);
    }

    public EnumC2215361BnC(String str, int i, int i2) {
        this.LL = i2;
    }
}
