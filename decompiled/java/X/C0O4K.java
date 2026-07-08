package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O4K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O4K {
    public static final C0O4K BOOK;
    public static final /* synthetic */ C0O4K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0O4K MOVIE;
    public final int LL;

    public static InterfaceC2044707zh<C0O4K> getEntries() {
        return LLILLL;
    }

    static {
        C0O4K c0o4k = new C0O4K("BOOK", 0, EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE());
        BOOK = c0o4k;
        C0O4K c0o4k2 = new C0O4K("MOVIE", 1, EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE());
        MOVIE = c0o4k2;
        C0O4K[] c0o4kArr = {c0o4k, c0o4k2};
        LLILLJJLI = c0o4kArr;
        LLILLL = new C2254308sP(c0o4kArr);
    }

    public static C0O4K[] values() {
        return (C0O4K[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0O4K valueOf(String str) {
        return (C0O4K) C08FF.LIZ(C0O4K.class, str);
    }

    public C0O4K(String str, int i, int i2) {
        this.LL = i2;
    }
}
