package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15AG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15AG {
    public static final C15AG ALPHA;
    public static final C15AG CUSTOMIZE;
    public static final /* synthetic */ C15AG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15AG LOTTIE;
    public static final C15AG NONE;
    public static final C15AG ORIGIN;
    public static final C15AG SCALE;
    public static final C15AG SIZE;
    public static final C15AG TRANSLATE;
    public static final C15AG Z_ORDER;

    public static InterfaceC2044707zh<C15AG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15AG c15ag = new C15AG("ALPHA", 0);
        ALPHA = c15ag;
        C15AG c15ag2 = new C15AG("ORIGIN", 1);
        ORIGIN = c15ag2;
        C15AG c15ag3 = new C15AG("SCALE", 2);
        SCALE = c15ag3;
        C15AG c15ag4 = new C15AG("TRANSLATE", 3);
        TRANSLATE = c15ag4;
        C15AG c15ag5 = new C15AG("SIZE", 4);
        SIZE = c15ag5;
        C15AG c15ag6 = new C15AG("Z_ORDER", 5);
        Z_ORDER = c15ag6;
        C15AG c15ag7 = new C15AG("LOTTIE", 6);
        LOTTIE = c15ag7;
        C15AG c15ag8 = new C15AG("NONE", 7);
        NONE = c15ag8;
        C15AG c15ag9 = new C15AG("CUSTOMIZE", 8);
        CUSTOMIZE = c15ag9;
        C15AG[] c15agArr = {c15ag, c15ag2, c15ag3, c15ag4, c15ag5, c15ag6, c15ag7, c15ag8, c15ag9};
        LL = c15agArr;
        LLILLJJLI = new C2254308sP(c15agArr);
    }

    public static C15AG[] values() {
        return (C15AG[]) LL.clone();
    }

    public static C15AG valueOf(String str) {
        return (C15AG) C08FF.LIZ(C15AG.class, str);
    }

    public C15AG(String str, int i) {
    }
}
