package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BT {
    public static final C00BT FETCH_MATERIALS_LIST_ERROR;
    public static final C00BT FETCH_PANEL_ERROR;
    public static final /* synthetic */ C00BT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BT LOAD_MORE_MATERIALS_ERROR;
    public static final C00BT REFRESH_MATERIAL_ERROR;
    public static final C00BT REFRESH_SAME;

    public static InterfaceC2044707zh<C00BT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BT c00bt = new C00BT("FETCH_MATERIALS_LIST_ERROR", 0);
        FETCH_MATERIALS_LIST_ERROR = c00bt;
        C00BT c00bt2 = new C00BT("FETCH_PANEL_ERROR", 1);
        FETCH_PANEL_ERROR = c00bt2;
        C00BT c00bt3 = new C00BT("REFRESH_SAME", 2);
        REFRESH_SAME = c00bt3;
        C00BT c00bt4 = new C00BT("LOAD_MORE_MATERIALS_ERROR", 3);
        LOAD_MORE_MATERIALS_ERROR = c00bt4;
        C00BT c00bt5 = new C00BT("REFRESH_MATERIAL_ERROR", 4);
        REFRESH_MATERIAL_ERROR = c00bt5;
        C00BT[] c00btArr = {c00bt, c00bt2, c00bt3, c00bt4, c00bt5};
        LL = c00btArr;
        LLILLJJLI = new C2254308sP(c00btArr);
    }

    public static C00BT[] values() {
        return (C00BT[]) LL.clone();
    }

    public static C00BT valueOf(String str) {
        return (C00BT) C08FF.LIZ(C00BT.class, str);
    }

    public C00BT(String str, int i) {
    }
}
