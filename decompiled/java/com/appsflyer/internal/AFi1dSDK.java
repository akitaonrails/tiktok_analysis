package com.appsflyer.internal;

import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.appsflyer.internal.AFi1dSDK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes21.dex */
public final class AFi1dSDK implements SensorEventListener {
    public final int AFInAppEventParameterName;
    public double AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final Executor AFLogger;
    public long d;
    public final String valueOf;
    public final int values;
    public final float[][] registerClient = new float[2][];
    public final long[] e = new long[2];

    public static /* synthetic */ void lambda$semisugar$AFKeystoreWrapper$0(AFi1dSDK aFi1dSDK, SensorEvent sensorEvent) {
        C1C7U.LIZ("AFi1dSDK@435f.onSensorChanged$1L");
        aFi1dSDK.AFKeystoreWrapper(sensorEvent);
        C1C7U.LIZIZ("AFi1dSDK@435f.onSensorChanged$1L");
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private boolean AFInAppEventParameterName() {
        return this.registerClient[0] != null;
    }

    private Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFKeystoreWrapper);
        concurrentHashMap.put("sV", this.valueOf);
        float[] fArr = this.registerClient[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFKeystoreWrapper(fArr));
        }
        float[] fArr2 = this.registerClient[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFKeystoreWrapper(fArr2));
        }
        return concurrentHashMap;
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.registerClient;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.e[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.registerClient[1] = fArrCopyOf;
            this.e[1] = jCurrentTimeMillis;
            this.AFInAppEventType = AFKeystoreWrapper(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j - this.d) {
            this.d = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.e[1] = jCurrentTimeMillis;
                return;
            }
            double dAFKeystoreWrapper = AFKeystoreWrapper(fArr3, fArr);
            if (dAFKeystoreWrapper > this.AFInAppEventType) {
                this.registerClient[1] = Arrays.copyOf(fArr, fArr.length);
                this.e[1] = jCurrentTimeMillis;
                this.AFInAppEventType = dAFKeystoreWrapper;
            }
        }
    }

    public static List<Float> AFKeystoreWrapper(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFi1dSDK) {
            AFi1dSDK aFi1dSDK = (AFi1dSDK) obj;
            return values(aFi1dSDK.values, aFi1dSDK.AFKeystoreWrapper, aFi1dSDK.valueOf);
        }
        return false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.AFLogger.execute(new Runnable() { // from class: X.0jey
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1dSDK.lambda$semisugar$AFKeystoreWrapper$0(this.LL, sensorEvent);
                }
            });
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    public AFi1dSDK(Sensor sensor, ExecutorService executorService) throws Throwable {
        int iLJJLIIIJLJLI = C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsbOleyw==", new String[]{"01c45"}));
        this.values = iLJJLIIIJLJLI;
        String strLJJLIIIJJIZ = C2204961BRm.LJJLIIIJJIZ(sensor, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsbOleyw==", new String[]{"01c45"}));
        strLJJLIIIJJIZ = strLJJLIIIJJIZ == null ? "" : strLJJLIIIJJIZ;
        this.AFKeystoreWrapper = strLJJLIIIJJIZ;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.valueOf = str;
        this.AFInAppEventParameterName = ((((iLJJLIIIJLJLI + 31) * 31) + strLJJLIIIJJIZ.hashCode()) * 31) + str.hashCode();
        this.AFLogger = executorService;
    }

    public static double AFKeystoreWrapper(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i = 0; i < iMin; i++) {
            dPow += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final void AFInAppEventType(Map<AFi1dSDK, Map<String, Object>> map, boolean z) {
        if (AFInAppEventParameterName()) {
            map.put(this, AFInAppEventType());
            if (z) {
                int length = this.registerClient.length;
                for (int i = 0; i < length; i++) {
                    this.registerClient[i] = null;
                }
                int length2 = this.e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.e[i2] = 0;
                }
                this.AFInAppEventType = 0.0d;
                this.d = 0L;
                return;
            }
            return;
        }
        if (!map.containsKey(this)) {
            map.put(this, AFInAppEventType());
        }
    }

    private boolean values(int i, String str, String str2) {
        if (this.values == i && this.AFKeystoreWrapper.equals(str) && this.valueOf.equals(str2)) {
            return true;
        }
        return false;
    }
}
