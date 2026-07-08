package X;

import android.util.ArrayMap;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMemoryLeakOptSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aFL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927610aFL extends AbstractC945390ai1<InterfaceC927530aFD> {
    public LinkMessageCenter LL;
    public int LLILLJJLI;
    public final C927630aFN LLILLL = new C927630aFN(this);
    public final C927620aFM LLILZ = new C921870a65() { // from class: X.0aFM
        @Override // X.C921870a65, X.InterfaceC964770bDH
        public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            C1AZW.LJIIJ(12, "VoiceChatControlPresenter", "onCreateChannelMessageReceived", null, null);
            this.LL.LJJJJZI();
        }

        @Override // X.C921870a65, X.InterfaceC964770bDH
        public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
            LinkMessage linkMessage = new LinkMessage();
            linkMessage.scene = 4;
            ExtraDataWrapper extraDataWrapper = destroyChannelMessage.customMessage.extra;
            if (extraDataWrapper != null && (extraDataWrapper.getContent() instanceof Long)) {
                linkMessage.extraStr = String.valueOf(extraDataWrapper.getContent());
            }
            this.LL.LLILLL.S0(linkMessage);
            C919310a1x.LIZ("VoiceChatControlPresenter", "host close linkmic by destroyChannel");
            T t = this.LL.mView;
            if (t != 0 && (interfaceC665370Q7zLIZIZ = C926770aDz.LIZIZ(t)) != null) {
                C926770aDz.LIZ(interfaceC665370Q7zLIZIZ, false);
            }
        }
    };

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    public final void LJJJJZI() {
        DataChannel dataChannel;
        Room room;
        ArrayMap<Integer, Long> arrayMap;
        Long l;
        C20441214yg.LIZIZ("VoiceChatControlPresenter", "loadVoiceChatService");
        if (this.mView == 0 || (dataChannel = this.dataChannel) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        String string = null;
        if (room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            C20441214yg.LIZIZ("VoiceChatControlPresenter", "initMultiGuestForAnchor");
            C915980Zwa.LJIIIIZZ().YL2(((InterfaceC919320a1y) this.mView).getContext(), room, this.dataChannel, null);
            LJJJJLL(room);
            return;
        }
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings != null && (arrayMap = multiLiveUserSettings.channelMap) != null && (l = arrayMap.get(4)) != null) {
            string = l.toString();
        }
        C915980Zwa.LJIIIIZZ().YL2(((InterfaceC919320a1y) this.mView).getContext(), room, this.dataChannel, string);
        C915980Zwa.LJIIIIZZ().Fe(this.LLILZ);
        if (string != null) {
            C925090aBH.LIZJ(room, (InterfaceC927530aFD) this.mView);
            ((InterfaceC927530aFD) this.mView).Fv1();
        }
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        Room room;
        DataChannel dataChannel;
        InterfaceC926460aDU interfaceC926460aDU;
        C1AZW.LJIIJ(12, "VoiceChatControlPresenter", "detachView", null, null);
        C925600aC6.LJIJI(null);
        C915980Zwa.LJIIIIZZ().LJI();
        LinkMessageCenter linkMessageCenter = this.LL;
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZJ();
        }
        this.LL = null;
        C915980Zwa.LJIIIIZZ().a9(this.LLILZ);
        if (MultiGuestMemoryLeakOptSetting.isEnable() && (dataChannel = this.dataChannel) != null && (interfaceC926460aDU = (InterfaceC926460aDU) dataChannel.gg0(C956960b0g.class)) != null) {
            interfaceC926460aDU.release();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            C01Z2.LIZIZ(room.getOwnerUserId());
        }
        super.detachView();
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC927530aFD interfaceC927530aFD) {
        Room room;
        super.attachView(interfaceC927530aFD);
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LIZJ(this);
        C20441214yg.LIZIZ("VoiceChatControlPresenter", "loadVoiceChatContext");
        C924500aAK c924500aAK = new C924500aAK();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C956950b0f.class, c924500aAK);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C956960b0g.class, c924500aAK);
        }
        LJJJJZI();
        LinkMessageCenter linkMessageCenter = new LinkMessageCenter(this.dataChannel);
        linkMessageCenter.LIZIZ();
        c948450amx.LJFF(linkMessageCenter, "LINK_MESSAGE_CENTER");
        this.LL = linkMessageCenter;
        linkMessageCenter.LIZ(this.LLILLL);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null && C500260Jjc.LJJJI(Boolean.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Io0(room)))) {
            C925150aBN.LJJJ(room, this.dataChannel);
            C917520Zz4.LIZIZ(new RunnableC168600km(C925150aBN.LJIIIIZZ((InterfaceC925160aBO) this.mView, room, true), room));
        }
        C01Z2.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL(final com.bytedance.android.livesdkapi.depend.model.live.Room r11) {
        /*
            r10 = this;
            long r0 = X.C963140bAe.LIZIZ()
            X.C927280aEo.LIZ = r0
            boolean r0 = X.C931780aM4.LIZ()
            r2 = 0
            if (r0 == 0) goto L90
            X.01GW r1 = X.C931780aM4.LIZ
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L2d
            java.lang.Object r1 = r1.getValue()
            com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.linkmic.VoiceLayoutParam r0 = r0.getDefaultOld()
            java.lang.String r0 = r0.layoutId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L90
        L2d:
            com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.linkmic.LayoutSetting r0 = r0.getValue()
            boolean r0 = r0.optNotMatchAnchor
            if (r0 == 0) goto L90
            X.0k3U r4 = X.C1304660k3U.LIZ
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r1 = "lib not match"
            r3.<init>(r1)
            r0 = 90001(0x15f91, float:1.26118E-40)
            r4.LIZIZ(r0, r1, r3, r2)
            com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.linkmic.VoiceLayoutParam r3 = r0.getDefault()
        L4c:
            int r5 = r3.maxPosition
            java.lang.String r6 = r3.layoutId
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams r7 = new com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams
            r7.<init>()
            int r0 = r3.displayId
            r7.displayId = r0
            r0 = 7
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            X.0bEp r9 = X.EnumC965730bEp.INNER
            X.0bBl r4 = new X.0bBl
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "createChannel layoutId="
            r1.append(r0)
            java.lang.String r0 = r3.layoutId
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "VoiceChatControlPresenter"
            X.C20441214yg.LIZIZ(r0, r1)
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r1 = r0.LLJLL()
            if (r1 == 0) goto L8f
            X.0aFA r0 = new X.0aFA
            r0.<init>()
            r1.LLILLIZIL(r4, r0, r2)
        L8f:
            return
        L90:
            com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigGroupSetting.INSTANCE
            X.01GW r0 = X.C931780aM4.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.android.livesdk.livesetting.linkmic.VoiceLayoutParam r3 = r1.toLayoutParams(r0)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C927610aFL.LJJJJLL(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }
}
