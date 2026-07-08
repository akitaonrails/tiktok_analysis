package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.toolbar.ToolbarButtonMoreDialogNew;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingReviewInfoDialogNew;
import com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew;
import com.bytedance.android.livesdk.broadcast.preview.widget.GameIntroductionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.bytedance.android.livesdk.model.message.CommentsMessage;
import com.bytedance.android.livesdk.profile.cell.HeaderCell;
import com.bytedance.android.livesdk.toolbar.AiGeneratedContentSheetFragment;
import com.bytedance.android.livesdk.ultralitemode.LiveAdaptiveLiteModeDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailPurchaseSectionAssem;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: renamed from: X.0Kcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521550Kcr extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void updateDrawState$1(C521550Kcr c521550Kcr, TextPaint textPaint) {
    }

    public static final void updateDrawState$11(C521550Kcr c521550Kcr, TextPaint textPaint) {
    }

    public static final void updateDrawState$4(C521550Kcr c521550Kcr, TextPaint textPaint) {
    }

    public static final void updateDrawState$5(C521550Kcr c521550Kcr, TextPaint textPaint) {
    }

    public static final void updateDrawState$6(C521550Kcr c521550Kcr, TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
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
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
            default:
                super.updateDrawState(textPaint);
                break;
            case 3:
                updateDrawState$2(this, textPaint);
                break;
            case 4:
                updateDrawState$3(this, textPaint);
                break;
            case 5:
                updateDrawState$4(this, textPaint);
                break;
            case 6:
                updateDrawState$5(this, textPaint);
                break;
            case 7:
                updateDrawState$6(this, textPaint);
                break;
            case 8:
                textPaint.setUnderlineText(false);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                updateDrawState$8(this, textPaint);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                textPaint.setUnderlineText(false);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                textPaint.setUnderlineText(false);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                updateDrawState$11(this, textPaint);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                textPaint.setUnderlineText(false);
                break;
        }
    }

    public C521550Kcr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C521550Kcr c521550Kcr, View view) {
        PcsCourseDetailVM.zQ2(((CourseDetailPurchaseSectionAssem) c521550Kcr.l0).So(), "click", "term", null, false, 12);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(((CourseDetailPurchaseSectionAssem) c521550Kcr.l0).getContext(), LiveSubscriptionFAQSetting.INSTANCE.getValue().getCourseTermOfSalePopup(), new Bundle());
    }

    public static final void onClick$1(C521550Kcr c521550Kcr, View view) {
        FragmentManager fragmentManager = ((LiveFilterCommentSettingFragmentNew) c521550Kcr.l0).getFragmentManager();
        if (fragmentManager != null) {
            new LiveFilterCommentSettingReviewInfoDialogNew().show(fragmentManager, "");
        }
    }

    public static final void onClick$10(C521550Kcr c521550Kcr, View view) {
        String str;
        if (C0K7G.LJFF("subscription_us_region", false)) {
            str = "us-ttp";
        } else if (C0K7G.LJIIIZ()) {
            str = "eu-ttp";
        } else {
            str = "row";
        }
        String strLJIIJ = C0K7G.LJIIJ(str);
        C0KC9 c0kc9 = C0KC9.LIZ;
        Context context = ((SubUpdowngradePackageFragment) c521550Kcr.l0).getContext();
        c0kc9.getClass();
        C0KC9.LJ(context, strLJIIJ, false, -1);
    }

    public static final void onClick$11(C521550Kcr c521550Kcr, View view) {
        String str;
        if (C0K7G.LJFF("subscription_us_region", false)) {
            str = "us-ttp";
        } else if (C0K7G.LJIIIZ()) {
            str = "eu-ttp";
        } else {
            str = "row";
        }
        String strLJIIJ = C0K7G.LJIIJ(str);
        C0KC9 c0kc9 = C0KC9.LIZ;
        Context context = (Context) c521550Kcr.l0;
        c0kc9.getClass();
        C0KC9.LJ(context, strLJIIJ, false, -1);
    }

    public static final void onClick$12(C521550Kcr c521550Kcr, View view) {
        long id;
        Boolean bool;
        int i;
        Room room;
        C19EG c19egLJ = C500260Jjc.LJ(((ToolbarButtonMoreDialogNew) c521550Kcr.l0).getContext());
        if (c19egLJ != null) {
            ToolbarButtonMoreDialogNew toolbarButtonMoreDialogNew = (ToolbarButtonMoreDialogNew) c521550Kcr.l0;
            toolbarButtonMoreDialogNew.dismiss();
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            DataChannel dataChannelLJ = C475510Ikn.LJ(toolbarButtonMoreDialogNew);
            if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(toolbarButtonMoreDialogNew);
            if (dataChannelLJ2 != null) {
                bool = (Boolean) dataChannelLJ2.gg0(UserIsAnchorChannel.class);
            } else {
                bool = null;
            }
            if (C500260Jjc.LJJJI(bool)) {
                i = 3;
            } else {
                i = 2;
            }
            iHostAction.jumpToFeedBack(c19egLJ, id, i);
        }
    }

    public static final void onClick$13(C521550Kcr c521550Kcr, View view) {
        C495520Jby c495520Jby = new C495520Jby(C0K7G.LJII("subscribe_feedback_scheme"));
        Context context = (Context) c521550Kcr.l0;
        String strLIZLLL = c495520Jby.LIZLLL();
        strLIZLLL.toString();
        C510690K1b.LIZ(context, strLIZLLL, null);
    }

    public static final void onClick$2(C521550Kcr c521550Kcr, View view) {
        if (!UserService.getInstance().user().isLogin()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            Context context = ((View) ((C0KYO) c521550Kcr.l0).LIZ.get()).getContext();
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C497740JfY.LJIJI(2131851927);
            c476760Imo.LIZJ = 0;
            interfaceC500940JkiUser.LJIILL(context, new C501600Jlm(c476760Imo)).LIZIZ(new C476750Imn());
            return;
        }
        CommentsMessage commentsMessage = (CommentsMessage) ((C0KYO) c521550Kcr.l0).LJ.LJIL;
        if (commentsMessage.actionType == 1 && !TextUtils.isEmpty(commentsMessage.actionContent)) {
            C495520Jby c495520Jby = new C495520Jby(((CommentsMessage) ((C0KYO) c521550Kcr.l0).LJ.LJIL).actionContent);
            Room room = ((C0KYO) c521550Kcr.l0).LIZJ;
            if (room != null && room.getOwner() != null) {
                c495520Jby.LIZIZ(((C0KYO) c521550Kcr.l0).LIZJ.getOwner().getId(), "anchor_id");
                c495520Jby.LIZIZ(((C0KYO) c521550Kcr.l0).LIZJ.getId(), "room_id");
            }
            c495520Jby.LIZIZ(UserService.getInstance().user().getCurrentUserId(), "user_id");
            C784440Upu.LIZ().LIZIZ(new C0KYN(c495520Jby.LIZLLL()));
        }
    }

    public static final void onClick$3(C521550Kcr c521550Kcr, View view) {
        EntranceConditionsPopup entranceConditionsPopup = (EntranceConditionsPopup) DataChannelGlobal.LLILZ.gg0(C931330aLL.class);
        if (entranceConditionsPopup != null) {
            GameIntroductionWidget gameIntroductionWidget = (GameIntroductionWidget) c521550Kcr.l0;
            if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable()) {
                C499910Jj3.LIZ(gameIntroductionWidget.dataChannel, entranceConditionsPopup, null);
            } else {
                C770730ULf.LJIIIIZZ(gameIntroductionWidget.getContext(), gameIntroductionWidget.dataChannel, entranceConditionsPopup);
            }
            C0UQX.LJJIIJ(LiveMode.SCREEN_RECORD, gameIntroductionWidget.dataChannel);
        }
    }

    public static final void onClick$4(C521550Kcr c521550Kcr, View view) {
        LiveAdaptiveLiteModeDialog liveAdaptiveLiteModeDialog = (LiveAdaptiveLiteModeDialog) c521550Kcr.l0;
        Context context = liveAdaptiveLiteModeDialog.getContext();
        if (context != null) {
            String learnMoreUrl = LiveUltraLiteModeSetting.INSTANCE.getValue().getLearnMoreUrl();
            if (learnMoreUrl.length() != 0) {
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, learnMoreUrl, null);
                String str = liveAdaptiveLiteModeDialog.LLILLJJLI;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lite_mode_event");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("learnmore_click", "1");
                linkedHashMap.put("status_change_source", str);
                c474500IjALIZ.LJJIIZI(linkedHashMap);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static final void onClick$5(C521550Kcr c521550Kcr, View view) {
        long jLongValue;
        FragmentManager fragmentManager;
        C0IR5 c0ir5;
        Long l;
        C0J9Q c0j9q = (C0J9Q) c521550Kcr.l0;
        c0j9q.getClass();
        String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("click_live_aigc_toggle_learn_more");
        c474500IjALIZ.LJIJJLI(c0j9q.LLILLJJLI);
        c474500IjALIZ.LJJII("during", "enter_type");
        c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
        DataChannel dataChannel = c0j9q.LLILLJJLI;
        if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
        C0J9Q c0j9q2 = (C0J9Q) c521550Kcr.l0;
        C249600xq.LIZ("click_more", "ai_generated_content", "live_take_page", c0j9q2.LLILLJJLI, c0j9q2.LL);
        DataChannel dataChannel2 = ((C0J9Q) c521550Kcr.l0).LLILLJJLI;
        if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) != null) {
            C19322110iZ.LJFF(fragmentManager, new AiGeneratedContentSheetFragment(((C0J9Q) c521550Kcr.l0).LLILLJJLI), AiGeneratedContentSheetFragment.class.getName(), null, 0);
        }
    }

    public static final void onClick$6(C521550Kcr c521550Kcr, View view) {
        long jLongValue;
        C0IR5 c0ir5;
        Long l;
        FragmentManager fragmentManager;
        DataChannel dataChannelLJ = C475510Ikn.LJ((BasePreviewSettingMainFragment) c521550Kcr.l0);
        if (dataChannelLJ != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null) {
            C19322110iZ.LJFF(fragmentManager, new AiGeneratedContentSheetFragment(C475510Ikn.LJ((BasePreviewSettingMainFragment) c521550Kcr.l0)), AiGeneratedContentSheetFragment.class.getName(), null, 0);
        }
        BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) c521550Kcr.l0;
        basePreviewSettingMainFragment.getClass();
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(basePreviewSettingMainFragment);
        String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("click_live_aigc_toggle_learn_more");
        c474500IjALIZ.LJIJJLI(dataChannelLJ2);
        c474500IjALIZ.LJJII("before", "enter_type");
        c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
        if (dataChannelLJ2 != null && (c0ir5 = (C0IR5) dataChannelLJ2.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$7(C521550Kcr c521550Kcr, View view) {
        String str;
        C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
        HeaderCell headerCell = (HeaderCell) c521550Kcr.l0;
        C495980Jci c495980Jci = headerCell.LL;
        EnumC495860JcW enumC495860JcW = EnumC495860JcW.HEADER;
        if (headerCell.LLJLIL) {
            str = "see_original";
        } else {
            str = "see_translation";
        }
        c495870JcX.getClass();
        C495870JcX.LIZ(c495980Jci, enumC495860JcW, str, null);
        HeaderCell headerCell2 = (HeaderCell) c521550Kcr.l0;
        headerCell2.LLJLIL = !headerCell2.LLJLIL;
        headerCell2.LJIJJ();
    }

    public static final void onClick$8(C521550Kcr c521550Kcr, View view) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                String strLJFF = new C0XI4(C786410Ut5.j4("https://support.tiktok.com/%s/using-tiktok/messaging-and-notifications/direct-message-settings#7", Arrays.copyOf(new Object[]{((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage().toLowerCase(Locale.ROOT)}, 1))).LJFF();
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) c521550Kcr.l0, "aweme://webview");
                smartRouteBuildRoute.withParam("url", strLJFF);
                smartRouteBuildRoute.withParam("title", "");
                smartRouteBuildRoute.withParam("show_separate_line", true);
                smartRouteBuildRoute.open();
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1233040iBy c1233040iBy = new C1233040iBy((Context) c521550Kcr.l0);
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
    }

    public static final void onClick$9(C521550Kcr c521550Kcr, View view) {
        String secUid;
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null) {
            secUid = "";
        }
        C0K54.LIZ().LJ(view.getContext(), C511400K3u.LIZLLL(secUid, "preview", "1", "true", C2097608Jq.LJIIJ(new Pair("use_mock_data", "true"), new Pair("hide_bottom_post", "true"))), C2097608Jq.LJ());
    }

    public static final void updateDrawState$0(C521550Kcr c521550Kcr, TextPaint textPaint) {
        Integer numLIZJ;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = ((CourseDetailPurchaseSectionAssem) c521550Kcr.l0).getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$2(C521550Kcr c521550Kcr, TextPaint textPaint) {
        textPaint.setColor(C497740JfY.LIZLLL(R.attr.fxd, ((GameIntroductionWidget) c521550Kcr.l0).context));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C521550Kcr c521550Kcr, TextPaint textPaint) {
        Context context;
        C16F5 c16f5 = ((LiveAdaptiveLiteModeDialog) c521550Kcr.l0).LL;
        if (c16f5 != null) {
            context = c16f5.getContext();
        } else {
            context = null;
        }
        textPaint.setColor(C497740JfY.LIZLLL(R.attr.ezq, context));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$8(C521550Kcr c521550Kcr, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(C426930God.LIZ(R.attr.a1j, ((C0K2Y) c521550Kcr.l0).LL.getContext()));
    }
}
