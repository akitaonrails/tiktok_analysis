package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18ZL {
    public static final C18ZL BULLETIN_BOARD;
    public static final C18ZL DM_ALBUM;
    public static final C18ZL DM_RECORD;
    public static final /* synthetic */ C18ZL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C18ZL MAIN_RECORD;
    public static final C18ZL SYSTEM_ALBUM;
    public static final C18ZL VISUAL_POET;
    public final String LL;

    public static InterfaceC2044707zh<C18ZL> getEntries() {
        return LLILLL;
    }

    static {
        C18ZL c18zl = new C18ZL("MAIN_RECORD", 0, "main_record");
        MAIN_RECORD = c18zl;
        C18ZL c18zl2 = new C18ZL("DM_RECORD", 1, "dm_record");
        DM_RECORD = c18zl2;
        C18ZL c18zl3 = new C18ZL("DM_ALBUM", 2, "dm_album");
        DM_ALBUM = c18zl3;
        C18ZL c18zl4 = new C18ZL("SYSTEM_ALBUM", 3, "system_album");
        SYSTEM_ALBUM = c18zl4;
        C18ZL c18zl5 = new C18ZL("BULLETIN_BOARD", 4, "bulletin_board");
        BULLETIN_BOARD = c18zl5;
        C18ZL c18zl6 = new C18ZL("VISUAL_POET", 5, "visual_poet");
        VISUAL_POET = c18zl6;
        C18ZL[] c18zlArr = {c18zl, c18zl2, c18zl3, c18zl4, c18zl5, c18zl6};
        LLILLJJLI = c18zlArr;
        LLILLL = new C2254308sP(c18zlArr);
    }

    public static C18ZL[] values() {
        return (C18ZL[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static C18ZL valueOf(String str) {
        return (C18ZL) C08FF.LIZ(C18ZL.class, str);
    }

    public C18ZL(String str, int i, String str2) {
        this.LL = str2;
    }
}
