package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CN {
    public static final C00CN GROUP_CHAT_AVATAR;
    public static final /* synthetic */ C00CN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00CN NORMAL_PHOTO;
    public static final C00CN VIDEO_STICKER;
    public final int LL;

    public static InterfaceC2044707zh<C00CN> getEntries() {
        return LLILLL;
    }

    static {
        C00CN c00cn = new C00CN("NORMAL_PHOTO", 0, 1);
        NORMAL_PHOTO = c00cn;
        C00CN c00cn2 = new C00CN("VIDEO_STICKER", 1, 2);
        VIDEO_STICKER = c00cn2;
        C00CN c00cn3 = new C00CN("GROUP_CHAT_AVATAR", 2, 5);
        GROUP_CHAT_AVATAR = c00cn3;
        C00CN[] c00cnArr = {c00cn, c00cn2, c00cn3};
        LLILLJJLI = c00cnArr;
        LLILLL = new C2254308sP(c00cnArr);
    }

    public static C00CN[] values() {
        return (C00CN[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static C00CN valueOf(String str) {
        return (C00CN) C08FF.LIZ(C00CN.class, str);
    }

    public C00CN(String str, int i, int i2) {
        this.LL = i2;
    }
}
