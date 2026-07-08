package X;

import Y.ACListenerS31S1300000_21;
import Y.ACListenerS59S1200000_21;
import Y.ACListenerS86S0300000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.longpress.LongPressPanelConfig;
import com.ss.android.ugc.aweme.longpress.LongPressPanelMoveTipConfig;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.service.EncourageLoginPopupManager;
import com.ss.android.ugc.aweme.service.IEncourageLogInService;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.settings.EnhanceSharePanelUIConfig;
import com.ss.android.ugc.aweme.share.settings.MoveTipConfig;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS170S1100000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371740lng {
    public static final /* synthetic */ int LJJIJLIJ = 0;
    public final Activity LIZ;
    public final Fragment LIZIZ;
    public final Aweme LIZJ;
    public final C0HTT<C737030Svd> LIZLLL;
    public final Bundle LJ;
    public final boolean LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final boolean LJJIII;
    public final boolean LJJIIJ;
    public final String LJJIIJZLJL;
    public final String LJJIIZ;
    public final boolean LJJIIZI;
    public C1379140lzc LJJIJIIJIL;
    public final C01GW LJJIJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(561));
    public final C01GW LJJIJIIJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1217));
    public final List<Function0<Unit>> LJJIJIL = new ArrayList();
    public final AbstractC19875512pd LJJIJL = AbstractC19875512pd.of("instagram", "instagram_story", "snapchat", "zalo", "whatsapp", "kakaotalk");

    static {
        new C1373190lq1();
    }

    public final boolean LJI() {
        if (!this.LJ.getBoolean("long_press_redesign", false)) {
            return false;
        }
        boolean z = this.LJ.getBoolean("long_press_is_my_profile", false);
        String string = this.LJ.getString("long_press_profile_tab_from", "");
        if (z) {
            EnumC1259080iry.Companion.getClass();
            EnumC1259080iry enumC1259080iry = EnumC1259080iry.map.get(string);
            if (enumC1259080iry == null) {
                enumC1259080iry = EnumC1259080iry.UNKNOWN;
            }
            if (enumC1259080iry == EnumC1259080iry.REPOST_TAB) {
                return false;
            }
        }
        return true;
    }

    public final AwemeSharePackage LJII() {
        C1375860luK c1375860luK = AwemeSharePackage.Companion;
        Aweme aweme = this.LIZJ;
        Activity activity = this.LIZ;
        int i = this.LJI;
        String str = this.LJII;
        String str2 = this.LJIIIIZZ;
        String str3 = this.LJIIIZ;
        c1375860luK.getClass();
        AwemeSharePackage awemeSharePackageLIZJ = C1375860luK.LIZJ(aweme, activity, i, str, str2, str3, true);
        C786410Ut5.LJJIIJZLJL(awemeSharePackageLIZJ.extras, this.LJ);
        LJIIL(awemeSharePackageLIZJ);
        awemeSharePackageLIZJ.extras.putBoolean("is_video_only", this.LJJI);
        awemeSharePackageLIZJ.extras.putBoolean("icon_highlight_status", this.LJJ);
        C786410Ut5.LJJJI("author_id", C735370Ssx.LIZLLL(this.LIZJ), awemeSharePackageLIZJ.extras);
        C786410Ut5.LJJJI("enter_from", this.LJII, awemeSharePackageLIZJ.extras);
        C786410Ut5.LJJJI("content_type", C735370Ssx.LJFF(this.LIZJ), awemeSharePackageLIZJ.extras);
        LJIILJJIL(awemeSharePackageLIZJ);
        LJIILIIL(this.LIZJ, awemeSharePackageLIZJ);
        return awemeSharePackageLIZJ;
    }

    public final void LJIIJ() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        RootCellComponent rootCellComponentLIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        FeedBarSearchAbility feedBarSearchAbility;
        if (this.LIZIZ.getActivity() == null || this.LIZIZ.isDetached()) {
            return;
        }
        ((BottomToastVM) ViewModelProviders.of(this.LIZIZ).get(BottomToastVM.class)).LLILZ.postValue(Boolean.FALSE);
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LIZIZ);
        if (interfaceC665370Q7zLJ == null || (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) == null || (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) == null || (rootCellComponentLIZ = C0T0X.LIZ(c0sz8LJLIL)) == null || (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(rootCellComponentLIZ)) == null || (feedBarSearchAbility = (FeedBarSearchAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FeedBarSearchAbility.class, null)) == null) {
            return;
        }
        feedBarSearchAbility.pw2();
    }

    public static boolean LJ(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getAuthor() != null || C1019620cdk.LIZIZ(3, aweme)) {
                if (aweme.getVideo() != null || C729510SjV.LJIJ(aweme) || aweme.getAwemeType() == 504) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String LJIIIIZZ(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (AwemeSaaSExtKt.isLive(aweme)) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                return Long.valueOf(newLiveRoomData.getAnchorId()).toString();
            }
            return null;
        }
        if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
            String uid = aweme.getAuthor().getUid();
            uid.toString();
            return uid;
        }
        return null;
    }

    public static String LJIIIZ(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (AwemeSaaSExtKt.isLive(aweme)) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                return Long.valueOf(newLiveRoomData.id).toString();
            }
            return null;
        }
        if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
            return String.valueOf(aweme.getAuthor().roomId);
        }
        return null;
    }

    public static void LJIILJJIL(AwemeSharePackage awemeSharePackage) {
        String str;
        if (!C729510SjV.LJJIJIL(awemeSharePackage.LJJIFFI())) {
            C786410Ut5.LJJJI("story_type", "post", awemeSharePackage.extras);
            return;
        }
        C786410Ut5.LJJJI("story_type", "story", awemeSharePackage.extras);
        Bundle bundle = awemeSharePackage.extras;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        Aweme awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        c735840Sti.getClass();
        bundle.putInt("is_share_to_story", C735840Sti.LJIIIZ(awemeLJJIFFI));
        awemeSharePackage.extras.putInt("is_story_to_normal", awemeSharePackage.LJJIFFI().getIsStoryToNormal() ? 1 : 0);
        C786410Ut5.LJJJI("story_music_with_mute", C1609930rzr.LJJIFFI(awemeSharePackage.LJJIFFI()), awemeSharePackage.extras);
        C786410Ut5.LJJJI("story_style_version", String.valueOf(C735840Sti.LJIJJ(awemeSharePackage.LJJIFFI())), awemeSharePackage.extras);
        Bundle bundle2 = awemeSharePackage.extras;
        C786410Ut5.LJJJI("enter_position", bundle2.getString("enter_position"), bundle2);
        Bundle bundle3 = awemeSharePackage.extras;
        if (AwemeBizExtKt.getHasFriendsTag(awemeSharePackage.LJJIFFI())) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("has_friends_tag", str, bundle3);
    }

    public final boolean LJFF(Aweme aweme) {
        boolean z;
        boolean z2;
        List<CameoInfo> cameoInfo;
        String userId;
        UserBaseInfo userBaseInfo;
        AwemeStatus statusSafety;
        if (!AwemeExtKt.isProhibited(aweme) && !AwemeExtKt.isDelete(aweme)) {
            if (AwemeExtKt.getStatusSafety(aweme) != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 1) {
                z = true;
            } else {
                z = false;
            }
            AITheaterInfo aITheaterInfo = aweme.aiTheaterInfo;
            if (aITheaterInfo != null && (cameoInfo = aITheaterInfo.getCameoInfo()) != null && !cameoInfo.isEmpty()) {
                for (CameoInfo cameoInfo2 : cameoInfo) {
                    if (cameoInfo2 != null && (userBaseInfo = cameoInfo2.getUserBaseInfo()) != null) {
                        userId = userBaseInfo.getUserId();
                    } else {
                        userId = null;
                    }
                    if (Intrinsics.LJFF(userId, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            if (!z || z2) {
                return true;
            }
            C1233040iBy c1233040iBy = new C1233040iBy(this.LIZ);
            c1233040iBy.LIZIZ(2131858174);
            c1233040iBy.LIZLLL();
            return false;
        }
        C1233040iBy c1233040iBy2 = new C1233040iBy(this.LIZ);
        c1233040iBy2.LIZIZ(2131858174);
        c1233040iBy2.LIZLLL();
        return false;
    }

    public final void LJIIL(AwemeSharePackage awemeSharePackage) {
        Bundle bundle;
        if (!C1EE2.LIZIZ.LIZLLL()) {
            return;
        }
        if (awemeSharePackage.extras.containsKey("is_enter_graphic_detail")) {
            bundle = awemeSharePackage.extras;
        } else if (!this.LJ.containsKey("is_enter_graphic_detail")) {
            return;
        } else {
            bundle = this.LJ;
        }
        if (bundle != null) {
            int i = bundle.getInt("is_enter_graphic_detail");
            awemeSharePackage.extras.putInt("is_enter_graphic_detail", i);
            this.LJ.putInt("is_enter_graphic_detail", i);
        }
    }

    public final void LJIILL(AwemeSharePackage awemeSharePackage) {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C0N0Y playerManager;
        String string;
        IViewPagerComponentAbility iViewPagerComponentAbility2;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ2;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        String string2;
        C786410Ut5.LJJJI("log_aweme_type", String.valueOf(awemeSharePackage.LJJIFFI().getAwemeType()), awemeSharePackage.extras);
        String str = "";
        if (AwemeExtKt.isPhotoMode(awemeSharePackage.LJJIFFI())) {
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LIZIZ);
            if (interfaceC665370Q7zLJ != null && (iViewPagerComponentAbility2 = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) != null && (c0sz8LJLIL2 = iViewPagerComponentAbility2.LJLIL()) != null && (interfaceC665370Q7zLIZ2 = C0T0K.LIZ(c0sz8LJLIL2)) != null && (iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ2, IPhotoSlidesAbility.class, null)) != null && (string2 = Integer.valueOf(iPhotoSlidesAbility.xt0()).toString()) != null) {
                str = string2;
            }
            C786410Ut5.LJJJI("visual_search_long_press_index", str, awemeSharePackage.extras);
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJ2 = C1578630rBN.LJ(this.LIZIZ);
        if (interfaceC665370Q7zLJ2 != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ2, IViewPagerComponentAbility.class, null)) != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null && (interfaceC665370Q7zLIZ = C0T0K.LIZ(c0sz8LJLIL)) != null && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IFeedPanelPlatformAbility.class, null)) != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility.x32()) != null && (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) != null && (string = Long.valueOf(playerManager.getCurrentPosition()).toString()) != null) {
            str = string;
        }
        C786410Ut5.LJJJI("visual_search_long_press_timestamp", str, awemeSharePackage.extras);
    }

    public static void LJIILIIL(Aweme aweme, AwemeSharePackage awemeSharePackage) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        SchoolMutualStruct schoolMutualStruct;
        String str;
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) != null) {
            Bundle bundle = awemeSharePackage.extras;
            int i = schoolMutualStruct.schoolContentType;
            String str2 = null;
            if (i != 1) {
                if (i != 2) {
                    str = null;
                } else {
                    str = "college_related_post";
                }
            } else {
                str = "college_member_post";
            }
            C786410Ut5.LJJJI("school_content_type", str, bundle);
            Bundle bundle2 = awemeSharePackage.extras;
            int i2 = schoolMutualStruct.viewerVerifyStatus;
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "potential";
                }
            } else {
                str2 = "verified";
            }
            C786410Ut5.LJJJI("school_consumer_type", str2, bundle2);
        }
    }

    public final void LIZ(AwemeSharePackage awemeSharePackage, C1371600lnS c1371600lnS, ShareConfiguration<BaseSharePackage> shareConfiguration) {
        System.currentTimeMillis();
        C1379140lzc c1379140lzc = new C1379140lzc(this.LIZJ, false, this.LIZ, this.LIZIZ, c1371600lnS, this.LIZLLL, this.LJIIIIZZ, this.LJII, this.LJI, "share_board", this.LJIIZILJ, this.LJIJ, this.LJIJJLI, this.LJIL, this.LJFF, this.LJIIIZ, shareConfiguration.LJI(awemeSharePackage).O12(), awemeSharePackage);
        this.LJJIJIIJIL = c1379140lzc;
        c1379140lzc.LJJJJZI();
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [X.0kwE] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Integer, java.lang.Object] */
    public final void LIZIZ(final AwemeSharePackage awemeSharePackage, C1371600lnS c1371600lnS, ShareConfiguration<BaseSharePackage> shareConfiguration) {
        EnumC1369720lkQ enumC1369720lkQ;
        Integer num;
        boolean z;
        boolean z2;
        MoveTipConfig moveTipConfig;
        int iIntValue;
        C0RJN c0rjnLIZIZ;
        int iIntValue2;
        int i;
        EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ;
        LongPressPanelConfig longPressPanelConfig;
        LongPressPanelMoveTipConfig longPressPanelMoveTipConfig;
        int iIntValue3;
        boolean zLJIJ = C729510SjV.LJIJ(this.LIZJ);
        if (C729510SjV.LJJIJIL(this.LIZJ)) {
            boolean zLJFF = Intrinsics.LJFF(this.LJII, "story_archive");
            Aweme aweme = this.LIZJ;
            StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
            if ((storyHighlightInfo == null || !storyHighlightInfo.sharedFromHighlightImmersiveFeed) && (zLJFF || zLJIJ || C729510SjV.LJJI(aweme))) {
                c1371600lnS.LJJIIJZLJL = false;
                c1371600lnS.LJJIII = R.string.f1_;
            }
        }
        SheetActionProtocol sheetActionProtocolLJI = shareConfiguration.LJI(awemeSharePackage);
        final ShareChannelProtocol shareChannelProtocolLIZJ = shareConfiguration.LIZJ(this.LIZ, awemeSharePackage);
        final SharePanelLogicProtocol sharePanelLogicProtocolLJ = shareConfiguration.LJ(awemeSharePackage);
        CustomSharePanelBarProtocol customSharePanelBarProtocolLIZ = shareConfiguration.LIZ(awemeSharePackage);
        final boolean z3 = awemeSharePackage.extras.getBoolean("is_tako_ai_video", false);
        c1371600lnS.LJJIL = new C1355090lMp() { // from class: X.0lnh
            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
                InterfaceC1371860lns interfaceC1371860lnsLK0 = shareChannelProtocolLIZJ.LK0();
                if (interfaceC1371860lnsLK0 != null) {
                    interfaceC1371860lnsLK0.LIZJ();
                }
            }

            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJ(Context context, BaseSharePackage baseSharePackage) {
                this.LIZ.LJIIJ();
            }

            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage) {
                List<Function0<Unit>> list;
                Activity activity;
                Fragment fragmentLIZLLL;
                boolean z4;
                if (C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LJIIIZ(null)) {
                    C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.OTHER_EXIT.getType(), "", this.LIZ.LJII));
                }
                Activity activity2 = this.LIZ.LIZ;
                if (baseSharePackage.extras.getBoolean("open_long_press_panel_by_bottom_tips", false)) {
                    String string = baseSharePackage.extras.getString("key_dismiss_panel_reason", null);
                    if (Intrinsics.LJFF(string, "slide_down") || Intrinsics.LJFF(string, "click_outside")) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                        c1389890mGx.LJIIIZ(2131833937);
                        c1389890mGx.LJIIJJI();
                    }
                }
                C0HTT<C737030Svd> c0htt = this.LIZ.LIZLLL;
                if (c0htt != null) {
                    C737030Svd c737030Svd = new C737030Svd(28);
                    Bundle bundle = c737030Svd.LIZJ;
                    if (bundle == null) {
                        bundle = new Bundle();
                        c737030Svd.LIZJ = bundle;
                    }
                    Bundle bundle2 = baseSharePackage.extras;
                    if (bundle2 != null) {
                        z4 = bundle2.getBoolean("should_keep_loop_collection_sign", false);
                    } else {
                        z4 = false;
                    }
                    bundle.putBoolean("should_keep_loop_collection_sign", z4);
                    c0htt.LLIIL(c737030Svd);
                }
                this.LIZ.LJIIJ();
                ShareExtService shareExtService = (ShareExtService) PluggableExtentionKt.pluggableSpi$default(ShareExtService.class, false, false, false, 14, null);
                if (shareExtService != null) {
                    shareExtService.LJIIJ(this.LIZ.LIZJ);
                }
                int i2 = 2;
                if (!this.LIZ.LJFF) {
                    String string2 = baseSharePackage.extras.getString("share_action_key");
                    int i3 = baseSharePackage.extras.getInt("share_action_code");
                    String string3 = baseSharePackage.extras.getString("share_platform");
                    int i4 = baseSharePackage.extras.getInt("share_channel_code");
                    if ((string2 != null || string3 != null) && !Intrinsics.LJFF(string2, "captions") && i3 != 2 && !Intrinsics.LJFF(string3, "copy") && i4 != 2 && !Intrinsics.LJFF(string2, "auto_rotation") && !Intrinsics.LJFF(string2, "dislike")) {
                        this.LIZ.LIZ.finish();
                    }
                }
                if (C726220SeC.LIZIZ.LIZ(this.LIZ.LIZ)) {
                    Activity activity3 = this.LIZ.LIZ;
                    activity3.getWindow().setNavigationBarColor(C446980Hfs.LIZ(activity3, R.color.fw));
                }
                if (Intrinsics.LJFF(this.LIZ.LJIIIIZZ, "long_press") && (activity = this.LIZ.LIZ) != null && !activity.isFinishing() && !this.LIZ.LIZ.isDestroyed()) {
                    IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                    if (iDetailFeedSafService != null) {
                        fragmentLIZLLL = iDetailFeedSafService.LIZLLL(this.LIZ.LIZIZ);
                    } else {
                        fragmentLIZLLL = null;
                    }
                    if (!(fragmentLIZLLL instanceof InterfaceC1058480deQ)) {
                        Activity activity4 = this.LIZ.LIZ;
                        if (activity4 instanceof InterfaceC1603190roz) {
                            i2 = 1;
                        } else if (!(activity4 instanceof InterfaceC1058480deQ)) {
                            i2 = -1;
                        }
                    }
                    C1372310lob c1372310lob = new C1372310lob(i2, this.LIZ.LIZ.hashCode());
                    if (Intrinsics.LJFF(null, "report")) {
                        c1372310lob.LJI = true;
                    }
                    C1440005kM.LIZ(c1372310lob);
                }
                if (((InterfaceC1364710lcL) this.LIZ.LJJIJIIJI.getValue()).LJJJIL() && !Intrinsics.LJFF(this.LIZ.LJIL, "graphic_detail")) {
                    C1440005kM.LIZ(new C737030Svd(29));
                }
                Iterator it2 = ((ArrayList) this.LIZ.LJJIJIL).iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
                C1379140lzc c1379140lzc = this.LIZ.LJJIJIIJIL;
                if (c1379140lzc != null && (list = c1379140lzc.LJIJ) != null) {
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        ((Function0) it3.next()).invoke();
                    }
                }
                if (z3) {
                    C1440005kM.LIZ(new C1371870lnt(false));
                }
            }

            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                boolean z4;
                C1371740lng c1371740lng = this.LIZ;
                c1371740lng.getClass();
                if (interfaceC1370310llN instanceof C1375970luV) {
                    C786410Ut5.LJJJI("share_form", "url_form", c1371740lng.LJ);
                } else if (!TextUtils.equals(interfaceC1370310llN.key(), "gif") && !TextUtils.equals(interfaceC1370310llN.key(), "live_photo") && ((!TextUtils.equals(interfaceC1370310llN.key(), "save") && !TextUtils.equals(interfaceC1370310llN.key(), "save_photo")) || interfaceC1370310llN.LJIIJJI() != 2)) {
                    return;
                }
                C1371740lng c1371740lng2 = this.LIZ;
                String strKey = interfaceC1370310llN.key();
                SharePackage sharePackage = (SharePackage) baseSharePackage;
                Aweme aweme2 = this.LIZ.LIZJ;
                if (interfaceC1370310llN.LJIIJJI() != 2 && !(interfaceC1370310llN instanceof C1375970luV)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                c1371740lng2.LJIIJJI(strKey, true, sharePackage, context, aweme2, z4, false, interfaceC1370310llN.LJIIJJI());
            }

            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                if (this.LIZ.LIZJ.getAwemeType() == 150) {
                    C621180OYa.LIZIZ.LIZ();
                }
                if (((InterfaceC1364710lcL) this.LIZ.LJJIJIIJI.getValue()).LJJJIL()) {
                    C1440005kM.LIZ(new C737030Svd(3, this.LIZ.LIZJ));
                }
                if (C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LJIIIZ(null)) {
                    C1440005kM.LIZ(new C714060Rzg(true, EnumC1616310sA9.OTHER_EXIT.getType(), "", this.LIZ.LJII));
                }
                InterfaceC1366490lfD interfaceC1366490lfDT72 = sharePanelLogicProtocolLJ.T72();
                if (interfaceC1366490lfDT72 != null) {
                    interfaceC1366490lfDT72.LIZJ(view, c1371590lnR, c1370190llB);
                }
                if (z3) {
                    C1440005kM.LIZ(new C1371870lnt(true));
                }
            }

            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
                InterfaceC1371860lns interfaceC1371860lnsLK0 = shareChannelProtocolLIZJ.LK0();
                if (interfaceC1371860lnsLK0 != null) {
                    interfaceC1371860lnsLK0.LIZIZ(baseSharePackage, list);
                }
            }

            @Override // X.C1355090lMp, X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z4, BaseSharePackage baseSharePackage, Context context) {
                InterfaceC1371860lns interfaceC1371860lnsLK0;
                this.LIZ.LJIILLIIL(interfaceC1369790lkX, z4, baseSharePackage, context);
                if (baseSharePackage != null && (interfaceC1371860lnsLK0 = shareChannelProtocolLIZJ.LK0()) != null) {
                    interfaceC1371860lnsLK0.LIZ(interfaceC1369790lkX, z4, baseSharePackage, context);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
            @Override // X.C1355090lMp, X.InterfaceC1361850lXj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJII(android.content.Context r6, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7, X.InterfaceC1369790lkX r8, X.InterfaceC1364105Vn r9) {
                /*
                    r5 = this;
                    boolean r0 = r9 instanceof X.C1371800lnm
                    if (r0 == 0) goto L44
                    r4 = r9
                    X.0lnm r4 = (X.C1371800lnm) r4
                    int r2 = r4.LLILLL
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L44
                    int r2 = r2 - r1
                    r4.LLILLL = r2
                L12:
                    java.lang.Object r3 = r4.LL
                    java.lang.Object r2 = X.C099R.LJFF()
                    int r0 = r4.LLILLL
                    r1 = 1
                    if (r0 == 0) goto L36
                    if (r0 != r1) goto L5d
                    X.C155000ia.LIZIZ(r3)
                L22:
                    X.0lng r0 = r5.LIZ
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZJ
                    boolean r0 = r0.isAd()
                    if (r0 == 0) goto L5a
                    X.1D1g r2 = new X.1D1g
                    X.0lng r0 = r5.LIZ
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZJ
                    r2.<init>(r0)
                    goto L4a
                L36:
                    X.C155000ia.LIZIZ(r3)
                    X.0lng r0 = r5.LIZ
                    r4.LLILLL = r1
                    java.lang.Object r0 = r0.LIZLLL(r6, r7, r8, r4)
                    if (r0 != r2) goto L22
                    return r2
                L44:
                    X.0lnm r4 = new X.0lnm
                    r4.<init>(r5, r9)
                    goto L12
                L4a:
                    X.0ckk r1 = X.C2246311Cw1.LIZ     // Catch: java.lang.Exception -> L56
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LIZ     // Catch: java.lang.Exception -> L56
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()     // Catch: java.lang.Exception -> L56
                    r2.logAd(r1, r0)     // Catch: java.lang.Exception -> L56
                    goto L5a
                L56:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L5a:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L5d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1371750lnh.LJII(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.0lkX, X.05Vn):java.lang.Object");
            }
        };
        c1371600lnS.LJJJJIZL = false;
        if (c1371600lnS.LJJJJLL) {
            c1371600lnS.LJJJJJL = true;
        } else {
            c1371600lnS.LJJJJJL = false;
        }
        View viewAs0 = sharePanelLogicProtocolLJ.As0();
        if (viewAs0 != null) {
            c1371600lnS.LJJJJLL = true;
            c1371600lnS.LJJJJZ = new AwS670S0100000_21(viewAs0, 21);
        }
        c1371600lnS.LJJLIIIJILLIZJL = sharePanelLogicProtocolLJ.getUiConfig();
        if (Intrinsics.LJFF(this.LJIIIZ, "long_press")) {
            enumC1369720lkQ = EnumC1369720lkQ.COLLAPSE;
        } else {
            enumC1369720lkQ = EnumC1369720lkQ.EXPAND;
        }
        c1371600lnS.LIZIZ = enumC1369720lkQ;
        c1371600lnS.LIZJ = shareChannelProtocolLIZJ.tC2();
        c1371600lnS.LJIIIIZZ = sheetActionProtocolLJI.O12();
        c1371600lnS.LJIIIZ = sheetActionProtocolLJI.P82();
        c1371600lnS.LJIIJ = sheetActionProtocolLJI.zT0();
        c1371600lnS.LJJLIIIJJI = sheetActionProtocolLJI.getUiConfig();
        c1371600lnS.LJJLIIIJJIZ = shareChannelProtocolLIZJ.getUiConfig();
        EnumC1371620lnU enumC1371620lnUXc0 = shareChannelProtocolLIZJ.xc0();
        if (enumC1371620lnUXc0 == null) {
            enumC1371620lnUXc0 = EnumC1371620lnU.SYNC;
        }
        c1371600lnS.LIZLLL = enumC1371620lnUXc0;
        c1371600lnS.LJ = shareChannelProtocolLIZJ.Ay2();
        c1371600lnS.LJIIJJI = customSharePanelBarProtocolLIZ.Mq1();
        c1371600lnS.LJIIL = customSharePanelBarProtocolLIZ.FM();
        c1371600lnS.LJIILIIL = customSharePanelBarProtocolLIZ.nz();
        c1371600lnS.LJIILJJIL = customSharePanelBarProtocolLIZ.sG();
        C1362230lYL c1362230lYLZA1 = customSharePanelBarProtocolLIZ.zA1();
        if (c1362230lYLZA1 != null) {
            String string = awemeSharePackage.extras.getString("enter_from", "");
            C1379120lza c1379120lza = C1379120lza.LIZ;
            String str = this.LJIIIZ;
            c1379120lza.getClass();
            if (C1379120lza.LIZIZ(str) && C1379120lza.LIZLLL(awemeSharePackage, string)) {
                c1362230lYLZA1.LJIILL = Integer.valueOf(R.attr.a1e);
            }
        } else {
            c1362230lYLZA1 = null;
        }
        c1371600lnS.LJJLIIIJL = c1362230lYLZA1;
        C1362230lYL c1362230lYLZA12 = customSharePanelBarProtocolLIZ.zA1();
        if (c1362230lYLZA12 != null && c1362230lYLZA12.LIZ) {
            num = 56;
        } else {
            num = null;
        }
        c1371600lnS.LJJIIZI = num;
        c1371600lnS.LJJIJ = num;
        String str2 = this.LJIIIIZZ;
        final Activity activity = this.LIZ;
        Fragment fragment = this.LIZIZ;
        Aweme aweme2 = this.LIZJ;
        Bundle bundle = this.LJ;
        C1371850lnr c1371850lnr = new C1371850lnr(activity, fragment, aweme2, bundle);
        String string2 = awemeSharePackage.extras.getString("enter_from", "");
        C1379120lza.LIZ.getClass();
        boolean zLIZLLL = C1379120lza.LIZLLL(awemeSharePackage, string2);
        if (C1379120lza.LIZIZ(str2) && zLIZLLL) {
            LPPProtocol lPPProtocolLIZ = C1379120lza.LIZ();
            if (lPPProtocolLIZ != null && (longPressPanelConfig = lPPProtocolLIZ.longPressPanelConfig) != null && (longPressPanelMoveTipConfig = longPressPanelConfig.moveTipConfig) != null && Intrinsics.LJFF(longPressPanelMoveTipConfig.enable, Boolean.TRUE)) {
                C1371810lnn.LIZ.getClass();
                if (Intrinsics.LJFF(string2, "homepage_hot")) {
                    C607070NrV<Integer> c607070NrV = C1371810lnn.LIZIZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1371840lnq.LIZ;
                    Object objLIZ = c607070NrV.LIZLLL;
                    if (objLIZ == null) {
                        objLIZ = C12848051a.LIZ(c607070NrV.LIZ, c607070NrV.LIZJ, c607070NrV.LIZIZ);
                    }
                    iIntValue3 = ((Number) objLIZ).intValue();
                } else {
                    C607070NrV<Integer> c607070NrV2 = C1371810lnn.LIZJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1371840lnq.LIZ;
                    Object objLIZ2 = c607070NrV2.LIZLLL;
                    if (objLIZ2 == null) {
                        objLIZ2 = C12848051a.LIZ(c607070NrV2.LIZ, c607070NrV2.LIZJ, c607070NrV2.LIZIZ);
                    }
                    iIntValue3 = ((Number) objLIZ2).intValue();
                }
                final int i2 = 0;
                boolean z4 = bundle.getBoolean("open_long_press_panel_by_bottom_tips", false);
                if (iIntValue3 > 0 && !z4) {
                    C786410Ut5.LJJJI("enter_from", string2, bundle);
                    bundle.putBoolean("key_enhance_share_panel_block_bottom_tips", true);
                    final AttributeSet attributeSet = null;
                    C1370680lly c1370680lly = new C1370680lly(new ConstraintLayout(activity, attributeSet, i2) { // from class: X.0kwE
                        /* JADX WARN: Removed duplicated region for block: B:59:0x01d4  */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
                        {
                            /*
                                Method dump skipped, instruction units count: 525
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1338600kwE.<init>(android.content.Context, android.util.AttributeSet, int):void");
                        }
                    });
                    View view = c1370680lly.LIZ;
                    AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(532);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                    }
                    aFwS236S0000000_6.invoke(layoutParams);
                    C786410Ut5.W5(view, layoutParams);
                    AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c1370680lly, 1553);
                    String string3 = bundle.getString("enter_from", "");
                    C786410Ut5.I7(new ACListenerS31S1300000_21(c1371850lnr, awS565S0100000_21, view, string3, 3), view);
                    C786410Ut5.I7(new ACListenerS59S1200000_21(view, string3, c1371850lnr, 2), view.findViewById(R.id.i45));
                    C0T6L.LIZ(view, new AwS170S1100000_21(string3, c1371850lnr, 8));
                    c1371600lnS.LJJIJLIJ = c1370680lly;
                    if (Intrinsics.LJFF(string2, "homepage_hot")) {
                        C607070NrV<Integer> c607070NrV3 = C1371810lnn.LIZIZ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C1371840lnq.LIZ;
                        Object objLIZ3 = c607070NrV3.LIZLLL;
                        if (objLIZ3 == null) {
                            objLIZ3 = C12848051a.LIZ(c607070NrV3.LIZ, c607070NrV3.LIZJ, c607070NrV3.LIZIZ);
                        }
                        ?? ValueOf = Integer.valueOf(((Number) objLIZ3).intValue() - 1);
                        C12848051a.LIZIZ(c607070NrV3.LIZ, ValueOf, c607070NrV3.LIZIZ);
                        c607070NrV3.LIZLLL = ValueOf;
                    } else {
                        C607070NrV<Integer> c607070NrV4 = C1371810lnn.LIZJ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = C1371840lnq.LIZ;
                        Object objLIZ4 = c607070NrV4.LIZLLL;
                        if (objLIZ4 == null) {
                            objLIZ4 = C12848051a.LIZ(c607070NrV4.LIZ, c607070NrV4.LIZJ, c607070NrV4.LIZIZ);
                        }
                        ?? ValueOf2 = Integer.valueOf(((Number) objLIZ4).intValue() - 1);
                        C12848051a.LIZIZ(c607070NrV4.LIZ, ValueOf2, c607070NrV4.LIZIZ);
                        c607070NrV4.LIZLLL = ValueOf2;
                    }
                }
            }
            c1371600lnS.LJJIIZ = true;
        }
        final Activity activity2 = this.LIZ;
        final Fragment fragment2 = this.LIZIZ;
        String str3 = this.LJIIIZ;
        final Aweme aweme3 = this.LIZJ;
        if (Intrinsics.LJFF(str3, "share_panel") && !AwemeSaaSExtKt.isLive(aweme3) && !C0SXF.LJIL(activity2) && !C1369770lkV.LJ(c1371600lnS) && C1371040lmY.LIZLLL()) {
            C786410Ut5.LJJJI("group_id", C735370Ssx.LIZJ(aweme3), awemeSharePackage.extras);
            boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
            if (!ComplianceServiceProvider.LJIL().LJJJJZI() && zIsLogin) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1369770lkV.LJIIIIZZ(awemeSharePackage);
            C1369770lkV.LIZLLL(awemeSharePackage);
            if (!C729510SjV.LJJIJIL(aweme3) && z2 && !C1599640rjG.LIZIZ.Pu(fragment2) && (enhanceSharePanelUIConfigLIZIZ = C1371040lmY.LIZIZ()) != null && Intrinsics.LJFF(enhanceSharePanelUIConfigLIZIZ.preposeCreateGroup, Boolean.TRUE)) {
                awemeSharePackage.extras.putBoolean("use_enhance_share_panel_prepose_create_group", true);
            }
            if (!C729980SkG.LJIIIIZZ(aweme3)) {
                C1369770lkV.LIZ(awemeSharePackage);
                if (C1371040lmY.LIZ()) {
                    EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ2 = C1371040lmY.LIZIZ();
                    if (enhanceSharePanelUIConfigLIZIZ2 != null) {
                        moveTipConfig = enhanceSharePanelUIConfigLIZIZ2.moveTipConfig;
                    } else {
                        moveTipConfig = null;
                    }
                    if (!awemeSharePackage.extras.getBoolean("key_enhance_share_panel_block_bottom_tips", false) && moveTipConfig != null && Intrinsics.LJFF(moveTipConfig.enable, Boolean.TRUE)) {
                        int i3 = ((Keva) C1372270loX.LIZ.getValue()).getInt("key_play_tip_show_count", 0);
                        Integer num2 = moveTipConfig.moveTipsDisplayCount;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (i3 < iIntValue && !C1599640rjG.LIZIZ.Pu(fragment2) && ((c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment2)) == null || !C1389300mG0.LJJI(c0rjnLIZIZ))) {
                            View viewTd = C786410Ut5.Td(C786410Ut5.ne(activity2), R.layout.f8h, new FrameLayout(activity2), false);
                            final C1370670llx c1370670llx = new C1370670llx(viewTd);
                            C786410Ut5.I7(new ACListenerS86S0300000_21(viewTd, awemeSharePackage, aweme3, 14), viewTd.findViewById(R.id.lc0));
                            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.tv_title);
                            String string4 = activity2.getString(2131833934);
                            String string5 = activity2.getString(2131833935, string4);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string5);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, activity2);
                            if (numLIZJ != null) {
                                iIntValue2 = numLIZJ.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            int iLJJJ = a0.LJJJ(string5, string4, 0, false, 6);
                            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue2), iLJJJ, string4.length() + iLJJJ, 33);
                            tuxTextView.setText(spannableStringBuilder);
                            if (C497820Jfg.LIZ(activity2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT)))) {
                                i = 92;
                            } else {
                                i = 72;
                            }
                            tuxTextView.setTuxFont(i);
                            C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0lmb
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    InterfaceC1362720lZ8 interfaceC1362720lZ8 = c1370670llx.LIZIZ;
                                    if (interfaceC1362720lZ8 != null) {
                                        interfaceC1362720lZ8.F8(new C343950De5());
                                    }
                                    Bundle bundle2 = new Bundle();
                                    BaseSharePackage baseSharePackage = awemeSharePackage;
                                    baseSharePackage.extras.remove("key_share_panel_action_adjust");
                                    baseSharePackage.extras.remove("key_filter_enabled_actions");
                                    baseSharePackage.extras.remove("share_panel_use_vertical_im");
                                    baseSharePackage.extras.remove("share_panel_new_nav_bar");
                                    baseSharePackage.extras.remove("drag_to_expand_handle_visible");
                                    baseSharePackage.extras.remove("use_enhance_share_panel_prepose_create_group");
                                    baseSharePackage.extras.remove("use_enhance_share_panel_use_square_icon");
                                    C786410Ut5.LJJIIJZLJL(bundle2, awemeSharePackage.extras);
                                    ShareService shareService = C621180OYa.LIZ;
                                    Activity activity3 = activity2;
                                    Fragment fragment3 = fragment2;
                                    Aweme aweme4 = aweme3;
                                    boolean zLIZ = C0SSJ.LIZ(aweme4);
                                    C786410Ut5.LJJJI("enter_method", "long_press", bundle2);
                                    C786410Ut5.LJJJI("panel_source", "long_press", bundle2);
                                    bundle2.putBoolean("is_highlight_fast_speed", true);
                                    bundle2.putBoolean("open_long_press_panel_by_bottom_tips", true);
                                    shareService.LJJIIJ(activity3, fragment3, aweme4, zLIZ, null, bundle2);
                                    ((Keva) C1372270loX.LIZ.getValue()).storeInt("key_play_tip_show_count", Integer.MAX_VALUE);
                                    BaseSharePackage baseSharePackage2 = awemeSharePackage;
                                    String aid = aweme3.getAid();
                                    String string6 = baseSharePackage2.extras.getString("enter_from");
                                    String str4 = "";
                                    if (string6 == null) {
                                        string6 = "";
                                    }
                                    String string7 = baseSharePackage2.extras.getString("panel_source");
                                    if (string7 == null) {
                                        string7 = "";
                                    }
                                    if (aid != null) {
                                        str4 = aid;
                                    }
                                    ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("enter_from", string6);
                                    linkedHashMap.put("panel_source", string7);
                                    linkedHashMap.put("enter_method", "click_move_functions_guide_toast");
                                    linkedHashMap.put("group_id", str4);
                                    InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
                                    if (interfaceC1367490lgp != null) {
                                        interfaceC1367490lgp.LIZ("click_trans_layer", linkedHashMap);
                                    }
                                    C0NB9.LIZ(new C623130OcJ(baseSharePackage2, aid, "click_long_press"), "share_panel_redesign_toast");
                                }
                            });
                            C0T6L.LIZ(viewTd, new AwS565S0100000_21(awemeSharePackage, 1521));
                            c1371600lnS.LJJIJL = c1370670llx;
                        }
                    }
                    c1371600lnS.LJJ = AFwS247S0000000_13.get$arr$(56);
                }
            }
            if (z2) {
                C1369770lkV.LJII(awemeSharePackage);
                C1369770lkV.LIZIZ(c1371600lnS);
            }
            C1369770lkV.LIZJ(awemeSharePackage);
            C1369770lkV.LJFF(c1371600lnS);
            C1369770lkV.LJI(c1371600lnS);
        }
        List<InterfaceC1369790lkX> listKB0 = shareChannelProtocolLIZJ.KB0();
        if (!listKB0.isEmpty()) {
            c1371600lnS.LIZ.addAll(listKB0);
        }
        String strJv0 = shareChannelProtocolLIZJ.jv0();
        if (strJv0 != null && C123100dR.LIZ(strJv0)) {
            c1371600lnS.LJJJLL = strJv0;
        }
        Drawable drawableDC = shareChannelProtocolLIZJ.DC();
        if (drawableDC != null) {
            c1371600lnS.LJJJJZI = drawableDC;
        }
        shareChannelProtocolLIZJ.tD();
        Function1<C0M7Y, Unit> function1UR1 = shareChannelProtocolLIZJ.UR1();
        if (function1UR1 != null) {
            c1371600lnS.LJJJLZIJ = function1UR1;
        }
        Boolean boolZ72 = shareChannelProtocolLIZJ.z72();
        if (boolZ72 != null) {
            c1371600lnS.LJJL = Boolean.valueOf(boolZ72.booleanValue());
        }
        Boolean boolVv2 = shareChannelProtocolLIZJ.Vv2();
        if (boolVv2 != null) {
            c1371600lnS.LJJJZ = Boolean.valueOf(boolVv2.booleanValue());
        }
        Set<String> setV41 = shareChannelProtocolLIZJ.V41(c1371600lnS.LIZ);
        if (setV41 != null) {
            ((ArrayList) c1371600lnS.LJIILL).addAll(setV41);
        }
        Comparator<InterfaceC1369790lkX> comparatorPz0 = shareChannelProtocolLIZJ.Pz0();
        if (comparatorPz0 != null) {
            c1371600lnS.LJFF(comparatorPz0);
        }
        c1371600lnS.LJJJJI = sheetActionProtocolLJI.getHideShareItems();
        if (Intrinsics.LJFF(this.LJIIIIZZ, "long_press") && ((Number) C277960Auw.LIZ.getValue()).intValue() != 1) {
            z = true;
        } else {
            z = false;
        }
        c1371600lnS.LJJJJLI = z;
        c1371600lnS.LJJJJ = this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C1371600lnS r21, com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r22, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration r23) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1371740lng.LIZJ(X.0lnS, com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration):void");
    }

    public final Object LIZLLL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, AbstractC23140094w abstractC23140094w) {
        AwemeSharePackage awemeSharePackage;
        if ((baseSharePackage instanceof AwemeSharePackage) && (awemeSharePackage = (AwemeSharePackage) baseSharePackage) != null) {
            if (interfaceC1369790lkX.LJJIII()) {
                int iIntValue = 0;
                awemeSharePackage.extras.getBoolean("is_match_campaign_condition", false);
                if (this.LIZJ.getAwemeType() != 40 && ((C1373450lqR.LJFF(awemeSharePackage.LJJIFFI(), interfaceC1369790lkX, false) || interfaceC1369790lkX.LJIIJJI() == 2) && C304410BwV.LIZ())) {
                    if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy") && interfaceC1369790lkX.LJIIJJI() != 2) {
                        C304420BwW.LIZ();
                        Activity activityLIZ = C1388190mED.LIZ(context);
                        if (activityLIZ != null) {
                            if (C299060Bns.LIZJ()) {
                                C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                                c1389880mGw.LIZLLL(C0A0G.LIZ());
                                c1389880mGw.LJIIIIZZ(2131830948);
                                if (C299060Bns.LIZIZ()) {
                                    c1389880mGw.LJ(R.raw.icon_tick);
                                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                                    if (numLIZJ != null) {
                                        iIntValue = numLIZJ.intValue();
                                    }
                                    c1389880mGw.LJFF(iIntValue);
                                }
                                c1389880mGw.LJIIJ();
                            } else {
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                c1389890mGx.LIZLLL(C0A0G.LIZ());
                                c1389890mGx.LJIIIZ(2131830948);
                                c1389890mGx.LJIIJJI();
                            }
                        }
                        Object objLIZIZ = AnonymousClass0958.LIZIZ(C0A0G.LIZ(), abstractC23140094w);
                        if (objLIZIZ == C099R.LJFF()) {
                            return objLIZIZ;
                        }
                        return Unit.LIZ;
                    }
                    C1336205Ku.LIZ(false).getAutoMessageTooltipHelper().LIZIZ();
                }
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final void LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
        AwemeSharePackage awemeSharePackage;
        String str;
        String string;
        String string2;
        String strKey;
        AbstractC1371000lmU abstractC1371000lmU;
        Aweme awemeLJJIFFI;
        String str2;
        String string3;
        IEncourageLogInService iEncourageLogInServiceLIZJ = EncourageLoginPopupManager.LIZJ();
        if ((baseSharePackage instanceof AwemeSharePackage) && (awemeSharePackage = (AwemeSharePackage) baseSharePackage) != null && awemeSharePackage.aweme != null) {
            if (iEncourageLogInServiceLIZJ != null) {
                Activity activity = this.LIZ;
                Bundle bundle = awemeSharePackage.extras;
                if (bundle == null || (string3 = bundle.getString("share_platform")) == null) {
                    string3 = "";
                }
                iEncourageLogInServiceLIZJ.LIZ(activity, string3, "click_share");
            }
            ((IProactiveTriggersService) ServiceManager.get().getService(IProactiveTriggersService.class)).LJFF(this.LJII);
            if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy")) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordChannelShare(");
                sbLIZ.append(this.LJII);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                if (Intrinsics.LJFF("homepage_hot", this.LJII)) {
                    User author = this.LIZJ.getAuthor();
                    if (author == null || author.getAvatarThumb() == null || author.getAvatarThumb().getUrlList() == null || !(!author.getAvatarThumb().getUrlList().isEmpty()) || (str2 = (String) ListProtector.get(author.getAvatarThumb().getUrlList(), 0)) == null) {
                        str2 = "";
                    }
                    ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJJLJLI(str2, true);
                }
            } else {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("recordCopyLink(isSelf: ");
                sbLIZ2.append(C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(this.LIZJ)));
                sbLIZ2.append(')');
                C2188811AlT.LIZIZ(sbLIZ2);
                User author2 = this.LIZJ.getAuthor();
                if (author2 == null || author2.getAvatarThumb() == null || author2.getAvatarThumb().getUrlList() == null || !(!author2.getAvatarThumb().getUrlList().isEmpty()) || (str = (String) ListProtector.get(author2.getAvatarThumb().getUrlList(), 0)) == null) {
                    str = "";
                }
                INoticeService iNoticeService = (INoticeService) ServiceManager.get().getService(INoticeService.class);
                if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(this.LIZJ))) {
                    str = "";
                }
                iNoticeService.LJLI(str, true);
            }
            Bundle bundle2 = this.LJ;
            Bundle bundle3 = awemeSharePackage.extras;
            if (bundle3 != null) {
                string = bundle3.getString("share_form");
            } else {
                string = null;
            }
            C786410Ut5.LJJJI("share_form", string, bundle2);
            Bundle bundle4 = this.LJ;
            Bundle bundle5 = awemeSharePackage.extras;
            if (bundle5 != null) {
                string2 = bundle5.getString("share_url");
            } else {
                string2 = null;
            }
            C786410Ut5.LJJJI("share_url", string2, bundle4);
            if (z || (awemeLJJIFFI = awemeSharePackage.LJJIFFI()) == null || !awemeLJJIFFI.isAd()) {
                LJIIJJI(interfaceC1369790lkX.key(), z, awemeSharePackage, context, this.LIZJ, interfaceC1369790lkX.LJJLI(), interfaceC1369790lkX.LJJIII(), interfaceC1369790lkX.LJIIJJI());
            }
            C1238740iLA.LIZIZ().LJFF("last_share_way", "outside_channel");
            if (z) {
                if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy")) {
                    C1440005kM.LIZ(new C2041107z7(1));
                } else if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "chat_merge")) {
                    C1440005kM.LIZ(new C2041107z7(2));
                }
                if (((InterfaceC1365380ldQ) this.LJJIJ.getValue()).LJJIII()) {
                    String string4 = this.LJ.getString("panel_source", "");
                    if ((Intrinsics.LJFF(string4, "share_panel") || Intrinsics.LJFF(string4, "long_press")) && !Intrinsics.LJFF(interfaceC1369790lkX.key(), "repost")) {
                        C737030Svd c737030Svd = new C737030Svd(78);
                        Bundle bundle6 = new Bundle();
                        bundle6.putBoolean("show_tooltip_after_resume", !Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy"));
                        C786410Ut5.LJJJI("quick_share_aid", this.LIZJ.getAid(), bundle6);
                        c737030Svd.LIZJ = bundle6;
                        C1440005kM.LIZ(c737030Svd);
                    }
                }
            }
            if ((interfaceC1369790lkX instanceof CopyLinkChannel) || (interfaceC1369790lkX instanceof C1373610lqh)) {
                Bundle bundle7 = new Bundle();
                C786410Ut5.LJJJI("enter_from", this.LJII, bundle7);
                C786410Ut5.LJJJI("enter_method", "share", bundle7);
                if ((interfaceC1369790lkX instanceof C1373610lqh) && (abstractC1371000lmU = (AbstractC1371000lmU) interfaceC1369790lkX) != null) {
                    strKey = abstractC1371000lmU.key();
                } else {
                    strKey = null;
                }
                if (Intrinsics.LJFF(strKey, "facebook")) {
                    bundle7.putInt("first_platform", 2);
                } else if (Intrinsics.LJFF(strKey, "sms")) {
                    bundle7.putInt("first_platform", 1);
                }
                C0HTT<C737030Svd> c0htt = this.LIZLLL;
                if (c0htt != null) {
                    C737030Svd c737030Svd2 = new C737030Svd(62);
                    c737030Svd2.LIZJ = bundle7;
                    c0htt.LLIIL(c737030Svd2);
                }
            }
            if (Intrinsics.LJFF(awemeSharePackage.extras.getString("enter_from", ""), "homepage_hot") && Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy")) {
                ((IProactiveTriggersService) ServiceManager.get().getService(IProactiveTriggersService.class)).LJIIJJI(C1388190mED.LIZ(context), this.LJII);
            }
        }
    }

    public C1371740lng(Activity activity, Fragment fragment, Aweme aweme, C0HTT c0htt, Bundle bundle) {
        this.LIZ = activity;
        this.LIZIZ = fragment;
        this.LIZJ = aweme;
        this.LIZLLL = c0htt;
        this.LJ = bundle;
        this.LJFF = bundle.getBoolean("is_portrait", true);
        this.LJI = bundle.getInt("page_type");
        this.LJII = bundle.getString("event_type", "");
        this.LJIIIIZZ = bundle.getString("enter_method", "normal_share");
        this.LJIIIZ = bundle.getString("panel_source", "share_panel");
        this.LJIIJ = bundle.getString("detail_tab_name", "");
        this.LJIIJJI = bundle.getString("play_list_id", "");
        this.LJIIL = bundle.getString("play_list_id_key", "");
        this.LJIILIIL = bundle.getString("play_list_type", "");
        this.LJIILJJIL = bundle.getString("tab_name", "");
        this.LJIILL = bundle.getString("from", "");
        this.LJIILLIIL = bundle.getString("creation_id", "");
        this.LJIIZILJ = bundle.getString("tag_id", "");
        this.LJIJ = bundle.getString("extra_parent_tag_id", "");
        this.LJIJI = bundle.getString("previousPage", "");
        this.LJIJJ = bundle.getString("previousPagePosition", "");
        this.LJIJJLI = bundle.getString("category_name", "");
        this.LJIL = bundle.getString("from_page", "");
        this.LJJ = bundle.getBoolean("icon_highlight_status", false);
        this.LJJI = C1697810uHb.LJIIJJI(0, 51, 52).contains(Integer.valueOf(aweme.getAwemeType()));
        this.LJJIFFI = bundle.getString("collection_id");
        this.LJJII = bundle.getString("collection_name");
        this.LJJIII = bundle.getBoolean("is_friends_v3_repost");
        this.LJJIIJ = bundle.getBoolean("is_friends_v3_text");
        this.LJJIIJZLJL = bundle.getString("referral_enter_from");
        this.LJJIIZ = bundle.getString("referral_page_enter_from");
        this.LJJIIZI = bundle.getBoolean("is_referral", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x071b A[LOOP:0: B:313:0x0715->B:315:0x071b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0740  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r32, boolean r33, com.ss.android.ugc.aweme.sharer.model.SharePackage r34, android.content.Context r35, com.ss.android.ugc.aweme.feed.model.Aweme r36, boolean r37, boolean r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1371740lng.LJIIJJI(java.lang.String, boolean, com.ss.android.ugc.aweme.sharer.model.SharePackage, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean, int):void");
    }
}
