package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OSF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OSF {
    public static final C0OSF FULL_SCREEN;
    public static final C0OSF HALF_SCREEN;
    public static final /* synthetic */ C0OSF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OSF NORMAL;

    public static InterfaceC2044707zh<C0OSF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OSF c0osf = new C0OSF("NORMAL", 0);
        NORMAL = c0osf;
        C0OSF c0osf2 = new C0OSF("HALF_SCREEN", 1);
        HALF_SCREEN = c0osf2;
        C0OSF c0osf3 = new C0OSF("FULL_SCREEN", 2);
        FULL_SCREEN = c0osf3;
        C0OSF[] c0osfArr = {c0osf, c0osf2, c0osf3};
        LL = c0osfArr;
        LLILLJJLI = new C2254308sP(c0osfArr);
    }

    public static C0OSF[] values() {
        return (C0OSF[]) LL.clone();
    }

    public static C0OSF valueOf(String str) {
        return (C0OSF) C08FF.LIZ(C0OSF.class, str);
    }

    public C0OSF(String str, int i) {
    }
}
