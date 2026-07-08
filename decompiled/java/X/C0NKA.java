package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NKA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NKA {
    public static final C0NKA FeedColdCache;
    public static final C0NKA FixedListCache;
    public static final C0NKA GHouse;
    public static final /* synthetic */ C0NKA[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0NKA Normal;
    public static final C0NKA OfflineMode;
    public static final C0NKA OftenWatch;
    public final String LL;
    public final long LLILLJJLI;

    public static InterfaceC2044707zh<C0NKA> getEntries() {
        return LLILZ;
    }

    static {
        C0NKA c0nka = new C0NKA(0, "FixedListCache", 50L, "fixed-list-cache");
        FixedListCache = c0nka;
        C0NKA c0nka2 = new C0NKA(1, "Normal", -1L, null);
        Normal = c0nka2;
        C0NKA c0nka3 = new C0NKA(2, "GHouse", ((Number) C1474810oTv.a5.getValue()).longValue(), "g-house");
        GHouse = c0nka3;
        C0NKA c0nka4 = new C0NKA(3, "OfflineMode", 2000L, "offline-mode");
        OfflineMode = c0nka4;
        C0NKA c0nka5 = new C0NKA(4, "FeedColdCache", 200L, "feed-cold-cache");
        FeedColdCache = c0nka5;
        C0NKA c0nka6 = new C0NKA(5, "OftenWatch", ((Number) C1474810oTv.LLIZ.getValue()).longValue(), "often");
        OftenWatch = c0nka6;
        C0NKA[] c0nkaArr = {c0nka, c0nka2, c0nka3, c0nka4, c0nka5, c0nka6};
        LLILLL = c0nkaArr;
        LLILZ = new C2254308sP(c0nkaArr);
    }

    public static C0NKA[] values() {
        return (C0NKA[]) LLILLL.clone();
    }

    public final String getCacheDir() {
        return this.LL;
    }

    public final long getSizeMB() {
        return this.LLILLJJLI;
    }

    public static C0NKA valueOf(String str) {
        return (C0NKA) C08FF.LIZ(C0NKA.class, str);
    }

    public C0NKA(int i, String str, long j, String str2) {
        this.LL = str2;
        this.LLILLJJLI = j;
    }
}
