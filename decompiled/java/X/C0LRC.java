package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LRC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LRC {
    public static final C0LRC ASPECT_RATIO_OVERFLOW;
    public static final C0LRC ASPECT_RATIO_UNDERFLOW;
    public static final C0LRC DIMENSION_TOO_LARGE;
    public static final C0LRC DIMENSION_TOO_SMALL;
    public static final C0LRC FILE_TOO_LARGE;
    public static final C0LRC FORMAT;
    public static final C0LRC LIVE_PHOTO;
    public static final /* synthetic */ C0LRC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0LRC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LRC c0lrc = new C0LRC("FORMAT", 0);
        FORMAT = c0lrc;
        C0LRC c0lrc2 = new C0LRC("ASPECT_RATIO_OVERFLOW", 1);
        ASPECT_RATIO_OVERFLOW = c0lrc2;
        C0LRC c0lrc3 = new C0LRC("ASPECT_RATIO_UNDERFLOW", 2);
        ASPECT_RATIO_UNDERFLOW = c0lrc3;
        C0LRC c0lrc4 = new C0LRC("DIMENSION_TOO_LARGE", 3);
        DIMENSION_TOO_LARGE = c0lrc4;
        C0LRC c0lrc5 = new C0LRC("DIMENSION_TOO_SMALL", 4);
        DIMENSION_TOO_SMALL = c0lrc5;
        C0LRC c0lrc6 = new C0LRC("FILE_TOO_LARGE", 5);
        FILE_TOO_LARGE = c0lrc6;
        C0LRC c0lrc7 = new C0LRC("LIVE_PHOTO", 6);
        LIVE_PHOTO = c0lrc7;
        C0LRC[] c0lrcArr = {c0lrc, c0lrc2, c0lrc3, c0lrc4, c0lrc5, c0lrc6, c0lrc7};
        LL = c0lrcArr;
        LLILLJJLI = new C2254308sP(c0lrcArr);
    }

    public static C0LRC[] values() {
        return (C0LRC[]) LL.clone();
    }

    public static C0LRC valueOf(String str) {
        return (C0LRC) C08FF.LIZ(C0LRC.class, str);
    }

    public C0LRC(String str, int i) {
    }
}
