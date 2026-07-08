package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxMessage4FE;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVirtualTicketIsUserEnabledSetting;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0er0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104720er0 implements InterfaceC1104490eqd {
    public DataChannel LIZIZ;
    public InterfaceC1104520eqg LIZJ;
    public Boolean LIZLLL;
    public final Set<RedEnvelopMessage> LIZ = new HashSet();
    public final Map<Integer, String> LJ = new LinkedHashMap();
    public final C1151720g4o LJFF = new C1151720g4o(this, 23);
    public final C1151790g4v LJI = new C1151790g4v(this, 6);

    @Override // X.InterfaceC1104490eqd
    public final void LIZJ() {
        IMessageManager iMessageManager;
        this.LIZJ = null;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this.LJFF);
        }
        C1548820qPI.LJIIIIZZ("liveGoldenEnvelopCloseAll", this.LJI);
        C1548820qPI.LJIIIIZZ("EVENT_ENVELOPE_UPDATE", this.LJI);
        ((HashSet) this.LIZ).clear();
        ((LinkedHashMap) this.LJ).clear();
        C973880bRy.LIZ.clear();
    }

    @Override // X.InterfaceC1104490eqd
    public final void onPause() {
    }

    @Override // X.InterfaceC1104490eqd
    public final void onResume() {
    }

    @Override // X.InterfaceC1104490eqd
    public final boolean isAnchor() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC1104490eqd
    public final boolean LIZIZ(int i) {
        if (((LinkedHashMap) this.LJ).keySet().contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1104490eqd
    public final void LIZLLL(List<RedEnvelopInfo> list) {
        Integer num;
        Integer num2;
        List<ActivityTreasureBoxMessage4FE> list2;
        Integer num3;
        Integer num4;
        List<ActivityTreasureBoxMessage4FE> list3;
        int size;
        String str;
        ImageModel imageModel;
        List urls;
        List urls2;
        ArrayList<RedEnvelopInfo> arrayList = new ArrayList();
        for (RedEnvelopInfo redEnvelopInfo : list) {
            Integer num5 = redEnvelopInfo.businessType;
            if (num5 == null || num5.intValue() != 0) {
                Integer num6 = redEnvelopInfo.businessType;
                if (num6 == null || num6.intValue() != 1) {
                    Integer num7 = redEnvelopInfo.businessType;
                    if (num7 == null || num7.intValue() != 2) {
                        Integer num8 = redEnvelopInfo.businessType;
                        if (num8 == null || num8.intValue() != 9) {
                            Integer num9 = redEnvelopInfo.businessType;
                            if (num9 == null || num9.intValue() != 19) {
                                Integer num10 = redEnvelopInfo.businessType;
                                if (num10 == null || num10.intValue() != 20 || LiveMatchVirtualTicketIsUserEnabledSetting.getValue()) {
                                    arrayList.add(redEnvelopInfo);
                                }
                            }
                        }
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (RedEnvelopInfo redEnvelopInfo2 : arrayList) {
            if (!linkedHashMap.containsKey(redEnvelopInfo2.businessType)) {
                linkedHashMap.put(redEnvelopInfo2.businessType, new ActivityTreasureBoxInfoModel4FE());
                ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(redEnvelopInfo2.businessType);
                if (activityTreasureBoxInfoModel4FE != null) {
                    activityTreasureBoxInfoModel4FE.timeDiff = C963140bAe.LIZLLL;
                }
            }
            ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE2 = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(redEnvelopInfo2.businessType);
            if (activityTreasureBoxInfoModel4FE2 != null && (list3 = activityTreasureBoxInfoModel4FE2.envelopList) != null) {
                ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE = new ActivityTreasureBoxMessage4FE();
                ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE = new ActivityTreasureBoxInfo4FE();
                activityTreasureBoxInfo4FE.businessType = redEnvelopInfo2.businessType;
                activityTreasureBoxInfo4FE.diamondCount = redEnvelopInfo2.diamondCount;
                activityTreasureBoxInfo4FE.envelopeId = redEnvelopInfo2.envelopeId;
                activityTreasureBoxInfo4FE.envelopeIdc = redEnvelopInfo2.envelopeIdc;
                activityTreasureBoxInfo4FE.peopleCount = redEnvelopInfo2.peopleCount;
                activityTreasureBoxInfo4FE.sendUserId = redEnvelopInfo2.sendUserId;
                activityTreasureBoxInfo4FE.unpackAt = redEnvelopInfo2.unpackAt;
                activityTreasureBoxInfo4FE.sendUserName = redEnvelopInfo2.sendUserName;
                ImageModel imageModel2 = redEnvelopInfo2.sendUserAvatar;
                if (imageModel2 != null && (urls2 = imageModel2.getUrls()) != null) {
                    size = urls2.size();
                } else {
                    size = 0;
                }
                String json = "";
                if (size <= 0 || (imageModel = redEnvelopInfo2.sendUserAvatar) == null || (urls = imageModel.getUrls()) == null || (str = (String) ListProtector.get(urls, 0)) == null) {
                    str = "";
                }
                activityTreasureBoxInfo4FE.sendUserAvatar = str;
                activityTreasureBoxInfo4FE.followStatusShow = redEnvelopInfo2.followShowStatus;
                activityTreasureBoxInfo4FE.skinId = redEnvelopInfo2.skinId;
                activityTreasureBoxInfo4FE.voteCount = redEnvelopInfo2.voteCount;
                activityTreasureBoxInfo4FE.createAt = String.valueOf(redEnvelopInfo2.createAt);
                EnvelopeEnigmaInfo envelopeEnigmaInfo = redEnvelopInfo2.senderEnigmaInfo;
                if (envelopeEnigmaInfo != null) {
                    json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, envelopeEnigmaInfo);
                }
                activityTreasureBoxInfo4FE.senderEnigmaInfo = json;
                activityTreasureBoxMessage4FE.envelopInfo = activityTreasureBoxInfo4FE;
                activityTreasureBoxMessage4FE.diaplay = 1;
                list3.add(activityTreasureBoxMessage4FE);
            }
        }
        Iterator it2 = ((HashSet) this.LIZ).iterator();
        while (true) {
            ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FELIZ = null;
            if (it2.hasNext()) {
                RedEnvelopMessage redEnvelopMessage = (RedEnvelopMessage) it2.next();
                MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo != null) {
                    num = messageRedEnvelopInfo.businessType;
                } else {
                    num = null;
                }
                if (!linkedHashMap.containsKey(num)) {
                    MessageRedEnvelopInfo messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo;
                    if (messageRedEnvelopInfo2 != null) {
                        num3 = messageRedEnvelopInfo2.businessType;
                    } else {
                        num3 = null;
                    }
                    linkedHashMap.put(num3, new ActivityTreasureBoxInfoModel4FE());
                    MessageRedEnvelopInfo messageRedEnvelopInfo3 = redEnvelopMessage.envelopeInfo;
                    if (messageRedEnvelopInfo3 != null) {
                        num4 = messageRedEnvelopInfo3.businessType;
                    } else {
                        num4 = null;
                    }
                    ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE3 = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(num4);
                    if (activityTreasureBoxInfoModel4FE3 != null) {
                        activityTreasureBoxInfoModel4FE3.timeDiff = C963140bAe.LIZLLL;
                    }
                }
                MessageRedEnvelopInfo messageRedEnvelopInfo4 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo4 != null) {
                    num2 = messageRedEnvelopInfo4.businessType;
                } else {
                    num2 = null;
                }
                ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE4 = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(num2);
                if (activityTreasureBoxInfoModel4FE4 != null && (list2 = activityTreasureBoxInfoModel4FE4.envelopList) != null) {
                    ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE2 = new ActivityTreasureBoxMessage4FE();
                    MessageRedEnvelopInfo messageRedEnvelopInfo5 = redEnvelopMessage.envelopeInfo;
                    if (messageRedEnvelopInfo5 != null) {
                        activityTreasureBoxInfo4FELIZ = C1104740er2.LIZ(messageRedEnvelopInfo5);
                    }
                    activityTreasureBoxMessage4FE2.envelopInfo = activityTreasureBoxInfo4FELIZ;
                    activityTreasureBoxMessage4FE2.diaplay = redEnvelopMessage.display;
                    list2.add(activityTreasureBoxMessage4FE2);
                }
            } else {
                ((HashSet) this.LIZ).clear();
                LJFF(linkedHashMap, null, "api");
                return;
            }
        }
    }

    @Override // X.InterfaceC1104490eqd
    public final void LIZ(int i, String str) {
        this.LJ.put(Integer.valueOf(i), str);
    }

    @Override // X.InterfaceC1104490eqd
    public final void LJ(DataChannel dataChannel, InterfaceC1104520eqg interfaceC1104520eqg) {
        IMessageManager iMessageManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachView(");
        sbLIZ.append(dataChannel);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("ActivityTreasurePresenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = interfaceC1104520eqg;
        this.LIZIZ = dataChannel;
        this.LIZLLL = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        dataChannel.gg0(RoomChannel.class);
        C1548820qPI.LIZLLL("liveGoldenEnvelopCloseAll", this.LJI);
        C1548820qPI.LIZLLL("EVENT_ENVELOPE_UPDATE", this.LJI);
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.RED_ENVELOPE_MESSAGE.getIntType(), this.LJFF);
        }
    }

    public final void LJFF(Map<Integer, ActivityTreasureBoxInfoModel4FE> map, RedEnvelopMessage redEnvelopMessage, String str) {
        if (this.LIZJ == null) {
            Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
            while (it2.hasNext()) {
                C1104380eqS.LIZ(this.LIZLLL, "RedEnvelopeWidget is null", ((ActivityTreasureBoxInfoModel4FE) ((Map.Entry) it2.next()).getValue()).envelopList);
            }
        }
        InterfaceC1104520eqg interfaceC1104520eqg = this.LIZJ;
        if (interfaceC1104520eqg != null) {
            interfaceC1104520eqg.LLZL(map, str);
        }
    }
}
