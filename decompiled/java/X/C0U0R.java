package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U0R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U0R {
    public static final /* synthetic */ C0U0R[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0U0R NEXT;
    public static final C0U0R NEXT_AUTO;
    public static final C0U0R PAUSE;
    public static final C0U0R PLAY;
    public static final C0U0R PREV;
    public static final C0U0R SET_PITCH;
    public static final C0U0R TOGGLE_ECHO_MODE;
    public static final C0U0R TOGGLE_LYRIC_DISPLAY;
    public static final C0U0R TOGGLE_TRACK;

    public static InterfaceC2044707zh<C0U0R> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0U0R c0u0r = new C0U0R("PLAY", 0);
        PLAY = c0u0r;
        C0U0R c0u0r2 = new C0U0R("PAUSE", 1);
        PAUSE = c0u0r2;
        C0U0R c0u0r3 = new C0U0R("NEXT", 2);
        NEXT = c0u0r3;
        C0U0R c0u0r4 = new C0U0R("NEXT_AUTO", 3);
        NEXT_AUTO = c0u0r4;
        C0U0R c0u0r5 = new C0U0R("PREV", 4);
        PREV = c0u0r5;
        C0U0R c0u0r6 = new C0U0R("TOGGLE_TRACK", 5);
        TOGGLE_TRACK = c0u0r6;
        C0U0R c0u0r7 = new C0U0R("TOGGLE_ECHO_MODE", 6);
        TOGGLE_ECHO_MODE = c0u0r7;
        C0U0R c0u0r8 = new C0U0R("TOGGLE_LYRIC_DISPLAY", 7);
        TOGGLE_LYRIC_DISPLAY = c0u0r8;
        C0U0R c0u0r9 = new C0U0R("SET_PITCH", 8);
        SET_PITCH = c0u0r9;
        C0U0R[] c0u0rArr = {c0u0r, c0u0r2, c0u0r3, c0u0r4, c0u0r5, c0u0r6, c0u0r7, c0u0r8, c0u0r9};
        LL = c0u0rArr;
        LLILLJJLI = new C2254308sP(c0u0rArr);
    }

    public static C0U0R[] values() {
        return (C0U0R[]) LL.clone();
    }

    public static C0U0R valueOf(String str) {
        return (C0U0R) C08FF.LIZ(C0U0R.class, str);
    }

    public C0U0R(String str, int i) {
    }
}
