package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QOE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOE {
    public static final C0QOE BRAND;
    public static final C0QOE GENERAL;
    public static final /* synthetic */ C0QOE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QOE PROMOTION;
    public static final C0QOE STORE;
    public static final C0QOE TAB_PROMOTION;

    public static InterfaceC2044707zh<C0QOE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QOE c0qoe = new C0QOE("PROMOTION", 0);
        PROMOTION = c0qoe;
        C0QOE c0qoe2 = new C0QOE("TAB_PROMOTION", 1);
        TAB_PROMOTION = c0qoe2;
        C0QOE c0qoe3 = new C0QOE("STORE", 2);
        STORE = c0qoe3;
        C0QOE c0qoe4 = new C0QOE("GENERAL", 3);
        GENERAL = c0qoe4;
        C0QOE c0qoe5 = new C0QOE("BRAND", 4);
        BRAND = c0qoe5;
        C0QOE[] c0qoeArr = {c0qoe, c0qoe2, c0qoe3, c0qoe4, c0qoe5};
        LL = c0qoeArr;
        LLILLJJLI = new C2254308sP(c0qoeArr);
    }

    public static C0QOE[] values() {
        return (C0QOE[]) LL.clone();
    }

    public static C0QOE valueOf(String str) {
        return (C0QOE) C08FF.LIZ(C0QOE.class, str);
    }

    public C0QOE(String str, int i) {
    }
}
