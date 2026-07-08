package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;

/* JADX INFO: renamed from: X.0ac4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941700ac4 {
    public static InterfaceC941720ac6 LIZIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LINK_MIC_ABILITY_MANAGER");
        if (objLJIIIZ instanceof InterfaceC941720ac6) {
            return (InterfaceC941720ac6) objLJIIIZ;
        }
        return null;
    }

    public static InterfaceC926960aEI LIZJ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LINK_MIC_ABILITY_MANAGER");
        if (objLJIIIZ instanceof InterfaceC926960aEI) {
            return (InterfaceC926960aEI) objLJIIIZ;
        }
        return null;
    }

    public static void LIZLLL() {
        C20441214yg.LIZIZ("LinkMicAbilityManager", "LinkMicAbilityManager release");
        C465520INi.LIZ.Jw(Collections.singletonList("gameplay_scene"));
        InterfaceC926960aEI interfaceC926960aEILIZJ = LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            interfaceC926960aEILIZJ.onDestroy();
        }
        C948450amx.LIZIZ.LJI("LINK_MIC_ABILITY_MANAGER");
    }

    public static void LIZ(DataChannel dataChannel) {
        C20441214yg.LIZIZ("LinkMicAbilityManager", "LinkMicAbilityManager create");
        C948450amx.LIZIZ.LJFF(new LinkMicAbilityManager(dataChannel), null);
        InterfaceC926960aEI interfaceC926960aEILIZJ = LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            interfaceC926960aEILIZJ.onCreate();
        }
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIL(C0UE9.LIZ);
        }
    }
}
