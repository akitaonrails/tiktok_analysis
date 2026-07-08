package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1804200x3C {
    public static final C1804190x3B Companion;
    public static final /* synthetic */ EnumC1804200x3C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1804200x3C RECHARGE_V3_VERSION_PHASE_1;
    public static final EnumC1804200x3C RECHARGE_V3_VERSION_PHASE_2_1;
    public static final EnumC1804200x3C RECHARGE_V3_VERSION_PHASE_2_2_V1;
    public static final EnumC1804200x3C RECHARGE_V3_VERSION_PHASE_2_2_V2;
    public static final EnumC1804200x3C RECHARGE_V3_VERSION_PHASE_NO_IN_APP_PIPO_RECHARGE;
    public static final EnumC1804200x3C RECHARGE_V3_VERSION_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1804200x3C> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1804200x3C enumC1804200x3C = new EnumC1804200x3C("RECHARGE_V3_VERSION_UNKNOWN", 0, 0);
        RECHARGE_V3_VERSION_UNKNOWN = enumC1804200x3C;
        EnumC1804200x3C enumC1804200x3C2 = new EnumC1804200x3C("RECHARGE_V3_VERSION_PHASE_NO_IN_APP_PIPO_RECHARGE", 1, 1);
        RECHARGE_V3_VERSION_PHASE_NO_IN_APP_PIPO_RECHARGE = enumC1804200x3C2;
        EnumC1804200x3C enumC1804200x3C3 = new EnumC1804200x3C("RECHARGE_V3_VERSION_PHASE_1", 2, 2);
        RECHARGE_V3_VERSION_PHASE_1 = enumC1804200x3C3;
        EnumC1804200x3C enumC1804200x3C4 = new EnumC1804200x3C("RECHARGE_V3_VERSION_PHASE_2_1", 3, 3);
        RECHARGE_V3_VERSION_PHASE_2_1 = enumC1804200x3C4;
        EnumC1804200x3C enumC1804200x3C5 = new EnumC1804200x3C("RECHARGE_V3_VERSION_PHASE_2_2_V1", 4, 4);
        RECHARGE_V3_VERSION_PHASE_2_2_V1 = enumC1804200x3C5;
        EnumC1804200x3C enumC1804200x3C6 = new EnumC1804200x3C("RECHARGE_V3_VERSION_PHASE_2_2_V2", 5, 5);
        RECHARGE_V3_VERSION_PHASE_2_2_V2 = enumC1804200x3C6;
        EnumC1804200x3C[] enumC1804200x3CArr = {enumC1804200x3C, enumC1804200x3C2, enumC1804200x3C3, enumC1804200x3C4, enumC1804200x3C5, enumC1804200x3C6};
        LLILLJJLI = enumC1804200x3CArr;
        LLILLL = new C2254308sP(enumC1804200x3CArr);
        Companion = new C1804190x3B();
    }

    public static EnumC1804200x3C[] values() {
        return (EnumC1804200x3C[]) LLILLJJLI.clone();
    }

    public final int getVersion() {
        return this.LL;
    }

    public static EnumC1804200x3C valueOf(String str) {
        return (EnumC1804200x3C) C08FF.LIZ(EnumC1804200x3C.class, str);
    }

    public EnumC1804200x3C(String str, int i, int i2) {
        this.LL = i2;
    }
}
