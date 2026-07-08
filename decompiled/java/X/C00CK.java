package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CK {
    public static final C00CK ADDED;
    public static final C00CK ALL;
    public static final /* synthetic */ C00CK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00CK NEW;
    public static final C00CK SET_PROFILE;
    public static final C00CK TOP;
    public static final C00CK TRENDING_VIDEOS;
    public final int LL;

    public static InterfaceC2044707zh<C00CK> getEntries() {
        return LLILLL;
    }

    static {
        C00CK c00ck = new C00CK("TOP", 0, 0);
        TOP = c00ck;
        C00CK c00ck2 = new C00CK("TRENDING_VIDEOS", 1, 1);
        TRENDING_VIDEOS = c00ck2;
        C00CK c00ck3 = new C00CK("NEW", 2, 2);
        NEW = c00ck3;
        C00CK c00ck4 = new C00CK("ALL", 3, 3);
        ALL = c00ck4;
        C00CK c00ck5 = new C00CK("ADDED", 4, 4);
        ADDED = c00ck5;
        C00CK c00ck6 = new C00CK("SET_PROFILE", 5, 5);
        SET_PROFILE = c00ck6;
        C00CK[] c00ckArr = {c00ck, c00ck2, c00ck3, c00ck4, c00ck5, c00ck6};
        LLILLJJLI = c00ckArr;
        LLILLL = new C2254308sP(c00ckArr);
    }

    public static C00CK[] values() {
        return (C00CK[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C00CK valueOf(String str) {
        return (C00CK) C08FF.LIZ(C00CK.class, str);
    }

    public C00CK(String str, int i, int i2) {
        this.LL = i2;
    }
}
