package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04I1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04I1 {
    public static final C04I1 DEFAULTPAGE;
    public static final /* synthetic */ C04I1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C04I1 PDPPAGE;
    public final int LL;

    public static InterfaceC2044707zh<C04I1> getEntries() {
        return LLILLL;
    }

    static {
        C04I1 c04i1 = new C04I1("DEFAULTPAGE", 0, 0);
        DEFAULTPAGE = c04i1;
        C04I1 c04i12 = new C04I1("PDPPAGE", 1, 1);
        PDPPAGE = c04i12;
        C04I1[] c04i1Arr = {c04i1, c04i12};
        LLILLJJLI = c04i1Arr;
        LLILLL = new C2254308sP(c04i1Arr);
    }

    public static C04I1[] values() {
        return (C04I1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C04I1 valueOf(String str) {
        return (C04I1) C08FF.LIZ(C04I1.class, str);
    }

    public C04I1(String str, int i, int i2) {
        this.LL = i2;
    }
}
