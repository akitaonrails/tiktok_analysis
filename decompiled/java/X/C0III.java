package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0III, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0III {
    public static final C0III BLUR_FRAME_BITMAP_READY;
    public static final C0III CARD_DISMISSED;
    public static final C0III DISMISS_CARD_START;
    public static final C0III FINISH_CARD_ANIM_END;
    public static final C0III FINISH_CARD_START_ANIM;
    public static final C0III FINISH_SESSION_RESET;
    public static final C0III FINISH_WIDGET_DATA_READY;
    public static final C0III FINISH_WIDGET_MOCK_LOADED;
    public static final C0III FINISH_WIDGET_REAL_LOADED;
    public static final C0III LIVE_EVENT_INFO_READY;
    public static final C0III LIVE_FINISH_START;
    public static final /* synthetic */ C0III[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0III MULTI_GUEST_FEED_READY;
    public static final C0III NONE;

    public static InterfaceC2044707zh<C0III> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0III c0iii = new C0III("NONE", 0);
        NONE = c0iii;
        C0III c0iii2 = new C0III("LIVE_FINISH_START", 1);
        LIVE_FINISH_START = c0iii2;
        C0III c0iii3 = new C0III("FINISH_WIDGET_MOCK_LOADED", 2);
        FINISH_WIDGET_MOCK_LOADED = c0iii3;
        C0III c0iii4 = new C0III("FINISH_WIDGET_REAL_LOADED", 3);
        FINISH_WIDGET_REAL_LOADED = c0iii4;
        C0III c0iii5 = new C0III("BLUR_FRAME_BITMAP_READY", 4);
        BLUR_FRAME_BITMAP_READY = c0iii5;
        C0III c0iii6 = new C0III("FINISH_CARD_START_ANIM", 5);
        FINISH_CARD_START_ANIM = c0iii6;
        C0III c0iii7 = new C0III("FINISH_CARD_ANIM_END", 6);
        FINISH_CARD_ANIM_END = c0iii7;
        C0III c0iii8 = new C0III("DISMISS_CARD_START", 7);
        DISMISS_CARD_START = c0iii8;
        C0III c0iii9 = new C0III("CARD_DISMISSED", 8);
        CARD_DISMISSED = c0iii9;
        C0III c0iii10 = new C0III("FINISH_SESSION_RESET", 9);
        FINISH_SESSION_RESET = c0iii10;
        C0III c0iii11 = new C0III("FINISH_WIDGET_DATA_READY", 10);
        FINISH_WIDGET_DATA_READY = c0iii11;
        C0III c0iii12 = new C0III("LIVE_EVENT_INFO_READY", 11);
        LIVE_EVENT_INFO_READY = c0iii12;
        C0III c0iii13 = new C0III("MULTI_GUEST_FEED_READY", 12);
        MULTI_GUEST_FEED_READY = c0iii13;
        C0III[] c0iiiArr = {c0iii, c0iii2, c0iii3, c0iii4, c0iii5, c0iii6, c0iii7, c0iii8, c0iii9, c0iii10, c0iii11, c0iii12, c0iii13};
        LL = c0iiiArr;
        LLILLJJLI = new C2254308sP(c0iiiArr);
    }

    public static C0III[] values() {
        return (C0III[]) LL.clone();
    }

    public static C0III valueOf(String str) {
        return (C0III) C08FF.LIZ(C0III.class, str);
    }

    public C0III(String str, int i) {
    }
}
