package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TVM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TVM {
    public static final /* synthetic */ C0TVM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TVM ONLINE;
    public static final C0TVM ORANGE_BAG;
    public static final C0TVM ORANGE_CART;

    public static InterfaceC2044707zh<C0TVM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TVM c0tvm = new C0TVM("ONLINE", 0);
        ONLINE = c0tvm;
        C0TVM c0tvm2 = new C0TVM("ORANGE_BAG", 1);
        ORANGE_BAG = c0tvm2;
        C0TVM c0tvm3 = new C0TVM("ORANGE_CART", 2);
        ORANGE_CART = c0tvm3;
        C0TVM[] c0tvmArr = {c0tvm, c0tvm2, c0tvm3};
        LL = c0tvmArr;
        LLILLJJLI = new C2254308sP(c0tvmArr);
    }

    public static C0TVM[] values() {
        return (C0TVM[]) LL.clone();
    }

    public static C0TVM valueOf(String str) {
        return (C0TVM) C08FF.LIZ(C0TVM.class, str);
    }

    public C0TVM(String str, int i) {
    }
}
