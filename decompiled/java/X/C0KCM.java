package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KCM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCM {
    public static final C0KCM BOTTOM_ASSEM;
    public static final C0KCM CONTENT_ASSEM;
    public static final /* synthetic */ C0KCM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KCM TOP_NAVIGATION_ASSEM;

    public static InterfaceC2044707zh<C0KCM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KCM c0kcm = new C0KCM("TOP_NAVIGATION_ASSEM", 0);
        TOP_NAVIGATION_ASSEM = c0kcm;
        C0KCM c0kcm2 = new C0KCM("CONTENT_ASSEM", 1);
        CONTENT_ASSEM = c0kcm2;
        C0KCM c0kcm3 = new C0KCM("BOTTOM_ASSEM", 2);
        BOTTOM_ASSEM = c0kcm3;
        C0KCM[] c0kcmArr = {c0kcm, c0kcm2, c0kcm3};
        LL = c0kcmArr;
        LLILLJJLI = new C2254308sP(c0kcmArr);
    }

    public static C0KCM[] values() {
        return (C0KCM[]) LL.clone();
    }

    public static C0KCM valueOf(String str) {
        return (C0KCM) C08FF.LIZ(C0KCM.class, str);
    }

    public C0KCM(String str, int i) {
    }
}
