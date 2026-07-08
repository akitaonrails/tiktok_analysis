package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844830y6j {
    public static final HashMap<String, InterfaceC830890Wid> LIZ = new HashMap<>();

    public static void LIZ(final String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerDecision sceneKey:");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ));
        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str, C13BV.INSTANCE, null, new AbstractC830880Wic() { // from class: X.0y6i
            @Override // X.AbstractC830880Wic
            public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                Object objLIZJ = interfaceC805220ViK.LIZJ();
                if (!(objLIZJ instanceof Boolean)) {
                    objLIZJ = null;
                }
                if (Intrinsics.LJFF(objLIZJ, Boolean.TRUE)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("registerDecision sceneKey:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", result Strategy is ");
                    sbLIZ2.append(interfaceC805220ViK.LIZLLL().LIZIZ);
                    C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }

            @Override // X.AbstractC830880Wic
            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("registerDecision sceneKey:");
                sbLIZ2.append(str);
                sbLIZ2.append(", registerSceneResult scene : ");
                sbLIZ2.append(interfaceC830890Wid);
                sbLIZ2.append(", stateCode: ");
                sbLIZ2.append(enumC2213771Bkd);
                C20441214yg.LIZIZ("GameLiveClientAiStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                if (interfaceC830890Wid != null && interfaceC830890Wid.getSceneKey() != null) {
                    C1844830y6j.LIZ.put(interfaceC830890Wid.getSceneKey(), interfaceC830890Wid);
                }
            }
        });
    }
}
