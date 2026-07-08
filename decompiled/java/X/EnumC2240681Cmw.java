package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1Cmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2240681Cmw implements WireEnum {
    StickerTypeUnknown(0),
    StickerTypeStatic(1),
    StickerTypeAnimated(2),
    Video2StickerTypeStatic(3),
    Video2StickerTypeAnimated(4),
    SocialAvatarStickerType(5),
    ThirdPartyStickerType(6),
    StickerTypeThirdPartyGiphy(7),
    StickerTypeThirdPartyTenor(8),
    StickerTypePhotoSticker(9),
    StickerTypeAISelf(10),
    StickerTypeAISingleSticker(11),
    StickerTypeStreakSticker(12),
    StickerTypeInHouseTenor(14),
    StickerTypePhotoComment(15);

    public static final ProtoAdapter<EnumC2240681Cmw> ADAPTER = new EnumAdapter<EnumC2240681Cmw>() { // from class: X.1Cmx
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2240681Cmw.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2240681Cmw fromValue(int i) {
        switch (i) {
            case 0:
                return StickerTypeUnknown;
            case 1:
                return StickerTypeStatic;
            case 2:
                return StickerTypeAnimated;
            case 3:
                return Video2StickerTypeStatic;
            case 4:
                return Video2StickerTypeAnimated;
            case 5:
                return SocialAvatarStickerType;
            case 6:
                return ThirdPartyStickerType;
            case 7:
                return StickerTypeThirdPartyGiphy;
            case 8:
                return StickerTypeThirdPartyTenor;
            case BdTuring.TYPE_ECAF /* 9 */:
                return StickerTypePhotoSticker;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return StickerTypeAISelf;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return StickerTypeAISingleSticker;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return StickerTypeStreakSticker;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            default:
                return null;
            case 14:
                return StickerTypeInHouseTenor;
            case 15:
                return StickerTypePhotoComment;
        }
    }

    public static EnumC2240681Cmw valueOf(String str) {
        return (EnumC2240681Cmw) C08FF.LIZ(EnumC2240681Cmw.class, str);
    }

    EnumC2240681Cmw(int i) {
        this.LL = i;
    }
}
