package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NFD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NFD {
    public static final C0NFD BITRATE;
    public static final C0NFD CACHE_KEEP_TIME;
    public static final C0NFD CACHE_POS;
    public static final C0NFD CACHE_SOURCE;
    public static final C0NFC Companion;
    public static final C0NFD EST_PT;
    public static final C0NFD IO_COST;
    public static final /* synthetic */ C0NFD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NFD NO_FEATURE;
    public static final C0NFD SIMILAR;
    public static final C0NFD SIMILAR_EST_PT;
    public static final C0NFD STAT;
    public static final C0NFD STAT_ESP_PT;
    public static final C0NFD VIDEO_DURATION;
    public final int LL;

    public static InterfaceC2044707zh<C0NFD> getEntries() {
        return LLILLL;
    }

    public static final C0NFD parse(int i) {
        Companion.getClass();
        return C0NFC.LIZ(i);
    }

    static {
        C0NFD c0nfd = new C0NFD("NO_FEATURE", 0, 0);
        NO_FEATURE = c0nfd;
        C0NFD c0nfd2 = new C0NFD("SIMILAR", 1, 1);
        SIMILAR = c0nfd2;
        C0NFD c0nfd3 = new C0NFD("SIMILAR_EST_PT", 2, 2);
        SIMILAR_EST_PT = c0nfd3;
        C0NFD c0nfd4 = new C0NFD("IO_COST", 3, 3);
        IO_COST = c0nfd4;
        C0NFD c0nfd5 = new C0NFD("BITRATE", 4, 4);
        BITRATE = c0nfd5;
        C0NFD c0nfd6 = new C0NFD("VIDEO_DURATION", 5, 5);
        VIDEO_DURATION = c0nfd6;
        C0NFD c0nfd7 = new C0NFD("STAT_ESP_PT", 6, 6);
        STAT_ESP_PT = c0nfd7;
        C0NFD c0nfd8 = new C0NFD("STAT", 7, 7);
        STAT = c0nfd8;
        C0NFD c0nfd9 = new C0NFD("EST_PT", 8, 8);
        EST_PT = c0nfd9;
        C0NFD c0nfd10 = new C0NFD("CACHE_KEEP_TIME", 9, 9);
        CACHE_KEEP_TIME = c0nfd10;
        C0NFD c0nfd11 = new C0NFD("CACHE_POS", 10, 10);
        CACHE_POS = c0nfd11;
        C0NFD c0nfd12 = new C0NFD("CACHE_SOURCE", 11, 11);
        CACHE_SOURCE = c0nfd12;
        C0NFD[] c0nfdArr = {c0nfd, c0nfd2, c0nfd3, c0nfd4, c0nfd5, c0nfd6, c0nfd7, c0nfd8, c0nfd9, c0nfd10, c0nfd11, c0nfd12};
        LLILLJJLI = c0nfdArr;
        LLILLL = new C2254308sP(c0nfdArr);
        Companion = new C0NFC();
    }

    public static C0NFD[] values() {
        return (C0NFD[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0NFD valueOf(String str) {
        return (C0NFD) C08FF.LIZ(C0NFD.class, str);
    }

    public C0NFD(String str, int i, int i2) {
        this.LL = i2;
    }
}
