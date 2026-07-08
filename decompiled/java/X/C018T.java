package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.018T, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018T {
    public static final C018T Banner;
    public static final /* synthetic */ C018T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C018T Popup;
    public final String LL;

    public static InterfaceC2044707zh<C018T> getEntries() {
        return LLILLL;
    }

    static {
        C018T c018t = new C018T("Banner", 0, "banner");
        Banner = c018t;
        C018T c018t2 = new C018T("Popup", 1, "popup");
        Popup = c018t2;
        C018T[] c018tArr = {c018t, c018t2};
        LLILLJJLI = c018tArr;
        LLILLL = new C2254308sP(c018tArr);
    }

    public static C018T[] values() {
        return (C018T[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C018T valueOf(String str) {
        return (C018T) C08FF.LIZ(C018T.class, str);
    }

    public C018T(String str, int i, String str2) {
        this.LL = str2;
    }
}
