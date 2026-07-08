package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;
import webcast.api.room.DeviceSignalInfo;

/* JADX INFO: renamed from: X.1Aic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187041Aic {
    public long LIZ;
    public final float[] LIZIZ = new float[3];
    public final float[] LIZJ = new float[9];
    public final float[] LIZLLL = new float[3];
    public final float[] LJ = new float[3];
    public final float[] LJFF = new float[3];
    public final SensorManager LJI;
    public final Sensor LJII;
    public final Sensor LJIIIIZZ;
    public final Sensor LJIIIZ;
    public final C2187051Aid LJIIJ;
    public final C2187061Aie LJIIJJI;
    public final C2187071Aif LJIIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.1Aid] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.1Aie] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1Aif] */
    public C2187041Aic() {
        SensorManager sensorManager = (SensorManager) C786410Ut5.H2(C497740JfY.LJII(), "sensor");
        this.LJI = sensorManager;
        this.LJII = C2204961BRm.LJJL(sensorManager, 10, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+gIgL5PYAKsSNsQwf6p5KfyTkY=", null));
        this.LJIIIIZZ = C2204961BRm.LJJL(sensorManager, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+gIgL5PYAKsSNsQwf6p5KfyTkY=", null));
        this.LJIIIZ = C2204961BRm.LJJL(sensorManager, 2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+gIgL5PYAKsSNsQwf6p5KfyTkY=", null));
        this.LJIIJ = new C2187091Aih() { // from class: X.1Aid
            @Override // android.hardware.SensorEventListener
            public final void onSensorChanged(SensorEvent sensorEvent) {
                String string;
                float[] fArr;
                boolean z;
                if (sensorEvent != null) {
                    C2187041Aic c2187041Aic = this.LL;
                    float[] fArr2 = sensorEvent.values;
                    float[] fArr3 = c2187041Aic.LIZLLL;
                    System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
                    float[] fArr4 = sensorEvent.values;
                    if (fArr4.length > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((z && fArr4[0] != 0.0f) || ((1 < fArr4.length && fArr4[1] != 0.0f) || (2 < fArr4.length && fArr4[2] != 0.0f))) {
                        try {
                            C1300690jx5.LJ(c2187041Aic.LJI, this, C2187081Aig.LIZ());
                        } catch (C838130WuJ e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("event.values = ");
                if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
                    string = Arrays.toString(fArr);
                } else {
                    string = null;
                }
                sbLIZ.append(string);
                C20441214yg.LIZIZ("DeviceSignalInfo", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.LJIIJJI = new C2187091Aih() { // from class: X.1Aie
            @Override // android.hardware.SensorEventListener
            public final void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent != null) {
                    C2187041Aic c2187041Aic = this.LL;
                    float[] fArr = sensorEvent.values;
                    float[] fArr2 = c2187041Aic.LJ;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                }
                try {
                    C1300690jx5.LJ(this.LL.LJI, this, C2187081Aig.LIZ());
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        this.LJIIL = new C2187091Aih() { // from class: X.1Aif
            @Override // android.hardware.SensorEventListener
            public final void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent != null) {
                    C2187041Aic c2187041Aic = this.LL;
                    float[] fArr = sensorEvent.values;
                    float[] fArr2 = c2187041Aic.LJFF;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                }
                try {
                    C1300690jx5.LJ(this.LL.LJI, this, C2187081Aig.LIZ());
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    public final void LIZ(DeviceSignalInfo deviceSignalInfo) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.LIZ == 0) {
            return;
        }
        SensorManager.getRotationMatrix(this.LIZJ, null, this.LJ, this.LJFF);
        SensorManager.getOrientation(this.LIZJ, this.LIZIZ);
        List<DeviceSignalInfo.Gyroscope> list = deviceSignalInfo.gyroscope;
        DeviceSignalInfo.Gyroscope gyroscope = new DeviceSignalInfo.Gyroscope();
        List<Double> list2 = gyroscope.acceleration;
        float[] fArr = this.LIZLLL;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        float f6 = 0.0f;
        if (z) {
            f = fArr[0];
        } else {
            f = 0.0f;
        }
        ListProtector.add(list2, 0, Double.valueOf(f));
        List<Double> list3 = gyroscope.acceleration;
        float[] fArr2 = this.LIZLLL;
        if (1 < fArr2.length) {
            f2 = fArr2[1];
        } else {
            f2 = 0.0f;
        }
        ListProtector.add(list3, 1, Double.valueOf(f2));
        List<Double> list4 = gyroscope.acceleration;
        float[] fArr3 = this.LIZLLL;
        if (2 < fArr3.length) {
            f3 = fArr3[2];
        } else {
            f3 = 0.0f;
        }
        ListProtector.add(list4, 2, Double.valueOf(f3));
        List<Double> list5 = gyroscope.angle;
        float[] fArr4 = this.LIZIZ;
        if (fArr4.length > 0) {
            f4 = fArr4[0];
        } else {
            f4 = 0.0f;
        }
        ListProtector.add(list5, 0, Double.valueOf(f4));
        List<Double> list6 = gyroscope.angle;
        float[] fArr5 = this.LIZIZ;
        if (1 < fArr5.length) {
            f5 = fArr5[1];
        } else {
            f5 = 0.0f;
        }
        ListProtector.add(list6, 1, Double.valueOf(f5));
        List<Double> list7 = gyroscope.angle;
        float[] fArr6 = this.LIZIZ;
        if (2 < fArr6.length) {
            f6 = fArr6[2];
        }
        ListProtector.add(list7, 2, Double.valueOf(f6));
        gyroscope.recordTime = this.LIZ;
        C20441214yg.LIZIZ("DeviceSignalInfo", "GyroscopeInfo: accelleration0=" + ((Number) ListProtector.get(gyroscope.acceleration, 0)).doubleValue() + ", accelleration1=" + ((Number) ListProtector.get(gyroscope.acceleration, 1)).doubleValue() + ", accelleration2=" + ((Number) ListProtector.get(gyroscope.acceleration, 2)).doubleValue() + ", angle0=" + ((Number) ListProtector.get(gyroscope.angle, 0)).doubleValue() + ", angle1=" + ((Number) ListProtector.get(gyroscope.angle, 1)).doubleValue() + ", angle2=" + ((Number) ListProtector.get(gyroscope.angle, 2)).doubleValue() + ", recordTime=" + gyroscope.recordTime);
        list.add(gyroscope);
    }
}
