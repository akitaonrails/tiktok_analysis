package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHJ {
    public static final C0NHJ AFTER_LOAD_MORE;
    public static final C0NHJ CACHE_NOT_ENOUGH;
    public static final C0NHJ DEBUG;
    public static final C0NHJ ENTER_BACKGROUND;
    public static final C0NHJ INITIALIZE;
    public static final /* synthetic */ C0NHJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0NHJ> getEntries() {
        return LLILLL;
    }

    static {
        C0NHJ c0nhj = new C0NHJ("INITIALIZE", 0, 0);
        INITIALIZE = c0nhj;
        C0NHJ c0nhj2 = new C0NHJ("CACHE_NOT_ENOUGH", 1, 1);
        CACHE_NOT_ENOUGH = c0nhj2;
        C0NHJ c0nhj3 = new C0NHJ("ENTER_BACKGROUND", 2, 2);
        ENTER_BACKGROUND = c0nhj3;
        C0NHJ c0nhj4 = new C0NHJ("AFTER_LOAD_MORE", 3, 3);
        AFTER_LOAD_MORE = c0nhj4;
        C0NHJ c0nhj5 = new C0NHJ("DEBUG", 4, 4);
        DEBUG = c0nhj5;
        C0NHJ[] c0nhjArr = {c0nhj, c0nhj2, c0nhj3, c0nhj4, c0nhj5};
        LLILLJJLI = c0nhjArr;
        LLILLL = new C2254308sP(c0nhjArr);
    }

    public static C0NHJ[] values() {
        return (C0NHJ[]) LLILLJJLI.clone();
    }

    public final int getReasonInt() {
        return this.LL;
    }

    public static C0NHJ valueOf(String str) {
        return (C0NHJ) C08FF.LIZ(C0NHJ.class, str);
    }

    public C0NHJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
