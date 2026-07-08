package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJY {
    public static final C0MJY AIGC;
    public static final C0MJY ECOMMERCE_COMMENT;
    public static final /* synthetic */ C0MJY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0MJY PHOTO_SEARCH;
    public final int LL;

    public static InterfaceC2044707zh<C0MJY> getEntries() {
        return LLILLL;
    }

    static {
        C0MJY c0mjy = new C0MJY("ECOMMERCE_COMMENT", 0, 0);
        ECOMMERCE_COMMENT = c0mjy;
        C0MJY c0mjy2 = new C0MJY("PHOTO_SEARCH", 1, 1);
        PHOTO_SEARCH = c0mjy2;
        C0MJY c0mjy3 = new C0MJY("AIGC", 2, 2);
        AIGC = c0mjy3;
        C0MJY[] c0mjyArr = {c0mjy, c0mjy2, c0mjy3};
        LLILLJJLI = c0mjyArr;
        LLILLL = new C2254308sP(c0mjyArr);
    }

    public static C0MJY[] values() {
        return (C0MJY[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0MJY valueOf(String str) {
        return (C0MJY) C08FF.LIZ(C0MJY.class, str);
    }

    public C0MJY(String str, int i, int i2) {
        this.LL = i2;
    }
}
