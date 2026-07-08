package X;

import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class EnumC1606030rtZ implements InterfaceC1605840rtG {
    public static final EnumC1606030rtZ ARCHIVE_V2;
    public static final EnumC1606030rtZ BIG_CARD;
    public static final EnumC1606030rtZ COMMENT;
    public static final C1606230rtt Companion;
    public static final EnumC1606030rtZ DM;
    public static final EnumC1606030rtZ FEED;
    public static final EnumC1606030rtZ FOLLOW_LIST;
    public static final EnumC1606030rtZ FOLLOW_SKYLIGHT;
    public static final EnumC1606030rtZ FRIENDS_SKYLIGHT;
    public static final EnumC1606030rtZ FYP_SKYLIGHT;
    public static final EnumC1606030rtZ GROUP_CHAT;
    public static final EnumC1606030rtZ INBOX;
    public static final EnumC1606030rtZ INBOX_SUGGESTED_ACCOUNT;
    public static final EnumC1606030rtZ INBOX_TOP_LIST;
    public static final /* synthetic */ EnumC1606030rtZ[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1606030rtZ MUSIC_COVER_AVATAR;
    public static final EnumC1606030rtZ MUSIC_VIEW_HOLDER;
    public static final EnumC1606030rtZ MY_PROFILE;
    public static final EnumC1606030rtZ OTHER;
    public static final EnumC1606030rtZ OTHER_PROFILE;
    public static final EnumC1606030rtZ PROFILE_VIEWS;
    public static final EnumC1606030rtZ PROP_VIEW_HOLDER;
    public static final EnumC1606030rtZ REPOST_PANEL;
    public static final EnumC1606030rtZ SCHOOL_FRIENDS_LIST;
    public static final EnumC1606030rtZ SEARCH;
    public static final EnumC1606030rtZ STORY_GUIDE_CARD;
    public static final EnumC1606030rtZ STORY_VIEWS_LIST_PANEL;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;

    public EnumC1606030rtZ() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1606030rtZ> getEntries() {
        return LLILZLL;
    }

    public boolean getDelegateShowEvent() {
        return false;
    }

    public boolean getEnableClickSelfAvatarToCreateStroy() {
        return false;
    }

    public boolean getHidePublishBadge() {
        return false;
    }

    public C1608950ryH getLottieSource() {
        return null;
    }

    public boolean getShowPublishEntry() {
        return false;
    }

    public EnterStoryParam getStoryPublishEnterParam() {
        return null;
    }

    public abstract /* synthetic */ void onEnterPlayer(SmartRoute smartRoute, String str, String str2);

    public void onMineAvatarShown(String str) {
    }

    public boolean skipGray() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.0rtt] */
    static {
        EnumC1606030rtZ enumC1606030rtZ = new EnumC1606030rtZ() { // from class: X.0rtY
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti.LIZ.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        FEED = enumC1606030rtZ;
        EnumC1606030rtZ enumC1606030rtZ2 = new EnumC1606030rtZ() { // from class: X.0rtb
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti.LIZ.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                if (str2 == null) {
                    str2 = this.LLIZLLLIL;
                }
                map.put("enter_position", str2);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        INBOX = enumC1606030rtZ2;
        EnumC1606030rtZ enumC1606030rtZ3 = new EnumC1606030rtZ() { // from class: X.0rtT
            public final String LLIZ = "head";
            public final boolean LLIZLLLIL = C1607070rvF.LIZIZ.LJI().LJIIIIZZ(EnumC1606080rte.MY_PROFILE);
            public final boolean LLJ;
            public final String LLJI;

            {
                this.LLJ = C298550Bn3.LIZIZ() == 2;
                this.LLJI = "STORY_ENTRANCE_MINE";
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getDelegateShowEvent() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                return C1606010rtX.LIZIZ.LIZIZ();
            }

            @Override // X.EnumC1606030rtZ
            public final EnterStoryParam getStoryPublishEnterParam() {
                return new EnterStoryParam(null, "click_head_plus", "personal_homepage", null, null, "personal_homepage", null, null, new ShootExtraData("personal_homepage", null, null, null, "click_head_plus", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 18, null, null, null, null, null, null, false, null, false, null, null, 67092185, null);
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getHidePublishBadge() {
                return this.LLJ;
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getShowPublishEntry() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLJI;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onMineAvatarShown(String str) {
                C1607070rvF.LIZIZ.LJI().LJIIZILJ(str);
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                User curUser;
                String uid;
                if (C1615106Ub.LIZIZ() && C1615106Ub.LIZJ() && !C1615106Ub.LIZ().asyncFull && (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) != null && (uid = curUser.getUid()) != null && uid.length() != 0) {
                    C1615006Ua.LIZ.getClass();
                    if (!C1615006Ua.LJ.compareAndSet(false, true)) {
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LJI("MineStoryDiskCache", "tryLoadFullFromDiskAndMergeSync: skip, already prepared in this process");
                    } else if (C1615006Ua.LJ()) {
                        int i2 = C2187451AjH.LIZ;
                        C1720106oR.LJI("MineStoryDiskCache", "tryLoadFullFromDiskAndMergeSync: skip, memory already has full real data");
                    } else {
                        C06UY.LIZ.getClass();
                        Aweme awemeLIZIZ = C06UY.LIZIZ(uid);
                        if (awemeLIZIZ != null) {
                            C1615006Ua.LIZ(awemeLIZIZ);
                        }
                    }
                }
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                smartRoute.withParam("immersive_shoot_enter_from", "personal_homepage");
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZ);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        MY_PROFILE = enumC1606030rtZ3;
        EnumC1606030rtZ enumC1606030rtZ4 = new EnumC1606030rtZ() { // from class: X.0rtU
            public final String LLIZ = "head";
            public final String LLIZLLLIL = "STORY_ENTRANCE_OTHER";

            @Override // X.EnumC1606030rtZ
            public final boolean getDelegateShowEvent() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                if (C420101kF.LIZ(EnumC1606080rte.OTHER_PROFILE)) {
                    return C1606010rtX.LIZIZ.LIZIZ();
                }
                return null;
            }

            @Override // X.EnumC1606030rtZ
            public final EnterStoryParam getStoryPublishEnterParam() {
                return new EnterStoryParam(null, "click_head_plus", "others_homepage", null, null, "others_homepage", null, null, new ShootExtraData("others_homepage", null, null, null, "click_head_plus", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 18, null, null, null, null, null, null, false, null, false, null, null, 67092185, null);
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("video_from", this.LLIZLLLIL);
                smartRoute.withParam("immersive_shoot_enter_from", "others_homepage");
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZ);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        OTHER_PROFILE = enumC1606030rtZ4;
        EnumC1606030rtZ enumC1606030rtZ5 = new EnumC1606030rtZ() { // from class: X.0rtc
            public final String LLIZ = "head";
            public final String LLIZLLLIL = "STORY_ENTRANCE_AVATAR";

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti.LIZ.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZLLLIL);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZ);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        FOLLOW_LIST = enumC1606030rtZ5;
        EnumC1606030rtZ enumC1606030rtZ6 = new EnumC1606030rtZ() { // from class: X.0rtS
            public final String LLIZ = "notification_page";
            public final String LLIZLLLIL = "top_cell";
            public final boolean LLJ = true;
            public final boolean LLJI = true;
            public final String LLJIJIL = "STORY_ENTRANCE_INBOX_TOP_LIST";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                return C1606010rtX.LIZIZ.LIZIZ();
            }

            @Override // X.EnumC1606030rtZ
            public final EnterStoryParam getStoryPublishEnterParam() {
                return new EnterStoryParam(null, "inbox_top_cell", this.LLIZ, null, null, "notification_page", "inbox_top_cell", null, new ShootExtraData("notification_page", null, null, null, "inbox_top_cell", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 18, null, null, null, null, null, null, false, null, false, null, null, 67092121, null);
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getEnableClickSelfAvatarToCreateStroy() {
                return this.LLJ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getShowPublishEntry() {
                return this.LLJI;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLJIJIL;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                c735840Sti.getClass();
                c735840Sti.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLJIJIL);
                smartRoute.withParam("enter_from", this.LLIZ);
                smartRoute.withParam("previous_page", "notification_page");
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
            }
        };
        INBOX_TOP_LIST = enumC1606030rtZ6;
        EnumC1606030rtZ enumC1606030rtZ7 = new EnumC1606030rtZ() { // from class: X.0rtk
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "interaction_panel";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        COMMENT = enumC1606030rtZ7;
        EnumC1606030rtZ enumC1606030rtZ8 = new EnumC1606030rtZ() { // from class: X.0rtl
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "recommend_panel";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        REPOST_PANEL = enumC1606030rtZ8;
        EnumC1606030rtZ enumC1606030rtZ9 = new EnumC1606030rtZ() { // from class: X.0rtV
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                if (C420101kF.LIZ(EnumC1606080rte.DM)) {
                    return C1606010rtX.LIZIZ.LIZIZ();
                }
                return null;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                if (str2 == null) {
                    str2 = this.LLIZLLLIL;
                }
                map.put("enter_position", str2);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        DM = enumC1606030rtZ9;
        EnumC1606030rtZ enumC1606030rtZ10 = new EnumC1606030rtZ() { // from class: X.0rtj
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        SEARCH = enumC1606030rtZ10;
        EnumC1606030rtZ enumC1606030rtZ11 = new EnumC1606030rtZ() { // from class: X.0rth
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                if (str2 == null) {
                    str2 = this.LLIZLLLIL;
                }
                map.put("enter_position", str2);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        INBOX_SUGGESTED_ACCOUNT = enumC1606030rtZ11;
        EnumC1606030rtZ enumC1606030rtZ12 = new EnumC1606030rtZ() { // from class: X.0rti
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        PROFILE_VIEWS = enumC1606030rtZ12;
        EnumC1606030rtZ enumC1606030rtZ13 = new EnumC1606030rtZ() { // from class: X.0rtR
            public final String LLIZ = "homepage_follow";
            public final String LLIZLLLIL = "top_cell";
            public final boolean LLJ = true;
            public final boolean LLJI = true;
            public final String LLJIJIL = "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW";

            @Override // X.EnumC1606030rtZ
            public final boolean getDelegateShowEvent() {
                return false;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                return C1606010rtX.LIZIZ.LIZIZ();
            }

            @Override // X.EnumC1606030rtZ
            public final EnterStoryParam getStoryPublishEnterParam() {
                return new EnterStoryParam(null, "follow_top_cell", "homepage_follow", null, null, "homepage_follow", "follow_top_cell", null, new ShootExtraData("homepage_follow", null, null, null, "follow_top_cell", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 18, null, null, null, null, null, null, false, null, false, null, null, 67092121, null);
            }

            @Override // X.EnumC1606030rtZ
            public final Integer getHasConsumedStoryColorRes() {
                return Integer.valueOf(R.attr.zk);
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getEnableClickSelfAvatarToCreateStroy() {
                return this.LLJ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getShowPublishEntry() {
                return this.LLJI;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLJIJIL;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                c735840Sti.getClass();
                c735840Sti.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("video_from", this.LLJIJIL);
                smartRoute.withParam("previous_page", "homepage_follow");
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
            }
        };
        FOLLOW_SKYLIGHT = enumC1606030rtZ13;
        EnumC1606030rtZ enumC1606030rtZ14 = new EnumC1606030rtZ() { // from class: X.0rtO
            public final String LLIZ = "homepage_friends";
            public final String LLIZLLLIL = "top_cell";
            public final boolean LLJ = true;
            public final boolean LLJI = true;
            public final String LLJIJIL = "STORY_ENTRANCE_FRIENDS_TOP_LIST";

            @Override // X.EnumC1606030rtZ
            public final boolean getDelegateShowEvent() {
                return false;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                return C1606010rtX.LIZIZ.LIZIZ();
            }

            @Override // X.EnumC1606030rtZ
            public final EnterStoryParam getStoryPublishEnterParam() {
                return new EnterStoryParam(null, "friends_top_cell", "homepage_friends", null, null, "homepage_friends", "friends_top_cell", null, new ShootExtraData("homepage_friends", null, null, null, "friends_top_cell", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 18, null, null, null, null, null, null, false, null, false, null, null, 67092121, null);
            }

            @Override // X.EnumC1606030rtZ
            public final Integer getHasConsumedStoryColorRes() {
                return Integer.valueOf(C319860CgK.LIZ() ? R.attr.a01 : R.attr.zk);
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getEnableClickSelfAvatarToCreateStroy() {
                return this.LLJ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getShowPublishEntry() {
                return this.LLJI;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLJIJIL;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                c735840Sti.getClass();
                c735840Sti.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("video_from", this.LLJIJIL);
                smartRoute.withParam("previous_page", "homepage_friends");
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
            }
        };
        FRIENDS_SKYLIGHT = enumC1606030rtZ14;
        EnumC1606030rtZ enumC1606030rtZ15 = new EnumC1606030rtZ() { // from class: X.0rtP
            public final String LLIZ = "homepage_hot";
            public final String LLIZLLLIL = "top_cell";
            public final boolean LLJ = true;
            public final boolean LLJI = true;
            public final String LLJIJIL = "STORY_ENTRANCE_FYP_TOP_LIST";

            @Override // X.EnumC1606030rtZ
            public final boolean getDelegateShowEvent() {
                return false;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                return C1606010rtX.LIZIZ.LIZIZ();
            }

            @Override // X.EnumC1606030rtZ
            public final EnterStoryParam getStoryPublishEnterParam() {
                return new EnterStoryParam(null, "hot_top_cell", "homepage_hot", null, null, "homepage_hot", "hot_top_cell", null, new ShootExtraData("homepage_hot", null, null, null, "hot_top_cell", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 18, null, null, null, null, null, null, false, null, false, null, null, 67092121, null);
            }

            @Override // X.EnumC1606030rtZ
            public final Integer getHasConsumedStoryColorRes() {
                return Integer.valueOf(R.attr.zk);
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getEnableClickSelfAvatarToCreateStroy() {
                return this.LLJ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getShowPublishEntry() {
                return this.LLJI;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLJIJIL;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                c735840Sti.getClass();
                c735840Sti.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("video_from", this.LLJIJIL);
                smartRoute.withParam("previous_page", "homepage_hot");
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
            }
        };
        FYP_SKYLIGHT = enumC1606030rtZ15;
        EnumC1606030rtZ enumC1606030rtZ16 = new EnumC1606030rtZ() { // from class: X.0rtW
            public final String LLIZ = "homepage_hot";
            public final String LLIZLLLIL = "story_card";
            public final String LLJ = "STORY_ENTRANCE_GUIDE_CARD";

            @Override // X.EnumC1606030rtZ
            public final C1608950ryH getLottieSource() {
                return null;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC1606030rtZ
            public final Integer getHasConsumedStoryColorRes() {
                return Integer.valueOf(R.attr.zk);
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLJ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                c735840Sti.getClass();
                c735840Sti.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_from", this.LLIZ);
                smartRoute.withParam("video_from", this.LLJ);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
            }
        };
        STORY_GUIDE_CARD = enumC1606030rtZ16;
        EnumC1606030rtZ enumC1606030rtZ17 = new EnumC1606030rtZ() { // from class: X.0rtd
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti.LIZ.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        STORY_VIEWS_LIST_PANEL = enumC1606030rtZ17;
        EnumC1606030rtZ enumC1606030rtZ18 = new EnumC1606030rtZ() { // from class: X.0rtr
            public final String LLIZ = "single_song";
            public final String LLIZLLLIL = "video_cover";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }
        };
        MUSIC_VIEW_HOLDER = enumC1606030rtZ18;
        EnumC1606030rtZ enumC1606030rtZ19 = new EnumC1606030rtZ() { // from class: X.0rts
            public final String LLIZ = "prop_page";
            public final String LLIZLLLIL = "video_cover";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }
        };
        PROP_VIEW_HOLDER = enumC1606030rtZ19;
        EnumC1606030rtZ enumC1606030rtZ20 = new EnumC1606030rtZ() { // from class: X.0rto
            public final String LLIZ = "single_song";
            public final String LLIZLLLIL = "head";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
            }

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }
        };
        MUSIC_COVER_AVATAR = enumC1606030rtZ20;
        EnumC1606030rtZ enumC1606030rtZ21 = new EnumC1606030rtZ() { // from class: X.0rta
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "big_card";
            public final boolean LLJ = C1607070rvF.LIZIZ.LJI().LJIIIIZZ(EnumC1606080rte.BIG_CARD);

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getShowPublishEntry() {
                return this.LLJ;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti.LIZ.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
            }
        };
        BIG_CARD = enumC1606030rtZ21;
        EnumC1606030rtZ enumC1606030rtZ22 = new EnumC1606030rtZ() { // from class: X.0rtm
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";
            public final String LLIZLLLIL = "school_community_page";

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti.LIZ.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
            }
        };
        SCHOOL_FRIENDS_LIST = enumC1606030rtZ22;
        EnumC1606030rtZ enumC1606030rtZ23 = new EnumC1606030rtZ() { // from class: X.0rtp
            public final String LLIZ = "STORY_ENTRANCE_AVATAR";

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }
        };
        OTHER = enumC1606030rtZ23;
        EnumC1606030rtZ enumC1606030rtZ24 = new EnumC1606030rtZ() { // from class: X.0rtQ
            public final String LLIZ = "STORY_ENTRANCE_INBOX_GROUP_CHAT";
            public final String LLIZLLLIL = "chat_group_head";

            @Override // X.EnumC1606030rtZ
            public final String getEnterPosition() {
                return this.LLIZLLLIL;
            }

            @Override // X.EnumC1606030rtZ
            public final String getVideoFrom() {
                return this.LLIZ;
            }

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                c735840Sti.getClass();
                c735840Sti.getClass();
                smartRoute.withParam("story type", 0);
                smartRoute.withParam("enter_from", str);
                smartRoute.withParam("video_from", this.LLIZ);
                smartRoute.withParam("enter_position", this.LLIZLLLIL);
                if (str == null) {
                    str = "";
                }
                smartRoute.withParam("previous_page", str);
                HashMap map = new HashMap();
                map.put("enter_position", this.LLIZLLLIL);
                smartRoute.withParam("feed_param_extra", map);
                smartRoute.withParam("story_cover_transition", true);
            }
        };
        GROUP_CHAT = enumC1606030rtZ24;
        EnumC1606030rtZ enumC1606030rtZ25 = new EnumC1606030rtZ() { // from class: X.0rtq
            public final boolean LLIZ = true;

            @Override // X.EnumC1606030rtZ, X.InterfaceC1605840rtG
            public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
            }

            @Override // X.EnumC1606030rtZ
            public final boolean getShowPublishEntry() {
                return this.LLIZ;
            }
        };
        ARCHIVE_V2 = enumC1606030rtZ25;
        EnumC1606030rtZ[] enumC1606030rtZArr = {enumC1606030rtZ, enumC1606030rtZ2, enumC1606030rtZ3, enumC1606030rtZ4, enumC1606030rtZ5, enumC1606030rtZ6, enumC1606030rtZ7, enumC1606030rtZ8, enumC1606030rtZ9, enumC1606030rtZ10, enumC1606030rtZ11, enumC1606030rtZ12, enumC1606030rtZ13, enumC1606030rtZ14, enumC1606030rtZ15, enumC1606030rtZ16, enumC1606030rtZ17, enumC1606030rtZ18, enumC1606030rtZ19, enumC1606030rtZ20, enumC1606030rtZ21, enumC1606030rtZ22, enumC1606030rtZ23, enumC1606030rtZ24, enumC1606030rtZ25};
        LLILZIL = enumC1606030rtZArr;
        LLILZLL = new C2254308sP(enumC1606030rtZArr);
        Companion = new Object() { // from class: X.0rtt
        };
    }

    public static EnumC1606030rtZ[] values() {
        return (EnumC1606030rtZ[]) LLILZIL.clone();
    }

    public String getEnterFrom() {
        return this.LLILLJJLI;
    }

    public String getEnterPosition() {
        return this.LLILLL;
    }

    public Integer getHasConsumedStoryColorRes() {
        return this.LLILZ;
    }

    public String getVideoFrom() {
        return this.LL;
    }

    public static EnumC1606030rtZ valueOf(String str) {
        return (EnumC1606030rtZ) C08FF.LIZ(EnumC1606030rtZ.class, str);
    }

    public EnumC1606030rtZ(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = "";
        this.LLILLJJLI = "";
        this.LLILLL = "";
        this.LLILZ = Integer.valueOf(R.attr.a01);
    }
}
