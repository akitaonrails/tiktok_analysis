package X;

import android.view.View;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0enp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1102750enp {
    public static final EnumC1102750enp AI_GENERATED;
    public static final EnumC1102750enp ANCHOR_INTERACTION_FEATURES_IN_MORE;
    public static final EnumC1102750enp ANCHOR_PARTNERSHIP;
    public static final EnumC1102750enp ANCHOR_PARTNERSHIP_DROPS;
    public static final EnumC1102750enp ANCHOR_SERVICE_PLUS;
    public static final EnumC1102750enp ANCHOR_SUBSCRIPTION;
    public static final EnumC1102750enp AUDIENCE_INTERACTION_FEATURES;
    public static final EnumC1102750enp AUDIENCE_LANDSCAPE_PARTNERSHIP;
    public static final EnumC1102750enp AUDIENCE_SLOT;
    public static final EnumC1102750enp BACKGROUND;
    public static final EnumC1102750enp BEAUTY;
    public static final EnumC1102750enp BOARD;
    public static final EnumC1102750enp BROADCAST_GIFT;
    public static final EnumC1102750enp CAMPAIGN_CENTER;
    public static final EnumC1102750enp CLOSE_DOWNGRADE;
    public static final EnumC1102750enp COHOST;
    public static final EnumC1102750enp COMMENT;
    public static final EnumC1102750enp COMMENT_EXT;
    public static final EnumC1102750enp COMMERCIAL_CONTENT_TOGGLE;
    public static final EnumC1102750enp CUSTOM_POLL;
    public static final EnumC1102750enp DONATION;
    public static final EnumC1102750enp DUAL_DEVICE;
    public static final EnumC1102750enp DUMMY_BROADCAST_GIFT;
    public static final EnumC1102750enp DUMMY_FAST_GIFT;
    public static final EnumC1102750enp DUMMY_GIFT;
    public static final EnumC1102750enp ECHO_MODE;
    public static final EnumC1102750enp EFFECT;
    public static final EnumC1102750enp EVENT_PROMOTION;
    public static final EnumC1102750enp FAST_GIFT;
    public static final EnumC1102750enp FLOAT_WINDOW;
    public static final EnumC1102750enp GIFT;
    public static final EnumC1102750enp GOODY_BAG;
    public static final EnumC1102750enp INTERACTION_FEATURES;
    public static final EnumC1102750enp INTERACTION_PK;
    public static final EnumC1102750enp INTRO;
    public static final EnumC1102750enp KARAOKE;
    public static final EnumC1102750enp LANDSCAPE_MESSAGE;
    public static final EnumC1102750enp LIVE_CENTER;
    public static final EnumC1102750enp LIVE_EVENT;
    public static final EnumC1102750enp LIVE_HIGHLIGHT;
    public static final EnumC1102750enp LIVE_TITLE;
    public static final /* synthetic */ EnumC1102750enp[] LLIZLLLIL;
    public static final /* synthetic */ C2254308sP LLJ;
    public static final EnumC1102750enp MESSAGE_ALERT;
    public static final EnumC1102750enp MIRROR_CAMERA;
    public static final EnumC1102750enp MORE;
    public static final EnumC1102750enp MULTIGUEST;
    public static final EnumC1102750enp MULTI_GUEST_LIVE_SHOW;
    public static final EnumC1102750enp MULTI_GUEST_MANAGE;
    public static final EnumC1102750enp MULTI_GUEST_MIC;
    public static final EnumC1102750enp MULTI_GUEST_PLAY;
    public static final EnumC1102750enp MULTI_GUEST_PLAY_BOOK;
    public static final EnumC1102750enp MULTI_GUEST_VIDEO;
    public static final EnumC1102750enp MUSIC;
    public static final EnumC1102750enp MUTE_MIC;
    public static final EnumC1102750enp NOISE_SUPPRESSION;
    public static final EnumC1102750enp PAUSE_LIVE;
    public static final EnumC1102750enp POLL;
    public static final EnumC1102750enp PROPS;
    public static final EnumC1102750enp RECORD_LIVE;
    public static final EnumC1102750enp REDENVELOPE;
    public static final EnumC1102750enp REVERSE_CAMERA;
    public static final EnumC1102750enp SETTING;
    public static final EnumC1102750enp SHARE;
    public static final EnumC1102750enp SHARE_IN_MORE;
    public static final EnumC1102750enp SLOT;
    public static final EnumC1102750enp SOUND_EFFECT;
    public static final EnumC1102750enp STABLE_MODE;
    public static final EnumC1102750enp STICKER;
    public static final EnumC1102750enp STREAM_KEY;
    public static final EnumC1102750enp TASK;
    public static final EnumC1102750enp TOPICS;
    public static final EnumC1102750enp TOPICS_DISABLE;
    public static final EnumC1102750enp TRY_MODE_COHOST;
    public static final EnumC1102750enp TRY_MODE_MULTIGUEST;
    public static final EnumC1102750enp UN_KNOW;
    public static final EnumC1102750enp VOICE_EFFECT;
    public C1102880eo2 LL;
    public C1102880eo2 LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public EnumC1088900eRU LLIZ;
    public boolean isButtonVisible;
    public boolean isEnableClick;
    public boolean isRedDotVisible;

    public static InterfaceC2044707zh<EnumC1102750enp> getEntries() {
        return LLJ;
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void isRedDotVisible$annotations() {
    }

    public final Integer getRTLDrawable() {
        return null;
    }

    static {
        EnumC1102750enp enumC1102750enp = new EnumC1102750enp("INTERACTION_PK", 0, R.layout.hvp, "Battle");
        INTERACTION_PK = enumC1102750enp;
        EnumC1102750enp enumC1102750enp2 = new EnumC1102750enp("COHOST", 1, C0UIM.LJ(R.layout.hv9, R.layout.hv_), "LinkMic");
        COHOST = enumC1102750enp2;
        EnumC1102750enp enumC1102750enp3 = new EnumC1102750enp("TRY_MODE_COHOST", 2, R.layout.hv9, "LinkMic");
        TRY_MODE_COHOST = enumC1102750enp3;
        EnumC1102750enp enumC1102750enp4 = new EnumC1102750enp("MULTIGUEST", 3, C0UIM.LJ(R.layout.hvz, R.layout.hw7), "Interactive");
        MULTIGUEST = enumC1102750enp4;
        EnumC1102750enp enumC1102750enp5 = new EnumC1102750enp("TRY_MODE_MULTIGUEST", 4, R.layout.hwh, "Interactive");
        TRY_MODE_MULTIGUEST = enumC1102750enp5;
        EnumC1102750enp enumC1102750enp6 = new EnumC1102750enp("MULTI_GUEST_MIC", 5, C0UIM.LJ(R.layout.hw4, R.layout.hw5), "Microphone");
        MULTI_GUEST_MIC = enumC1102750enp6;
        EnumC1102750enp enumC1102750enp7 = new EnumC1102750enp("MULTI_GUEST_VIDEO", 6, C0UIM.LJ(R.layout.hw8, R.layout.hw9), "Video");
        MULTI_GUEST_VIDEO = enumC1102750enp7;
        EnumC1102750enp enumC1102750enp8 = new EnumC1102750enp("MULTI_GUEST_MANAGE", 7, C0UIM.LJ(R.layout.hw1, R.layout.hw2), "MultiGuestReverse");
        MULTI_GUEST_MANAGE = enumC1102750enp8;
        EnumC1102750enp enumC1102750enp9 = new EnumC1102750enp("MULTI_GUEST_LIVE_SHOW", 8, R.drawable.ew6, 2131843554, "MultiGuestLiveShow");
        MULTI_GUEST_LIVE_SHOW = enumC1102750enp9;
        EnumC1102750enp enumC1102750enp10 = new EnumC1102750enp("MULTI_GUEST_PLAY", 9, R.drawable.eyp, 2131853925, "MultiGuestToolAndPlay");
        MULTI_GUEST_PLAY = enumC1102750enp10;
        EnumC1102750enp enumC1102750enp11 = new EnumC1102750enp("MULTI_GUEST_PLAY_BOOK", 10, R.attr.dwh, 2131854916, "MultiGuestPlayBook");
        MULTI_GUEST_PLAY_BOOK = enumC1102750enp11;
        EnumC1102750enp enumC1102750enp12 = new EnumC1102750enp("SLOT", 11, C0UIM.LJ(R.layout.hv5, R.layout.hv6), "AnchorBottomSlot");
        SLOT = enumC1102750enp12;
        EnumC1102750enp enumC1102750enp13 = new EnumC1102750enp("AUDIENCE_SLOT", 12, R.layout.hux, "AudienceBottomRightSlot");
        AUDIENCE_SLOT = enumC1102750enp13;
        EnumC1102750enp enumC1102750enp14 = new EnumC1102750enp("POLL", 13, C0UIM.LJ(R.drawable.eq2, R.drawable.eq3), 0, "CustomPollEntrance");
        POLL = enumC1102750enp14;
        EnumC1102750enp enumC1102750enp15 = new EnumC1102750enp("INTERACTION_FEATURES", 14, C0UIM.LJ(R.drawable.eyt, R.drawable.eyv), 2131842196, "InteractGroup");
        INTERACTION_FEATURES = enumC1102750enp15;
        EnumC1102750enp enumC1102750enp16 = new EnumC1102750enp("ANCHOR_INTERACTION_FEATURES_IN_MORE", 15, R.drawable.eyu, 2131842196, "InteractGroup");
        ANCHOR_INTERACTION_FEATURES_IN_MORE = enumC1102750enp16;
        EnumC1102750enp enumC1102750enp17 = new EnumC1102750enp("AUDIENCE_INTERACTION_FEATURES", 16, C0UIM.LJ(R.layout.hut, R.layout.huu), "InteractGroup");
        AUDIENCE_INTERACTION_FEATURES = enumC1102750enp17;
        EnumC1102750enp enumC1102750enp18 = new EnumC1102750enp("DONATION", 17, R.drawable.eu9, 2131841448, "DonationOrgs");
        DONATION = enumC1102750enp18;
        EnumC1102750enp enumC1102750enp19 = new EnumC1102750enp("SHARE", 18, C0UIM.LJ(R.drawable.ert, R.drawable.erw), 2131856097, "Share");
        SHARE = enumC1102750enp19;
        EnumC1102750enp enumC1102750enp20 = new EnumC1102750enp("SHARE_IN_MORE", 19, LiveHostSettingsUIConfig.enable() ? R.attr.crd : R.drawable.erv, 2131856097, "Share");
        SHARE_IN_MORE = enumC1102750enp20;
        EnumC1102750enp enumC1102750enp21 = new EnumC1102750enp("EFFECT", 20, C0UIM.LJ(R.drawable.elf, R.drawable.elg), 0, "Decoration");
        EFFECT = enumC1102750enp21;
        EnumC1102750enp enumC1102750enp22 = new EnumC1102750enp("MORE", 21, C0UIM.LJ(R.drawable.eov, R.drawable.eow), 0, "Group");
        MORE = enumC1102750enp22;
        EnumC1102750enp enumC1102750enp23 = new EnumC1102750enp("REVERSE_CAMERA", 22, R.drawable.erf, 2131842803, "Reversal");
        REVERSE_CAMERA = enumC1102750enp23;
        EnumC1102750enp enumC1102750enp24 = new EnumC1102750enp("MIRROR_CAMERA", 23, R.layout.huz, "Mirror");
        MIRROR_CAMERA = enumC1102750enp24;
        EnumC1102750enp enumC1102750enp25 = new EnumC1102750enp("INTRO", 24, LiveHostSettingsUIConfig.enable() ? R.attr.dzk : R.drawable.eo7, 2131840780, "LiveIntro");
        INTRO = enumC1102750enp25;
        EnumC1102750enp enumC1102750enp26 = new EnumC1102750enp("LIVE_TITLE", 25, R.drawable.eoh, 2131854278, "LiveTitle");
        LIVE_TITLE = enumC1102750enp26;
        EnumC1102750enp enumC1102750enp27 = new EnumC1102750enp("LIVE_EVENT", 26, R.drawable.env, 2131842010, "LiveEvent");
        LIVE_EVENT = enumC1102750enp27;
        EnumC1102750enp enumC1102750enp28 = new EnumC1102750enp("PAUSE_LIVE", 27, R.drawable.epm, 2131840960, "LivePause");
        PAUSE_LIVE = enumC1102750enp28;
        EnumC1102750enp enumC1102750enp29 = new EnumC1102750enp("RECORD_LIVE", 28, R.layout.hvx, "RecordLive");
        RECORD_LIVE = enumC1102750enp29;
        EnumC1102750enp enumC1102750enp30 = new EnumC1102750enp("MUTE_MIC", 29, R.layout.hvu, "LiveMuteMic");
        MUTE_MIC = enumC1102750enp30;
        EnumC1102750enp enumC1102750enp31 = new EnumC1102750enp("CLOSE_DOWNGRADE", 30, R.layout.hvu, "LiveMuteMic");
        CLOSE_DOWNGRADE = enumC1102750enp31;
        EnumC1102750enp enumC1102750enp32 = new EnumC1102750enp("STABLE_MODE", 31, R.layout.hvy, "StableMode");
        STABLE_MODE = enumC1102750enp32;
        EnumC1102750enp enumC1102750enp33 = new EnumC1102750enp("NOISE_SUPPRESSION", 32, R.layout.hvw, "NoiseSuppression");
        NOISE_SUPPRESSION = enumC1102750enp33;
        EnumC1102750enp enumC1102750enp34 = new EnumC1102750enp("DUAL_DEVICE", 33, R.drawable.fdz, AnchorPreviewUniformStyleABSetting.INSTANCE.enable() ? 2131851520 : 2131843005, "GameDualDevice");
        DUAL_DEVICE = enumC1102750enp34;
        EnumC1102750enp enumC1102750enp35 = new EnumC1102750enp("SETTING", 34, LiveHostSettingsUIConfig.enable() ? R.attr.dt3 : R.drawable.eof, 2131842655, "Admin");
        SETTING = enumC1102750enp35;
        EnumC1102750enp enumC1102750enp36 = new EnumC1102750enp("COMMENT", 35, R.drawable.el1, 2131855964, "Comment");
        COMMENT = enumC1102750enp36;
        EnumC1102750enp enumC1102750enp37 = new EnumC1102750enp("COMMENT_EXT", 36, R.attr.czi, 2131855964, new C1102880eo2(C497740JfY.LJFF(R.color.aaj), Integer.valueOf(R.style.j9), Integer.valueOf(C497740JfY.LJFF(R.color.a6j)), 0.6666667f, 0.6666667f), new C1102880eo2(C497740JfY.LJFF(R.color.aaj), null, null, 1.0f, 1.0f), "Comment");
        COMMENT_EXT = enumC1102750enp37;
        EnumC1102750enp enumC1102750enp38 = new EnumC1102750enp("LANDSCAPE_MESSAGE", 37, R.drawable.dn8, 2131855964, "ClearMessage");
        LANDSCAPE_MESSAGE = enumC1102750enp38;
        EnumC1102750enp enumC1102750enp39 = new EnumC1102750enp("STREAM_KEY", 38, R.drawable.es9, 2131844177, "RecordURL");
        STREAM_KEY = enumC1102750enp39;
        EnumC1102750enp enumC1102750enp40 = new EnumC1102750enp("TOPICS", 39, R.drawable.fe0, 2131842859, "Topic");
        TOPICS = enumC1102750enp40;
        EnumC1102750enp enumC1102750enp41 = new EnumC1102750enp("TOPICS_DISABLE", 40, R.layout.hv8, "Topic");
        TOPICS_DISABLE = enumC1102750enp41;
        EnumC1102750enp enumC1102750enp42 = new EnumC1102750enp("TASK", 41, R.attr.d0d, 2131842948, new C1102880eo2(-1, null, null, null, 1.0f, 1.0f, R.attr.ewy), new C1102880eo2(-1, null, null, null, 1.0f, 1.0f, R.attr.ewy), "Task");
        TASK = enumC1102750enp42;
        EnumC1102750enp enumC1102750enp43 = new EnumC1102750enp("BEAUTY", 42, R.drawable.esd, C0UIM.LIZLLL(), "BeautyPicker");
        BEAUTY = enumC1102750enp43;
        EnumC1102750enp enumC1102750enp44 = new EnumC1102750enp("STICKER", 43, R.drawable.eog, 2131842712, "StickerHead");
        STICKER = enumC1102750enp44;
        EnumC1102750enp enumC1102750enp45 = new EnumC1102750enp("BACKGROUND", 44, LiveBroadcastBackgroundPhase2.enable() ? R.attr.cjf : R.drawable.ena, LiveBroadcastBackgroundPhase2.enable() ? 2131852648 : 2131842511, "BackgroundEffect");
        BACKGROUND = enumC1102750enp45;
        EnumC1102750enp enumC1102750enp46 = new EnumC1102750enp("PROPS", 45, R.drawable.eod, 2131840772, "Sticker");
        PROPS = enumC1102750enp46;
        EnumC1102750enp enumC1102750enp47 = new EnumC1102750enp("GIFT", 46, C0UIM.LJ(R.layout.hvm, R.layout.hvl), "Gift");
        GIFT = enumC1102750enp47;
        EnumC1102750enp enumC1102750enp48 = new EnumC1102750enp("LIVE_HIGHLIGHT", 47, R.raw.icon_star_on_feed, 2131851302, "LiveHighlight");
        LIVE_HIGHLIGHT = enumC1102750enp48;
        EnumC1102750enp enumC1102750enp49 = new EnumC1102750enp("FAST_GIFT", 48, C0UIM.LJ(R.layout.hvi, R.layout.hvh), "InstantGift");
        FAST_GIFT = enumC1102750enp49;
        EnumC1102750enp enumC1102750enp50 = new EnumC1102750enp("BROADCAST_GIFT", 49, R.layout.hv2, "Gift");
        BROADCAST_GIFT = enumC1102750enp50;
        EnumC1102750enp enumC1102750enp51 = new EnumC1102750enp("DUMMY_GIFT", 50, R.drawable.euc, 2131853449, "Gift");
        DUMMY_GIFT = enumC1102750enp51;
        EnumC1102750enp enumC1102750enp52 = new EnumC1102750enp("DUMMY_FAST_GIFT", 51, C0UIM.LJ(R.layout.hvg, R.layout.hvf), "InstantGift");
        DUMMY_FAST_GIFT = enumC1102750enp52;
        EnumC1102750enp enumC1102750enp53 = new EnumC1102750enp("DUMMY_BROADCAST_GIFT", 52, R.drawable.eub, 2131842804, "Gift");
        DUMMY_BROADCAST_GIFT = enumC1102750enp53;
        EnumC1102750enp enumC1102750enp54 = new EnumC1102750enp("VOICE_EFFECT", 53, R.drawable.f656ez6, 2131842883, "SoundEffect");
        VOICE_EFFECT = enumC1102750enp54;
        EnumC1102750enp enumC1102750enp55 = new EnumC1102750enp("SOUND_EFFECT", 54, R.drawable.eyh, 2131844087, "SoundTool");
        SOUND_EFFECT = enumC1102750enp55;
        EnumC1102750enp enumC1102750enp56 = new EnumC1102750enp("BOARD", 55, R.drawable.ew0, 2131851416, "Board");
        BOARD = enumC1102750enp56;
        EnumC1102750enp enumC1102750enp57 = new EnumC1102750enp("ECHO_MODE", 56, R.layout.hv1, "Voice");
        ECHO_MODE = enumC1102750enp57;
        EnumC1102750enp enumC1102750enp58 = new EnumC1102750enp("MESSAGE_ALERT", 57, R.drawable.eol, 2131844024, "LiveScreenNotification");
        MESSAGE_ALERT = enumC1102750enp58;
        EnumC1102750enp enumC1102750enp59 = new EnumC1102750enp("COMMERCIAL_CONTENT_TOGGLE", 58, R.drawable.el2, 2131841068, "CommercialContent");
        COMMERCIAL_CONTENT_TOGGLE = enumC1102750enp59;
        EnumC1102750enp enumC1102750enp60 = new EnumC1102750enp("GOODY_BAG", 59, R.drawable.em5, 2131842036, "GoodyBag");
        GOODY_BAG = enumC1102750enp60;
        EnumC1102750enp enumC1102750enp61 = new EnumC1102750enp("REDENVELOPE", 60, R.drawable.esg, 2131844585, "TreasureBox");
        REDENVELOPE = enumC1102750enp61;
        EnumC1102750enp enumC1102750enp62 = new EnumC1102750enp(61, "LIVE_CENTER");
        LIVE_CENTER = enumC1102750enp62;
        EnumC1102750enp enumC1102750enp63 = new EnumC1102750enp("MUSIC", 62, R.drawable.eoa, 2131842666, "Music");
        MUSIC = enumC1102750enp63;
        EnumC1102750enp enumC1102750enp64 = new EnumC1102750enp("KARAOKE", 63, R.drawable.evq, 2131840648, "LiveKaraoke");
        KARAOKE = enumC1102750enp64;
        EnumC1102750enp enumC1102750enp65 = new EnumC1102750enp("CUSTOM_POLL", 64, C0UIM.LJ(R.layout.hvb, R.layout.hvd), "Poll");
        CUSTOM_POLL = enumC1102750enp65;
        EnumC1102750enp enumC1102750enp66 = new EnumC1102750enp("EVENT_PROMOTION", 65, R.attr.d0b, 2131842846, "EventPromotion");
        EVENT_PROMOTION = enumC1102750enp66;
        EnumC1102750enp enumC1102750enp67 = new EnumC1102750enp(66, "UN_KNOW");
        UN_KNOW = enumC1102750enp67;
        EnumC1102750enp enumC1102750enp68 = new EnumC1102750enp("ANCHOR_PARTNERSHIP", 67, R.drawable.ely, 2131841828, "AnchorGamePartnership");
        ANCHOR_PARTNERSHIP = enumC1102750enp68;
        EnumC1102750enp enumC1102750enp69 = new EnumC1102750enp("ANCHOR_PARTNERSHIP_DROPS", 68, R.drawable.ex7, 2131841828, "AnchorPartnershipDrops");
        ANCHOR_PARTNERSHIP_DROPS = enumC1102750enp69;
        EnumC1102750enp enumC1102750enp70 = new EnumC1102750enp("AUDIENCE_LANDSCAPE_PARTNERSHIP", 69, R.layout.huw, "AudienceGamePartnership");
        AUDIENCE_LANDSCAPE_PARTNERSHIP = enumC1102750enp70;
        EnumC1102750enp enumC1102750enp71 = new EnumC1102750enp("ANCHOR_SERVICE_PLUS", 70, R.attr.czd, 2131856022, new C1102880eo2(-1, null, null, null, 1.0f, 1.0f, R.attr.exc), new C1102880eo2(-1, null, null, null, 1.0f, 1.0f, R.attr.exc), "small_and_medium_business");
        ANCHOR_SERVICE_PLUS = enumC1102750enp71;
        EnumC1102750enp enumC1102750enp72 = new EnumC1102750enp("ANCHOR_SUBSCRIPTION", 71, R.attr.efc, 2131844501, new C1102880eo2(-1, null, null, null, 1.0f, 1.0f, R.attr.exc), new C1102880eo2(-1, null, null, null, 1.0f, 1.0f, R.attr.exc), "Subscription");
        ANCHOR_SUBSCRIPTION = enumC1102750enp72;
        EnumC1102750enp enumC1102750enp73 = new EnumC1102750enp(LiveHostSettingsUIConfig.enable() ? R.layout.h5d : R.layout.h5c, LiveHostSettingsUIConfig.enable() ? R.attr.ds3 : R.drawable.ekk);
        CAMPAIGN_CENTER = enumC1102750enp73;
        EnumC1102750enp enumC1102750enp74 = new EnumC1102750enp("AI_GENERATED", 73, R.layout.hvs, "AiGeneratedContent");
        AI_GENERATED = enumC1102750enp74;
        EnumC1102750enp enumC1102750enp75 = new EnumC1102750enp("FLOAT_WINDOW", 74, R.layout.hvt, "FloatWindow");
        FLOAT_WINDOW = enumC1102750enp75;
        EnumC1102750enp[] enumC1102750enpArr = {enumC1102750enp, enumC1102750enp2, enumC1102750enp3, enumC1102750enp4, enumC1102750enp5, enumC1102750enp6, enumC1102750enp7, enumC1102750enp8, enumC1102750enp9, enumC1102750enp10, enumC1102750enp11, enumC1102750enp12, enumC1102750enp13, enumC1102750enp14, enumC1102750enp15, enumC1102750enp16, enumC1102750enp17, enumC1102750enp18, enumC1102750enp19, enumC1102750enp20, enumC1102750enp21, enumC1102750enp22, enumC1102750enp23, enumC1102750enp24, enumC1102750enp25, enumC1102750enp26, enumC1102750enp27, enumC1102750enp28, enumC1102750enp29, enumC1102750enp30, enumC1102750enp31, enumC1102750enp32, enumC1102750enp33, enumC1102750enp34, enumC1102750enp35, enumC1102750enp36, enumC1102750enp37, enumC1102750enp38, enumC1102750enp39, enumC1102750enp40, enumC1102750enp41, enumC1102750enp42, enumC1102750enp43, enumC1102750enp44, enumC1102750enp45, enumC1102750enp46, enumC1102750enp47, enumC1102750enp48, enumC1102750enp49, enumC1102750enp50, enumC1102750enp51, enumC1102750enp52, enumC1102750enp53, enumC1102750enp54, enumC1102750enp55, enumC1102750enp56, enumC1102750enp57, enumC1102750enp58, enumC1102750enp59, enumC1102750enp60, enumC1102750enp61, enumC1102750enp62, enumC1102750enp63, enumC1102750enp64, enumC1102750enp65, enumC1102750enp66, enumC1102750enp67, enumC1102750enp68, enumC1102750enp69, enumC1102750enp70, enumC1102750enp71, enumC1102750enp72, enumC1102750enp73, enumC1102750enp74, enumC1102750enp75};
        LLIZLLLIL = enumC1102750enpArr;
        LLJ = new C2254308sP(enumC1102750enpArr);
    }

    public static EnumC1102750enp[] values() {
        return (EnumC1102750enp[]) LLIZLLLIL.clone();
    }

    public final int getDrawable() {
        return this.LLILLL;
    }

    public final C1102880eo2 getIconConfig() {
        return this.LL;
    }

    public final C1102880eo2 getIconConfigWithoutBackground() {
        return this.LLILLJJLI;
    }

    public final String getIdentifier() {
        return this.LLILZLL;
    }

    public final Integer getLayoutId() {
        return this.LLILZIL;
    }

    public final int getTitleId() {
        return this.LLILZ;
    }

    public final EnumC1088900eRU getToolbarStyle() {
        return this.LLIZ;
    }

    public static InterfaceC1088880eRS LIZJ(DataChannel dataChannel) {
        return ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
    }

    public static EnumC1102750enp valueOf(String str) {
        return (EnumC1102750enp) C08FF.LIZ(EnumC1102750enp.class, str);
    }

    public final View getView(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            return interfaceC1088880eRSLIZJ.LJIIZILJ(dataChannel, this);
        }
        return null;
    }

    public final Unit hide(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIL(this, dataChannel, false);
            return Unit.LIZ;
        }
        return null;
    }

    public final Unit hideBySwitchManager(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIL(this, dataChannel, true);
            return Unit.LIZ;
        }
        return null;
    }

    public final Unit hideRedDot(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LIZJ(this, dataChannel, false);
            return Unit.LIZ;
        }
        return null;
    }

    public final boolean isRedDotShowing(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            return interfaceC1088880eRSLIZJ.LJIJI(dataChannel, this);
        }
        return false;
    }

    public final boolean isShowing(DataChannel dataChannel) {
        Boolean boolValueOf;
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            boolValueOf = Boolean.valueOf(interfaceC1088880eRSLIZJ.LJIIL(dataChannel, this));
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public final boolean isShowingInInteractionDialog(DataChannel dataChannel) {
        Boolean boolValueOf;
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            boolValueOf = Boolean.valueOf(interfaceC1088880eRSLIZJ.LJIJ(dataChannel, this));
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public final void setIconConfig(C1102880eo2 c1102880eo2) {
        this.LL = c1102880eo2;
    }

    public final void setIconConfigWithoutBackground(C1102880eo2 c1102880eo2) {
        this.LLILLJJLI = c1102880eo2;
    }

    public final void setToolbarStyle(EnumC1088900eRU enumC1088900eRU) {
        this.LLIZ = enumC1088900eRU;
    }

    public final Unit show(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJFF(this, dataChannel, false);
            return Unit.LIZ;
        }
        return null;
    }

    public final Unit showBySwitchManager(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJFF(this, dataChannel, true);
            return Unit.LIZ;
        }
        return null;
    }

    public final Unit showRedDot(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LIZJ(this, dataChannel, true);
            return Unit.LIZ;
        }
        return null;
    }

    public final Unit unload(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIJJ(dataChannel, this);
            return Unit.LIZ;
        }
        return null;
    }

    public EnumC1102750enp(int i, int i2) {
        this.isButtonVisible = true;
        this.isEnableClick = true;
        this.LLILZLL = "";
        this.LLILZIL = Integer.valueOf(i);
        this.LLILLL = i2;
        this.LLILZ = 2131840908;
        this.LLILZLL = "CampainCenter";
    }

    public final Unit load(DataChannel dataChannel, InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIIJJI(this, dataChannel, interfaceViewOnClickListenerC1102800enu, true);
            return Unit.LIZ;
        }
        return null;
    }

    public final Unit setEnableClick(DataChannel dataChannel, boolean z) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIIIIZZ(this, dataChannel, z);
            return Unit.LIZ;
        }
        return null;
    }

    public final Unit setRedDotVisible(DataChannel dataChannel, boolean z) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LIZJ(this, dataChannel, z);
            return Unit.LIZ;
        }
        return null;
    }

    public /* synthetic */ EnumC1102750enp(int i, String str) {
        this(str, i, R.drawable.enf, 0, "");
    }

    public final void load(DataChannel dataChannel, InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu, boolean z) {
        this.isButtonVisible = z;
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIIJJI(this, dataChannel, interfaceViewOnClickListenerC1102800enu, z);
        }
    }

    public EnumC1102750enp(String str, int i, int i2, String str2) {
        this.isButtonVisible = true;
        this.isEnableClick = true;
        this.LLILZLL = "";
        this.LLILZIL = Integer.valueOf(i2);
        this.LLILZLL = str2;
    }

    public EnumC1102750enp(String str, int i, int i2, int i3, String str2) {
        this.isButtonVisible = true;
        this.isEnableClick = true;
        this.LLILZLL = "";
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZLL = str2;
    }

    public EnumC1102750enp(String str, int i, int i2, int i3, C1102880eo2 c1102880eo2, C1102880eo2 c1102880eo22, String str2) {
        this.isButtonVisible = true;
        this.isEnableClick = true;
        this.LLILZLL = "";
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LL = c1102880eo2;
        this.LLILLJJLI = c1102880eo22;
        this.LLILZLL = str2;
    }
}
