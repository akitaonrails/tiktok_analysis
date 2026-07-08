package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0a05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918150a05 {
    public long LIZ;
    public C11JF LIZIZ;
    public C11JF LIZJ;
    public C11JF LIZLLL;
    public volatile int LJ = -1;
    public final String LJFF;
    public final C01GW LJI;

    public final void LIZIZ() {
        if (((C603820NmG) this.LJI.getValue()).LJI() == 0) {
            return;
        }
        Map mapLJIIIIZZ = ((C603820NmG) this.LJI.getValue()).LJIIIIZZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) mapLJIIIIZZ).entrySet()) {
            if (System.currentTimeMillis() - ((Number) entry.getKey()).longValue() <= 60000) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List listLLIIII = C13LP.LLIIII(linkedHashMap.values());
        ((C603820NmG) this.LJI.getValue()).LJIIIZ(-1);
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("net_speed_level_sequence", GsonProtectorUtils.toJson(C19748512Ol.LIZJ, listLLIIII));
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_guest_netspeed_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJJIIZI(map);
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF);
        sbLIZ.append("_reportNetworkStates");
        C20441214yg.LIZIZ("NetworkStateTips", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C918150a05() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkStateTipsHelper_");
        sbLIZ.append(hashCode());
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
        this.LJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(278));
    }

    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF);
        sbLIZ.append("_clear from = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("NetworkStateTips", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ();
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
        C11JF c11jf2 = this.LIZJ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LIZJ = null;
        C11JF c11jf3 = this.LIZIZ;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        this.LIZIZ = null;
    }
}
