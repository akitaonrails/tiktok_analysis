package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I5H, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5H {
    public static final C0I5H CIRCLE;
    public static final /* synthetic */ C0I5H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I5H ROUNDED_CORNER;

    public static InterfaceC2044707zh<C0I5H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I5H c0i5h = new C0I5H("ROUNDED_CORNER", 0);
        ROUNDED_CORNER = c0i5h;
        C0I5H c0i5h2 = new C0I5H("CIRCLE", 1);
        CIRCLE = c0i5h2;
        C0I5H[] c0i5hArr = {c0i5h, c0i5h2};
        LL = c0i5hArr;
        LLILLJJLI = new C2254308sP(c0i5hArr);
    }

    public static C0I5H[] values() {
        return (C0I5H[]) LL.clone();
    }

    public static C0I5H valueOf(String str) {
        return (C0I5H) C08FF.LIZ(C0I5H.class, str);
    }

    public C0I5H(String str, int i) {
    }
}
