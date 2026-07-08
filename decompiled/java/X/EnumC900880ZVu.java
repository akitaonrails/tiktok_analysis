package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC900880ZVu {
    public static final EnumC900880ZVu DELETED_ON_SERVER;
    public static final EnumC900880ZVu FALLBACK_INFO_LOADING;
    public static final EnumC900880ZVu FALLBACK_INFO_REFRESH;
    public static final EnumC900880ZVu FORCE_IMAGE_LOAD_FAIL;
    public static final EnumC900880ZVu FORCE_SAFETY_MASK;
    public static final EnumC900880ZVu GROUP_SHOT_BTN;
    public static final EnumC900880ZVu HAS_VIDEO_MODEL;
    public static final /* synthetic */ EnumC900880ZVu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC900880ZVu NUDE;
    public static final EnumC900880ZVu PHOTO_SWAP_FAILED;
    public static final EnumC900880ZVu PHOTO_SWAP_HIGH_RISK;
    public static final EnumC900880ZVu SHOW_TRY_EFFECT;
    public static final EnumC900880ZVu THUMBNAIL_EMPTY_AND_MESSAGE_NOT_SENDING;
    public static final EnumC900880ZVu THUMBNAIL_EMPTY_AND_MESSAGE_SENDING;
    public static final EnumC900880ZVu USER_REQUEST_MSG_REFRESH;

    public static InterfaceC2044707zh<EnumC900880ZVu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC900880ZVu enumC900880ZVu = new EnumC900880ZVu("USER_REQUEST_MSG_REFRESH", 0);
        USER_REQUEST_MSG_REFRESH = enumC900880ZVu;
        EnumC900880ZVu enumC900880ZVu2 = new EnumC900880ZVu("FALLBACK_INFO_REFRESH", 1);
        FALLBACK_INFO_REFRESH = enumC900880ZVu2;
        EnumC900880ZVu enumC900880ZVu3 = new EnumC900880ZVu("FALLBACK_INFO_LOADING", 2);
        FALLBACK_INFO_LOADING = enumC900880ZVu3;
        EnumC900880ZVu enumC900880ZVu4 = new EnumC900880ZVu("DELETED_ON_SERVER", 3);
        DELETED_ON_SERVER = enumC900880ZVu4;
        EnumC900880ZVu enumC900880ZVu5 = new EnumC900880ZVu("NUDE", 4);
        NUDE = enumC900880ZVu5;
        EnumC900880ZVu enumC900880ZVu6 = new EnumC900880ZVu("THUMBNAIL_EMPTY_AND_MESSAGE_NOT_SENDING", 5);
        THUMBNAIL_EMPTY_AND_MESSAGE_NOT_SENDING = enumC900880ZVu6;
        EnumC900880ZVu enumC900880ZVu7 = new EnumC900880ZVu("HAS_VIDEO_MODEL", 6);
        HAS_VIDEO_MODEL = enumC900880ZVu7;
        EnumC900880ZVu enumC900880ZVu8 = new EnumC900880ZVu("THUMBNAIL_EMPTY_AND_MESSAGE_SENDING", 7);
        THUMBNAIL_EMPTY_AND_MESSAGE_SENDING = enumC900880ZVu8;
        EnumC900880ZVu enumC900880ZVu9 = new EnumC900880ZVu("FORCE_SAFETY_MASK", 8);
        FORCE_SAFETY_MASK = enumC900880ZVu9;
        EnumC900880ZVu enumC900880ZVu10 = new EnumC900880ZVu("PHOTO_SWAP_FAILED", 9);
        PHOTO_SWAP_FAILED = enumC900880ZVu10;
        EnumC900880ZVu enumC900880ZVu11 = new EnumC900880ZVu("FORCE_IMAGE_LOAD_FAIL", 10);
        FORCE_IMAGE_LOAD_FAIL = enumC900880ZVu11;
        EnumC900880ZVu enumC900880ZVu12 = new EnumC900880ZVu("SHOW_TRY_EFFECT", 11);
        SHOW_TRY_EFFECT = enumC900880ZVu12;
        EnumC900880ZVu enumC900880ZVu13 = new EnumC900880ZVu("GROUP_SHOT_BTN", 12);
        GROUP_SHOT_BTN = enumC900880ZVu13;
        EnumC900880ZVu enumC900880ZVu14 = new EnumC900880ZVu("PHOTO_SWAP_HIGH_RISK", 13);
        PHOTO_SWAP_HIGH_RISK = enumC900880ZVu14;
        EnumC900880ZVu[] enumC900880ZVuArr = {enumC900880ZVu, enumC900880ZVu2, enumC900880ZVu3, enumC900880ZVu4, enumC900880ZVu5, enumC900880ZVu6, enumC900880ZVu7, enumC900880ZVu8, enumC900880ZVu9, enumC900880ZVu10, enumC900880ZVu11, enumC900880ZVu12, enumC900880ZVu13, enumC900880ZVu14};
        LL = enumC900880ZVuArr;
        LLILLJJLI = new C2254308sP(enumC900880ZVuArr);
    }

    public static EnumC900880ZVu[] values() {
        return (EnumC900880ZVu[]) LL.clone();
    }

    public static EnumC900880ZVu valueOf(String str) {
        return (EnumC900880ZVu) C08FF.LIZ(EnumC900880ZVu.class, str);
    }

    public EnumC900880ZVu(String str, int i) {
    }
}
