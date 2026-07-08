package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009M {
    public static final C009M ICON_LIST;
    public static final /* synthetic */ C009M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009M MAIN_TEMPLATE;

    public static InterfaceC2044707zh<C009M> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009M c009m = new C009M("MAIN_TEMPLATE", 0);
        MAIN_TEMPLATE = c009m;
        C009M c009m2 = new C009M("ICON_LIST", 1);
        ICON_LIST = c009m2;
        C009M[] c009mArr = {c009m, c009m2};
        LL = c009mArr;
        LLILLJJLI = new C2254308sP(c009mArr);
    }

    public static C009M[] values() {
        return (C009M[]) LL.clone();
    }

    public static C009M valueOf(String str) {
        return (C009M) C08FF.LIZ(C009M.class, str);
    }

    public C009M(String str, int i) {
    }
}
