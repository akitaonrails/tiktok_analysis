package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CL {
    public static final C00CL ALL;
    public static final /* synthetic */ C00CL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00CL NONE;
    public static final C00CL ONLY_BEHAVIOUR_PREVIEW;
    public static final C00CL ONLY_RENDER_MODEL_SWITCH;
    public static final C00CL ONLY_RENDER_MODEL_SWITCH_WITH_SIDE_BAR;
    public static final C00CL ONLY_SIDE_BAR_SWITCH;

    public static InterfaceC2044707zh<C00CL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CL c00cl = new C00CL("ONLY_RENDER_MODEL_SWITCH", 0);
        ONLY_RENDER_MODEL_SWITCH = c00cl;
        C00CL c00cl2 = new C00CL("ONLY_RENDER_MODEL_SWITCH_WITH_SIDE_BAR", 1);
        ONLY_RENDER_MODEL_SWITCH_WITH_SIDE_BAR = c00cl2;
        C00CL c00cl3 = new C00CL("ONLY_BEHAVIOUR_PREVIEW", 2);
        ONLY_BEHAVIOUR_PREVIEW = c00cl3;
        C00CL c00cl4 = new C00CL("ONLY_SIDE_BAR_SWITCH", 3);
        ONLY_SIDE_BAR_SWITCH = c00cl4;
        C00CL c00cl5 = new C00CL("NONE", 4);
        NONE = c00cl5;
        C00CL c00cl6 = new C00CL("ALL", 5);
        ALL = c00cl6;
        C00CL[] c00clArr = {c00cl, c00cl2, c00cl3, c00cl4, c00cl5, c00cl6};
        LL = c00clArr;
        LLILLJJLI = new C2254308sP(c00clArr);
    }

    public static C00CL[] values() {
        return (C00CL[]) LL.clone();
    }

    public static C00CL valueOf(String str) {
        return (C00CL) C08FF.LIZ(C00CL.class, str);
    }

    public C00CL(String str, int i) {
    }
}
