package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01AP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AP {
    public static final C01AP ALL_GIFTS;
    public static final C01AP INCLUDE_HIDDEN_GIFTS;
    public static final /* synthetic */ C01AP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C01AP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C01AP c01ap = new C01AP("ALL_GIFTS", 0);
        ALL_GIFTS = c01ap;
        C01AP c01ap2 = new C01AP("INCLUDE_HIDDEN_GIFTS", 1);
        INCLUDE_HIDDEN_GIFTS = c01ap2;
        C01AP[] c01apArr = {c01ap, c01ap2};
        LL = c01apArr;
        LLILLJJLI = new C2254308sP(c01apArr);
    }

    public static C01AP[] values() {
        return (C01AP[]) LL.clone();
    }

    public static C01AP valueOf(String str) {
        return (C01AP) C08FF.LIZ(C01AP.class, str);
    }

    public C01AP(String str, int i) {
    }
}
