package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09KR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09KR {
    public static final C09KR AI_REMIX_SCENE;
    public static final C09KR BULLETIN_BOARD;
    public static final C09KR GROUP_CHAT_AVATAR;
    public static final /* synthetic */ C09KR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C09KR PRIVATE_MEDIA;
    public static final C09KR VIDEO_STICKER;
    public static final C09KR VISUAL_POET;
    public final int LL;

    public static InterfaceC2044707zh<C09KR> getEntries() {
        return LLILLL;
    }

    static {
        C09KR c09kr = new C09KR("PRIVATE_MEDIA", 0, 1);
        PRIVATE_MEDIA = c09kr;
        C09KR c09kr2 = new C09KR("VIDEO_STICKER", 1, 2);
        VIDEO_STICKER = c09kr2;
        C09KR c09kr3 = new C09KR("BULLETIN_BOARD", 2, 3);
        BULLETIN_BOARD = c09kr3;
        C09KR c09kr4 = new C09KR("VISUAL_POET", 3, 4);
        VISUAL_POET = c09kr4;
        C09KR c09kr5 = new C09KR("GROUP_CHAT_AVATAR", 4, 5);
        GROUP_CHAT_AVATAR = c09kr5;
        C09KR c09kr6 = new C09KR("AI_REMIX_SCENE", 5, 99999);
        AI_REMIX_SCENE = c09kr6;
        C09KR[] c09krArr = {c09kr, c09kr2, c09kr3, c09kr4, c09kr5, c09kr6};
        LLILLJJLI = c09krArr;
        LLILLL = new C2254308sP(c09krArr);
    }

    public static C09KR[] values() {
        return (C09KR[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static C09KR valueOf(String str) {
        return (C09KR) C08FF.LIZ(C09KR.class, str);
    }

    public C09KR(String str, int i, int i2) {
        this.LL = i2;
    }
}
