package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DBL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBL {
    public static final /* synthetic */ C0DBL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DBL MAPPED_VALUE;
    public static final C0DBL RAW_CONTENT;

    public static InterfaceC2044707zh<C0DBL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DBL c0dbl = new C0DBL("MAPPED_VALUE", 0);
        MAPPED_VALUE = c0dbl;
        C0DBL c0dbl2 = new C0DBL("RAW_CONTENT", 1);
        RAW_CONTENT = c0dbl2;
        C0DBL[] c0dblArr = {c0dbl, c0dbl2};
        LL = c0dblArr;
        LLILLJJLI = new C2254308sP(c0dblArr);
    }

    public static C0DBL[] values() {
        return (C0DBL[]) LL.clone();
    }

    public static C0DBL valueOf(String str) {
        return (C0DBL) C08FF.LIZ(C0DBL.class, str);
    }

    public C0DBL(String str, int i) {
    }
}
