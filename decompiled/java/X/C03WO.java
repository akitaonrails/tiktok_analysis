package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03WO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WO {
    public static final C03WO COLLECT_INFO;
    public static final /* synthetic */ C03WO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03WO QUERY_RESULT;
    public final int LL;

    public static InterfaceC2044707zh<C03WO> getEntries() {
        return LLILLL;
    }

    static {
        C03WO c03wo = new C03WO("QUERY_RESULT", 0, 1);
        QUERY_RESULT = c03wo;
        C03WO c03wo2 = new C03WO("COLLECT_INFO", 1, 2);
        COLLECT_INFO = c03wo2;
        C03WO[] c03woArr = {c03wo, c03wo2};
        LLILLJJLI = c03woArr;
        LLILLL = new C2254308sP(c03woArr);
    }

    public static C03WO[] values() {
        return (C03WO[]) LLILLJJLI.clone();
    }

    public final int getStage() {
        return this.LL;
    }

    public static C03WO valueOf(String str) {
        return (C03WO) C08FF.LIZ(C03WO.class, str);
    }

    public C03WO(String str, int i, int i2) {
        this.LL = i2;
    }
}
