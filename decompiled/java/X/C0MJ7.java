package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJ7 {
    public static final C0MJ7 AUTO_CUT;
    public static final /* synthetic */ C0MJ7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0MJ7 LYRIC_ANCHOR;
    public static final C0MJ7 MIX_EDITING;
    public final String LL;

    public static InterfaceC2044707zh<C0MJ7> getEntries() {
        return LLILLL;
    }

    static {
        C0MJ7 c0mj7 = new C0MJ7("MIX_EDITING", 0, "MixEditing");
        MIX_EDITING = c0mj7;
        C0MJ7 c0mj72 = new C0MJ7("AUTO_CUT", 1, "AutoCut");
        AUTO_CUT = c0mj72;
        C0MJ7 c0mj73 = new C0MJ7("LYRIC_ANCHOR", 2, "LyricAnchor");
        LYRIC_ANCHOR = c0mj73;
        C0MJ7[] c0mj7Arr = {c0mj7, c0mj72, c0mj73};
        LLILLJJLI = c0mj7Arr;
        LLILLL = new C2254308sP(c0mj7Arr);
    }

    public static C0MJ7[] values() {
        return (C0MJ7[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static C0MJ7 valueOf(String str) {
        return (C0MJ7) C08FF.LIZ(C0MJ7.class, str);
    }

    public C0MJ7(String str, int i, String str2) {
        this.LL = str2;
    }
}
