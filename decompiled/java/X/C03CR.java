package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CR {
    public static final /* synthetic */ C03CR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03CR SEA_COMBINED_SKU;
    public static final C03CR SEA_FULL_SCREEN;
    public static final C03CR US_COMBINED_SKU;
    public static final C03CR US_FULL_SCREEN;

    public static InterfaceC2044707zh<C03CR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03CR c03cr = new C03CR("US_FULL_SCREEN", 0);
        US_FULL_SCREEN = c03cr;
        C03CR c03cr2 = new C03CR("SEA_FULL_SCREEN", 1);
        SEA_FULL_SCREEN = c03cr2;
        C03CR c03cr3 = new C03CR("US_COMBINED_SKU", 2);
        US_COMBINED_SKU = c03cr3;
        C03CR c03cr4 = new C03CR("SEA_COMBINED_SKU", 3);
        SEA_COMBINED_SKU = c03cr4;
        C03CR[] c03crArr = {c03cr, c03cr2, c03cr3, c03cr4};
        LL = c03crArr;
        LLILLJJLI = new C2254308sP(c03crArr);
    }

    public static C03CR[] values() {
        return (C03CR[]) LL.clone();
    }

    public static C03CR valueOf(String str) {
        return (C03CR) C08FF.LIZ(C03CR.class, str);
    }

    public C03CR(String str, int i) {
    }
}
