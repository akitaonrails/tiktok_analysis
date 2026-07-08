package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20656815sM {
    public static final EnumC20656815sM ASYNC_FALSE;
    public static final EnumC20656815sM CAN_SHOW_FALSE;
    public static final EnumC20656815sM DEBUG_STOP_SWITCH_OPEN;
    public static final EnumC20656815sM DEPENDENCY;
    public static final EnumC20656815sM DISPERSION;
    public static final EnumC20656815sM EXCEPTION;
    public static final EnumC20656815sM FCP_ENABLE;
    public static final EnumC20656815sM INTERCEPT;
    public static final /* synthetic */ EnumC20656815sM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20656815sM SCENE_INACTIVE;
    public static final EnumC20656815sM STATE_ERROR;
    public static final EnumC20656815sM STOP_SWITCH_OPEN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20656815sM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20656815sM enumC20656815sM = new EnumC20656815sM("STOP_SWITCH_OPEN", 0, 101);
        STOP_SWITCH_OPEN = enumC20656815sM;
        EnumC20656815sM enumC20656815sM2 = new EnumC20656815sM("SCENE_INACTIVE", 1, 102);
        SCENE_INACTIVE = enumC20656815sM2;
        EnumC20656815sM enumC20656815sM3 = new EnumC20656815sM("INTERCEPT", 2, 103);
        INTERCEPT = enumC20656815sM3;
        EnumC20656815sM enumC20656815sM4 = new EnumC20656815sM("CAN_SHOW_FALSE", 3, 104);
        CAN_SHOW_FALSE = enumC20656815sM4;
        EnumC20656815sM enumC20656815sM5 = new EnumC20656815sM("DEBUG_STOP_SWITCH_OPEN", 4, 105);
        DEBUG_STOP_SWITCH_OPEN = enumC20656815sM5;
        EnumC20656815sM enumC20656815sM6 = new EnumC20656815sM("STATE_ERROR", 5, 106);
        STATE_ERROR = enumC20656815sM6;
        EnumC20656815sM enumC20656815sM7 = new EnumC20656815sM("DEPENDENCY", 6, 107);
        DEPENDENCY = enumC20656815sM7;
        EnumC20656815sM enumC20656815sM8 = new EnumC20656815sM("ASYNC_FALSE", 7, 108);
        ASYNC_FALSE = enumC20656815sM8;
        EnumC20656815sM enumC20656815sM9 = new EnumC20656815sM("DISPERSION", 8, 109);
        DISPERSION = enumC20656815sM9;
        EnumC20656815sM enumC20656815sM10 = new EnumC20656815sM("EXCEPTION", 9, 1011);
        EXCEPTION = enumC20656815sM10;
        EnumC20656815sM enumC20656815sM11 = new EnumC20656815sM("FCP_ENABLE", 10, 1012);
        FCP_ENABLE = enumC20656815sM11;
        EnumC20656815sM[] enumC20656815sMArr = {enumC20656815sM, enumC20656815sM2, enumC20656815sM3, enumC20656815sM4, enumC20656815sM5, enumC20656815sM6, enumC20656815sM7, enumC20656815sM8, enumC20656815sM9, enumC20656815sM10, enumC20656815sM11};
        LLILLJJLI = enumC20656815sMArr;
        LLILLL = new C2254308sP(enumC20656815sMArr);
    }

    public static EnumC20656815sM[] values() {
        return (EnumC20656815sM[]) LLILLJJLI.clone();
    }

    public final int getErrCode() {
        return this.LL;
    }

    public static EnumC20656815sM valueOf(String str) {
        return (EnumC20656815sM) C08FF.LIZ(EnumC20656815sM.class, str);
    }

    public EnumC20656815sM(String str, int i, int i2) {
        this.LL = i2;
    }
}
