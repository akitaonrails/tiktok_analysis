package Y;

import X.C0IJT;
import X.C0P0T;
import X.C0TGR;
import X.C0TOS;
import X.C0TV8;
import X.C0TV9;
import X.C0U17;
import X.C0U61;
import X.C0U6W;
import X.C0U6Z;
import X.C0U76;
import X.C0U9B;
import X.C0U9M;
import X.C0UBW;
import X.C0UBX;
import X.C0ULZ;
import X.C0UOS;
import X.C0UPY;
import X.C0UPZ;
import X.C0UQX;
import X.C0UX0;
import X.C1022620cia;
import X.C1143920fsE;
import X.C1161920gLG;
import X.C127K;
import X.C1324720kZq;
import X.C1389890mGx;
import X.C197039127h;
import X.C19U0;
import X.C20684815ws;
import X.C20743716Ff;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C238400w2;
import X.C474500IjA;
import X.C495520Jby;
import X.C497740JfY;
import X.C499640Jic;
import X.C500260Jjc;
import X.C754900TjM;
import X.C760140Tro;
import X.C766660U5o;
import X.C766670U5p;
import X.C766960U6s;
import X.C767000U6w;
import X.C770580UKq;
import X.C771740UPc;
import X.C774840UaQ;
import X.C779700UiG;
import X.C781270Ukn;
import X.C781300Ukq;
import X.C784980Uqm;
import X.C785020Uqq;
import X.C785410UrT;
import X.C786410Ut5;
import X.C932420aN6;
import X.EnumC767070U7d;
import X.InterfaceC1124060fMC;
import X.InterfaceC752610Tff;
import X.InterfaceC761860Tua;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.model.PopMsgContainer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.AIBeautyInterceptEvent;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.BenefitInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS79S0300000_12 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 26:
                onClick$26(this, view);
                break;
            case 27:
                onClick$27(this, view);
                break;
            case 28:
                onClick$28(this, view);
                break;
            case 29:
                onClick$29(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aCListenerS79S0300000_12.l0;
        IIconSlot iIconSlot = (IIconSlot) aCListenerS79S0300000_12.l1;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aCListenerS79S0300000_12.l2;
        List<C785020Uqq> list = BottomLeftSlotWidget.LLJJIJIIJIL;
        bottomLeftSlotWidget.getClass();
        InterfaceC752610Tff interfaceC752610TffLIZJ = iIconSlot.LIZJ();
        if (interfaceC752610TffLIZJ != null) {
            interfaceC752610TffLIZJ.LIZ(bottomLeftSlotWidget.getView(), "during_live");
        } else {
            iIconSlot.getScheme();
            if (!TextUtils.isEmpty(null)) {
                IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                Context context = bottomLeftSlotWidget.context;
                iIconSlot.getScheme();
                iActionHandlerService.handleWithoutHost(context, UriProtector.parse(null).toString());
            }
        }
        C770580UKq.LIZJ(interfaceC1124060fMC);
        bottomLeftSlotWidget.x1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[PHI: r3
      0x0059: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v8 java.lang.String) binds: [B:27:0x0056, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[PHI: r2 r3
      0x005d: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:30:0x005a, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v7 java.lang.String) binds: [B:30:0x005a, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS79S0300000_12 r7, android.view.View r8) {
        /*
            java.lang.Object r3 = r7.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget r3 = (com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget) r3
            java.lang.Object r0 = r7.l1
            X.0ULZ r0 = (X.C0ULZ) r0
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r7.l2
            X.0UPZ r0 = (X.C0UPZ) r0
            r6 = 0
            if (r0 == 0) goto L61
            X.0UPc r0 = r0.LIZLLL
            if (r0 == 0) goto L61
            java.lang.String r1 = r0.LIZJ
        L19:
            r3.getClass()
            boolean r0 = X.C500260Jjc.LJJIIZ(r1)
            if (r0 == 0) goto L2d
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r2, r1)
        L2d:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget r0 = (com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r5 = r0.dataChannel
            java.lang.Object r4 = r7.l2
            X.0UPZ r4 = (X.C0UPZ) r4
            if (r4 == 0) goto L55
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L55
            java.lang.String r3 = r0.LIZLLL
        L3f:
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L59
            java.lang.String r2 = r0.LJ
        L45:
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L5d
            java.lang.String r1 = r0.LJFF
        L4b:
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L51
            java.lang.Long r6 = r0.LJI
        L51:
            X.C0UQX.LJIJI(r5, r3, r2, r1, r6)
            return
        L55:
            r3 = r6
            if (r4 == 0) goto L59
            goto L3f
        L59:
            r2 = r6
            if (r4 == 0) goto L5d
            goto L45
        L5d:
            r1 = r6
            if (r4 == 0) goto L51
            goto L4b
        L61:
            r1 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS79S0300000_12.onClick$1(Y.ACListenerS79S0300000_12, android.view.View):void");
    }

    public static final void onClick$10(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ((C0U9B) aCListenerS79S0300000_12.l0).LLLLZLLIL((LiveEffect) aCListenerS79S0300000_12.l1, (RecyclerView.ViewHolder) aCListenerS79S0300000_12.l2, true);
    }

    public static final void onClick$11(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ((C0U9M) aCListenerS79S0300000_12.l0).LLLLZLLIL((LiveEffect) aCListenerS79S0300000_12.l1, (RecyclerView.ViewHolder) aCListenerS79S0300000_12.l2, true);
    }

    public static final void onClick$12(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ((C0TV9) aCListenerS79S0300000_12.l0).LLILLL.toggle();
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = ((C0TV8) aCListenerS79S0300000_12.l1).LLILLL;
        if (pushOffReasonBottomSheetFragment != null) {
            pushOffReasonBottomSheetFragment.NR(((PushOffReason) aCListenerS79S0300000_12.l2).category, ((C0TV9) aCListenerS79S0300000_12.l0).LLILLL.isChecked());
        }
    }

    public static final void onClick$13(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        IIconSlot iIconSlot = (IIconSlot) ((InterfaceC1124060fMC) aCListenerS79S0300000_12.l0).LLILZLL();
        if (iIconSlot == null) {
            return;
        }
        InterfaceC752610Tff interfaceC752610TffLIZJ = iIconSlot.LIZJ();
        if (interfaceC752610TffLIZJ != null) {
            interfaceC752610TffLIZJ.LIZ(((C784980Uqm) aCListenerS79S0300000_12.l2).LLILZ.LJ(), "during_live");
        } else {
            iIconSlot.getScheme();
            if (!TextUtils.isEmpty(null)) {
                IHostAction iHostActionLJIIJ = C781270Ukn.LJIIJ();
                iIconSlot.getScheme();
                iHostActionLJIIJ.openLiveBrowser((String) null, ((IIconSlot.SlotViewModel) aCListenerS79S0300000_12.l1).LLJILJILJ.getValue(), ((C784980Uqm) aCListenerS79S0300000_12.l2).LLILLJJLI);
            }
        }
        C770580UKq.LIZJ((InterfaceC1124060fMC) aCListenerS79S0300000_12.l0);
    }

    public static final void onClick$14(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ((C779700UiG) aCListenerS79S0300000_12.l0).onClick(((C499640Jic) aCListenerS79S0300000_12.l1).LIZ);
        ((C779700UiG) aCListenerS79S0300000_12.l0).getClass();
        DataChannel dataChannel = (DataChannel) aCListenerS79S0300000_12.l2;
        if (dataChannel != null) {
            dataChannel.FQ2(DismissToolbarPopEvent.class);
        }
    }

    public static final void onClick$15(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ((C774840UaQ) aCListenerS79S0300000_12.l0).onClick(((C499640Jic) aCListenerS79S0300000_12.l1).LIZ);
        ((C774840UaQ) aCListenerS79S0300000_12.l0).getClass();
        DataChannel dataChannel = (DataChannel) aCListenerS79S0300000_12.l2;
        if (dataChannel != null) {
            dataChannel.FQ2(DismissToolbarPopEvent.class);
        }
    }

    public static final void onClick$16(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        C786410Ut5.LJZ(8, ((TryModeBroadcastFragment) aCListenerS79S0300000_12.l0).oS());
        ((TryModeBroadcastFragment) aCListenerS79S0300000_12.l0).oS().setClickable(false);
        ((AnimatorSet) aCListenerS79S0300000_12.l1).cancel();
        ((C1143920fsE) aCListenerS79S0300000_12.l2).LIZ();
    }

    public static final void onClick$17(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) aCListenerS79S0300000_12.l0, UriProtector.parse(((PopMsgContainer) aCListenerS79S0300000_12.l1).jumpUrl));
        C0UOS c0uos = C0UOS.LIZ;
        DataChannel dataChannel = (DataChannel) aCListenerS79S0300000_12.l2;
        c0uos.getClass();
        C0UOS.LIZ(dataChannel, "click_link");
    }

    public static final void onClick$18(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        int i;
        String str;
        String str2;
        Context context = (Context) aCListenerS79S0300000_12.l0;
        LatestBanRecordInfo latestBanRecordInfo = (LatestBanRecordInfo) aCListenerS79S0300000_12.l1;
        if (latestBanRecordInfo != null) {
            i = latestBanRecordInfo.banSource;
            str = latestBanRecordInfo.detailUrl;
        } else {
            i = 1;
            str = null;
        }
        C0UX0.LIZ(i, context, str, "link_mic", new AwS591S0100000_12(context, 931));
        LiveDialog liveDialog = (LiveDialog) aCListenerS79S0300000_12.l2;
        liveDialog.dismiss();
        C785410UrT.LIZ(liveDialog);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_linkmic_ban_details_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJ("click");
        if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$19(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        if (((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLLLZLL() || Intrinsics.LJFF(((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLILZIL.getValue(), Boolean.TRUE)) {
            return;
        }
        Context context = ((C127K) aCListenerS79S0300000_12.l1).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((BenefitInfo) aCListenerS79S0300000_12.l2).pageLink);
        sbLIZ.append("&use_live_sheet=1");
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(4, "click_value");
        C20684815ws.LJIILLIIL("click_tt_plus_benefit_page", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[PHI: r3
      0x0059: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v8 java.lang.String) binds: [B:27:0x0056, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[PHI: r2 r3
      0x005d: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:30:0x005a, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v7 java.lang.String) binds: [B:30:0x005a, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS79S0300000_12 r7, android.view.View r8) {
        /*
            java.lang.Object r3 = r7.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget r3 = (com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget) r3
            java.lang.Object r0 = r7.l1
            X.0UPY r0 = (X.C0UPY) r0
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r7.l2
            X.0UPZ r0 = (X.C0UPZ) r0
            r6 = 0
            if (r0 == 0) goto L61
            X.0UPc r0 = r0.LIZLLL
            if (r0 == 0) goto L61
            java.lang.String r1 = r0.LIZJ
        L19:
            r3.getClass()
            boolean r0 = X.C500260Jjc.LJJIIZ(r1)
            if (r0 == 0) goto L2d
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r2, r1)
        L2d:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget r0 = (com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r5 = r0.dataChannel
            java.lang.Object r4 = r7.l2
            X.0UPZ r4 = (X.C0UPZ) r4
            if (r4 == 0) goto L55
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L55
            java.lang.String r3 = r0.LIZLLL
        L3f:
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L59
            java.lang.String r2 = r0.LJ
        L45:
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L5d
            java.lang.String r1 = r0.LJFF
        L4b:
            X.0UPc r0 = r4.LIZLLL
            if (r0 == 0) goto L51
            java.lang.Long r6 = r0.LJI
        L51:
            X.C0UQX.LJIJI(r5, r3, r2, r1, r6)
            return
        L55:
            r3 = r6
            if (r4 == 0) goto L59
            goto L3f
        L59:
            r2 = r6
            if (r4 == 0) goto L5d
            goto L45
        L5d:
            r1 = r6
            if (r4 == 0) goto L51
            goto L4b
        L61:
            r1 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS79S0300000_12.onClick$2(Y.ACListenerS79S0300000_12, android.view.View):void");
    }

    public static final void onClick$20(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        C786410Ut5.LJLLLLLL(8, ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ);
        ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS79S0300000_12.l1).cancel();
        ((C1143920fsE) aCListenerS79S0300000_12.l2).LIZ();
    }

    public static final void onClick$21(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        C786410Ut5.LJLLLLLL(8, ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ);
        ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS79S0300000_12.l1).cancel();
        ((C1143920fsE) aCListenerS79S0300000_12.l2).LIZ();
    }

    public static final void onClick$22(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        if (((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).LLILZLL == EnumC767070U7d.ANALYZING) {
            ((C766960U6s) aCListenerS79S0300000_12.l0).LIZJ.LC0(AIBeautyInterceptEvent.class, ((C767000U6w) aCListenerS79S0300000_12.l1).LIZIZ);
        } else {
            ((C19U0) aCListenerS79S0300000_12.l2).LJIIIIZZ.performClick();
        }
    }

    public static final void onClick$23(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        C932420aN6.LJJLIIIJJI((Room) aCListenerS79S0300000_12.l1, (C932420aN6) aCListenerS79S0300000_12.l2, true);
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).S70((C760140Tro) aCListenerS79S0300000_12.l0, true, ((Room) aCListenerS79S0300000_12.l1).getId(), ((C932420aN6) aCListenerS79S0300000_12.l2).LLILLL.getId(), "KickOutManager.KICK_OUT_DIALOG", null);
    }

    public static final void onClick$24(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        C932420aN6.LJJLIIIJJI((Room) aCListenerS79S0300000_12.l2, (C932420aN6) aCListenerS79S0300000_12.l1, false);
        TuxSheet tuxSheet = ((TuxSheet[]) aCListenerS79S0300000_12.l0)[0];
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        ((C932420aN6) aCListenerS79S0300000_12.l1).dismiss();
    }

    public static final void onClick$25(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        int adapterPosition = ((C766670U5p) aCListenerS79S0300000_12.l0).getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < ((ArrayList) ((C766660U5o) aCListenerS79S0300000_12.l1).LL).size()) {
            ((C766660U5o) aCListenerS79S0300000_12.l1).LLLLLLZ(adapterPosition, (LiveEffect) aCListenerS79S0300000_12.l2);
        }
    }

    public static final void onClick$26(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        int adapterPosition = ((C0U6Z) aCListenerS79S0300000_12.l0).getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < ((ArrayList) ((C0U6W) aCListenerS79S0300000_12.l1).LL).size()) {
            ((C0U6W) aCListenerS79S0300000_12.l1).LLLLLLLLLL(adapterPosition, (LiveEffect) aCListenerS79S0300000_12.l2);
        }
    }

    public static final void onClick$27(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        C0UBW c0ubw = (C0UBW) aCListenerS79S0300000_12.l0;
        long j = c0ubw.LLILLL;
        long j2 = ((Album) aCListenerS79S0300000_12.l1).id;
        if (j == j2) {
            C0UBW.LLLFZ((C0UBX) aCListenerS79S0300000_12.l2, false);
            C0UBW c0ubw2 = (C0UBW) aCListenerS79S0300000_12.l0;
            c0ubw2.LLILLL = 0L;
            c0ubw2.LLILZ = 0L;
            c0ubw2.LL.invoke(null);
            return;
        }
        c0ubw.LLILZ = j;
        c0ubw.LLILLL = j2;
        C0UBW.LLLFZ((C0UBX) aCListenerS79S0300000_12.l2, true);
        C0UBW c0ubw3 = (C0UBW) aCListenerS79S0300000_12.l0;
        int iLLLI = c0ubw3.LLLI(c0ubw3.LLILZ);
        if (iLLLI >= 0) {
            C0UBW c0ubw4 = (C0UBW) aCListenerS79S0300000_12.l0;
            c0ubw4.notifyItemChanged(iLLLI, c0ubw4.LLILZIL);
        }
        ((C0UBW) aCListenerS79S0300000_12.l0).LL.invoke((Album) aCListenerS79S0300000_12.l1);
    }

    public static final void onClick$28(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        boolean zKQ2;
        CompoundButton compoundButton;
        if ((view instanceof C20743716Ff) && (compoundButton = (CompoundButton) view) != null) {
            ((InterfaceC761860Tua) aCListenerS79S0300000_12.l0).LJII(!compoundButton.isChecked(), true, false);
        }
        ((InterfaceC761860Tua) aCListenerS79S0300000_12.l0).LIZIZ(((KaraokeSettingFragment) aCListenerS79S0300000_12.l1).LLJJIJI);
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannel = ((KaraokeSettingFragment) aCListenerS79S0300000_12.l1).LLJJIJI;
        boolean zIsChecked = ((C20743716Ff) aCListenerS79S0300000_12.l2).isChecked();
        KaraokeViewModel karaokeViewModel = ((KaraokeSettingFragment) aCListenerS79S0300000_12.l1).LLJJIII;
        if (karaokeViewModel != null) {
            zKQ2 = karaokeViewModel.KQ2();
        } else {
            zKQ2 = false;
        }
        c0u17.LJIILIIL(dataChannel, "voice", zIsChecked, zKQ2);
    }

    public static final void onClick$29(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ((Function1) aCListenerS79S0300000_12.l0).invoke((View) aCListenerS79S0300000_12.l1);
        ((C0P0T) aCListenerS79S0300000_12.l2).show();
    }

    public static final void onClick$3(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        Boolean bool;
        DataChannel dataChannel = ((PreviewCoverWidget) aCListenerS79S0300000_12.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(PreviewHideKeyboardEvent.class);
        }
        DataChannel dataChannel2 = ((PreviewCoverWidget) aCListenerS79S0300000_12.l0).dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(ForceGameAutoCoverChannel.class)) != null && bool.booleanValue()) {
            LiveMode liveMode = ((PreviewCoverWidget) aCListenerS79S0300000_12.l0).LLIZ;
            if (liveMode != null) {
                C754900TjM.LIZIZ(((C1324720kZq) aCListenerS79S0300000_12.l2).getContext(), liveMode);
            }
        } else {
            ((DialogFragment) ((PreviewCoverWidget) aCListenerS79S0300000_12.l0).LLILZIL.getValue()).show(((BaseFragment) aCListenerS79S0300000_12.l1).getChildFragmentManager(), "PreviewCoverSelectDialog");
        }
        C0UQX.LJIJJ(((PreviewCoverWidget) aCListenerS79S0300000_12.l0).dataChannel);
    }

    public static final void onClick$4(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        PreviewCommonNotifyWidget previewCommonNotifyWidget = (PreviewCommonNotifyWidget) aCListenerS79S0300000_12.l0;
        Context context = ((C0ULZ) aCListenerS79S0300000_12.l1).getContext();
        C771740UPc c771740UPc = ((C0UPZ) aCListenerS79S0300000_12.l2).LIZLLL;
        Long l = null;
        if (c771740UPc != null) {
            str = c771740UPc.LIZJ;
        } else {
            str = null;
        }
        previewCommonNotifyWidget.getClass();
        if (C500260Jjc.LJJIIZ(str)) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, str);
        }
        DataChannel dataChannel = ((PreviewCommonNotifyWidget) aCListenerS79S0300000_12.l0).dataChannel;
        C771740UPc c771740UPc2 = ((C0UPZ) aCListenerS79S0300000_12.l2).LIZLLL;
        if (c771740UPc2 != null) {
            str2 = c771740UPc2.LIZLLL;
            str3 = c771740UPc2.LJ;
            str4 = c771740UPc2.LJFF;
            l = c771740UPc2.LJI;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        C0UQX.LJIJI(dataChannel, str2, str3, str4, l);
    }

    public static final void onClick$5(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        PreviewCommonNotifyWidget previewCommonNotifyWidget = (PreviewCommonNotifyWidget) aCListenerS79S0300000_12.l0;
        Context context = ((C0UPY) aCListenerS79S0300000_12.l1).getContext();
        C771740UPc c771740UPc = ((C0UPZ) aCListenerS79S0300000_12.l2).LIZLLL;
        Long l = null;
        if (c771740UPc != null) {
            str = c771740UPc.LIZJ;
        } else {
            str = null;
        }
        previewCommonNotifyWidget.getClass();
        if (C500260Jjc.LJJIIZ(str)) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, str);
        }
        DataChannel dataChannel = ((PreviewCommonNotifyWidget) aCListenerS79S0300000_12.l0).dataChannel;
        C771740UPc c771740UPc2 = ((C0UPZ) aCListenerS79S0300000_12.l2).LIZLLL;
        if (c771740UPc2 != null) {
            str2 = c771740UPc2.LIZLLL;
            str3 = c771740UPc2.LJ;
            str4 = c771740UPc2.LJFF;
            l = c771740UPc2.LJI;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        C0UQX.LJIJI(dataChannel, str2, str3, str4, l);
    }

    public static final void onClick$6(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        View view2 = ((C781300Ukq) aCListenerS79S0300000_12.l0).LJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
        C786410Ut5.LJLLLLLL(8, ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ);
        ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS79S0300000_12.l1).cancel();
        ((C1143920fsE) aCListenerS79S0300000_12.l2).LIZ();
    }

    public static final void onClick$7(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        C786410Ut5.LJLLLLLL(8, ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ);
        ((C781300Ukq) aCListenerS79S0300000_12.l0).LIZJ.setClickable(false);
        ((AnimatorSet) aCListenerS79S0300000_12.l1).cancel();
        ((C1143920fsE) aCListenerS79S0300000_12.l2).LIZ();
    }

    public static final void onClick$8(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        int height;
        if (Math.abs(((C238400w2) aCListenerS79S0300000_12.l0).element - System.currentTimeMillis()) >= 1000) {
            ((C238400w2) aCListenerS79S0300000_12.l0).element = System.currentTimeMillis();
            C495520Jby c495520Jby = new C495520Jby(LiveStarCommentSchemaConfig.INSTANCE.getSettingValue().bubblePageFaq);
            View view2 = ((StarCommentPaymentDialog) aCListenerS79S0300000_12.l1).LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                height = view2.getHeight();
            } else {
                height = 505;
            }
            c495520Jby.LIZJ("height", String.valueOf((int) C497740JfY.LJJI(height)));
            Context context = (Context) aCListenerS79S0300000_12.l2;
            if (context != null) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c495520Jby.LIZLLL());
            }
        }
    }

    public static final void onClick$9(ACListenerS79S0300000_12 aCListenerS79S0300000_12, View view) {
        ProductInfo productInfo;
        ProductInfo productInfo2;
        ProductInfo productInfo3;
        String str;
        ProductInfo productInfo4;
        Boolean value = ((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLILZIL.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(2, "prompt_type");
        c2344009Gk.LIZJ(0, "page_exit_status");
        c2344009Gk.LIZJ(1, "click_value");
        c2344009Gk.LJIIIIZZ("enter_from", ((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLILLL);
        C20684815ws.LJIILLIIL("click_subscription_prompt", c2344009Gk.LIZ);
        String str2 = null;
        ProductInfo productInfo5 = null;
        str2 = null;
        if (!view.isEnabled()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getProductDetails productInfo: ");
            OfferInfo offerInfo = ((SubscriptionInfo) aCListenerS79S0300000_12.l1).offerInfo;
            if (offerInfo != null) {
                productInfo3 = offerInfo.productInfo;
            } else {
                productInfo3 = null;
            }
            sbLIZ.append(productInfo3);
            C1022620cia.LIZ("SubscriptionUtils", C2188811AlT.LIZIZ(sbLIZ));
            C0TOS c0tos = C0TOS.LIZ;
            OfferInfo offerInfo2 = ((SubscriptionInfo) aCListenerS79S0300000_12.l1).offerInfo;
            if (offerInfo2 != null && (productInfo4 = offerInfo2.productInfo) != null) {
                str = productInfo4.merchantId;
            } else {
                str = null;
                if (offerInfo2 != null) {
                }
                MutableLiveData<IapProductDetail> mutableLiveData = ((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLJI;
                c0tos.getClass();
                C0TOS.LIZIZ(str, productInfo5, mutableLiveData, 3);
                C1389890mGx c1389890mGx = new C1389890mGx((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0);
                c1389890mGx.LJIIIZ(2131843198);
                c1389890mGx.LJIIJJI();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LIZJ(2, "enter_from");
                c2344009Gk2.LIZJ(1, "button_status");
                C20684815ws.LJIILLIIL("tt_plus_click_buy", c2344009Gk2.LIZ);
                return;
            }
            productInfo5 = offerInfo2.productInfo;
            MutableLiveData<IapProductDetail> mutableLiveData2 = ((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLJI;
            c0tos.getClass();
            C0TOS.LIZIZ(str, productInfo5, mutableLiveData2, 3);
            C1389890mGx c1389890mGx2 = new C1389890mGx((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0);
            c1389890mGx2.LJIIIZ(2131843198);
            c1389890mGx2.LJIIJJI();
            C2344009Gk c2344009Gk22 = new C2344009Gk();
            c2344009Gk22.LIZJ(2, "enter_from");
            c2344009Gk22.LIZJ(1, "button_status");
            C20684815ws.LJIILLIIL("tt_plus_click_buy", c2344009Gk22.LIZ);
            return;
        }
        ((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLILZIL.setValue(bool);
        C0TOS c0tos2 = C0TOS.LIZ;
        Context context = ((C197039127h) aCListenerS79S0300000_12.l2).getContext();
        OfferInfo offerInfo3 = ((SubscriptionInfo) aCListenerS79S0300000_12.l1).offerInfo;
        if (offerInfo3 != null) {
            productInfo = offerInfo3.productInfo;
        } else {
            productInfo = null;
        }
        IapProductDetail value2 = ((SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0).LLJI.getValue();
        OfferInfo offerInfo4 = ((SubscriptionInfo) aCListenerS79S0300000_12.l1).offerInfo;
        if (offerInfo4 != null && (productInfo2 = offerInfo4.productInfo) != null) {
            str2 = productInfo2.pricePointId;
        }
        final SubscriptionAdPageActivity subscriptionAdPageActivity = (SubscriptionAdPageActivity) aCListenerS79S0300000_12.l0;
        SubscriptionVM subscriptionVM = subscriptionAdPageActivity.LLJ;
        Boolean bool2 = Boolean.FALSE;
        C0TGR c0tgr = new C0TGR() { // from class: X.0TNZ
            @Override // X.C0TGR
            public final void onFail() {
                subscriptionAdPageActivity.LLILZIL.setValue(Boolean.FALSE);
            }

            @Override // X.C0TGR
            public final void onSuccess() {
                subscriptionAdPageActivity.LLILZIL.setValue(Boolean.FALSE);
                subscriptionAdPageActivity.LLJILJIL = false;
                C1440005kM.LIZ(new IEvent() { // from class: X.0TNb
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
                SubscriptionAdPageActivity subscriptionAdPageActivity2 = subscriptionAdPageActivity;
                subscriptionAdPageActivity2.getClass();
                C1022620cia.LIZ("SubscriptionVM", "-----paySuccess-------");
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                c2344009Gk3.LIZJ(2, "prompt_type");
                c2344009Gk3.LIZJ(0, "product_line");
                C20684815ws.LJIILLIIL("exit_payment_success", c2344009Gk3.LIZ);
                SubscriptionVM subscriptionVM2 = subscriptionAdPageActivity2.LLJ;
                if (subscriptionVM2 != null) {
                    subscriptionVM2.zQ2();
                }
                subscriptionAdPageActivity2.LLLLLZL(new AwS556S0100000_12(subscriptionAdPageActivity2, 350));
                subscriptionAdPageActivity2.LLJIJIL = true;
            }
        };
        MutableLiveData<Boolean> mutableLiveData3 = subscriptionAdPageActivity.LLILZIL;
        c0tos2.getClass();
        C0TOS.LJFF(3, context, productInfo, value2, str2, subscriptionVM, bool2, c0tgr, null, mutableLiveData3, 0, null);
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        c2344009Gk3.LIZJ(2, "enter_from");
        c2344009Gk3.LIZJ(0, "button_status");
        C20684815ws.LJIILLIIL("tt_plus_click_buy", c2344009Gk3.LIZ);
    }

    public ACListenerS79S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
