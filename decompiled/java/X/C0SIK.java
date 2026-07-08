package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SIK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIK {
    public static final C0SIK AUTO_TRANSLATED;
    public static final C0SIK CUSTOM_CLICK_SPAN;
    public static final C0SIK EMOJI;
    public static final C0SIK HASHTAG;
    public static final C0SIK HASHTAG_TRAILING_SPACE;
    public static final /* synthetic */ C0SIK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SIK PAID_CONTENT;
    public static final C0SIK PLAYLIST;
    public static final C0SIK PURE;
    public static final C0SIK REMOVED;
    public static final C0SIK SEARCH_TOP;
    public static final C0SIK WRAP;

    public static InterfaceC2044707zh<C0SIK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SIK c0sik = new C0SIK("HASHTAG_TRAILING_SPACE", 0);
        HASHTAG_TRAILING_SPACE = c0sik;
        C0SIK c0sik2 = new C0SIK("REMOVED", 1);
        REMOVED = c0sik2;
        C0SIK c0sik3 = new C0SIK("PURE", 2);
        PURE = c0sik3;
        C0SIK c0sik4 = new C0SIK("HASHTAG", 3);
        HASHTAG = c0sik4;
        C0SIK c0sik5 = new C0SIK("PLAYLIST", 4);
        PLAYLIST = c0sik5;
        C0SIK c0sik6 = new C0SIK("CUSTOM_CLICK_SPAN", 5);
        CUSTOM_CLICK_SPAN = c0sik6;
        C0SIK c0sik7 = new C0SIK("AUTO_TRANSLATED", 6);
        AUTO_TRANSLATED = c0sik7;
        C0SIK c0sik8 = new C0SIK("SEARCH_TOP", 7);
        SEARCH_TOP = c0sik8;
        C0SIK c0sik9 = new C0SIK("EMOJI", 8);
        EMOJI = c0sik9;
        C0SIK c0sik10 = new C0SIK("WRAP", 9);
        WRAP = c0sik10;
        C0SIK c0sik11 = new C0SIK("PAID_CONTENT", 10);
        PAID_CONTENT = c0sik11;
        C0SIK[] c0sikArr = {c0sik, c0sik2, c0sik3, c0sik4, c0sik5, c0sik6, c0sik7, c0sik8, c0sik9, c0sik10, c0sik11};
        LL = c0sikArr;
        LLILLJJLI = new C2254308sP(c0sikArr);
    }

    public static C0SIK[] values() {
        return (C0SIK[]) LL.clone();
    }

    public static C0SIK valueOf(String str) {
        return (C0SIK) C08FF.LIZ(C0SIK.class, str);
    }

    public C0SIK(String str, int i) {
    }
}
