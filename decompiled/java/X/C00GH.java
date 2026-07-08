package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GH {
    public static final C00GH HIGH;
    public static final /* synthetic */ C00GH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00GH LOW;
    public static final C00GH MEDIUM;

    public static InterfaceC2044707zh<C00GH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00GH c00gh = new C00GH("HIGH", 0);
        HIGH = c00gh;
        C00GH c00gh2 = new C00GH("MEDIUM", 1);
        MEDIUM = c00gh2;
        C00GH c00gh3 = new C00GH("LOW", 2);
        LOW = c00gh3;
        C00GH[] c00ghArr = {c00gh, c00gh2, c00gh3};
        LL = c00ghArr;
        LLILLJJLI = new C2254308sP(c00ghArr);
    }

    public static C00GH[] values() {
        return (C00GH[]) LL.clone();
    }

    public static C00GH valueOf(String str) {
        return (C00GH) C08FF.LIZ(C00GH.class, str);
    }

    public C00GH(String str, int i) {
    }
}
