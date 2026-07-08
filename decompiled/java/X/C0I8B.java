package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I8B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8B {
    public static final C0I8B CIRCLE;
    public static final /* synthetic */ C0I8B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I8B ROUNDED_CORNER;

    public static InterfaceC2044707zh<C0I8B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I8B c0i8b = new C0I8B("ROUNDED_CORNER", 0);
        ROUNDED_CORNER = c0i8b;
        C0I8B c0i8b2 = new C0I8B("CIRCLE", 1);
        CIRCLE = c0i8b2;
        C0I8B[] c0i8bArr = {c0i8b, c0i8b2};
        LL = c0i8bArr;
        LLILLJJLI = new C2254308sP(c0i8bArr);
    }

    public static C0I8B[] values() {
        return (C0I8B[]) LL.clone();
    }

    public static C0I8B valueOf(String str) {
        return (C0I8B) C08FF.LIZ(C0I8B.class, str);
    }

    public C0I8B(String str, int i) {
    }
}
