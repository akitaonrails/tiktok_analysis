package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L90, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L90 {
    public static final C0L90 ALBUM;
    public static final C0L90 AUTO_PICK_AGENT;
    public static final /* synthetic */ C0L90[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L90 PREVIEW;
    public static final C0L90 PRIVACY_ALBUM_SELECTION;
    public static final C0L90 SELECTION_RESTORE;

    public static InterfaceC2044707zh<C0L90> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L90 c0l90 = new C0L90("ALBUM", 0);
        ALBUM = c0l90;
        C0L90 c0l902 = new C0L90("PREVIEW", 1);
        PREVIEW = c0l902;
        C0L90 c0l903 = new C0L90("SELECTION_RESTORE", 2);
        SELECTION_RESTORE = c0l903;
        C0L90 c0l904 = new C0L90("PRIVACY_ALBUM_SELECTION", 3);
        PRIVACY_ALBUM_SELECTION = c0l904;
        C0L90 c0l905 = new C0L90("AUTO_PICK_AGENT", 4);
        AUTO_PICK_AGENT = c0l905;
        C0L90[] c0l90Arr = {c0l90, c0l902, c0l903, c0l904, c0l905};
        LL = c0l90Arr;
        LLILLJJLI = new C2254308sP(c0l90Arr);
    }

    public static C0L90[] values() {
        return (C0L90[]) LL.clone();
    }

    public static C0L90 valueOf(String str) {
        return (C0L90) C08FF.LIZ(C0L90.class, str);
    }

    public C0L90(String str, int i) {
    }
}
