package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FVR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVR {
    public static final C0FVR LANDSCAPE_VIDEO;
    public static final C0FVR LIVE_HIGHLIGHT;
    public static final /* synthetic */ C0FVR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FVR LONG_VIDEO;
    public static final C0FVR NONE;
    public static final C0FVR TTS_VOICE;

    public static InterfaceC2044707zh<C0FVR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FVR c0fvr = new C0FVR("NONE", 0);
        NONE = c0fvr;
        C0FVR c0fvr2 = new C0FVR("LONG_VIDEO", 1);
        LONG_VIDEO = c0fvr2;
        C0FVR c0fvr3 = new C0FVR("TTS_VOICE", 2);
        TTS_VOICE = c0fvr3;
        C0FVR c0fvr4 = new C0FVR("LIVE_HIGHLIGHT", 3);
        LIVE_HIGHLIGHT = c0fvr4;
        C0FVR c0fvr5 = new C0FVR("LANDSCAPE_VIDEO", 4);
        LANDSCAPE_VIDEO = c0fvr5;
        C0FVR[] c0fvrArr = {c0fvr, c0fvr2, c0fvr3, c0fvr4, c0fvr5};
        LL = c0fvrArr;
        LLILLJJLI = new C2254308sP(c0fvrArr);
    }

    public static C0FVR[] values() {
        return (C0FVR[]) LL.clone();
    }

    public static C0FVR valueOf(String str) {
        return (C0FVR) C08FF.LIZ(C0FVR.class, str);
    }

    public C0FVR(String str, int i) {
    }
}
