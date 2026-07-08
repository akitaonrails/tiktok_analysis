package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15sL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20656715sL {
    public static final EnumC20656715sL ASYNC_EXCEPTION;
    public static final EnumC20656715sL ASYNC_FALSE;
    public static final EnumC20656715sL ASYNC_TIMEOUT;
    public static final EnumC20656715sL CAN_SHOW_FALSE;
    public static final EnumC20656715sL DEBUG_STOP_SWITCH_OPEN;
    public static final EnumC20656715sL DEPENDENCY;
    public static final EnumC20656715sL DISPERSION;
    public static final EnumC20656715sL FCP_ENABLE;
    public static final EnumC20656715sL INTERCEPT;
    public static final /* synthetic */ EnumC20656715sL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20656715sL SCENE_INACTIVE;
    public static final EnumC20656715sL STATE_ERROR;
    public static final EnumC20656715sL STOP_SWITCH_OPEN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20656715sL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20656715sL enumC20656715sL = new EnumC20656715sL("STOP_SWITCH_OPEN", 0, "stop by caller.");
        STOP_SWITCH_OPEN = enumC20656715sL;
        EnumC20656715sL enumC20656715sL2 = new EnumC20656715sL("SCENE_INACTIVE", 1, "popup scene is not active.");
        SCENE_INACTIVE = enumC20656715sL2;
        EnumC20656715sL enumC20656715sL3 = new EnumC20656715sL("INTERCEPT", 2, "popup was intercepted by ");
        INTERCEPT = enumC20656715sL3;
        EnumC20656715sL enumC20656715sL4 = new EnumC20656715sL("CAN_SHOW_FALSE", 3, "the canShow function returns false.");
        CAN_SHOW_FALSE = enumC20656715sL4;
        EnumC20656715sL enumC20656715sL5 = new EnumC20656715sL("DEBUG_STOP_SWITCH_OPEN", 4, "debug stop switch is open.");
        DEBUG_STOP_SWITCH_OPEN = enumC20656715sL5;
        EnumC20656715sL enumC20656715sL6 = new EnumC20656715sL("STATE_ERROR", 5, "popup state error.");
        STATE_ERROR = enumC20656715sL6;
        EnumC20656715sL enumC20656715sL7 = new EnumC20656715sL("DEPENDENCY", 6, "popup's dependency reason.");
        DEPENDENCY = enumC20656715sL7;
        EnumC20656715sL enumC20656715sL8 = new EnumC20656715sL("ASYNC_FALSE", 7, "popup async task returns false.");
        ASYNC_FALSE = enumC20656715sL8;
        EnumC20656715sL enumC20656715sL9 = new EnumC20656715sL("DISPERSION", 8, "popup can not show by dispersion rules");
        DISPERSION = enumC20656715sL9;
        EnumC20656715sL enumC20656715sL10 = new EnumC20656715sL("ASYNC_TIMEOUT", 9, "popup async task returns timeout.");
        ASYNC_TIMEOUT = enumC20656715sL10;
        EnumC20656715sL enumC20656715sL11 = new EnumC20656715sL("ASYNC_EXCEPTION", 10, "popup async task execute exception ");
        ASYNC_EXCEPTION = enumC20656715sL11;
        EnumC20656715sL enumC20656715sL12 = new EnumC20656715sL("FCP_ENABLE", 11, "popup not hit the fcp whitelist");
        FCP_ENABLE = enumC20656715sL12;
        EnumC20656715sL[] enumC20656715sLArr = {enumC20656715sL, enumC20656715sL2, enumC20656715sL3, enumC20656715sL4, enumC20656715sL5, enumC20656715sL6, enumC20656715sL7, enumC20656715sL8, enumC20656715sL9, enumC20656715sL10, enumC20656715sL11, enumC20656715sL12};
        LLILLJJLI = enumC20656715sLArr;
        LLILLL = new C2254308sP(enumC20656715sLArr);
    }

    public static EnumC20656715sL[] values() {
        return (EnumC20656715sL[]) LLILLJJLI.clone();
    }

    public final String getErrMsg() {
        return this.LL;
    }

    public static EnumC20656715sL valueOf(String str) {
        return (EnumC20656715sL) C08FF.LIZ(EnumC20656715sL.class, str);
    }

    public EnumC20656715sL(String str, int i, String str2) {
        this.LL = str2;
    }
}
