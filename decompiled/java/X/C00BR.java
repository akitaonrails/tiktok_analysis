package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BR {
    public static final /* synthetic */ C00BR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BR ONE_BY_ONE;
    public static final C00BR SINGLE_START;

    public static InterfaceC2044707zh<C00BR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BR c00br = new C00BR("ONE_BY_ONE", 0);
        ONE_BY_ONE = c00br;
        C00BR c00br2 = new C00BR("SINGLE_START", 1);
        SINGLE_START = c00br2;
        C00BR[] c00brArr = {c00br, c00br2};
        LL = c00brArr;
        LLILLJJLI = new C2254308sP(c00brArr);
    }

    public static C00BR[] values() {
        return (C00BR[]) LL.clone();
    }

    public static C00BR valueOf(String str) {
        return (C00BR) C08FF.LIZ(C00BR.class, str);
    }

    public C00BR(String str, int i) {
    }
}
