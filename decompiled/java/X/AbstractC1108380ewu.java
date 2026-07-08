package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.PinCardCheckRequestEvent;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ewu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1108380ewu implements InterfaceC1107910ew9, OnIMMessageListener, InterfaceC1141530foN {
    public Context LL;
    public LifecycleOwner LLILLJJLI;
    public DataChannel LLILLL;
    public Room LLILZIL;
    public int LLILZLL;
    public long LLJILJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1108490ex5());
    public boolean LLIZ = true;
    public EnumC1108060ewO LLIZLLLIL = EnumC1108060ewO.NULL;
    public long LLJ = -1;
    public long LLJI = -1;
    public final Map<String, String> LLJIJIL = new LinkedHashMap();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1108500ex6());

    public abstract int LJIIIZ();

    public abstract void LJIIJ(EnumC1108700exQ enumC1108700exQ);

    public abstract boolean LJIIL(C1108790exZ c1108790exZ);

    public abstract void LJIIZILJ(Function1<? super C512740K8y, Unit> function1);

    public abstract void LJIJ(EnumC1108700exQ enumC1108700exQ, Long l);

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "WebcastSubPinEventMessage";
    }

    public final Context LJFF() {
        Context context = this.LL;
        if (context != null) {
            return context;
        }
        return null;
    }

    public final DataChannel LJI() {
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            return dataChannel;
        }
        return null;
    }

    public final LifecycleOwner LJII() {
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        return null;
    }

    public final IPinCardService LJIIIIZZ() {
        return (IPinCardService) this.LLILZ.getValue();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final boolean LJ(SubPinCard subPinCard) {
        long id;
        Room room = this.LLILZIL;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        long j = subPinCard.id;
        long j2 = subPinCard.lastPinTimestamp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(id);
        sbLIZ.append('_');
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(j2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0JT6<Map<String, String>> c0jt6 = InterfaceC1106030et7.Z7;
        Map<String, String> mapLIZ = c0jt6.LIZ();
        if (mapLIZ != null && mapLIZ.containsKey(strLIZIZ)) {
            return false;
        }
        Map<String, String> mapLIZ2 = c0jt6.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (mapLIZ2 != null) {
            linkedHashMap.putAll(mapLIZ2);
        }
        linkedHashMap.put(strLIZIZ, "");
        c0jt6.LIZJ(linkedHashMap);
        return true;
    }

    public final void LJIILL(Room room) {
        SubPinCard subPinCard;
        if (room != null && (subPinCard = room.subPinCard) != null && subPinCard.type == LJIIIZ() && LJIIL(new C1108790exZ(subPinCard, new C1107970ewF(-1L), null, null, 12))) {
            room.subPinCard = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mh2(X.C262100zr r10) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1108380ewu.mh2(X.00zr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192 A[PHI: r6
      0x0192: PHI (r6v2 boolean) = (r6v1 boolean), (r6v8 boolean), (r6v8 boolean) binds: [B:82:0x018e, B:45:0x00a0, B:47:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r21) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1108380ewu.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // X.InterfaceC1107910ew9
    public void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        EnumC1108700exQ enumC1108700exQ;
        long jLongValue;
        Long l;
        Object obj;
        this.LLJI = SystemClock.elapsedRealtime();
        int i = C1107870ew5.LIZ[enumC1108010ewJ.ordinal()];
        Object obj2 = null;
        if (i != 1) {
            if (i != 2) {
                if (map != null) {
                    obj = map.get("reason");
                } else {
                    obj = null;
                }
                if (!(obj instanceof EnumC1108700exQ) || (enumC1108700exQ = (EnumC1108700exQ) obj) == null) {
                    enumC1108700exQ = EnumC1108700exQ.OTHER;
                }
            } else {
                enumC1108700exQ = EnumC1108700exQ.REPLACED;
            }
        } else {
            enumC1108700exQ = EnumC1108700exQ.AUTO;
        }
        if (map != null) {
            obj2 = map.get("operatorUserId");
        }
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLJILJIL;
        }
        if (jLongValue == UserService.getInstance().user().getCurrentUserId()) {
            LJIIJ(enumC1108700exQ);
        }
        this.LLJ = -1L;
        this.LLJI = -1L;
        this.LLJILJIL = 0L;
        ((LinkedHashMap) this.LLJIJIL).clear();
    }

    @Override // X.InterfaceC1107910ew9
    public void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        this.LLIZ = true;
        this.LLILZLL = 0;
        this.LLIZLLLIL = EnumC1108060ewO.NULL;
        this.LLJ = -1L;
        this.LLJI = -1L;
        this.LLJILJIL = 0L;
        ((LinkedHashMap) this.LLJIJIL).clear();
        IMessageManager iMessageManager = (IMessageManager) LJI().gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        C1548820qPI.LJIIIIZZ("subscription_pin_card_request", this);
        C1548820qPI.LJIIIIZZ("subscription_unpin_card_request", this);
        C1548820qPI.LJIIIIZZ("subscription_pin_card_close", this);
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZJ(EnumC1107860ew4 enumC1107860ew4, boolean z) {
        switch (C1107870ew5.LIZIZ[enumC1107860ew4.ordinal()]) {
            case 1:
                LJIIJJI(z, 1, EnumC1108060ewO.EC);
                break;
            case 2:
                LJIIJJI(z, 2, EnumC1108060ewO.LIVE_EVENT);
                break;
            case 3:
                LJIIJJI(z, 4, EnumC1108060ewO.LIVE_GOAL);
                break;
            case 4:
                LJIIJJI(z, 8, EnumC1108060ewO.QA);
                break;
            case 5:
                LJIIJJI(z, 16, EnumC1108060ewO.CUSTOM_POLL);
                break;
            case 6:
                LJIIJJI(z, 256, EnumC1108060ewO.PIN_CARD);
                break;
            case 7:
                LJIIJJI(z, 512, EnumC1108060ewO.SUB_GOAL_PIN_CARD);
                break;
            case 8:
                LJIIJJI(z, 1024, EnumC1108060ewO.GAME_PARTNERSHIP);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJIIJJI(z, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, EnumC1108060ewO.LEADS_GEN);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJIIJJI(z, 65536, EnumC1108060ewO.UPSELL_DM);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJIIJJI(z, 131072, EnumC1108060ewO.UPSELL_LEADS_GEN);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJIIJJI(z, 262144, EnumC1108060ewO.GAME_GUESSING);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJIIJJI(z, 524288, EnumC1108060ewO.SERVICE_PLUS_DM);
                break;
            case 14:
                LJIIJJI(z, 524288, EnumC1108060ewO.SERVICE_PLUS_FORM);
                break;
            case 15:
                LJIIJJI(z, 524288, EnumC1108060ewO.SERVICE_PLUS_SUB);
                break;
            case 16:
                LJIIJJI(z, 524288, EnumC1108060ewO.PCS_COURSE_VIDEO);
                break;
        }
    }

    @Override // X.InterfaceC1107910ew9
    public void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        this.LL = c1107460evQ.LIZ;
        this.LLILLJJLI = c1107460evQ.LIZIZ;
        this.LLILLL = c1107460evQ.LIZJ;
        this.LLILZIL = (Room) LJI().gg0(RoomChannel.class);
        DataChannel dataChannelLJI = LJI();
        dataChannelLJI.BQ2(LJII(), PublicScreenNormalPollStateVisibilityChannel.class, new C1108440ex0(this));
        dataChannelLJI.BQ2(LJII(), PublicScreenGiftPollStateVisibilityChannel.class, new C1108450ex1(this));
        dataChannelLJI.BQ2(LJII(), SubOnlyLiveAudienceStatusChannel.class, new C1108430ewz(this));
        if (!C916790Zxt.LIZ(8)) {
            DataChannel dataChannelLJI2 = LJI();
            dataChannelLJI2.BQ2(LJII(), HighPrioritySlotVisibilityChannel.class, new C1108460ex2(this));
            dataChannelLJI2.BQ2(LJII(), HighPriorityTooltipVisibilityChannel.class, new C1108470ex3(this));
        }
        IMessageManager iMessageManager = (IMessageManager) LJI().gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.SUB_PIN_EVENT_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        C1548820qPI.LIZLLL("subscription_pin_card_request", this);
        C1548820qPI.LIZLLL("subscription_unpin_card_request", this);
        C1548820qPI.LIZLLL("subscription_pin_card_close", this);
        DataChannel dataChannelLJI3 = LJI();
        if (dataChannelLJI3 != null) {
            dataChannelLJI3.BQ2(LJII(), PinCardCheckRequestEvent.class, new C1108400eww(this));
        }
    }

    public final void LJIILIIL(int i, EnumC1108060ewO enumC1108060ewO) {
        boolean z;
        int i2 = (~i) & this.LLILZLL;
        this.LLILZLL = i2;
        if (i2 == 0) {
            z = true;
            enumC1108060ewO = EnumC1108060ewO.NULL;
        } else {
            z = false;
        }
        this.LLIZ = z;
        this.LLIZLLLIL = enumC1108060ewO;
        if (!z) {
            LJIJ(EnumC1108700exQ.REPLACED, Long.valueOf(this.LLJILJIL));
        }
    }

    public final void LJIILJJIL(int i, EnumC1108060ewO enumC1108060ewO) {
        boolean z;
        int i2 = i | this.LLILZLL;
        this.LLILZLL = i2;
        if (i2 == 0) {
            z = true;
            enumC1108060ewO = EnumC1108060ewO.NULL;
        } else {
            z = false;
        }
        this.LLIZ = z;
        this.LLIZLLLIL = enumC1108060ewO;
        if (!z) {
            LJIJ(EnumC1108700exQ.REPLACED, Long.valueOf(this.LLJILJIL));
        }
    }

    public final void LJIILLIIL(Function1 function1, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isConfirm", z);
        jSONObject.put("pinCardType", LJIIIZ());
        C389001fE.LIZ("subscription_pin_card_response", jSONObject, System.currentTimeMillis(), false);
        if (function1 != null) {
            LJIIIZ();
            function1.invoke(new C512740K8y(z));
        }
    }

    @Override // X.InterfaceC1107910ew9
    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
        this.LLJ = SystemClock.elapsedRealtime();
    }

    public final void LJIIJJI(boolean z, int i, EnumC1108060ewO enumC1108060ewO) {
        if (z) {
            LJIILJJIL(i, enumC1108060ewO);
        } else {
            LJIILIIL(i, enumC1108060ewO);
        }
    }
}
