package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS4S0501000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135590fen implements InterfaceC1135620feq {
    public final InterfaceC1135310feL LIZ;
    public final List<AbstractC1135650fet> LIZIZ;
    public DataChannel LIZJ;
    public InterfaceC1135620feq LIZLLL;
    public final ConcurrentHashMap<InterfaceC1136020ffU, Long> LJ;
    public volatile boolean LJFF;

    public C1135590fen(InterfaceC1132530fZr interfaceC1132530fZr) {
        InterfaceC1135310feL interfaceC1135310feLLIZIZ;
        if (interfaceC1132530fZr != null) {
            interfaceC1135310feLLIZIZ = interfaceC1132530fZr.LIZIZ();
        } else {
            interfaceC1135310feLLIZIZ = null;
        }
        this.LIZ = interfaceC1135310feLLIZIZ;
        this.LIZIZ = C1697810uHb.LJIIJJI(new AbstractC1136420fg8() { // from class: X.0fex
            public final LinkedList<InterfaceC1136020ffU> LJII = new LinkedList<>();

            @Override // X.AbstractC1135650fet
            public final String LIZLLL() {
                return "SpecialGiftEffectSelfPreDownloader";
            }

            @Override // X.InterfaceC1135330feN
            public final void LIZ() {
                this.LIZ.removeCallbacksAndMessages(null);
                this.LIZLLL = false;
                this.LJII.clear();
            }

            @Override // X.AbstractC1135650fet
            public final void LJIIJJI() {
                InterfaceC1136020ffU interfaceC1136020ffURemove;
                if (this.LIZLLL || this.LJII.isEmpty() || (interfaceC1136020ffURemove = this.LJII.remove(0)) == null) {
                    return;
                }
                this.LIZLLL = true;
                LJIJ(interfaceC1136020ffURemove);
            }

            @Override // X.InterfaceC1135330feN
            public final boolean LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
                if (!C1135870ffF.LJIILIIL(interfaceC1136020ffU) || !interfaceC1136020ffU.LJ()) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC1135650fet
            public final void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU) {
                boolean z;
                Room room;
                DataChannel dataChannel = this.LJ;
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
                    z = true;
                } else {
                    z = false;
                }
                C11RO c11ro = C1135890ffH.LIZ;
                C1135890ffH.LIZIZ(interfaceC1136020ffU, this.LJII, z);
            }

            @Override // X.AbstractC1135650fet
            public final void LJFF(DataChannel dataChannel, C1135590fen c1135590fen) {
                super.LJFF(dataChannel, c1135590fen);
                this.LJII.clear();
            }
        }, new AbstractC1136420fg8() { // from class: X.0fev
            public final LinkedList<InterfaceC1136020ffU> LJII = new LinkedList<>();

            @Override // X.AbstractC1135650fet
            public final String LIZLLL() {
                return "SpecialGiftEffectNonSelfPreDownloader";
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            @Override // X.AbstractC1135650fet
            public final void LJIIJJI() {
                ?? r0;
                ?? Remove;
                ?? Remove2;
                if (this.LIZLLL) {
                    return;
                }
                C259800zU c259800zU = new C259800zU();
                if (this.LJII.isEmpty() || (r0 = this.LJII.get(0)) == 0) {
                    return;
                }
                c259800zU.element = r0;
                DataChannel dataChannel = this.LJ;
                Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
                C1135280feI c1135280feILIZIZ = C1135260feG.LIZIZ((InterfaceC1136020ffU) c259800zU.element, room != null ? room.getOwner() : null);
                if (c1135280feILIZIZ != null && LJIJI((InterfaceC1136020ffU) c259800zU.element, c1135280feILIZIZ)) {
                    C1133910fc5.LJ("SpecialGiftEffectNonSelfPreDownloader", "resource already downloaded, dequeue directly and skip hot room check");
                    if (this.LJII.isEmpty() || (Remove2 = this.LJII.remove(0)) == 0) {
                        return;
                    }
                    c259800zU.element = Remove2;
                    LJIIZILJ(LJ(), (InterfaceC1136020ffU) c259800zU.element, c1135280feILIZIZ, "dequeue_skip_download", null);
                    return;
                }
                C013C c013c = new C013C();
                if (!((InterfaceC1136020ffU) c259800zU.element).LJIIJJI()) {
                    int iLIZIZ = C1135870ffF.LIZIZ((InterfaceC1136020ffU) c259800zU.element);
                    C118300cf c118300cf = new C118300cf();
                    C118300cf c118300cf2 = new C118300cf();
                    InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
                    if (interfaceC1135620feq != null) {
                        interfaceC1135620feq.LIZ(EnumC1133020fae.SPECIAL_GIFT, new AwS4S0501000_17(c118300cf2, (C118300cf) c259800zU, (C259800zU<InterfaceC1136020ffU>) this, (C1135670fev) iLIZIZ, (int) c118300cf, (C118300cf) c013c, (C013C) 2));
                    }
                }
                if (c013c.element) {
                    C1133910fc5.LIZIZ("SpecialGiftEffectNonSelfPreDownloader", "queue size reach max limit, delay download");
                    this.LIZ.removeCallbacks(this.LJI);
                    C786410Ut5.LJLIIL(GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomDownloadLoopCheckDelay(), this.LIZ, this.LJI);
                } else {
                    if (this.LJII.isEmpty() || (Remove = this.LJII.remove(0)) == 0) {
                        return;
                    }
                    c259800zU.element = Remove;
                    this.LIZLLL = true;
                    LJIJ((InterfaceC1136020ffU) c259800zU.element);
                }
            }

            @Override // X.InterfaceC1135330feN
            public final void LIZ() {
                this.LIZ.removeCallbacksAndMessages(null);
                this.LIZLLL = false;
                this.LJII.clear();
            }

            @Override // X.InterfaceC1135330feN
            public final boolean LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
                if (!C1135870ffF.LJIILIIL(interfaceC1136020ffU) || interfaceC1136020ffU.LJ()) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC1135650fet
            public final void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU) {
                User owner;
                Room room;
                Room room2;
                DataChannel dataChannel = this.LJ;
                if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                    owner = room2.getOwner();
                } else {
                    owner = null;
                }
                C1135280feI c1135280feILIZIZ = C1135260feG.LIZIZ(interfaceC1136020ffU, owner);
                boolean z = true;
                if (c1135280feILIZIZ != null && LJIJI(interfaceC1136020ffU, c1135280feILIZIZ)) {
                    C1133910fc5.LJ("SpecialGiftEffectNonSelfPreDownloader", "video resource already downloaded, dispatch directly and skip hot room check");
                    c1135280feILIZIZ.LJIJ = 1002;
                    c1135280feILIZIZ.LJIJI = "";
                    InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
                    if (interfaceC1135620feq != null) {
                        interfaceC1135620feq.LIZIZ(interfaceC1136020ffU, c1135280feILIZIZ, null);
                        return;
                    }
                    return;
                }
                DataChannel dataChannel2 = this.LJ;
                if (dataChannel2 == null || (room = (Room) dataChannel2.gg0(RoomChannel.class)) == null || UserService.getInstance().user().getCurrentUserId() != room.getOwnerUserId()) {
                    z = false;
                }
                C11RO c11ro = C1135890ffH.LIZ;
                C1135890ffH.LIZIZ(interfaceC1136020ffU, this.LJII, z);
            }

            @Override // X.AbstractC1135650fet
            public final void LJFF(DataChannel dataChannel, C1135590fen c1135590fen) {
                super.LJFF(dataChannel, c1135590fen);
                this.LJII.clear();
            }

            public final boolean LJIJI(InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI) {
                AssetsModel assetsModelLIZLLL;
                boolean z;
                long jLongValue;
                DataChannel dataChannel = this.LJ;
                if (dataChannel != null) {
                    dataChannel.gg0(RoomChannel.class);
                }
                if ((!C1136050ffX.LIZJ(interfaceC1136020ffU, c1135280feI).isEmpty()) || (assetsModelLIZLLL = C1138640fji.LIZLLL(c1135280feI.LJFF)) == null) {
                    return false;
                }
                if (assetsModelLIZLLL.resourceType == AssetsModel.RESOURCE_TYPE_LYNX) {
                    z = true;
                } else {
                    z = false;
                }
                Set setLLIIIZ = C13LP.LLIIIZ(C1136050ffX.LIZ(interfaceC1136020ffU, c1135280feI));
                if (z) {
                    Long lValueOf = Long.valueOf(C1135270feH.LIZIZ(interfaceC1136020ffU));
                    if (lValueOf.longValue() > 0) {
                        jLongValue = lValueOf.longValue();
                    } else {
                        jLongValue = c1135280feI.LJFF;
                    }
                    setLLIIIZ.remove(Long.valueOf(jLongValue));
                }
                if (!setLLIIIZ.isEmpty()) {
                    return false;
                }
                if (!z) {
                    return true;
                }
                C1137480fhq.LIZ.getClass();
                if (C1137480fhq.LIZ(assetsModelLIZLLL)) {
                    return true;
                }
                return false;
            }
        }, new C1136400fg6());
        this.LJ = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC1135620feq
    public final void LIZLLL(InterfaceC1136020ffU interfaceC1136020ffU) {
        this.LJ.remove(interfaceC1136020ffU);
        LJFF(new AwS418S0200000_17(this, interfaceC1136020ffU, 114));
    }

    @Override // X.InterfaceC1135620feq
    public final void LJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        this.LJ.remove(interfaceC1136020ffU);
        LJFF(new AwS418S0200000_17(this, interfaceC1136020ffU, 115));
    }

    public final void LJFF(Function0<Unit> function0) {
        InterfaceC1135310feL interfaceC1135310feL = this.LIZ;
        if (interfaceC1135310feL != null && !interfaceC1135310feL.LIZJ()) {
            interfaceC1135310feL.LIZIZ("GiftEffectPreDownloadManager", function0);
        } else {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1135620feq
    public final void LIZ(EnumC1133020fae enumC1133020fae, Function1<Object, Boolean> function1) {
        InterfaceC1135620feq interfaceC1135620feq = this.LIZLLL;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZ(enumC1133020fae, function1);
        }
    }

    @Override // X.InterfaceC1135620feq
    public final void LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, ConcurrentHashMap<String, String> concurrentHashMap) throws JSONException {
        C0T6Z c0t6z;
        Long lRemove = this.LJ.remove(interfaceC1136020ffU);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (c1135280feI != null && (c0t6z = c1135280feI.LJIIZILJ) != null) {
                c0t6z.put("in_predownload_queue_dur", String.valueOf(C158B.LIZ() - jLongValue));
            }
        }
        LJI(interfaceC1136020ffU, c1135280feI, concurrentHashMap, false);
        LJFF(new AwS146S0400000_17(this, (C1135590fen) interfaceC1136020ffU, (InterfaceC1136020ffU) c1135280feI, (C1135280feI) concurrentHashMap, (ConcurrentHashMap<String, String>) 6));
    }

    @Override // X.InterfaceC1135620feq
    public final void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM, Map<String, String> map) throws JSONException {
        Long lRemove = this.LJ.remove(interfaceC1136020ffU);
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
        LJI(interfaceC1136020ffU, c1136560fgM, map, true);
        LJFF(new AwS146S0400000_17(this, (C1135590fen) interfaceC1136020ffU, (InterfaceC1136020ffU) c1136560fgM, (C1136560fgM) map, (Map<String, String>) 7));
    }

    public final void LJI(InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, Map<String, String> map, boolean z) throws JSONException {
        String str;
        StringBuilder sbLIZ;
        String str2;
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            if (c1135280feI != null && c1135280feI.LJIJ == 1002) {
                return;
            }
            if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                str = "_anchor";
            } else if (interfaceC1136020ffU.LJ()) {
                str = "_self";
            } else {
                str = "";
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
