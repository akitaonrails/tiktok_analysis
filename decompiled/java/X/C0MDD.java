package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MDD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDD {
    public static final C0MDD CANCEL;
    public static final C0MDD GENERATE;
    public static final /* synthetic */ C0MDD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0MDD> getEntries() {
        return LLILLL;
    }

    static {
        C0MDD c0mdd = new C0MDD("GENERATE", 0, "generate");
        GENERATE = c0mdd;
        C0MDD c0mdd2 = new C0MDD("CANCEL", 1, "cancel");
        CANCEL = c0mdd2;
        C0MDD[] c0mddArr = {c0mdd, c0mdd2};
        LLILLJJLI = c0mddArr;
        LLILLL = new C2254308sP(c0mddArr);
    }

    public static C0MDD[] values() {
        return (C0MDD[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static C0MDD valueOf(String str) {
        return (C0MDD) C08FF.LIZ(C0MDD.class, str);
    }

    public C0MDD(String str, int i, String str2) {
        this.LL = str2;
    }
}
