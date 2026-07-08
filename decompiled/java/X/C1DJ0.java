package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DJ0 {
    public static final C1DJ0 DOUBLE_TAP;
    public static final /* synthetic */ C1DJ0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1DJ0 OPEN_CAMERA_PROP_CANCEL;
    public static final C1DJ0 SWITCH_CAMERA_AR_PROP_REAR;
    public static final C1DJ0 SWITCH_CAMERA_PROP_FRONT;
    public static final C1DJ0 SWITCH_CAMERA_PROP_REAR;
    public static final C1DJ0 TOOL_BAR_ICON;

    public static InterfaceC2044707zh<C1DJ0> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1DJ0 c1dj0 = new C1DJ0("DOUBLE_TAP", 0);
        DOUBLE_TAP = c1dj0;
        C1DJ0 c1dj02 = new C1DJ0("TOOL_BAR_ICON", 1);
        TOOL_BAR_ICON = c1dj02;
        C1DJ0 c1dj03 = new C1DJ0("SWITCH_CAMERA_PROP_FRONT", 2);
        SWITCH_CAMERA_PROP_FRONT = c1dj03;
        C1DJ0 c1dj04 = new C1DJ0("SWITCH_CAMERA_PROP_REAR", 3);
        SWITCH_CAMERA_PROP_REAR = c1dj04;
        C1DJ0 c1dj05 = new C1DJ0("SWITCH_CAMERA_AR_PROP_REAR", 4);
        SWITCH_CAMERA_AR_PROP_REAR = c1dj05;
        C1DJ0 c1dj06 = new C1DJ0("OPEN_CAMERA_PROP_CANCEL", 5);
        OPEN_CAMERA_PROP_CANCEL = c1dj06;
        C1DJ0[] c1dj0Arr = {c1dj0, c1dj02, c1dj03, c1dj04, c1dj05, c1dj06};
        LL = c1dj0Arr;
        LLILLJJLI = new C2254308sP(c1dj0Arr);
    }

    public static C1DJ0[] values() {
        return (C1DJ0[]) LL.clone();
    }

    public static C1DJ0 valueOf(String str) {
        return (C1DJ0) C08FF.LIZ(C1DJ0.class, str);
    }

    public C1DJ0(String str, int i) {
    }
}
