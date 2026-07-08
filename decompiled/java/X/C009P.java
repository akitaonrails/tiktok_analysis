package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009P {
    public static final /* synthetic */ C009P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009P LYNX_TEMPLATE_LOAD_SUCCESS;
    public static final C009P SPARK_VIEW_LOAD_FINISH;

    public static InterfaceC2044707zh<C009P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009P c009p = new C009P("SPARK_VIEW_LOAD_FINISH", 0);
        SPARK_VIEW_LOAD_FINISH = c009p;
        C009P c009p2 = new C009P("LYNX_TEMPLATE_LOAD_SUCCESS", 1);
        LYNX_TEMPLATE_LOAD_SUCCESS = c009p2;
        C009P[] c009pArr = {c009p, c009p2};
        LL = c009pArr;
        LLILLJJLI = new C2254308sP(c009pArr);
    }

    public static C009P[] values() {
        return (C009P[]) LL.clone();
    }

    public static C009P valueOf(String str) {
        return (C009P) C08FF.LIZ(C009P.class, str);
    }

    public C009P(String str, int i) {
    }
}
