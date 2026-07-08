package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CM {
    public static final /* synthetic */ C00CM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00CM NLEEditorType;
    public static final C00CM VEEditorTYPE;
    public final String LL;

    public static InterfaceC2044707zh<C00CM> getEntries() {
        return LLILLL;
    }

    static {
        C00CM c00cm = new C00CM("VEEditorTYPE", 0, "type_ve_editor");
        VEEditorTYPE = c00cm;
        C00CM c00cm2 = new C00CM("NLEEditorType", 1, "type_NLE_editor");
        NLEEditorType = c00cm2;
        C00CM[] c00cmArr = {c00cm, c00cm2};
        LLILLJJLI = c00cmArr;
        LLILLL = new C2254308sP(c00cmArr);
    }

    public static C00CM[] values() {
        return (C00CM[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C00CM valueOf(String str) {
        return (C00CM) C08FF.LIZ(C00CM.class, str);
    }

    public C00CM(String str, int i, String str2) {
        this.LL = str2;
    }
}
