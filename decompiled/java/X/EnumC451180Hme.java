package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC451180Hme {
    public static final EnumC451180Hme AIGC_STICKER;
    public static final EnumC451180Hme AIMOJI_STICKER_STATIC;
    public static final EnumC451180Hme AISELF_STICKER;
    public static final EnumC451180Hme ANIMATED;
    public static final EnumC451180Hme ENTRANCE;

    @InterfaceC1294060jmO
    public static final EnumC451180Hme GIPHY;
    public static final EnumC451180Hme INHOUSE_TENOR;
    public static final /* synthetic */ EnumC451180Hme[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC451180Hme PHOTO_COMMENT_STICKER;
    public static final EnumC451180Hme PHOTO_STICKER;
    public static final EnumC451180Hme STATIC;
    public static final EnumC451180Hme STREAK_STICKER;
    public static final EnumC451180Hme THIRD_PARTY_GIPHY;
    public static final EnumC451180Hme THIRD_PARTY_TENOR;
    public static final EnumC451180Hme VIDEO_STICKER_ANIMATED;
    public static final EnumC451180Hme VIDEO_STICKER_STATIC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC451180Hme> getEntries() {
        return LLILLL;
    }

    static {
        EnumC451180Hme enumC451180Hme = new EnumC451180Hme("ENTRANCE", 0, -1);
        ENTRANCE = enumC451180Hme;
        EnumC451180Hme enumC451180Hme2 = new EnumC451180Hme("STATIC", 1, 1);
        STATIC = enumC451180Hme2;
        EnumC451180Hme enumC451180Hme3 = new EnumC451180Hme("ANIMATED", 2, 2);
        ANIMATED = enumC451180Hme3;
        EnumC451180Hme enumC451180Hme4 = new EnumC451180Hme("VIDEO_STICKER_STATIC", 3, 3);
        VIDEO_STICKER_STATIC = enumC451180Hme4;
        EnumC451180Hme enumC451180Hme5 = new EnumC451180Hme("VIDEO_STICKER_ANIMATED", 4, 4);
        VIDEO_STICKER_ANIMATED = enumC451180Hme5;
        EnumC451180Hme enumC451180Hme6 = new EnumC451180Hme("AIMOJI_STICKER_STATIC", 5, 5);
        AIMOJI_STICKER_STATIC = enumC451180Hme6;
        EnumC451180Hme enumC451180Hme7 = new EnumC451180Hme("GIPHY", 6, 6);
        GIPHY = enumC451180Hme7;
        EnumC451180Hme enumC451180Hme8 = new EnumC451180Hme("THIRD_PARTY_GIPHY", 7, 7);
        THIRD_PARTY_GIPHY = enumC451180Hme8;
        EnumC451180Hme enumC451180Hme9 = new EnumC451180Hme("THIRD_PARTY_TENOR", 8, 8);
        THIRD_PARTY_TENOR = enumC451180Hme9;
        EnumC451180Hme enumC451180Hme10 = new EnumC451180Hme("PHOTO_STICKER", 9, 9);
        PHOTO_STICKER = enumC451180Hme10;
        EnumC451180Hme enumC451180Hme11 = new EnumC451180Hme("AISELF_STICKER", 10, 10);
        AISELF_STICKER = enumC451180Hme11;
        EnumC451180Hme enumC451180Hme12 = new EnumC451180Hme("AIGC_STICKER", 11, 11);
        AIGC_STICKER = enumC451180Hme12;
        EnumC451180Hme enumC451180Hme13 = new EnumC451180Hme("STREAK_STICKER", 12, 12);
        STREAK_STICKER = enumC451180Hme13;
        EnumC451180Hme enumC451180Hme14 = new EnumC451180Hme("INHOUSE_TENOR", 13, 14);
        INHOUSE_TENOR = enumC451180Hme14;
        EnumC451180Hme enumC451180Hme15 = new EnumC451180Hme("PHOTO_COMMENT_STICKER", 14, 15);
        PHOTO_COMMENT_STICKER = enumC451180Hme15;
        EnumC451180Hme[] enumC451180HmeArr = {enumC451180Hme, enumC451180Hme2, enumC451180Hme3, enumC451180Hme4, enumC451180Hme5, enumC451180Hme6, enumC451180Hme7, enumC451180Hme8, enumC451180Hme9, enumC451180Hme10, enumC451180Hme11, enumC451180Hme12, enumC451180Hme13, enumC451180Hme14, enumC451180Hme15};
        LLILLJJLI = enumC451180HmeArr;
        LLILLL = new C2254308sP(enumC451180HmeArr);
    }

    public static EnumC451180Hme[] values() {
        return (EnumC451180Hme[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC451180Hme valueOf(String str) {
        return (EnumC451180Hme) C08FF.LIZ(EnumC451180Hme.class, str);
    }

    public EnumC451180Hme(String str, int i, int i2) {
        this.LL = i2;
    }
}
