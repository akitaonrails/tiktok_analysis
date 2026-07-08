package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009H {
    public static final C009H DRAG_CLEAN;
    public static final C009H FULL_CLEAN;
    public static final /* synthetic */ C009H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009H NO_CLEAN;
    public static final C009H TITLE_CLEAN;

    public static InterfaceC2044707zh<C009H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009H c009h = new C009H("NO_CLEAN", 0);
        NO_CLEAN = c009h;
        C009H c009h2 = new C009H("DRAG_CLEAN", 1);
        DRAG_CLEAN = c009h2;
        C009H c009h3 = new C009H("FULL_CLEAN", 2);
        FULL_CLEAN = c009h3;
        C009H c009h4 = new C009H("TITLE_CLEAN", 3);
        TITLE_CLEAN = c009h4;
        C009H[] c009hArr = {c009h, c009h2, c009h3, c009h4};
        LL = c009hArr;
        LLILLJJLI = new C2254308sP(c009hArr);
    }

    public static C009H[] values() {
        return (C009H[]) LL.clone();
    }

    public static C009H valueOf(String str) {
        return (C009H) C08FF.LIZ(C009H.class, str);
    }

    public C009H(String str, int i) {
    }
}
