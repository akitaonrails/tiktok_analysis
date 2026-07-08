package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BC {
    public static final /* synthetic */ C00BC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BC REFRESH_CART_COUNT;

    public static InterfaceC2044707zh<C00BC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BC c00bc = new C00BC();
        REFRESH_CART_COUNT = c00bc;
        C00BC[] c00bcArr = {c00bc};
        LL = c00bcArr;
        LLILLJJLI = new C2254308sP(c00bcArr);
    }

    public static C00BC[] values() {
        return (C00BC[]) LL.clone();
    }

    public static C00BC valueOf(String str) {
        return (C00BC) C08FF.LIZ(C00BC.class, str);
    }
}
