package X;

import Y.AObjectS360S0100000_17;
import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.LiveCommentAddPullStreamDataSetting;
import com.bytedance.android.live.CommentService;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.OpenGiftVerifyEvent;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.room.ChatMessageRemoveEvent;
import com.bytedance.android.live.room.SeiTimerChannel;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.ChatExtra;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetExitRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSendMessageBadgeShowSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114360f6Y extends AbstractC945390ai1<InterfaceC1114450f6h> implements OnMessageListener {
    public Room LLILLJJLI;
    public C11NJ LLILLL;
    public boolean LL = true;
    public Boolean LLILZ = Boolean.FALSE;
    public final boolean LLILZIL = LiveSendMessageBadgeShowSetting.getValue();

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        super.detachView();
        C11NJ c11nj = this.LLILLL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILLL = null;
        C925000aB8 c925000aB8 = C963910bBt.LIZ;
        C963910bBt.LIZIZ = null;
        C963910bBt.LIZ.LLILLL = 0;
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC1114450f6h interfaceC1114450f6h) {
        super.attachView(interfaceC1114450f6h);
        this.LLILLJJLI = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LL = true;
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
            this.mMessageManager.addMessageListener(C001A.GIFT_GUIDE_MESSAGE.getIntType(), this);
        }
        C11NJ c11nj = this.LLILLL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        C11NJ c11nj2 = new C11NJ();
        this.LLILLL = c11nj2;
        c11nj2.LIZ(C784440Upu.LIZ().LJ(ISendCommentEvent.class).LJJLJLI(new AfS186S0100000_17(this, 28)));
        DataChannel dataChannel = this.dataChannel;
        if ((dataChannel != null && ((Boolean) dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue()) || LivePreloadInteractionLayerSetting.INSTANCE.isDisablePreload(this.dataChannel)) {
            C925000aB8 c925000aB8 = C963910bBt.LIZ;
            C963910bBt.LIZIZ = this.LLILLJJLI;
            C963910bBt.LIZJ();
        }
        this.dataChannel.BQ2((LifecycleOwner) this.mView, SeiTimerChannel.class, new AObjectS360S0100000_17(this, 20));
    }

    public final void LJJJJLL(C1114470f6j c1114470f6j) {
        String str;
        if (this.LLILLL != null && !TextUtils.isEmpty(c1114470f6j.LIZ) && this.LL) {
            if (c1114470f6j.LIZJ.get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
                str = (String) c1114470f6j.LIZJ.get("live.intent.extra.ENTER_LIVE_SOURCE");
            } else {
                str = null;
            }
            this.LL = false;
            C11NJ c11nj = this.LLILLL;
            String str2 = c1114470f6j.LIZ;
            long id = this.LLILLJJLI.getId();
            String requestId = this.LLILLJJLI.getRequestId();
            String labels = this.LLILLJJLI.getLabels();
            C0IXY c0ixyLIZIZ = C0IXW.LIZIZ(null, this.dataChannel, "");
            C480460Ism.LIZ().getClass();
            c11nj.LIZ(((CommentApi) C480460Ism.LIZLLL(CommentApi.class)).sendBarrage(C1115670f8f.LIZ(0, id, c0ixyLIZIZ, str2, null, requestId, labels, str, null, null, null, null, null, null, false, false)).LJIILIIL(new C0UO0()).LJJLL(new AfS153S0200000_17(c1114470f6j, this, 2), new AfS153S0200000_17(c1114470f6j, this, 3)));
            return;
        }
        C784440Upu.LIZ().LIZIZ(new C1114490f6l(c1114470f6j, false));
    }

    public final void LJJJLIIL(boolean z) {
        String str;
        if (z) {
            EnumC1102750enp.GIFT.show(this.dataChannel);
            this.dataChannel.FQ2(OpenGiftVerifyEvent.class);
        } else {
            EnumC1102750enp.GIFT.hide(this.dataChannel);
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gift icon status changed, visiable:");
        sbLIZ.append(z);
        sbLIZ.append(", reason:CommentPresenter sendGiftVisibilityCommand");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("ttlive_gift", strLIZIZ);
        HashMap map = new HashMap();
        map.put("event_name", "TOOLBAR_GIFT_ON_COMMAND");
        if (z) {
            str = "VISIBLE";
        } else {
            str = "GONE";
        }
        map.put("view_status", str);
        C1143300frE.LJIIJJI().LIZIZ("ttlive_gift", map);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        RoomAuthStatus roomAuthStatus4;
        RoomAuthStatus roomAuthStatus5;
        RoomAuthStatus roomAuthStatus6;
        RoomAuthStatus roomAuthStatus7;
        RoomAuthStatus roomAuthStatus8;
        T t = this.mView;
        if (t != 0 && iMessage != null && (iMessage instanceof RoomVerifyMessage)) {
            int i = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i != 12) {
                if (i == 13) {
                    Room room = this.LLILLJJLI;
                    if (room == null || (roomAuthStatus2 = room.mRoomAuthStatus) == null) {
                        return;
                    }
                    roomAuthStatus2.enableDigg = true;
                    return;
                }
                switch (i) {
                    case 3:
                        Room room2 = this.LLILLJJLI;
                        if (room2 != null && (roomAuthStatus3 = room2.mRoomAuthStatus) != null) {
                            roomAuthStatus3.setEnableChat(false);
                        }
                        C963910bBt.LIZJ();
                        ((InterfaceC1114450f6h) this.mView).Mh1(false);
                        CommentSwitchSettings commentSwitchSettings = new CommentSwitchSettings();
                        commentSwitchSettings.chat = 2;
                        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Jz(commentSwitchSettings, this.dataChannel);
                        break;
                    case 4:
                        Room room3 = this.LLILLJJLI;
                        if (room3 != null && (roomAuthStatus4 = room3.mRoomAuthStatus) != null) {
                            roomAuthStatus4.setEnableChat(true);
                        }
                        C963910bBt.LIZJ();
                        CommentSwitchSettings commentSwitchSettings2 = new CommentSwitchSettings();
                        commentSwitchSettings2.chat = 1;
                        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Jz(commentSwitchSettings2, this.dataChannel);
                        ((InterfaceC1114450f6h) this.mView).Mh1(true);
                        break;
                    case 5:
                        Room room4 = this.LLILLJJLI;
                        if (room4 != null && (roomAuthStatus5 = room4.mRoomAuthStatus) != null) {
                            roomAuthStatus5.enableDanmaku = false;
                        }
                        ((InterfaceC1114450f6h) t).PQ0(false);
                        break;
                    case 6:
                        Room room5 = this.LLILLJJLI;
                        if (room5 != null && (roomAuthStatus6 = room5.mRoomAuthStatus) != null) {
                            roomAuthStatus6.enableDanmaku = true;
                        }
                        ((InterfaceC1114450f6h) t).PQ0(true);
                        break;
                    case 7:
                        Room room6 = this.LLILLJJLI;
                        if (room6 != null && (roomAuthStatus7 = room6.mRoomAuthStatus) != null) {
                            roomAuthStatus7.enableGift = false;
                        }
                        LJJJLIIL(false);
                        break;
                    case 8:
                        Room room7 = this.LLILLJJLI;
                        if (room7 == null || room7.getOwner() == null || this.LLILLJJLI.getOwner().getSecret() != 1) {
                            Room room8 = this.LLILLJJLI;
                            if (room8 != null && (roomAuthStatus8 = room8.mRoomAuthStatus) != null) {
                                roomAuthStatus8.enableGift = true;
                            }
                            LJJJLIIL(true);
                        }
                        break;
                }
                return;
            }
            Room room9 = this.LLILLJJLI;
            if (room9 == null || (roomAuthStatus = room9.mRoomAuthStatus) == null) {
                return;
            }
            roomAuthStatus.enableDigg = false;
        }
    }

    public final void LJJJJZI(final C1114480f6k c1114480f6k, final long j) {
        String str;
        String str2;
        final boolean z;
        User userFrom;
        boolean z2;
        boolean z3;
        boolean z4;
        String strLJIILLIIL;
        InterfaceC474510IjB interfaceC474510IjB;
        int iIndexOf;
        C520890Kbn c520890Kbn;
        List<EmoteWithIndex> list;
        boolean zLJI = MethodIDManager.LJI(202141);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            if (Boolean.FALSE.equals(dataChannel.gg0(C753280Tgk.class))) {
                T t = this.mView;
                if (t != 0) {
                    ((InterfaceC1114450f6h) t).Kw();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        int size = 0;
        if (this.LLILLJJLI == null || this.LLILLL == null || (TextUtils.isEmpty(c1114480f6k.LIZIZ()) && ((c520890Kbn = c1114480f6k.LJII) == null || (list = c520890Kbn.LIZIZ) == null || list.size() == 0))) {
            C784440Upu.LIZ().LIZIZ(new C1114490f6l(c1114480f6k, false));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        ICommentService iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class);
        if (iCommentService instanceof CommentService) {
            Iterator<InterfaceC1114710f77> it2 = ((CommentService) iCommentService).LLILLJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().w();
            }
        }
        String strLJFF = null;
        if (c1114480f6k.LIZ().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) c1114480f6k.LIZ().get("live.intent.extra.ENTER_LIVE_SOURCE");
        } else {
            str = null;
        }
        if (c1114480f6k.LIZ().get("mention_user_id_list_str") instanceof String) {
            str2 = (String) c1114480f6k.LIZ().get("mention_user_id_list_str");
        } else {
            str2 = null;
        }
        User user = (User) UserService.getInstance().user().getCurrentUser();
        if (this.LLILLJJLI.getOwner() != null && this.LLILLJJLI.getOwner().getId() == user.getId()) {
            z = true;
            BadgeStruct badgeStructLIZ = C00J2.LIZ();
            userFrom = User.from(user);
            if (badgeStructLIZ != null && userFrom != null) {
                userFrom.setBadgeList(Collections.singletonList(badgeStructLIZ));
            }
        } else {
            z = false;
            userFrom = user;
        }
        User.EnigmaInfo enigmaInfo = user.enigmaInfo;
        if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
            z2 = true;
        } else {
            z2 = false;
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        long id = this.LLILLJJLI.getId();
        String strLIZIZ = c1114480f6k.LIZIZ();
        int iLIZLLL = c1114480f6k.LIZLLL();
        C520890Kbn c520890Kbn2 = c1114480f6k.LJII;
        if (!z2 && !this.LLILZIL && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        final ChatMessage chatMessageJw2 = iPublicScreenService.jw2(id, strLIZIZ, userFrom, iLIZLLL, c520890Kbn2, z3);
        ((InterfaceC1114450f6h) this.mView).Wr0(chatMessageJw2);
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (c1114480f6k.LJFF() == ISendCommentEvent.Sender.QUICKCOMMENTFIRSTGIFT) {
            z4 = true;
        } else {
            z4 = false;
        }
        final C1114650f71 c1114650f71 = new C1114650f71();
        c1114650f71.LIZIZ = SystemClock.elapsedRealtime();
        if (LiveCommentAddPullStreamDataSetting.INSTANCE.getValue()) {
            strLJIILLIIL = C0IX5.LJIILLIIL(Long.valueOf(this.LLILLJJLI.getId()));
            InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
            if (interfaceC480510Isr != null && (strLJFF = interfaceC480510Isr.LJFF()) != null && !strLJFF.isEmpty() && (iIndexOf = strLJFF.indexOf("?")) > 0) {
                strLJFF = strLJFF.substring(0, iIndexOf);
            }
        } else {
            strLJIILLIIL = null;
        }
        String strLIZIZ2 = c1114480f6k.LIZIZ();
        String strLJI = c1114480f6k.LJI();
        long id2 = this.LLILLJJLI.getId();
        String requestId = this.LLILLJJLI.getRequestId();
        String labels = this.LLILLJJLI.getLabels();
        boolean zLJ = c1114480f6k.LJ();
        int iLIZLLL2 = c1114480f6k.LIZLLL();
        String str3 = "";
        C0IXY c0ixyLIZIZ = C0IXW.LIZIZ(this.LLILLJJLI, this.dataChannel, "");
        String str4 = c1114480f6k.LJI;
        C520890Kbn c520890Kbn3 = c1114480f6k.LJII;
        if (c520890Kbn3 != null) {
            str3 = c520890Kbn3.LIZ;
        }
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJJLIIIJLJLI = ((CommentApi) C480460Ism.LIZIZ(CommentApi.class)).sendTextMessage(C1115670f8f.LIZ(iLIZLLL2, id2, c0ixyLIZIZ, strLIZIZ2, strLJI, requestId, labels, str, str4, str3, null, str2, strLJFF, strLJIILLIIL, zLJ, z4)).LJIILIIL(new C0UO0()).LJJLIIIJLJLI(new C1114530f6p(c1114650f71));
        if (LiveWidgetExitRoomOptSetting.INSTANCE.enableComment() && !C176600m4.LIZIZ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class))) {
            List<EmoteWithIndex> listEmptyList = Collections.emptyList();
            C520890Kbn c520890Kbn4 = c1114480f6k.LJII;
            if (c520890Kbn4 != null) {
                listEmptyList = c520890Kbn4.LIZIZ;
                size = listEmptyList.size();
            }
            C474500IjA c474500IjAXy1 = ((InterfaceC1114450f6h) this.mView).xy1(c1114480f6k.LIZIZ(), c1114480f6k, C1110360f06.LIZ(size, c1114480f6k.LIZIZ()), user, size, listEmptyList, j);
            HashMap map = new HashMap();
            map.put("emote_size", Integer.valueOf(size));
            map.put("live_log", c474500IjAXy1);
            if (c474500IjAXy1 != null && (interfaceC474510IjB = c474500IjAXy1.LIZ) != null) {
                interfaceC474510IjB.LJII();
            }
            c11nzLJJLIIIJLJLI = C476120Ilm.LIZ(c11nzLJJLIIIJLJLI, new InterfaceC475810IlH<BaseResponse<ChatResult, ChatExtra>>(c1114650f71) { // from class: X.0f6f
                public final C1114650f71 LIZ;

                @Override // X.InterfaceC475810IlH
                public final void LIZ(Map<String, ?> map2) {
                }

                {
                    this.LIZ = c1114650f71;
                }

                @Override // X.InterfaceC475810IlH
                public final void LIZIZ(BaseResponse<ChatResult, ChatExtra> baseResponse, Map map2) throws JSONException {
                    BaseResponse<ChatResult, ChatExtra> baseResponse2 = baseResponse;
                    if (map2 != null && (map2.get("live_log") instanceof C474500IjA)) {
                        C1114370f6Z.LIZLLL(baseResponse2.data.getMsgId(), baseResponse2.data.userIdentity, this.LIZ.LIZ, SystemClock.elapsedRealtime() - this.LIZ.LIZIZ, (C474500IjA) map2.get("live_log"), baseResponse2.data.getContent(), ((Integer) map2.get("emote_size")).intValue());
                    }
                }
            }, map);
        }
        final boolean z5 = z4;
        this.LLILLL.LIZ(c11nzLJJLIIIJLJLI.LJJLL(new C09JN() { // from class: X.0f6b
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r33) {
                /*
                    Method dump skipped, instruction units count: 618
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1114390f6b.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0f6d
            @Override // X.C09JN
            public final void accept(Object obj) {
                Long lValueOf;
                Long lValueOf2;
                C1114360f6Y c1114360f6Y = this.LL;
                C1114480f6k c1114480f6k2 = c1114480f6k;
                C1114650f71 c1114650f712 = c1114650f71;
                ChatMessage chatMessage = chatMessageJw2;
                long j2 = jUptimeMillis;
                Throwable th = (Throwable) obj;
                c1114360f6Y.getClass();
                C1C7U.LIZ("CommentPresenter@1a6e.sendComment$2L");
                C784440Upu.LIZ().LIZIZ(new C1114490f6l(c1114480f6k2, false));
                if (c1114360f6Y.mView == 0) {
                    C1C7U.LIZIZ("CommentPresenter@1a6e.sendComment$2L");
                    return;
                }
                if (th instanceof Exception) {
                    Exception exc = (Exception) th;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - c1114650f712.LIZIZ;
                    int i = c1114650f712.LIZ;
                    if (exc instanceof C501520Jle) {
                        C1114370f6Z.LJI(c1114360f6Y.dataChannel, ((C501520Jle) exc).getErrorCode(), i, jElapsedRealtime);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("final failed  error = ");
                        sbLIZ.append(exc.getMessage());
                        sbLIZ.append(" code = ");
                        sbLIZ.append(((C501520Jle) exc).getErrorCode());
                        C1114680f74.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    } else if (exc instanceof C1494690ozz) {
                        C1114370f6Z.LJI(c1114360f6Y.dataChannel, ((C1494690ozz) exc).getStatusCode(), i, jElapsedRealtime);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("final failed  error = ");
                        sbLIZ2.append(exc.getMessage());
                        sbLIZ2.append(" code = ");
                        sbLIZ2.append(((C1494690ozz) exc).getStatusCode());
                        C1114680f74.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else if (exc instanceof C1811850xFX) {
                        C1114370f6Z.LJI(c1114360f6Y.dataChannel, ((C1811850xFX) exc).statusCode, i, jElapsedRealtime);
                    } else {
                        C1114370f6Z.LJI(c1114360f6Y.dataChannel, -100, i, jElapsedRealtime);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("final failed  error = ");
                        sbLIZ3.append(exc.getMessage());
                        sbLIZ3.append(" code = -100");
                        C1114680f74.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    ((InterfaceC1114450f6h) c1114360f6Y.mView).ea0(c1114480f6k2, exc);
                    c1114360f6Y.dataChannel.LC0(ChatMessageRemoveEvent.class, chatMessage);
                    if (th instanceof C501520Jle) {
                        C925000aB8 c925000aB8 = C963910bBt.LIZ;
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - j2;
                        int errorCode = ((C501520Jle) th).getErrorCode();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", jUptimeMillis2);
                            jSONObject.put("error_code", errorCode);
                            jSONObject.put("user_id", C501590Jll.LIZ());
                            Room room = C963910bBt.LIZIZ;
                            if (room != null) {
                                lValueOf = Long.valueOf(room.getId());
                            } else {
                                lValueOf = null;
                            }
                            jSONObject.put("room_id", lValueOf);
                            Room room2 = C963910bBt.LIZIZ;
                            if (room2 != null) {
                                lValueOf2 = Long.valueOf(room2.getOwnerUserId());
                            } else {
                                lValueOf2 = null;
                            }
                            jSONObject.put("anchor_id", lValueOf2);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C1CC2.LJI("ttlive_chat", new JSONObject(), null, jSONObject);
                    } else {
                        C1CC2.LIZ("LiveCommentFailed", th);
                    }
                }
                C1C7U.LIZIZ("CommentPresenter@1a6e.sendComment$2L");
            }
        }));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
