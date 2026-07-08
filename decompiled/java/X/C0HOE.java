package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HOE {
    public static final C0HOE AISELF_MUF;
    public static final C0HOE AISELF_SELF;
    public static final C0HOF Companion;
    public static final /* synthetic */ C0HOE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HOE SA_MIXED;
    public static final C0HOE SA_MUF;
    public static final C0HOE SA_SELF;
    public final String LL;

    public static InterfaceC2044707zh<C0HOE> getEntries() {
        return LLILLL;
    }

    static {
        C0HOE c0hoe = new C0HOE("SA_SELF", 0, "sa_self");
        SA_SELF = c0hoe;
        C0HOE c0hoe2 = new C0HOE("SA_MUF", 1, "sa_muf");
        SA_MUF = c0hoe2;
        C0HOE c0hoe3 = new C0HOE("SA_MIXED", 2, "sa_mixed");
        SA_MIXED = c0hoe3;
        C0HOE c0hoe4 = new C0HOE("AISELF_SELF", 3, "aiself_self");
        AISELF_SELF = c0hoe4;
        C0HOE c0hoe5 = new C0HOE("AISELF_MUF", 4, "aiself_muf");
        AISELF_MUF = c0hoe5;
        C0HOE[] c0hoeArr = {c0hoe, c0hoe2, c0hoe3, c0hoe4, c0hoe5};
        LLILLJJLI = c0hoeArr;
        LLILLL = new C2254308sP(c0hoeArr);
        Companion = new C0HOF();
    }

    public static C0HOE[] values() {
        return (C0HOE[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0HOE valueOf(String str) {
        return (C0HOE) C08FF.LIZ(C0HOE.class, str);
    }

    public C0HOE(String str, int i, String str2) {
        this.LL = str2;
    }
}
