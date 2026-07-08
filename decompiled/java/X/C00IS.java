package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IS {
    public static final /* synthetic */ C00IS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IS SOURCE_IM;
    public static final C00IS SOURCE_SEI;

    public static InterfaceC2044707zh<C00IS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IS c00is = new C00IS("SOURCE_SEI", 0);
        SOURCE_SEI = c00is;
        C00IS c00is2 = new C00IS("SOURCE_IM", 1);
        SOURCE_IM = c00is2;
        C00IS[] c00isArr = {c00is, c00is2};
        LL = c00isArr;
        LLILLJJLI = new C2254308sP(c00isArr);
    }

    public static C00IS[] values() {
        return (C00IS[]) LL.clone();
    }

    public static C00IS valueOf(String str) {
        return (C00IS) C08FF.LIZ(C00IS.class, str);
    }

    public C00IS(String str, int i) {
    }
}
