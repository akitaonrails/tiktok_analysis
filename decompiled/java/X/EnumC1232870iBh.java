package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1232870iBh {
    public static final C1232690iBP Companion;
    public static final EnumC1232870iBh DEDUCT_CYCLE_ANNUALLY;
    public static final EnumC1232870iBh DEDUCT_CYCLE_BIMONTHLY;
    public static final EnumC1232870iBh DEDUCT_CYCLE_MONTHLY;
    public static final EnumC1232870iBh DEDUCT_CYCLE_ONE_MONTH;
    public static final EnumC1232870iBh DEDUCT_CYCLE_QUARTERLY;
    public static final EnumC1232870iBh DEDUCT_CYCLE_SEMIANNUALLY;
    public static final EnumC1232870iBh DEDUCT_CYCLE_WEEKLY;
    public static final /* synthetic */ EnumC1232870iBh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<Integer, EnumC1232870iBh> map;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1232870iBh> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0iBP] */
    static {
        EnumC1232870iBh enumC1232870iBh = new EnumC1232870iBh("DEDUCT_CYCLE_ONE_MONTH", 0, -1);
        DEDUCT_CYCLE_ONE_MONTH = enumC1232870iBh;
        EnumC1232870iBh enumC1232870iBh2 = new EnumC1232870iBh("DEDUCT_CYCLE_MONTHLY", 1, 1);
        DEDUCT_CYCLE_MONTHLY = enumC1232870iBh2;
        EnumC1232870iBh enumC1232870iBh3 = new EnumC1232870iBh("DEDUCT_CYCLE_BIMONTHLY", 2, 2);
        DEDUCT_CYCLE_BIMONTHLY = enumC1232870iBh3;
        EnumC1232870iBh enumC1232870iBh4 = new EnumC1232870iBh("DEDUCT_CYCLE_QUARTERLY", 3, 3);
        DEDUCT_CYCLE_QUARTERLY = enumC1232870iBh4;
        EnumC1232870iBh enumC1232870iBh5 = new EnumC1232870iBh("DEDUCT_CYCLE_SEMIANNUALLY", 4, 4);
        DEDUCT_CYCLE_SEMIANNUALLY = enumC1232870iBh5;
        EnumC1232870iBh enumC1232870iBh6 = new EnumC1232870iBh("DEDUCT_CYCLE_ANNUALLY", 5, 5);
        DEDUCT_CYCLE_ANNUALLY = enumC1232870iBh6;
        EnumC1232870iBh enumC1232870iBh7 = new EnumC1232870iBh("DEDUCT_CYCLE_WEEKLY", 6, 255);
        DEDUCT_CYCLE_WEEKLY = enumC1232870iBh7;
        EnumC1232870iBh[] enumC1232870iBhArr = {enumC1232870iBh, enumC1232870iBh2, enumC1232870iBh3, enumC1232870iBh4, enumC1232870iBh5, enumC1232870iBh6, enumC1232870iBh7};
        LLILLJJLI = enumC1232870iBhArr;
        LLILLL = new C2254308sP(enumC1232870iBhArr);
        Companion = new Object() { // from class: X.0iBP
        };
        EnumC1232870iBh[] enumC1232870iBhArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1232870iBhArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1232870iBh enumC1232870iBh8 : enumC1232870iBhArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1232870iBh8.LL), enumC1232870iBh8);
        }
        map = linkedHashMap;
    }

    public static EnumC1232870iBh[] values() {
        return (EnumC1232870iBh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1232870iBh valueOf(String str) {
        return (EnumC1232870iBh) C08FF.LIZ(EnumC1232870iBh.class, str);
    }

    public EnumC1232870iBh(String str, int i, int i2) {
        this.LL = i2;
    }
}
