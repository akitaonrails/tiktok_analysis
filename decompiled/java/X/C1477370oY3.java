package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1477370oY3 extends AbstractC1477410oY7 {
    public C08FP[] LJ;

    public C1477370oY3(InterfaceC1477480oYE interfaceC1477480oYE) {
        super(interfaceC1477480oYE);
    }

    public static final int LJFF(Map<String, Object> map) {
        Object obj = map.get("internet_speed");
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC1475640oVG
    public C1477120oXe LIZIZ(List<? extends InterfaceC1477220oXo> list, Map<String, Object> map) {
        C08FP[] c08fpArr;
        List<? extends InterfaceC1477690oYZ> list2;
        InterfaceC1477690oYZ next;
        InterfaceC1475360oUo interfaceC1475360oUo;
        Object obj;
        C1477120oXe c1477120oXe = new C1477120oXe();
        c1477120oXe.LLIZ.append("SpeedShiftBitrateSelector");
        c1477120oXe.LLIZLLLIL = "Speed";
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = c1477120oXe.LLIZ;
            sb.append(", SDKInputNum:");
            sb.append(list.size());
            C1477650oYV c1477650oYV = null;
            if (this.LIZLLL != null) {
                int iLJFF = LJFF(map);
                double dFloatValue = (iLJFF > 0 && (obj = map.get("bitrate_adjust_factor_speed")) != null) ? iLJFF * ((Float) obj).floatValue() : iLJFF;
                if (dFloatValue > 0.0d && (interfaceC1475360oUo = this.LIZLLL) != null) {
                    c1477650oYV = new C1477650oYV(true, Math.max((interfaceC1475360oUo.LIZLLL() * dFloatValue * dFloatValue * dFloatValue) + (this.LIZLLL.LIZJ() * dFloatValue * dFloatValue) + (this.LIZLLL.LJ() * dFloatValue) + this.LIZLLL.LIZIZ(), this.LIZLLL.LIZ()));
                    double dFloatValue2 = c1477650oYV.LIZ;
                    Object obj2 = map.get("bitrate_adjust_factor_calc");
                    if (obj2 != null) {
                        dFloatValue2 *= (double) ((Float) obj2).floatValue();
                    }
                    c1477650oYV.LIZ = dFloatValue2;
                }
                c1477120oXe.LLIZ.append(", cal:autoBitrateSet");
                c1477120oXe.LLIZLLLIL = C1475750oVR.LIZ(this.LIZLLL);
            } else if (this.LIZJ != null) {
                double dLJFF = LJFF(map);
                if (dLJFF > 0.0d && (list2 = this.LIZJ) != null && list2.size() != 0) {
                    Iterator<? extends InterfaceC1477690oYZ> it2 = this.LIZJ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next != null && dLJFF <= next.getSpeed()) {
                                break;
                            }
                        } else {
                            List<? extends InterfaceC1477690oYZ> list3 = this.LIZJ;
                            next = (InterfaceC1477690oYZ) ListProtector.get(list3, list3.size() - 1);
                            if (next != null) {
                                break;
                            }
                        }
                    }
                    c1477650oYV = new C1477650oYV(true, next.getBitrate());
                }
                c1477120oXe.LLIZ.append(", cal:bandwidthSets");
            } else {
                double dLJFF2 = LJFF(map);
                if (dLJFF2 > 0.0d && (c08fpArr = this.LJ) != null) {
                    double d = Double.MAX_VALUE;
                    C08FP c08fp = null;
                    for (C08FP c08fp2 : c08fpArr) {
                        double dAbs = Math.abs(c08fp2.getMedianThreshold() - dLJFF2);
                        if (dAbs < d) {
                            c08fp = c08fp2;
                            d = dAbs;
                        }
                    }
                    if (c08fp != null) {
                        c1477650oYV = new C1477650oYV(false, c08fp.mRate);
                    }
                }
                c1477120oXe.LLIZ.append(", cal:gearSet");
            }
            if (c1477650oYV != null) {
                c1477120oXe.LLILZLL = c1477650oYV.LIZ;
            }
            LJ(c1477120oXe, c1477650oYV, list);
            return c1477120oXe;
        }
        c1477120oXe.LLILZIL = new C1477070oXZ(0, "bitrate list is empty...");
        c1477120oXe.LLIZ.append(", bitrate list is empty");
        return c1477120oXe;
    }

    public final <T extends InterfaceC1477220oXo> T LIZLLL(C1477120oXe c1477120oXe, C1477650oYV c1477650oYV, List<T> list) throws C1477070oXZ {
        T next = null;
        if (c1477650oYV == null) {
            if (this.LIZ != null) {
                c1477120oXe.LLIZ.append(", findBitRate:gearConfig");
                String strLIZIZ = this.LIZ.LIZIZ();
                double dLIZJ = this.LIZ.LIZJ();
                if (dLIZJ <= 0.0d) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        if (TextUtils.equals(next.getGearName(), strLIZIZ)) {
                            StringBuilder sb = c1477120oXe.LLIZ;
                            if (sb != null) {
                                sb.append(", getDefaultBitrate<=0 ");
                            }
                        }
                    }
                    StringBuilder sb2 = c1477120oXe.LLIZ;
                    if (sb2 != null) {
                        sb2.append(",getDefaultBitrate null");
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("defaultGearName = ");
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(" bitrates = ");
                    sbLIZ.append(list.toString());
                    throw new C1477070oXZ(4, C2188811AlT.LIZIZ(sbLIZ));
                }
                double d = Double.MAX_VALUE;
                for (T t : list) {
                    double dAbs = Math.abs(((double) t.getBitRate()) - dLIZJ);
                    if (d > dAbs) {
                        next = t;
                        d = dAbs;
                    }
                }
                StringBuilder sb3 = c1477120oXe.LLIZ;
                if (sb3 != null) {
                    sb3.append(",getDefaultBitrate>0 ");
                    return next;
                }
                return next;
            }
            StringBuilder sb4 = c1477120oXe.LLIZ;
            if (sb4 != null) {
                sb4.append(", findBitRate:bitrateInfo null gearConfig null");
            }
            throw new C1477070oXZ(6, "gear config is null");
        }
        ArrayList<InterfaceC1477220oXo> arrayList = (ArrayList) LIZJ(list);
        if (arrayList.isEmpty()) {
            StringBuilder sb5 = c1477120oXe.LLIZ;
            if (sb5 != null) {
                sb5.append(",AfterSDKFilter:empty");
            }
            throw new C1477070oXZ(5, "Intersection bitrate list is empty.");
        }
        if (c1477650oYV.LIZIZ) {
            double d2 = c1477650oYV.LIZ;
            for (InterfaceC1477220oXo interfaceC1477220oXo : arrayList) {
                if (next != null) {
                    if (next.getBitRate() > d2) {
                        if (interfaceC1477220oXo.getBitRate() < next.getBitRate()) {
                        }
                    } else if (d2 < interfaceC1477220oXo.getBitRate() || interfaceC1477220oXo.getBitRate() < next.getBitRate()) {
                    }
                }
                next = (T) interfaceC1477220oXo;
            }
            StringBuilder sb6 = c1477120oXe.LLIZ;
            if (sb6 != null) {
                sb6.append(", AfterSDKFilter:");
                sb6.append(arrayList.size());
                sb6.append(", findMaxBitrate ");
                return next;
            }
        } else {
            double d3 = c1477650oYV.LIZ;
            for (InterfaceC1477220oXo interfaceC1477220oXo2 : arrayList) {
                if (next == null || Math.abs(((double) interfaceC1477220oXo2.getBitRate()) - d3) < Math.abs(((double) next.getBitRate()) - d3)) {
                    next = (T) interfaceC1477220oXo2;
                }
            }
            StringBuilder sb7 = c1477120oXe.LLIZ;
            if (sb7 != null) {
                sb7.append(", AfterSDKFilter:");
                sb7.append(arrayList.size());
                sb7.append(", findNearestBitrate ");
            }
        }
        return next;
    }

    public final void LJ(C1477120oXe c1477120oXe, C1477650oYV c1477650oYV, List list) {
        try {
            c1477120oXe.LL = LIZLLL(c1477120oXe, c1477650oYV, list);
        } catch (C1477070oXZ e) {
            TryCatchGuardChecker.doCheck(e);
            c1477120oXe.LLILZIL = e;
        }
        if (c1477120oXe.LL == null) {
            c1477120oXe.LL = (InterfaceC1477220oXo) ListProtector.get(list, 0);
            c1477120oXe.LLIZ.append(", fallback to index 0 ");
        }
    }
}
