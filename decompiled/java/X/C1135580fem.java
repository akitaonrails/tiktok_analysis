package X;

import Y.ARunnableS117S0100000_17;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS4S0501000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135580fem implements InterfaceC1135600feo {
    public DataChannel LIZIZ;
    public InterfaceC1135600feo LIZJ;
    public boolean LJ;
    public final List<AbstractC1135610fep> LIZ = C1697810uHb.LJIIJJI(new AbstractC1136440fgA() { // from class: X.0few
        public final LinkedList<GiftMessage> LJFF = new LinkedList<>();

        @Override // X.AbstractC1135610fep
        public final String LIZLLL() {
            return "SpecialGiftEffectSelfPreDownloader";
        }

        @Override // X.InterfaceC1132200fZK
        public final void LIZ() {
            this.LIZ.removeCallbacksAndMessages(null);
            this.LIZJ = false;
            this.LJFF.clear();
        }

        @Override // X.AbstractC1135610fep
        public final void LJIIIZ() {
            GiftMessage giftMessageRemove;
            if (this.LIZJ || this.LJFF.isEmpty() || (giftMessageRemove = this.LJFF.remove(0)) == null) {
                return;
            }
            this.LIZJ = true;
            LJIILL(giftMessageRemove);
        }

        @Override // X.InterfaceC1132200fZK
        public final boolean LIZIZ(GiftMessage giftMessage) {
            C1133690fbj c1133690fbj = C1133690fbj.LIZ;
            Gift gift = giftMessage.mGift;
            c1133690fbj.getClass();
            if (!C1133690fbj.LJI(gift) || !giftMessage.LLILLL) {
                return false;
            }
            return true;
        }

        @Override // X.AbstractC1135610fep
        public final void LIZJ(GiftMessage giftMessage) {
            boolean z;
            Room room;
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
                z = true;
            } else {
                z = false;
            }
            C11RO c11ro = C1135890ffH.LIZ;
            C1135890ffH.LJ(giftMessage, this.LJFF, z);
        }

        @Override // X.AbstractC1135610fep
        public final void LJ(DataChannel dataChannel, C1135580fem c1135580fem) {
            super.LJ(dataChannel, c1135580fem);
            this.LJFF.clear();
        }
    }, new AbstractC1136440fgA() { // from class: X.0feu
        public final LinkedList<GiftMessage> LJFF = new LinkedList<>();

        @Override // X.AbstractC1135610fep
        public final String LIZLLL() {
            return "SpecialGiftEffectNonSelfPreDownloader";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [T, com.bytedance.android.livesdk.model.message.GiftMessage] */
        @Override // X.AbstractC1135610fep
        public final void LJIIIZ() {
            ?? r0;
            GiftMessage giftMessageRemove;
            if (this.LIZJ) {
                return;
            }
            C259800zU c259800zU = new C259800zU();
            if (this.LJFF.isEmpty() || (r0 = this.LJFF.get(0)) == 0) {
                return;
            }
            c259800zU.element = r0;
            C013C c013c = new C013C();
            GiftMessage giftMessage = (GiftMessage) c259800zU.element;
            if (!giftMessage.LLILLJJLI) {
                int iLIZ = C1133680fbi.LIZ(giftMessage);
                C118300cf c118300cf = new C118300cf();
                C118300cf c118300cf2 = new C118300cf();
                InterfaceC1135600feo interfaceC1135600feo = this.LJ;
                if (interfaceC1135600feo != null) {
                    interfaceC1135600feo.LIZ(EnumC1133020fae.SPECIAL_GIFT, new AwS4S0501000_17(c118300cf2, (C118300cf) c259800zU, (C259800zU<GiftMessage>) this, (C1135660feu) iLIZ, (int) c118300cf, (C118300cf) c013c, (C013C) 0));
                }
            }
            if (c013c.element) {
                C20441214yg.LJIIIZ("SpecialGiftEffectNonSelfPreDownloader", "queue size reach max limit, delay download");
                C786410Ut5.LJLIIL(GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomDownloadLoopCheckDelay(), this.LIZ, new ARunnableS117S0100000_17(this, 6));
            } else {
                if (this.LJFF.isEmpty() || (giftMessageRemove = this.LJFF.remove(0)) == 0) {
                    return;
                }
                c259800zU.element = giftMessageRemove;
                this.LIZJ = true;
                LJIILL(giftMessageRemove);
            }
        }

        @Override // X.InterfaceC1132200fZK
        public final void LIZ() {
            this.LIZ.removeCallbacksAndMessages(null);
            this.LIZJ = false;
            this.LJFF.clear();
        }

        @Override // X.InterfaceC1132200fZK
        public final boolean LIZIZ(GiftMessage giftMessage) {
            C1133690fbj c1133690fbj = C1133690fbj.LIZ;
            Gift gift = giftMessage.mGift;
            c1133690fbj.getClass();
            if (!C1133690fbj.LJI(gift) || giftMessage.LLILLL) {
                return false;
            }
            return true;
        }

        @Override // X.AbstractC1135610fep
        public final void LIZJ(GiftMessage giftMessage) {
            boolean z;
            Room room;
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
                z = true;
            } else {
                z = false;
            }
            C11RO c11ro = C1135890ffH.LIZ;
            C1135890ffH.LJ(giftMessage, this.LJFF, z);
        }

        @Override // X.AbstractC1135610fep
        public final void LJ(DataChannel dataChannel, C1135580fem c1135580fem) {
            super.LJ(dataChannel, c1135580fem);
            this.LJFF.clear();
        }
    }, new C1136410fg7());
    public final Map<GiftMessage, Long> LIZLLL = new LinkedHashMap();

    public final void LJFF() {
        if (GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.isEnabled() && this.LIZIZ != null) {
            C20441214yg.LJIIIZ("GiftEffectPreDownloadManager", "destroy");
            this.LJ = false;
            this.LIZJ = null;
            this.LIZIZ = null;
            for (AbstractC1135610fep abstractC1135610fep : this.LIZ) {
                abstractC1135610fep.LIZ();
                abstractC1135610fep.LIZIZ = false;
                abstractC1135610fep.LIZJ = false;
                abstractC1135610fep.LIZLLL = null;
                abstractC1135610fep.LJ = null;
            }
            ((LinkedHashMap) this.LIZLLL).clear();
        }
    }

    @Override // X.InterfaceC1135600feo
    public final void LIZIZ(GiftMessage giftMessage) {
        this.LIZLLL.remove(giftMessage);
        InterfaceC1135600feo interfaceC1135600feo = this.LIZJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZIZ(giftMessage);
        }
    }

    @Override // X.InterfaceC1135600feo
    public final void LJ(GiftMessage giftMessage) {
        this.LIZLLL.remove(giftMessage);
        InterfaceC1135600feo interfaceC1135600feo = this.LIZJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LJ(giftMessage);
        }
    }

    public final void LJI(GiftMessage giftMessage) {
        if (giftMessage == null) {
            return;
        }
        boolean z = false;
        if (this.LIZIZ != null) {
            if (this.LJ) {
                LJ(giftMessage);
                return;
            }
            if (!C1133680fbi.LIZLLL(giftMessage)) {
                LIZIZ(giftMessage);
                return;
            }
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
                LIZIZ(giftMessage);
                return;
            }
            for (AbstractC1135610fep abstractC1135610fep : this.LIZ) {
                if (abstractC1135610fep.LIZIZ(giftMessage)) {
                    this.LIZLLL.put(giftMessage, Long.valueOf(C158B.LIZ()));
                    abstractC1135610fep.LIZJ(giftMessage);
                    abstractC1135610fep.LJIIIZ();
                    z = true;
                }
            }
            if (!z) {
                LIZIZ(giftMessage);
                return;
            }
            return;
        }
        LJ(giftMessage);
    }

    public final void LJIIIIZZ(boolean z) {
        if (GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.isEnabled() && this.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setClearScreenMode to ");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("GiftEffectPreDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
            this.LJ = z;
            for (AbstractC1135610fep abstractC1135610fep : this.LIZ) {
                abstractC1135610fep.LIZIZ = z;
                if (z) {
                    abstractC1135610fep.LIZ();
                    abstractC1135610fep.LIZJ = false;
                }
            }
            if (z) {
                ((LinkedHashMap) this.LIZLLL).clear();
            }
        }
    }

    @Override // X.InterfaceC1135600feo
    public final void LIZ(EnumC1133020fae enumC1133020fae, Function1<Object, Boolean> function1) {
        InterfaceC1135600feo interfaceC1135600feo = this.LIZJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZ(enumC1133020fae, function1);
        }
    }

    @Override // X.InterfaceC1135600feo
    public final void LIZJ(GiftMessage giftMessage, C1136560fgM c1136560fgM, Map<String, String> map) throws JSONException {
        Long lRemove = this.LIZLLL.remove(giftMessage);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (c1136560fgM != null) {
                C0T6Z c0t6z = c1136560fgM.LJIIZILJ;
                if (c0t6z != null) {
                    c0t6z.put("in_predownload_queue_dur", String.valueOf(C158B.LIZ() - jLongValue));
                }
                InterfaceC1139780flY interfaceC1139780flYLIZJ = c1136560fgM.LIZJ();
                if (interfaceC1139780flYLIZJ != null) {
                    interfaceC1139780flYLIZJ.LJI("in_predownload_queue_dur", String.valueOf(C158B.LIZ() - jLongValue));
                }
            }
        }
        LJII(giftMessage, c1136560fgM, map, true);
        InterfaceC1135600feo interfaceC1135600feo = this.LIZJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZJ(giftMessage, c1136560fgM, map);
        }
    }

    @Override // X.InterfaceC1135600feo
    public final void LIZLLL(GiftMessage giftMessage, C1135280feI c1135280feI, ConcurrentHashMap<String, String> concurrentHashMap) throws JSONException {
        C0T6Z c0t6z;
        Long lRemove = this.LIZLLL.remove(giftMessage);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (c1135280feI != null && (c0t6z = c1135280feI.LJIIZILJ) != null) {
                c0t6z.put("in_predownload_queue_dur", String.valueOf(C158B.LIZ() - jLongValue));
            }
        }
        LJII(giftMessage, c1135280feI, concurrentHashMap, false);
        InterfaceC1135600feo interfaceC1135600feo = this.LIZJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZLLL(giftMessage, c1135280feI, concurrentHashMap);
        }
    }

    public final void LJII(GiftMessage giftMessage, C1135280feI c1135280feI, Map<String, String> map, boolean z) throws JSONException {
        String str;
        StringBuilder sbLIZ;
        String str2;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            if (c1135280feI != null && c1135280feI.LJIJ == 1002) {
                return;
            }
            if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                str = "_anchor";
            } else if (!giftMessage.LLILLL) {
                str = "_self";
            } else {
                return;
            }
            if (z) {
                sbLIZ = C2188811AlT.LIZ();
                str2 = "sticker_message_pre_download_fail";
            } else {
                sbLIZ = C2188811AlT.LIZ();
                str2 = "special_message_pre_download_fail";
            }
            sbLIZ.append(str2);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
            }
            if (c1135280feI == null) {
                jSONObject.putOpt("error_msg", "create effectMessage fail");
            } else {
                jSONObject.putOpt("error_msg", c1135280feI.LJIJI);
            }
            C1136500fgG.LIZJ(strLIZIZ, jSONObject, 12);
        }
    }
}
