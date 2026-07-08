package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14VL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14VL {
    public static final C14VP Companion;
    public static final /* synthetic */ C14VL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C14VL PICK_PHOTO_FROM_ALBUM;
    public static final C14VL PICK_VIDEO_FROM_ALBUM;
    public static final C14VL TAKE_PHOTO;
    public static final C14VL TAKE_VIDEO;
    public static final C14VL UNSUPPORTED;

    public static InterfaceC2044707zh<C14VL> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.14VP] */
    static {
        C14VL c14vl = new C14VL("TAKE_PHOTO", 0);
        TAKE_PHOTO = c14vl;
        C14VL c14vl2 = new C14VL("PICK_PHOTO_FROM_ALBUM", 1);
        PICK_PHOTO_FROM_ALBUM = c14vl2;
        C14VL c14vl3 = new C14VL("TAKE_VIDEO", 2);
        TAKE_VIDEO = c14vl3;
        C14VL c14vl4 = new C14VL("PICK_VIDEO_FROM_ALBUM", 3);
        PICK_VIDEO_FROM_ALBUM = c14vl4;
        C14VL c14vl5 = new C14VL("UNSUPPORTED", 4);
        UNSUPPORTED = c14vl5;
        C14VL[] c14vlArr = {c14vl, c14vl2, c14vl3, c14vl4, c14vl5};
        LL = c14vlArr;
        LLILLJJLI = new C2254308sP(c14vlArr);
        Companion = new Object() { // from class: X.14VP
        };
    }

    public static C14VL[] values() {
        return (C14VL[]) LL.clone();
    }

    public static C14VL valueOf(String str) {
        return (C14VL) C08FF.LIZ(C14VL.class, str);
    }

    public C14VL(String str, int i) {
    }
}
