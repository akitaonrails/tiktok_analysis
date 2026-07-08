package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HVI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HVI {
    public static final C0HVI ALBUM_ALL_PERMISSION;
    public static final C0HVI ALBUM_NO_PERMISSION;
    public static final C0HVI ALBUM_PARTIAL_PERMISSION;
    public static final /* synthetic */ C0HVI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HVI NOT_NEED_ALBUM_PERMISSION;

    public static InterfaceC2044707zh<C0HVI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HVI c0hvi = new C0HVI("ALBUM_ALL_PERMISSION", 0);
        ALBUM_ALL_PERMISSION = c0hvi;
        C0HVI c0hvi2 = new C0HVI("ALBUM_PARTIAL_PERMISSION", 1);
        ALBUM_PARTIAL_PERMISSION = c0hvi2;
        C0HVI c0hvi3 = new C0HVI("ALBUM_NO_PERMISSION", 2);
        ALBUM_NO_PERMISSION = c0hvi3;
        C0HVI c0hvi4 = new C0HVI("NOT_NEED_ALBUM_PERMISSION", 3);
        NOT_NEED_ALBUM_PERMISSION = c0hvi4;
        C0HVI[] c0hviArr = {c0hvi, c0hvi2, c0hvi3, c0hvi4};
        LL = c0hviArr;
        LLILLJJLI = new C2254308sP(c0hviArr);
    }

    public static C0HVI[] values() {
        return (C0HVI[]) LL.clone();
    }

    public static C0HVI valueOf(String str) {
        return (C0HVI) C08FF.LIZ(C0HVI.class, str);
    }

    public C0HVI(String str, int i) {
    }
}
