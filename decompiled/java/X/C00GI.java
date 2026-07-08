package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GI {
    public static final C00GI HIGH;
    public static final /* synthetic */ C00GI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00GI LOW;
    public static final C00GI NORMAL;

    public static InterfaceC2044707zh<C00GI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00GI c00gi = new C00GI("HIGH", 0);
        HIGH = c00gi;
        C00GI c00gi2 = new C00GI("NORMAL", 1);
        NORMAL = c00gi2;
        C00GI c00gi3 = new C00GI("LOW", 2);
        LOW = c00gi3;
        C00GI[] c00giArr = {c00gi, c00gi2, c00gi3};
        LL = c00giArr;
        LLILLJJLI = new C2254308sP(c00giArr);
    }

    public static C00GI[] values() {
        return (C00GI[]) LL.clone();
    }

    public static C00GI valueOf(String str) {
        return (C00GI) C08FF.LIZ(C00GI.class, str);
    }

    public C00GI(String str, int i) {
    }
}
