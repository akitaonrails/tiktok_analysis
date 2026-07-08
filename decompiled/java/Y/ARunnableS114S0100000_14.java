package Y;

import X.AbstractC1387200mCc;
import X.AbstractC191963108b;
import X.AbstractC885530YoZ;
import X.AnonymousClass1932;
import X.C05O2;
import X.C09EF;
import X.C0BB4;
import X.C0I0B;
import X.C0I7D;
import X.C0S1B;
import X.C0WIY;
import X.C0WZX;
import X.C0Y2K;
import X.C0Y2P;
import X.C0Y6Q;
import X.C0Z4R;
import X.C0Z8D;
import X.C0ZBF;
import X.C0ZDX;
import X.C0ZI0;
import X.C0ZI1;
import X.C0ZVS;
import X.C0ZZ5;
import X.C109T;
import X.C12WG;
import X.C1389890mGx;
import X.C1390080mHG;
import X.C1390380mHk;
import X.C1429410nIh;
import X.C1430580nKa;
import X.C1433500nPI;
import X.C1619106Vp;
import X.C1697810uHb;
import X.C1721206oc;
import X.C1729806q0;
import X.C189200o6;
import X.C1902890zcN;
import X.C195R;
import X.C19GS;
import X.C1C7U;
import X.C20684815ws;
import X.C2097608Jq;
import X.C214848196g;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C259800zU;
import X.C337180DJs;
import X.C418440Gaw;
import X.C443120HZe;
import X.C520040KaQ;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C854860XgC;
import X.C859080Xn0;
import X.C859340XnQ;
import X.C863310Xtp;
import X.C865670Xxd;
import X.C868780Y6i;
import X.C869590Y9l;
import X.C878310Ycv;
import X.C878470YdB;
import X.C878960Ydy;
import X.C885310YoD;
import X.C885830Yp3;
import X.C888110Ysj;
import X.C889930Yvf;
import X.C894660Z7w;
import X.C895630ZBp;
import X.C903320ZcA;
import X.C907170ZiN;
import X.C909290Zln;
import X.EnumC898940ZOi;
import X.InterfaceC1493505sz;
import X.InterfaceC20236714Gf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2257971DZj;
import X.InterfaceC870420YCq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Display;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import ayh.i5;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.im.core.model.DefaultConvReadInfoHelper;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestFragment;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestFragmentV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestListAssemV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestTopBarAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.interraction.InteractionCardReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.ss.android.ugc.aweme.utils.PerformanceMonitorCallbacks;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.aweme.verify.pi.PiVerifyAssem;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS57S0010000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS114S0100000_14 implements Runnable {
    public final int $t;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
            case 43:
                run$43(this);
                break;
            case 44:
                run$44(this);
                break;
            case 45:
                run$45(this);
                break;
            case 46:
                run$46(this);
                break;
            case 47:
                run$47(this);
                break;
            case 48:
                run$48(this);
                break;
            case 49:
                run$49(this);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                run$50(this);
                break;
            case 51:
                run$51(this);
                break;
            case 52:
                run$52(this);
                break;
            case 53:
                run$53(this);
                break;
            case 54:
                run$54(this);
                break;
            case 55:
                run$55(this);
                break;
            case 56:
                run$56(this);
                break;
            case 57:
                run$57(this);
                break;
            case 58:
                run$58(this);
                break;
            case 59:
                run$59(this);
                break;
            case 60:
                run$60(this);
                break;
            case 61:
                run$61(this);
                break;
            case BaseNotice.CREATOR /* 62 */:
                run$62(this);
                break;
            case 63:
                run$63(this);
                break;
            case 64:
                run$64(this);
                break;
            case 65:
                run$65(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:54:0x0181
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS114S0100000_14.LIZ$0():void");
    }

    public final void LIZ$1() {
        C0Y2K c0y2k = (C0Y2K) this.l0;
        String strLJJJ = c0y2k.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJJ();
        if (!TextUtils.isEmpty(strLJJJ)) {
            try {
                Map map = (Map) C09EF.LIZ.LJIIIIZZ(strLJJJ, new TypeToken<ConcurrentHashMap<String, DeleteConversationRequest>>() { // from class: X.0Y2L
                }.getType());
                if (map != null) {
                    ((ConcurrentHashMap) c0y2k.LIZ).putAll(map);
                }
                C868780Y6i c868780Y6iLIZLLL = c0y2k.LIZJ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WaitDelCon_FileStore initFromSp success, cache:");
                sbLIZ.append(((ConcurrentHashMap) c0y2k.LIZ).size());
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C868780Y6i c868780Y6iLIZLLL2 = c0y2k.LIZJ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("WaitDelCon_FileStore initFromSp error:");
                sbLIZ2.append(th);
                c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        ((C0Y2K) this.l0).LIZIZ = true;
    }

    public final void LIZ$10() {
        String str;
        InboxEntranceCell inboxEntranceCell = ((InboxEntrancePod) this.l0).entranceCell;
        int i = inboxEntranceCell.unreadCount;
        if (i > 0) {
            InboxEntranceCellUIInfo inboxEntranceCellUIInfo = inboxEntranceCell.uiInfo;
            str = (inboxEntranceCellUIInfo == null || inboxEntranceCellUIInfo.unreadType != 2) ? "yellow_dot" : "number_dot";
        } else {
            str = "report_null";
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page"), new Pair("cell_type", C1902890zcN.LIZ(inboxEntranceCell)), new Pair("notice_type", str), new Pair("show_cnt", String.valueOf(i)), new Pair("action_type", "long_press"));
        C0ZBF muteStatus = ((InboxEntrancePod) this.l0).entranceCell.getMuteStatus();
        if (muteStatus != null) {
            mapLJIIJ.put("mute_status", muteStatus.getEventName());
        }
        Boolean pinStatus = ((InboxEntrancePod) this.l0).entranceCell.getPinStatus();
        if (pinStatus != null) {
            mapLJIIJ.put("pin_status", pinStatus.booleanValue() ? "pin" : "unpin");
        }
        Boolean archiveStatus = ((InboxEntrancePod) this.l0).entranceCell.getArchiveStatus();
        if (archiveStatus != null) {
            InboxEntrancePod inboxEntrancePod = (InboxEntrancePod) this.l0;
            archiveStatus.booleanValue();
            mapLJIIJ.put("archive_status", inboxEntrancePod.LIZLLL() ? "archive" : "unarchive");
        }
        mapLJIIJ.put("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
        C20684815ws.LJIILLIIL("inbox_message_cell_feedback", mapLJIIJ);
    }

    public final void LIZ$11() {
        List<C888110Ysj> listLp = ((MessageRequestTopBarAssem) this.l0).lp();
        if (listLp == null || !(!listLp.isEmpty())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (C888110Ysj c888110Ysj : listLp) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C888110Ysj c888110Ysj2 = c888110Ysj;
            float fLIZ = C0Z8D.LIZ(c888110Ysj2);
            if (fLIZ >= 1.0f) {
                i++;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(c888110Ysj2.getTabType().getMobValue());
            sbLIZ.append("\":\"");
            sbLIZ.append((int) (fLIZ * 100));
            sbLIZ.append('\"');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            if (i2 < listLp.size() - 1) {
                sb.append(",");
            }
            i2 = i3;
        }
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('{');
        sbLIZ2.append((Object) sb);
        sbLIZ2.append('}');
        interfaceC1493505szLIZIZ.sendEvent("show_message_request_page_tab", C2097608Jq.LJIIIIZZ(new Pair("full_tab_cnt", String.valueOf(i)), new Pair("tab_cnt", String.valueOf(listLp.size())), new Pair("tab_show_rate", C2188811AlT.LIZIZ(sbLIZ2))));
    }

    public final void LIZ$2() {
        try {
            String strLJIILL = C09EF.LIZ.LJIILL(((C0Y2K) this.l0).LIZ);
            if (strLJIILL == null) {
                strLJIILL = "";
            }
            ((C0Y2K) this.l0).LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJIIL(strLJIILL);
            C868780Y6i c868780Y6iLIZLLL = ((C0Y2K) this.l0).LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaitDelCon_FileStore updateSp, cache:");
            sbLIZ.append(((ConcurrentHashMap) ((C0Y2K) this.l0).LIZ).size());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C0Y2K) this.l0).LIZJ.LIZLLL().LJIIIZ("WaitDelCon_FileStore updateSp error ", th);
        }
    }

    public final void LIZ$3() {
        try {
            String strLJIILL = C09EF.LIZ.LJIILL(((C0Y2P) this.l0).LIZ);
            if (strLJIILL == null) {
                strLJIILL = "";
            }
            ((C0Y2P) this.l0).LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJIJIL(strLJIILL);
            C868780Y6i c868780Y6iLIZLLL = ((C0Y2P) this.l0).LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaitDelCon_FileStore updateSp, cache:");
            sbLIZ.append(((ConcurrentHashMap) ((C0Y2P) this.l0).LIZ).size());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C0Y2P) this.l0).LIZJ.LIZLLL().LJIIIZ("WaitDelCon_FileStore updateSp error ", th);
        }
    }

    public final void LIZ$4() {
        BaseMessageRequestChatListCell baseMessageRequestChatListCell;
        C443120HZe<AbstractC885530YoZ, C878960Ydy, Integer> c443120HZeL5;
        MessageRequestFragment messageRequestFragment = (MessageRequestFragment) this.l0;
        messageRequestFragment.LLJJI = false;
        View view = messageRequestFragment.getView();
        if (view != null && ((MessageRequestFragment) this.l0).isAdded() && MessageRequestFragment.WR((MessageRequestFragment) this.l0)) {
            ((MessageRequestFragment) this.l0).getClass();
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.k7q);
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                    if ((childViewHolder instanceof BaseMessageRequestChatListCell) && (baseMessageRequestChatListCell = (BaseMessageRequestChatListCell) childViewHolder) != null && (c443120HZeL5 = baseMessageRequestChatListCell.L5()) != null) {
                        C885310YoD.LJJIJIL(C885310YoD.LIZ, c443120HZeL5.getFirst(), c443120HZeL5.getSecond(), c443120HZeL5.getThird().intValue());
                    }
                }
            }
            ((MessageRequestFragment) this.l0).LLJILLL = false;
        }
    }

    public final void LIZ$5() {
        BaseMessageRequestChatListCell baseMessageRequestChatListCell;
        C443120HZe<AbstractC885530YoZ, C878960Ydy, Integer> c443120HZeL5;
        MessageRequestFragmentV2 messageRequestFragmentV2 = (MessageRequestFragmentV2) this.l0;
        messageRequestFragmentV2.LLJJJJ = false;
        View view = messageRequestFragmentV2.getView();
        if (view != null && ((MessageRequestFragmentV2) this.l0).isAdded()) {
            ((MessageRequestFragmentV2) this.l0).getClass();
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.k7q);
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                    if ((childViewHolder instanceof BaseMessageRequestChatListCell) && (baseMessageRequestChatListCell = (BaseMessageRequestChatListCell) childViewHolder) != null && (c443120HZeL5 = baseMessageRequestChatListCell.L5()) != null) {
                        C885310YoD.LJJIJIL(C885310YoD.LIZ, c443120HZeL5.getFirst(), c443120HZeL5.getSecond(), c443120HZeL5.getThird().intValue());
                    }
                }
            }
            ((MessageRequestFragmentV2) this.l0).LLJJJIL = false;
        }
    }

    public final void LIZ$6() {
        View view = (View) ((SessionListIMBaseVH) this.l0).LLLFFI.getValue();
        if (!(view instanceof ViewGroup) || view == null) {
            return;
        }
        int height = view.getHeight();
        if (!view.isAttachedToWindow() || !((SessionListIMBaseVH) this.l0).i7() || !((SessionListIMBaseVH) this.l0).S6().isShown() || height <= 0) {
            view.setTouchDelegate(null);
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        Rect rect = new Rect();
        if (view.getLayoutDirection() == 1) {
            int width = view.getWidth();
            if (iLIZIZ > width) {
                iLIZIZ = width;
            }
            rect.set(0, 0, iLIZIZ, height);
        } else {
            int width2 = view.getWidth() - iLIZIZ;
            if (width2 < 0) {
                width2 = 0;
            }
            rect.set(width2, 0, view.getWidth(), height);
        }
        view.setTouchDelegate(new TouchDelegate(rect, ((SessionListIMBaseVH) this.l0).S6()));
    }

    public final void LIZ$7() {
        IMLiveService iMLiveServiceLIZ;
        IMUser fromUser;
        try {
            ((SingleTitleBarCenterAssem) this.l0).Gp();
            SingleTitleBarCenterAssem singleTitleBarCenterAssem = (SingleTitleBarCenterAssem) this.l0;
            User user = (User) singleTitleBarCenterAssem.LLJJJ.getValue();
            if (user != null) {
                StoryFeature storyFeatureLIZ = StoryFeature.LIZ.LIZ();
                if (storyFeatureLIZ != null) {
                    storyFeatureLIZ.LJFF(user);
                }
                singleTitleBarCenterAssem.LLLF = user;
                AvatarComponentView avatarComponentView = singleTitleBarCenterAssem.LLJLLL;
                if (avatarComponentView != null) {
                    String uid = user.getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    C0S1B.LIZ(avatarComponentView, uid, user, singleTitleBarCenterAssem, false, null, 56);
                }
                C909290Zln c909290ZlnLp = singleTitleBarCenterAssem.lp();
                if (c909290ZlnLp != null && (fromUser = c909290ZlnLp.getFromUser()) != null) {
                    singleTitleBarCenterAssem.Up(fromUser);
                }
            }
            SingleTitleBarCenterAssem singleTitleBarCenterAssem2 = (SingleTitleBarCenterAssem) this.l0;
            User user2 = (User) singleTitleBarCenterAssem2.LLJJJ.getValue();
            if (user2 != null) {
                IMLiveService.LIZ.getClass();
                IMLiveService iMLiveServiceLIZ2 = C0ZVS.LIZ();
                if (iMLiveServiceLIZ2 == null || !iMLiveServiceLIZ2.LJIILIIL() || (iMLiveServiceLIZ = C0ZVS.LIZ()) == null) {
                    return;
                }
                String uid2 = user2.getUid();
                iMLiveServiceLIZ.LJIJI(uid2 != null ? uid2 : "", singleTitleBarCenterAssem2, new AObserverS178S0200000_14(user2, singleTitleBarCenterAssem2, 6));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1721206oc.LIZ((SingleTitleBarCenterAssem) this.l0, e, "SingleTitleBar");
        }
    }

    public final void LIZ$8() {
        C1430580nKa.LIZ(((AnonymousClass1932) this.l0).T2());
        List<CreateAnchorInfo> listLIZJ = C1429410nIh.LIZJ(((AnonymousClass1932) this.l0).T2());
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> listI3 = ((AnonymousClass1932) this.l0).i3();
        if (listI3 != null) {
            Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = listI3.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ.callbackAnchors(listLIZJ);
            }
        }
    }

    public final void LIZ$9() {
        WindowManager windowManager;
        Display displayLLILZIL;
        try {
            C863310Xtp c863310Xtp = (C863310Xtp) this.l0;
            Context context = c863310Xtp.LIZ;
            c863310Xtp.getClass();
            float fFloatValue = 60.0f;
            if (context != null) {
                try {
                    Object objH2 = C786410Ut5.H2(context, "window");
                    if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pcJSAzjdIFfgziYgfgzCuel2DaruICXe2KpmcI/kVyVLP1N0y7ljQvh2A", null))) != null) {
                        Float fValueOf = Float.valueOf(displayLLILZIL.getRefreshRate());
                        if (fValueOf.floatValue() > 0.0f) {
                            fFloatValue = fValueOf.floatValue();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            ((C863310Xtp) this.l0).LJ = fFloatValue;
            if (fFloatValue > 0.0f) {
                C863310Xtp c863310Xtp2 = (C863310Xtp) this.l0;
                long j = (long) (1.0E9d / ((double) fFloatValue));
                if (j < 1000000) {
                    j = 1000000;
                }
                c863310Xtp2.LJFF = j;
            }
            C786410Ut5.v2().postFrameCallback(((C863310Xtp) this.l0).LJIJJ);
            ((C863310Xtp) this.l0).LIZJ = true;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static final void run$0(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("ChatRootFragment@2e5a.releaseEnterTransitionAfterListSkeleton$1$1");
        try {
            ChatRootFragment chatRootFragment = (ChatRootFragment) aRunnableS114S0100000_14.l0;
            chatRootFragment.getClass();
            boolean zLIZLLL = C195R.LIZLLL(chatRootFragment);
            IIMChatPerfLogger.LIZ.getClass();
            IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
            if (iIMChatPerfLoggerLIZ != null) {
                if (iIMChatPerfLoggerLIZ.LJIILJJIL() && !zLIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                iIMChatPerfLoggerLIZ.LJIILL(z);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatRootFragment@2e5a.releaseEnterTransitionAfterListSkeleton$1$1");
    }

    public static final void run$1(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.writeLocalExt$2$1");
        try {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aRunnableS114S0100000_14.l0;
            C0Y6Q c0y6qLIZJ = C865670Xxd.LIZJ(Boolean.TRUE);
            C189200o6.m2constructorimpl(c0y6qLIZJ);
            interfaceC20236714Gf.resumeWith(c0y6qLIZJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.writeLocalExt$2$1");
    }

    public static final void run$10(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MessageRequestFragment@89f5.scheduleReplayVisibleMessageRequestSocialChatCellShow$1");
        try {
            aRunnableS114S0100000_14.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageRequestFragment@89f5.scheduleReplayVisibleMessageRequestSocialChatCellShow$1");
    }

    public static final void run$11(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MessageRequestFragmentV2@12c9.scheduleReplayVisibleMessageRequestSocialChatCellShow$1");
        try {
            aRunnableS114S0100000_14.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageRequestFragmentV2@12c9.scheduleReplayVisibleMessageRequestSocialChatCellShow$1");
    }

    public static final void run$12(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BaseMessageRequestChatListCell@adef.special$$inlined$doOnPreDraw$1");
        try {
            C885830Yp3 c885830Yp3 = C885830Yp3.LL;
            synchronized (c885830Yp3) {
                C885830Yp3.LJ(c885830Yp3, "first_item_show", new AwS57S0010000_14(false, 0), 2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseMessageRequestChatListCell@adef.special$$inlined$doOnPreDraw$1");
    }

    public static final void run$13(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("SessionListIMBaseVH@aff5.applyRightZoneTouchDelegateRunnable$1");
        try {
            aRunnableS114S0100000_14.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SessionListIMBaseVH@aff5.applyRightZoneTouchDelegateRunnable$1");
    }

    public static final void run$14(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("SessionListIMBaseVH@aff5.behaviorObserverRegistration$2$1$1$1");
        try {
            SessionListIMBaseVH sessionListIMBaseVH = (SessionListIMBaseVH) ((WeakReference) aRunnableS114S0100000_14.l0).get();
            if (sessionListIMBaseVH != null) {
                sessionListIMBaseVH.l7();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SessionListIMBaseVH@aff5.behaviorObserverRegistration$2$1$1$1");
    }

    public static final void run$15(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("SingleTitleBarCenterAssem@32f.onViewCreated$1");
        try {
            aRunnableS114S0100000_14.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.onViewCreated$1");
    }

    public static final void run$16(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ReusedSkeletonUISlotAssem@edf6.onHostResume$1");
        try {
            if (((ReusedSkeletonUISlotAssem) aRunnableS114S0100000_14.l0).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                ((ReusedSkeletonUISlotAssem) aRunnableS114S0100000_14.l0).zp();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReusedSkeletonUISlotAssem@edf6.onHostResume$1");
    }

    public static final void run$17(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("CommonMessageListConfigKt@2fb4.chatroomNetworkConfig$1$showToast$1");
        try {
            if (((Fragment) aRunnableS114S0100000_14.l0).isVisible()) {
                IMNetworkSaasApi.LIZ.getClass();
                IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
                if (iMNetworkSaasApiLIZ != null && iMNetworkSaasApiLIZ.LIZIZ()) {
                    i = 2131832010;
                } else {
                    i = 2131832008;
                }
                C1389890mGx c1389890mGx = new C1389890mGx((Fragment) aRunnableS114S0100000_14.l0);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LIZLLL(3000L);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.chatroomNetworkConfig$1$showToast$1");
    }

    public static final void run$18(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("CommonMessageListConfigKt@2fb4.setNetworkObserverConfig$networkObserver$1$1");
        try {
            Handler handler = (Handler) aRunnableS114S0100000_14.l0;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
            handler.removeCallbacksAndMessages(null);
            IIMErrorUtils.LIZ.getClass();
            IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
            if (iIMErrorUtilsLIZ != null) {
                iIMErrorUtilsLIZ.LIZJ(C894660Z7w.LIZ());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.setNetworkObserverConfig$networkObserver$1$1");
    }

    public static final void run$19(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("InteractionCardReusedUISlot@cd13.videoPlayerAction$1$startAction$1");
        try {
            C337180DJs.LIZ(((InteractionCardReusedUISlot) aRunnableS114S0100000_14.l0).tp());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractionCardReusedUISlot@cd13.videoPlayerAction$1$startAction$1");
    }

    public static final void run$2(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ChatListConversationDataSource@6f28.arrangePreloadAllTask$runnable$1");
        try {
            C878470YdB c878470YdB = (C878470YdB) aRunnableS114S0100000_14.l0;
            C1729806q0.LIZ(c878470YdB.LIZ, new C878310Ycv(c878470YdB, null));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.arrangePreloadAllTask$runnable$1");
    }

    public static final void run$20(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        Fragment fragmentLIZLLL;
        C1C7U.LIZ("BaseChatRootFragment@beaf.initChatPanel$1$setLightTheme$1$1");
        try {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ((BaseChatRootFragment) aRunnableS114S0100000_14.l0);
            if (abstractC1387200mCcLIZIZ != null) {
                fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL();
            } else {
                fragmentLIZLLL = null;
            }
            if (Intrinsics.LJFF(fragmentLIZLLL, (BaseChatRootFragment) aRunnableS114S0100000_14.l0)) {
                BaseChatRootFragment baseChatRootFragment = (BaseChatRootFragment) aRunnableS114S0100000_14.l0;
                baseChatRootFragment.LLJJL = true;
                baseChatRootFragment.uS();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseChatRootFragment@beaf.initChatPanel$1$setLightTheme$1$1");
    }

    public static final void run$21(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("SideMessageStatusReusedSkeletonUISlot@a352.onBindItem$8");
        try {
            if (((Boolean) C0BB4.LIZ.getValue()).booleanValue()) {
                if (((SideMessageStatusReusedSkeletonUISlot) aRunnableS114S0100000_14.l0).LJJIJL().isAttachedToWindow()) {
                    SideMessageStatusReusedSkeletonUISlot sideMessageStatusReusedSkeletonUISlot = (SideMessageStatusReusedSkeletonUISlot) aRunnableS114S0100000_14.l0;
                    sideMessageStatusReusedSkeletonUISlot.Bp(sideMessageStatusReusedSkeletonUISlot.Ep(), EnumC898940ZOi.LLILLL, true);
                }
            } else {
                C786410Ut5.LJLLLLLL(0, ((SideMessageStatusReusedSkeletonUISlot) aRunnableS114S0100000_14.l0).LJJIJL());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SideMessageStatusReusedSkeletonUISlot@a352.onBindItem$8");
    }

    public static final void run$22(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ArchiveEntranceViewModel@d309.reportInboxEntranceAction$3");
        try {
            C20684815ws.LJIILLIIL("inbox_message_cell", (Map) aRunnableS114S0100000_14.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ArchiveEntranceViewModel@d309.reportInboxEntranceAction$3");
    }

    public static final void run$23(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        C0ZI0 c0zi0 = (C0ZI0) aRunnableS114S0100000_14.l0;
        C1C7U.LIZ("HashTagsModule@2e63.initViewModelObserver$1$onWindowFocusChanged$1L");
        c0zi0.requestFocus();
        KeyboardUtils.LIZLLL(c0zi0);
        C1C7U.LIZIZ("HashTagsModule@2e63.initViewModelObserver$1$onWindowFocusChanged$1L");
    }

    public static final void run$24(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("PublishExtensionAdapterComponent@a28.refreshAnchors$1");
        try {
            aRunnableS114S0100000_14.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishExtensionAdapterComponent@a28.refreshAnchors$1");
    }

    public static final void run$25(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aRunnableS114S0100000_14.l0;
        String str = VideoEditContainerScene.LLLLLILLIL;
        videoEditContainerScene.getClass();
        C1C7U.LIZ("VideoEditContainerScene@649c.lambda$onResume$11$1L");
        C12WG.LIZLLL(videoEditContainerScene, new ARunnableS114S0100000_14(videoEditContainerScene, 26), 300L);
        C1C7U.LIZIZ("VideoEditContainerScene@649c.lambda$onResume$11$1L");
    }

    public static final void run$26(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aRunnableS114S0100000_14.l0;
        String str = VideoEditContainerScene.LLLLLILLIL;
        videoEditContainerScene.getClass();
        C1C7U.LIZ("VideoEditContainerScene@649c.lambda$onResume$11$1L$1L");
        if (videoEditContainerScene.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            videoEditContainerScene.LLLLLLZZ();
        }
        C1C7U.LIZIZ("VideoEditContainerScene@649c.lambda$onResume$11$1L$1L");
    }

    public static final void run$27(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ExpandedTitleModule@8152.mobExpandFailureRunnable$1");
        try {
            ExpandedTitleModule expandedTitleModule = (ExpandedTitleModule) aRunnableS114S0100000_14.l0;
            if (expandedTitleModule.LLLIIIL) {
                expandedTitleModule.LJJIJIIJIL(true, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExpandedTitleModule@8152.mobExpandFailureRunnable$1");
    }

    public static final void run$28(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ImageHeaderModule@1844.init$3$3$clearOverLay$1$1");
        try {
            ((C214848196g) aRunnableS114S0100000_14.l0).LIZJ.invalidate();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageHeaderModule@1844.init$3$3$clearOverLay$1$1");
    }

    public static final void run$29(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        Activity activity;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS114S0100000_14.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.<init>$1L");
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
        if (videoPublishEditModel == null) {
            C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.<init>$1L");
            return;
        }
        C854860XgC c854860XgC = videoPublishEditModel.creativeModel.transientPostPageModel;
        if (!c854860XgC.LJII && !c854860XgC.LJIJJ && (activity = videoPublishContainerScene.mActivity) != null && !activity.isFinishing()) {
            videoPublishContainerScene.LLLLIILL.creativeModel.transientPostPageModel.LJJII = false;
            videoPublishContainerScene.t();
        }
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.<init>$1L");
    }

    public static final void run$3(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultConvReadInfoHelper@9d10.loadAllConReadInfo$1$2");
        try {
            Iterator it2 = ((CopyOnWriteArraySet) ((DefaultConvReadInfoHelper) aRunnableS114S0100000_14.l0).LL.LJIIZILJ().getDomain().LIZ.LJIIIIZZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC870420YCq) it2.next()).LJIILIIL();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultConvReadInfoHelper@9d10.loadAllConReadInfo$1$2");
    }

    public static final void run$30(ARunnableS114S0100000_14 aRunnableS114S0100000_14) throws Throwable {
        C0ZI0 c0zi0 = (C0ZI0) aRunnableS114S0100000_14.l0;
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.onTextModeDescriptionFocusGained$1L$1L");
        if (!c0zi0.hasFocus()) {
            C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.onTextModeDescriptionFocusGained$1L$1L");
            return;
        }
        Editable editableP = C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLv4UZDPXIwqqgw5DImMExzz2B/44fJ/FnqiI=", null));
        if (editableP != null && editableP.length() != 0) {
            c0zi0.selectAll();
            C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.onTextModeDescriptionFocusGained$1L$1L");
        } else {
            C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.onTextModeDescriptionFocusGained$1L$1L");
        }
    }

    public static final void run$31(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS114S0100000_14.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.lambda$checkDraftMusicLegality$76$1L");
        videoPublishContainerScene.s("short_video_draft_music_legality");
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.lambda$checkDraftMusicLegality$76$1L");
    }

    public static final void run$32(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        C0ZI0 c0zi0 = (C0ZI0) aRunnableS114S0100000_14.l0;
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.onTextModeDescriptionFocusGained$1L");
        HandlerHook.viewPost(c0zi0, new ARunnableS114S0100000_14((Object) c0zi0, 30));
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.onTextModeDescriptionFocusGained$1L");
    }

    public static final void run$33(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        View view = (View) aRunnableS114S0100000_14.l0;
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.init$1L");
        if (view.getParent() != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder.messageRes(2131858126);
            C1390380mHk.LIZLLL(view, 2058, creativeToastBuilder);
        }
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.init$1L");
    }

    public static final void run$34(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS114S0100000_14.l0;
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.initOnActivityCreated$1L");
        videoPublishContainerScene.Y();
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.initOnActivityCreated$1L");
    }

    public static final void run$35(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS114S0100000_14.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.refreshAnchors$1L");
        C1430580nKa.LIZ(videoPublishContainerScene.LLLLIILL);
        List<CreateAnchorInfo> listLIZJ = C1429410nIh.LIZJ(videoPublishContainerScene.LLLLIILL);
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> list = videoPublishContainerScene.LLLLL;
        if (list != null) {
            Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ.callbackAnchors(listLIZJ);
            }
        }
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.refreshAnchors$1L");
    }

    public static final void run$36(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS114S0100000_14.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.performPublishReal$1L");
        videoPublishContainerScene.LLLLIILL.creativeModel.transientPostPageModel.LJJIIJZLJL = "click post";
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.performPublishReal$1L");
    }

    public static final void run$37(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS114S0100000_14.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.initOnActivityCreated$2L");
        oh.LIZIZ("tool_publish_page_after_first_frame", i5.LIZIZ(), -1L, new PerformanceMonitorCallbacks(videoPublishContainerScene, new C859080Xn0(new WeakReference(videoPublishContainerScene.LLLLIILL))));
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.initOnActivityCreated$2L");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$38(Y.ARunnableS114S0100000_14 r11) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS114S0100000_14.run$38(Y.ARunnableS114S0100000_14):void");
    }

    public static final void run$39(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS114S0100000_14.l0;
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.startProgressUpdateTask$1L");
        if (videoPublishContainerScene.LLZLLLL == null) {
            videoPublishContainerScene.Z();
        } else {
            C19GS c19gs = videoPublishContainerScene.LLLLLLZZ;
            if (c19gs != null) {
                c19gs.runOnUiThread(new ARunnableS114S0100000_14(videoPublishContainerScene, 38));
            }
        }
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.startProgressUpdateTask$1L");
    }

    public static final void run$4(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultConvReadInfoHelper@9d10.loadAllConReadInfo$1");
        try {
            aRunnableS114S0100000_14.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultConvReadInfoHelper@9d10.loadAllConReadInfo$1");
    }

    public static final void run$40(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("GroupTitleBarCenterAssem@3d9f.onViewCreated$1");
        try {
            try {
                ((GroupTitleBarCenterAssem) aRunnableS114S0100000_14.l0).init();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1721206oc.LIZ((GroupTitleBarCenterAssem) aRunnableS114S0100000_14.l0, e, "GroupTitleBar");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupTitleBarCenterAssem@3d9f.onViewCreated$1");
    }

    public static final void run$41(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("EffectTemplateCategoryFragment@9d8c.onViewCreated$2");
        try {
            ((EffectTemplateCategoryFragment) aRunnableS114S0100000_14.l0).oS();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.onViewCreated$2");
    }

    public static final void run$42(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("AccountPrivacySettingItemModel@9fe6.isClickFrequencyLimited$1");
        try {
            ((C109T) aRunnableS114S0100000_14.l0).LLILZLL = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AccountPrivacySettingItemModel@9fe6.isClickFrequencyLimited$1");
    }

    public static final void run$43(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BotSharePostPickerAssem@d1ce.renderListContent$1");
        try {
            ((BotSharePostPickerAssem) aRunnableS114S0100000_14.l0).Oo();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BotSharePostPickerAssem@d1ce.renderListContent$1");
    }

    public static final void run$44(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("TabletToast@1714.dismiss$1");
        try {
            ((C1390080mHG) aRunnableS114S0100000_14.l0).LJJIIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabletToast@1714.dismiss$1");
    }

    public static final void run$45(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("TabletToast@1714.show$1");
        try {
            ((C1390080mHG) aRunnableS114S0100000_14.l0).dismiss();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabletToast@1714.show$1");
    }

    public static final void run$46(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ClientWrapperBridgeImpl@2a44.beforeSDKLogin$1$1");
        try {
            ((C0Z4R) aRunnableS114S0100000_14.l0).getClass();
            C0Z4R.LJJIIJZLJL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientWrapperBridgeImpl@2a44.beforeSDKLogin$1$1");
    }

    public static final void run$47(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ClientWrapperBridgeImpl@2a44.onSDKLogout$1$1");
        try {
            ((C0Z4R) aRunnableS114S0100000_14.l0).LJJIIZI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientWrapperBridgeImpl@2a44.onSDKLogout$1$1");
    }

    public static final void run$48(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ClientWrapperBridgeImpl@2a44.onSDKLogout$1");
        try {
            IMFoundationBridgeApi.LIZ.getClass();
            IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
            if (iMFoundationBridgeApiLIZ != null && iMFoundationBridgeApiLIZ.LIZIZ()) {
                C823050WQl.LJFF().execute(new ARunnableS114S0100000_14((C0Z4R) aRunnableS114S0100000_14.l0, 47));
            } else {
                ((C0Z4R) aRunnableS114S0100000_14.l0).LJJIIZI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientWrapperBridgeImpl@2a44.onSDKLogout$1");
    }

    public static final void run$49(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("FpsResourceCollector@2aad.register$attach$1");
        try {
            aRunnableS114S0100000_14.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FpsResourceCollector@2aad.register$attach$1");
    }

    public static final void run$5(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("WaitDelConversationManager$FileCacheStore@f95e.init$1");
        try {
            aRunnableS114S0100000_14.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WaitDelConversationManager$FileCacheStore@f95e.init$1");
    }

    public static final void run$50(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BaseGroupCreationEditAssem@f686.setupTextField$2$1$1");
        try {
            if (((C0I7D) aRunnableS114S0100000_14.l0).getParent() != null) {
                KeyboardUtils.LIZLLL((C0I7D) aRunnableS114S0100000_14.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseGroupCreationEditAssem@f686.setupTextField$2$1$1");
    }

    public static final void run$51(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("GroupDetailDynamicDataAssem@4414.setUpList$1$1");
        try {
            ((View) aRunnableS114S0100000_14.l0).requestLayout();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupDetailDynamicDataAssem@4414.setUpList$1$1");
    }

    public static final void run$52(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("InboxLongPressManager@3e1f.sendPerformLongClickEvent$1");
        try {
            aRunnableS114S0100000_14.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxLongPressManager@3e1f.sendPerformLongClickEvent$1");
    }

    public static final void run$53(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("PublishScheduler@ecda.reStartPrePublishTask$1");
        try {
            ((C1433500nPI) aRunnableS114S0100000_14.l0).reStart();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishScheduler@ecda.reStartPrePublishTask$1");
    }

    public static final void run$54(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("PiVerifyAssem@f435.initObservers$14$1");
        try {
            ((PiVerifyAssem) aRunnableS114S0100000_14.l0).hp();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PiVerifyAssem@f435.initObservers$14$1");
    }

    public static final void run$55(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BaseAccountPrivacyItemComponent@9156.isClickFrequencyLimited$1");
        try {
            ((AbstractC191963108b) aRunnableS114S0100000_14.l0).LLIZLLLIL = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseAccountPrivacyItemComponent@9156.isClickFrequencyLimited$1");
    }

    public static final void run$56(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("EditGroupNameEditTextAssem@db9d.setUpLayoutChange$1$1$1");
        try {
            ((View) aRunnableS114S0100000_14.l0).requestLayout();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditGroupNameEditTextAssem@db9d.setUpLayoutChange$1$1$1");
    }

    public static final void run$57(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("EditGroupNameEditTextAssem@db9d.setUpLayoutChange$1$2$1");
        try {
            ((View) aRunnableS114S0100000_14.l0).requestLayout();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditGroupNameEditTextAssem@db9d.setUpLayoutChange$1$2$1");
    }

    public static final void run$58(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MessageRequestListAssemV2@40af.initSubscribe$7$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) ((MessageRequestListAssemV2) aRunnableS114S0100000_14.l0).LLJILLL.getValue();
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageRequestListAssemV2@40af.initSubscribe$7$1");
    }

    public static final void run$59(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MessageRequestTopBarAssem@b3fc.initTopBar$2$1");
        try {
            aRunnableS114S0100000_14.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageRequestTopBarAssem@b3fc.initTopBar$2$1");
    }

    public static final void run$6(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("WaitDelConversationManager$FileCacheStore@f95e.writeToSp$1");
        try {
            aRunnableS114S0100000_14.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WaitDelConversationManager$FileCacheStore@f95e.writeToSp$1");
    }

    public static final void run$60(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        C0ZI0 c0zi0 = (C0ZI0) aRunnableS114S0100000_14.l0;
        c0zi0.getClass();
        C1C7U.LIZ("HashTagMentionEditText@a45d.addHashtagEmoji$1L");
        c0zi0.LJJIIJ(c0zi0.LLLIILIL);
        C1C7U.LIZIZ("HashTagMentionEditText@a45d.addHashtagEmoji$1L");
    }

    public static final void run$61(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        C0ZI0 c0zi0 = (C0ZI0) aRunnableS114S0100000_14.l0;
        c0zi0.getClass();
        C1C7U.LIZ("HashTagMentionEditText@a45d.addHashtagEmoji$2L");
        c0zi0.LJJIIJ(c0zi0.LLLLIILL);
        C1C7U.LIZIZ("HashTagMentionEditText@a45d.addHashtagEmoji$2L");
    }

    public static final void run$62(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        C0ZI0 c0zi0 = (C0ZI0) aRunnableS114S0100000_14.l0;
        c0zi0.getClass();
        C1C7U.LIZ("HashTagMentionEditText@a45d.addHashtagEmoji$4L");
        c0zi0.setCursorVisible(true);
        C1C7U.LIZIZ("HashTagMentionEditText@a45d.addHashtagEmoji$4L");
    }

    public static final void run$63(ARunnableS114S0100000_14 aRunnableS114S0100000_14) throws Throwable {
        C0ZI1 c0zi1 = (C0ZI1) aRunnableS114S0100000_14.l0;
        c0zi1.getClass();
        C1C7U.LIZ("HashTagMentionEditText$RefreshTextWatcher@adf4.afterTextChanged$1L");
        c0zi1.LLILZ.LJJJI(false);
        C1C7U.LIZIZ("HashTagMentionEditText$RefreshTextWatcher@adf4.afterTextChanged$1L");
    }

    public static final void run$64(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMTextLongClickUtilsKt@c6b0.customizeAction$1$invoke$$inlined$postDelayed$1");
        try {
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                iChatCustomizeHelperLIZ.openCustomizeFragment(((C869590Y9l) aRunnableS114S0100000_14.l0).getConversationId(), C0ZDX.LJJIJIIJIL((C869590Y9l) aRunnableS114S0100000_14.l0), (InterfaceC2257971DZj) new InterfaceC2257971DZj() { // from class: X.0Z1C
                    @Override // X.InterfaceC2257971DZj
                    public final String getEnterMethod() {
                        return "long_press_chat_bubble";
                    }
                }, false, "settable");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMTextLongClickUtilsKt@c6b0.customizeAction$1$invoke$$inlined$postDelayed$1");
    }

    public static final void run$65(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BaseEditGroupInfoAssem@f585.setupViews$2$1$1");
        try {
            if (((C0I7D) aRunnableS114S0100000_14.l0).getParent() != null) {
                KeyboardUtils.LIZLLL((C0I7D) aRunnableS114S0100000_14.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseEditGroupInfoAssem@f585.setupViews$2$1$1");
    }

    public static final void run$7(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("WaitDelMessageManager$FileCacheStore@965e.writeToSp$1");
        try {
            aRunnableS114S0100000_14.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WaitDelMessageManager$FileCacheStore@965e.writeToSp$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$8(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("UnFoldBtnViewHolder@2e54.onBind$1$1");
        try {
            ((View) ((C259800zU) aRunnableS114S0100000_14.l0).element).requestFocus();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UnFoldBtnViewHolder@2e54.onBind$1$1");
    }

    public static final void run$9(ARunnableS114S0100000_14 aRunnableS114S0100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BotSharePostPickerAssem@d1ce.initList$1$gridLayoutManager$1$onLayoutCompleted$1");
        try {
            ((BotSharePostPickerAssem) aRunnableS114S0100000_14.l0).Oo();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BotSharePostPickerAssem@d1ce.initList$1$gridLayoutManager$1$onLayoutCompleted$1");
    }

    public ARunnableS114S0100000_14(View view, int i) {
        this.$t = i;
        switch (i) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case 51:
            case 56:
            case 57:
                this.l0 = view;
                break;
            default:
                this.l0 = view;
                break;
        }
    }

    public ARunnableS114S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
