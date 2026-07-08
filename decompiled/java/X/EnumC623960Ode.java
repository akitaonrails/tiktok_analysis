package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ode, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC623960Ode {
    public static final /* synthetic */ EnumC623960Ode[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC623960Ode STATUS_CLOSED;
    public static final EnumC623960Ode STATUS_COMPLETED;
    public static final EnumC623960Ode STATUS_IN_PROGRESS;
    public static final EnumC623960Ode STATUS_PENDING;
    public static final EnumC623960Ode STATUS_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC623960Ode> getEntries() {
        return LLILLL;
    }

    static {
        EnumC623960Ode enumC623960Ode = new EnumC623960Ode("STATUS_UNKNOWN", 0, 0);
        STATUS_UNKNOWN = enumC623960Ode;
        EnumC623960Ode enumC623960Ode2 = new EnumC623960Ode("STATUS_PENDING", 1, 1);
        STATUS_PENDING = enumC623960Ode2;
        EnumC623960Ode enumC623960Ode3 = new EnumC623960Ode("STATUS_IN_PROGRESS", 2, 2);
        STATUS_IN_PROGRESS = enumC623960Ode3;
        EnumC623960Ode enumC623960Ode4 = new EnumC623960Ode("STATUS_COMPLETED", 3, 3);
        STATUS_COMPLETED = enumC623960Ode4;
        EnumC623960Ode enumC623960Ode5 = new EnumC623960Ode("STATUS_CLOSED", 4, 4);
        STATUS_CLOSED = enumC623960Ode5;
        EnumC623960Ode[] enumC623960OdeArr = {enumC623960Ode, enumC623960Ode2, enumC623960Ode3, enumC623960Ode4, enumC623960Ode5};
        LLILLJJLI = enumC623960OdeArr;
        LLILLL = new C2254308sP(enumC623960OdeArr);
    }

    public static EnumC623960Ode[] values() {
        return (EnumC623960Ode[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC623960Ode valueOf(String str) {
        return (EnumC623960Ode) C08FF.LIZ(EnumC623960Ode.class, str);
    }

    public EnumC623960Ode(String str, int i, int i2) {
        this.LL = i2;
    }
}
