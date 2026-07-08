package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I8D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8D {
    public static final C0I8D CENTER_CROP;
    public static final C0I8D FIT_CENTER;
    public static final C0I8D FIT_XY;
    public static final /* synthetic */ C0I8D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0I8D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I8D c0i8d = new C0I8D("FIT_XY", 0);
        FIT_XY = c0i8d;
        C0I8D c0i8d2 = new C0I8D("FIT_CENTER", 1);
        FIT_CENTER = c0i8d2;
        C0I8D c0i8d3 = new C0I8D("CENTER_CROP", 2);
        CENTER_CROP = c0i8d3;
        C0I8D[] c0i8dArr = {c0i8d, c0i8d2, c0i8d3};
        LL = c0i8dArr;
        LLILLJJLI = new C2254308sP(c0i8dArr);
    }

    public static C0I8D[] values() {
        return (C0I8D[]) LL.clone();
    }

    public static C0I8D valueOf(String str) {
        return (C0I8D) C08FF.LIZ(C0I8D.class, str);
    }

    public C0I8D(String str, int i) {
    }
}
