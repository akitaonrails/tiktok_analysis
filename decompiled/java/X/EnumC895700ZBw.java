package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895700ZBw {
    public static final /* synthetic */ EnumC895700ZBw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC895700ZBw PROCESS_CANCEL;
    public static final EnumC895700ZBw PROCESS_NOT_STARTED;
    public static final EnumC895700ZBw PROCESS_PICK_AUDIO_END;
    public static final EnumC895700ZBw PROCESS_PICK_AUDIO_ERROR;
    public static final EnumC895700ZBw PROCESS_PICK_AUDIO_START;
    public static final EnumC895700ZBw PROCESS_TRANS_AUDIO_END;
    public static final EnumC895700ZBw PROCESS_TRANS_AUDIO_ERROR;
    public static final EnumC895700ZBw PROCESS_TRANS_AUDIO_START;
    public final int LL;

    public static InterfaceC2044707zh<EnumC895700ZBw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC895700ZBw enumC895700ZBw = new EnumC895700ZBw("PROCESS_NOT_STARTED", 0, -1);
        PROCESS_NOT_STARTED = enumC895700ZBw;
        EnumC895700ZBw enumC895700ZBw2 = new EnumC895700ZBw("PROCESS_TRANS_AUDIO_START", 1, 0);
        PROCESS_TRANS_AUDIO_START = enumC895700ZBw2;
        EnumC895700ZBw enumC895700ZBw3 = new EnumC895700ZBw("PROCESS_TRANS_AUDIO_END", 2, 1);
        PROCESS_TRANS_AUDIO_END = enumC895700ZBw3;
        EnumC895700ZBw enumC895700ZBw4 = new EnumC895700ZBw("PROCESS_TRANS_AUDIO_ERROR", 3, 2);
        PROCESS_TRANS_AUDIO_ERROR = enumC895700ZBw4;
        EnumC895700ZBw enumC895700ZBw5 = new EnumC895700ZBw("PROCESS_PICK_AUDIO_START", 4, 3);
        PROCESS_PICK_AUDIO_START = enumC895700ZBw5;
        EnumC895700ZBw enumC895700ZBw6 = new EnumC895700ZBw("PROCESS_PICK_AUDIO_END", 5, 4);
        PROCESS_PICK_AUDIO_END = enumC895700ZBw6;
        EnumC895700ZBw enumC895700ZBw7 = new EnumC895700ZBw("PROCESS_PICK_AUDIO_ERROR", 6, 5);
        PROCESS_PICK_AUDIO_ERROR = enumC895700ZBw7;
        EnumC895700ZBw enumC895700ZBw8 = new EnumC895700ZBw("PROCESS_CANCEL", 7, 6);
        PROCESS_CANCEL = enumC895700ZBw8;
        EnumC895700ZBw[] enumC895700ZBwArr = {enumC895700ZBw, enumC895700ZBw2, enumC895700ZBw3, enumC895700ZBw4, enumC895700ZBw5, enumC895700ZBw6, enumC895700ZBw7, enumC895700ZBw8};
        LLILLJJLI = enumC895700ZBwArr;
        LLILLL = new C2254308sP(enumC895700ZBwArr);
    }

    public static EnumC895700ZBw[] values() {
        return (EnumC895700ZBw[]) LLILLJJLI.clone();
    }

    public final int getValue$tools_camera_base_release() {
        return this.LL;
    }

    public static EnumC895700ZBw valueOf(String str) {
        return (EnumC895700ZBw) C08FF.LIZ(EnumC895700ZBw.class, str);
    }

    public EnumC895700ZBw(String str, int i, int i2) {
        this.LL = i2;
    }
}
