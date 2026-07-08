package X;

import Y.AComparatorS54S0000000_35;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeBaseGearSelectConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1D4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249971D4p {
    public EnumC1283150jUn LIZ;
    public C1D51 LIZIZ;
    public C1D5F LIZJ;
    public C2249981D4q LIZLLL;
    public C2250071D4z LJ;

    public final Map<String, BitrateConfig> LIZ() {
        EnumC1283150jUn enumC1283150jUn = this.LIZ;
        if (enumC1283150jUn == EnumC1283150jUn.GAME) {
            return this.LIZLLL.LIZ.get("default");
        }
        if (enumC1283150jUn != EnumC1283150jUn.STAGE) {
            return null;
        }
        if (this.LIZLLL.LIZ.containsKey("default")) {
            Map<String, BitrateConfig> map = this.LIZLLL.LIZ.get("default");
            if (map.size() > 0) {
                return map;
            }
        }
        return this.LIZLLL.LIZ.get("pusher");
    }

    public final Map<String, BitrateConfig> LIZJ() {
        if (this.LIZ != EnumC1283150jUn.STAGE || !this.LIZLLL.LIZ.containsKey("resolution_adjust")) {
            return null;
        }
        Map<String, BitrateConfig> map = this.LIZLLL.LIZ.get("resolution_adjust");
        if (map.size() > 0) {
            return map;
        }
        return null;
    }

    public final List<C1283050jUd> LIZLLL() {
        C1D5F c1d5f;
        if (this.LIZ != EnumC1283150jUn.STAGE || (c1d5f = this.LIZJ) == null || c1d5f.LIZIZ != 1) {
            return null;
        }
        BwProbeBaseGearSelectConfig bwProbeBaseGearSelectConfigLJFF = LJFF();
        List<C1283050jUd> list = this.LJ.LJIILLIIL;
        if (bwProbeBaseGearSelectConfigLJFF == null || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (((C1283050jUd) ListProtector.get(list, i)).LIZIZ <= bwProbeBaseGearSelectConfigLJFF.LIZ() && ((C1283050jUd) ListProtector.get(list, i)).LIZIZ >= bwProbeBaseGearSelectConfigLJFF.LIZIZ()) {
                arrayList.add(ListProtector.get(list, i));
            }
        }
        return arrayList;
    }

    public final List<C1283050jUd> LJ() {
        Map<String, BitrateConfig> mapLIZ;
        try {
            if (this.LIZ != EnumC1283150jUn.STAGE || (mapLIZ = LIZ()) == null || mapLIZ.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, BitrateConfig>> it2 = mapLIZ.entrySet().iterator();
            while (it2.hasNext()) {
                BitrateConfig value = it2.next().getValue();
                C1283050jUd c1283050jUd = new C1283050jUd();
                int i = CastIntegerProtector.parseInt(value.level);
                c1283050jUd.LIZ = value.minBitrate;
                c1283050jUd.LIZIZ = i;
                c1283050jUd.LIZJ = C1282950jUT.LIZJ(i, this.LJ.LJIILLIIL);
                c1283050jUd.LIZLLL = C1282950jUT.LIZIZ(i, this.LJ.LJIILLIIL);
                arrayList.add(c1283050jUd);
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new AComparatorS54S0000000_35(2));
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getTTLHStreamResolutionList exception ->");
            sbLIZ.append(e);
            C1283420jVE.LIZLLL("VideoQualityDataManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public final BwProbeBaseGearSelectConfig LJFF() {
        C1D5F c1d5f;
        EnumC1283150jUn enumC1283150jUn = this.LIZ;
        if (enumC1283150jUn == EnumC1283150jUn.GAME) {
            return this.LIZLLL.LIZJ.get("default");
        }
        if (enumC1283150jUn != EnumC1283150jUn.STAGE || (c1d5f = this.LIZJ) == null || c1d5f.LIZ != 1) {
            return null;
        }
        String str = this.LIZIZ.LIZIZ.LJIIZILJ == 1 ? "can_golive_1080p" : "default";
        return this.LIZLLL.LIZJ.containsKey(str) ? this.LIZLLL.LIZJ.get(str) : this.LIZLLL.LIZJ.get("pusher");
    }

    public static String LIZIZ(List list) {
        if (list != null && list.size() != 0) {
            StringBuilder sb = new StringBuilder();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1283050jUd c1283050jUd = (C1283050jUd) it2.next();
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(",");
                }
                sb.append(c1283050jUd.LIZJ);
            }
            return sb.toString();
        }
        return "";
    }
}
