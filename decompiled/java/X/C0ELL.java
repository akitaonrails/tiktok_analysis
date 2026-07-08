package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ELL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELL {
    public static final C0ELL FROM_ADD_MUSIC;
    public static final C0ELL FROM_REPLACE_STRIP;
    public static final C0ELL FROM_STRIP_MUSIC_PREVIEW;
    public static final /* synthetic */ C0ELL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0ELL> getEntries() {
        return LLILLL;
    }

    static {
        C0ELL c0ell = new C0ELL("FROM_STRIP_MUSIC_PREVIEW", 0, "from_strip_music_preview");
        FROM_STRIP_MUSIC_PREVIEW = c0ell;
        C0ELL c0ell2 = new C0ELL("FROM_ADD_MUSIC", 1, "from_add_music");
        FROM_ADD_MUSIC = c0ell2;
        C0ELL c0ell3 = new C0ELL("FROM_REPLACE_STRIP", 2, "from_replace_strip");
        FROM_REPLACE_STRIP = c0ell3;
        C0ELL[] c0ellArr = {c0ell, c0ell2, c0ell3};
        LLILLJJLI = c0ellArr;
        LLILLL = new C2254308sP(c0ellArr);
    }

    public static C0ELL[] values() {
        return (C0ELL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0ELL valueOf(String str) {
        return (C0ELL) C08FF.LIZ(C0ELL.class, str);
    }

    public C0ELL(String str, int i, String str2) {
        this.LL = str2;
    }
}
