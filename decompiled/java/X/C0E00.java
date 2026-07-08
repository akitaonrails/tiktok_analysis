package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E00, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E00 {
    public static final C0E00 CLIENT_GAME_PLAY;
    public static final C0E00 COMBINE_GAME_PLAY;
    public static final /* synthetic */ C0E00[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0E00 SERVER_GAME_PLAY;
    public final String LL;

    public static InterfaceC2044707zh<C0E00> getEntries() {
        return LLILLL;
    }

    static {
        C0E00 c0e00 = new C0E00("SERVER_GAME_PLAY", 0, "effect_server");
        SERVER_GAME_PLAY = c0e00;
        C0E00 c0e002 = new C0E00("CLIENT_GAME_PLAY", 1, "effect_client");
        CLIENT_GAME_PLAY = c0e002;
        C0E00 c0e003 = new C0E00("COMBINE_GAME_PLAY", 2, "effect_combine");
        COMBINE_GAME_PLAY = c0e003;
        C0E00[] c0e00Arr = {c0e00, c0e002, c0e003};
        LLILLJJLI = c0e00Arr;
        LLILLL = new C2254308sP(c0e00Arr);
    }

    public static C0E00[] values() {
        return (C0E00[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static C0E00 valueOf(String str) {
        return (C0E00) C08FF.LIZ(C0E00.class, str);
    }

    public C0E00(String str, int i, String str2) {
        this.LL = str2;
    }
}
