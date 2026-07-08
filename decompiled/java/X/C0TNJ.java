package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TNJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TNJ {
    public static final C0TNJ ECOM_LIVE;
    public static final /* synthetic */ C0TNJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TNJ PROGRAMMED_LIVE;
    public static final C0TNJ UNDEFINED;

    public static InterfaceC2044707zh<C0TNJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TNJ c0tnj = new C0TNJ("UNDEFINED", 0);
        UNDEFINED = c0tnj;
        C0TNJ c0tnj2 = new C0TNJ("PROGRAMMED_LIVE", 1);
        PROGRAMMED_LIVE = c0tnj2;
        C0TNJ c0tnj3 = new C0TNJ("ECOM_LIVE", 2);
        ECOM_LIVE = c0tnj3;
        C0TNJ[] c0tnjArr = {c0tnj, c0tnj2, c0tnj3};
        LL = c0tnjArr;
        LLILLJJLI = new C2254308sP(c0tnjArr);
    }

    public static C0TNJ[] values() {
        return (C0TNJ[]) LL.clone();
    }

    public static C0TNJ valueOf(String str) {
        return (C0TNJ) C08FF.LIZ(C0TNJ.class, str);
    }

    public C0TNJ(String str, int i) {
    }
}
