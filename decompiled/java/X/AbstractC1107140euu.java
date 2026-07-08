package X;

import android.view.View;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveLeadsAdsPinCardEnableSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.message.SubPinEventMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0euu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1107140euu extends AbstractC1107400evK {
    public static long LLJJIII = -1;
    public final long LLJILLL = AbstractC1107400evK.LLJILJILJ;
    public InterfaceC1107200ev0 LLJJ;
    public boolean LLJJI;

    @Override // X.AbstractC1107400evK
    public final void LJFF() {
    }

    public abstract boolean LJIIJJI();

    public abstract int LJIIL();

    public abstract EnumC1107860ew4 LJIILIIL();

    public String LJIILJJIL(String str) {
        return str;
    }

    @Override // X.AbstractC1107400evK
    public final int LJ() {
        return LJIIL();
    }

    @Override // X.AbstractC1107400evK
    public final void LJII(SubPinEventMessage subPinEventMessage) {
        SubPinCard subPinCard;
        InterfaceC1107200ev0 interfaceC1107200ev0 = this.LLJJ;
        if (interfaceC1107200ev0 != null && (subPinCard = subPinEventMessage.card) != null && interfaceC1107200ev0.LJI(subPinCard)) {
            interfaceC1107200ev0.LIZIZ(subPinCard);
        }
    }

    @Override // X.AbstractC1107400evK
    public boolean LJIIIIZZ(C1107220ev2 c1107220ev2) {
        long id;
        if (!LJIIJJI()) {
            return false;
        }
        SubPinCard subPinCard = c1107220ev2.LIZ;
        subPinCard.actionSchema = LJIILJJIL(subPinCard.actionSchema);
        SubPinCard subPinCard2 = C1107150euv.LIZ;
        Room room = this.LLILZLL;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        String strLIZ = C1107150euv.LIZ(id, subPinCard.id, subPinCard.lastPinTimestamp);
        if (C1107150euv.LIZIZ(strLIZ)) {
            return false;
        }
        C0JT6<Map<String, String>> c0jt6 = InterfaceC1106030et7.Z7;
        Map<String, String> mapLIZ = c0jt6.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (mapLIZ != null) {
            linkedHashMap.putAll(mapLIZ);
        }
        linkedHashMap.put(strLIZ, "");
        c0jt6.LIZJ(linkedHashMap);
        return LJIILL(c1107220ev2, false);
    }

    @Override // X.AbstractC1107400evK, X.InterfaceC1107910ew9
    public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        SubPinCard subPinCardLIZ;
        if (this.LLJJI) {
            Room room = this.LLILZLL;
            if (enumC1108010ewJ == EnumC1108010ewJ.MANUALLY_CLOSE && room != null && (subPinCardLIZ = C1107130eut.LIZ(room)) != null) {
                long j = subPinCardLIZ.id;
                ConcurrentHashMap<Long, Boolean> concurrentHashMap = C1107150euv.LIZIZ;
                if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
                    concurrentHashMap.put(Long.valueOf(j), Boolean.TRUE);
                    for (WeakReference<InterfaceC1107230ev3> weakReference : C1107150euv.LIZJ) {
                        InterfaceC1107230ev3 interfaceC1107230ev3 = weakReference.get();
                        if (interfaceC1107230ev3 == null) {
                            C1107150euv.LIZJ.remove(weakReference);
                        } else {
                            interfaceC1107230ev3.LIZ(j);
                        }
                    }
                }
            }
            this.LLJJI = false;
        }
        super.LIZ(enumC1108010ewJ, map);
    }

    @Override // X.AbstractC1107400evK, X.InterfaceC1107910ew9
    public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        LLJJIII = -1L;
        super.LIZIZ(c1107460evQ, map);
    }

    @Override // X.AbstractC1107400evK, X.InterfaceC1107910ew9
    public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        EnterRoomLinkSession enterRoomLinkSessionLIZ;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        Boolean bool;
        SubPinCard subPinCardLIZ;
        SubPinCard subPinCardLIZ2;
        SubPinCard subPinCard;
        SubPinCard subPinCard2;
        super.LIZLLL(c1107460evQ, map);
        Room room = this.LLILZLL;
        long id = -1;
        if (room != null && (subPinCard2 = room.subPinCard) != null && subPinCard2.type == LJIIL() && LJIIIIZZ(new C1107220ev2(subPinCard2, new C1107970ewF(-1L), null, 12))) {
            room.subPinCard = null;
            Room room2 = this.LLILZLL;
            if (room2 != null) {
                id = room2.getId();
            }
            LLJJIII = id;
            return;
        }
        Room room3 = this.LLILZLL;
        int iLJIIL = LJIIL();
        if (!LiveLeadsAdsPinCardEnableSetting.INSTANCE.enable() || (enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ()) == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null) {
            return;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig;
        if (adLiveEnterRoomConfig != null) {
            bool = adLiveEnterRoomConfig.isLeadsAdsTraffic;
        } else {
            bool = null;
        }
        if (!C1107130eut.LIZJ(bool) || (subPinCardLIZ = C1107130eut.LIZ(room3)) == null || subPinCardLIZ.type != iLJIIL) {
            return;
        }
        SubPinCard subPinCard3 = C1107150euv.LIZ;
        if (C1107150euv.LIZJ(subPinCardLIZ.id)) {
            return;
        }
        if ((room3 != null && (subPinCard = room3.subPinCard) != null && C1083940eJU.LIZIZ(room3) && !C1107150euv.LIZIZ(C1107150euv.LIZ(room3.getId(), subPinCard.id, subPinCard.lastPinTimestamp))) || (subPinCardLIZ2 = C1107130eut.LIZ(this.LLILZLL)) == null) {
            return;
        }
        C1107220ev2 c1107220ev2 = new C1107220ev2(subPinCardLIZ2, new C1107970ewF(-1L), null, 12);
        subPinCardLIZ2.actionSchema = LJIILJJIL(subPinCardLIZ2.actionSchema);
        LJIILL(c1107220ev2, true);
    }

    @Override // X.AbstractC1107400evK
    public final void LJIIIZ(EnumC1108010ewJ enumC1108010ewJ, Long l) {
        long jLongValue;
        IPinCardService iPinCardService = (IPinCardService) this.LLILZ.getValue();
        EnumC1107860ew4 enumC1107860ew4LJIILIIL = LJIILIIL();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("reason", enumC1108010ewJ);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        pairArr[1] = new Pair("operatorUserId", Long.valueOf(jLongValue));
        iPinCardService.Rg(enumC1107860ew4LJIILIIL, enumC1108010ewJ, C2097608Jq.LJIIIIZZ(pairArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if ((true ^ X.C1107150euv.LIZIZ(X.C1107150euv.LIZ(r5.getId(), r1.id, r1.lastPinTimestamp))) != false) goto L16;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0euj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILL(X.C1107220ev2 r14, boolean r15) {
        /*
            r13 = this;
            X.01GW r0 = r13.LLILZ
            java.lang.Object r1 = r0.getValue()
            com.bytedance.android.live.pincard.service.IPinCardService r1 = (com.bytedance.android.live.pincard.service.IPinCardService) r1
            X.0ew4 r0 = r13.LJIILIIL()
            boolean r0 = r1.Qi(r0)
            r6 = 0
            if (r0 == 0) goto L14
            return r6
        L14:
            if (r15 == 0) goto L45
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r13.LLILZLL
            if (r5 == 0) goto L45
            long r3 = X.AbstractC1107140euu.LLJJIII
            long r1 = r5.getId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L44
            com.bytedance.android.livesdk.chatroom.api.SubPinCard r1 = r5.subPinCard
            if (r1 == 0) goto L45
            boolean r0 = X.C1083940eJU.LIZIZ(r5)
            if (r0 == 0) goto L45
            com.bytedance.android.livesdk.chatroom.api.SubPinCard r0 = X.C1107150euv.LIZ
            long r7 = r5.getId()
            long r9 = r1.id
            long r11 = r1.lastPinTimestamp
            java.lang.String r0 = X.C1107150euv.LIZ(r7, r9, r11)
            boolean r0 = X.C1107150euv.LIZIZ(r0)
            r2 = r2 ^ r0
            if (r2 == 0) goto L45
        L44:
            return r6
        L45:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r13.LLILLL
            if (r1 == 0) goto L96
            androidx.lifecycle.LifecycleOwner r4 = r13.LLILLJJLI
            if (r4 == 0) goto L96
            X.0euj r3 = new X.0euj
            android.content.Context r0 = r13.LL
            r3.<init>(r0, r1)
            java.lang.Class<com.bytedance.android.livesdk.comp.api.pcs.IPcsService> r0 = com.bytedance.android.livesdk.comp.api.pcs.IPcsService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.pcs.IPcsService r0 = (com.bytedance.android.livesdk.comp.api.pcs.IPcsService) r0
            r0.pa()
            X.0ew4 r2 = r13.LJIILIIL()
            com.bytedance.android.livesdk.chatroom.api.SubPinCard r1 = r14.LIZ
            java.util.Map<java.lang.String, java.lang.String> r0 = r13.LLIZLLLIL
            X.0ev7 r2 = X.C1106960euc.LIZ(r2, r1, r0, r3, r4)
            if (r2 == 0) goto L96
            r13.LLILZIL = r2
            r13.LLJJI = r15
            java.lang.Long r0 = r14.LIZJ
            if (r0 == 0) goto L93
            long r0 = r0.longValue()
        L79:
            r13.LLJ = r0
            r13.LLJJ = r2
            X.01GW r0 = r13.LLILZ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.pincard.service.IPinCardService r0 = (com.bytedance.android.live.pincard.service.IPinCardService) r0
            X.0ew4 r1 = r13.LJIILIIL()
            X.0ewF r3 = r14.LIZIZ
            long r4 = r13.LLJILLL
            r6 = 0
            boolean r0 = r0.DP(r1, r2, r3, r4, r6)
            return r0
        L93:
            r0 = 0
            goto L79
        L96:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1107140euu.LJIILL(X.0ev2, boolean):boolean");
    }

    @Override // X.AbstractC1107400evK, X.InterfaceC1107910ew9
    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
        super.LLLZIIL(view, map);
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            C1103280eog c1103280eog = C1103280eog.LIZLLL;
            c1103280eog.getClass();
            c1103280eog.LIZLLL(1, "smb_anchor_pin_card_show_count");
        }
    }
}
