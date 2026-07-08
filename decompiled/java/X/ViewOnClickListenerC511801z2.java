package X;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.CampaignBannerData;
import com.bytedance.android.live.broadcast.model.UnifiedBannerData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import com.bytedance.android.livesdk.broadcast.preview.PreviewECommerceGrowthTaskWidget;
import com.bytedance.android.livesdk.broadcast.preview.PreviewLiveJourneyBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewIncentiveCampaignWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveGrowthMVPWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.game.LocalActionMessageClick;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.giftlimitnotification.GiftLimitSettingDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.moderator.ModeratorOpsListSheet;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notification.SubscribeTestPanelFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import tikcast.api.anchor.AdminOperationRecordCommonInfo;
import tikcast.api.anchor.AdminOperationRecordItem;
import tikcast.api.anchor.GrowthJourneyBannerItem;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.01z2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC511801z2 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
            case 23:
                onClick$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onClick$24(this, view);
                break;
            case 25:
                onClick$25(this, view);
                break;
        }
    }

    public static final void onClick$0(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        LifecycleCoroutineScope lifecycleScope;
        ((Function1) viewOnClickListenerC511801z2.l0).invoke("close");
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(((View) viewOnClickListenerC511801z2.l1).getContext());
        if (lifecycleOwnerLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C01UE(null), 2);
        }
    }

    public static final void onClick$1(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        boolean z;
        String str;
        long j;
        Long lValueOf;
        String str2;
        GiftGalleryBadgeSection giftGalleryBadgeSection;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
        InterfaceC500940Jki interfaceC500940JkiUser;
        Room room;
        String str3 = ((GiftGalleryBadgeInfo) viewOnClickListenerC511801z2.l0).schema;
        boolean z2 = true;
        if (str3.length() == 0) {
            return;
        }
        DataChannel dataChannel = ((ViewOnClickListenerC986770bml) viewOnClickListenerC511801z2.l1).LLJJJIL;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            z = room.liveTypeSandbox;
        } else {
            z = false;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(str3).buildUpon();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String string = builderBuildUpon.appendQueryParameter("is_sandbox", str).toString();
        if (string.length() == 0) {
            return;
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((ViewOnClickListenerC986770bml) viewOnClickListenerC511801z2.l1).getContext(), string);
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bml = (ViewOnClickListenerC986770bml) viewOnClickListenerC511801z2.l1;
        C954460awe c954460awe = viewOnClickListenerC986770bml.LLJILJILJ;
        if (c954460awe != null) {
            j = c954460awe.LJ;
        } else {
            j = 0;
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        DataChannel dataChannel2 = viewOnClickListenerC986770bml.LLJJJIL;
        if (dataChannel2 == null || !C500260Jjc.LJIIZILJ(dataChannel2)) {
            z2 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        Long lValueOf2 = Long.valueOf(j);
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = (GiftGalleryBadgeInfo) viewOnClickListenerC511801z2.l0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ranking_league_label_click");
        UserService userService = UserService.getInstance();
        String str4 = null;
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "user_id");
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII(lValueOf2, "to_user_id");
        if (giftGalleryBadgeInfo != null && (giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo) != null && (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection.displayText) != null) {
            str4 = linkMicGiftGalleryDisplayText.content;
        }
        c474500IjALIZ.LJJII(str4, "anchor_league");
        c474500IjALIZ.LJJII("pk_badge", "show_scene");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$10(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((Function1) viewOnClickListenerC511801z2.l0).invoke(((C1099560eig) viewOnClickListenerC511801z2.l1).LJJIFFI);
    }

    public static final void onClick$11(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((Function1) viewOnClickListenerC511801z2.l0).invoke(((C1099560eig) viewOnClickListenerC511801z2.l1).LJJII);
    }

    public static final void onClick$12(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((Function1) viewOnClickListenerC511801z2.l0).invoke(((C1099560eig) viewOnClickListenerC511801z2.l1).LJJII);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$13(X.ViewOnClickListenerC511801z2 r2, android.view.View r3) {
        /*
            java.lang.Object r1 = r2.l0
            X.16Ff r1 = (X.C20743716Ff) r1
            java.lang.Object r0 = r2.l1
            X.01lx r0 = (X.DialogC430701lx) r0
            boolean r0 = r0.LLJLLL
            r0 = r0 ^ 1
            r1.setChecked(r0)
            java.lang.Object r1 = r2.l1
            X.01lx r1 = (X.DialogC430701lx) r1
            java.lang.Object r0 = r2.l0
            X.16Ff r0 = (X.C20743716Ff) r0
            boolean r0 = r0.isChecked()
            r1.LLJLLL = r0
            java.lang.Object r0 = r2.l1
            X.01lx r0 = (X.DialogC430701lx) r0
            java.lang.String r0 = r0.LLJJI
            boolean r0 = X.C937280aUw.LIZIZ(r0)
            if (r0 != 0) goto L73
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L71
            boolean r0 = r0.LJIJI()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L37:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L73
            java.lang.Object r0 = r2.l1
            X.01lx r0 = (X.DialogC430701lx) r0
            X.01lz r1 = r0.LLJILJIL
            webcast.data.multi_guest_play.ShowConfig r0 = r0.LJLIIIL()
            r1.LJI(r0)
        L4a:
            java.lang.Object r0 = r2.l0
            X.16Ff r0 = (X.C20743716Ff) r0
            boolean r3 = r0.isChecked()
            java.util.Map r2 = X.C306901Gx.LIZ()
            java.lang.String r1 = X.C306901Gx.LJFF()
            java.lang.String r0 = "is_liveshow_ongoing"
            r2.put(r0, r1)
            if (r3 == 0) goto L6e
            java.lang.String r1 = "1"
        L63:
            java.lang.String r0 = "is_guest_mic_open"
            r2.put(r0, r1)
            java.lang.String r0 = "livesdk_anchor_multiguest_liveshow_setting_mic_click"
            X.C306901Gx.LJIL(r0, r2)
            return
        L6e:
            java.lang.String r1 = "0"
            goto L63
        L71:
            r0 = 0
            goto L37
        L73:
            java.lang.Object r0 = r2.l1
            X.01lx r0 = (X.DialogC430701lx) r0
            X.01lz r1 = r0.LLJILJIL
            webcast.data.multi_guest_play.ShowConfig r0 = r0.LJLIIIL()
            r1.LIZJ(r0)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC511801z2.onClick$13(X.01z2, android.view.View):void");
    }

    public static final void onClick$14(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        long jLongValue;
        long jLongValue2;
        View view2 = (View) viewOnClickListenerC511801z2.l0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (view2.getTag(1123460103) != null) {
            jLongValue = ((Long) view2.getTag(1123460103)).longValue();
        } else {
            jLongValue = -601;
        }
        long j = jCurrentTimeMillis - jLongValue;
        if (view2.getTag(1123461123) != null) {
            jLongValue2 = ((Long) view2.getTag(1123461123)).longValue();
        } else {
            jLongValue2 = 600;
        }
        if (j >= jLongValue2) {
            view2.setTag(1123460103, Long.valueOf(jCurrentTimeMillis));
            ((Function1) viewOnClickListenerC511801z2.l1).invoke(view);
        }
    }

    public static final void onClick$15(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        FragmentManager fragmentManager = (FragmentManager) ((DataChannel) viewOnClickListenerC511801z2.l0).gg0(C748880TZe.class);
        GiftLimitSettingDialog giftLimitSettingDialog = new GiftLimitSettingDialog();
        if (fragmentManager != null) {
            giftLimitSettingDialog.show(fragmentManager, "giftLimitSettingDialog");
        }
        LiveDialog liveDialog = (LiveDialog) viewOnClickListenerC511801z2.l1;
        liveDialog.dismiss();
        C785410UrT.LIZ(liveDialog);
        C250000xu.LIZ.getClass();
        C250000xu.LJJIJIIJI = "manage";
        C250500xz.LIZ(C250000xu.LJ() ? 1 : 0, "manage", "basic");
        C250500xz.LIZJ(C250000xu.LJ() ? 1 : 0, "manage_limit");
    }

    public static final void onClick$16(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Object next;
        InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        User user = null;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            GetShowRankResponse.ShowRankUser showRankUser = (GetShowRankResponse.ShowRankUser) viewOnClickListenerC511801z2.l0;
            Iterator it2 = listLJJIII.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    User user2 = ((LinkPlayerInfo) next).mUser;
                    if (user2 != null && user2.getId() == showRankUser.userId) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
            if (linkPlayerInfo != null) {
                user = linkPlayerInfo.mUser;
            }
        }
        C433601mQ.LIZ(user, ((GetShowRankResponse.ShowRankUser) viewOnClickListenerC511801z2.l0).userId, ((C15C4) viewOnClickListenerC511801z2.l1).LIZJ, "multiguest_liveshow_ranking", Long.valueOf(r1.order));
    }

    public static final void onClick$17(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        String str;
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = ((PreviewIncentiveCampaignWidget) viewOnClickListenerC511801z2.l0).context;
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(((CampaignBannerData) viewOnClickListenerC511801z2.l1).url).buildUpon().appendQueryParameter("enter_from", "live_take_page");
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        iActionHandlerService.handle(context, builderAppendQueryParameter.appendQueryParameter("enable_code_cache", str).build().toString());
        PreviewIncentiveCampaignWidget previewIncentiveCampaignWidget = (PreviewIncentiveCampaignWidget) viewOnClickListenerC511801z2.l0;
        previewIncentiveCampaignWidget.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_activity_banner_click");
        c474500IjALIZ.LJIJJLI(previewIncentiveCampaignWidget.dataChannel);
        c474500IjALIZ.LJJII("incentive_campaign_for_new_live_creators", "activity_name");
        c474500IjALIZ.LJJII("live_take_page", "banner_page");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$18(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((C431501m5) viewOnClickListenerC511801z2.l0).LJIIIIZZ((GuestShowdownUser) viewOnClickListenerC511801z2.l1);
    }

    public static final void onClick$19(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((C431501m5) viewOnClickListenerC511801z2.l0).LJIIIIZZ((GuestShowdownUser) viewOnClickListenerC511801z2.l1);
    }

    public static final void onClick$2(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((PreviewECommerceGrowthTaskWidget) viewOnClickListenerC511801z2.l0).context, ((UnifiedBannerData) viewOnClickListenerC511801z2.l1).schema);
        ((PreviewECommerceGrowthTaskWidget) viewOnClickListenerC511801z2.l0).G1();
        C20337914i1<Map<String, Integer>> c20337914i1 = C0UKZ.LLIZLLLIL;
        Map<String, Integer> mapLIZIZ = c20337914i1.LIZIZ();
        String str = ((UnifiedBannerData) viewOnClickListenerC511801z2.l1).frequencyKey;
        Integer num = c20337914i1.LIZIZ().get(((UnifiedBannerData) viewOnClickListenerC511801z2.l1).frequencyKey);
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        mapLIZIZ.put(str, Integer.valueOf(iIntValue));
    }

    public static final void onClick$20(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        String str;
        if (((C15C3) viewOnClickListenerC511801z2.l0).LIZIZ) {
            User user = ((FanTicketRanklistResponse.RanklistUser) viewOnClickListenerC511801z2.l1).user;
            if (user != null) {
                long id = user.getId();
                FanTicketRanklistResponse.RanklistUser ranklistUser = (FanTicketRanklistResponse.RanklistUser) viewOnClickListenerC511801z2.l1;
                C433601mQ.LIZ(ranklistUser.user, id, ((C15C3) viewOnClickListenerC511801z2.l0).LJI, "guest_ranking_popup", Long.valueOf(ranklistUser.index));
            }
            C15C3 c15c3 = (C15C3) viewOnClickListenerC511801z2.l0;
            C308301Hl.LJ(c15c3.LJFF, "follow", c15c3.LIZJ, c15c3.LJIIIIZZ);
            return;
        }
        User user2 = ((FanTicketRanklistResponse.RanklistUser) viewOnClickListenerC511801z2.l1).user;
        if (user2 != null) {
            long id2 = user2.getId();
            FanTicketRanklistResponse.RanklistUser ranklistUser2 = (FanTicketRanklistResponse.RanklistUser) viewOnClickListenerC511801z2.l1;
            C15C3 c15c32 = (C15C3) viewOnClickListenerC511801z2.l0;
            User user3 = ranklistUser2.user;
            C11NJ c11nj = c15c32.LJI;
            if (c15c32.LJIIIZ) {
                str = "multiguest_liveshow_ranking";
            } else {
                str = "guest_ranking";
            }
            C433601mQ.LIZ(user3, id2, c11nj, str, Long.valueOf(ranklistUser2.index));
        }
        C308301Hl c308301Hl = C308301Hl.LIZ;
        C15C3 c15c33 = (C15C3) viewOnClickListenerC511801z2.l0;
        c308301Hl.LIZIZ(c15c33.LJ, c15c33.LJFF, "guest_window", "follow");
    }

    public static final void onClick$21(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((C15C3) viewOnClickListenerC511801z2.l0).LJIIIIZZ((FanTicketRanklistResponse.RanklistUser) viewOnClickListenerC511801z2.l1);
        C15C3 c15c3 = (C15C3) viewOnClickListenerC511801z2.l0;
        if (c15c3.LIZIZ) {
            C308301Hl.LJ(c15c3.LJFF, "user_profile", c15c3.LIZJ, c15c3.LJIIIIZZ);
        } else {
            C308301Hl.LIZ.LIZIZ(c15c3.LJ, c15c3.LJFF, "guest_window", "user_profile");
        }
    }

    public static final void onClick$22(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((C15C3) viewOnClickListenerC511801z2.l0).LJIIIIZZ((FanTicketRanklistResponse.RanklistUser) viewOnClickListenerC511801z2.l1);
        C15C3 c15c3 = (C15C3) viewOnClickListenerC511801z2.l0;
        if (c15c3.LIZIZ) {
            C308301Hl.LJ(c15c3.LJFF, "user_profile", c15c3.LIZJ, c15c3.LJIIIIZZ);
        } else {
            C308301Hl.LIZ.LIZIZ(c15c3.LJ, c15c3.LJFF, "guest_window", "user_profile");
        }
    }

    public static final void onClick$23(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        DataChannel dataChannelLJ;
        User user;
        ModeratorOpsListSheet moderatorOpsListSheet = ((C01A6) viewOnClickListenerC511801z2.l0).LIZIZ.get();
        if (moderatorOpsListSheet != null && (dataChannelLJ = C475510Ikn.LJ(moderatorOpsListSheet)) != null) {
            C01A6 c01a6 = (C01A6) viewOnClickListenerC511801z2.l0;
            AdminOperationRecordCommonInfo adminOperationRecordCommonInfo = ((AdminOperationRecordItem) viewOnClickListenerC511801z2.l1).commonInfo;
            if (adminOperationRecordCommonInfo != null) {
                user = adminOperationRecordCommonInfo.operator;
            } else {
                user = null;
            }
            c01a6.getClass();
            C01A6.LIZ(dataChannelLJ, user);
        }
    }

    public static final void onClick$24(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        DataChannel dataChannelLJ;
        User user;
        ModeratorOpsListSheet moderatorOpsListSheet = ((C01A6) viewOnClickListenerC511801z2.l0).LIZIZ.get();
        if (moderatorOpsListSheet != null && (dataChannelLJ = C475510Ikn.LJ(moderatorOpsListSheet)) != null) {
            C01A6 c01a6 = (C01A6) viewOnClickListenerC511801z2.l0;
            AdminOperationRecordCommonInfo adminOperationRecordCommonInfo = ((AdminOperationRecordItem) viewOnClickListenerC511801z2.l1).commonInfo;
            if (adminOperationRecordCommonInfo != null) {
                user = adminOperationRecordCommonInfo.operator;
            } else {
                user = null;
            }
            c01a6.getClass();
            C01A6.LIZ(dataChannelLJ, user);
        }
    }

    public static final void onClick$25(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        int i;
        Editable text;
        Editable text2;
        ArrayList arrayList = new ArrayList();
        try {
            C1748440vbG c1748440vbG = ((SubscribeTestPanelFragment) viewOnClickListenerC511801z2.l0).LL;
            text = null;
            if (c1748440vbG != null) {
                text2 = c1748440vbG.getText();
            } else {
                text2 = null;
            }
            i = CastIntegerProtector.parseInt(String.valueOf(text2));
        } catch (NumberFormatException e) {
            e = e;
            i = 0;
        }
        try {
            C1748440vbG c1748440vbG2 = ((SubscribeTestPanelFragment) viewOnClickListenerC511801z2.l0).LLILLJJLI;
            if (c1748440vbG2 != null) {
                text = c1748440vbG2.getText();
            }
            List<String> listSplit = new Regex("[\\s,]+").split(a0.LJLIIIL(String.valueOf(text)).toString(), 0);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSplit, 10));
            Iterator<String> it2 = listSplit.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boolean.valueOf(arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt(it2.next())))));
            }
        } catch (NumberFormatException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx((C197039127h) viewOnClickListenerC511801z2.l1);
        c1389890mGx.LJIIJ("Channel is " + i + ", Category is " + arrayList);
        c1389890mGx.LJIIJJI();
        ((SubscribeTestPanelFragment) viewOnClickListenerC511801z2.l0).getClass();
    }

    public static final void onClick$3(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((PreviewECommerceGrowthTaskWidget) viewOnClickListenerC511801z2.l0).hide();
        ((PreviewECommerceGrowthTaskWidget) viewOnClickListenerC511801z2.l0).G1();
        C20337914i1<Map<String, Integer>> c20337914i1 = C0UKZ.LLIZLLLIL;
        Map<String, Integer> mapLIZIZ = c20337914i1.LIZIZ();
        String str = ((UnifiedBannerData) viewOnClickListenerC511801z2.l1).frequencyKey;
        Integer num = c20337914i1.LIZIZ().get(((UnifiedBannerData) viewOnClickListenerC511801z2.l1).frequencyKey);
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        mapLIZIZ.put(str, Integer.valueOf(iIntValue));
    }

    public static final void onClick$4(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        String str;
        String str2;
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = ((PreviewLiveGrowthMVPWidget) viewOnClickListenerC511801z2.l0).context;
        GrowthJourneyBannerItem growthJourneyBannerItem = (GrowthJourneyBannerItem) viewOnClickListenerC511801z2.l1;
        if (growthJourneyBannerItem != null) {
            str = growthJourneyBannerItem.bannerSchema;
        } else {
            str = null;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("enter_from", "live_take_page");
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        iActionHandlerService.handle(context, builderAppendQueryParameter.appendQueryParameter("enable_code_cache", str2).build().toString());
        PreviewLiveGrowthMVPWidget previewLiveGrowthMVPWidget = (PreviewLiveGrowthMVPWidget) viewOnClickListenerC511801z2.l0;
        previewLiveGrowthMVPWidget.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_growth_journey_takepage_banner_click");
        c474500IjALIZ.LJIJJLI(previewLiveGrowthMVPWidget.dataChannel);
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJI, "banner_type");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJILJIL, "growth_instance_strategy");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJIJIL, "growth_stage");
        c474500IjALIZ.LJJII(previewLiveGrowthMVPWidget.LLJILJILJ, "banner_frequency_key");
        c474500IjALIZ.LIZ();
        InterfaceC772190UQv.E3.LIZJ(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$5(X.ViewOnClickListenerC511801z2 r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC511801z2.onClick$5(X.01z2, android.view.View):void");
    }

    public static final void onClick$6(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((PreviewLiveJourneyBannerWidget) viewOnClickListenerC511801z2.l0).G1("livesdk_live_journey_takepage_banner_click", ((UnifiedBannerData) viewOnClickListenerC511801z2.l1).metrics);
        String string = ((UnifiedBannerData) viewOnClickListenerC511801z2.l1).schema;
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            string = UriProtector.parse(string).buildUpon().appendQueryParameter("enable_code_cache", "1").build().toString();
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((PreviewLiveJourneyBannerWidget) viewOnClickListenerC511801z2.l0).context, string);
        ((PreviewLiveJourneyBannerWidget) viewOnClickListenerC511801z2.l0).H1((UnifiedBannerData) viewOnClickListenerC511801z2.l1, "100");
    }

    public static final void onClick$7(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((PreviewLiveJourneyBannerWidget) viewOnClickListenerC511801z2.l0).hide();
        ((PreviewLiveJourneyBannerWidget) viewOnClickListenerC511801z2.l0).G1("livesdk_live_journey_takepage_banner_close", ((UnifiedBannerData) viewOnClickListenerC511801z2.l1).metrics);
        ((PreviewLiveJourneyBannerWidget) viewOnClickListenerC511801z2.l0).H1((UnifiedBannerData) viewOnClickListenerC511801z2.l1, "100");
    }

    public static final void onClick$8(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        DataChannel dataChannel = ((C1109770ez9) viewOnClickListenerC511801z2.l0).LJIIIZ;
        if (dataChannel != null) {
            dataChannel.LC0(LocalActionMessageClick.class, ((C152600iC) viewOnClickListenerC511801z2.l1).LJIL);
        }
    }

    public static final void onClick$9(ViewOnClickListenerC511801z2 viewOnClickListenerC511801z2, View view) {
        ((Function1) viewOnClickListenerC511801z2.l0).invoke(((C1099560eig) viewOnClickListenerC511801z2.l1).LJJIFFI);
    }

    public ViewOnClickListenerC511801z2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
