package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1802790x0v {
    public static final EnumC1802790x0v CANCEL_PAYMENT;
    public static final EnumC1802790x0v EXIT_RECHARGE_PANEL;
    public static final /* synthetic */ EnumC1802790x0v[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1802790x0v UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1802790x0v> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1802790x0v enumC1802790x0v = new EnumC1802790x0v("EXIT_RECHARGE_PANEL", 0, 0);
        EXIT_RECHARGE_PANEL = enumC1802790x0v;
        EnumC1802790x0v enumC1802790x0v2 = new EnumC1802790x0v("CANCEL_PAYMENT", 1, 1);
        CANCEL_PAYMENT = enumC1802790x0v2;
        EnumC1802790x0v enumC1802790x0v3 = new EnumC1802790x0v("UNKNOWN", 2, -1);
        UNKNOWN = enumC1802790x0v3;
        EnumC1802790x0v[] enumC1802790x0vArr = {enumC1802790x0v, enumC1802790x0v2, enumC1802790x0v3};
        LLILLJJLI = enumC1802790x0vArr;
        LLILLL = new C2254308sP(enumC1802790x0vArr);
    }

    public static EnumC1802790x0v[] values() {
        return (EnumC1802790x0v[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1802790x0v valueOf(String str) {
        return (EnumC1802790x0v) C08FF.LIZ(EnumC1802790x0v.class, str);
    }

    public EnumC1802790x0v(String str, int i, int i2) {
        this.LL = i2;
    }
}
