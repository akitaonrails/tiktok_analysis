package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1511860pRg implements InterfaceC1512060pS0 {
    public final /* synthetic */ C1512040pRy LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ float[] LIZJ;

    public /* synthetic */ C1511860pRg(C1512040pRy c1512040pRy, long j, float[] fArr) {
        this.LIZ = c1512040pRy;
        this.LIZIZ = j;
        this.LIZJ = fArr;
    }

    public final void LIZ(int i, Map map, boolean z, boolean z2) {
        boolean z3;
        C1512040pRy c1512040pRy = this.LIZ;
        long j = this.LIZIZ;
        final float[] fArr = this.LIZJ;
        c1512040pRy.getClass();
        boolean z4 = true;
        if (z && map != null && !map.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C1512080pS2.LIZ) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService predictRun end2 runSuccess:");
            sbLIZ.append(z3);
            sbLIZ.append(" cost:");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" success:");
            sbLIZ.append(z);
            sbLIZ.append(" errCode:");
            sbLIZ.append(i);
            sbLIZ.append(" outputs:");
            sbLIZ.append(map);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (z3) {
            if (z2) {
                final C1511830pRd c1511830pRd = c1512040pRy.LIZ;
                c1511830pRd.getClass();
                if (map != null) {
                    c1511830pRd.LJIIL(c1511830pRd.LJI);
                    Object obj = map.get("Identity");
                    if (obj instanceof Map) {
                        c1511830pRd.LJI = new C0N82((Map) obj);
                    }
                    Object obj2 = map.get("Identity_1");
                    if (obj2 instanceof Map) {
                        c1511830pRd.LJII = new C0N82((Map) obj2);
                    }
                    Object obj3 = map.get("Identity_2");
                    if (obj3 instanceof Map) {
                        c1511830pRd.LJIIIIZZ = new C0N82((Map) obj3);
                    }
                }
                if (C1512080pS2.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("HARService.onPredictResultChanged success:");
                    sbLIZ2.append(true);
                    sbLIZ2.append(" errCode:");
                    sbLIZ2.append(0);
                    sbLIZ2.append(" outputs:");
                    sbLIZ2.append(map);
                    sbLIZ2.append(" lastSuccessPredictResult:");
                    sbLIZ2.append(c1511830pRd.LJI);
                    sbLIZ2.append(" lastSuccessEnvPredictResult:");
                    sbLIZ2.append(c1511830pRd.LJII);
                    sbLIZ2.append(" lastSuccessOrientationPredictResult:");
                    sbLIZ2.append(c1511830pRd.LJIIIIZZ);
                    sbLIZ2.append(" predictListeners.size:");
                    sbLIZ2.append(c1511830pRd.LJFF.size());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                BPEAHandler bPEAHandler = c1511830pRd.LJIIJJI;
                if (bPEAHandler == null || c1511830pRd.LJFF.isEmpty()) {
                    z4 = false;
                }
                c1511830pRd.LIZLLL();
                if (z4) {
                    C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0pRk
                        public final /* synthetic */ boolean LLILLJJLI = true;
                        public final /* synthetic */ int LLILLL = 0;

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1511830pRd c1511830pRd2 = c1511830pRd;
                            boolean z5 = this.LLILLJJLI;
                            int i2 = this.LLILLL;
                            float[] fArr2 = fArr;
                            c1511830pRd2.getClass();
                            C1C7U.LIZ("HARService@6c94.notifyResultChanged$1L");
                            if (c1511830pRd2.LJFF.isEmpty()) {
                                C1C7U.LIZIZ("HARService@6c94.notifyResultChanged$1L");
                                return;
                            }
                            if (C1512080pS2.LIZ) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("HARService.onPredictResultChanged real in success:");
                                sbLIZ3.append(z5);
                                sbLIZ3.append(" errCode:");
                                sbLIZ3.append(i2);
                                sbLIZ3.append(" lastResult:");
                                sbLIZ3.append(c1511830pRd2.LJII());
                                C2188811AlT.LIZIZ(sbLIZ3);
                                if (fArr2 != null) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("HARService.onPredictResultChanged sensorMeanValue:");
                                    sbLIZ4.append(Arrays.toString(fArr2));
                                    C2188811AlT.LIZIZ(sbLIZ4);
                                }
                            }
                            synchronized (c1511830pRd2.LJFF) {
                                for (int i3 = 0; i3 < c1511830pRd2.LJFF.size(); i3++) {
                                    try {
                                        InterfaceC1512050pRz interfaceC1512050pRz = c1511830pRd2.LJFF.get(i3);
                                        if (interfaceC1512050pRz != null) {
                                            interfaceC1512050pRz.LIZ(i2, z5, c1511830pRd2.LJII());
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                            C1C7U.LIZIZ("HARService@6c94.notifyResultChanged$1L");
                        }
                    });
                    return;
                }
                return;
            }
            HashMap map2 = new HashMap();
            for (Object obj4 : map.keySet()) {
                Object obj5 = map.get(obj4);
                if (obj5 instanceof Float) {
                    map2.put(obj4, obj5);
                }
            }
            c1512040pRy.LIZ.LJIIJ(0, true, map2);
            c1512040pRy.LIZ.LJIIJJI(fArr, true);
            return;
        }
        c1512040pRy.LIZ.LJIIJ(-3, false, null);
        c1512040pRy.LIZ.LJIIJJI(null, false);
    }
}
