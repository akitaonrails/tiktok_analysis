package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L97, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L97 {
    public static final C0L97 GRADIENT_LEGACY;
    public static final C0L97 GRADIENT_SOFT;
    public static final /* synthetic */ C0L97[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L97 PRIMARY_RED;
    public static final C0L97 SECONDARY_AUTO_CUT_BTN;

    public static InterfaceC2044707zh<C0L97> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L97 c0l97 = new C0L97("GRADIENT_SOFT", 0);
        GRADIENT_SOFT = c0l97;
        C0L97 c0l972 = new C0L97("GRADIENT_LEGACY", 1);
        GRADIENT_LEGACY = c0l972;
        C0L97 c0l973 = new C0L97("SECONDARY_AUTO_CUT_BTN", 2);
        SECONDARY_AUTO_CUT_BTN = c0l973;
        C0L97 c0l974 = new C0L97("PRIMARY_RED", 3);
        PRIMARY_RED = c0l974;
        C0L97[] c0l97Arr = {c0l97, c0l972, c0l973, c0l974};
        LL = c0l97Arr;
        LLILLJJLI = new C2254308sP(c0l97Arr);
    }

    public static C0L97[] values() {
        return (C0L97[]) LL.clone();
    }

    public static C0L97 valueOf(String str) {
        return (C0L97) C08FF.LIZ(C0L97.class, str);
    }

    public C0L97(String str, int i) {
    }
}
