package Y;

import X.AbstractC1110800f0o;
import X.AbstractC1126560fQE;
import X.AbstractC1126590fQH;
import X.AbstractC1126600fQI;
import X.AbstractC1136060ffY;
import X.AbstractC21673619ry;
import X.AnonymousClass0054;
import X.C006A;
import X.C013C;
import X.C01AG;
import X.C01GW;
import X.C0IF2;
import X.C0IJT;
import X.C0TZM;
import X.C1086830eO9;
import X.C1090810eUZ;
import X.C1103140eoS;
import X.C1109400eyY;
import X.C1109770ez9;
import X.C1110100ezg;
import X.C1113510f5B;
import X.C1115390f8D;
import X.C1115430f8H;
import X.C1115450f8J;
import X.C1115490f8N;
import X.C1115500f8O;
import X.C1115580f8W;
import X.C1115590f8X;
import X.C1116210f9X;
import X.C1116360f9m;
import X.C1119660fF6;
import X.C1119740fFE;
import X.C1120190fFx;
import X.C1120780fGu;
import X.C1120840fH0;
import X.C1120950fHB;
import X.C1121190fHZ;
import X.C1124200fMQ;
import X.C1124240fMU;
import X.C1125170fNz;
import X.C1126630fQL;
import X.C1127220fRI;
import X.C1127390fRZ;
import X.C1128590fTV;
import X.C1128630fTZ;
import X.C1128760fTm;
import X.C1131340fXw;
import X.C1135810ff9;
import X.C1136000ffS;
import X.C1136110ffd;
import X.C1136980fh2;
import X.C1142290fpb;
import X.C1142320fpe;
import X.C1143980fsK;
import X.C1144530ftD;
import X.C1145270fuP;
import X.C1145280fuQ;
import X.C1145300fuS;
import X.C1145600fuw;
import X.C1148030fyr;
import X.C1151190g3x;
import X.C1161920gLG;
import X.C1196320hEk;
import X.C13LE;
import X.C1516000pYM;
import X.C1558520qew;
import X.C16FS;
import X.C1803830x2b;
import X.C1913750ztt;
import X.C19298010eg;
import X.C20337914i1;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C292301Bh;
import X.C474500IjA;
import X.C478701th;
import X.C495520Jby;
import X.C500260Jjc;
import X.C520010KaN;
import X.C782110Um9;
import X.C784440Upu;
import X.C786410Ut5;
import X.C800330VaR;
import X.C915980Zwa;
import X.C970370bMJ;
import X.C973660bRc;
import X.EnumC1123470fLF;
import X.EnumC1130940fXI;
import X.InterfaceC1094160eZy;
import X.InterfaceC1115480f8M;
import X.InterfaceC1126580fQG;
import X.InterfaceC1126640fQM;
import X.InterfaceC1132680fa6;
import X.InterfaceC1145360fuY;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC752610Tff;
import X.ViewOnAttachStateChangeListenerC1129870fVZ;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.RechargeBackpackBubbleEvent;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedScreenFilterWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FreeFrameSlotWidget;
import com.bytedance.android.live.slot.HighPrioritySlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.api.revenue.starcomment.DeleteStarCommentEvent;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelBannerMetaData;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor.CountryItemCell;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder.NormalTextBinder;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFanHammerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeEcomLiveParam;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.widgets.giftwidget.presenter.FastGiftConfirmDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateConfirmationFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.data.BagItem;
import webcast.data.TPClickableText;

/* JADX INFO: loaded from: classes18.dex */
public class ACListenerS120S0200000_17 implements View.OnClickListener {
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
            case 30:
                onClick$30(this, view);
                break;
            case 31:
                onClick$31(this, view);
                break;
            case 32:
                onClick$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onClick$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onClick$34(this, view);
                break;
            case 35:
                onClick$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onClick$36(this, view);
                break;
            case 37:
                onClick$37(this, view);
                break;
            case 38:
                onClick$38(this, view);
                break;
            case 39:
                onClick$39(this, view);
                break;
            case 40:
                onClick$40(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((C1136110ffd) aCListenerS120S0200000_17.l0).LJIJJ((Context) aCListenerS120S0200000_17.l1, "gift");
    }

    public static final void onClick$1(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((C1136110ffd) aCListenerS120S0200000_17.l0).LJIJJ((Context) aCListenerS120S0200000_17.l1, "others");
    }

