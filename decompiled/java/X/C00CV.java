package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CV {
    public static final /* synthetic */ C00CV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00CV SCENE_DETAIL_REGIONAL_POI;
    public static final C00CV SCENE_NEARBY_TAB;
    public static final C00CV SCENE_UNKNOWN;

    public static InterfaceC2044707zh<C00CV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CV c00cv = new C00CV("SCENE_UNKNOWN", 0);
        SCENE_UNKNOWN = c00cv;
        C00CV c00cv2 = new C00CV("SCENE_NEARBY_TAB", 1);
        SCENE_NEARBY_TAB = c00cv2;
        C00CV c00cv3 = new C00CV("SCENE_DETAIL_REGIONAL_POI", 2);
        SCENE_DETAIL_REGIONAL_POI = c00cv3;
        C00CV[] c00cvArr = {c00cv, c00cv2, c00cv3};
        LL = c00cvArr;
        LLILLJJLI = new C2254308sP(c00cvArr);
    }

    public static C00CV[] values() {
        return (C00CV[]) LL.clone();
    }

    public static C00CV valueOf(String str) {
        return (C00CV) C08FF.LIZ(C00CV.class, str);
    }

    public C00CV(String str, int i) {
    }
}
