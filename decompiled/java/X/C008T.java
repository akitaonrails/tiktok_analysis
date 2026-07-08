package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008T, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008T {
    public static final /* synthetic */ C008T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008T UI_STRATEGY_EFFECT;
    public static final C008T UI_STRATEGY_INDEX;
    public static final C008T UI_STRATEGY_LOGIC_TEMPLATE;
    public static final C008T UI_STRATEGY_NORMAL;

    public static InterfaceC2044707zh<C008T> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008T c008t = new C008T("UI_STRATEGY_NORMAL", 0);
        UI_STRATEGY_NORMAL = c008t;
        C008T c008t2 = new C008T("UI_STRATEGY_INDEX", 1);
        UI_STRATEGY_INDEX = c008t2;
        C008T c008t3 = new C008T("UI_STRATEGY_EFFECT", 2);
        UI_STRATEGY_EFFECT = c008t3;
        C008T c008t4 = new C008T("UI_STRATEGY_LOGIC_TEMPLATE", 3);
        UI_STRATEGY_LOGIC_TEMPLATE = c008t4;
        C008T[] c008tArr = {c008t, c008t2, c008t3, c008t4};
        LL = c008tArr;
        LLILLJJLI = new C2254308sP(c008tArr);
    }

    public static C008T[] values() {
        return (C008T[]) LL.clone();
    }

    public static C008T valueOf(String str) {
        return (C008T) C08FF.LIZ(C008T.class, str);
    }

    public C008T(String str, int i) {
    }
}
