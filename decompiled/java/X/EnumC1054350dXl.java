package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1054350dXl {
    public static final EnumC1054350dXl AUTHENTICATION_ERROR;
    public static final EnumC1054350dXl CHECKOUT_ERROR;
    public static final EnumC1054350dXl CUSTOM_ERROR;
    public static final EnumC1054350dXl DEFAULTS_ERROR;
    public static final EnumC1054350dXl INTERNAL_ERROR;
    public static final /* synthetic */ EnumC1054350dXl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1054350dXl UNRECOVERABLE_ERROR;
    public static final EnumC1054350dXl VAULTED_PAYMENT_ERROR;
    public static final EnumC1054350dXl VIOLATION_ERROR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1054350dXl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1054350dXl enumC1054350dXl = new EnumC1054350dXl("CUSTOM_ERROR", 0, 0);
        CUSTOM_ERROR = enumC1054350dXl;
        EnumC1054350dXl enumC1054350dXl2 = new EnumC1054350dXl("INTERNAL_ERROR", 1, 1);
        INTERNAL_ERROR = enumC1054350dXl2;
        EnumC1054350dXl enumC1054350dXl3 = new EnumC1054350dXl("VIOLATION_ERROR", 2, 2);
        VIOLATION_ERROR = enumC1054350dXl3;
        EnumC1054350dXl enumC1054350dXl4 = new EnumC1054350dXl("CHECKOUT_ERROR", 3, 3);
        CHECKOUT_ERROR = enumC1054350dXl4;
        EnumC1054350dXl enumC1054350dXl5 = new EnumC1054350dXl("VAULTED_PAYMENT_ERROR", 4, 4);
        VAULTED_PAYMENT_ERROR = enumC1054350dXl5;
        EnumC1054350dXl enumC1054350dXl6 = new EnumC1054350dXl("DEFAULTS_ERROR", 5, 5);
        DEFAULTS_ERROR = enumC1054350dXl6;
        EnumC1054350dXl enumC1054350dXl7 = new EnumC1054350dXl("AUTHENTICATION_ERROR", 6, 6);
        AUTHENTICATION_ERROR = enumC1054350dXl7;
        EnumC1054350dXl enumC1054350dXl8 = new EnumC1054350dXl("UNRECOVERABLE_ERROR", 7, 7);
        UNRECOVERABLE_ERROR = enumC1054350dXl8;
        EnumC1054350dXl[] enumC1054350dXlArr = {enumC1054350dXl, enumC1054350dXl2, enumC1054350dXl3, enumC1054350dXl4, enumC1054350dXl5, enumC1054350dXl6, enumC1054350dXl7, enumC1054350dXl8};
        LLILLJJLI = enumC1054350dXlArr;
        LLILLL = new C2254308sP(enumC1054350dXlArr);
    }

    public static EnumC1054350dXl[] values() {
        return (EnumC1054350dXl[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1054350dXl valueOf(String str) {
        return (EnumC1054350dXl) C08FF.LIZ(EnumC1054350dXl.class, str);
    }

    public EnumC1054350dXl(String str, int i, int i2) {
        this.LL = i2;
    }
}
