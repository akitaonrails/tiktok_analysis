package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D7U, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7U {
    public static final C0D7U FullPageModel;
    public static final /* synthetic */ C0D7U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D7U OneStepModel;

    public static InterfaceC2044707zh<C0D7U> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D7U c0d7u = new C0D7U("FullPageModel", 0);
        FullPageModel = c0d7u;
        C0D7U c0d7u2 = new C0D7U("OneStepModel", 1);
        OneStepModel = c0d7u2;
        C0D7U[] c0d7uArr = {c0d7u, c0d7u2};
        LL = c0d7uArr;
        LLILLJJLI = new C2254308sP(c0d7uArr);
    }

    public static C0D7U[] values() {
        return (C0D7U[]) LL.clone();
    }

    public static C0D7U valueOf(String str) {
        return (C0D7U) C08FF.LIZ(C0D7U.class, str);
    }

    public C0D7U(String str, int i) {
    }
}
