package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.impl.har.SmartHARServiceImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0pRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511830pRd {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public InterfaceC1511960pRq LIZLLL;
    public C1511940pRo LJ;
    public BPEAHandler LJIIJJI;
    public HandlerThread LJIIL;
    public BPEAHandler LJIILIIL;
    public C1511840pRe LJIILJJIL;
    public final ArrayList<InterfaceC1512050pRz> LJFF = new ArrayList<>();
    public C0N82 LJI = null;
    public C0N82 LJII = null;
    public C0N82 LJIIIIZZ = null;
    public final ReentrantReadWriteLock LJIIIZ = new ReentrantReadWriteLock();
    public final LinkedList<C0N82> LJIIJ = new LinkedList<>();
    public boolean LJIILL = false;
    public int LJIILLIIL = -999;
    public int LJIIZILJ = -999;
    public boolean LJIJ = false;
    public C1512000pRu LJIJI = null;
    public float[] LJIJJ = null;
    public boolean LJIJJLI = false;
    public final RunnableC1511920pRm LJIL = new Runnable() { // from class: X.0pRm
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("HARService@6c94.<field>$1");
            try {
                C1511840pRe c1511840pRe = this.LL.LJIILJJIL;
                if (c1511840pRe != null) {
                    c1511840pRe.LIZJ(true);
                }
                this.LL.LIZJ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("HARService@6c94.<field>$1");
        }
    };
    public final C1512040pRy LJJ = new C1512040pRy(this);

    public final boolean LIZIZ() {
        if (this.LJIILL && this.LJIILLIIL == 0) {
            return true;
        }
        if (!C1512080pS2.LIZ) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HARService not canPredict!!!! hasInit:");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" lastInitErrCode:");
        sbLIZ.append(this.LJIILLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    public final void LIZJ() {
        C1511940pRo c1511940pRo;
        BPEAHandler bPEAHandler = this.LJIILIIL;
        if (bPEAHandler == null || (c1511940pRo = this.LJ) == null || c1511940pRo.LIZ <= 0) {
            return;
        }
        bPEAHandler.removeCallbacks(this.LJIL);
        C786410Ut5.LJLIIL(this.LJ.LIZ, this.LJIILIIL, this.LJIL);
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.checkAndPutContinuousPredictMsg continuousPredictIntervalMs:");
            sbLIZ.append(this.LJ.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LIZLLL() {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.checkAndStopOncePredicting hasInit:");
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(" predicting:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" oncePredicting:");
            sbLIZ.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZJ) {
            this.LIZJ = false;
            if (this.LIZ) {
                return;
            }
            LJFF();
        }
    }

    public final boolean LJ() {
        int i;
        boolean zLIZJ;
        boolean zLIZJ2;
        boolean zLIZJ3;
        C1511840pRe c1511840pRe = this.LJIILJJIL;
        if (c1511840pRe == null) {
            return false;
        }
        if (c1511840pRe.LLILLJJLI && c1511840pRe.LLILLL == 0) {
            long jCurrentTimeMillis = C1512080pS2.LIZ ? System.currentTimeMillis() : 0L;
            SensorManager sensorManager = c1511840pRe.LLILZ;
            Sensor sensor = c1511840pRe.LLILZIL;
            Sensor sensor2 = c1511840pRe.LLILZLL;
            Sensor sensor3 = c1511840pRe.LLIZ;
            if (c1511840pRe.LLIZLLLIL) {
                i = 0;
            } else if (c1511840pRe.LLJ > 2) {
                i = c1511840pRe.LLJI;
            } else if (sensorManager == null || sensor == null || sensor2 == null || sensor3 == null) {
                i = c1511840pRe.LLILLL;
            } else {
                try {
                    zLIZJ = C1300690jx5.LIZJ(sensorManager, c1511840pRe, sensor, 20000, CertProviderManagerKt.findCert("bpea-har_get_sensor_accelerometer", 1476415501));
                    try {
                        zLIZJ2 = C1300690jx5.LIZJ(sensorManager, c1511840pRe, sensor2, 20000, CertProviderManagerKt.findCert("bpea-har_get_sensor_gyroscope", 1476415501));
                        try {
                            zLIZJ3 = C1300690jx5.LIZJ(sensorManager, c1511840pRe, sensor3, 20000, CertProviderManagerKt.findCert("bpea-har_get_sensor_linear_acceleration", 1476415501));
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            zLIZJ3 = false;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zLIZJ2 = false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    zLIZJ = false;
                    zLIZJ2 = false;
                }
                if (zLIZJ && zLIZJ2 && zLIZJ3) {
                    c1511840pRe.LLIZLLLIL = true;
                    i = 0;
                } else {
                    c1511840pRe.LLJ++;
                    if (zLIZJ) {
                        try {
                            C1300690jx5.LIZLLL(sensorManager, c1511840pRe, sensor, CertProviderManagerKt.findCert("bpea-har_get_sensor_accelerometer", 1476415501));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    if (zLIZJ2) {
                        C1300690jx5.LIZLLL(sensorManager, c1511840pRe, sensor2, CertProviderManagerKt.findCert("bpea-har_get_sensor_gyroscope", 1476415501));
                    }
                    if (zLIZJ3) {
                        C1300690jx5.LIZLLL(sensorManager, c1511840pRe, sensor3, CertProviderManagerKt.findCert("bpea-har_get_sensor_linear_acceleration", 1476415501));
                    }
                    i = !zLIZJ ? -11 : !zLIZJ2 ? -22 : !zLIZJ3 ? -33 : -999;
                    c1511840pRe.LLJI = i;
                }
                if (C1512080pS2.LIZ) {
                    System.currentTimeMillis();
                }
            }
            if (C1512080pS2.LIZ) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HarSensorManager.register cost: ");
                sbLIZ.append(jCurrentTimeMillis2);
                sbLIZ.append(" retCode:");
                sbLIZ.append(i);
                sbLIZ.append(" registered:");
                sbLIZ.append(c1511840pRe.LLIZLLLIL);
                sbLIZ.append(" hasInit:");
                sbLIZ.append(c1511840pRe.LLILLJJLI);
                sbLIZ.append(" lastInitErrCode:");
                sbLIZ.append(c1511840pRe.LLILLL);
                sbLIZ.append(" lastRegisterErrCode:");
                sbLIZ.append(c1511840pRe.LLJI);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            i = c1511840pRe.LLILLL;
        }
        c1511840pRe.LLJILLL = i == 0;
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HarSensorManager.start ret:");
            sbLIZ2.append(i);
            sbLIZ2.append(" hasStartSuccess:");
            sbLIZ2.append(c1511840pRe.LLJILLL);
            sbLIZ2.append(" ignoreTrackData:");
            sbLIZ2.append(c1511840pRe.LLJILJILJ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LJIIZILJ = i;
        return i == 0;
    }

    public final void LJFF() {
        C1511840pRe c1511840pRe = this.LJIILJJIL;
        if (c1511840pRe != null) {
            c1511840pRe.LLJILLL = false;
            c1511840pRe.LJ();
        }
        BPEAHandler bPEAHandler = this.LJIILIIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        BPEAHandler bPEAHandler2 = this.LJIIJJI;
        if (bPEAHandler2 != null) {
            bPEAHandler2.removeCallbacksAndMessages(null);
        }
    }

    public final Map<String, Float> LJI() {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastResult result:");
            sbLIZ.append(this.LJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0N82 c0n82 = this.LJI;
        if (c0n82 != null) {
            return c0n82.LIZLLL;
        }
        return null;
    }

    public final Map<String, Float> LJII() {
        if (this.LJIIIIZZ == null && this.LJII == null && this.LJI == null) {
            return null;
        }
        HashMap map = new HashMap();
        C0N82 c0n82 = this.LJI;
        if (c0n82 != null) {
            map.putAll(c0n82.LIZLLL);
        }
        C0N82 c0n822 = this.LJII;
        if (c0n822 != null) {
            map.putAll(c0n822.LIZLLL);
        }
        C0N82 c0n823 = this.LJIIIIZZ;
        if (c0n823 != null) {
            map.putAll(c0n823.LIZLLL);
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastResult result:");
            sbLIZ.append(map);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return map;
    }

    public final int[] LJIIIIZZ() {
        float[] fArr;
        if (!this.LJIJJLI || (fArr = this.LJIJJ) == null || fArr.length < 6) {
            return null;
        }
        int[] iArr = new int[3];
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        if (f3 > 4.5f) {
            iArr[0] = 0;
        } else if (f3 < -4.5f) {
            iArr[0] = 1;
        } else {
            iArr[0] = 2;
        }
        if (f2 > 1.0f) {
            iArr[1] = 3;
        } else if (f2 < -1.0f) {
            iArr[1] = 4;
        } else {
            iArr[1] = 5;
        }
        if (f > 5.0f) {
            iArr[2] = 7;
        } else if (f < -5.0f) {
            iArr[2] = 6;
        } else {
            iArr[2] = 8;
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastScreenStatus screenStatusArray:");
            sbLIZ.append(Arrays.toString(iArr));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return iArr;
    }

    public final boolean LJIILJJIL() {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.startOncePredictingWithSensorKeepRegister hasInit:");
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(" predicting:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" oncePredicting:");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(" lastIsOncePredictingWithSensorKeepRegister:");
            sbLIZ.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZ && !this.LIZIZ) {
            return true;
        }
        boolean zLJIILIIL = LJIILIIL();
        if (zLJIILIIL) {
            this.LIZIZ = true;
            C1511840pRe c1511840pRe = this.LJIILJJIL;
            if (c1511840pRe != null) {
                c1511840pRe.LIZJ(true);
            }
        }
        return zLJIILIIL;
    }

    public final boolean LJIILL() {
        C1511940pRo c1511940pRo = this.LJ;
        if (c1511940pRo != null && c1511940pRo.LIZIZ) {
            return LJIILJJIL();
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.startOncePredictingWithSensorUnRegister hasInit:");
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(" predicting:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" oncePredicting:");
            sbLIZ.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!LIZIZ()) {
            return false;
        }
        if (!this.LIZJ && (this.LIZ || LJ())) {
            this.LIZJ = true;
        }
        return this.LIZJ;
    }

    public final boolean LJIILLIIL() {
        C1511940pRo c1511940pRo = this.LJ;
        if (c1511940pRo != null && c1511940pRo.LIZ > 0) {
            if (C1512080pS2.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HARService.startPredicting continuousPredictIntervalMs:");
                sbLIZ.append(this.LJ.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            return LJIILJJIL();
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HARService.startPredicting hasInit:");
            sbLIZ2.append(this.LJIILL);
            sbLIZ2.append(" predicting:");
            sbLIZ2.append(this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        boolean zLJIILIIL = LJIILIIL();
        if (zLJIILIIL) {
            this.LIZIZ = false;
            C1511840pRe c1511840pRe = this.LJIILJJIL;
            if (c1511840pRe != null) {
                c1511840pRe.LIZJ(false);
            }
        }
        return zLJIILIIL;
    }

    public final void LJIIZILJ() {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.stopPredicting hasInit:");
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(" predicting:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" oncePredicting:");
            sbLIZ.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZ || this.LIZJ) {
            this.LIZ = false;
            this.LIZJ = false;
            LJFF();
        }
    }

    public final boolean LJIILIIL() {
        if (!LIZIZ()) {
            return false;
        }
        if (!this.LIZ && (this.LIZJ || LJ())) {
            this.LIZ = true;
        }
        return this.LIZ;
    }

    public final void LIZ(SmartHARServiceImpl smartHARServiceImpl) {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService addPredictListener listener:");
            sbLIZ.append(smartHARServiceImpl);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (smartHARServiceImpl != null) {
            synchronized (this.LJFF) {
                try {
                    if (!this.LJFF.contains(smartHARServiceImpl)) {
                        this.LJFF.add(smartHARServiceImpl);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIL(C0N82 c0n82) {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.recordHistoryHarStatus statusInfo:");
            sbLIZ.append(c0n82);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c0n82 != null) {
            this.LJIIIZ.writeLock().lock();
            try {
                this.LJIIJ.addFirst(c0n82);
                if (this.LJIIJ.size() > 64) {
                    this.LJIIJ.removeLast();
                }
                this.LJIIIZ.writeLock().unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJIIIZ.writeLock().unlock();
                throw th;
            }
        }
    }

    public final List<C0N82> LJIIIZ(int i, boolean z) {
        ArrayList arrayList;
        C0N82 c0n82;
        if ((!z || this.LJI == null) && this.LJIIJ.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            if (z && (c0n82 = this.LJI) != null) {
                arrayList.add(c0n82);
                i--;
            }
            if (!this.LJIIJ.isEmpty()) {
                this.LJIIIZ.readLock().lock();
                try {
                    int iMin = Math.min(i, this.LJIIJ.size());
                    for (int i2 = 0; i2 < iMin; i2++) {
                        arrayList.add(this.LJIIJ.get(i2));
                    }
                    this.LJIIIZ.readLock().unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJIIIZ.readLock().unlock();
                    throw th;
                }
            }
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getRangeHistoryHarStatus outList:");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return arrayList;
    }

    public final void LJIIJJI(float[] fArr, boolean z) {
        if (!this.LJIJJLI) {
            return;
        }
        if (z && fArr != null) {
            this.LJIJJ = fArr;
        }
        if (C1512080pS2.LIZ && fArr != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.onSensorValuesChanged sensorMeanValue:");
            sbLIZ.append(Arrays.toString(fArr));
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(int r8, boolean r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1511830pRd.LJIIJ(int, boolean, java.util.Map):void");
    }
}
