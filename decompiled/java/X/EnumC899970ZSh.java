package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC899970ZSh {
    public static final EnumC899970ZSh AWEME_CARD;
    public static final /* synthetic */ EnumC899970ZSh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC899970ZSh MEDIA_PHOTO;
    public static final EnumC899970ZSh MEDIA_VIDEO;
    public static final EnumC899970ZSh REPLY_MEDIA_PHOTO;
    public static final EnumC899970ZSh REPLY_MEDIA_VIDEO;
    public static final EnumC899970ZSh REPLY_QUOTED_VIDEO;
    public static final EnumC899970ZSh REPOST;
    public static final EnumC899970ZSh VIDEO_COVER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC899970ZSh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC899970ZSh enumC899970ZSh = new EnumC899970ZSh("VIDEO_COVER", 0, 51);
        VIDEO_COVER = enumC899970ZSh;
        EnumC899970ZSh enumC899970ZSh2 = new EnumC899970ZSh("MEDIA_VIDEO", 1, 58);
        MEDIA_VIDEO = enumC899970ZSh2;
        EnumC899970ZSh enumC899970ZSh3 = new EnumC899970ZSh("MEDIA_PHOTO", 2, 59);
        MEDIA_PHOTO = enumC899970ZSh3;
        EnumC899970ZSh enumC899970ZSh4 = new EnumC899970ZSh("AWEME_CARD", 3, 108);
        AWEME_CARD = enumC899970ZSh4;
        EnumC899970ZSh enumC899970ZSh5 = new EnumC899970ZSh("REPLY_MEDIA_PHOTO", 4, 206);
        REPLY_MEDIA_PHOTO = enumC899970ZSh5;
        EnumC899970ZSh enumC899970ZSh6 = new EnumC899970ZSh("REPLY_MEDIA_VIDEO", 5, 207);
        REPLY_MEDIA_VIDEO = enumC899970ZSh6;
        EnumC899970ZSh enumC899970ZSh7 = new EnumC899970ZSh("REPLY_QUOTED_VIDEO", 6, 209);
        REPLY_QUOTED_VIDEO = enumC899970ZSh7;
        EnumC899970ZSh enumC899970ZSh8 = new EnumC899970ZSh("REPOST", 7, 215);
        REPOST = enumC899970ZSh8;
        EnumC899970ZSh[] enumC899970ZShArr = {enumC899970ZSh, enumC899970ZSh2, enumC899970ZSh3, enumC899970ZSh4, enumC899970ZSh5, enumC899970ZSh6, enumC899970ZSh7, enumC899970ZSh8};
        LLILLJJLI = enumC899970ZShArr;
        LLILLL = new C2254308sP(enumC899970ZShArr);
    }

    public static EnumC899970ZSh[] values() {
        return (EnumC899970ZSh[]) LLILLJJLI.clone();
    }

    public final int getLegacyTagType() {
        return this.LL;
    }

    public static EnumC899970ZSh valueOf(String str) {
        return (EnumC899970ZSh) C08FF.LIZ(EnumC899970ZSh.class, str);
    }

    public EnumC899970ZSh(String str, int i, int i2) {
        this.LL = i2;
    }
}
