package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2253551DIj {
    public static final EnumC2253551DIj AUDIO_START_RECORD_INIT;
    public static final EnumC2253551DIj AUDIO_STOP_RECORD;
    public static final EnumC2253551DIj CLOSE_CAMERA_ON_PAUSE;
    public static final /* synthetic */ EnumC2253551DIj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2253551DIj OPEN_CAMERA_ENTER_SHOOT;
    public static final EnumC2253551DIj OPEN_CAMERA_PROP_CANCEL;
    public static final EnumC2253551DIj SWITCH_CAMERA_AR_PROP_REAR;
    public static final EnumC2253551DIj SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW;
    public static final EnumC2253551DIj SWITCH_CAMERA_PROP_FRONT;
    public static final EnumC2253551DIj SWITCH_CAMERA_PROP_REAR;
    public static final EnumC2253551DIj SWITCH_CAMERA_TOOL_BAR;

    public static InterfaceC2044707zh<EnumC2253551DIj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2253551DIj enumC2253551DIj = new EnumC2253551DIj("OPEN_CAMERA_ENTER_SHOOT", 0);
        OPEN_CAMERA_ENTER_SHOOT = enumC2253551DIj;
        EnumC2253551DIj enumC2253551DIj2 = new EnumC2253551DIj("CLOSE_CAMERA_ON_PAUSE", 1);
        CLOSE_CAMERA_ON_PAUSE = enumC2253551DIj2;
        EnumC2253551DIj enumC2253551DIj3 = new EnumC2253551DIj("SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW", 2);
        SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW = enumC2253551DIj3;
        EnumC2253551DIj enumC2253551DIj4 = new EnumC2253551DIj("SWITCH_CAMERA_TOOL_BAR", 3);
        SWITCH_CAMERA_TOOL_BAR = enumC2253551DIj4;
        EnumC2253551DIj enumC2253551DIj5 = new EnumC2253551DIj("SWITCH_CAMERA_PROP_FRONT", 4);
        SWITCH_CAMERA_PROP_FRONT = enumC2253551DIj5;
        EnumC2253551DIj enumC2253551DIj6 = new EnumC2253551DIj("SWITCH_CAMERA_PROP_REAR", 5);
        SWITCH_CAMERA_PROP_REAR = enumC2253551DIj6;
        EnumC2253551DIj enumC2253551DIj7 = new EnumC2253551DIj("SWITCH_CAMERA_AR_PROP_REAR", 6);
        SWITCH_CAMERA_AR_PROP_REAR = enumC2253551DIj7;
        EnumC2253551DIj enumC2253551DIj8 = new EnumC2253551DIj("OPEN_CAMERA_PROP_CANCEL", 7);
        OPEN_CAMERA_PROP_CANCEL = enumC2253551DIj8;
        EnumC2253551DIj enumC2253551DIj9 = new EnumC2253551DIj("AUDIO_START_RECORD_INIT", 8);
        AUDIO_START_RECORD_INIT = enumC2253551DIj9;
        EnumC2253551DIj enumC2253551DIj10 = new EnumC2253551DIj("AUDIO_STOP_RECORD", 9);
        AUDIO_STOP_RECORD = enumC2253551DIj10;
        EnumC2253551DIj[] enumC2253551DIjArr = {enumC2253551DIj, enumC2253551DIj2, enumC2253551DIj3, enumC2253551DIj4, enumC2253551DIj5, enumC2253551DIj6, enumC2253551DIj7, enumC2253551DIj8, enumC2253551DIj9, enumC2253551DIj10};
        LL = enumC2253551DIjArr;
        LLILLJJLI = new C2254308sP(enumC2253551DIjArr);
    }

    public static EnumC2253551DIj[] values() {
        return (EnumC2253551DIj[]) LL.clone();
    }

    public static EnumC2253551DIj valueOf(String str) {
        return (EnumC2253551DIj) C08FF.LIZ(EnumC2253551DIj.class, str);
    }

    public EnumC2253551DIj(String str, int i) {
    }
}
