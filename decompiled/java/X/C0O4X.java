package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O4X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O4X {
    public static final C0O4X BOOK;
    public static final /* synthetic */ C0O4X[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final C0O4X MOVIE;
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<C0O4X> getEntries() {
        return LLILZIL;
    }

    static {
        C0O4X c0o4x = new C0O4X("BOOK", 0, 1, "booktok", "book");
        BOOK = c0o4x;
        C0O4X c0o4x2 = new C0O4X("MOVIE", 1, 2, "movietok", "movie");
        MOVIE = c0o4x2;
        C0O4X[] c0o4xArr = {c0o4x, c0o4x2};
        LLILZ = c0o4xArr;
        LLILZIL = new C2254308sP(c0o4xArr);
    }

    public static C0O4X[] values() {
        return (C0O4X[]) LLILZ.clone();
    }

    public final String getBusiness() {
        return this.LLILLJJLI;
    }

    public final String getCategory() {
        return this.LLILLL;
    }

    public final int getType() {
        return this.LL;
    }

    public static C0O4X valueOf(String str) {
        return (C0O4X) C08FF.LIZ(C0O4X.class, str);
    }

    public C0O4X(String str, int i, int i2, String str2, String str3) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
