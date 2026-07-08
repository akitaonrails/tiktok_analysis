package X;

import android.os.SystemClock;
import com.ss.android.ugc.nearby.quality.preload.NearbyFeedChunkPreloader;
import com.ss.android.ugc.nearby.quality.preload.NearbyFeedPreloader;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.nearby.settings.NearbyChunkOptExperiment;
import com.ss.android.ugc.nearby.settings.NearbyPreloadTabTriggerExperiment;
import java.util.List;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203790hQn {
    public static volatile long LIZ;
    public static volatile long LIZIZ;
    public static volatile boolean LIZJ;

    public static void LIZ(boolean z) {
        String str;
        boolean zLJIIIZ;
        Class<? extends InterfaceC20153313tL> cls;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("execute preload(fromTabPreload=");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C1205170hT1.LIZ.getClass();
        if (!C1205170hT1.LIZIZ()) {
            C1201620hNI c1201620hNI = C1201620hNI.LIZ;
            C0N4P c0n4p = C0N4P.TAB_UNAVAILABLE;
            c1201620hNI.getClass();
            c1201620hNI.LIZJ("nearby_preload_trigger_result", new AwS105S0110000_18(c0n4p, z, 24));
            return;
        }
        C1203930hR1 c1203930hR1 = C1203930hR1.LIZ;
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        if (roamingLocationInfoLIZ != null) {
            str = roamingLocationInfoLIZ.manualRegion;
        } else {
            str = null;
        }
        c1203930hR1.getClass();
        if (C1203930hR1.LJIILIIL(str) && C1203930hR1.LJIIL()) {
            C1201620hNI c1201620hNI2 = C1201620hNI.LIZ;
            C0N4P c0n4p2 = C0N4P.PRELOAD_DATA_VALID;
            c1201620hNI2.getClass();
            c1201620hNI2.LIZJ("nearby_preload_trigger_result", new AwS105S0110000_18(c0n4p2, z, 24));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("NearbyPreload preload data valid (fromTabPreload=");
            sbLIZ2.append(z);
            sbLIZ2.append(')');
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (z) {
            Boolean bool = ((NearbyPreloadTabTriggerExperiment.NearbyPreloadTabTriggerConfig) NearbyPreloadTabTriggerExperiment.LIZIZ.getValue()).enable;
            if (bool != null) {
                zLJIIIZ = bool.booleanValue();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("NearbyPreload exp not enabled (fromTabPreload=");
            sbLIZ3.append(z);
            sbLIZ3.append(')');
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "nearby_preload", false, false);
        if (zLJIIIZ) {
            if (NearbyChunkOptExperiment.LIZ(EnumC1204030hRB.ANYWAY_REQUEST.getSceneStr())) {
                cls = NearbyFeedChunkPreloader.class;
            } else {
                cls = NearbyFeedPreloader.class;
            }
            C20152913tH.LIZLLL.getClass();
            C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
            if (c20152113t9LIZIZ == null) {
                C1201620hNI c1201620hNI3 = C1201620hNI.LIZ;
                C0N4P c0n4p3 = C0N4P.PRELOADER_COMPONENT_NULL;
                c1201620hNI3.getClass();
                c1201620hNI3.LIZJ("nearby_preload_trigger_result", new AwS105S0110000_18(c0n4p3, z, 24));
                return;
            }
            c20152113t9LIZIZ.LIZLLL(null, cls);
            LIZ = SystemClock.elapsedRealtime();
            C1201620hNI c1201620hNI4 = C1201620hNI.LIZ;
            C0N4P c0n4p4 = C0N4P.SUCCESS;
            c1201620hNI4.getClass();
            c1201620hNI4.LIZJ("nearby_preload_trigger_result", new AwS105S0110000_18(c0n4p4, z, 24));
            return;
        }
        StringBuilder sbLIZ32 = C2188811AlT.LIZ();
        sbLIZ32.append("NearbyPreload exp not enabled (fromTabPreload=");
        sbLIZ32.append(z);
        sbLIZ32.append(')');
        C2188811AlT.LIZIZ(sbLIZ32);
    }

    public static void LIZIZ(EnumC1589810rTP enumC1589810rTP, String str) {
        List<String> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTrigger preload start, timing=");
        sbLIZ.append(enumC1589810rTP);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZJ) {
            return;
        }
        if (str != null && !Intrinsics.LJFF(str, "Nearby")) {
            return;
        }
        C01GW c01gw = NearbyPreloadTabTriggerExperiment.LIZIZ;
        Boolean bool = ((NearbyPreloadTabTriggerExperiment.NearbyPreloadTabTriggerConfig) c01gw.getValue()).enable;
        if (bool == null || !bool.booleanValue() || (list = ((NearbyPreloadTabTriggerExperiment.NearbyPreloadTabTriggerConfig) c01gw.getValue()).triggerScene) == null || !list.contains(enumC1589810rTP.getSceneStr()) || SystemClock.elapsedRealtime() - LIZ < 60000) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onTrigger preload pass, timing=");
        sbLIZ2.append(enumC1589810rTP);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (LIZIZ == 0) {
            LIZIZ = SystemClock.elapsedRealtime();
        }
        LIZ(true);
    }
}
