package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U2K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U2K {
    public static final C0U2K ADDED;
    public static final C0U2K COVER_CHANGED;
    public static final C0U2K DOWNLOAD_FAIL;
    public static final C0U2K FAV_CHANGE;
    public static final C0U2K FAV_FAIL;
    public static final C0U2K FINISH_DOWNLOAD;
    public static final C0U2K FULL_UPDATE;
    public static final C0U2K HIDE_PIN;
    public static final C0U2K INVALID;
    public static final /* synthetic */ C0U2K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0U2K PAUSE_PLAY;
    public static final C0U2K PLAY_STATUS;
    public static final C0U2K REQUEST;
    public static final C0U2K REQUESTED;
    public static final C0U2K REQUESTED_FOR_SELF;
    public static final C0U2K REQUEST_FAIL;
    public static final C0U2K REQUEST_SUC;
    public static final C0U2K SHOW_PIN;
    public static final C0U2K SINGER_CHANGED;
    public static final C0U2K START_DOWNLOAD;
    public static final C0U2K START_PLAY;
    public static final C0U2K STOP_PLAY;
    public static final C0U2K USER_INFO_CHANGED;

    public static InterfaceC2044707zh<C0U2K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0U2K c0u2k = new C0U2K("START_PLAY", 0);
        START_PLAY = c0u2k;
        C0U2K c0u2k2 = new C0U2K("PAUSE_PLAY", 1);
        PAUSE_PLAY = c0u2k2;
        C0U2K c0u2k3 = new C0U2K("STOP_PLAY", 2);
        STOP_PLAY = c0u2k3;
        C0U2K c0u2k4 = new C0U2K("FULL_UPDATE", 3);
        FULL_UPDATE = c0u2k4;
        C0U2K c0u2k5 = new C0U2K("FAV_CHANGE", 4);
        FAV_CHANGE = c0u2k5;
        C0U2K c0u2k6 = new C0U2K("FAV_FAIL", 5);
        FAV_FAIL = c0u2k6;
        C0U2K c0u2k7 = new C0U2K("START_DOWNLOAD", 6);
        START_DOWNLOAD = c0u2k7;
        C0U2K c0u2k8 = new C0U2K("FINISH_DOWNLOAD", 7);
        FINISH_DOWNLOAD = c0u2k8;
        C0U2K c0u2k9 = new C0U2K("DOWNLOAD_FAIL", 8);
        DOWNLOAD_FAIL = c0u2k9;
        C0U2K c0u2k10 = new C0U2K("REQUEST", 9);
        REQUEST = c0u2k10;
        C0U2K c0u2k11 = new C0U2K("REQUEST_SUC", 10);
        REQUEST_SUC = c0u2k11;
        C0U2K c0u2k12 = new C0U2K("REQUEST_FAIL", 11);
        REQUEST_FAIL = c0u2k12;
        C0U2K c0u2k13 = new C0U2K("ADDED", 12);
        ADDED = c0u2k13;
        C0U2K c0u2k14 = new C0U2K("REQUESTED", 13);
        REQUESTED = c0u2k14;
        C0U2K c0u2k15 = new C0U2K("REQUESTED_FOR_SELF", 14);
        REQUESTED_FOR_SELF = c0u2k15;
        C0U2K c0u2k16 = new C0U2K("USER_INFO_CHANGED", 15);
        USER_INFO_CHANGED = c0u2k16;
        C0U2K c0u2k17 = new C0U2K("COVER_CHANGED", 16);
        COVER_CHANGED = c0u2k17;
        C0U2K c0u2k18 = new C0U2K("HIDE_PIN", 17);
        HIDE_PIN = c0u2k18;
        C0U2K c0u2k19 = new C0U2K("SHOW_PIN", 18);
        SHOW_PIN = c0u2k19;
        C0U2K c0u2k20 = new C0U2K("PLAY_STATUS", 19);
        PLAY_STATUS = c0u2k20;
        C0U2K c0u2k21 = new C0U2K("SINGER_CHANGED", 20);
        SINGER_CHANGED = c0u2k21;
        C0U2K c0u2k22 = new C0U2K("INVALID", 21);
        INVALID = c0u2k22;
        C0U2K[] c0u2kArr = {c0u2k, c0u2k2, c0u2k3, c0u2k4, c0u2k5, c0u2k6, c0u2k7, c0u2k8, c0u2k9, c0u2k10, c0u2k11, c0u2k12, c0u2k13, c0u2k14, c0u2k15, c0u2k16, c0u2k17, c0u2k18, c0u2k19, c0u2k20, c0u2k21, c0u2k22};
        LL = c0u2kArr;
        LLILLJJLI = new C2254308sP(c0u2kArr);
    }

    public static C0U2K[] values() {
        return (C0U2K[]) LL.clone();
    }

    public static C0U2K valueOf(String str) {
        return (C0U2K) C08FF.LIZ(C0U2K.class, str);
    }

    public C0U2K(String str, int i) {
    }
}
