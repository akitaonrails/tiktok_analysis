package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CV {
    public static final C03CV GEN_TYPE_COMBINE_GIFT;
    public static final C03CV GEN_TYPE_DEFAULT;
    public static final C03CV GEN_TYPE_SUB_GIFT;
    public static final C03CV GEN_TYPE_SUB_GIFT2;
    public static final /* synthetic */ C03CV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C03CV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03CV c03cv = new C03CV("GEN_TYPE_DEFAULT", 0);
        GEN_TYPE_DEFAULT = c03cv;
        C03CV c03cv2 = new C03CV("GEN_TYPE_SUB_GIFT", 1);
        GEN_TYPE_SUB_GIFT = c03cv2;
        C03CV c03cv3 = new C03CV("GEN_TYPE_SUB_GIFT2", 2);
        GEN_TYPE_SUB_GIFT2 = c03cv3;
        C03CV c03cv4 = new C03CV("GEN_TYPE_COMBINE_GIFT", 3);
        GEN_TYPE_COMBINE_GIFT = c03cv4;
        C03CV[] c03cvArr = {c03cv, c03cv2, c03cv3, c03cv4};
        LL = c03cvArr;
        LLILLJJLI = new C2254308sP(c03cvArr);
    }

    public static C03CV[] values() {
        return (C03CV[]) LL.clone();
    }

    public static C03CV valueOf(String str) {
        return (C03CV) C08FF.LIZ(C03CV.class, str);
    }

    public C03CV(String str, int i) {
    }
}
