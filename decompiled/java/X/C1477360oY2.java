package X;

import Y.AComparatorS42S0000000_23;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.GearConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0oY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477360oY2 implements InterfaceC1475640oVG {
    public InterfaceC1475360oUo LIZ;
    public final InterfaceC1477480oYE LIZIZ;

    @Override // X.InterfaceC1475640oVG
    public final void LIZ(InterfaceC1475360oUo interfaceC1475360oUo) {
        this.LIZ = interfaceC1475360oUo;
    }

    public C1477360oY2(AutoBitrateSet autoBitrateSet, GearConfig gearConfig) {
        this.LIZ = autoBitrateSet;
        this.LIZIZ = gearConfig;
    }

    @Override // X.InterfaceC1475640oVG
    public final C1477120oXe LIZIZ(List<? extends InterfaceC1477220oXo> list, Map<String, Object> map) {
        int iIntValue;
        InterfaceC1475360oUo interfaceC1475360oUo;
        C1477120oXe c1477120oXe = new C1477120oXe();
        c1477120oXe.LLIZ.append("DataSaverSelector");
        c1477120oXe.LLIZLLLIL = "DataSaver";
        Object obj = map.get("internet_speed");
        if (obj != null) {
            iIntValue = ((Integer) obj).intValue();
        } else {
            iIntValue = -1;
        }
        double d = iIntValue;
        if (d > 0.0d && (interfaceC1475360oUo = this.LIZ) != null) {
            double d2 = new C1477650oYV(true, Math.max((interfaceC1475360oUo.LIZLLL() * d * d * d) + (this.LIZ.LIZJ() * d * d) + (this.LIZ.LJ() * d) + this.LIZ.LIZIZ(), this.LIZ.LIZ())).LIZ;
            c1477120oXe.LLILZLL = d2;
            try {
                c1477120oXe.LL = LIZJ(c1477120oXe, d2, list);
            } catch (C1477070oXZ e) {
                TryCatchGuardChecker.doCheck(e);
                c1477120oXe.LLILZIL = e;
            }
            c1477120oXe.LLIZLLLIL = C1475750oVR.LIZ(this.LIZ);
        }
        if (c1477120oXe.LL == null) {
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList(list);
                Collections.sort(arrayList, new AComparatorS42S0000000_23(8));
                c1477120oXe.LL = (InterfaceC1477220oXo) ListProtector.get(arrayList, 0);
                c1477120oXe.LLIZ.append(",Index0");
            } else {
                c1477120oXe.LLILZIL = new C1477070oXZ(0, "bitrate list is empty");
                c1477120oXe.LLIZ.append(",BitRates empty");
                return c1477120oXe;
            }
        }
        return c1477120oXe;
    }

    public final <T extends InterfaceC1477220oXo> T LIZJ(C1477120oXe c1477120oXe, double d, List<T> list) throws C1477070oXZ {
        boolean z;
        ArrayList<InterfaceC1477220oXo> arrayList = new ArrayList();
        T t = null;
        if (this.LIZIZ != null && !list.isEmpty()) {
            Pair<Double, Double> pairLIZLLL = this.LIZIZ.LIZLLL();
            Set<String> setLIZ = this.LIZIZ.LIZ();
            if (pairLIZLLL != null && this.LIZIZ.LIZJ() > 0.0d) {
                z = true;
            } else {
                z = false;
            }
            for (T t2 : list) {
                if (z) {
                    double bitRate = t2.getBitRate();
                    if (bitRate >= ((Double) pairLIZLLL.first).doubleValue() && bitRate <= ((Double) pairLIZLLL.second).doubleValue()) {
                        arrayList.add(t2);
                    }
                } else if (setLIZ != null && setLIZ.contains(t2.getGearName())) {
                    arrayList.add(t2);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t3 = null;
                    for (T t4 : list) {
                        if (t3 == null || Math.abs(((double) t4.getBitRate()) - this.LIZIZ.LIZJ()) < Math.abs(((double) t3.getBitRate()) - this.LIZIZ.LIZJ())) {
                            t3 = t4;
                        }
                    }
                    arrayList.add(t3);
                } else {
                    arrayList.add(ListProtector.get(list, 0));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb = c1477120oXe.LLIZ;
            sb.append(", AfterSDKFilter:");
            sb.append(arrayList.size());
            for (InterfaceC1477220oXo interfaceC1477220oXo : arrayList) {
                if (t != null) {
                    if (t.getBitRate() > d) {
                        if (interfaceC1477220oXo.getBitRate() < t.getBitRate()) {
                        }
                    } else if (d < interfaceC1477220oXo.getBitRate() || interfaceC1477220oXo.getBitRate() < t.getBitRate()) {
                    }
                }
                t = (T) interfaceC1477220oXo;
            }
            return t;
        }
        c1477120oXe.LLIZ.append(",AfterSDKFilter:empty");
        throw new C1477070oXZ(5, "Intersection bitrate list is empty.");
    }
}
