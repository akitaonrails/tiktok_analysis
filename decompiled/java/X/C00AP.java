package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AP {
    public static final C00AP BUILT_IN;
    public static final C00AP DYNAMIC_FEATURE;
    public static final /* synthetic */ C00AP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00AP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00AP c00ap = new C00AP("BUILT_IN", 0);
        BUILT_IN = c00ap;
        C00AP c00ap2 = new C00AP("DYNAMIC_FEATURE", 1);
        DYNAMIC_FEATURE = c00ap2;
        C00AP[] c00apArr = {c00ap, c00ap2};
        LL = c00apArr;
        LLILLJJLI = new C2254308sP(c00apArr);
    }

    public static C00AP[] values() {
        return (C00AP[]) LL.clone();
    }

    public static C00AP valueOf(String str) {
        return (C00AP) C08FF.LIZ(C00AP.class, str);
    }

    public C00AP(String str, int i) {
    }
}
