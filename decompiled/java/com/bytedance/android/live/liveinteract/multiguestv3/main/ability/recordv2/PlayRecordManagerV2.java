package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2;

import X.C01EI;
import X.C1AZW;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C933320aOY;
import X.C933330aOZ;
import X.C941700ac4;
import X.InterfaceC926960aEI;
import X.InterfaceC927070aET;
import X.InterfaceC941720ac6;
import X.InterfaceC941900acO;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2.PlayRecordManagerV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.IsWatchingMultiGuest;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "PLAY_RECORD_MANAGER_V2")
public final class PlayRecordManagerV2 implements InterfaceC927070aET {
    public static final /* synthetic */ int LJFF = 0;
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public volatile boolean LIZJ;
    public final ConcurrentHashMap<String, C933330aOZ> LIZLLL = new ConcurrentHashMap<>();
    public final C933320aOY LJ = new InterfaceC941900acO() { // from class: X.0aOY
        @Override // X.InterfaceC941900acO
        public final void LIZJ(C01EL c01el, String str) {
            Boolean boolValueOf;
            int i = C01EM.LIZ[c01el.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    PlayRecordManagerV2 playRecordManagerV2 = this.LL;
                    playRecordManagerV2.getClass();
                    LinkMicAbilityManager.LJIIIZ.getClass();
                    InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
                    if (interfaceC926960aEILIZJ != null) {
                        boolValueOf = Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI(str));
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJIFFI(boolValueOf)) {
                        String strLIZ = C01EI.LIZ(82, "PlayRecordManagerV2");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("endRecord invalidate ability ");
                        sbLIZ.append(str);
                        C1AZW.LJIILL(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                        return;
                    }
                    C933330aOZ c933330aOZ = playRecordManagerV2.LIZLLL.get(str);
                    if (c933330aOZ == null) {
                        return;
                    }
                    if (c933330aOZ.LIZJ) {
                        String strLIZ2 = C01EI.LIZ(87, "PlayRecordManagerV2");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("endRecord Real: ");
                        sbLIZ2.append(str);
                        C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                        String strLIZ3 = C01EI.LIZ(41, "PlayRecordV2");
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("end, ability=");
                        sbLIZ3.append(c933330aOZ.LIZ);
                        C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                        c933330aOZ.LIZJ = false;
                        c933330aOZ.LIZIZ();
                    }
                    playRecordManagerV2.LIZLLL.remove(str);
                    return;
                }
                throw new C1954807lC();
            }
            this.LL.LIZIZ(str);
        }
    };

    @Override // X.InterfaceC927070aET
    public final void onCreate() {
        Boolean bool;
        List<String> listLJIILLIIL;
        C1AZW.LJIIJ(12, C01EI.LIZ(39, "PlayRecordManagerV2"), "onCreate", null, null);
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null && (listLJIILLIIL = interfaceC941720ac6LIZIZ.LJIILLIIL()) != null) {
            Iterator<String> it2 = listLJIILLIIL.iterator();
            while (it2.hasNext()) {
                LIZIZ(it2.next());
            }
        }
        DataChannel dataChannel = this.LIZ;
        LIZ((dataChannel == null || (bool = (Boolean) dataChannel.gg0(IsWatchingMultiGuest.class)) == null) ? false : bool.booleanValue());
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(IsWatchingMultiGuest.class, this, new AwS594S0100000_15(this, 147));
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ2 != null) {
            interfaceC941720ac6LIZIZ2.LIZ(this.LJ);
        }
    }

    @Override // X.InterfaceC927070aET
    public final void onDestroy() {
        C1AZW.LJIIJ(12, C01EI.LIZ(55, "PlayRecordManagerV2"), "onDestroy", null, null);
        LIZ(false);
        this.LIZLLL.clear();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI(this.LJ);
        }
    }

    public final void LIZ(boolean z) {
        String strLIZ = C01EI.LIZ(94, "PlayRecordManagerV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsWatchingMultiGuest: ");
        sbLIZ.append(z);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZJ = z;
        for (C933330aOZ c933330aOZ : this.LIZLLL.values()) {
            if (this.LIZJ != c933330aOZ.LIZLLL) {
                c933330aOZ.LIZ(z);
            }
        }
    }

    public final void LIZIZ(String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String strLIZ = C01EI.LIZ(63, "PlayRecordManagerV2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRecord Entrance: ");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            boolValueOf = Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI(str));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            String strLIZ2 = C01EI.LIZ(65, "PlayRecordManagerV2");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start record invalidate ability ");
            sbLIZ2.append(str);
            C1AZW.LJIILL(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return;
        }
        if (this.LIZLLL.get(str) == null) {
            ConcurrentHashMap<String, C933330aOZ> concurrentHashMap = this.LIZLLL;
            C933330aOZ c933330aOZ = new C933330aOZ(this.LIZIZ, str);
            c933330aOZ.LIZ(this.LIZJ);
            concurrentHashMap.put(str, c933330aOZ);
        }
        C933330aOZ c933330aOZ2 = this.LIZLLL.get(str);
        if (c933330aOZ2 != null) {
            boolValueOf2 = Boolean.valueOf(c933330aOZ2.LIZJ);
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf2)) {
            String strLIZ3 = C01EI.LIZ(75, "PlayRecordManagerV2");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startRecord Real: ");
            sbLIZ3.append(str);
            C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
            if (c933330aOZ2 != null) {
                String strLIZ4 = C01EI.LIZ(35, "PlayRecordV2");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("start, ability=");
                sbLIZ4.append(c933330aOZ2.LIZ);
                C1AZW.LJIIJ(12, strLIZ4, C2188811AlT.LIZIZ(sbLIZ4), null, null);
                c933330aOZ2.LIZJ = true;
                c933330aOZ2.LIZIZ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0aOY] */
    public PlayRecordManagerV2(Room room, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = room;
    }
}
