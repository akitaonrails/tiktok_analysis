package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993300bxI {
    public static final EnumC993300bxI FAILED;
    public static final /* synthetic */ EnumC993300bxI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993300bxI NOT_INIT;
    public static final EnumC993300bxI SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993300bxI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993300bxI enumC993300bxI = new EnumC993300bxI("NOT_INIT", 0, -1);
        NOT_INIT = enumC993300bxI;
        EnumC993300bxI enumC993300bxI2 = new EnumC993300bxI("FAILED", 1, 0);
        FAILED = enumC993300bxI2;
        EnumC993300bxI enumC993300bxI3 = new EnumC993300bxI("SUCCESS", 2, 1);
        SUCCESS = enumC993300bxI3;
        EnumC993300bxI[] enumC993300bxIArr = {enumC993300bxI, enumC993300bxI2, enumC993300bxI3};
        LLILLJJLI = enumC993300bxIArr;
        LLILLL = new C2254308sP(enumC993300bxIArr);
    }

    public static EnumC993300bxI[] values() {
        return (EnumC993300bxI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993300bxI valueOf(String str) {
        return (EnumC993300bxI) C08FF.LIZ(EnumC993300bxI.class, str);
    }

    public EnumC993300bxI(String str, int i, int i2) {
        this.LL = i2;
    }
}