    public static final void onClick$10(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        InterfaceC752610Tff interfaceC752610TffLIZJ = ((IFrameSlot) aCListenerS120S0200000_17.l0).LIZJ();
        if (interfaceC752610TffLIZJ != null) {
            interfaceC752610TffLIZJ.LIZ(((HighPrioritySlotWidget) aCListenerS120S0200000_17.l1).LLILLL, "during_live");
        } else {
            if (TextUtils.isEmpty(((IFrameSlot) aCListenerS120S0200000_17.l0).getScheme())) {
                return;
            }
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openLiveBrowser(((IFrameSlot) aCListenerS120S0200000_17.l0).getScheme(), new Bundle(), ((HighPrioritySlotWidget) aCListenerS120S0200000_17.l1).getContext());
        }
    }

    public static final void onClick$11(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aCListenerS120S0200000_17.l0;
        Context context = (Context) aCListenerS120S0200000_17.l1;
        liveEmojiInputDialogFragment.LLLIILIL.setBackground(null);
        liveEmojiInputDialogFragment.LLLIIL.setBackground(C800330VaR.LIZIZ(context, R.drawable.dql));
        liveEmojiInputDialogFragment.hS("select_tab");
    }

    public static final void onClick$12(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        DataChannel dataChannel = (DataChannel) aCListenerS120S0200000_17.l0;
        if (dataChannel != null) {
            dataChannel.LC0(DeleteStarCommentEvent.class, new C1116360f9m((C1116210f9X) aCListenerS120S0200000_17.l1, "queue_list", false));
        }
    }

