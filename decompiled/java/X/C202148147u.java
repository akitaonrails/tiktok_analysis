package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pipo.probe.ab.PipoProbeSdkConfigSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.147u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202148147u {
    public static boolean LIZIZ;
    public static volatile C202151147x LIZLLL;
    public static SensorManager LJ;
    public static Sensor LJFF;
    public static C202150147w LJI;
    public static HandlerThread LJII;
    public static Cert LJIIIIZZ;
    public static final Object LIZ = new Object();
    public static final C13E8<C1776910wLB> LIZJ = new C13E8<>();

    public static C443120HZe LIZ(List list) {
        double dLJJZZI = C13LP.LJJZZI(list);
        double dLJJLIL = C13LP.LJJLIL(list);
        ArrayList arrayList = (ArrayList) list;
        double d = 0.0d;
        if (arrayList.size() < 2) {
            return new C443120HZe(Double.valueOf(dLJJZZI), Double.valueOf(dLJJLIL), Double.valueOf(0.0d));
        }
        double d2 = PipoProbeSdkConfigSettings.LIZ().common.gyroscopeJitterThreshold;
        if (d2 >= 0.0d) {
            d = d2;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 1; i2 < size; i2++) {
            if (Math.abs(((Number) ListProtector.get(list, i2)).doubleValue() - ((Number) ListProtector.get(list, i2 - 1)).doubleValue()) > d) {
                i++;
            }
        }
        return new C443120HZe(Double.valueOf(dLJJZZI), Double.valueOf(dLJJLIL), Double.valueOf(((double) i) / ((double) (arrayList.size() - 1))));
    }

    public static C202151147x LIZIZ(C13E8 c13e8) {
        if (c13e8.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
        Iterator<E> it2 = c13e8.iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(((C1776910wLB) it2.next()).LIZ));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
        Iterator<E> it3 = c13e8.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Double.valueOf(((C1776910wLB) it3.next()).LIZIZ));
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
        Iterator<E> it4 = c13e8.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Double.valueOf(((C1776910wLB) it4.next()).LIZJ));
        }
        C443120HZe c443120HZeLIZ = LIZ(arrayList);
        double dDoubleValue = ((Number) c443120HZeLIZ.getFirst()).doubleValue();
        double dDoubleValue2 = ((Number) c443120HZeLIZ.getSecond()).doubleValue();
        double dDoubleValue3 = ((Number) c443120HZeLIZ.getThird()).doubleValue();
        C443120HZe c443120HZeLIZ2 = LIZ(arrayList2);
        double dDoubleValue4 = ((Number) c443120HZeLIZ2.getFirst()).doubleValue();
        double dDoubleValue5 = ((Number) c443120HZeLIZ2.getSecond()).doubleValue();
        double dDoubleValue6 = ((Number) c443120HZeLIZ2.getThird()).doubleValue();
        C443120HZe c443120HZeLIZ3 = LIZ(arrayList3);
        return new C202151147x(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, ((Number) c443120HZeLIZ3.getFirst()).doubleValue(), ((Number) c443120HZeLIZ3.getSecond()).doubleValue(), ((Number) c443120HZeLIZ3.getThird()).doubleValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Double LIZJ(String str) {
        C202151147x c202151147x = LIZLLL;
        if (c202151147x == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1969029690:
                if (str.equals("gyroscope_sensor_z_max_value")) {
                    return Double.valueOf(c202151147x.LJII);
                }
                return null;
            case -1897615694:
                if (str.equals("gyroscope_sensor_x_min_value")) {
                    return Double.valueOf(c202151147x.LIZ);
                }
                return null;
            case -1196551116:
                if (str.equals("gyroscope_sensor_z_min_value")) {
                    return Double.valueOf(c202151147x.LJI);
                }
                return null;
            case -172078331:
                if (str.equals("gyroscope_sensor_y_max_value")) {
                    return Double.valueOf(c202151147x.LJ);
                }
                return null;
            case 517925699:
                if (str.equals("gyroscope_sensor_z_jitter_rate")) {
                    return Double.valueOf(c202151147x.LJIIIIZZ);
                }
                return null;
            case 600400243:
                if (str.equals("gyroscope_sensor_y_min_value")) {
                    return Double.valueOf(c202151147x.LIZLLL);
                }
                return null;
            case 811328706:
                if (str.equals("gyroscope_sensor_y_jitter_rate")) {
                    return Double.valueOf(c202151147x.LJFF);
                }
                return null;
            case 1104731713:
                if (str.equals("gyroscope_sensor_x_jitter_rate")) {
                    return Double.valueOf(c202151147x.LIZJ);
                }
                return null;
            case 1624873028:
                if (str.equals("gyroscope_sensor_x_max_value")) {
                    return Double.valueOf(c202151147x.LIZIZ);
                }
                return null;
            default:
                return null;
        }
    }
}
