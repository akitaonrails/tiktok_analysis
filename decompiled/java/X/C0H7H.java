package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H7H, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7H {
    public static final C0H7H ALBUM;
    public static final C0H7H EMOJI_ALL;
    public static final C0H7H EMOJI_SUGGESTION;
    public static final /* synthetic */ C0H7H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0H7H MEME_ALL;
    public static final C0H7H MEME_SUGGESTION;
    public static final C0H7H PREFILL;
    public static final C0H7H RANDOMIZER;
    public static final C0H7H TEXT_MANUAL;
    public static final C0H7H TEXT_MIXED;
    public static final C0H7H TEXT_PLACEHOLDER;
    public static final C0H7H TEXT_PROMPT;
    public final String LL;

    public static InterfaceC2044707zh<C0H7H> getEntries() {
        return LLILLL;
    }

    static {
        C0H7H c0h7h = new C0H7H("EMOJI_SUGGESTION", 0, "emoji_suggestion");
        EMOJI_SUGGESTION = c0h7h;
        C0H7H c0h7h2 = new C0H7H("EMOJI_ALL", 1, "emoji_custom");
        EMOJI_ALL = c0h7h2;
        C0H7H c0h7h3 = new C0H7H("ALBUM", 2, "album");
        ALBUM = c0h7h3;
        C0H7H c0h7h4 = new C0H7H("TEXT_PROMPT", 3, "text_prompt");
        TEXT_PROMPT = c0h7h4;
        C0H7H c0h7h5 = new C0H7H("RANDOMIZER", 4, "randomizer");
        RANDOMIZER = c0h7h5;
        C0H7H c0h7h6 = new C0H7H("PREFILL", 5, "prefill");
        PREFILL = c0h7h6;
        C0H7H c0h7h7 = new C0H7H("TEXT_MANUAL", 6, "text_manual");
        TEXT_MANUAL = c0h7h7;
        C0H7H c0h7h8 = new C0H7H("TEXT_MIXED", 7, "text_mixed");
        TEXT_MIXED = c0h7h8;
        C0H7H c0h7h9 = new C0H7H("TEXT_PLACEHOLDER", 8, "text_placeholder");
        TEXT_PLACEHOLDER = c0h7h9;
        C0H7H c0h7h10 = new C0H7H("MEME_SUGGESTION", 9, "meme_suggestion");
        MEME_SUGGESTION = c0h7h10;
        C0H7H c0h7h11 = new C0H7H("MEME_ALL", 10, "meme_custom");
        MEME_ALL = c0h7h11;
        C0H7H[] c0h7hArr = {c0h7h, c0h7h2, c0h7h3, c0h7h4, c0h7h5, c0h7h6, c0h7h7, c0h7h8, c0h7h9, c0h7h10, c0h7h11};
        LLILLJJLI = c0h7hArr;
        LLILLL = new C2254308sP(c0h7hArr);
    }

    public static C0H7H[] values() {
        return (C0H7H[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0H7H valueOf(String str) {
        return (C0H7H) C08FF.LIZ(C0H7H.class, str);
    }

    public C0H7H(String str, int i, String str2) {
        this.LL = str2;
    }
}
