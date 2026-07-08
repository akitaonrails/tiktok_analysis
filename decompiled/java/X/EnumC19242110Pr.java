package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19242110Pr {
    public static final EnumC19242110Pr FORCE_LOGIN;
    public static final /* synthetic */ EnumC19242110Pr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19242110Pr NON_LOGIN;
    public static final EnumC19242110Pr SKIPABLE;
    public static final EnumC19242110Pr SKIPABLE_AGEGATE_CONSENT;
    public static final EnumC19242110Pr SKIPABLE_CONSENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19242110Pr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19242110Pr enumC19242110Pr = new EnumC19242110Pr("NON_LOGIN", 0, 0);
        NON_LOGIN = enumC19242110Pr;
        EnumC19242110Pr enumC19242110Pr2 = new EnumC19242110Pr("FORCE_LOGIN", 1, 1);
        FORCE_LOGIN = enumC19242110Pr2;
        EnumC19242110Pr enumC19242110Pr3 = new EnumC19242110Pr("SKIPABLE", 2, 2);
        SKIPABLE = enumC19242110Pr3;
        EnumC19242110Pr enumC19242110Pr4 = new EnumC19242110Pr("SKIPABLE_AGEGATE_CONSENT", 3, 6);
        SKIPABLE_AGEGATE_CONSENT = enumC19242110Pr4;
        EnumC19242110Pr enumC19242110Pr5 = new EnumC19242110Pr("SKIPABLE_CONSENT", 4, 7);
        SKIPABLE_CONSENT = enumC19242110Pr5;
        EnumC19242110Pr[] enumC19242110PrArr = {enumC19242110Pr, enumC19242110Pr2, enumC19242110Pr3, enumC19242110Pr4, enumC19242110Pr5};
        LLILLJJLI = enumC19242110PrArr;
        LLILLL = new C2254308sP(enumC19242110PrArr);
    }

    public static EnumC19242110Pr[] values() {
        return (EnumC19242110Pr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19242110Pr valueOf(String str) {
        return (EnumC19242110Pr) C08FF.LIZ(EnumC19242110Pr.class, str);
    }

    public EnumC19242110Pr(String str, int i, int i2) {
        this.LL = i2;
    }
}
