package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L99, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L99 {
    public static final C0L99 ALBUM_GRID;
    public static final C0L99 EDITOR_PRO;
    public static final C0L99 EDIT_PHOTO;
    public static final /* synthetic */ C0L99[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L99 NEXT_BTN;
    public static final C0L99 PRIVACY_ALBUM;

    public static InterfaceC2044707zh<C0L99> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L99 c0l99 = new C0L99("NEXT_BTN", 0);
        NEXT_BTN = c0l99;
        C0L99 c0l992 = new C0L99("EDITOR_PRO", 1);
        EDITOR_PRO = c0l992;
        C0L99 c0l993 = new C0L99("EDIT_PHOTO", 2);
        EDIT_PHOTO = c0l993;
        C0L99 c0l994 = new C0L99("PRIVACY_ALBUM", 3);
        PRIVACY_ALBUM = c0l994;
        C0L99 c0l995 = new C0L99("ALBUM_GRID", 4);
        ALBUM_GRID = c0l995;
        C0L99[] c0l99Arr = {c0l99, c0l992, c0l993, c0l994, c0l995};
        LL = c0l99Arr;
        LLILLJJLI = new C2254308sP(c0l99Arr);
    }

    public static C0L99[] values() {
        return (C0L99[]) LL.clone();
    }

    public static C0L99 valueOf(String str) {
        return (C0L99) C08FF.LIZ(C0L99.class, str);
    }

    public C0L99(String str, int i) {
    }
}
