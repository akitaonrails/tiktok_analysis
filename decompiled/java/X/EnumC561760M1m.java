package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC561760M1m {
    public static final EnumC561760M1m HALF_YEAR_AGO;
    public static final /* synthetic */ EnumC561760M1m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC561760M1m ONE_MONTH_AGO;
    public static final EnumC561760M1m THREE_MONTHS_AGO;
    public static final EnumC561760M1m WITHIN_MONTH;

    public static InterfaceC2044707zh<EnumC561760M1m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC561760M1m enumC561760M1m = new EnumC561760M1m("HALF_YEAR_AGO", 0);
        HALF_YEAR_AGO = enumC561760M1m;
        EnumC561760M1m enumC561760M1m2 = new EnumC561760M1m("THREE_MONTHS_AGO", 1);
        THREE_MONTHS_AGO = enumC561760M1m2;
        EnumC561760M1m enumC561760M1m3 = new EnumC561760M1m("ONE_MONTH_AGO", 2);
        ONE_MONTH_AGO = enumC561760M1m3;
        EnumC561760M1m enumC561760M1m4 = new EnumC561760M1m("WITHIN_MONTH", 3);
        WITHIN_MONTH = enumC561760M1m4;
        EnumC561760M1m[] enumC561760M1mArr = {enumC561760M1m, enumC561760M1m2, enumC561760M1m3, enumC561760M1m4};
        LL = enumC561760M1mArr;
        LLILLJJLI = new C2254308sP(enumC561760M1mArr);
    }

    public static EnumC561760M1m[] values() {
        return (EnumC561760M1m[]) LL.clone();
    }

    public static EnumC561760M1m valueOf(String str) {
        return (EnumC561760M1m) C08FF.LIZ(EnumC561760M1m.class, str);
    }

    public EnumC561760M1m(String str, int i) {
    }
}
