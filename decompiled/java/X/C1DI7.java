package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DI7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DI7 implements C1DI8 {
    public static final C1DI7 AUDIO_START_DUET;
    public static final C1DI7 AUDIO_START_RECORD_DEFAULT_NOT_AUDIO;
    public static final C1DI7 AUDIO_START_RECORD_DEFAULT_WITH_AUDIO;
    public static final C1DI7 AUDIO_START_RECORD_USE_EFFECT;
    public static final C1DI7 FTC_OPEN_CAMERA_ENTER_PAGE;
    public static final /* synthetic */ C1DI7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1DI7 OPEN_CAMERA_ENTER_PAGE_ON_RESUME;
    public static final C1DI7 OPEN_CAMERA_ENTER_PAGE_ON_START;
    public static final C1DI7 OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE;
    public static final C1DI7 OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE;
    public static final C1DI7 SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP;
    public static final C1DI7 SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW;
    public static final C1DI7 SWITCH_CAMERA_TOOL_BAR;

    public static InterfaceC2044707zh<C1DI7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1DI7 c1di7 = new C1DI7("OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE", 0);
        OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE = c1di7;
        C1DI7 c1di72 = new C1DI7("OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE", 1);
        OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE = c1di72;
        C1DI7 c1di73 = new C1DI7("OPEN_CAMERA_ENTER_PAGE_ON_START", 2);
        OPEN_CAMERA_ENTER_PAGE_ON_START = c1di73;
        C1DI7 c1di74 = new C1DI7("OPEN_CAMERA_ENTER_PAGE_ON_RESUME", 3);
        OPEN_CAMERA_ENTER_PAGE_ON_RESUME = c1di74;
        C1DI7 c1di75 = new C1DI7("FTC_OPEN_CAMERA_ENTER_PAGE", 4);
        FTC_OPEN_CAMERA_ENTER_PAGE = c1di75;
        C1DI7 c1di76 = new C1DI7("SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW", 5);
        SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW = c1di76;
        C1DI7 c1di77 = new C1DI7("SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP", 6);
        SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP = c1di77;
        C1DI7 c1di78 = new C1DI7("SWITCH_CAMERA_TOOL_BAR", 7);
        SWITCH_CAMERA_TOOL_BAR = c1di78;
        C1DI7 c1di79 = new C1DI7("AUDIO_START_RECORD_DEFAULT_WITH_AUDIO", 8);
        AUDIO_START_RECORD_DEFAULT_WITH_AUDIO = c1di79;
        C1DI7 c1di710 = new C1DI7("AUDIO_START_RECORD_DEFAULT_NOT_AUDIO", 9);
        AUDIO_START_RECORD_DEFAULT_NOT_AUDIO = c1di710;
        C1DI7 c1di711 = new C1DI7("AUDIO_START_RECORD_USE_EFFECT", 10);
        AUDIO_START_RECORD_USE_EFFECT = c1di711;
        C1DI7 c1di712 = new C1DI7("AUDIO_START_DUET", 11);
        AUDIO_START_DUET = c1di712;
        C1DI7[] c1di7Arr = {c1di7, c1di72, c1di73, c1di74, c1di75, c1di76, c1di77, c1di78, c1di79, c1di710, c1di711, c1di712};
        LL = c1di7Arr;
        LLILLJJLI = new C2254308sP(c1di7Arr);
    }

    public static C1DI7[] values() {
        return (C1DI7[]) LL.clone();
    }

    public static C1DI7 valueOf(String str) {
        return (C1DI7) C08FF.LIZ(C1DI7.class, str);
    }

    public C1DI7(String str, int i) {
    }
}
