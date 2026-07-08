package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BP {
    public static final C00BP CART_TOOLTIP;
    public static final /* synthetic */ C00BP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "w3792";

    public static InterfaceC2044707zh<C00BP> getEntries() {
        return LLILLL;
    }

    static {
        C00BP c00bp = new C00BP();
        CART_TOOLTIP = c00bp;
        C00BP[] c00bpArr = {c00bp};
        LLILLJJLI = c00bpArr;
        LLILLL = new C2254308sP(c00bpArr);
    }

    public static C00BP[] values() {
        return (C00BP[]) LLILLJJLI.clone();
    }

    public final String getWCode() {
        return this.LL;
    }

    public static C00BP valueOf(String str) {
        return (C00BP) C08FF.LIZ(C00BP.class, str);
    }
}
