package X;

import com.bytedance.android.live.dynamicstrategy.setting.LiveEpiSignalFallbackIntervalSetting;
import com.bytedance.android.live.dynamicstrategy.setting.LiveEpiSignalFallbackSwitchSetting;
import com.bytedance.android.live.dynamicstrategy.setting.LiveEpiSignalShortLinkEnableSetting;
import com.bytedance.android.livesdk.signaling.model.ExtraT;
import com.bytedance.android.livesdk.signaling.model.UplinkModel;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkEPIData;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkEPIData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0J5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486300J5g extends C0J66<C486270J5d, DownlinkEPIData> {
    public C486300J5g() {
        super(new C486270J5d(new ConcurrentHashMap(), 6), "epi", null);
    }

    @Override // X.C0J66
    public final long LIZLLL() {
        return LiveEpiSignalFallbackIntervalSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0J66
    public final List<UplinkModel<UplinkEPIData>> LJ() {
        if (!LiveEpiSignalShortLinkEnableSetting.INSTANCE.getValue()) {
            return C13BV.INSTANCE;
        }
        synchronized (this.LIZIZ) {
            try {
                Map<String, String> map = ((C486270J5d) this.LIZIZ).LIZ;
                if (map == null || map.isEmpty()) {
                    return C13BV.INSTANCE;
                }
                HashMap map2 = new HashMap(map);
                Map<String, String> map3 = ((C486270J5d) this.LIZIZ).LIZ;
                if (map3 != null) {
                    map3.clear();
                }
                ArrayList arrayList = new ArrayList();
                C486270J5d c486270J5d = (C486270J5d) this.LIZIZ;
                UplinkModel uplinkModelLIZIZ = C0J66.LIZIZ(this, "epi", c486270J5d.LIZIZ, new UplinkEPIData(c486270J5d.LIZJ, map2));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("uplinkEPIData type = ");
                sbLIZ.append(uplinkModelLIZIZ.subType);
                sbLIZ.append(" unqid = ");
                ExtraT extraT = uplinkModelLIZIZ.extra;
                sbLIZ.append(extraT != null ? extraT.uniqId : null);
                sbLIZ.append(" data");
                Gson gson = C19748512Ol.LIZJ;
                sbLIZ.append(GsonProtectorUtils.toJson(gson, uplinkModelLIZIZ.data));
                C20441214yg.LIZIZ("EPISignal", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("uplinkEPIData type = ");
                sbLIZ2.append(uplinkModelLIZIZ.subType);
                sbLIZ2.append(" unqid = ");
                ExtraT extraT2 = uplinkModelLIZIZ.extra;
                sbLIZ2.append(extraT2 != null ? extraT2.uniqId : null);
                sbLIZ2.append(" data");
                sbLIZ2.append(GsonProtectorUtils.toJson(gson, uplinkModelLIZIZ.data));
                C2188811AlT.LIZIZ(sbLIZ2);
                arrayList.add(uplinkModelLIZIZ);
                return arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0J66
    public final boolean LJIIIZ() {
        return !LiveEpiSignalFallbackSwitchSetting.INSTANCE.getValue();
    }

    @Override // X.C0J66
    public final Class<DownlinkEPIData> LJIIIIZZ() {
        return DownlinkEPIData.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0J66
    public final List LJFF(C486270J5d c486270J5d) {
        String str;
        C486270J5d c486270J5d2 = c486270J5d;
        String str2 = c486270J5d2.LIZIZ;
        String str3 = null;
        if (str2 == null) {
            return null;
        }
        Map<String, String> map = c486270J5d2.LIZ;
        C486270J5d c486270J5d3 = (C486270J5d) this.LIZIZ;
        c486270J5d3.LIZ = map;
        c486270J5d3.LIZJ = c486270J5d2.LIZJ;
        c486270J5d3.LIZIZ = str2;
        UplinkModel uplinkModelLIZIZ = C0J66.LIZIZ(this, "epi", str2, new UplinkEPIData(c486270J5d2.LIZJ, c486270J5d2.LIZ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uplinkEPIData type = ");
        sbLIZ.append(str2);
        sbLIZ.append(" unqid = ");
        ExtraT extraT = uplinkModelLIZIZ.extra;
        if (extraT != null) {
            str = extraT.uniqId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" data");
        Gson gson = C19748512Ol.LIZJ;
        sbLIZ.append(GsonProtectorUtils.toJson(gson, uplinkModelLIZIZ.data));
        C20441214yg.LIZIZ("EPISignal", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("uplinkEPIData type = ");
        sbLIZ2.append(str2);
        sbLIZ2.append(" unqid = ");
        ExtraT extraT2 = uplinkModelLIZIZ.extra;
        if (extraT2 != null) {
            str3 = extraT2.uniqId;
        }
        sbLIZ2.append(str3);
        sbLIZ2.append(" data");
        sbLIZ2.append(GsonProtectorUtils.toJson(gson, uplinkModelLIZIZ.data));
        C2188811AlT.LIZIZ(sbLIZ2);
        return Collections.singletonList(uplinkModelLIZIZ);
    }
}
