package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsPinCardActiveTimeSecondsSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.pincard.LivePcsPinCardImTimeoutDurationSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.pincard.PinCardCheckRequestEvent;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.SubPinEventMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0evK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1107400evK implements InterfaceC1107910ew9, OnIMMessageListener, InterfaceC1141530foN {
    public static final long LLJILJILJ = ((long) LivePcsPinCardActiveTimeSecondsSetting.INSTANCE.getValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    public Context LL;
    public LifecycleOwner LLILLJJLI;
    public DataChannel LLILLL;
    public InterfaceC1107200ev0 LLILZIL;
    public Room LLILZLL;
    public long LLIZ;
    public long LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1107440evO());
    public final Map<String, String> LLIZLLLIL = new LinkedHashMap();
    public final C1822790xXB LLJILJIL = new C1822790xXB("PinCardIMMessageDurationAnchor", 1014, LivePcsPinCardImTimeoutDurationSetting.INSTANCE.getValue());

    public abstract int LJ();

    public abstract void LJFF();

    public abstract void LJII(SubPinEventMessage subPinEventMessage);

    public abstract boolean LJIIIIZZ(C1107220ev2 c1107220ev2);

    public abstract void LJIIIZ(EnumC1108010ewJ enumC1108010ewJ, Long l);

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "WebcastSubPinEventMessage";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1107400evK.mh2(X.00zr):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        SubPinEventMessage subPinEventMessage;
        SubPinCard subPinCard;
        long j;
        if ((iMessage instanceof SubPinEventMessage) && (subPinCard = (subPinEventMessage = (SubPinEventMessage) iMessage).card) != null && subPinCard.type == LJ()) {
            int i = subPinEventMessage.actionType;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LJII(subPinEventMessage);
                        return;
                    }
                    return;
                } else {
                    if (subPinEventMessage.card == null) {
                        return;
                    }
                    LJIIIZ(EnumC1108010ewJ.MANUALLY_CLOSE, Long.valueOf(subPinEventMessage.operatorUserId));
                    return;
                }
            }
            this.LLJIJIL = false;
            CommonMessageData commonMessageData = subPinEventMessage.baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
                if (j > -2) {
                    long jLIZ = C158B.LIZ() - j;
                    if (C500260Jjc.LJIIZILJ(this.LLILLL)) {
                        C1822790xXB c1822790xXB = this.LLJILJIL;
                        if (c1822790xXB.LIZLLL == 0 && this.LLJI) {
                            this.LLJI = false;
                            c1822790xXB.LIZLLL(System.identityHashCode(this), "service_plus_pin_notice", C2097608Jq.LJ());
                        }
                        this.LLJILJIL.LJ(C2097908Jt.LIZJ(new Pair("fmp_duration_im", String.valueOf(jLIZ))));
                    } else {
                        C1107500evU.LIZ.getClass();
                        C1107500evU.LIZLLL(jLIZ, false);
                    }
                }
            } else {
                j = -2;
            }
            SubPinCard subPinCard2 = subPinEventMessage.card;
            if (subPinCard2 == null) {
                return;
            }
            LJIIIIZZ(new C1107220ev2(subPinCard2, new C1107970ewF(j), Long.valueOf(subPinEventMessage.operatorUserId), 8));
        }
    }

    @Override // X.InterfaceC1107910ew9
    public void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        long jLongValue;
        Long l;
        SystemClock.elapsedRealtime();
        Object obj = null;
        if (map != null) {
            obj = map.get("operatorUserId");
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLJ;
        }
        if (jLongValue == UserService.getInstance().user().getCurrentUserId()) {
            LJFF();
        }
        this.LLJILJIL.LIZJ(C2097608Jq.LJ());
        this.LLJ = 0L;
        ((LinkedHashMap) this.LLIZLLLIL).clear();
        InterfaceC1107200ev0 interfaceC1107200ev0 = this.LLILZIL;
        if (interfaceC1107200ev0 != null) {
            interfaceC1107200ev0.LIZ(enumC1108010ewJ, map);
        }
    }

    @Override // X.InterfaceC1107910ew9
    public void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        IMessageManager iMessageManager;
        DataChannel dataChannel;
        this.LLJILJIL.LIZJ(C2097608Jq.LJ());
        if (this.LLJIJIL && (dataChannel = this.LLILLL) != null && !C500260Jjc.LJIIZILJ(dataChannel)) {
            C1107500evU.LIZ.getClass();
            C1107500evU.LIZLLL(0L, true);
        }
        this.LLJIJIL = false;
        this.LLIZ = 0L;
        this.LLJ = 0L;
        ((LinkedHashMap) this.LLIZLLLIL).clear();
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        C1548820qPI.LJIIIIZZ("subscription_pin_card_request", this);
        C1548820qPI.LJIIIIZZ("subscription_unpin_card_request", this);
        C1548820qPI.LJIIIIZZ("subscription_pin_card_close", this);
        C1548820qPI.LJIIIIZZ("smb_pin_card_metrics", this);
        InterfaceC1107200ev0 interfaceC1107200ev0 = this.LLILZIL;
        if (interfaceC1107200ev0 != null) {
            interfaceC1107200ev0.onDestroy();
        }
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZJ(EnumC1107860ew4 enumC1107860ew4, boolean z) {
        LJI(1 << enumC1107860ew4.getType().ordinal(), z);
    }

    @Override // X.InterfaceC1107910ew9
    public void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        this.LL = c1107460evQ.LIZ;
        this.LLILLJJLI = c1107460evQ.LIZIZ;
        DataChannel dataChannel = c1107460evQ.LIZJ;
        this.LLILLL = dataChannel;
        this.LLILZLL = (Room) dataChannel.gg0(RoomChannel.class);
        int size = EnumC1107860ew4.getEntries().size();
        ArrayList arrayListLJ = C1697810uHb.LJ(PublicScreenNormalPollStateVisibilityChannel.class, PublicScreenGiftPollStateVisibilityChannel.class);
        if (!C916790Zxt.LIZ(8)) {
            arrayListLJ.add(HighPrioritySlotVisibilityChannel.class);
            arrayListLJ.add(HighPriorityTooltipVisibilityChannel.class);
        }
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null) {
            Iterator it2 = arrayListLJ.iterator();
            while (it2.hasNext()) {
                dataChannel2.BQ2(this.LLILLJJLI, (Class) it2.next(), new C1107450evP(this, size));
                size++;
            }
        }
        IMessageManager iMessageManager = (IMessageManager) c1107460evQ.LIZJ.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.SUB_PIN_EVENT_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        C1548820qPI.LIZLLL("subscription_pin_card_request", this);
        C1548820qPI.LIZLLL("subscription_unpin_card_request", this);
        C1548820qPI.LIZLLL("subscription_pin_card_close", this);
        C1548820qPI.LIZLLL("smb_pin_card_metrics", this);
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this.LLILLJJLI, PinCardCheckRequestEvent.class, new C1107430evN(this));
        }
    }

    public final void LJI(long j, boolean z) {
        if (z) {
            long j2 = j | this.LLIZ;
            this.LLIZ = j2;
            if (j2 != 0) {
                LJIIIZ(EnumC1108010ewJ.COVER, Long.valueOf(this.LLJ));
                return;
            }
            return;
        }
        long j3 = (~j) & this.LLIZ;
        this.LLIZ = j3;
        if (j3 == 0) {
            return;
        }
        LJIIIZ(EnumC1108010ewJ.COVER, Long.valueOf(this.LLJ));
    }

    public final void LJIIJ(Map<String, String> map, Function1<Object, Unit> function1) throws JSONException {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIZLLLIL;
        linkedHashMap.clear();
        linkedHashMap.putAll(map);
        this.LLJI = true;
        this.LLJIJIL = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isConfirm", true);
        jSONObject.put("pinCardType", LJ());
        C389001fE.LIZ("subscription_pin_card_response", jSONObject, System.currentTimeMillis(), false);
    }

    @Override // X.InterfaceC1107910ew9
    public void LLLZIIL(View view, Map<String, ? extends Object> map) {
        SystemClock.elapsedRealtime();
        InterfaceC1107200ev0 interfaceC1107200ev0 = this.LLILZIL;
        if (interfaceC1107200ev0 != null) {
            interfaceC1107200ev0.LLLZIIL(view, map);
        }
    }
}
