package Y;

import X.AbstractC940410aZz;
import X.C01EX;
import X.C09JN;
import X.C0UVC;
import X.C1117360fBO;
import X.C1631550sYj;
import X.C1954807lC;
import X.C1AZW;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C341701Uh;
import X.C443120HZe;
import X.C470590Icr;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501540Jlg;
import X.C766270U4b;
import X.C917520Zz4;
import X.C923650a8x;
import X.C924630aAX;
import X.C925240aBW;
import X.C930510aK1;
import X.C936100aT2;
import X.C936110aT3;
import X.C936140aT6;
import X.C939600aYg;
import X.C939740aYu;
import X.C940390aZx;
import X.C940400aZy;
import X.C940490aa7;
import X.C944270agD;
import X.C963140bAe;
import X.C974540bT2;
import X.C977570bXv;
import X.C977610bXz;
import X.C985300bkO;
import X.C986440bmE;
import X.EnumC1303240k1C;
import X.EnumC919170a1j;
import X.InterfaceC937900aVw;
import X.InterfaceC944250agB;
import X.RunnableC514801zW;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.matching.view.IndividualMatchQuitRequestContract$AbsView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multihost.event.MultiLivePermitChannel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.MultiGuestAnchorPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AfS5S0100100_15 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        boolean z;
        C1C7U.LIZ("IndividualMatchInviterCoordinator@dd3e.requestCancelApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJJJZI(afS5S0100100_15.j1, th, ((C977570bXv) afS5S0100100_15.l0).LJFF, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
        C0UVC.LIZIZ(th);
        C977570bXv c977570bXv = (C977570bXv) afS5S0100100_15.l0;
        C986440bmE c986440bmE = c977570bXv.LJIILJJIL;
        if (c986440bmE != null) {
            c986440bmE.LIZIZ();
        }
        if (!c977570bXv.LJ) {
            C977610bXz c977610bXz = c977570bXv.LIZLLL;
            if (c977610bXz != null) {
                c977610bXz.LJIIJJI.setValue(Boolean.FALSE);
            }
            if (th instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                    C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                } else if (c501470JlZ.getErrorCode() == 4004048) {
                    C766270U4b.LIZLLL(2131842762);
                } else {
                    C766270U4b.LIZLLL(2131852422);
                }
                if (c501470JlZ.getErrorCode() == 4004048) {
                    z = true;
                }
                c977570bXv.LJIIL.invoke(Boolean.valueOf(z));
            } else {
                C766270U4b.LIZLLL(2131852422);
            }
            z = false;
            c977570bXv.LJIIL.invoke(Boolean.valueOf(z));
        }
        C1C7U.LIZIZ("IndividualMatchInviterCoordinator@dd3e.requestCancelApi$dispose$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        C1C7U.LIZ("MultiGuestV3GuestPresenter@ae69.getListByTypeWithAppLog$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jLIZIZ = C963140bAe.LIZIZ() - afS5S0100100_15.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C01EX.LIZLLL(jLIZIZ, "list_by_type", str, null);
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null) {
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = (MultiGuestV3GuestPresenter) afS5S0100100_15.l0;
            ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList.onLineUsers;
            if (arrayList != null) {
                multiGuestV3GuestPresenter.getMultiGuestDataHolder().LJJJ = arrayList;
            }
            multiGuestV3GuestPresenter.setSelfGift2AnchorScore(multiLiveGuestInfoList.requestUserGiftScore);
            DataChannel dataChannel = multiGuestV3GuestPresenter.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(MultiGuestGuestSelfSendGiftData.class, Long.valueOf(multiLiveGuestInfoList.requestUserGiftScore));
            }
        }
        C1C7U.LIZIZ("MultiGuestV3GuestPresenter@ae69.getListByTypeWithAppLog$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList;
        C1C7U.LIZ("VoiceChatFeedHandler@c45.onLinkedListChange$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jLIZIZ = C963140bAe.LIZIZ() - afS5S0100100_15.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C01EX.LIZLLL(jLIZIZ, "list_by_type", str, null);
        ((LinkedHashMap) ((C940390aZx) afS5S0100100_15.l0).LLILZIL).clear();
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null) {
            C940390aZx c940390aZx = (C940390aZx) afS5S0100100_15.l0;
            for (LinkPlayerInfo linkPlayerInfo : arrayList) {
                c940390aZx.LLILZIL.put(linkPlayerInfo.mInteractIdStr, linkPlayerInfo);
            }
        }
        C940390aZx c940390aZx2 = (C940390aZx) afS5S0100100_15.l0;
        CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayListLIZ = c940390aZx2.LIZ();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC940410aZz abstractC940410aZz : copyOnWriteArrayListLIZ) {
            if (abstractC940410aZz instanceof C940400aZy) {
                arrayList2.add(abstractC940410aZz);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c940390aZx2.LJ((C940400aZy) it2.next(), "");
        }
        C1C7U.LIZIZ("VoiceChatFeedHandler@c45.onLinkedListChange$1");
    }

    public static final void accept$11(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        Context context;
        C1C7U.LIZ("VoiceChatFeedHandler@c45.onLinkedListChange$2");
        Throwable th = (Throwable) obj;
        C01EX.LIZIZ(th, "list_by_type", null, C963140bAe.LIZIZ() - afS5S0100100_15.j1);
        C940490aa7 c940490aa7 = ((C940390aZx) afS5S0100100_15.l0).LLJILLL;
        if (c940490aa7 != null) {
            context = c940490aa7.LIZJ;
        } else {
            context = null;
        }
        C501540Jlg.LIZJ(context, th);
        C1C7U.LIZIZ("VoiceChatFeedHandler@c45.onLinkedListChange$2");
    }

    public static final void accept$12(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C1C7U.LIZ("TwoMatchMatchingCoordinator@caf2.presentQuitRequest$1");
        C470590Icr<Unit> c470590Icr = (C470590Icr) obj;
        C974540bT2.LIZ.LJLJI(afS5S0100100_15.j1, c470590Icr);
        Function1 function1 = (Function1) afS5S0100100_15.l0;
        if (function1 != null) {
            function1.invoke(c470590Icr);
        }
        C1C7U.LIZIZ("TwoMatchMatchingCoordinator@caf2.presentQuitRequest$1");
    }

    public static final void accept$13(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C1C7U.LIZ("TwoMatchMatchingCoordinator@caf2.presentQuitRequest$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJLILLLLZI(afS5S0100100_15.j1, th);
        if (th instanceof C501470JlZ) {
            C473410IhP.LIZIZ(new RunnableC514801zW(th, 179));
        }
        Function1 function1 = (Function1) afS5S0100100_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("TwoMatchMatchingCoordinator@caf2.presentQuitRequest$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList;
        int size;
        List<LinkUser> listLJIIIZ;
        C1C7U.LIZ("MultiGuestV3FeedMaskWindowHandler@ca0c.onLinkedListChange$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jLIZIZ = C963140bAe.LIZIZ() - afS5S0100100_15.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C01EX.LIZLLL(jLIZIZ, "list_by_type", str, null);
        ((LinkedHashMap) ((C939600aYg) afS5S0100100_15.l0).LLJIJIL).clear();
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null) {
            C939600aYg c939600aYg = (C939600aYg) afS5S0100100_15.l0;
            for (LinkPlayerInfo linkPlayerInfo : arrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("online users ");
                sbLIZ.append(linkPlayerInfo.mInteractIdStr);
                C939600aYg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                c939600aYg.LLJIJIL.put(linkPlayerInfo.mInteractIdStr, linkPlayerInfo);
                CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayList = c939600aYg.LL;
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC940410aZz abstractC940410aZz : copyOnWriteArrayList) {
                    if (abstractC940410aZz instanceof C939740aYu) {
                        arrayList2.add(abstractC940410aZz);
                    }
                }
                ArrayList<C939740aYu> arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (Intrinsics.LJFF(((C939740aYu) obj2).LLJILLL, linkPlayerInfo.mInteractIdStr)) {
                        arrayList3.add(obj2);
                    }
                }
                for (C939740aYu c939740aYu : arrayList3) {
                    int i = c939600aYg.LLJ;
                    InterfaceC937900aVw interfaceC937900aVw = c939600aYg.LLIZLLLIL;
                    boolean z = false;
                    if (interfaceC937900aVw != null && (listLJIIIZ = interfaceC937900aVw.LJIIIZ()) != null) {
                        size = listLJIIIZ.size();
                    } else {
                        size = 0;
                    }
                    boolean zLJI = c939600aYg.LJI();
                    c939600aYg.LJFF();
                    String str2 = ((MultiLiveGuestInfoList) baseResponse.data).fanTicketIconUrl;
                    int i2 = 1;
                    if (c939740aYu.LLJJIJI == null) {
                        z = true;
                    }
                    c939740aYu.LLJJIJI = linkPlayerInfo;
                    c939740aYu.LLLJL = str2;
                    if (z) {
                        c939740aYu.LJJII(size, zLJI);
                        c939740aYu.LJIILLIIL(i, c939740aYu.LLJJIJIIJIL, c939740aYu.LLJLLIL);
                        if (c939740aYu.LLJLLL) {
                            i2 = 2;
                        }
                        c939740aYu.changeOnlineUserState(i2);
                    }
                }
            }
        }
        C1C7U.LIZIZ("MultiGuestV3FeedMaskWindowHandler@ca0c.onLinkedListChange$1");
    }

    public static final void accept$15(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        Context context;
        C1C7U.LIZ("MultiGuestV3FeedMaskWindowHandler@ca0c.onLinkedListChange$2");
        Throwable th = (Throwable) obj;
        C01EX.LIZIZ(th, "list_by_type", null, C963140bAe.LIZIZ() - afS5S0100100_15.j1);
        C940490aa7 c940490aa7 = ((C939600aYg) afS5S0100100_15.l0).LLJJIJI;
        if (c940490aa7 != null) {
            context = c940490aa7.LIZJ;
        } else {
            context = null;
        }
        C501540Jlg.LIZJ(context, th);
        C1C7U.LIZIZ("MultiGuestV3FeedMaskWindowHandler@ca0c.onLinkedListChange$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        ArrayList<LinkPlayerInfo> arrayList;
        MultiGuestDataHolder multiGuestDataHolder;
        C1C7U.LIZ("VoiceChatWatchPresenter@8e7f.getListByTypeWithAppLog$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jLIZIZ = C963140bAe.LIZIZ() - afS5S0100100_15.j1;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C01EX.LIZLLL(jLIZIZ, "list_by_type", str, null);
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null && (multiGuestDataHolder = ((C923650a8x) afS5S0100100_15.l0).getMultiGuestDataHolder()) != null) {
            multiGuestDataHolder.LJJJ = arrayList;
        }
        C1C7U.LIZIZ("VoiceChatWatchPresenter@8e7f.getListByTypeWithAppLog$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$17(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        DataChannel dataChannel;
        C944270agD c944270agD = (C944270agD) afS5S0100100_15.l0;
        final long j = afS5S0100100_15.j1;
        final BaseResponse baseResponse = (BaseResponse) obj;
        c944270agD.getClass();
        final long jLIZIZ = C963140bAe.LIZIZ();
        C917520Zz4.LIZIZ(new Runnable() { // from class: X.01EQ
            public final void LIZ() {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                MultiGuestAnchorPermissionResponse multiGuestAnchorPermissionResponse;
                MultiGuestAnchorPermissionResponse multiGuestAnchorPermissionResponse2;
                MultiGuestPermissionInfo multiGuestPermissionInfo2;
                MultiGuestAnchorPermissionResponse multiGuestAnchorPermissionResponse3;
                BaseResponse<MultiGuestAnchorPermissionResponse, CheckPermissionExtra> baseResponse2 = baseResponse;
                int i = 1;
                if (baseResponse2 == null || (multiGuestAnchorPermissionResponse3 = baseResponse2.data) == null) {
                    boolValueOf = null;
                } else {
                    MultiGuestPermissionInfo multiGuestPermissionInfo3 = multiGuestAnchorPermissionResponse3.permissionInfo;
                    boolValueOf = Boolean.valueOf(multiGuestPermissionInfo3 != null && multiGuestPermissionInfo3.flag);
                }
                boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                BaseResponse<MultiGuestAnchorPermissionResponse, CheckPermissionExtra> baseResponse3 = baseResponse;
                Long lValueOf = (baseResponse3 == null || (multiGuestAnchorPermissionResponse2 = baseResponse3.data) == null || (multiGuestPermissionInfo2 = multiGuestAnchorPermissionResponse2.permissionInfo) == null) ? null : Long.valueOf(multiGuestPermissionInfo2.errCode);
                BaseResponse<MultiGuestAnchorPermissionResponse, CheckPermissionExtra> baseResponse4 = baseResponse;
                if (baseResponse4 == null || (multiGuestAnchorPermissionResponse = baseResponse4.data) == null) {
                    boolValueOf2 = null;
                } else {
                    MultiGuestPermissionInfo multiGuestPermissionInfo4 = multiGuestAnchorPermissionResponse.permissionInfo;
                    boolValueOf2 = Boolean.valueOf(multiGuestPermissionInfo4 != null && multiGuestPermissionInfo4.flag);
                }
                if (!C500260Jjc.LJJJI(boolValueOf2)) {
                    i = 0;
                } else if (lValueOf != null && lValueOf.longValue() == 4003036) {
                    i = 2;
                }
                Long lValueOf2 = Long.valueOf(jLIZIZ - j);
                BaseResponse<MultiGuestAnchorPermissionResponse, CheckPermissionExtra> baseResponse5 = baseResponse;
                C924640aAY.LIZLLL("anchor_host_permission_request", zLJJJI ? 1 : 0, i, lValueOf, 0, lValueOf2, baseResponse5 != null ? baseResponse5.LIZIZ : null);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiLiveAnchorPermissionLogger@7d57.logAnchorHostPermissionRequestSuccess$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiLiveAnchorPermissionLogger@7d57.logAnchorHostPermissionRequestSuccess$1");
            }
        });
        T t = baseResponse.data;
        if (t != 0 && (multiGuestPermissionInfo = ((MultiGuestAnchorPermissionResponse) t).permissionInfo) != null && multiGuestPermissionInfo.flag) {
            ((InterfaceC944250agB) c944270agD.mView).NL2(true);
            C924630aAX.LJIJJ(null, true);
            MultiGuestPermissionInfo multiGuestPermissionInfo2 = ((MultiGuestAnchorPermissionResponse) baseResponse.data).permissionInfo;
            long j2 = multiGuestPermissionInfo2.errCode;
            if (j2 == 4003036 && (dataChannel = c944270agD.dataChannel) != null) {
                dataChannel.zW(MultiLivePermitChannel.class, new C930510aK1(true, multiGuestPermissionInfo2.noPermissionPrompt, (int) j2));
                return;
            }
            return;
        }
        ((InterfaceC944250agB) c944270agD.mView).NL2(false);
        C924630aAX.LJIJJ(null, false);
    }

    public static final void accept$18(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C944270agD c944270agD = (C944270agD) afS5S0100100_15.l0;
        final long j = afS5S0100100_15.j1;
        final Throwable th = (Throwable) obj;
        c944270agD.getClass();
        final long jLIZIZ = C963140bAe.LIZIZ();
        C917520Zz4.LIZIZ(new Runnable() { // from class: X.01EN
            public final void LIZ() {
                long j2 = jLIZIZ - j;
                Throwable th2 = th;
                int errorCode = th2 instanceof C501470JlZ ? ((C501520Jle) th2).getErrorCode() : 1;
                Throwable th3 = th;
                C924640aAY.LIZLLL("anchor_host_permission_request", 0, 0, null, Integer.valueOf(errorCode), Long.valueOf(j2), th3 instanceof C477520Io2 ? ((C477520Io2) th3).getxTtLogId() : null);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiLiveAnchorPermissionLogger@7d57.logAnchorHostPermissionRequestFail$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiLiveAnchorPermissionLogger@7d57.logAnchorHostPermissionRequestFail$1");
            }
        });
        ((InterfaceC944250agB) c944270agD.mView).NL2(false);
        C925240aBW.LJIILL("multi-guest", th);
        C924630aAX.LJIJJ(th, false);
    }

    public static final void accept$2(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C1C7U.LIZ("MultiGuestV3GuestBeInvitedDialog@2a55.startDismissDialogCountDown$1");
        Long l = (Long) obj;
        ((MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0).dialogStayDuration = l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long jLongValue = l.longValue();
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0;
        if (jLongValue > multiGuestV3GuestBeInvitedDialog.maxCountDownValue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ.append("_MultiGuestV3GuestBeInvitedDialog_");
            sbLIZ.append(424);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("maxCountDownValue:");
            sbLIZ2.append(((MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0).maxCountDownValue);
            sbLIZ2.append(", current countdownValue:");
            sbLIZ2.append(l);
            sbLIZ2.append(", it > max, just return");
            C1AZW.LJFF(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            ((MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0).aS();
        } else {
            TextView textView = multiGuestV3GuestBeInvitedDialog.declineBtn;
            if (textView != null) {
                textView.setText(C341701Uh.LIZ(C497740JfY.LJIJI(2131843465), Long.valueOf(((MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0).maxCountDownValue - l.longValue())));
            }
            if (l.longValue() == ((MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0).maxCountDownValue) {
                C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "dismissCountDown finish, dismiss dialog");
                ((MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0).aS();
            }
            if (l.longValue() == afS5S0100100_15.j1) {
                ((MultiGuestV3GuestBeInvitedDialog) afS5S0100100_15.l0).UR();
            }
        }
        C1C7U.LIZIZ("MultiGuestV3GuestBeInvitedDialog@2a55.startDismissDialogCountDown$1");
    }

    public static final void accept$3(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        Long first;
        C1C7U.LIZ("MainRecordBeautyLogicComponent@6a00.monitorAndReportOneClickMode$2");
        Pair pair = (Pair) obj;
        Long l = (Long) pair.getFirst();
        pair.getSecond();
        C1631550sYj c1631550sYj = (C1631550sYj) afS5S0100100_15.l0;
        long j = afS5S0100100_15.j1;
        Pair<Long, Boolean> pair2 = c1631550sYj.LLLI;
        if (pair2 != null) {
            first = pair2.getFirst();
        } else {
            first = null;
        }
        c1631550sYj.F4(j, first, ((C1631550sYj) afS5S0100100_15.l0).LLLII, l.longValue());
        C1C7U.LIZIZ("MainRecordBeautyLogicComponent@6a00.monitorAndReportOneClickMode$2");
    }

    public static final void accept$4(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        Long first;
        C1C7U.LIZ("MainRecordBeautyLogicComponent@6a00.monitorAndReportPanelMode$2");
        C443120HZe c443120HZe = (C443120HZe) obj;
        Long l = (Long) c443120HZe.getFirst();
        c443120HZe.getSecond();
        c443120HZe.getThird();
        C1631550sYj c1631550sYj = (C1631550sYj) afS5S0100100_15.l0;
        long j = afS5S0100100_15.j1;
        Pair<Long, Boolean> pair = c1631550sYj.LLLI;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        c1631550sYj.F4(j, first, ((C1631550sYj) afS5S0100100_15.l0).LLLII, l.longValue());
        C1C7U.LIZIZ("MainRecordBeautyLogicComponent@6a00.monitorAndReportPanelMode$2");
    }

    public static final void accept$5(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        List<?> list;
        List<?> list2;
        C1C7U.LIZ("MultiGuestCreateAvatarFragment@ace6.startToStylize$2");
        C936140aT6 c936140aT6 = (C936140aT6) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stylize id:");
        sbLIZ.append(afS5S0100100_15.j1);
        sbLIZ.append(" state:");
        sbLIZ.append(c936140aT6);
        C20441214yg.LIZIZ("MultiGuestCreateAvatarFragment", C2188811AlT.LIZIZ(sbLIZ));
        int i = C936110aT3.LIZ[c936140aT6.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1117360fBO c1117360fBO = ((MultiGuestCreateAvatarFragment) afS5S0100100_15.l0).LLJILJIL;
                    if (c1117360fBO != null && (list2 = c1117360fBO.LL) != null) {
                        Pair pairLJI = C500260Jjc.LJI(list2, new AwS30S0000100_15(afS5S0100100_15.j1, 9));
                        MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = (MultiGuestCreateAvatarFragment) afS5S0100100_15.l0;
                        Object first = pairLJI.getFirst();
                        if (first instanceof C936100aT2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("stylize index:");
                            sbLIZ2.append(((Number) pairLJI.getSecond()).intValue());
                            sbLIZ2.append(" progress:");
                            sbLIZ2.append(c936140aT6.LIZIZ);
                            C20441214yg.LIZIZ("MultiGuestCreateAvatarFragment", C2188811AlT.LIZIZ(sbLIZ2));
                            C936100aT2 c936100aT2 = (C936100aT2) first;
                            c936100aT2.LIZLLL = true;
                            c936100aT2.LJ = c936140aT6.LIZIZ;
                            c936100aT2.LIZJ = false;
                            C1117360fBO c1117360fBO2 = multiGuestCreateAvatarFragment.LLJILJIL;
                            if (c1117360fBO2 != null) {
                                c1117360fBO2.notifyItemChanged(((Number) pairLJI.getSecond()).intValue());
                            }
                        }
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                ((MultiGuestCreateAvatarFragment) afS5S0100100_15.l0).SR(afS5S0100100_15.j1);
            }
        } else {
            ((MultiGuestCreateAvatarFragment) afS5S0100100_15.l0).LLJJ.put(Long.valueOf(afS5S0100100_15.j1), c936140aT6.LIZJ);
            long j = afS5S0100100_15.j1;
            Long l = ((MultiGuestCreateAvatarFragment) afS5S0100100_15.l0).LLJJIJIIJIL;
            if (l != null && j == l.longValue()) {
                ((MultiGuestCreateAvatarFragment) afS5S0100100_15.l0).MR(afS5S0100100_15.j1, c936140aT6.LIZJ);
            }
            C1117360fBO c1117360fBO3 = ((MultiGuestCreateAvatarFragment) afS5S0100100_15.l0).LLJILJIL;
            if (c1117360fBO3 != null && (list = c1117360fBO3.LL) != null) {
                Pair pairLJI2 = C500260Jjc.LJI(list, new AwS30S0000100_15(afS5S0100100_15.j1, 8));
                MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment2 = (MultiGuestCreateAvatarFragment) afS5S0100100_15.l0;
                Object first2 = pairLJI2.getFirst();
                if (first2 instanceof C936100aT2) {
                    C936100aT2 c936100aT22 = (C936100aT2) first2;
                    c936100aT22.LIZLLL = false;
                    c936100aT22.LJ = 0;
                    c936100aT22.LIZJ = false;
                    C1117360fBO c1117360fBO4 = multiGuestCreateAvatarFragment2.LLJILJIL;
                    if (c1117360fBO4 != null) {
                        c1117360fBO4.notifyItemChanged(((Number) pairLJI2.getSecond()).intValue());
                    }
                }
            }
        }
        C1C7U.LIZIZ("MultiGuestCreateAvatarFragment@ace6.startToStylize$2");
    }

    public static final void accept$6(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C1C7U.LIZ("MatchMatchingCoordinator@f28c.presentQuitRequest$1");
        C470590Icr<Unit> c470590Icr = (C470590Icr) obj;
        C974540bT2.LIZ.LJLJI(afS5S0100100_15.j1, c470590Icr);
        Function1 function1 = (Function1) afS5S0100100_15.l0;
        if (function1 != null) {
            function1.invoke(c470590Icr);
        }
        C1C7U.LIZIZ("MatchMatchingCoordinator@f28c.presentQuitRequest$1");
    }

    public static final void accept$7(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C1C7U.LIZ("MatchMatchingCoordinator@f28c.presentQuitRequest$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJLILLLLZI(afS5S0100100_15.j1, th);
        if (th instanceof C501470JlZ) {
            C473410IhP.LIZIZ(new RunnableC514801zW(th, 102));
        }
        Function1 function1 = (Function1) afS5S0100100_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("MatchMatchingCoordinator@f28c.presentQuitRequest$2");
    }

    public static final void accept$8(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C1C7U.LIZ("IndividualMatchQuitRequestPresenter@d289.approveRequest$1");
        C974540bT2.LIZ.LJLIIIL(afS5S0100100_15.j1, (C470590Icr) obj);
        ((C985300bkO) afS5S0100100_15.l0).LJIILIIL();
        IndividualMatchQuitRequestContract$AbsView individualMatchQuitRequestContract$AbsView = (IndividualMatchQuitRequestContract$AbsView) ((C985300bkO) afS5S0100100_15.l0).LL;
        if (individualMatchQuitRequestContract$AbsView != null) {
            individualMatchQuitRequestContract$AbsView.dismiss();
        }
        C1C7U.LIZIZ("IndividualMatchQuitRequestPresenter@d289.approveRequest$1");
    }

    public static final void accept$9(AfS5S0100100_15 afS5S0100100_15, Object obj) {
        C1C7U.LIZ("IndividualMatchQuitRequestPresenter@d289.rejectRequest$1");
        C470590Icr<Unit> c470590Icr = (C470590Icr) obj;
        ((C985300bkO) afS5S0100100_15.l0).LJIILIIL();
        IndividualMatchQuitRequestContract$AbsView individualMatchQuitRequestContract$AbsView = (IndividualMatchQuitRequestContract$AbsView) ((C985300bkO) afS5S0100100_15.l0).LL;
        if (individualMatchQuitRequestContract$AbsView != null) {
            individualMatchQuitRequestContract$AbsView.dismiss();
        }
        C974540bT2.LIZ.LJLIIIL(afS5S0100100_15.j1, c470590Icr);
        C1C7U.LIZIZ("IndividualMatchQuitRequestPresenter@d289.rejectRequest$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS5S0100100_15(long r2, X.C985300bkO r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 8 - r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r4
            r0.j1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.j1 = r2
            r0.l0 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS5S0100100_15.<init>(long, X.0bkO, int):void");
    }

    public AfS5S0100100_15(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
