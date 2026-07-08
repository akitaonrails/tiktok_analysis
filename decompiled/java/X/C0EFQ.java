package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFQ {
    public static final C0EFQ ICON_UPDATE;
    public static final C0EFQ LAYER_UPDATE;
    public static final /* synthetic */ C0EFQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0EFQ SELECT_UPDATE;

    public static InterfaceC2044707zh<C0EFQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0EFQ c0efq = new C0EFQ("SELECT_UPDATE", 0);
        SELECT_UPDATE = c0efq;
        C0EFQ c0efq2 = new C0EFQ("ICON_UPDATE", 1);
        ICON_UPDATE = c0efq2;
        C0EFQ c0efq3 = new C0EFQ("LAYER_UPDATE", 2);
        LAYER_UPDATE = c0efq3;
        C0EFQ[] c0efqArr = {c0efq, c0efq2, c0efq3};
        LL = c0efqArr;
        LLILLJJLI = new C2254308sP(c0efqArr);
    }

    public static C0EFQ[] values() {
        return (C0EFQ[]) LL.clone();
    }

    public static C0EFQ valueOf(String str) {
        return (C0EFQ) C08FF.LIZ(C0EFQ.class, str);
    }

    public C0EFQ(String str, int i) {
    }
}