    public static final void onClick$13(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((AbsPollWidget) aCListenerS120S0200000_17.l0).B1();
        AbsPollWidget absPollWidget = (AbsPollWidget) aCListenerS120S0200000_17.l0;
        boolean z = C1086830eO9.LIZJ;
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17((C16FS) aCListenerS120S0200000_17.l1, 223);
        absPollWidget.getClass();
        C782110Um9 c782110Um9 = new C782110Um9(absPollWidget.context);
        if (z) {
            c782110Um9.LJII(2131841948);
        } else {
            c782110Um9.LJII(2131841947);
        }
        c782110Um9.LJIIJJI(absPollWidget.context.getString(2131841946), new AcS497S0100000_17(absPollWidget, 14));
        c782110Um9.LJIILJJIL(absPollWidget.context.getString(2131841944), new AcS355S0200000_17(awS561S0100000_17, absPollWidget, 1));
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static final void onClick$14(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        FastGiftConfirmDialog fastGiftConfirmDialog = (FastGiftConfirmDialog) aCListenerS120S0200000_17.l0;
        long j = ((Gift) aCListenerS120S0200000_17.l1).id;
        InterfaceC1132680fa6 interfaceC1132680fa6 = fastGiftConfirmDialog.LLJIJIL;
        if (interfaceC1132680fa6 != null) {
            interfaceC1132680fa6.LIZ();
        }
        fastGiftConfirmDialog.LLJILJILJ = true;
        C1103140eoS.LIZ(true, fastGiftConfirmDialog.LLJJI);
        fastGiftConfirmDialog.dismissAllowingStateLoss();
        C20337914i1<Set<String>> c20337914i1 = InterfaceC1094160eZy.W0;
        Set<String> setLIZIZ = c20337914i1.LIZIZ();
        if (setLIZIZ == null) {
            setLIZIZ = new HashSet<>();
        }
        setLIZIZ.add(String.valueOf(j));
        c20337914i1.LJFF(setLIZIZ);
    }

    public static final void onClick$15(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        view.setEnabled(false);
        C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS86S0200000_17((C013C) aCListenerS120S0200000_17.l1, view, 30));
        C19298010eg.LIZIZ(1, "confirm");
        ((AgeGateConfirmationFragment) aCListenerS120S0200000_17.l0).SR().LLILZ.postValue(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$16(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1120840fH0 c1120840fH0 = C1120840fH0.LIZ;
        C1121190fHZ c1121190fHZ = (C1121190fHZ) ((C259800zU) aCListenerS120S0200000_17.l0).element;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS120S0200000_17.l1;
        c1120840fH0.getClass();
        C1120840fH0.LIZ(c1121190fHZ, c1120950fHB, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$17(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1120840fH0 c1120840fH0 = C1120840fH0.LIZ;
        C1121190fHZ c1121190fHZ = (C1121190fHZ) ((C259800zU) aCListenerS120S0200000_17.l0).element;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS120S0200000_17.l1;
        c1120840fH0.getClass();
        C1120840fH0.LIZ(c1121190fHZ, c1120950fHB, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$18(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1120840fH0 c1120840fH0 = C1120840fH0.LIZ;
        C1121190fHZ c1121190fHZ = (C1121190fHZ) ((C259800zU) aCListenerS120S0200000_17.l0).element;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS120S0200000_17.l1;
        c1120840fH0.getClass();
        C1120840fH0.LIZ(c1121190fHZ, c1120950fHB, true);
    }

    public static final void onClick$19(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        String strG1 = ((NewTopRightBannerWidget) aCListenerS120S0200000_17.l0).G1((BannerInRoom) aCListenerS120S0200000_17.l1);
        if (strG1 != null && strG1.length() != 0) {
            ((NewTopRightBannerWidget) aCListenerS120S0200000_17.l0).E1((BannerInRoom) aCListenerS120S0200000_17.l1, "banner_click").LIZ();
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((NewTopRightBannerWidget) aCListenerS120S0200000_17.l0).context, strG1);
        }
    }

    public static final void onClick$2(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((C1136110ffd) aCListenerS120S0200000_17.l0).LJIJJ((Context) aCListenerS120S0200000_17.l1, "others");
    }

    public static final void onClick$20(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1145270fuP c1145270fuP;
        ((C1145300fuS) aCListenerS120S0200000_17.l0).itemView.setSelected(true);
        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = ((C1145300fuS) aCListenerS120S0200000_17.l0).getBindingAdapter();
        if ((bindingAdapter instanceof C1145270fuP) && (c1145270fuP = (C1145270fuP) bindingAdapter) != null) {
            C1145280fuQ c1145280fuQ = (C1145280fuQ) aCListenerS120S0200000_17.l1;
            InterfaceC1145360fuY interfaceC1145360fuY = c1145270fuP.LLILLL;
            if (interfaceC1145360fuY != null) {
                interfaceC1145360fuY.Xc(c1145280fuQ);
            }
        }
    }

    public static final void onClick$21(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(((ViewOnAttachStateChangeListenerC1129870fVZ) aCListenerS120S0200000_17.l0).LLLILZ.getContext(), ((C292301Bh) ((AbstractC1126600fQI) aCListenerS120S0200000_17.l1)).LJJIII, AFwS254S0000000_17.get$arr$(104));
    }

    public static final void onClick$22(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        long jLJFF;
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) aCListenerS120S0200000_17.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI != null) {
            C01AG c01ag = (C01AG) aCListenerS120S0200000_17.l1;
            InterfaceC1126580fQG interfaceC1126580fQG = abstractC1126560fQE.LLJL;
            if (interfaceC1126580fQG != null) {
                int position = abstractC1126560fQE.getPosition();
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
                if (abstractC1126600fQI2 != null) {
                    jLJFF = abstractC1126600fQI2.LJFF();
                } else {
                    jLJFF = 0;
                }
                interfaceC1126580fQG.LJIJI(c01ag, position, jLJFF, abstractC1126600fQI);
            }
        }
        int i = C1126630fQL.LIZ;
        AbstractC1126560fQE abstractC1126560fQE2 = (AbstractC1126560fQE) aCListenerS120S0200000_17.l0;
        C1126630fQL.LIZ(abstractC1126560fQE2.LLIZ, abstractC1126560fQE2.LLIZLLLIL, abstractC1126560fQE2.LLJ, false);
        AbstractC1126560fQE abstractC1126560fQE3 = (AbstractC1126560fQE) aCListenerS120S0200000_17.l0;
        C1126630fQL.LIZIZ(abstractC1126560fQE3.LLIZ, abstractC1126560fQE3.LLJ, false);
    }

    public static final void onClick$23(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        DataChannel dataChannel;
        C1109770ez9 c1109770ez9 = ((C1110100ezg) aCListenerS120S0200000_17.l0).LL;
        if (c1109770ez9 != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
            dataChannel.LC0(DeleteStarCommentEvent.class, new C1116360f9m((C1116210f9X) ((C1109400eyY) aCListenerS120S0200000_17.l1).LIZ.LJIL, "comment_area", false));
        }
    }

    public static final void onClick$24(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        AssemVMLazy assemVMLazy = ((CountryItemCell) aCListenerS120S0200000_17.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CountryItemCell.LLILZLL;
        AssemViewModel value = assemVMLazy.getValue();
        GiftColorInfo giftColorInfo = ((C1142320fpe) aCListenerS120S0200000_17.l1).LL;
        long j = ((C1142290fpb) value.getState()).LLILLL;
        Long l = giftColorInfo.colorId;
        if (l != null && j == l.longValue()) {
            return;
        }
        value.setStateImmediate(new AwS596S0100000_17(giftColorInfo, 401));
    }

    public static final void onClick$25(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        String str;
        C006A c006aLIZJ;
        GiftPanelBannerMetaData giftPanelBannerMetaData = ((C1127220fRI) ((AbstractC1126600fQI) aCListenerS120S0200000_17.l0)).LJJIFFI.banner;
        if (giftPanelBannerMetaData != null && (str = giftPanelBannerMetaData.schema) != null) {
            C1127390fRZ c1127390fRZ = (C1127390fRZ) aCListenerS120S0200000_17.l1;
            try {
                c006aLIZJ = C1161920gLG.LIZJ(IActionHandlerService.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c006aLIZJ = null;
            }
            IActionHandlerService iActionHandlerService = (IActionHandlerService) c006aLIZJ;
            if (iActionHandlerService != null) {
                iActionHandlerService.handle(c1127390fRZ.LL, new C495520Jby(str).LIZLLL());
            }
        }
    }

    public static final void onClick$26(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1115450f8J c1115450f8J = (C1115450f8J) aCListenerS120S0200000_17.l0;
        C1115500f8O c1115500f8O = (C1115500f8O) aCListenerS120S0200000_17.l1;
        InterfaceC1115480f8M interfaceC1115480f8M = c1115450f8J.LL;
        if (interfaceC1115480f8M != null) {
            interfaceC1115480f8M.LLLLJI(c1115500f8O);
        }
    }

    public static final void onClick$27(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        InterfaceC1115480f8M<C1115490f8N> interfaceC1115480f8M = ((C1115390f8D) aCListenerS120S0200000_17.l0).LLILZ;
        if (interfaceC1115480f8M != null) {
            interfaceC1115480f8M.LLLLJI((C1115490f8N) aCListenerS120S0200000_17.l1);
        }
    }

    public static final void onClick$28(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        InterfaceC1115480f8M<C1115490f8N> interfaceC1115480f8M = ((C1115390f8D) aCListenerS120S0200000_17.l0).LLILZ;
        if (interfaceC1115480f8M != null) {
            interfaceC1115480f8M.LLLLJI((C1115490f8N) aCListenerS120S0200000_17.l1);
        }
    }

    public static final void onClick$29(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1115430f8H c1115430f8H = (C1115430f8H) aCListenerS120S0200000_17.l0;
        C1115500f8O c1115500f8O = (C1115500f8O) aCListenerS120S0200000_17.l1;
        InterfaceC1115480f8M interfaceC1115480f8M = c1115430f8H.LLILLJJLI;
        if (interfaceC1115480f8M != null) {
            interfaceC1115480f8M.LLLLJI(c1115500f8O);
        }
    }

    public static final void onClick$3(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((C1136000ffS) aCListenerS120S0200000_17.l0).LJIJJ((Context) aCListenerS120S0200000_17.l1, "others");
    }

    public static final void onClick$30(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        String str;
        Room room;
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        String str6;
        C1090810eUZ c1090810eUZ = (C1090810eUZ) aCListenerS120S0200000_17.l0;
        BarrageMessage barrageMessage = (BarrageMessage) aCListenerS120S0200000_17.l1;
        Context context = view.getContext();
        DataChannel dataChannel = ((C1090810eUZ) aCListenerS120S0200000_17.l0).LIZJ;
        c1090810eUZ.getClass();
        String strLIZJ = null;
        if (barrageMessage != null) {
            str = barrageMessage.subType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "ecom_live_pdp")) {
            String str7 = barrageMessage.schema;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_product_entrance_click");
            BarrageTypeEcomLiveParam barrageTypeEcomLiveParam = barrageMessage.ecomLiveParam;
            if (barrageTypeEcomLiveParam != null) {
                str3 = barrageTypeEcomLiveParam.entranceForm;
            } else {
                str3 = null;
            }
            c474500IjALIZ.LJJII(str3, "entrance_form");
            c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
            if (Intrinsics.LJFF(barrageMessage.subType, "ecom_live_pdp")) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_tiktokec_product_click");
                BarrageTypeEcomLiveParam barrageTypeEcomLiveParam2 = barrageMessage.ecomLiveParam;
                if (barrageTypeEcomLiveParam2 != null) {
                    strLIZJ = barrageTypeEcomLiveParam2.entranceForm;
                }
                c474500IjALIZ2.LJJII(strLIZJ, "entrance_form");
                c474500IjALIZ2.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
                c474500IjALIZ2.LJIJJLI(dataChannel);
                c474500IjALIZ2.LIZ();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BarrageTypeEcomLiveParam barrageTypeEcomLiveParam3 = barrageMessage.ecomLiveParam;
            if (barrageTypeEcomLiveParam3 != null && (str6 = barrageTypeEcomLiveParam3.entranceForm) != null) {
                linkedHashMap.put("entrance_form", str6);
            }
            BarrageTypeEcomLiveParam barrageTypeEcomLiveParam4 = barrageMessage.ecomLiveParam;
            if (barrageTypeEcomLiveParam4 != null && (str5 = barrageTypeEcomLiveParam4.anchoredProductId) != null) {
                linkedHashMap.put("product_id", str5);
            }
            BarrageTypeEcomLiveParam barrageTypeEcomLiveParam5 = barrageMessage.ecomLiveParam;
            if (barrageTypeEcomLiveParam5 != null && (string = Integer.valueOf(barrageTypeEcomLiveParam5.anchoredProductPlatform).toString()) != null) {
                linkedHashMap.put("product_source", string);
            }
            BarrageTypeEcomLiveParam barrageTypeEcomLiveParam6 = barrageMessage.ecomLiveParam;
            if (barrageTypeEcomLiveParam6 != null && (str4 = barrageTypeEcomLiveParam6.anchoredProductSource) != null) {
                linkedHashMap.put("source", str4);
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).il(str7, linkedHashMap));
            return;
        }
        if (!Intrinsics.LJFF(str, "ecom_live_plp") || dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        BarrageTypeEcomLiveParam barrageTypeEcomLiveParam7 = barrageMessage.ecomLiveParam;
        if (barrageTypeEcomLiveParam7 != null) {
            str2 = barrageTypeEcomLiveParam7.entranceForm;
        } else {
            str2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://ec/live_bag_list?room_id=");
        sbLIZ.append(room.getId());
        sbLIZ.append("&enter_from=");
        sbLIZ.append(str2);
        sbLIZ.append("&entrance_form=");
        sbLIZ.append(str2);
        sbLIZ.append("&business_params=");
        BarrageTypeEcomLiveParam barrageTypeEcomLiveParam8 = barrageMessage.ecomLiveParam;
        if (barrageTypeEcomLiveParam8 != null) {
            strLIZJ = C1516000pYM.LIZJ(barrageTypeEcomLiveParam8);
        }
        sbLIZ.append(strLIZJ);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onClick$31(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        InterfaceC1115480f8M<EmoteModel> interfaceC1115480f8M;
        EmoteModel emoteModel = (EmoteModel) aCListenerS120S0200000_17.l0;
        if (!emoteModel.readOnly && emoteModel.emoteResource != null && (interfaceC1115480f8M = ((C1115580f8W) aCListenerS120S0200000_17.l1).LL) != null) {
            interfaceC1115480f8M.LLLLJI(emoteModel);
        }
    }

    public static final void onClick$32(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        InterfaceC1115480f8M<EmoteModel> interfaceC1115480f8M;
        C1115590f8X c1115590f8X = (C1115590f8X) aCListenerS120S0200000_17.l0;
        if (c1115590f8X.LLILZ && (interfaceC1115480f8M = c1115590f8X.LL) != null) {
            interfaceC1115480f8M.LLLLJI((EmoteModel) aCListenerS120S0200000_17.l1);
        }
    }

    public static final void onClick$33(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        FragmentManager fragmentManagerLJJ;
        Context context;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("coins_left_in_bubble", String.valueOf(((C1120190fFx) aCListenerS120S0200000_17.l0).LIZLLL)), new Pair("threshold_coins", String.valueOf(((C1120190fFx) aCListenerS120S0200000_17.l0).LIZIZ)), new Pair("coins_left_in_notification", String.valueOf(((C1120190fFx) aCListenerS120S0200000_17.l0).LIZJ)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_push_bubble_click");
        c474500IjALIZ.LJIJJLI(((C1120780fGu) aCListenerS120S0200000_17.l1).LL);
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LIZ();
        C1120950fHB c1120950fHB = ((C1120780fGu) aCListenerS120S0200000_17.l1).LLILLJJLI;
        if (c1120950fHB != null && (fragmentManagerLJJ = C520010KaN.LJJ(c1120950fHB, true)) != null) {
            C1120780fGu c1120780fGu = (C1120780fGu) aCListenerS120S0200000_17.l1;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("key_charge_reason", "push_bubble", bundle);
            C1803830x2b c1803830x2b = new C1803830x2b();
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            C1120950fHB c1120950fHB2 = c1120780fGu.LLILLJJLI;
            if (c1120950fHB2 != null) {
                context = c1120950fHB2.getContext();
            } else {
                context = null;
            }
            DialogFragment dialogFragmentCreateRechargeDialogFragment = iWalletService.createRechargeDialogFragment(context, null, bundle, c1803830x2b);
            if (dialogFragmentCreateRechargeDialogFragment != null) {
                dialogFragmentCreateRechargeDialogFragment.show(fragmentManagerLJJ, "LiveWalletRechargeReminder");
            }
        }
    }

    public static final void onClick$34(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        Object next;
        ((C1120780fGu) aCListenerS120S0200000_17.l0).LJII(2, ((RechargeBackpackBubbleEvent) aCListenerS120S0200000_17.l1).getGuideTypeTooltipTypePair().getFirst(), String.valueOf(((RechargeBackpackBubbleEvent) aCListenerS120S0200000_17.l1).getGiftId()), "");
        if (Intrinsics.LJFF(((RechargeBackpackBubbleEvent) aCListenerS120S0200000_17.l1).getGuideTypeTooltipTypePair().getFirst(), EnumC1123470fLF.GIFT_GUIDE_FIRST_RECHARGE_BACKPACK_GIFT_NOTICE_BUBBLE.getValue())) {
            C01GW c01gw = C1131340fXw.LIZ;
            List list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        BagItem bagItem = (BagItem) next;
                        if (bagItem.itemType == 100 && bagItem.available) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                BagItem bagItem2 = (BagItem) next;
                if (bagItem2 != null) {
                    GiftService.LLILLJJLI.openGiftDialog("match", 100L, bagItem2.itemId, null);
                }
            }
        }
    }

    public static final void onClick$35(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        AbstractC1126600fQI<?> abstractC1126600fQI;
        AbstractC1126590fQH abstractC1126590fQH = (AbstractC1126590fQH) aCListenerS120S0200000_17.l0;
        InterfaceC1126640fQM interfaceC1126640fQM = (InterfaceC1126640fQM) aCListenerS120S0200000_17.l1;
        AbstractC1126600fQI<?> abstractC1126600fQI2 = abstractC1126590fQH.LLIZLLLIL;
        boolean zLJJJI = false;
        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJIJJ() && (abstractC1126600fQI = abstractC1126590fQH.LLIZLLLIL) != null && abstractC1126600fQI.LIZJ) {
            String strLJIIL = abstractC1126600fQI.LJIIL();
            if (C500260Jjc.LJJIIZ(strLJIIL)) {
                Uri.Builder builderBuildUpon = UriProtector.parse(strLJIIL).buildUpon();
                builderBuildUpon.appendQueryParameter("tap_area", "send_gift_btn");
                String string = builderBuildUpon.build().toString();
                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("privilege_page_horizontal_");
                sbLIZ.append(string);
                c784440UpuLIZ.LIZIZ(new C0IF2(C2188811AlT.LIZIZ(sbLIZ)));
            }
        }
        C1128590fTV.LJJIL = SystemClock.uptimeMillis();
        if (interfaceC1126640fQM != null) {
            AbstractC1126600fQI<?> abstractC1126600fQI3 = abstractC1126590fQH.LLIZLLLIL;
            InterfaceC1126640fQM interfaceC1126640fQM2 = abstractC1126590fQH.LLJ;
            if (interfaceC1126640fQM2 != null) {
                zLJJJI = interfaceC1126640fQM2.LJJJI();
            }
            interfaceC1126640fQM.LJLJLJ(abstractC1126600fQI3, abstractC1126590fQH, zLJJJI);
        }
    }

    public static final void onClick$36(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((Function1) aCListenerS120S0200000_17.l0).invoke(((C1913750ztt) aCListenerS120S0200000_17.l1).LIZJ);
    }

    public static final void onClick$37(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1119660fF6 c1119660fF6 = (C1119660fF6) aCListenerS120S0200000_17.l0;
        C1119740fFE c1119740fFE = (C1119740fFE) aCListenerS120S0200000_17.l1;
        c1119660fF6.LJ.onClick(view);
        c1119740fFE.LL = 7;
        c1119740fFE.dismiss();
    }

    public static final void onClick$38(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        String str;
        RechargePanelInputParams inputParams;
        PanelHostAbility panelHostAbility;
        TouchPointAbility touchPointAbility;
        PanelHostAbility panelHostAbility2;
        TPClickableText tPClickableText = ((C478701th) aCListenerS120S0200000_17.l0).LLILLJJLI;
        if (tPClickableText != null && (str = tPClickableText.schema) != null) {
            NormalTextBinder normalTextBinder = (NormalTextBinder) aCListenerS120S0200000_17.l1;
            normalTextBinder.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(normalTextBinder);
            Map<String, String> logExtra = null;
            if (interfaceC665370Q7zLIZ != null && (panelHostAbility2 = (PanelHostAbility) C1558520qew.LIZIZ(interfaceC665370Q7zLIZ, C13LE.LIZ(CampaignPanelScope.class), C13LE.LIZ(PanelHostAbility.class))) != null) {
                inputParams = panelHostAbility2.getInputParams();
            } else {
                inputParams = null;
            }
            NormalTextBinder normalTextBinder2 = (NormalTextBinder) aCListenerS120S0200000_17.l1;
            normalTextBinder2.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ2 = C1196320hEk.LIZ(normalTextBinder2);
            if (interfaceC665370Q7zLIZ2 != null && (touchPointAbility = (TouchPointAbility) C1558520qew.LIZIZ(interfaceC665370Q7zLIZ2, C13LE.LIZ(CampaignPanelScope.class), C13LE.LIZ(TouchPointAbility.class))) != null) {
                logExtra = touchPointAbility.getLogExtra();
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_task_page_click");
            C1151190g3x.LIZJ(c474500IjALIZ, inputParams, logExtra);
            c474500IjALIZ.LIZ();
            NormalTextBinder normalTextBinder3 = (NormalTextBinder) aCListenerS120S0200000_17.l1;
            normalTextBinder3.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ3 = C1196320hEk.LIZ(normalTextBinder3);
            if (interfaceC665370Q7zLIZ3 != null && (panelHostAbility = (PanelHostAbility) C1558520qew.LIZIZ(interfaceC665370Q7zLIZ3, C13LE.LIZ(CampaignPanelScope.class), C13LE.LIZ(PanelHostAbility.class))) != null) {
                panelHostAbility.closePanel();
            }
            C1143980fsK.LJ(((NormalTextBinder) aCListenerS120S0200000_17.l1).itemView.getContext(), str);
        }
    }

    public static final void onClick$39(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        MutableLiveData<EnumC1130940fXI> mutableLiveData;
        C1124200fMQ c1124200fMQ = (C1124200fMQ) aCListenerS120S0200000_17.l0;
        C1124240fMU c1124240fMU = (C1124240fMU) aCListenerS120S0200000_17.l1;
        c1124200fMQ.getClass();
        int iIntValue = ((Integer) view.getTag()).intValue();
        int iLIZ = 0;
        if (iIntValue == c1124200fMQ.LLILZIL) {
            if (iIntValue == 1) {
                C1128760fTm.LJIIJ.LJJIJ(c1124240fMU.LJIIJJI, c1124240fMU.LJII, null);
                EnumC1130940fXI enumC1130940fXINextState = c1124240fMU.LJIIJJI.nextState();
                c1124240fMU.LJIIJJI = enumC1130940fXINextState;
                if (c1124200fMQ.LLILLJJLI != null) {
                    iLIZ = C1128630fTZ.LIZ(iIntValue, enumC1130940fXINextState);
                }
                c1124240fMU.LJIIIIZZ = iLIZ;
                C1128630fTZ c1128630fTZ = c1124200fMQ.LLILLJJLI;
                if (c1128630fTZ != null && (mutableLiveData = c1128630fTZ.LJIIIIZZ) != null) {
                    mutableLiveData.setValue(c1124240fMU.LJIIJJI);
                }
                c1124200fMQ.LLLFZ(iIntValue, true);
                return;
            }
            return;
        }
        View view2 = c1124200fMQ.LLILZ;
        if (view2 != null && (view2 instanceof TextView)) {
            ((TextView) view2).setTextColor(ColorProtector.parseColor("#88FFFFFF"));
        }
        c1124200fMQ.LLILZ = view;
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(ColorProtector.parseColor("#E6FFFFFF"));
        }
        if (iIntValue == 15) {
            InterfaceC1094160eZy.u1.LJFF(Boolean.FALSE);
            ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Wt2();
        }
        c1124200fMQ.LLLFZ(iIntValue, false);
    }

    public static final void onClick$4(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        GiftMessage giftMessage;
        DataChannel dataChannel = (DataChannel) aCListenerS120S0200000_17.l0;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
            C1135810ff9 c1135810ff9 = ((C1136980fh2) aCListenerS120S0200000_17.l1).LIZIZ;
            Room room = null;
            if (c1135810ff9 != null) {
                giftMessage = c1135810ff9.LIZ;
            } else {
                giftMessage = null;
            }
            DataChannel dataChannel2 = (DataChannel) aCListenerS120S0200000_17.l0;
            if (dataChannel2 != null) {
                room = (Room) dataChannel2.gg0(RoomChannel.class);
            }
            C1125170fNz.LIZ(((C1136980fh2) aCListenerS120S0200000_17.l1).LIZ.getContext(), giftMessage, room);
        }
    }

    public static final void onClick$40(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        C1113510f5B c1113510f5B = (C1113510f5B) aCListenerS120S0200000_17.l0;
        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) aCListenerS120S0200000_17.l1;
        c1113510f5B.getClass();
        C1113510f5B.LJIIL(c1113510f5B, abstractC1110800f0o, "", "", 0, "Folded", "negative_page_feed", "more_tag", null, C1113510f5B.LJFF(abstractC1110800f0o).size(), ((C1113510f5B) aCListenerS120S0200000_17.l0).LIZIZ(), null, 1152);
        ((C1113510f5B) aCListenerS120S0200000_17.l0).LJII((AbstractC1110800f0o) aCListenerS120S0200000_17.l1, "", "negative_page_feed");
    }

    public static final void onClick$5(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        int i;
        MatchBottomNoticeCard matchBottomNoticeCard = (MatchBottomNoticeCard) aCListenerS120S0200000_17.l0;
        String str = ((C1145600fuw) aCListenerS120S0200000_17.l1).LJFF;
        matchBottomNoticeCard.getClass();
        if (Intrinsics.LJFF(str, "fan_hammer")) {
            Uri.Builder builderBuildUpon = UriProtector.parse(LiveMatchFanHammerSetting.INSTANCE.getUpgradeGuideSchema()).buildUpon();
            if (!matchBottomNoticeCard.LLJILLL) {
                C973660bRc c973660bRc = C973660bRc.LIZ;
                builderBuildUpon.appendQueryParameter("fans_club_level", String.valueOf(C973660bRc.LJLLILLLL())).appendQueryParameter("fans_club_status", String.valueOf(C973660bRc.LJLLJ()));
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(matchBottomNoticeCard.getContext(), builderBuildUpon.build());
        } else {
            C495520Jby c495520Jby = new C495520Jby(MatchItemCardLynxUrlSetting.INSTANCE.getMatchFaq());
            w.LIZ.getClass();
            c495520Jby.LIZJ("enter_from_merge", w.LJIIIZ());
            c495520Jby.LIZJ("enter_method", w.LJIIL());
            String str2 = "1";
            c495520Jby.LIZJ("is_anchor_in_match_items_region", "1");
            c495520Jby.LIZJ("request_id", w.LJIJI());
            c495520Jby.LIZJ("video_id", w.LJJII());
            if (Intrinsics.LJFF(str, "top2")) {
                i = 3;
            } else {
                i = 2;
            }
            c495520Jby.LIZ(i, "scroll_to_index");
            if (!C970370bMJ.LJIIIIZZ()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c495520Jby.LIZJ("is_team_match", str2);
            c495520Jby.LIZ(C970370bMJ.LIZIZ(), "battle_type");
            c495520Jby.LIZJ("sub_match_type", C915980Zwa.LJFF().my());
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(matchBottomNoticeCard.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
        }
        C973660bRc c973660bRc2 = C973660bRc.LIZ;
        C1144530ftD.LJII(((C1145600fuw) aCListenerS120S0200000_17.l1).LJ);
    }

    public static final void onClick$6(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((Function1) aCListenerS120S0200000_17.l0).invoke(((BaseCommentPinnedWidget) aCListenerS120S0200000_17.l1).LL);
    }

    public static final void onClick$7(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        ((ExtendedScreenFilterWidget) aCListenerS120S0200000_17.l0).y1(view, (RadioButton) aCListenerS120S0200000_17.l1, true);
    }

    public static final void onClick$8(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        InterfaceC752610Tff interfaceC752610TffLIZJ = ((IFrameSlot) aCListenerS120S0200000_17.l0).LIZJ();
        if (interfaceC752610TffLIZJ != null) {
            interfaceC752610TffLIZJ.LIZ(view, "during_live");
        } else {
            if (TextUtils.isEmpty(((IFrameSlot) aCListenerS120S0200000_17.l0).getScheme())) {
                return;
            }
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openLiveBrowser(((IFrameSlot) aCListenerS120S0200000_17.l0).getScheme(), new Bundle(), ((FreeFrameSlotWidget) aCListenerS120S0200000_17.l1).getContext());
        }
    }

    public static final void onClick$9(ACListenerS120S0200000_17 aCListenerS120S0200000_17, View view) {
        InterfaceC752610Tff interfaceC752610TffLIZJ = ((IFrameSlot) aCListenerS120S0200000_17.l0).LIZJ();
        if (interfaceC752610TffLIZJ != null) {
            interfaceC752610TffLIZJ.LIZ(((FrameL2SlotWidget) ((AObserverS181S0200000_17) aCListenerS120S0200000_17.l1).l1).LLILLL, "during_live");
        } else {
            if (TextUtils.isEmpty(((IFrameSlot) aCListenerS120S0200000_17.l0).getScheme())) {
                return;
            }
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openLiveBrowser(((IFrameSlot) aCListenerS120S0200000_17.l0).getScheme(), new Bundle(), ((FrameL2SlotWidget) ((AObserverS181S0200000_17) aCListenerS120S0200000_17.l1).l1).getContext());
        }
    }

    public ACListenerS120S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS120S0200000_17(C1113510f5B c1113510f5B, C1113510f5B c1113510f5B2, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, C1109770ez9 c1109770ez9) {
        this.$t = c1109770ez9;
        this.l0 = c1113510f5B;
        this.l1 = c1113510f5B2;
    }
}
