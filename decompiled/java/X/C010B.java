package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubWaveImMsg;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SubWaveMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.010B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010B implements OnIMMessageListener, InterfaceC1098120egM, InterfaceC1141530foN {
    public IMessageManager LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public Room LLILZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "sub_wave";
    }

    @Override // X.InterfaceC1098120egM
    public final void onUnload() {
        C2660011e c2660011e;
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class)) != null) {
            ((ConcurrentHashMap) c2660011e.LIZ).remove(InterfaceC1098120egM.class);
        }
        C1548820qPI.LJIIIIZZ("live_indicator_has_ongoing_sub_wave", this);
        this.LLILLJJLI = null;
        this.LL = null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final JSONObject LIZ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    LIZ(jSONObject2);
                    jSONObject.put(next, jSONObject2);
                } else if (obj instanceof Long) {
                    jSONObject.put(next, String.valueOf(((Number) obj).longValue()));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("SubWaveHelper", e);
            }
        }
        return jSONObject;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd;
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_indicator_has_ongoing_sub_wave")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "roomId", "");
            } else {
                strLJFF = null;
            }
            if (Intrinsics.LJFF(strLJFF, String.valueOf(C500260Jjc.LJJLIIIJ(this.LLILLJJLI))) && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
                C1871910yoP.LIZIZ(interfaceC1107590evd, "hasOngoing", false);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int i;
        long id;
        User owner;
        SubscribeInfo subscribeInfo;
        String str;
        Room room;
        String str2;
        User owner2;
        SubscribeInfo subscribeInfo2;
        Integer numValueOf;
        if (iMessage instanceof SubWaveMessage) {
            SubWaveMessage subWaveMessage = (SubWaveMessage) iMessage;
            SubWaveImMsg subWaveImMsg = subWaveMessage.subWaveImMsg;
            if (subWaveImMsg != null && (numValueOf = Integer.valueOf(subWaveImMsg.msgType)) != null && numValueOf.intValue() != 0) {
                numValueOf.intValue();
            }
            try {
                JSONObject jSONObject = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, iMessage));
                LIZ(jSONObject);
                C389001fE.LIZ("live_subscription_wave_indicator_message", jSONObject, System.currentTimeMillis(), false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
            String str3 = "";
            if (!this.LLILLL) {
                this.LLILLL = true;
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).cw0().getClass();
                C0KBS c0kbs = C0KBS.LIZ;
                Room room2 = this.LLILZ;
                if (room2 == null || (owner2 = room2.getOwner()) == null || (subscribeInfo2 = owner2.getSubscribeInfo()) == null || (str2 = subscribeInfo2.packageId) == null) {
                    str2 = "";
                }
                C0KBS.LJIIJ(1, str2);
            }
            SubWaveImMsg subWaveImMsg2 = subWaveMessage.subWaveImMsg;
            if (subWaveImMsg2 != null && subWaveImMsg2.msgType == 3) {
                if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Cg2()) {
                    i = 2131839367;
                } else {
                    i = 2131844505;
                }
                String strLJIJI = C497740JfY.LJIJI(i);
                DataChannel dataChannel = this.LLILLJJLI;
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                RoomMessage roomMessageLJ = C181500mr.LJ(id, strLJIJI);
                IMessageManager iMessageManager = this.LL;
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(roomMessageLJ, true);
                }
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).cw0().getClass();
                C0KBS c0kbs2 = C0KBS.LIZ;
                Room room3 = this.LLILZ;
                if (room3 != null && (owner = room3.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && (str = subscribeInfo.packageId) != null) {
                    str3 = str;
                }
                C0KBS.LJIIJ(0, str3);
            }
        }
    }

    public final void LIZIZ(Context context, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (dataChannel != null) {
            C500260Jjc.LJIIZILJ(dataChannel);
        }
        this.LLILLJJLI = dataChannel;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        this.LLILZ = room;
        if (!C494680Jac.LJIIL(room)) {
            return;
        }
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.SUB_WAVE_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        if (dataChannel != null) {
            C2659011d.LIZIZ(dataChannel, InterfaceC1098120egM.class, this, false);
        }
        C1548820qPI.LIZLLL("live_indicator_has_ongoing_sub_wave", this);
    }
}
