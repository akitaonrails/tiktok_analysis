package com.bytedance.android.live.liveinteract.gamelink.widget;

import X.AbstractC923560a8o;
import X.C001A;
import X.C01GW;
import X.C0IJ7;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C465900IOu;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.C925050aBD;
import X.C926300aDE;
import X.C936480aTe;
import X.C936530aTj;
import X.C936540aTk;
import X.C941300abQ;
import X.InterfaceC922930a7n;
import X.InterfaceC923040a7y;
import X.InterfaceC924460aAG;
import X.InterfaceC936490aTf;
import X.InterfaceC964770bDH;
import Y.AComparatorS34S0000000_15;
import Y.AfS184S0100000_15;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GameLinkLayoutLandDataChannel;
import com.bytedance.android.live.liveinteract.gamelink.GameLinkMaskViewModel;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkMicMaskGuestItemWidget;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkMicViewMaskWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGeustWidgetDestroyChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkLayoutDataChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkMicViewSmallStyle;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public final class GameLinkMicViewMaskWidget extends LiveWidget implements OnMessageListener {
    public final InterfaceC924460aAG LL;
    public final InterfaceC923040a7y LLILLJJLI;
    public final HashMap<String, GameLinkMicMaskGuestItemWidget> LLILLL;
    public final HashMap<String, Integer> LLILZ;
    public final TreeMap<Long, String> LLILZIL;
    public ViewGroup.MarginLayoutParams LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C936480aTe LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final Map<String, SurfaceView> LLJJI;
    public final C926300aDE LLJJIII;
    public final AComparatorS34S0000000_15 LLJJIJI;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int A1() {
        return ((Number) this.LLJILJILJ.getValue()).intValue();
    }

    public final boolean B1() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    public final void D1() {
        GameLinkMaskViewModel gameLinkMaskViewModel = (GameLinkMaskViewModel) this.LLIZLLLIL.getValue();
        if (gameLinkMaskViewModel == null) {
            return;
        }
        for (Map.Entry entry : ((HashMap) gameLinkMaskViewModel.LL).entrySet()) {
            String str = ((C936540aTk) entry.getValue()).LIZ.mInteractIdStr;
            if (str != null) {
                ((C936540aTk) entry.getValue()).LIZIZ = (this.LLILZ.get(str) != null ? r0.intValue() : -1) - 1;
            }
        }
    }

    public final void E1() {
        String str;
        GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget;
        GameLinkMaskViewModel gameLinkMaskViewModel = (GameLinkMaskViewModel) this.LLIZLLLIL.getValue();
        if (gameLinkMaskViewModel == null) {
            return;
        }
        TreeMap treeMap = new TreeMap(this.LLJJIJI);
        for (Map.Entry entry : ((HashMap) gameLinkMaskViewModel.LL).entrySet()) {
            C936540aTk c936540aTk = (C936540aTk) entry.getValue();
            if (c936540aTk != null && (str = c936540aTk.LIZ.mInteractIdStr) != null && !TextUtils.isEmpty(str) && (gameLinkMicMaskGuestItemWidget = this.LLILLL.get(str)) != null) {
                treeMap.put(Integer.valueOf(((C936540aTk) entry.getValue()).LIZIZ), gameLinkMicMaskGuestItemWidget);
            }
        }
        Iterator it2 = treeMap.entrySet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget2 = (GameLinkMicMaskGuestItemWidget) ((Map.Entry) it2.next()).getValue();
            if (i >= 0) {
                y1().LIZLLL(i, gameLinkMicMaskGuestItemWidget2.LLILLJJLI);
            }
            i++;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(GameLinkGeustWidgetDestroyChannel.class);
        }
        super.onDestroy();
        C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", "onDestroy");
        this.dataChannel.zW(GameLinkLayoutDataChannel.class, new C936530aTj(0));
        this.dataChannel.zW(GameLinkLayoutLandDataChannel.class, 0);
        ((HashMap) this.LLJJI).clear();
        this.LLILLL.clear();
        this.LL.Ne(null);
        this.LL.a9(this.LLJIJIL);
        IMessageManager iMessageManager = (IMessageManager) this.LLJ.getValue();
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.BASE_LINK_LAYER_MESSAGE.getIntType(), this);
        }
        InterfaceC923040a7y interfaceC923040a7y = this.LLILLJJLI;
        if (interfaceC923040a7y != null) {
            interfaceC923040a7y.LJ(this.LLJJIII);
        }
    }

    public final InterfaceC936490aTf y1() {
        return (InterfaceC936490aTf) this.LLJJ.getValue();
    }

    public final int z1() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return y1().getLayoutId();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        InterfaceC923040a7y interfaceC923040a7yHe;
        AbstractC923560a8o abstractC923560a8oLIZ;
        super.onCreate();
        C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", "onCreate()");
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        y1().LIZJ(this);
        if (B1()) {
            DataChannel dataChannel = this.dataChannel;
            dataChannel.BQ2(this, GameLinkGuestNumChannel.class, new AwS594S0100000_15(this, 117));
            dataChannel.BQ2(this, GameLinkMicViewSmallStyle.class, new AwS594S0100000_15(this, 118));
        } else {
            this.dataChannel.BQ2(this, GameLinkGuestNumChannel.class, new AwS594S0100000_15(this, 116));
        }
        this.LL.Ne(new AwS594S0100000_15(this, 119));
        this.LL.Fe(this.LLJIJIL);
        InterfaceC923040a7y interfaceC923040a7y = this.LLILLJJLI;
        if (interfaceC923040a7y != null) {
            interfaceC923040a7y.LIZJ(this.LLJJIII);
        }
        IMessageManager iMessageManager = (IMessageManager) this.LLJ.getValue();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.BASE_LINK_LAYER_MESSAGE.getIntType(), this);
        }
        C784440Upu.LIZ().LIZJ(this, C465900IOu.class).LIZJ(new AfS184S0100000_15(this, 17));
        InterfaceC923040a7y interfaceC923040a7yHe2 = this.LL.He();
        if (interfaceC923040a7yHe2 == null || !interfaceC923040a7yHe2.isInit() || (interfaceC923040a7yHe = this.LL.He()) == null || (abstractC923560a8oLIZ = interfaceC923040a7yHe.LIZ()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (LinkListUser linkListUser : abstractC923560a8oLIZ.LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAllUserInfo: linkStatus=");
            sbLIZ.append(linkListUser.LIZ);
            sbLIZ.append(", linkId=");
            sbLIZ.append(linkListUser.linkMicId);
            sbLIZ.append(", roleType=");
            sbLIZ.append(linkListUser.roleType);
            C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ));
            if (linkListUser.LIZ == 2) {
                arrayList.add(C925050aBD.LIZ(linkListUser));
            }
        }
        C1(arrayList);
    }

    public final void C1(List<LinkPlayerInfo> list) {
        String str;
        GameLinkMaskViewModel gameLinkMaskViewModel;
        RecyclableWidgetManager recyclableWidgetManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onListChange linkedUsers size = ");
        sbLIZ.append(list.size());
        C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ));
        HashSet hashSet = new HashSet();
        for (LinkPlayerInfo linkPlayerInfo : list) {
            String str2 = linkPlayerInfo.mInteractIdStr;
            if (str2 != null && linkPlayerInfo.mRoleType != 1) {
                hashSet.add(str2);
            }
        }
        HashMap<String, GameLinkMicMaskGuestItemWidget> map = this.LLILLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, GameLinkMicMaskGuestItemWidget> entry : map.entrySet()) {
            if (!hashSet.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onListChange need2Delete size = ");
        sbLIZ2.append(linkedHashMap.size());
        C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ2));
        ArrayList<LinkPlayerInfo> arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo2 : list) {
            LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo2;
            if (linkPlayerInfo3.mRoleType != 1 && !this.LLILLL.containsKey(linkPlayerInfo3.mInteractIdStr)) {
                arrayList.add(linkPlayerInfo2);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onListChange need2Add size = ");
        sbLIZ3.append(arrayList.size());
        C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ3));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            String str3 = (String) ((Map.Entry) it2.next()).getKey();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("removeGuestBizMask linkMicId = ");
            sbLIZ4.append(str3);
            C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ4));
            GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidgetRemove = this.LLILLL.remove(str3);
            if (gameLinkMicMaskGuestItemWidgetRemove != null && (recyclableWidgetManager = this.subWidgetManager) != null) {
                recyclableWidgetManager.unload(gameLinkMicMaskGuestItemWidgetRemove);
            }
            this.dataChannel.zW(GameLinkGuestNumChannel.class, Integer.valueOf(this.LLILLL.size()));
            GameLinkMaskViewModel gameLinkMaskViewModel2 = (GameLinkMaskViewModel) this.LLIZLLLIL.getValue();
            if (gameLinkMaskViewModel2 != null) {
                ((HashMap) gameLinkMaskViewModel2.LL).remove(str3);
            }
        }
        GameLinkMaskViewModel gameLinkMaskViewModel3 = (GameLinkMaskViewModel) this.LLIZLLLIL.getValue();
        if (gameLinkMaskViewModel3 == null) {
            return;
        }
        for (LinkPlayerInfo linkPlayerInfo4 : arrayList) {
            C936540aTk c936540aTk = (C936540aTk) ((HashMap) gameLinkMaskViewModel3.LL).get(linkPlayerInfo4.mInteractIdStr);
            if (c936540aTk == null) {
                c936540aTk = new C936540aTk(linkPlayerInfo4);
            }
            ((HashMap) gameLinkMaskViewModel3.LL).put(linkPlayerInfo4.mInteractIdStr, c936540aTk);
            String str4 = c936540aTk.LIZ.mInteractIdStr;
            if (str4 == null || TextUtils.isEmpty(str4) || this.LLILLL.get(str4) == null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("createGuestBizMask context = ");
                sbLIZ5.append(this.context);
                sbLIZ5.append(", linkMicId=");
                sbLIZ5.append(c936540aTk.LIZ.mInteractIdStr);
                C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ5));
                if (this.context != null && (str = c936540aTk.LIZ.mInteractIdStr) != null && (gameLinkMaskViewModel = (GameLinkMaskViewModel) this.LLIZLLLIL.getValue()) != null) {
                    C941300abQ c941300abQ = new C941300abQ(this.context);
                    y1().LIZ(this.contentView, c941300abQ);
                    ((HashMap) gameLinkMaskViewModel.LL).put(str, c936540aTk);
                    GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget = new GameLinkMicMaskGuestItemWidget(c936540aTk, c941300abQ);
                    RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
                    if (recyclableWidgetManager2 != null) {
                        recyclableWidgetManager2.load(gameLinkMicMaskGuestItemWidget);
                    }
                    this.LLILLL.put(str, gameLinkMicMaskGuestItemWidget);
                    this.dataChannel.zW(GameLinkGuestNumChannel.class, Integer.valueOf(this.LLILLL.size()));
                }
            }
        }
        if ((!arrayList.isEmpty()) || (!linkedHashMap.isEmpty())) {
            D1();
            E1();
        }
    }

    public final void onEventPause(C465900IOu c465900IOu) {
        int i = c465900IOu.LIZ;
        if (i != 30) {
            if (i != 31) {
                if (i != 36) {
                    if (i != 37) {
                        return;
                    }
                }
            }
            Iterator it2 = ((HashMap) this.LLJJI).entrySet().iterator();
            while (it2.hasNext()) {
                ((ViewGroup) this.contentView).addView((View) ((Map.Entry) it2.next()).getValue(), 0, this.LLILZLL);
            }
            return;
        }
        Iterator it3 = ((HashMap) this.LLJJI).entrySet().iterator();
        while (it3.hasNext()) {
            C500260Jjc.LJJJLL((View) ((Map.Entry) it3.next()).getValue());
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AllListUser allListUser;
        List<LinkLayerListUser> list;
        if (iMessage instanceof LinkLayerMessage) {
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
            if (linkLayerMessage.messageType == 11) {
                this.LLILZIL.clear();
                LinkListChangeContent linkListChangeContent = linkLayerMessage.listContent;
                if (linkListChangeContent != null && (allListUser = linkListChangeContent.userList) != null && (list = allListUser.linkedList) != null) {
                    for (LinkLayerListUser linkLayerListUser : list) {
                        this.LLILZIL.put(Long.valueOf(linkLayerListUser.linkedTimeNano), linkLayerListUser.linkMicId);
                    }
                }
                Iterator<Map.Entry<Long, String>> it2 = this.LLILZIL.entrySet().iterator();
                int i = 0;
                while (it2.hasNext()) {
                    this.LLILZ.put(it2.next().getValue(), Integer.valueOf(i));
                    i++;
                }
                D1();
                E1();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0aTe] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0aDE] */
    public GameLinkMicViewMaskWidget(InterfaceC924460aAG interfaceC924460aAG, InterfaceC923040a7y interfaceC923040a7y) {
        this.LL = interfaceC924460aAG;
        this.LLILLJJLI = interfaceC923040a7y;
        AComparatorS34S0000000_15 aComparatorS34S0000000_15 = new AComparatorS34S0000000_15(2);
        this.LLILLL = new HashMap<>();
        this.LLILZ = new HashMap<>();
        this.LLILZIL = new TreeMap<>(aComparatorS34S0000000_15);
        this.LLIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(35));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 126));
        this.LLJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 130));
        this.LLJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 129));
        this.LLJIJIL = new InterfaceC964770bDH() { // from class: X.0aTe
            @Override // X.InterfaceC964770bDH
            public final void LIZ(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJFF(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIZILJ(String str, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIJJLI(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJ(Map<String, String> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJI(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIFFI(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIIZI(String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIJIIJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIZ(String str, long j) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJ(String str, float f, float f2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJL(int i, C965030bDh c965030bDh) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJZI(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLL(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJZ(int i, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJLIIIJJIZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJLJLI() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLL(int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJZZI(C965210bDz c965210bDz) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
                return null;
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIILZL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIL(List<LinkUser> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLJI(String str, boolean z, boolean z2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InteractAudioVolumeInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().linkMicId);
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InteractAudioVolumeInfo> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Boolean.valueOf(it3.next().isTalk()));
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InteractAudioVolumeInfo> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Integer.valueOf(it4.next().volume));
                }
                GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = this.LL;
                gameLinkMicViewMaskWidget.getClass();
                if (!arrayList.isEmpty() && !arrayList2.isEmpty() && !arrayList3.isEmpty()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget = gameLinkMicViewMaskWidget.LLILLL.get(ListProtector.get(arrayList, i));
                        if (gameLinkMicMaskGuestItemWidget != null) {
                            gameLinkMicMaskGuestItemWidget.x1(((Number) ListProtector.get(arrayList3, i)).intValue(), false);
                        }
                    }
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJJI(String str, SurfaceView surfaceView) {
                LinkListUser linkListUserLIZJ;
                Long lValueOf;
                int iA1;
                User user;
                AbstractC923560a8o abstractC923560a8oLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("linkMicId = ");
                sbLIZ.append(str);
                sbLIZ.append(",surfaceView=");
                sbLIZ.append(surfaceView);
                sbLIZ.append(", isCDNVideoLand=");
                sbLIZ.append(((Boolean) this.LL.LLJILJIL.getValue()).booleanValue());
                sbLIZ.append(", contentView=");
                sbLIZ.append(this.LL.contentView);
                C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ));
                if (surfaceView == null) {
                    return;
                }
                boolean zBooleanValue = ((Boolean) this.LL.LLJILJIL.getValue()).booleanValue();
                InterfaceC923040a7y interfaceC923040a7y2 = this.LL.LLILLJJLI;
                Long lValueOf2 = null;
                if (interfaceC923040a7y2 != null && (abstractC923560a8oLIZ = interfaceC923040a7y2.LIZ()) != null) {
                    linkListUserLIZJ = C923010a7v.LIZJ(abstractC923560a8oLIZ, str);
                } else {
                    linkListUserLIZJ = null;
                }
                GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = this.LL;
                if (surfaceView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) surfaceView.getParent()).setLayoutTransition(null);
                    C500260Jjc.LJJJLL(surfaceView);
                }
                if (linkListUserLIZJ != null && (user = linkListUserLIZJ.user) != null) {
                    lValueOf = Long.valueOf(user.getId());
                } else {
                    lValueOf = null;
                }
                Room room = (Room) gameLinkMicViewMaskWidget.dataChannel.gg0(RoomChannel.class);
                if (room != null) {
                    lValueOf2 = Long.valueOf(room.getOwnerUserId());
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("videoWidth = ");
                    sbLIZ2.append(gameLinkMicViewMaskWidget.A1());
                    sbLIZ2.append(", videoHeight=");
                    sbLIZ2.append(gameLinkMicViewMaskWidget.z1());
                    C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ2));
                    int iZ1 = -1;
                    if (gameLinkMicViewMaskWidget.B1() && gameLinkMicViewMaskWidget.z1() > 0) {
                        iA1 = (gameLinkMicViewMaskWidget.A1() * C497740JfY.LJIILLIIL()) / gameLinkMicViewMaskWidget.z1();
                    } else {
                        iA1 = -1;
                    }
                    if (zBooleanValue && !gameLinkMicViewMaskWidget.B1() && gameLinkMicViewMaskWidget.A1() != 0) {
                        iZ1 = (gameLinkMicViewMaskWidget.z1() * C497740JfY.LJIIZILJ()) / gameLinkMicViewMaskWidget.A1();
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iA1, iZ1);
                    if (zBooleanValue && !gameLinkMicViewMaskWidget.B1()) {
                        marginLayoutParams.topMargin = C497740JfY.LJIIIZ(R.dimen.atb);
                    }
                    gameLinkMicViewMaskWidget.LLILZLL = marginLayoutParams;
                    surfaceView.setZOrderMediaOverlay(true);
                    ((ViewGroup) gameLinkMicViewMaskWidget.contentView).addView(surfaceView, 0, gameLinkMicViewMaskWidget.LLILZLL);
                    ((HashMap) gameLinkMicViewMaskWidget.LLJJI).put(str, surfaceView);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
                String str;
                HashMap<String, GameLinkMicMaskGuestItemWidget> map = this.LL.LLILLL;
                RtcUserInfo rtcUserInfoG0 = interfaceC954180awC.G0();
                if (rtcUserInfoG0 == null || (str = rtcUserInfoG0.linkMicId) == null) {
                    str = "";
                }
                GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget = map.get(str);
                if (gameLinkMicMaskGuestItemWidget != null) {
                    gameLinkMicMaskGuestItemWidget.y1(i);
                }
            }
        };
        this.LLJILJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 128));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 132));
        this.LLJILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 131));
        this.LLJJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 127));
        this.LLJJI = new HashMap();
        this.LLJJIII = new InterfaceC922930a7n() { // from class: X.0aDE
            @Override // X.InterfaceC922930a7n
            public final void LIZJ() {
            }

            @Override // X.InterfaceC922930a7n
            public final void LIZ(AbstractC923560a8o abstractC923560a8o) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = abstractC923560a8o.LJ().iterator();
                while (it2.hasNext()) {
                    arrayList.add(C925050aBD.LIZ((LinkListUser) it2.next()));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onListChangeByIM() size = ");
                sbLIZ.append(arrayList.size());
                C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.C1(arrayList);
            }

            @Override // X.InterfaceC922930a7n
            public final void LIZIZ(AbstractC923560a8o abstractC923560a8o, boolean z) {
                List<LinkPlayerInfo> listLJ = abstractC923560a8o.LJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onListChangeByFetch() size = ");
                sbLIZ.append(listLJ.size());
                C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.C1(listLJ);
            }
        };
        this.LLJJIJI = new AComparatorS34S0000000_15(1);
    }

    public final void x1(int i, boolean z) {
        int height;
        if (i > 0) {
            if (z) {
                height = (int) C497740JfY.LIZIZ(64.0f);
            } else {
                height = y1().getHeight() + ((int) C497740JfY.LIZIZ(8.0f));
            }
            this.dataChannel.zW(GameLinkLayoutLandDataChannel.class, Integer.valueOf(height));
            return;
        }
        this.dataChannel.zW(GameLinkLayoutLandDataChannel.class, 0);
    }
}
