package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LHU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LHU {
    public static final C0LHU CREATE_TAB_ALBUM_GUIDE;
    public static final C0LHU CREATE_TAB_BACKGROUND;
    public static final /* synthetic */ C0LHU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LHU LOTTIE;
    public static final C0LHU OTHER;

    public static InterfaceC2044707zh<C0LHU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LHU c0lhu = new C0LHU("CREATE_TAB_BACKGROUND", 0);
        CREATE_TAB_BACKGROUND = c0lhu;
        C0LHU c0lhu2 = new C0LHU("LOTTIE", 1);
        LOTTIE = c0lhu2;
        C0LHU c0lhu3 = new C0LHU("CREATE_TAB_ALBUM_GUIDE", 2);
        CREATE_TAB_ALBUM_GUIDE = c0lhu3;
        C0LHU c0lhu4 = new C0LHU("OTHER", 3);
        OTHER = c0lhu4;
        C0LHU[] c0lhuArr = {c0lhu, c0lhu2, c0lhu3, c0lhu4};
        LL = c0lhuArr;
        LLILLJJLI = new C2254308sP(c0lhuArr);
    }

    public static C0LHU[] values() {
        return (C0LHU[]) LL.clone();
    }

    public static C0LHU valueOf(String str) {
        return (C0LHU) C08FF.LIZ(C0LHU.class, str);
    }

    public C0LHU(String str, int i) {
    }
}
