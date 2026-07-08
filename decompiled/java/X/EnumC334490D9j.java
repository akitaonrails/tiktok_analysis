package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC334490D9j {
    public static final /* synthetic */ EnumC334490D9j[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC334490D9j MISSING_ADDRESS;
    public static final EnumC334490D9j MISSING_CHECKOUT_ID;
    public static final EnumC334490D9j MISSING_INTENT;
    public static final EnumC334490D9j MISSING_PAYMENT_REFERENCE;
    public static final EnumC334490D9j PAGE_BUSY;
    public static final EnumC334490D9j PAYMENT_NOT_READY;

    public static InterfaceC2044707zh<EnumC334490D9j> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC334490D9j enumC334490D9j = new EnumC334490D9j("PAGE_BUSY", 0);
        PAGE_BUSY = enumC334490D9j;
        EnumC334490D9j enumC334490D9j2 = new EnumC334490D9j("MISSING_INTENT", 1);
        MISSING_INTENT = enumC334490D9j2;
        EnumC334490D9j enumC334490D9j3 = new EnumC334490D9j("MISSING_ADDRESS", 2);
        MISSING_ADDRESS = enumC334490D9j3;
        EnumC334490D9j enumC334490D9j4 = new EnumC334490D9j("MISSING_CHECKOUT_ID", 3);
        MISSING_CHECKOUT_ID = enumC334490D9j4;
        EnumC334490D9j enumC334490D9j5 = new EnumC334490D9j("PAYMENT_NOT_READY", 4);
        PAYMENT_NOT_READY = enumC334490D9j5;
        EnumC334490D9j enumC334490D9j6 = new EnumC334490D9j("MISSING_PAYMENT_REFERENCE", 5);
        MISSING_PAYMENT_REFERENCE = enumC334490D9j6;
        EnumC334490D9j[] enumC334490D9jArr = {enumC334490D9j, enumC334490D9j2, enumC334490D9j3, enumC334490D9j4, enumC334490D9j5, enumC334490D9j6};
        LL = enumC334490D9jArr;
        LLILLJJLI = new C2254308sP(enumC334490D9jArr);
    }

    public static EnumC334490D9j[] values() {
        return (EnumC334490D9j[]) LL.clone();
    }

    public static EnumC334490D9j valueOf(String str) {
        return (EnumC334490D9j) C08FF.LIZ(EnumC334490D9j.class, str);
    }

    public EnumC334490D9j(String str, int i) {
    }
}
