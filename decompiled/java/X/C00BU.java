package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BU {
    public static final C00BU EACH_TAB;
    public static final /* synthetic */ C00BU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BU ONLY_ALL;
    public static final C00BU ONLY_PHOTO;
    public static final C00BU ONLY_VIDEO;

    public static InterfaceC2044707zh<C00BU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BU c00bu = new C00BU("EACH_TAB", 0);
        EACH_TAB = c00bu;
        C00BU c00bu2 = new C00BU("ONLY_ALL", 1);
        ONLY_ALL = c00bu2;
        C00BU c00bu3 = new C00BU("ONLY_VIDEO", 2);
        ONLY_VIDEO = c00bu3;
        C00BU c00bu4 = new C00BU("ONLY_PHOTO", 3);
        ONLY_PHOTO = c00bu4;
        C00BU[] c00buArr = {c00bu, c00bu2, c00bu3, c00bu4};
        LL = c00buArr;
        LLILLJJLI = new C2254308sP(c00buArr);
    }

    public static C00BU[] values() {
        return (C00BU[]) LL.clone();
    }

    public static C00BU valueOf(String str) {
        return (C00BU) C08FF.LIZ(C00BU.class, str);
    }

    public C00BU(String str, int i) {
    }
}
