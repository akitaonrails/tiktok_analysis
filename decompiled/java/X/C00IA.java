package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IA {
    public static final C00IA CO_LINK;
    public static final C00IA LIVE_LINK;
    public static final /* synthetic */ C00IA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IA NONE;

    public static InterfaceC2044707zh<C00IA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IA c00ia = new C00IA("NONE", 0);
        NONE = c00ia;
        C00IA c00ia2 = new C00IA("CO_LINK", 1);
        CO_LINK = c00ia2;
        C00IA c00ia3 = new C00IA("LIVE_LINK", 2);
        LIVE_LINK = c00ia3;
        C00IA[] c00iaArr = {c00ia, c00ia2, c00ia3};
        LL = c00iaArr;
        LLILLJJLI = new C2254308sP(c00iaArr);
    }

    public static C00IA[] values() {
        return (C00IA[]) LL.clone();
    }

    public static C00IA valueOf(String str) {
        return (C00IA) C08FF.LIZ(C00IA.class, str);
    }

    public C00IA(String str, int i) {
    }
}
