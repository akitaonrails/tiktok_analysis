package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NDM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDM {
    public static final C0NDM ALL_CACHE;
    public static final C0NDM COLD_CACHE;
    public static final /* synthetic */ C0NDM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NDM UNCONSUMED_CACHE;
    public final int LL;

    public static InterfaceC2044707zh<C0NDM> getEntries() {
        return LLILLL;
    }

    static {
        C0NDM c0ndm = new C0NDM("ALL_CACHE", 0, -1001);
        ALL_CACHE = c0ndm;
        C0NDM c0ndm2 = new C0NDM("COLD_CACHE", 1, 1);
        COLD_CACHE = c0ndm2;
        C0NDM c0ndm3 = new C0NDM("UNCONSUMED_CACHE", 2, 2);
        UNCONSUMED_CACHE = c0ndm3;
        C0NDM[] c0ndmArr = {c0ndm, c0ndm2, c0ndm3};
        LLILLJJLI = c0ndmArr;
        LLILLL = new C2254308sP(c0ndmArr);
    }

    public static C0NDM[] values() {
        return (C0NDM[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0NDM valueOf(String str) {
        return (C0NDM) C08FF.LIZ(C0NDM.class, str);
    }

    public C0NDM(String str, int i, int i2) {
        this.LL = i2;
    }
}
