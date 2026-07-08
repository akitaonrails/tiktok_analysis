package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E99, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E99 {
    public static final C0E99 EDIT_PAGE;
    public static final C0E99 EDIT_PRO;
    public static final C0E99 EFFECT_ENTRANCE;
    public static final /* synthetic */ C0E99[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0E99> getEntries() {
        return LLILLL;
    }

    static {
        C0E99 c0e99 = new C0E99("EDIT_PAGE", 0, "edit_page");
        EDIT_PAGE = c0e99;
        C0E99 c0e992 = new C0E99("EDIT_PRO", 1, "editor_pro");
        EDIT_PRO = c0e992;
        C0E99 c0e993 = new C0E99("EFFECT_ENTRANCE", 2, "effect_entrance");
        EFFECT_ENTRANCE = c0e993;
        C0E99[] c0e99Arr = {c0e99, c0e992, c0e993};
        LLILLJJLI = c0e99Arr;
        LLILLL = new C2254308sP(c0e99Arr);
    }

    public static C0E99[] values() {
        return (C0E99[]) LLILLJJLI.clone();
    }

    public final String getTAG() {
        return this.LL;
    }

    public static C0E99 valueOf(String str) {
        return (C0E99) C08FF.LIZ(C0E99.class, str);
    }

    public C0E99(String str, int i, String str2) {
        this.LL = str2;
    }
}
