package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC743340TDw {
    public static final EnumC743340TDw CAST_STATE_CONNECTING;
    public static final EnumC743340TDw CAST_STATE_DISCONNECT;
    public static final EnumC743340TDw CAST_STATE_ERROR;
    public static final EnumC743340TDw CAST_STATE_IDLE;
    public static final EnumC743340TDw CAST_STATE_MIRRORING;
    public static final EnumC743340TDw CAST_STATE_RECONNECTING;
    public static final EnumC743340TDw CAST_STATE_RECONNECT_FAILED;
    public static final EnumC743340TDw CAST_STATE_UPDATING_PARAMS;
    public static final /* synthetic */ EnumC743340TDw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC743340TDw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC743340TDw enumC743340TDw = new EnumC743340TDw("CAST_STATE_IDLE", 0);
        CAST_STATE_IDLE = enumC743340TDw;
        EnumC743340TDw enumC743340TDw2 = new EnumC743340TDw("CAST_STATE_CONNECTING", 1);
        CAST_STATE_CONNECTING = enumC743340TDw2;
        EnumC743340TDw enumC743340TDw3 = new EnumC743340TDw("CAST_STATE_RECONNECTING", 2);
        CAST_STATE_RECONNECTING = enumC743340TDw3;
        EnumC743340TDw enumC743340TDw4 = new EnumC743340TDw("CAST_STATE_UPDATING_PARAMS", 3);
        CAST_STATE_UPDATING_PARAMS = enumC743340TDw4;
        EnumC743340TDw enumC743340TDw5 = new EnumC743340TDw("CAST_STATE_MIRRORING", 4);
        CAST_STATE_MIRRORING = enumC743340TDw5;
        EnumC743340TDw enumC743340TDw6 = new EnumC743340TDw("CAST_STATE_DISCONNECT", 5);
        CAST_STATE_DISCONNECT = enumC743340TDw6;
        EnumC743340TDw enumC743340TDw7 = new EnumC743340TDw("CAST_STATE_ERROR", 6);
        CAST_STATE_ERROR = enumC743340TDw7;
        EnumC743340TDw enumC743340TDw8 = new EnumC743340TDw("CAST_STATE_RECONNECT_FAILED", 7);
        CAST_STATE_RECONNECT_FAILED = enumC743340TDw8;
        EnumC743340TDw[] enumC743340TDwArr = {enumC743340TDw, enumC743340TDw2, enumC743340TDw3, enumC743340TDw4, enumC743340TDw5, enumC743340TDw6, enumC743340TDw7, enumC743340TDw8};
        LL = enumC743340TDwArr;
        LLILLJJLI = new C2254308sP(enumC743340TDwArr);
    }

    public static EnumC743340TDw[] values() {
        return (EnumC743340TDw[]) LL.clone();
    }

    public static EnumC743340TDw valueOf(String str) {
        return (EnumC743340TDw) C08FF.LIZ(EnumC743340TDw.class, str);
    }

    public EnumC743340TDw(String str, int i) {
    }
}
