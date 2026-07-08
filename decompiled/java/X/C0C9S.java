package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C9S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C9S {
    public static final /* synthetic */ C0C9S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0C9S MATCH_BATTLE_INFO;
    public static final C0C9S MATCH_OPEN_MESSAGE;
    public static final C0C9S MATCH_ROOM_ENTER;
    public static final C0C9S MATCH_SEI;
    public static final C0C9S NONE;
    public final String LL;

    public static InterfaceC2044707zh<C0C9S> getEntries() {
        return LLILLL;
    }

    static {
        C0C9S c0c9s = new C0C9S("NONE", 0, "none");
        NONE = c0c9s;
        C0C9S c0c9s2 = new C0C9S("MATCH_ROOM_ENTER", 1, "match_room_enter");
        MATCH_ROOM_ENTER = c0c9s2;
        C0C9S c0c9s3 = new C0C9S("MATCH_BATTLE_INFO", 2, "match_battle_info");
        MATCH_BATTLE_INFO = c0c9s3;
        C0C9S c0c9s4 = new C0C9S("MATCH_OPEN_MESSAGE", 3, "match_open_message");
        MATCH_OPEN_MESSAGE = c0c9s4;
        C0C9S c0c9s5 = new C0C9S("MATCH_SEI", 4, "match_sei");
        MATCH_SEI = c0c9s5;
        C0C9S[] c0c9sArr = {c0c9s, c0c9s2, c0c9s3, c0c9s4, c0c9s5};
        LLILLJJLI = c0c9sArr;
        LLILLL = new C2254308sP(c0c9sArr);
    }

    public static C0C9S[] values() {
        return (C0C9S[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0C9S valueOf(String str) {
        return (C0C9S) C08FF.LIZ(C0C9S.class, str);
    }

    public C0C9S(String str, int i, String str2) {
        this.LL = str2;
    }
}
