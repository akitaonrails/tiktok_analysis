package X;

/* JADX INFO: renamed from: X.0Hrw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454460Hrw {
    public static EnumC454450Hrv LIZ(Integer num) {
        int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
        if (num != null && num.intValue() == type) {
            return EnumC454450Hrv.AIMOJI;
        }
        int type2 = EnumC451180Hme.GIPHY.getType();
        if (num != null && num.intValue() == type2) {
            return EnumC454450Hrv.GIPHY;
        }
        int type3 = EnumC451180Hme.AISELF_STICKER.getType();
        if (num != null && num.intValue() == type3) {
            return EnumC454450Hrv.AISELF_STICKER;
        }
        int type4 = EnumC451180Hme.PHOTO_COMMENT_STICKER.getType();
        if (num != null && num.intValue() == type4) {
            return EnumC454450Hrv.COMMENT_STICKER;
        }
        return EnumC454450Hrv.STICKER;
    }
}
