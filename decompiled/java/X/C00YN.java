package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00YN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YN {
    public static final C00YN LIVE_SHOW_END;
    public static final /* synthetic */ C00YN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00YN MASK_CLICK;

    public static InterfaceC2044707zh<C00YN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00YN c00yn = new C00YN("MASK_CLICK", 0);
        MASK_CLICK = c00yn;
        C00YN c00yn2 = new C00YN("LIVE_SHOW_END", 1);
        LIVE_SHOW_END = c00yn2;
        C00YN[] c00ynArr = {c00yn, c00yn2};
        LL = c00ynArr;
        LLILLJJLI = new C2254308sP(c00ynArr);
    }

    public static C00YN[] values() {
        return (C00YN[]) LL.clone();
    }

    public static C00YN valueOf(String str) {
        return (C00YN) C08FF.LIZ(C00YN.class, str);
    }

    public C00YN(String str, int i) {
    }
}
