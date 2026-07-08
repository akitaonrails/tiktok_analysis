package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I8C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8C {
    public static final C0I8C CENTER_CROP;
    public static final C0I8C FIT_CENTER;
    public static final C0I8C FIT_XY;
    public static final /* synthetic */ C0I8C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0I8C> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I8C c0i8c = new C0I8C("FIT_XY", 0);
        FIT_XY = c0i8c;
        C0I8C c0i8c2 = new C0I8C("FIT_CENTER", 1);
        FIT_CENTER = c0i8c2;
        C0I8C c0i8c3 = new C0I8C("CENTER_CROP", 2);
        CENTER_CROP = c0i8c3;
        C0I8C[] c0i8cArr = {c0i8c, c0i8c2, c0i8c3};
        LL = c0i8cArr;
        LLILLJJLI = new C2254308sP(c0i8cArr);
    }

    public static C0I8C[] values() {
        return (C0I8C[]) LL.clone();
    }

    public static C0I8C valueOf(String str) {
        return (C0I8C) C08FF.LIZ(C0I8C.class, str);
    }

    public C0I8C(String str, int i) {
    }
}
