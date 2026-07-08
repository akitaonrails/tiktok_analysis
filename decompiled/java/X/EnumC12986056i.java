package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12986056i {
    public static final EnumC12986056i AIMOJI;
    public static final C12988056k Companion;
    public static final EnumC12986056i GAME_CHALLENGE_GET_STARTED;
    public static final /* synthetic */ EnumC12986056i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12986056i MANUAL_TRANSLATION_COUNT;
    public static final EnumC12986056i PERSONALIZED_STICKER_RECOMMEND;
    public static final EnumC12986056i PHOTO_STICKER_CREATE;
    public static final EnumC12986056i PHOTO_STICKER_CREATE_FROM_PHOTO;
    public static final EnumC12986056i PHOTO_STICKER_CREATE_FROM_VIDEO;
    public static final EnumC12986056i PHOTO_STICKER_INLINE_MESSAGE;
    public static final EnumC12986056i PHOTO_STICKER_INTRO_SHEET;
    public static final EnumC12986056i QUICK_LIVE_REACTION_GUIDE;
    public static final EnumC12986056i SHARED_FEED_INTRO_GROUP;
    public static final EnumC12986056i SHARED_FEED_INTRO_SINGLE;
    public static final EnumC12986056i SHARED_FEED_INTRO_UNIFILED;
    public static final EnumC12986056i STREAK_PET_ACTION_BAR_HATCHING;
    public static final EnumC12986056i STREAK_PET_ACTION_BAR_PET;
    public static final EnumC12986056i STREAK_PET_INVITE_BANNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12986056i> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.056k] */
    static {
        EnumC12986056i enumC12986056i = new EnumC12986056i("PERSONALIZED_STICKER_RECOMMEND", 0, "personalized_sticker_recommend");
        PERSONALIZED_STICKER_RECOMMEND = enumC12986056i;
        EnumC12986056i enumC12986056i2 = new EnumC12986056i("PHOTO_STICKER_INTRO_SHEET", 1, "photo_sticker_intro_sheet");
        PHOTO_STICKER_INTRO_SHEET = enumC12986056i2;
        EnumC12986056i enumC12986056i3 = new EnumC12986056i("STREAK_PET_ACTION_BAR_PET", 2, "streak_pet_action_bar_pet");
        STREAK_PET_ACTION_BAR_PET = enumC12986056i3;
        EnumC12986056i enumC12986056i4 = new EnumC12986056i("STREAK_PET_ACTION_BAR_HATCHING", 3, "streak_pet_action_bar_hatching");
        STREAK_PET_ACTION_BAR_HATCHING = enumC12986056i4;
        EnumC12986056i enumC12986056i5 = new EnumC12986056i("MANUAL_TRANSLATION_COUNT", 4, "manual_translation_count");
        MANUAL_TRANSLATION_COUNT = enumC12986056i5;
        EnumC12986056i enumC12986056i6 = new EnumC12986056i("QUICK_LIVE_REACTION_GUIDE", 5, "quick_live_reaction_guide");
        QUICK_LIVE_REACTION_GUIDE = enumC12986056i6;
        EnumC12986056i enumC12986056i7 = new EnumC12986056i("SHARED_FEED_INTRO_SINGLE", 6, "shared_feed_intro_single");
        SHARED_FEED_INTRO_SINGLE = enumC12986056i7;
        EnumC12986056i enumC12986056i8 = new EnumC12986056i("SHARED_FEED_INTRO_GROUP", 7, "shared_feed_intro_group");
        SHARED_FEED_INTRO_GROUP = enumC12986056i8;
        EnumC12986056i enumC12986056i9 = new EnumC12986056i("SHARED_FEED_INTRO_UNIFILED", 8, "shared_feed_intro_unifiled");
        SHARED_FEED_INTRO_UNIFILED = enumC12986056i9;
        EnumC12986056i enumC12986056i10 = new EnumC12986056i("PHOTO_STICKER_CREATE", 9, "photo_sticker_create");
        PHOTO_STICKER_CREATE = enumC12986056i10;
        EnumC12986056i enumC12986056i11 = new EnumC12986056i("PHOTO_STICKER_INLINE_MESSAGE", 10, "photo_sticker_inline_message");
        PHOTO_STICKER_INLINE_MESSAGE = enumC12986056i11;
        EnumC12986056i enumC12986056i12 = new EnumC12986056i("PHOTO_STICKER_CREATE_FROM_PHOTO", 11, "photo_sticker_create_from_photo");
        PHOTO_STICKER_CREATE_FROM_PHOTO = enumC12986056i12;
        EnumC12986056i enumC12986056i13 = new EnumC12986056i("PHOTO_STICKER_CREATE_FROM_VIDEO", 12, "photo_sticker_create_from_video");
        PHOTO_STICKER_CREATE_FROM_VIDEO = enumC12986056i13;
        EnumC12986056i enumC12986056i14 = new EnumC12986056i("GAME_CHALLENGE_GET_STARTED", 13, "game_challenge_get_started");
        GAME_CHALLENGE_GET_STARTED = enumC12986056i14;
        EnumC12986056i enumC12986056i15 = new EnumC12986056i("STREAK_PET_INVITE_BANNER", 14, "streak_pet_invite_banner");
        STREAK_PET_INVITE_BANNER = enumC12986056i15;
        EnumC12986056i enumC12986056i16 = new EnumC12986056i("AIMOJI", 15, "aimoji");
        AIMOJI = enumC12986056i16;
        EnumC12986056i[] enumC12986056iArr = {enumC12986056i, enumC12986056i2, enumC12986056i3, enumC12986056i4, enumC12986056i5, enumC12986056i6, enumC12986056i7, enumC12986056i8, enumC12986056i9, enumC12986056i10, enumC12986056i11, enumC12986056i12, enumC12986056i13, enumC12986056i14, enumC12986056i15, enumC12986056i16};
        LLILLJJLI = enumC12986056iArr;
        LLILLL = new C2254308sP(enumC12986056iArr);
        Companion = new Object() { // from class: X.056k
        };
    }

    public static EnumC12986056i[] values() {
        return (EnumC12986056i[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static final EnumC12986056i fromSceneName(String str) {
        Companion.getClass();
        for (EnumC12986056i enumC12986056i : values()) {
            if (Intrinsics.LJFF(enumC12986056i.getSceneName(), str)) {
                return enumC12986056i;
            }
        }
        return null;
    }

    public static EnumC12986056i valueOf(String str) {
        return (EnumC12986056i) C08FF.LIZ(EnumC12986056i.class, str);
    }

    public EnumC12986056i(String str, int i, String str2) {
        this.LL = str2;
    }
}
