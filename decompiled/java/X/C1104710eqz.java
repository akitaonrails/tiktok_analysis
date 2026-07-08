package X;

import Y.AfS153S0200000_17;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.gift.event.LiveSendRedEnvelopeEvent;
import com.bytedance.android.livesdk.livesetting.portal.PortalFeatureSetting;
import com.bytedance.android.livesdk.model.RoomAuthMessage;
import com.bytedance.android.livesdk.model.RoomAuthMessageGoldenEnvelope;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104710eqz implements InterfaceC1104320eqM {
    public DataChannel LIZIZ;
    public InterfaceC1104760er4 LIZJ;
    public Boolean LIZLLL;
    public Room LJ;
    public boolean LJI;
    public String LJII;
    public final Set<RedEnvelopMessage> LIZ = new HashSet();
    public final LinkedList<Pair<String, String>> LJFF = new LinkedList<>();
    public final C1151720g4o LJIIIIZZ = new C1151720g4o(this, 0);
    public final C1151790g4v LJIIIZ = new C1151790g4v(this, 0);

    @Override // X.InterfaceC1104320eqM
    public final void LIZJ() {
        IMessageManager iMessageManager;
        this.LIZJ = null;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this.LJIIIIZZ);
        }
        C1548820qPI.LJIIIIZZ("liveGoldenEnvelopeCreate", this.LJIIIZ);
        C1548820qPI.LJIIIIZZ("liveGoldenEnvelopCloseAll", this.LJIIIZ);
        C1548820qPI.LJIIIIZZ("EVENT_ENVELOPE_UPDATE", this.LJIIIZ);
        this.LJ = null;
        ((HashSet) this.LIZ).clear();
        LJIIJJI(false);
    }

    @Override // X.InterfaceC1104320eqM
    public final void LJI() {
        this.LJI = false;
    }

    @Override // X.InterfaceC1104320eqM
    public final void onPause() {
    }

    @Override // X.InterfaceC1104320eqM
    public final void onResume() {
    }

    @Override // X.InterfaceC1104320eqM
    public final void LIZIZ() {
        if (!this.LJI && this.LJFF.size() > 0) {
            this.LJI = true;
            Pair<String, String> pairRemoveFirst = this.LJFF.removeFirst();
            if (this.LIZJ == null && !LJIIJ()) {
                C1104350eqP.LIZ(this.LIZLLL, "RedEnvelopeWidget is null", ((RedEnvelopeInfoModel4FE) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, pairRemoveFirst.getFirst(), new TypeToken<RedEnvelopeInfoModel4FE>() { // from class: X.0er5
                }.getType())).envelopList);
            }
            InterfaceC1104760er4 interfaceC1104760er4 = this.LIZJ;
            if (interfaceC1104760er4 != null) {
                interfaceC1104760er4.a1(pairRemoveFirst.getFirst(), pairRemoveFirst.getSecond());
            }
        }
    }

    public final boolean LJIIJ() {
        String str = this.LJII;
        return !(str == null || str.length() == 0);
    }

    @Override // X.InterfaceC1104320eqM
    public final boolean isAnchor() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC1104320eqM
    public final boolean LJIIIIZZ() {
        return LJIIJ();
    }

    @Override // X.InterfaceC1104320eqM
    public final Room LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1104320eqM
    public final String LJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1104320eqM
    public final void LIZLLL(List<RedEnvelopInfo> list) {
        long jLongValue;
        long jLongValue2;
        Long l;
        Long l2;
        Long l3;
        boolean zBooleanValue;
        Integer num;
        Boolean bool;
        int iIntValue;
        RedEnvelopInfo4FE redEnvelopInfo4FELIZ;
        Integer num2;
        int iIntValue2;
        int size;
        String str;
        ImageModel imageModel;
        List urls;
        List urls2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        ArrayList<RedEnvelopInfo> arrayList = new ArrayList();
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList();
        for (RedEnvelopInfo redEnvelopInfo : arrayList) {
            Integer num7 = redEnvelopInfo.businessType;
            if ((num7 != null && num7.intValue() == 1) || (((num3 = redEnvelopInfo.businessType) != null && num3.intValue() == 2) || (((num4 = redEnvelopInfo.businessType) != null && num4.intValue() == 4) || (((num5 = redEnvelopInfo.businessType) != null && num5.intValue() == 9) || ((num6 = redEnvelopInfo.businessType) != null && num6.intValue() == 19))))) {
                arrayList2.add(redEnvelopInfo);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (RedEnvelopInfo redEnvelopInfo2 : arrayList) {
            arrayList3.add(redEnvelopInfo2.sendUserId);
            arrayList4.add(redEnvelopInfo2.envelopeId);
        }
        if (arrayList.size() > 0) {
            RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE = new RedEnvelopeInfoModel4FE();
            redEnvelopeInfoModel4FE.dataFrom = "api";
            Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
            if (map != null) {
                for (RedEnvelopInfo redEnvelopInfo3 : arrayList) {
                    Integer num8 = redEnvelopInfo3.businessType;
                    if (num8 != null) {
                        iIntValue2 = num8.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (Intrinsics.LJFF(map.get(Long.valueOf(iIntValue2)), Boolean.TRUE)) {
                        List<RedEnvelopeMessage4FE> list2 = redEnvelopeInfoModel4FE.envelopList;
                        RedEnvelopeMessage4FE redEnvelopeMessage4FE = new RedEnvelopeMessage4FE();
                        RedEnvelopInfo4FE redEnvelopInfo4FE = new RedEnvelopInfo4FE();
                        redEnvelopInfo4FE.businessType = redEnvelopInfo3.businessType;
                        redEnvelopInfo4FE.diamondCount = redEnvelopInfo3.diamondCount;
                        redEnvelopInfo4FE.envelopeId = redEnvelopInfo3.envelopeId;
                        redEnvelopInfo4FE.envelopeIdc = redEnvelopInfo3.envelopeIdc;
                        redEnvelopInfo4FE.peopleCount = redEnvelopInfo3.peopleCount;
                        redEnvelopInfo4FE.sendUserId = redEnvelopInfo3.sendUserId;
                        redEnvelopInfo4FE.unpackAt = redEnvelopInfo3.unpackAt;
                        redEnvelopInfo4FE.sendUserName = redEnvelopInfo3.sendUserName;
                        ImageModel imageModel2 = redEnvelopInfo3.sendUserAvatar;
                        if (imageModel2 != null && (urls2 = imageModel2.getUrls()) != null) {
                            size = urls2.size();
                        } else {
                            size = 0;
                        }
                        String json = "";
                        if (size <= 0 || (imageModel = redEnvelopInfo3.sendUserAvatar) == null || (urls = imageModel.getUrls()) == null || (str = (String) ListProtector.get(urls, 0)) == null) {
                            str = "";
                        }
                        redEnvelopInfo4FE.sendUserAvatar = str;
                        redEnvelopInfo4FE.followStatusShow = redEnvelopInfo3.followShowStatus;
                        redEnvelopInfo4FE.createAt = CardStruct.IStatusCode.DEFAULT;
                        redEnvelopInfo4FE.skinId = redEnvelopInfo3.skinId;
                        redEnvelopInfo4FE.voteCount = redEnvelopInfo3.voteCount;
                        EnvelopeEnigmaInfo envelopeEnigmaInfo = redEnvelopInfo3.senderEnigmaInfo;
                        if (envelopeEnigmaInfo != null) {
                            json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, envelopeEnigmaInfo);
                        }
                        redEnvelopInfo4FE.senderEnigmaInfo = json;
                        redEnvelopeMessage4FE.envelopInfo = redEnvelopInfo4FE;
                        redEnvelopeMessage4FE.diaplay = 1;
                        redEnvelopeMessage4FE.businessTypeString = "shortTouchTreasureBox";
                        list2.add(redEnvelopeMessage4FE);
                    }
                }
                for (RedEnvelopMessage redEnvelopMessage : (HashSet) this.LIZ) {
                    MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo;
                    if (messageRedEnvelopInfo != null && (num2 = messageRedEnvelopInfo.businessType) != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (Intrinsics.LJFF(map.get(Long.valueOf(iIntValue)), Boolean.TRUE)) {
                        List<RedEnvelopeMessage4FE> list3 = redEnvelopeInfoModel4FE.envelopList;
                        RedEnvelopeMessage4FE redEnvelopeMessage4FE2 = new RedEnvelopeMessage4FE();
                        MessageRedEnvelopInfo messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo;
                        if (messageRedEnvelopInfo2 != null) {
                            redEnvelopInfo4FELIZ = C1104730er1.LIZ(messageRedEnvelopInfo2);
                        } else {
                            redEnvelopInfo4FELIZ = null;
                        }
                        redEnvelopeMessage4FE2.envelopInfo = redEnvelopInfo4FELIZ;
                        redEnvelopeMessage4FE2.diaplay = redEnvelopMessage.display;
                        redEnvelopeMessage4FE2.businessTypeString = "shortTouchTreasureBox";
                        list3.add(redEnvelopeMessage4FE2);
                    }
                }
            }
            if (LJIIJ()) {
                DataChannel dataChannel = this.LIZIZ;
                if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                for (int size2 = redEnvelopeInfoModel4FE.envelopList.size() - 1; size2 < 1; size2++) {
                    RedEnvelopInfo4FE redEnvelopInfo4FE2 = ((RedEnvelopeMessage4FE) ListProtector.get(redEnvelopeInfoModel4FE.envelopList, size2)).envelopInfo;
                    if (redEnvelopInfo4FE2 != null && (num = redEnvelopInfo4FE2.businessType) != null && num.intValue() == 4 && !PortalFeatureSetting.INSTANCE.getValue() && !zBooleanValue) {
                        ListProtector.remove(redEnvelopeInfoModel4FE.envelopList, size2);
                    }
                }
            }
            ((HashSet) this.LIZ).clear();
            redEnvelopeInfoModel4FE.timeDiff = C963140bAe.LIZJ() - System.currentTimeMillis();
            DataChannel dataChannel2 = this.LIZIZ;
            long jLongValue3 = 0;
            if (dataChannel2 != null && (l3 = (Long) dataChannel2.gg0(C750090Tbb.class)) != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = 0;
            }
            redEnvelopeInfoModel4FE.requestListTimestamp = jLongValue;
            DataChannel dataChannel3 = this.LIZIZ;
            if (dataChannel3 != null && (l2 = (Long) dataChannel3.gg0(C750070TbZ.class)) != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            redEnvelopeInfoModel4FE.requestPermissionTimestamp = jLongValue2;
            DataChannel dataChannel4 = this.LIZIZ;
            if (dataChannel4 != null && (l = (Long) dataChannel4.gg0(C754990TjV.class)) != null) {
                jLongValue3 = l.longValue();
            }
            redEnvelopeInfoModel4FE.listResponseTimestamp = jLongValue3;
            this.LJFF.add(new Pair<>(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, redEnvelopeInfoModel4FE), "api"));
            LIZIZ();
            return;
        }
        C20441214yg.LJ("RedEnvelopePresenter", "err info: list size = 0");
    }

    @Override // X.InterfaceC1104320eqM
    public final void LJFF(String str) {
        this.LJII = str;
    }

    public final void LJIIJJI(boolean z) {
        Context viewContext;
        IHybridStorageService iHybridStorageService;
        InterfaceC1104760er4 interfaceC1104760er4 = this.LIZJ;
        if (interfaceC1104760er4 != null && (viewContext = interfaceC1104760er4.getViewContext()) != null && (iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)) != null) {
            iHybridStorageService.CM(viewContext, Boolean.valueOf(z), "TREASURE_BOX_SHORT_TOUCH_IS_SHOWING", null);
        }
    }

    @Override // X.InterfaceC1104320eqM
    public final void LJII(DataChannel dataChannel, InterfaceC1104760er4 interfaceC1104760er4) {
        LifecycleOwner lifecycleOwner;
        IMessageManager iMessageManager;
        LiveWidget liveWidget;
        RoomAuthStatus roomAuthStatus;
        RoomAuthMessage roomAuthMessage;
        RoomAuthMessageGoldenEnvelope roomAuthMessageGoldenEnvelope;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachView(");
        sbLIZ.append(dataChannel);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("RedEnvelopePresenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = interfaceC1104760er4;
        this.LIZIZ = dataChannel;
        this.LIZLLL = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        this.LJ = room;
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isAnchorEnvelopeRevoke() && (roomAuthMessage = room.mRoomAuthMessage) != null && (roomAuthMessageGoldenEnvelope = roomAuthMessage.goldenEnvelope) != null) {
            long j = roomAuthMessageGoldenEnvelope.revokeEndTime * 1000;
            if (j > C158B.LIZIZ() && j - C158B.LIZIZ() > 0) {
                DataChannel dataChannel2 = this.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C1104680eqw.class, Long.valueOf(j));
                }
                InterfaceC1104760er4 interfaceC1104760er42 = this.LIZJ;
                if (interfaceC1104760er42 != null) {
                    interfaceC1104760er42.e0();
                }
            }
        }
        LJIIJJI(false);
        InterfaceC1104760er4 interfaceC1104760er43 = this.LIZJ;
        if (interfaceC1104760er43 instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) interfaceC1104760er43;
        } else {
            lifecycleOwner = null;
        }
        DataChannel dataChannel3 = this.LIZIZ;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(lifecycleOwner, LiveSendRedEnvelopeEvent.class, new AwS596S0100000_17(this, 24));
        }
        Object obj = this.LIZJ;
        if ((obj instanceof LiveWidget) && (liveWidget = (LiveWidget) obj) != null) {
            ((C0J1N) C784440Upu.LIZ().LJ(C1104630eqr.class).LIZJ(C11RD.LJ(liveWidget))).LIZJ(new AfS153S0200000_17(this, liveWidget, 1));
        }
        C1548820qPI.LIZLLL("liveGoldenEnvelopeCreate", this.LJIIIZ);
        C1548820qPI.LIZLLL("liveGoldenEnvelopCloseAll", this.LJIIIZ);
        C1548820qPI.LIZLLL("EVENT_ENVELOPE_UPDATE", this.LJIIIZ);
        DataChannel dataChannel4 = this.LIZIZ;
        if (dataChannel4 != null && (iMessageManager = (IMessageManager) dataChannel4.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.RED_ENVELOPE_MESSAGE.getIntType(), this.LJIIIIZZ);
            iMessageManager.addMessageListener(C001A.ACCESS_RECALL_MESSAGE.getIntType(), this.LJIIIIZZ);
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this.LJIIIIZZ);
        }
    }

    public final String LJIIIZ(RedEnvelopMessage redEnvelopMessage, String str) {
        boolean z;
        RedEnvelopInfo4FE redEnvelopInfo4FELIZ;
        long jLongValue;
        long jLongValue2;
        Long l;
        Long l2;
        Long l3;
        Integer num;
        boolean zBooleanValue;
        RedEnvelopInfo4FE redEnvelopInfo4FELIZ2;
        Integer num2;
        Boolean bool;
        int iIntValue = 0;
        if (redEnvelopMessage == null) {
            z = true;
        } else {
            z = false;
        }
        if (z || redEnvelopMessage.envelopeInfo == null) {
            return null;
        }
        RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE = new RedEnvelopeInfoModel4FE();
        redEnvelopeInfoModel4FE.dataFrom = str;
        if (LJIIJ()) {
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo;
            if (messageRedEnvelopInfo != null && (num2 = messageRedEnvelopInfo.businessType) != null && num2.intValue() == 4 && !PortalFeatureSetting.INSTANCE.getValue() && !zBooleanValue) {
                redEnvelopeInfoModel4FE.envelopList = new ArrayList();
            } else {
                RedEnvelopeMessage4FE[] redEnvelopeMessage4FEArr = new RedEnvelopeMessage4FE[1];
                RedEnvelopeMessage4FE redEnvelopeMessage4FE = new RedEnvelopeMessage4FE();
                MessageRedEnvelopInfo messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo2 != null) {
                    redEnvelopInfo4FELIZ2 = C1104730er1.LIZ(messageRedEnvelopInfo2);
                } else {
                    redEnvelopInfo4FELIZ2 = null;
                }
                redEnvelopeMessage4FE.envelopInfo = redEnvelopInfo4FELIZ2;
                redEnvelopeMessage4FE.diaplay = redEnvelopMessage.display;
                redEnvelopeMessage4FE.businessTypeString = "shortTouchTreasureBox";
                redEnvelopeMessage4FEArr[0] = redEnvelopeMessage4FE;
                redEnvelopeInfoModel4FE.envelopList = C1697810uHb.LJ(redEnvelopeMessage4FEArr);
            }
        } else if (redEnvelopMessage.display == 1) {
            RedEnvelopeMessage4FE[] redEnvelopeMessage4FEArr2 = new RedEnvelopeMessage4FE[1];
            RedEnvelopeMessage4FE redEnvelopeMessage4FE2 = new RedEnvelopeMessage4FE();
            MessageRedEnvelopInfo messageRedEnvelopInfo3 = redEnvelopMessage.envelopeInfo;
            if (messageRedEnvelopInfo3 != null) {
                redEnvelopInfo4FELIZ = C1104730er1.LIZ(messageRedEnvelopInfo3);
            } else {
                redEnvelopInfo4FELIZ = null;
            }
            redEnvelopeMessage4FE2.envelopInfo = redEnvelopInfo4FELIZ;
            redEnvelopeMessage4FE2.diaplay = redEnvelopMessage.display;
            redEnvelopeMessage4FE2.businessTypeString = "shortTouchTreasureBox";
            redEnvelopeMessage4FEArr2[0] = redEnvelopeMessage4FE2;
            redEnvelopeInfoModel4FE.envelopList = C1697810uHb.LJ(redEnvelopeMessage4FEArr2);
        } else {
            C20441214yg.LJ("RedEnvelopePresenter", "wait interface");
        }
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
        MessageRedEnvelopInfo messageRedEnvelopInfo4 = redEnvelopMessage.envelopeInfo;
        if (messageRedEnvelopInfo4 != null && (num = messageRedEnvelopInfo4.businessType) != null) {
            iIntValue = num.intValue();
        }
        redEnvelopeInfoModel4FE.timeDiff = C963140bAe.LIZJ() - System.currentTimeMillis();
        DataChannel dataChannel2 = this.LIZIZ;
        long jLongValue3 = 0;
        if (dataChannel2 != null && (l3 = (Long) dataChannel2.gg0(C750090Tbb.class)) != null) {
            jLongValue = l3.longValue();
        } else {
            jLongValue = 0;
        }
        redEnvelopeInfoModel4FE.requestListTimestamp = jLongValue;
        DataChannel dataChannel3 = this.LIZIZ;
        if (dataChannel3 != null && (l2 = (Long) dataChannel3.gg0(C750070TbZ.class)) != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        redEnvelopeInfoModel4FE.requestPermissionTimestamp = jLongValue2;
        DataChannel dataChannel4 = this.LIZIZ;
        if (dataChannel4 != null && (l = (Long) dataChannel4.gg0(C754990TjV.class)) != null) {
            jLongValue3 = l.longValue();
        }
        redEnvelopeInfoModel4FE.listResponseTimestamp = jLongValue3;
        Gson gson = C19748512Ol.LIZIZ;
        if (map == null || !Intrinsics.LJFF(map.get(Long.valueOf(iIntValue)), Boolean.TRUE)) {
            return null;
        }
        return GsonProtectorUtils.toJson(gson, redEnvelopeInfoModel4FE);
    }
}
