package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1011130cQ3 {
    public static final EnumC1011130cQ3 CTA_CLICK;
    public static final EnumC1011130cQ3 ENTER_DETAIL;
    public static final /* synthetic */ EnumC1011130cQ3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1011130cQ3 MASK_CTA_CLICK;
    public static final EnumC1011130cQ3 MASK_FOLLOW_CLICK;
    public static final EnumC1011130cQ3 MASK_HIDE;
    public static final EnumC1011130cQ3 MASK_SHOW;
    public static final EnumC1011130cQ3 PHOTO_CARD_REQUEST_TO_PAUSE;
    public static final EnumC1011130cQ3 PHOTO_CARD_REQUEST_TO_PLAY;
    public static final EnumC1011130cQ3 PHOTO_CARD_START_PLAY;
    public static final EnumC1011130cQ3 RETURN_FROM_DETAIL;
    public static final EnumC1011130cQ3 SOUND_ICON_CLICK;
    public static final EnumC1011130cQ3 TRACK_PRODUCT_SHOW;

    public static InterfaceC2044707zh<EnumC1011130cQ3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1011130cQ3 enumC1011130cQ3 = new EnumC1011130cQ3("MASK_SHOW", 0);
        MASK_SHOW = enumC1011130cQ3;
        EnumC1011130cQ3 enumC1011130cQ32 = new EnumC1011130cQ3("MASK_CTA_CLICK", 1);
        MASK_CTA_CLICK = enumC1011130cQ32;
        EnumC1011130cQ3 enumC1011130cQ33 = new EnumC1011130cQ3("MASK_FOLLOW_CLICK", 2);
        MASK_FOLLOW_CLICK = enumC1011130cQ33;
        EnumC1011130cQ3 enumC1011130cQ34 = new EnumC1011130cQ3("MASK_HIDE", 3);
        MASK_HIDE = enumC1011130cQ34;
        EnumC1011130cQ3 enumC1011130cQ35 = new EnumC1011130cQ3("CTA_CLICK", 4);
        CTA_CLICK = enumC1011130cQ35;
        EnumC1011130cQ3 enumC1011130cQ36 = new EnumC1011130cQ3("TRACK_PRODUCT_SHOW", 5);
        TRACK_PRODUCT_SHOW = enumC1011130cQ36;
        EnumC1011130cQ3 enumC1011130cQ37 = new EnumC1011130cQ3("ENTER_DETAIL", 6);
        ENTER_DETAIL = enumC1011130cQ37;
        EnumC1011130cQ3 enumC1011130cQ38 = new EnumC1011130cQ3("RETURN_FROM_DETAIL", 7);
        RETURN_FROM_DETAIL = enumC1011130cQ38;
        EnumC1011130cQ3 enumC1011130cQ39 = new EnumC1011130cQ3("PHOTO_CARD_START_PLAY", 8);
        PHOTO_CARD_START_PLAY = enumC1011130cQ39;
        EnumC1011130cQ3 enumC1011130cQ310 = new EnumC1011130cQ3("PHOTO_CARD_REQUEST_TO_PLAY", 9);
        PHOTO_CARD_REQUEST_TO_PLAY = enumC1011130cQ310;
        EnumC1011130cQ3 enumC1011130cQ311 = new EnumC1011130cQ3("PHOTO_CARD_REQUEST_TO_PAUSE", 10);
        PHOTO_CARD_REQUEST_TO_PAUSE = enumC1011130cQ311;
        EnumC1011130cQ3 enumC1011130cQ312 = new EnumC1011130cQ3("SOUND_ICON_CLICK", 11);
        SOUND_ICON_CLICK = enumC1011130cQ312;
        EnumC1011130cQ3[] enumC1011130cQ3Arr = {enumC1011130cQ3, enumC1011130cQ32, enumC1011130cQ33, enumC1011130cQ34, enumC1011130cQ35, enumC1011130cQ36, enumC1011130cQ37, enumC1011130cQ38, enumC1011130cQ39, enumC1011130cQ310, enumC1011130cQ311, enumC1011130cQ312};
        LL = enumC1011130cQ3Arr;
        LLILLJJLI = new C2254308sP(enumC1011130cQ3Arr);
    }

    public static EnumC1011130cQ3[] values() {
        return (EnumC1011130cQ3[]) LL.clone();
    }

    public static EnumC1011130cQ3 valueOf(String str) {
        return (EnumC1011130cQ3) C08FF.LIZ(EnumC1011130cQ3.class, str);
    }

    public EnumC1011130cQ3(String str, int i) {
    }
}
