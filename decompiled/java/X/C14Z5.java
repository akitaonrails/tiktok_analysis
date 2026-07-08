package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14Z5 {
    public static final C14Z5 BACKGROUND;
    public static final C14Z5 BOTTOM;
    public static final C14Z5 COMMON_BACKGROUND_LYNX;
    public static final C14Z5 COMMON_FORCE_VIDEO_LYNX;
    public static final C14Z5 DIALOG;
    public static final C14Z5 FLOATING;
    public static final C14Z5 FORCE_VIDEO;
    public static final C14Z5 FORCE_VIDEO_LYNX;
    public static final C14Z5 FORCE_VIDEO_NO_COVER;
    public static final C14Z5 GREY_CARD;
    public static final /* synthetic */ C14Z5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C14Z5 NOT_USE;
    public static final C14Z5 PUSH_BOTTOM_LYNX;
    public final int LL;

    public static InterfaceC2044707zh<C14Z5> getEntries() {
        return LLILLL;
    }

    static {
        C14Z5 c14z5 = new C14Z5("DIALOG", 0, 0);
        DIALOG = c14z5;
        C14Z5 c14z52 = new C14Z5("NOT_USE", 1, 1);
        NOT_USE = c14z52;
        C14Z5 c14z53 = new C14Z5("GREY_CARD", 2, 2);
        GREY_CARD = c14z53;
        C14Z5 c14z54 = new C14Z5("FLOATING", 3, 3);
        FLOATING = c14z54;
        C14Z5 c14z55 = new C14Z5("FORCE_VIDEO", 4, 4);
        FORCE_VIDEO = c14z55;
        C14Z5 c14z56 = new C14Z5("FORCE_VIDEO_NO_COVER", 5, 5);
        FORCE_VIDEO_NO_COVER = c14z56;
        C14Z5 c14z57 = new C14Z5("BACKGROUND", 6, 6);
        BACKGROUND = c14z57;
        C14Z5 c14z58 = new C14Z5("BOTTOM", 7, 7);
        BOTTOM = c14z58;
        C14Z5 c14z59 = new C14Z5("FORCE_VIDEO_LYNX", 8, 8);
        FORCE_VIDEO_LYNX = c14z59;
        C14Z5 c14z510 = new C14Z5("PUSH_BOTTOM_LYNX", 9, 9);
        PUSH_BOTTOM_LYNX = c14z510;
        C14Z5 c14z511 = new C14Z5("COMMON_FORCE_VIDEO_LYNX", 10, 14);
        COMMON_FORCE_VIDEO_LYNX = c14z511;
        C14Z5 c14z512 = new C14Z5("COMMON_BACKGROUND_LYNX", 11, 15);
        COMMON_BACKGROUND_LYNX = c14z512;
        C14Z5[] c14z5Arr = {c14z5, c14z52, c14z53, c14z54, c14z55, c14z56, c14z57, c14z58, c14z59, c14z510, c14z511, c14z512};
        LLILLJJLI = c14z5Arr;
        LLILLL = new C2254308sP(c14z5Arr);
    }

    public static C14Z5[] values() {
        return (C14Z5[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C14Z5 valueOf(String str) {
        return (C14Z5) C08FF.LIZ(C14Z5.class, str);
    }

    public C14Z5(String str, int i, int i2) {
        this.LL = i2;
    }
}
