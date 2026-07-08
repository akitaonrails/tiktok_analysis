package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.ChangeLayoutForFloatPanelOnlyForLiveShow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.CountDownNormalEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.CountdownFanTicketEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.end.GuestShowdownEndDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank.GuestShowdownRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownIdleSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.tag.PlaybookEditorAddTagDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience.LiveShowAudienceViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowBeginStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowMaskOrderEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderSelectChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.guest.GuestTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.giftlimitnotification.LiveGiftReminderFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLiveShowTransitionDurationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.edit.EditFundraiserPageFragment;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.edit.EditFundraiserPageViewModel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentFilterKeywordsPageV2;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01zK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C513601zK implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
            case 44:
                onChanged$44(this, obj);
                break;
            case 45:
                onChanged$45(this, obj);
                break;
            case 46:
                onChanged$46(this, obj);
                break;
            case 47:
                onChanged$47(this, obj);
                break;
            case 48:
                onChanged$48(this, obj);
                break;
            case 49:
                onChanged$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onChanged$50(this, obj);
                break;
            case 51:
                onChanged$51(this, obj);
                break;
            case 52:
                onChanged$52(this, obj);
                break;
            case 53:
                onChanged$53(this, obj);
                break;
            case 54:
                onChanged$54(this, obj);
                break;
            case 55:
                onChanged$55(this, obj);
                break;
            case 56:
                onChanged$56(this, obj);
                break;
            case 57:
                onChanged$57(this, obj);
                break;
            case 58:
                onChanged$58(this, obj);
                break;
        }
    }

    public C513601zK(View view, int i) {
        this.$t = i;
        switch (i) {
            case 42:
            case 43:
            case 51:
                this.l0 = view;
                break;
            default:
                this.l0 = view;
                break;
        }
    }

    public static final void onChanged$0(C513601zK c513601zK, Object obj) {
        boolean zLJIIJ;
        DataChannel dataChannel = ((C310701Ij) c513601zK.l0).LIZ;
        if (dataChannel != null) {
            EnumC936960aUQ enumC936960aUQLIZ = C936970aUR.LIZ("count_down_for_all");
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                ((C310701Ij) c513601zK.l0).getClass();
                zLJIIJ = interfaceC941720ac6LIZIZ.LJIIJ("count_down_for_all");
            } else {
                zLJIIJ = false;
            }
            dataChannel.LC0(ToolsTypeStateUpdateEvent.class, new C935490aS3(enumC936960aUQLIZ, zLJIIJ));
        }
    }

    public static final void onChanged$1(C513601zK c513601zK, Object obj) {
        C01E9 c01e9LJIIJJI;
        C299601Ec c299601Ec = (C299601Ec) obj;
        if (c299601Ec != null) {
            C1AZW c1azw = C1AZW.LIZ;
            String strA1 = ((BaseVmWidget) c513601zK.l0).A1();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("latestUserCountdownObserver countdownUser = ");
            sbLIZ.append(c299601Ec);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ(strA1, strLIZIZ, null, null);
            int i = C01EC.LIZ[c299601Ec.LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        BaseVmWidget baseVmWidget = (BaseVmWidget) c513601zK.l0;
                        baseVmWidget.getClass();
                        String strA12 = baseVmWidget.A1();
                        c1azw.getClass();
                        C1AZW.LIZ(strA12, "widget call onStateFinish", null, null);
                        DialogC423101kj dialogC423101kj = baseVmWidget.LLILLL;
                        if (dialogC423101kj != null) {
                            dialogC423101kj.dismiss();
                            C785410UrT.LIZ(dialogC423101kj);
                        }
                        if (c299601Ec.LJII > 0) {
                            InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
                            if (interfaceC421301kRLIZIZ != null && (c01e9LJIIJJI = interfaceC421301kRLIZIZ.LJIIJJI(c299601Ec.LIZJ)) != null) {
                                baseVmWidget.dataChannel.LC0(CountdownFanTicketEvent.class, c01e9LJIIJJI);
                            } else {
                                return;
                            }
                        }
                        baseVmWidget.dataChannel.LC0(CountDownNormalEndEvent.class, new C422201ka(c299601Ec.LIZJ));
                        return;
                    }
                    throw new C1954807lC();
                }
                ((BaseVmWidget) c513601zK.l0).C1(c299601Ec);
                return;
            }
            ((BaseVmWidget) c513601zK.l0).B1(c299601Ec);
        }
    }

    public static final void onChanged$10(C513601zK c513601zK, Object obj) {
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("Editor_PlaybookEditorDialog", "Primary tag changed", null, null);
        ((PlaybookEditorAddTagDialog) c513601zK.l0).BS();
    }

    public static final void onChanged$11(C513601zK c513601zK, Object obj) {
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("Editor_PlaybookEditorDialog", "Secondary tag changed", null, null);
        ((PlaybookEditorAddTagDialog) c513601zK.l0).BS();
    }

    public static final void onChanged$12(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        List list = (List) obj;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            if (list != null && list.isEmpty()) {
                ((LiveShowAnchorWidget) c513601zK.l0).I1();
            }
            LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) c513601zK.l0;
            liveShowAnchorWidget.P1(new C020Y(liveShowAnchorWidget, (LiveShowAnchorWidget) list, (List<? extends LinkPlayerInfo>) 9));
            return;
        }
        LiveShowAnchorWidget liveShowAnchorWidget2 = (LiveShowAnchorWidget) c513601zK.l0;
        liveShowAnchorWidget2.P1(new C020Y(liveShowAnchorWidget2, (LiveShowAnchorWidget) list, (List<? extends LinkPlayerInfo>) 10));
    }

    public static final void onChanged$13(C513601zK c513601zK, Object obj) {
        boolean z;
        DialogC430701lx dialogC430701lx;
        LiveShowAnchorWidget liveShowAnchorWidget;
        C01HJ c01hj;
        List<LinkPlayerInfo> value;
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData;
        long j;
        ShowConfig showConfig = (ShowConfig) obj;
        C01HJ c01hj2 = ((LiveShowAnchorWidget) c513601zK.l0).LLJJJJ;
        if (c01hj2 != null) {
            if (showConfig != null) {
                j = showConfig.durationPerGuest;
            } else {
                j = 300;
            }
            c01hj2.LLJJJ = Long.valueOf(j);
        }
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        boolean z2 = true;
        if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIL() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (z && (c01hj = (liveShowAnchorWidget = (LiveShowAnchorWidget) c513601zK.l0).LLJJJJ) != null) {
            MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) liveShowAnchorWidget.LLILLJJLI;
            if (midLiveShowViewModel != null && (mutableLiveData = midLiveShowViewModel.LLJILJIL) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            c01hj.LJLJJL(value, true);
        }
        C01HJ c01hj3 = ((LiveShowAnchorWidget) c513601zK.l0).LLJJJJ;
        if (c01hj3 != null) {
            if (showConfig == null) {
                z2 = false;
            }
            C16FS c16fs = c01hj3.LLJJL;
            if (c16fs != null) {
                c16fs.setEnabled(z2);
            }
        }
        if (showConfig != null && (dialogC430701lx = ((LiveShowAnchorWidget) c513601zK.l0).LLJJJIL) != null) {
            dialogC430701lx.LJLJI(showConfig);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigChanged : ");
        if (showConfig != null) {
            lValueOf = Long.valueOf(showConfig.transitionDurationOfConfig);
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LIZIZ("hhh", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$14(C513601zK c513601zK, Object obj) {
        MutableLiveData<C01H9> mutableLiveData;
        String string;
        ShowContent content;
        String string2;
        ShowContent content2;
        ShowConfig showConfig;
        ShowContent content3;
        ShowConfig showConfig2;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        int iIntValue = ((Number) obj).intValue();
        C01HJ c01hj = ((LiveShowAnchorWidget) c513601zK.l0).LLJJJJ;
        if (c01hj != null) {
            c01hj.LJLILLLLZI(iIntValue);
        }
        C01H9 value = null;
        layoutBusinessType = null;
        String layoutBusinessType = null;
        value = null;
        int i = 1;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    ((LiveShowAnchorWidget) c513601zK.l0).I1();
                    ((LiveShowAnchorWidget) c513601zK.l0).D1();
                    ((LiveShowAnchorWidget) c513601zK.l0).LLJZIJLIL.getValue().LIZJ(((LiveShowAnchorWidget) c513601zK.l0).LLJLL);
                    T t = ((LiveShowAnchorWidget) c513601zK.l0).LLILLJJLI;
                    if (t != 0) {
                        t.vQ2();
                    }
                    ((LiveShowAnchorWidget) c513601zK.l0).dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(false, null));
                    ((LiveShowAnchorWidget) c513601zK.l0).E1(5, null, null, null, false);
                    C306901Gx.LJIILIIL();
                    return;
                }
                return;
            }
            if (MultiGuestLiveShowTransitionDurationSetting.INSTANCE.isAnchorEnableTransition()) {
                InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
                if (interfaceC937900aVwLJIIIIZZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) != null) {
                    layoutBusinessType = interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
                }
                if (Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT.getBusinessType()) && C01HA.LJI()) {
                    LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) c513601zK.l0;
                    DataChannel dataChannel = liveShowAnchorWidget.dataChannel;
                    C304201Fw c304201Fw = liveShowAnchorWidget.LLJILLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BaseLiveShowWidget.LLJJIJIIJIL;
                    InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
                    C918060Zzw.LIZ.getClass();
                    if (!C918060Zzw.LIZ(true)) {
                        String str = C925150aBN.LJIIIIZZ;
                        if (dataChannel != null) {
                            dataChannel.LC0(ChangeLayoutForFloatPanelOnlyForLiveShow.class, new Pair(str, new C5182020e(interfaceC927510aFB, 279)));
                        }
                    }
                }
            }
            C306901Gx.LJIIJJI = System.currentTimeMillis();
            Map mapLIZJ = C306901Gx.LIZJ();
            mapLIZJ.put("guest_cnt", String.valueOf(C306901Gx.LJ()));
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            String str2 = "";
            if (interfaceC302601FgLIZ == null || (content3 = interfaceC302601FgLIZ.getContent()) == null || (showConfig2 = content3.showConfig) == null || (string = Long.valueOf(showConfig2.durationPerGuest).toString()) == null) {
                string = "";
            }
            mapLIZJ.put("show_duration_per_guest", string);
            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ2 == null || (content2 = interfaceC302601FgLIZ2.getContent()) == null || (showConfig = content2.showConfig) == null || !showConfig.allowOpenMicFreely) {
                i = 0;
            }
            mapLIZJ.put("is_guest_mic_open", String.valueOf(i));
            InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ3 != null && (content = interfaceC302601FgLIZ3.getContent()) != null && (string2 = Long.valueOf(content.showId).toString()) != null) {
                str2 = string2;
            }
            mapLIZJ.put("multiguest_liveshow_id", str2);
            C306901Gx.LJIL("livesdk_anchor_multiguest_liveshow_start", mapLIZJ);
            return;
        }
        ((LiveShowAnchorWidget) c513601zK.l0).dataChannel.LC0(LiveShowBeginStatusEvent.class, Unit.LIZ);
        if (!C923340a8S.LIZIZ()) {
            ((LiveShowAnchorWidget) c513601zK.l0).I1();
        }
        ((LiveShowAnchorWidget) c513601zK.l0).LLJZIJLIL.getValue().LIZLLL();
        InterfaceC934710aQn.Rb.LJFF(Boolean.TRUE);
        LiveShowAnchorWidget liveShowAnchorWidget2 = (LiveShowAnchorWidget) c513601zK.l0;
        DataChannel dataChannel2 = liveShowAnchorWidget2.dataChannel;
        T t2 = liveShowAnchorWidget2.LLILLJJLI;
        if (t2 != 0 && (mutableLiveData = t2.LLILLJJLI) != null) {
            value = mutableLiveData.getValue();
        }
        dataChannel2.zW(LiveShowMaskOrderEvent.class, new C01H3(true, value));
        ((LiveShowAnchorWidget) c513601zK.l0).B1();
        ((LiveShowAnchorWidget) c513601zK.l0).H1();
        T t3 = ((LiveShowAnchorWidget) c513601zK.l0).LLILLJJLI;
        if (t3 != 0) {
            t3.xQ2(MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().startAnimationDuration);
        }
        T t4 = ((LiveShowAnchorWidget) c513601zK.l0).LLILLJJLI;
        if (t4 == 0) {
            return;
        }
        t4.yQ2(MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().startAnimationDuration);
    }

    public static final void onChanged$15(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        MutableLiveData<C01H9> mutableLiveData;
        C01H9 c01h9 = (C01H9) obj;
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        C01H9 value = null;
        if (interfaceC302601FgLIZ2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ2.LJIJI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) c513601zK.l0;
            liveShowAnchorWidget.P1(new C020Y(liveShowAnchorWidget, c01h9, 11));
            InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
            boolean z = true;
            if ((interfaceC302601FgLIZ3 == null || interfaceC302601FgLIZ3.LJIIL() != 2) && ((interfaceC302601FgLIZ = C01FQ.LIZ()) == null || interfaceC302601FgLIZ.LJIIL() != 1)) {
                z = false;
            }
            LiveShowAnchorWidget liveShowAnchorWidget2 = (LiveShowAnchorWidget) c513601zK.l0;
            DataChannel dataChannel = liveShowAnchorWidget2.dataChannel;
            T t = liveShowAnchorWidget2.LLILLJJLI;
            if (t != 0 && (mutableLiveData = t.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            }
            dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(z, value));
        }
    }

    public static final void onChanged$16(C513601zK c513601zK, Object obj) {
        C01H9 value;
        MutableLiveData<C01H9> mutableLiveData;
        C01HL c01hl;
        List<? extends LinkPlayerInfo> list = (List) obj;
        if (list == null) {
            C01HL c01hl2 = ((LiveShowAudienceWidget) c513601zK.l0).LLJJJ;
            if (c01hl2 != null) {
                C500260Jjc.LJJLIIIJL(c01hl2);
                return;
            }
            return;
        }
        if (list.isEmpty() && (c01hl = ((LiveShowAudienceWidget) c513601zK.l0).LLJJJ) != null) {
            C500260Jjc.LJJLIIIJL(c01hl);
        }
        LiveShowAudienceWidget liveShowAudienceWidget = (LiveShowAudienceWidget) c513601zK.l0;
        C01HL c01hl3 = liveShowAudienceWidget.LLJJJ;
        if (c01hl3 == null) {
            return;
        }
        c01hl3.LLJJIJIIJIL = list;
        T t = liveShowAudienceWidget.LLILLJJLI;
        if (t != 0 && (mutableLiveData = t.LLILLJJLI) != null) {
            value = mutableLiveData.getValue();
        } else {
            value = null;
        }
        c01hl3.LJLIIIL(value);
    }

    public static final void onChanged$17(C513601zK c513601zK, Object obj) {
        if (C500260Jjc.LJJJI(Boolean.valueOf(((Boolean) obj).booleanValue()))) {
            C20441214yg.LIZIZ("LiveShowAudienceWidget", "liveShowEndWhenAnchorResumeLive");
            C306901Gx.LJIJ();
            C01HL c01hl = ((LiveShowAudienceWidget) c513601zK.l0).LLJJJ;
            if (c01hl != null) {
                C500260Jjc.LJJLIIIJL(c01hl);
            }
            ((LiveShowAudienceWidget) c513601zK.l0).D1();
            ((LiveShowAudienceWidget) c513601zK.l0).dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(false, null));
            ((LiveShowAudienceWidget) c513601zK.l0).E1(5, null, null, null, false);
        }
    }

    public static final void onChanged$18(C513601zK c513601zK, Object obj) {
        MutableLiveData<C01H9> mutableLiveData;
        int iIntValue = ((Number) obj).intValue();
        C01H9 value = null;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    C306901Gx.LJIJ();
                    C01HL c01hl = ((LiveShowAudienceWidget) c513601zK.l0).LLJJJ;
                    if (c01hl != null) {
                        C500260Jjc.LJJLIIIJL(c01hl);
                    }
                    ((LiveShowAudienceWidget) c513601zK.l0).LLJJLIIIJLLLLLLLZ.getValue().LIZJ(((LiveShowAudienceWidget) c513601zK.l0).LLJL);
                    T t = ((LiveShowAudienceWidget) c513601zK.l0).LLILLJJLI;
                    if (t != 0) {
                        t.vQ2();
                    }
                    ((LiveShowAudienceWidget) c513601zK.l0).D1();
                    ((LiveShowAudienceWidget) c513601zK.l0).dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(false, null));
                    ((LiveShowAudienceWidget) c513601zK.l0).E1(5, null, null, null, false);
                }
            } else {
                C306901Gx.LJIJI();
            }
        } else {
            ((LiveShowAudienceWidget) c513601zK.l0).dataChannel.LC0(LiveShowBeginStatusEvent.class, Unit.LIZ);
            C01HL c01hl2 = ((LiveShowAudienceWidget) c513601zK.l0).LLJJJ;
            if (c01hl2 != null) {
                C500260Jjc.LJJLIIIJL(c01hl2);
            }
            ((LiveShowAudienceWidget) c513601zK.l0).LLJJLIIIJLLLLLLLZ.getValue().LIZLLL();
            LiveShowAudienceWidget liveShowAudienceWidget = (LiveShowAudienceWidget) c513601zK.l0;
            DataChannel dataChannel = liveShowAudienceWidget.dataChannel;
            T t2 = liveShowAudienceWidget.LLILLJJLI;
            if (t2 != 0 && (mutableLiveData = t2.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            }
            dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(true, value));
            ((LiveShowAudienceWidget) c513601zK.l0).B1();
            ((LiveShowAudienceWidget) c513601zK.l0).H1();
        }
        C306901Gx.LJII = iIntValue;
    }

    public static final void onChanged$19(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        MutableLiveData<C01H9> mutableLiveData;
        C01H9 c01h9 = (C01H9) obj;
        if (c01h9 != null) {
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            C01H9 value = null;
            if (interfaceC302601FgLIZ != null) {
                boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C01HL c01hl = ((LiveShowAudienceWidget) c513601zK.l0).LLJJJ;
                boolean z = false;
                if (c01hl != null && c01hl.isShowing()) {
                    if (c01h9.LIZLLL) {
                        final LiveShowAudienceWidget liveShowAudienceWidget = (LiveShowAudienceWidget) c513601zK.l0;
                        LiveShowAudienceViewModel liveShowAudienceViewModel = (LiveShowAudienceViewModel) liveShowAudienceWidget.LLILLJJLI;
                        if (liveShowAudienceViewModel != null) {
                            liveShowAudienceViewModel.HQ2(new InterfaceC302801Fi() { // from class: X.01Gr
                                @Override // X.InterfaceC302801Fi
                                public final void LIZIZ() {
                                }

                                @Override // X.InterfaceC302801Fi
                                public final void LIZ(C01H9 c01h92) {
                                    C01HL c01hl2 = liveShowAudienceWidget.LLJJJ;
                                    if (c01hl2 != null) {
                                        c01hl2.LJLIIIL(c01h92);
                                    }
                                }
                            });
                        }
                    } else {
                        C01HL c01hl2 = ((LiveShowAudienceWidget) c513601zK.l0).LLJJJ;
                        if (c01hl2 != null) {
                            c01hl2.LJLIIIL(c01h9);
                        }
                    }
                }
                InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
                if (interfaceC302601FgLIZ2 != null && interfaceC302601FgLIZ2.LJIIL() == 3) {
                    z = true;
                }
                boolean z2 = !z;
                LiveShowAudienceWidget liveShowAudienceWidget2 = (LiveShowAudienceWidget) c513601zK.l0;
                DataChannel dataChannel = liveShowAudienceWidget2.dataChannel;
                T t = liveShowAudienceWidget2.LLILLJJLI;
                if (t != 0 && (mutableLiveData = t.LLILLJJLI) != null) {
                    value = mutableLiveData.getValue();
                }
                dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(z2, value));
            }
        }
    }

    public static final void onChanged$2(C513601zK c513601zK, Object obj) {
        if (obj != null) {
            ((BaseVmWidget) c513601zK.l0).dataChannel.LC0(CountdownFanTicketEvent.class, obj);
            C1AZW c1azw = C1AZW.LIZ;
            String strA1 = ((BaseVmWidget) c513601zK.l0).A1();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("userFanTicketObserver = ");
            sbLIZ.append(obj);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ(strA1, strLIZIZ, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.11Lx, webcast.data.multi_guest_play.ShowListUser] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$20(X.C513601zK r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513601zK.onChanged$20(X.01zK, java.lang.Object):void");
    }

    public static final void onChanged$21(C513601zK c513601zK, Object obj) {
        ShowListUser showListUserLJIILL;
        ShowListUser showListUserLJIILLIIL;
        Integer numValueOf;
        String string;
        Long lLJII;
        ShowContent showContent = (ShowContent) obj;
        String str = null;
        if (showContent != null && showContent.transitionInfo != null) {
            List<ShowListUser> list = showContent.finishedList;
            BaseLiveShowWidget baseLiveShowWidget = (BaseLiveShowWidget) c513601zK.l0;
            Iterator<ShowListUser> it2 = list.iterator();
            while (it2.hasNext()) {
                baseLiveShowWidget.C1(it2.next().linkmicIdStr);
            }
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null) {
                showListUserLJIILL = interfaceC302601FgLIZ.LJIILL();
            } else {
                showListUserLJIILL = null;
            }
            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ2 != null) {
                showListUserLJIILLIIL = interfaceC302601FgLIZ2.LJIILLIIL();
            } else {
                showListUserLJIILLIIL = null;
            }
            BaseLiveShowWidget baseLiveShowWidget2 = (BaseLiveShowWidget) c513601zK.l0;
            C01HA.LJIIIZ(baseLiveShowWidget2.LLJIJIL, baseLiveShowWidget2.LLILLJJLI);
            BaseLiveShowWidget baseLiveShowWidget3 = (BaseLiveShowWidget) c513601zK.l0;
            if (showListUserLJIILLIIL != null) {
                numValueOf = Integer.valueOf(showListUserLJIILLIIL.order);
                str = showListUserLJIILLIIL.nickname;
            } else {
                numValueOf = null;
            }
            baseLiveShowWidget3.E1(3, numValueOf, str, showListUserLJIILLIIL, false);
            if (C01HE.LJ() == C01FV.ANCHOR && showListUserLJIILLIIL != null && showListUserLJIILL != null) {
                String strValueOf = String.valueOf(showListUserLJIILLIIL.userId);
                String strValueOf2 = String.valueOf(showListUserLJIILL.userId);
                Map mapLIZ = C306901Gx.LIZ();
                InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
                if (interfaceC302601FgLIZ3 == null || (lLJII = interfaceC302601FgLIZ3.LJII()) == null || (string = lLJII.toString()) == null) {
                    string = "";
                }
                mapLIZ.put("multiguest_liveshow_id", string);
                mapLIZ.put("next_uid", strValueOf);
                mapLIZ.put("last_uid", strValueOf2);
                C306901Gx.LJIL("livesdk_mg_anchor_liveshow_interval_onstage_start", mapLIZ);
            }
        }
    }

    public static final void onChanged$22(C513601zK c513601zK, Object obj) {
        C01H9 value;
        MutableLiveData<C01H9> mutableLiveData;
        C01HL c01hl;
        List<? extends LinkPlayerInfo> list = (List) obj;
        if (list != null && list.isEmpty() && (c01hl = ((LiveShowGuestWidget) c513601zK.l0).LLJJJ) != null) {
            C500260Jjc.LJJLIIIJL(c01hl);
        }
        LiveShowGuestWidget liveShowGuestWidget = (LiveShowGuestWidget) c513601zK.l0;
        C01HL c01hl2 = liveShowGuestWidget.LLJJJ;
        if (c01hl2 != null) {
            c01hl2.LLJJIJIIJIL = list;
            T t = liveShowGuestWidget.LLILLJJLI;
            if (t != 0 && (mutableLiveData = t.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            c01hl2.LJLIIIL(value);
        }
    }

    public static final void onChanged$23(C513601zK c513601zK, Object obj) {
        MutableLiveData<C01H9> mutableLiveData;
        int iIntValue = ((Number) obj).intValue();
        C01H9 value = null;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    C01HL c01hl = ((LiveShowGuestWidget) c513601zK.l0).LLJJJ;
                    if (c01hl != null) {
                        C500260Jjc.LJJLIIIJL(c01hl);
                    }
                    ((LiveShowGuestWidget) c513601zK.l0).D1();
                    ((LiveShowGuestWidget) c513601zK.l0).LLJJLIIIJLLLLLLLZ.getValue().LIZJ(((LiveShowGuestWidget) c513601zK.l0).LLJL);
                    T t = ((LiveShowGuestWidget) c513601zK.l0).LLILLJJLI;
                    if (t != 0) {
                        t.vQ2();
                    }
                    ((LiveShowGuestWidget) c513601zK.l0).dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(false, null));
                    ((LiveShowGuestWidget) c513601zK.l0).E1(5, null, null, null, false);
                    C306901Gx.LJIJ();
                    if (C306901Gx.LIZLLL) {
                        C306901Gx.LJIILL();
                    }
                }
            } else {
                LiveShowGuestWidget liveShowGuestWidget = (LiveShowGuestWidget) c513601zK.l0;
                if (liveShowGuestWidget.LLJJJIL) {
                    LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) liveShowGuestWidget.LLILLJJLI;
                    if (liveShowGuestViewModel != null) {
                        liveShowGuestViewModel.HQ2(true);
                    }
                    ((LiveShowGuestWidget) c513601zK.l0).LLJJJIL = false;
                }
                C306901Gx.LJIJI();
            }
        } else {
            LiveShowGuestWidget liveShowGuestWidget2 = (LiveShowGuestWidget) c513601zK.l0;
            if (liveShowGuestWidget2.LLJJJIL) {
                LiveShowGuestViewModel liveShowGuestViewModel2 = (LiveShowGuestViewModel) liveShowGuestWidget2.LLILLJJLI;
                if (liveShowGuestViewModel2 != null) {
                    liveShowGuestViewModel2.HQ2(true);
                }
                ((LiveShowGuestWidget) c513601zK.l0).LLJJJIL = false;
            }
            ((LiveShowGuestWidget) c513601zK.l0).dataChannel.LC0(LiveShowBeginStatusEvent.class, Unit.LIZ);
            C01HL c01hl2 = ((LiveShowGuestWidget) c513601zK.l0).LLJJJ;
            if (c01hl2 != null) {
                C500260Jjc.LJJLIIIJL(c01hl2);
            }
            ((LiveShowGuestWidget) c513601zK.l0).LLJJLIIIJLLLLLLLZ.getValue().LIZLLL();
            LiveShowGuestWidget liveShowGuestWidget3 = (LiveShowGuestWidget) c513601zK.l0;
            DataChannel dataChannel = liveShowGuestWidget3.dataChannel;
            T t2 = liveShowGuestWidget3.LLILLJJLI;
            if (t2 != 0 && (mutableLiveData = t2.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            }
            dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(true, value));
            ((LiveShowGuestWidget) c513601zK.l0).B1();
            ((LiveShowGuestWidget) c513601zK.l0).H1();
            T t3 = ((LiveShowGuestWidget) c513601zK.l0).LLILLJJLI;
            if (t3 != 0) {
                t3.yQ2(MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().startAnimationDuration);
            }
        }
        C306901Gx.LJII = iIntValue;
    }

    public static final void onChanged$24(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        MutableLiveData<C01H9> mutableLiveData;
        C01H9 c01h9 = (C01H9) obj;
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        C01H9 value = null;
        if (interfaceC302601FgLIZ2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ2.LJIJI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C01HL c01hl = ((LiveShowGuestWidget) c513601zK.l0).LLJJJ;
            if (c01hl != null) {
                c01hl.LJLIIIL(c01h9);
            }
            InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
            boolean z = true;
            if ((interfaceC302601FgLIZ3 == null || interfaceC302601FgLIZ3.LJIIL() != 2) && ((interfaceC302601FgLIZ = C01FQ.LIZ()) == null || interfaceC302601FgLIZ.LJIIL() != 1)) {
                z = false;
            }
            LiveShowGuestWidget liveShowGuestWidget = (LiveShowGuestWidget) c513601zK.l0;
            DataChannel dataChannel = liveShowGuestWidget.dataChannel;
            T t = liveShowGuestWidget.LLILLJJLI;
            if (t != 0 && (mutableLiveData = t.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            }
            dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(z, value));
        }
    }

    public static final void onChanged$25(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        List list = (List) obj;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            if (list != null && list.isEmpty()) {
                ((LiveShowModeratorWidget) c513601zK.l0).x1();
            }
            LiveShowModeratorWidget liveShowModeratorWidget = (LiveShowModeratorWidget) c513601zK.l0;
            liveShowModeratorWidget.z1(new C020Y(liveShowModeratorWidget, (LiveShowModeratorWidget) list, (List<? extends LinkPlayerInfo>) 15));
            return;
        }
        LiveShowModeratorWidget liveShowModeratorWidget2 = (LiveShowModeratorWidget) c513601zK.l0;
        liveShowModeratorWidget2.z1(new C020Y(liveShowModeratorWidget2, (LiveShowModeratorWidget) list, (List<? extends LinkPlayerInfo>) 16));
    }

    public static final void onChanged$26(C513601zK c513601zK, Object obj) {
        boolean z;
        DialogC430701lx dialogC430701lx;
        LiveShowModeratorWidget liveShowModeratorWidget;
        C01HJ c01hj;
        List<LinkPlayerInfo> value;
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData;
        long j;
        ShowConfig showConfig = (ShowConfig) obj;
        C01HJ c01hj2 = ((LiveShowModeratorWidget) c513601zK.l0).LLILZ;
        if (c01hj2 != null) {
            if (showConfig != null) {
                j = showConfig.durationPerGuest;
            } else {
                j = 300;
            }
            c01hj2.LLJJJ = Long.valueOf(j);
        }
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        boolean z2 = true;
        if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIL() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (z && (c01hj = (liveShowModeratorWidget = (LiveShowModeratorWidget) c513601zK.l0).LLILZ) != null) {
            LiveShowModeratorViewModel liveShowModeratorViewModel = liveShowModeratorWidget.LL;
            if (liveShowModeratorViewModel != null && (mutableLiveData = liveShowModeratorViewModel.LLJILJIL) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            c01hj.LJLJJL(value, true);
        }
        C01HJ c01hj3 = ((LiveShowModeratorWidget) c513601zK.l0).LLILZ;
        if (c01hj3 != null) {
            if (showConfig == null) {
                z2 = false;
            }
            C16FS c16fs = c01hj3.LLJJL;
            if (c16fs != null) {
                c16fs.setEnabled(z2);
            }
        }
        if (showConfig != null && (dialogC430701lx = ((LiveShowModeratorWidget) c513601zK.l0).LLILLL) != null) {
            dialogC430701lx.LJLJI(showConfig);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigChanged : ");
        if (showConfig != null) {
            lValueOf = Long.valueOf(showConfig.transitionDurationOfConfig);
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LIZIZ("hhh", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$27(C513601zK c513601zK, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C01HJ c01hj = ((LiveShowModeratorWidget) c513601zK.l0).LLILZ;
        if (c01hj != null) {
            c01hj.LJLILLLLZI(iIntValue);
        }
        if (iIntValue != 1) {
            if (iIntValue == 3) {
                ((LiveShowModeratorWidget) c513601zK.l0).x1();
                C306901Gx.LJIILIIL();
                return;
            }
            return;
        }
        ((LiveShowModeratorWidget) c513601zK.l0).x1();
    }

    public static final void onChanged$28(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        MutableLiveData<C01H9> mutableLiveData;
        C01H9 c01h9 = (C01H9) obj;
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        C01H9 value = null;
        if (interfaceC302601FgLIZ2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ2.LJIJI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LiveShowModeratorWidget liveShowModeratorWidget = (LiveShowModeratorWidget) c513601zK.l0;
            liveShowModeratorWidget.z1(new C020Y(liveShowModeratorWidget, c01h9, 17));
            InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
            boolean z = true;
            if ((interfaceC302601FgLIZ3 == null || interfaceC302601FgLIZ3.LJIIL() != 2) && ((interfaceC302601FgLIZ = C01FQ.LIZ()) == null || interfaceC302601FgLIZ.LJIIL() != 1)) {
                z = false;
            }
            LiveShowModeratorWidget liveShowModeratorWidget2 = (LiveShowModeratorWidget) c513601zK.l0;
            DataChannel dataChannel = liveShowModeratorWidget2.dataChannel;
            LiveShowModeratorViewModel liveShowModeratorViewModel = liveShowModeratorWidget2.LL;
            if (liveShowModeratorViewModel != null && (mutableLiveData = liveShowModeratorViewModel.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            }
            dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(z, value));
        }
    }

    public static final void onChanged$29(C513601zK c513601zK, Object obj) {
        String strX1 = ((BaseTextHeaderWidget) c513601zK.l0).x1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordInfo=");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ(strX1, C2188811AlT.LIZIZ(sbLIZ));
        BaseTextHeaderWidget baseTextHeaderWidget = (BaseTextHeaderWidget) c513601zK.l0;
        baseTextHeaderWidget.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onRunningRecordInfoChange recordInfo:");
        sbLIZ2.append(obj);
        C20441214yg.LIZIZ(baseTextHeaderWidget.x1(), C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void onChanged$3(C513601zK c513601zK, Object obj) throws JSONException {
        Integer numValueOf;
        Boolean boolValueOf;
        GuestShowdownEndDialog guestShowdownEndDialog;
        GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog;
        int size;
        List list = (List) obj;
        ((GuestShowdownAnchorWidget) c513601zK.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("listSize: ");
        Boolean boolValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("GuestShowdownAnchorWidget", C2188811AlT.LIZIZ(sbLIZ));
        int size2 = 0;
        if (C01ZC.LIZIZ()) {
            Object value = ((GuestShowdownAnchorWidget) c513601zK.l0).LLJJ.getValue();
            if (list != null) {
                size2 = list.size();
            }
            value.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("guest_cnt", size2);
            C389001fE.LIZ("notify_guest_cnt_change", jSONObject, System.currentTimeMillis(), false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sendGuestCountChangeEvent, params: ");
            sbLIZ2.append(jSONObject);
            C20441214yg.LJIIIZ("GuestShowdownJsbEventHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog2 = ((GuestShowdownAnchorWidget) c513601zK.l0).LLJILJIL;
        if (guestShowdownIdleSettingsDialog2 != null) {
            boolValueOf = Boolean.valueOf(guestShowdownIdleSettingsDialog2.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (guestShowdownIdleSettingsDialog = ((GuestShowdownAnchorWidget) c513601zK.l0).LLJILJIL) != null) {
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            guestShowdownIdleSettingsDialog.wS(size);
        }
        GuestShowdownEndDialog guestShowdownEndDialog2 = ((GuestShowdownAnchorWidget) c513601zK.l0).LLILLJJLI;
        if (guestShowdownEndDialog2 != null) {
            boolValueOf2 = Boolean.valueOf(guestShowdownEndDialog2.isVisible());
        }
        if (!C500260Jjc.LJJJI(boolValueOf2) || (guestShowdownEndDialog = ((GuestShowdownAnchorWidget) c513601zK.l0).LLILLJJLI) == null) {
            return;
        }
        if (list != null) {
            size2 = list.size();
        }
        guestShowdownEndDialog.wS(size2);
    }

    public static final void onChanged$30(C513601zK c513601zK, Object obj) {
        String strX1 = ((BaseTextHeaderWidget) c513601zK.l0).x1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordInfo=");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ(strX1, C2188811AlT.LIZIZ(sbLIZ));
        BaseTextHeaderWidget baseTextHeaderWidget = (BaseTextHeaderWidget) c513601zK.l0;
        baseTextHeaderWidget.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onSelectedRecordInfoChange recordInfo:");
        sbLIZ2.append(obj);
        C20441214yg.LIZIZ(baseTextHeaderWidget.x1(), C2188811AlT.LIZIZ(sbLIZ2));
        DataChannel dataChannel = baseTextHeaderWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(TextHeaderSelectChangeEvent.class);
        }
    }

    public static final void onChanged$31(C513601zK c513601zK, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        String strX1 = ((BaseTextHeaderWidget) c513601zK.l0).x1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status=");
        sbLIZ.append(iIntValue);
        C20441214yg.LIZIZ(strX1, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$32(C513601zK c513601zK, Object obj) {
        String strX1 = ((BaseTextHeaderWidget) c513601zK.l0).x1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("headerId=");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ(strX1, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$33(C513601zK c513601zK, Object obj) {
        C01ZA c01za = (C01ZA) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("curRunningRecordInfo onChanged:");
        sbLIZ.append(c01za);
        sbLIZ.append(" panelLayoutType:");
        sbLIZ.append(C940770aaZ.LIZ().getDataSource().getPanelLayoutType());
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), ((BaseTextHeaderViewModel) c513601zK.l0).AQ2(), 2);
        ((BaseTextHeaderViewModel) c513601zK.l0).GQ2(c01za, "curRunningRecordInfoValueChange");
    }

    public static final void onChanged$34(C513601zK c513601zK, Object obj) {
        String str;
        C01F5 c01f5;
        C01ZA c01za = (C01ZA) obj;
        if (c01za != null && (c01f5 = c01za.LIZ) != null) {
            str = c01f5.LIZIZ;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            if (C20424314vx.LIZJ(str) != null) {
                ((GuestTextHeaderViewModel) c513601zK.l0).LLJILJILJ = 0;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fontResourceId:");
                sbLIZ.append(str);
                sbLIZ.append(" has load,don't need to load twice");
                C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "GuestTextHeaderViewModel", 2);
                return;
            }
            GuestTextHeaderViewModel guestTextHeaderViewModel = (GuestTextHeaderViewModel) c513601zK.l0;
            int i = guestTextHeaderViewModel.LLJILJILJ;
            if (i >= 3) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fontResourceId:");
                sbLIZ2.append(str);
                sbLIZ2.append(" fetch too much");
                C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "GuestTextHeaderViewModel", 2);
                return;
            }
            guestTextHeaderViewModel.LLJILJILJ = i + 1;
            C19487311Lz.LIZJ(C20424314vx.LIZ(str), null, new C516801zq((GuestTextHeaderViewModel) c513601zK.l0, str, 4), new C515701zf(str, 3), 25);
            return;
        }
        ((GuestTextHeaderViewModel) c513601zK.l0).LLJILJILJ = 0;
    }

    public static final void onChanged$35(C513601zK c513601zK, Object obj) {
        Function1 function1 = (Function1) c513601zK.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
    }

    public static final void onChanged$36(C513601zK c513601zK, Object obj) {
        ((Function1) c513601zK.l0).invoke(obj);
    }

    public static final void onChanged$37(C513601zK c513601zK, Object obj) {
        if (obj != null) {
            ((EditFundraiserPageFragment) c513601zK.l0).LLILLJJLI.getValue().getClass();
        }
    }

    public static final void onChanged$38(C513601zK c513601zK, Object obj) {
        AbstractC1675210th9 abstractC1675210th9 = (AbstractC1675210th9) obj;
        if (abstractC1675210th9 instanceof C01OD) {
            ((EditFundraiserPageViewModel) ((EditFundraiserPageFragment) c513601zK.l0).LLILLJJLI.getValue()).LL.setValue(new AnonymousClass0046(((C01OD) abstractC1675210th9).LIZ));
        }
    }

    public static final void onChanged$39(C513601zK c513601zK, Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != 3) {
            ((Function1) c513601zK.l0).invoke(num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$4(X.C513601zK r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513601zK.onChanged$4(X.01zK, java.lang.Object):void");
    }

    public static final void onChanged$40(C513601zK c513601zK, Object obj) {
        boolean zLJI = MethodIDManager.LJI(202349);
        boolean zLJI2 = MethodIDManager.LJI(202349);
        ((LiveWatchPreviewWidget) c513601zK.l0).C1(((Boolean) obj).booleanValue());
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onChanged$41(C513601zK c513601zK, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        TuxTextView tuxTextView = ((CommentFilterKeywordsPageV2) c513601zK.l0).LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(C786410Ut5.j4(tuxTextView.getContext().getString(2131829049), Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), 500}, 2)));
        }
    }

    public static final void onChanged$42(C513601zK c513601zK, Object obj) {
        Float f = (Float) obj;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) c513601zK.l0).getLayoutParams();
        if (f != null) {
            marginLayoutParams.topMargin = (int) f.floatValue();
            C786410Ut5.W5((View) c513601zK.l0, marginLayoutParams);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final void onChanged$43(C513601zK c513601zK, Object obj) {
        Float f = (Float) obj;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) c513601zK.l0).getLayoutParams();
        if (f != null) {
            marginLayoutParams.topMargin = (int) f.floatValue();
            C786410Ut5.W5((View) c513601zK.l0, marginLayoutParams);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final void onChanged$44(C513601zK c513601zK, Object obj) {
        List<C01ZA> value;
        List<C00UM> value2;
        MutableLiveData<List<C00UM>> mutableLiveData;
        MutableLiveData<List<C01ZA>> mutableLiveData2;
        C01ZA c01za = (C01ZA) obj;
        TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) c513601zK.l0;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = textHeaderListFragment.LL;
        if (anchorTextHeaderViewModel == null || (mutableLiveData2 = anchorTextHeaderViewModel.LLJILJIL) == null || (value = mutableLiveData2.getValue()) == null) {
            value = C13BV.INSTANCE;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = ((TextHeaderListFragment) c513601zK.l0).LL;
        if (anchorTextHeaderViewModel2 == null || (mutableLiveData = anchorTextHeaderViewModel2.LLJILJILJ) == null || (value2 = mutableLiveData.getValue()) == null) {
            value2 = C13BV.INSTANCE;
        }
        textHeaderListFragment.PR(c01za, value, value2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$45(C513601zK c513601zK, Object obj) {
        C01ZA c01za;
        List<C00UM> value;
        MutableLiveData<List<C00UM>> mutableLiveData;
        MutableLiveData mutableLiveData2;
        List<C01ZA> list = (List) obj;
        TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) c513601zK.l0;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = textHeaderListFragment.LL;
        if (anchorTextHeaderViewModel != null && (mutableLiveData2 = anchorTextHeaderViewModel.LLILZLL) != null) {
            c01za = (C01ZA) mutableLiveData2.getValue();
        } else {
            c01za = null;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = ((TextHeaderListFragment) c513601zK.l0).LL;
        if (anchorTextHeaderViewModel2 == null || (mutableLiveData = anchorTextHeaderViewModel2.LLJILJILJ) == null || (value = mutableLiveData.getValue()) == null) {
            value = C13BV.INSTANCE;
        }
        textHeaderListFragment.PR(c01za, list, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$46(C513601zK c513601zK, Object obj) {
        C01ZA c01za;
        List<C01ZA> value;
        MutableLiveData<List<C01ZA>> mutableLiveData;
        MutableLiveData mutableLiveData2;
        List<C00UM> list = (List) obj;
        TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) c513601zK.l0;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = textHeaderListFragment.LL;
        if (anchorTextHeaderViewModel != null && (mutableLiveData2 = anchorTextHeaderViewModel.LLILZLL) != null) {
            c01za = (C01ZA) mutableLiveData2.getValue();
        } else {
            c01za = null;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = ((TextHeaderListFragment) c513601zK.l0).LL;
        if (anchorTextHeaderViewModel2 == null || (mutableLiveData = anchorTextHeaderViewModel2.LLJILJIL) == null || (value = mutableLiveData.getValue()) == null) {
            value = C13BV.INSTANCE;
        }
        textHeaderListFragment.PR(c01za, value, list);
    }

    public static final void onChanged$47(C513601zK c513601zK, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c513601zK.l0), C0PEM.LIZ, null, new C315801Ki((String) obj, null), 2);
    }

    public static final void onChanged$48(C513601zK c513601zK, Object obj) {
        int iIntValue;
        boolean z;
        boolean z2;
        String strJ4;
        C250000xu.LIZ.getClass();
        String strLIZ = C251000y4.LIZ(String.valueOf(C250000xu.LJIL));
        String strLIZ2 = C251000y4.LIZ(String.valueOf(C250000xu.LIZ()));
        Integer value = C250000xu.LJJ.getValue();
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && C250000xu.LJIJJLI.length() > 0 && !Intrinsics.LJFF(C250000xu.LJIJJLI, "COIN") && C250000xu.LJIILL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C16F5 c16f5RR = ((LiveGiftReminderFragment) c513601zK.l0).RR();
            if (C497740JfY.LJJ()) {
                strJ4 = C786410Ut5.j4("%s%s ≈ %s%s", Arrays.copyOf(new Object[]{strLIZ, u.LJJIFFI(C497740JfY.LJIIJJI(2131755535, C250000xu.LJIL), "{amount}", "", false), strLIZ2, C250000xu.LJIIZILJ}, 4));
            } else {
                strJ4 = C786410Ut5.j4("%s%s ≈ %s%s", Arrays.copyOf(new Object[]{strLIZ, u.LJJIFFI(C497740JfY.LJIIJJI(2131755535, C250000xu.LJIL), "{amount}", "", false), C250000xu.LJIIZILJ, strLIZ2}, 4));
            }
            c16f5RR.setText(strJ4);
        } else if (Intrinsics.LJFF(C250000xu.LJIJJLI, "COIN")) {
            ((LiveGiftReminderFragment) c513601zK.l0).RR().setText(C786410Ut5.j4("%s%s", Arrays.copyOf(new Object[]{strLIZ, u.LJJIFFI(C497740JfY.LJIIJJI(2131755535, C250000xu.LJIL), "{amount}", "", false)}, 2)));
        } else {
            ((LiveGiftReminderFragment) c513601zK.l0).RR().setText(C786410Ut5.j4("%s%s", Arrays.copyOf(new Object[]{C250000xu.LJIIZILJ, strLIZ2}, 2)));
        }
        if (C250000xu.LJIILL) {
            float f = C250000xu.LJIILLIIL;
            LiveGiftReminderFragment liveGiftReminderFragment = (LiveGiftReminderFragment) c513601zK.l0;
            View viewFindViewById = liveGiftReminderFragment.LLILZ;
            if (viewFindViewById == null) {
                View view = liveGiftReminderFragment.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.z3e);
                } else {
                    viewFindViewById = null;
                }
                liveGiftReminderFragment.LLILZ = (C16F5) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(u.LJJIFFI(u.LJJIFFI(C497740JfY.LJIJI(2131841960), "{amount}", String.valueOf(f), false), "{currency}", C250000xu.LJIIZILJ, false));
        }
    }

    public static final void onChanged$49(C513601zK c513601zK, Object obj) {
        C639380P6a c639380P6a = (C639380P6a) c513601zK.l0;
        if (((Boolean) obj).booleanValue()) {
            ((LiveData) c639380P6a.LLILZ.getValue()).setValue(0);
            return;
        }
        Iterator it2 = ((List) c639380P6a.LLILZIL.getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((LiveData) next).getValue(), Boolean.TRUE)) {
                if (next != null) {
                    ((LiveData) c639380P6a.LLILZ.getValue()).setValue(0);
                    return;
                }
            }
        }
        ((LiveData) c639380P6a.LLILZ.getValue()).setValue(1);
    }

    public static final void onChanged$5(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        GuestShowdownEndDialog guestShowdownEndDialog;
        String strX1 = ((BaseGuestShowdownWidget) c513601zK.l0).x1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leavePlayUsers=");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ(strX1, C2188811AlT.LIZIZ(sbLIZ));
        BaseGuestShowdownWidget baseGuestShowdownWidget = (BaseGuestShowdownWidget) c513601zK.l0;
        GuestShowdownEndDialog guestShowdownEndDialog2 = baseGuestShowdownWidget.LLILLJJLI;
        GuestShowdownContent guestShowdownContentZQ2 = null;
        if (guestShowdownEndDialog2 != null) {
            boolValueOf = Boolean.valueOf(guestShowdownEndDialog2.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (guestShowdownEndDialog = baseGuestShowdownWidget.LLILLJJLI) != null) {
            VM vm = baseGuestShowdownWidget.LLILLL;
            if (vm != 0) {
                guestShowdownContentZQ2 = vm.zQ2();
            }
            guestShowdownEndDialog.uS(guestShowdownContentZQ2);
        }
    }

    public static final void onChanged$50(C513601zK c513601zK, Object obj) {
        if (((InterfaceC20236714Gf) c513601zK.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513601zK.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
    }

    public static final void onChanged$51(C513601zK c513601zK, Object obj) {
        C786410Ut5.T4((View) c513601zK.l0, ((Float) obj).floatValue());
    }

    public static final void onChanged$52(C513601zK c513601zK, Object obj) {
        ((LiveIconView) c513601zK.l0).setIcon((Drawable) obj);
    }

    public static final void onChanged$53(C513601zK c513601zK, Object obj) {
        ((C16F5) c513601zK.l0).setText((String) obj);
    }

    public static final void onChanged$54(C513601zK c513601zK, Object obj) {
        ((LiveIconView) c513601zK.l0).setIcon((Drawable) obj);
    }

    public static final void onChanged$55(C513601zK c513601zK, Object obj) {
        ((C16F5) c513601zK.l0).setText((String) obj);
    }

    public static final void onChanged$56(C513601zK c513601zK, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c513601zK.l0), C0PEM.LIZ, null, new C315901Kj((String) obj, null), 2);
    }

    public static final void onChanged$57(C513601zK c513601zK, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) c513601zK.l0;
        Integer num = (Integer) obj;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && num.intValue() != layoutParams.height) {
            layoutParams.height = num.intValue();
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void onChanged$58(C513601zK c513601zK, Object obj) {
        ((LiveWatchPreviewWidget) c513601zK.l0).LJJIJIIJIL(((Number) obj).intValue());
    }

    public static final void onChanged$6(C513601zK c513601zK, Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        GuestShowdownEndDialog guestShowdownEndDialog;
        GuestShowdownRankDialog guestShowdownRankDialog;
        GuestShowdownContent guestShowdownContentZQ2;
        int iIntValue;
        Integer numAQ2;
        String strX1 = ((BaseGuestShowdownWidget) c513601zK.l0).x1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runningPlayUsers=");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ(strX1, C2188811AlT.LIZIZ(sbLIZ));
        BaseGuestShowdownWidget baseGuestShowdownWidget = (BaseGuestShowdownWidget) c513601zK.l0;
        GuestShowdownRankDialog guestShowdownRankDialog2 = baseGuestShowdownWidget.LL;
        GuestShowdownContent guestShowdownContentZQ22 = null;
        if (guestShowdownRankDialog2 != null) {
            boolValueOf = Boolean.valueOf(guestShowdownRankDialog2.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (guestShowdownRankDialog = baseGuestShowdownWidget.LL) != null) {
            VM vm = baseGuestShowdownWidget.LLILLL;
            if (vm != 0) {
                guestShowdownContentZQ2 = vm.zQ2();
            } else {
                guestShowdownContentZQ2 = null;
            }
            VM vm2 = baseGuestShowdownWidget.LLILLL;
            if (vm2 != 0 && (numAQ2 = vm2.AQ2()) != null) {
                iIntValue = numAQ2.intValue();
            } else {
                iIntValue = 2;
            }
            guestShowdownRankDialog.LLLFF = iIntValue;
            guestShowdownRankDialog.LLLF = guestShowdownContentZQ2;
            guestShowdownRankDialog.uS();
        }
        GuestShowdownEndDialog guestShowdownEndDialog2 = baseGuestShowdownWidget.LLILLJJLI;
        if (guestShowdownEndDialog2 != null) {
            boolValueOf2 = Boolean.valueOf(guestShowdownEndDialog2.isVisible());
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf2) && (guestShowdownEndDialog = baseGuestShowdownWidget.LLILLJJLI) != null) {
            VM vm3 = baseGuestShowdownWidget.LLILLL;
            if (vm3 != 0) {
                guestShowdownContentZQ22 = vm3.zQ2();
            }
            guestShowdownEndDialog.uS(guestShowdownContentZQ22);
        }
    }

    public static final void onChanged$7(C513601zK c513601zK, Object obj) {
        Integer num = (Integer) obj;
        String strX1 = ((BaseGuestShowdownWidget) c513601zK.l0).x1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status=");
        sbLIZ.append(num);
        C20441214yg.LIZIZ(strX1, C2188811AlT.LIZIZ(sbLIZ));
        ((BaseGuestShowdownWidget) c513601zK.l0).z1(num);
    }

    public static final void onChanged$8(C513601zK c513601zK, Object obj) {
        C499501x3 c499501x3;
        Set<ActivePlaybook> set;
        ActivePlaybook activePlaybook;
        C499501x3 c499501x32;
        Set<ActivePlaybook> set2;
        ActivePlaybook activePlaybook2;
        C499301x1 c499301x1LJJIJ;
        String strLJJIJLIJ = ((BasePlaybookService) c513601zK.l0).LJJIJLIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activePlaybook=");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ(strLJJIJLIJ, C2188811AlT.LIZIZ(sbLIZ));
        if (obj != null && (c499301x1LJJIJ = ((BasePlaybookService) c513601zK.l0).LJJIJ()) != null) {
            c499301x1LJJIJ.LIZ("activePlaybookUpdate");
        }
        C499301x1 c499301x1LJJIJ2 = ((BasePlaybookService) c513601zK.l0).LJJIJ();
        if (c499301x1LJJIJ2 != null) {
            c499301x1LJJIJ2.LIZIZ("activePlaybookUpdate", ((BasePlaybookService) c513601zK.l0).LJJIIZI(false));
        }
        if (obj == null) {
            C499701x5 c499701x5 = (C499701x5) ((BasePlaybookService) c513601zK.l0).LL.gg0(ActivePlaybookChannel.class);
            if (c499701x5 != null && (set2 = c499701x5.LIZ) != null && (activePlaybook2 = (ActivePlaybook) C13LP.LJJJLIIL(set2)) != null) {
                EnumC499601x4 enumC499601x4 = EnumC499601x4.TYPE_END;
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                c499501x32 = new C499501x3(enumC499601x4, activePlaybook2, C978360bZC.LJII, C978360bZC.LJIIIIZZ, 16);
            } else {
                c499501x32 = new C499501x3(EnumC499601x4.TYPE_UNKNOWN, null, null, 0L, 30);
            }
            ((BasePlaybookService) c513601zK.l0).LL.zW(ActivePlaybookChannel.class, new C499701x5(C08CX.INSTANCE, c499501x32));
            return;
        }
        C499701x5 c499701x52 = (C499701x5) ((BasePlaybookService) c513601zK.l0).LL.gg0(ActivePlaybookChannel.class);
        if (c499701x52 != null && (set = c499701x52.LIZ) != null && (activePlaybook = (ActivePlaybook) C13LP.LJJJLIIL(set)) != null) {
            c499501x3 = new C499501x3(EnumC499601x4.TYPE_CHANGE, activePlaybook, null, 0L, 28);
        } else {
            EnumC499601x4 enumC499601x42 = EnumC499601x4.TYPE_START;
            C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
            c499501x3 = new C499501x3(enumC499601x42, null, C978360bZC.LJII, 0L, 24);
        }
        ((BasePlaybookService) c513601zK.l0).LL.zW(ActivePlaybookChannel.class, new C499701x5(Collections.singleton(obj), c499501x3));
    }

    public static final void onChanged$9(C513601zK c513601zK, Object obj) {
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("Editor_PlaybookEditorDialog", "all tag changed", null, null);
        ((PlaybookEditorAddTagDialog) c513601zK.l0).BS();
    }

    public C513601zK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public C513601zK(C639380P6a c639380P6a, String str, int i) {
        this.$t = i;
        this.l0 = c639380P6a;
    }
}
