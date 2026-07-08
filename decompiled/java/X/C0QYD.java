package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QYD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QYD {
    public static final C0QYD COLOR;
    public static final C0QYD GRADIENT;
    public static final /* synthetic */ C0QYD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QYD URL;

    public static InterfaceC2044707zh<C0QYD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QYD c0qyd = new C0QYD("URL", 0);
        URL = c0qyd;
        C0QYD c0qyd2 = new C0QYD("COLOR", 1);
        COLOR = c0qyd2;
        C0QYD c0qyd3 = new C0QYD("GRADIENT", 2);
        GRADIENT = c0qyd3;
        C0QYD[] c0qydArr = {c0qyd, c0qyd2, c0qyd3};
        LL = c0qydArr;
        LLILLJJLI = new C2254308sP(c0qydArr);
    }

    public static C0QYD[] values() {
        return (C0QYD[]) LL.clone();
    }

    public static C0QYD valueOf(String str) {
        return (C0QYD) C08FF.LIZ(C0QYD.class, str);
    }

    public C0QYD(String str, int i) {
    }
}
