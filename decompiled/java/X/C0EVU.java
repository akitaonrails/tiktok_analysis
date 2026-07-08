package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EVU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVU {
    public static final C0EVU ADJUST_CANVAS;
    public static final /* synthetic */ C0EVU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0EVU MATERIAL;
    public static final C0EVU SLIDE_OUT_EP_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<C0EVU> getEntries() {
        return LLILLL;
    }

    static {
        C0EVU c0evu = new C0EVU("MATERIAL", 0, 100);
        MATERIAL = c0evu;
        C0EVU c0evu2 = new C0EVU("ADJUST_CANVAS", 1, 1);
        ADJUST_CANVAS = c0evu2;
        C0EVU c0evu3 = new C0EVU("SLIDE_OUT_EP_PAGE", 2, 0);
        SLIDE_OUT_EP_PAGE = c0evu3;
        C0EVU[] c0evuArr = {c0evu, c0evu2, c0evu3};
        LLILLJJLI = c0evuArr;
        LLILLL = new C2254308sP(c0evuArr);
    }

    public static C0EVU[] values() {
        return (C0EVU[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static C0EVU valueOf(String str) {
        return (C0EVU) C08FF.LIZ(C0EVU.class, str);
    }

    public C0EVU(String str, int i, int i2) {
        this.LL = i2;
    }
}
