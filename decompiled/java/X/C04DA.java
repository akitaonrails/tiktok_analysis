package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04DA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04DA {
    public static final /* synthetic */ C04DA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C04DA PRODUCT;
    public static final C04DA SKC;
    public static final C04DA SKU;

    public static InterfaceC2044707zh<C04DA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C04DA c04da = new C04DA("PRODUCT", 0);
        PRODUCT = c04da;
        C04DA c04da2 = new C04DA("SKU", 1);
        SKU = c04da2;
        C04DA c04da3 = new C04DA("SKC", 2);
        SKC = c04da3;
        C04DA[] c04daArr = {c04da, c04da2, c04da3};
        LL = c04daArr;
        LLILLJJLI = new C2254308sP(c04daArr);
    }

    public static C04DA[] values() {
        return (C04DA[]) LL.clone();
    }

    public static C04DA valueOf(String str) {
        return (C04DA) C08FF.LIZ(C04DA.class, str);
    }

    public C04DA(String str, int i) {
    }
}
