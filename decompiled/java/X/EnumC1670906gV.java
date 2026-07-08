package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06gV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1670906gV implements InterfaceC1677406hY {
    public static final EnumC1670906gV AISELF_STICKER;
    public static final /* synthetic */ EnumC1670906gV[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1670906gV PRE_SHOWN_STICKER;
    public static final EnumC1670906gV RECEIVING_PHOTO_STICKER;
    public static final EnumC1670906gV SA_RECEIVE_INLINE_MESSAGE;
    public static final EnumC1670906gV SENDING_LOCAL_VIDEO_STICKER;
    public static final EnumC1670906gV SENDING_PHOTO_STICKER;
    public static final EnumC1670906gV STREAKS_PROGRESS;
    public static final EnumC1670906gV SUGGESTED_REPLIES;
    public final String LL;
    public final EnumC1641906bp LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public EnumC1670906gV() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1670906gV> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1670906gV enumC1670906gV = new EnumC1670906gV("PRE_SHOWN_STICKER", 0, "pre_shown_stickers_normal", EnumC1641906bp.CHAT_NOTICE, "stickers");
        PRE_SHOWN_STICKER = enumC1670906gV;
        EnumC1641906bp enumC1641906bp = EnumC1641906bp.MESSAGE;
        EnumC1670906gV enumC1670906gV2 = new EnumC1670906gV("SUGGESTED_REPLIES", 1, "suggested_replies", enumC1641906bp, "message_under_shared_video");
        SUGGESTED_REPLIES = enumC1670906gV2;
        EnumC1670906gV enumC1670906gV3 = new EnumC1670906gV("SA_RECEIVE_INLINE_MESSAGE", 2, "receiving_ai_moji_social_avatar", enumC1641906bp, "inline_message");
        SA_RECEIVE_INLINE_MESSAGE = enumC1670906gV3;
        EnumC1670906gV enumC1670906gV4 = new EnumC1670906gV("RECEIVING_PHOTO_STICKER", 3, "receiving_photo_sticker", enumC1641906bp, "inline_message");
        RECEIVING_PHOTO_STICKER = enumC1670906gV4;
        EnumC1670906gV enumC1670906gV5 = new EnumC1670906gV("SENDING_PHOTO_STICKER", 4, "sending_photo_sticker", enumC1641906bp, "inline_message");
        SENDING_PHOTO_STICKER = enumC1670906gV5;
        EnumC1670906gV enumC1670906gV6 = new EnumC1670906gV("STREAKS_PROGRESS", 5, "streaks_progress", enumC1641906bp, "inline_message");
        STREAKS_PROGRESS = enumC1670906gV6;
        EnumC1670906gV enumC1670906gV7 = new EnumC1670906gV("AISELF_STICKER", 6, "ai_self_sticker", enumC1641906bp, "inline_message");
        AISELF_STICKER = enumC1670906gV7;
        EnumC1670906gV enumC1670906gV8 = new EnumC1670906gV("SENDING_LOCAL_VIDEO_STICKER", 7, "sending_local_video_sticker", enumC1641906bp, "inline_message");
        SENDING_LOCAL_VIDEO_STICKER = enumC1670906gV8;
        EnumC1670906gV[] enumC1670906gVArr = {enumC1670906gV, enumC1670906gV2, enumC1670906gV3, enumC1670906gV4, enumC1670906gV5, enumC1670906gV6, enumC1670906gV7, enumC1670906gV8};
        LLILZIL = enumC1670906gVArr;
        LLILZLL = new C2254308sP(enumC1670906gVArr);
    }

    public static EnumC1670906gV[] values() {
        return (EnumC1670906gV[]) LLILZIL.clone();
    }

    @Override // X.InterfaceC1677406hY
    public String getEventPromptType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1677406hY
    public String getPromptId() {
        return this.LL;
    }

    @Override // X.InterfaceC1677406hY
    public EnumC1641906bp getPromptType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1677406hY
    public String getUiType() {
        return this.LLILLL;
    }

    public static EnumC1670906gV valueOf(String str) {
        return (EnumC1670906gV) C08FF.LIZ(EnumC1670906gV.class, str);
    }

    public EnumC1670906gV(String str, int i, String str2, EnumC1641906bp enumC1641906bp, String str3) {
        this.LL = str2;
        this.LLILLJJLI = enumC1641906bp;
        this.LLILLL = str3;
        this.LLILZ = "platform_triggered_contextual";
    }
}
