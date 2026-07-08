package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HGY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HGY {
    public static final C0HGY EMOJI;
    public static final C0HGY IMAGE;
    public static final /* synthetic */ C0HGY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HGY MEME;
    public static final C0HGY STICKER;
    public static final C0HGY TEXT;
    public final String LL;

    public static InterfaceC2044707zh<C0HGY> getEntries() {
        return LLILLL;
    }

    static {
        C0HGY c0hgy = new C0HGY("TEXT", 0, "text");
        TEXT = c0hgy;
        C0HGY c0hgy2 = new C0HGY("EMOJI", 1, "emoji");
        EMOJI = c0hgy2;
        C0HGY c0hgy3 = new C0HGY("IMAGE", 2, "image");
        IMAGE = c0hgy3;
        C0HGY c0hgy4 = new C0HGY("MEME", 3, "memes");
        MEME = c0hgy4;
        C0HGY c0hgy5 = new C0HGY("STICKER", 4, "sticker");
        STICKER = c0hgy5;
        C0HGY[] c0hgyArr = {c0hgy, c0hgy2, c0hgy3, c0hgy4, c0hgy5};
        LLILLJJLI = c0hgyArr;
        LLILLL = new C2254308sP(c0hgyArr);
    }

    public static C0HGY[] values() {
        return (C0HGY[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0HGY valueOf(String str) {
        return (C0HGY) C08FF.LIZ(C0HGY.class, str);
    }

    public C0HGY(String str, int i, String str2) {
        this.LL = str2;
    }
}
