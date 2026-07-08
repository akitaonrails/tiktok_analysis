package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056T, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056T {
    public static final C056T BEHAVIOR_UNDEFINED;
    public static final C056T FOREST_X_INIT;
    public static final C056T GLOBAL_CONFIG_INIT;
    public static final /* synthetic */ C056T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C056T> getEntries() {
        return LLILLL;
    }

    static {
        C056T c056t = new C056T("BEHAVIOR_UNDEFINED", 0, "behavior_undefined");
        BEHAVIOR_UNDEFINED = c056t;
        C056T c056t2 = new C056T("GLOBAL_CONFIG_INIT", 1, "global_config_init");
        GLOBAL_CONFIG_INIT = c056t2;
        C056T c056t3 = new C056T("FOREST_X_INIT", 2, "forest_x_init");
        FOREST_X_INIT = c056t3;
        C056T[] c056tArr = {c056t, c056t2, c056t3};
        LLILLJJLI = c056tArr;
        LLILLL = new C2254308sP(c056tArr);
    }

    public static C056T[] values() {
        return (C056T[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C056T valueOf(String str) {
        return (C056T) C08FF.LIZ(C056T.class, str);
    }

    public C056T(String str, int i, String str2) {
        this.LL = str2;
    }
}
