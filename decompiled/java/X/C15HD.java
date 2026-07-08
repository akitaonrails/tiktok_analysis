package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15HD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HD {
    public static final C15HD DISCOVER;
    public static final C15HD FAVORITES;
    public static final C15HD FOR_YOU;
    public static final /* synthetic */ C15HD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15HD LOCAL_TAB;
    public static final C15HD MORE;
    public static final C15HD UNLIMITED_MUSIC;

    public static InterfaceC2044707zh<C15HD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15HD c15hd = new C15HD("DISCOVER", 0);
        DISCOVER = c15hd;
        C15HD c15hd2 = new C15HD("FAVORITES", 1);
        FAVORITES = c15hd2;
        C15HD c15hd3 = new C15HD("LOCAL_TAB", 2);
        LOCAL_TAB = c15hd3;
        C15HD c15hd4 = new C15HD("FOR_YOU", 3);
        FOR_YOU = c15hd4;
        C15HD c15hd5 = new C15HD("MORE", 4);
        MORE = c15hd5;
        C15HD c15hd6 = new C15HD("UNLIMITED_MUSIC", 5);
        UNLIMITED_MUSIC = c15hd6;
        C15HD[] c15hdArr = {c15hd, c15hd2, c15hd3, c15hd4, c15hd5, c15hd6};
        LL = c15hdArr;
        LLILLJJLI = new C2254308sP(c15hdArr);
    }

    public static C15HD[] values() {
        return (C15HD[]) LL.clone();
    }

    public static C15HD valueOf(String str) {
        return (C15HD) C08FF.LIZ(C15HD.class, str);
    }

    public C15HD(String str, int i) {
    }
}
