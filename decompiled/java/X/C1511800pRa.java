package X;

import com.ss.android.ugc.aweme.ml.ab.SmartHARExperiment;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.infra.MLSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511800pRa implements InterfaceC1511960pRq {
    public final SmartHARExperiment.SmartHarModel LIZ;
    public AbstractC1511510pR7 LIZIZ;

    @Override // X.InterfaceC1511960pRq
    public final void unInit() {
    }

    @Override // X.InterfaceC1511960pRq
    public final void init() {
        PitayaMLConfig pitayaMLConfig;
        SmartHARExperiment.SmartHarModel smartHarModel = this.LIZ;
        if (smartHarModel == null) {
            return;
        }
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("har_service_android");
        SmartSdkConfig smartSdkConfig = new SmartSdkConfig();
        smartSdkConfig.setEngineType(smartHarModel.getEngineType());
        String engineType = smartHarModel.getEngineType();
        if (Intrinsics.LJFF(engineType, "mlsdk")) {
            MLSdkConfig mLSdkConfig = new MLSdkConfig();
            String mlSdkPackageUrl = smartHarModel.getMlSdkPackageUrl();
            if (mlSdkPackageUrl == null) {
                return;
            }
            mLSdkConfig.setPackageUrl(mlSdkPackageUrl);
            smartSdkConfig.setMlSdkConfig(mLSdkConfig);
        } else if (!Intrinsics.LJFF(engineType, "pitaya_ml") || (pitayaMLConfig = smartHarModel.getPitayaMLConfig()) == null) {
            return;
        } else {
            smartSdkConfig.setPitayaMLConfig(pitayaMLConfig);
        }
        smartClassifySceneConfig.setSdkConfig(smartSdkConfig);
        C1511390pQv c1511390pQvLIZ = C1511420pQy.LIZ();
        C1510230pP3 c1510230pP3 = new C1510230pP3("har_service_android");
        c1510230pP3.LIZIZ = smartClassifySceneConfig;
        AbstractC1511510pR7 abstractC1511510pR7LIZ = c1511390pQvLIZ.LIZ("har_service_android", c1510230pP3);
        this.LIZIZ = abstractC1511510pR7LIZ;
        if (abstractC1511510pR7LIZ != null) {
            abstractC1511510pR7LIZ.preloadEnv();
        }
    }

    @Override // X.InterfaceC1511960pRq
    public final boolean isReady() {
        AbstractC1511510pR7 abstractC1511510pR7 = this.LIZIZ;
        if (abstractC1511510pR7 != null) {
            return abstractC1511510pR7.isEnvReady();
        }
        return false;
    }

    public C1511800pRa(SmartHARExperiment.SmartHarModel smartHarModel) {
        this.LIZ = smartHarModel;
        SmartHARService.Companion.getClass();
    }

    @Override // X.InterfaceC1511960pRq
    public final void LIZ(float[] fArr, final C1511860pRg c1511860pRg) {
        if (!isReady() || fArr == null) {
            return;
        }
        C1511810pRb c1511810pRb = C1512030pRx.LIZ;
        if (c1511810pRb.LIZ) {
            c1511810pRb.LJIIIIZZ.LIZ = System.currentTimeMillis();
        }
        C0N33 c0n33 = new C0N33();
        c0n33.LJ = C2097608Jq.LJIIJ(new Pair("har-inputs", fArr));
        AbstractC1511510pR7 abstractC1511510pR7 = this.LIZIZ;
        if (abstractC1511510pR7 != null) {
            abstractC1511510pR7.runAsync(c0n33, new InterfaceC1511740pRU() { // from class: X.0pRc
                /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
                @Override // X.InterfaceC1511740pRU
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C1512100pS4 r14) {
                    /*
                        r13 = this;
                        r2 = 0
                        r5 = 0
                        if (r14 != 0) goto L1f
                        X.0pS0 r0 = r1
                        r4 = -5
                        if (r0 == 0) goto Le
                        X.0pRg r0 = (X.C1511860pRg) r0
                        r0.LIZ(r4, r2, r5, r5)
                    Le:
                        X.0pRb r3 = X.C1512030pRx.LIZ
                        boolean r0 = r3.LIZ
                        if (r0 == 0) goto L1e
                        X.0pRL r2 = r3.LJIIIIZZ
                        long r0 = java.lang.System.currentTimeMillis()
                        r2.LIZIZ = r0
                        r3.LJIIJ = r4
                    L1e:
                        return
                    L1f:
                        boolean r0 = r14.LIZIZ()
                        if (r0 == 0) goto La8
                        java.util.Map<java.lang.String, java.lang.Float> r3 = r14.LIZJ
                        r7 = 1
                        if (r3 == 0) goto L3f
                        X.0pS0 r2 = r1
                        if (r2 == 0) goto L3f
                        boolean r0 = r3.isEmpty()
                        r1 = r0 ^ 1
                        int r0 = r14.LIZ
                        X.0pRg r2 = (X.C1511860pRg) r2
                        r2.LIZ(r0, r3, r1, r5)
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        if (r0 != 0) goto Lb3
                    L3f:
                        java.util.Map<java.lang.String, java.lang.Object> r10 = r14.LJFF
                        if (r10 == 0) goto Lb3
                        X.0pS0 r6 = r1
                        java.util.HashMap r5 = new java.util.HashMap
                        r5.<init>()
                        java.util.Set r0 = r10.keySet()
                        java.util.Iterator r12 = r0.iterator()
                    L52:
                        boolean r0 = r12.hasNext()
                        if (r0 == 0) goto L98
                        java.lang.Object r9 = r12.next()
                        java.util.HashMap r8 = new java.util.HashMap
                        r8.<init>()
                        java.lang.Object r4 = r10.get(r9)
                        boolean r0 = r4 instanceof org.json.JSONObject
                        if (r0 == 0) goto L94
                        org.json.JSONObject r4 = (org.json.JSONObject) r4
                        java.util.Iterator r11 = r4.keys()
                    L6f:
                        boolean r0 = r11.hasNext()
                        if (r0 == 0) goto L94
                        java.lang.Object r3 = r11.next()
                        java.lang.String r3 = (java.lang.String) r3
                        java.lang.Object r1 = r4.opt(r3)
                        boolean r0 = r1 instanceof java.lang.Double
                        if (r0 == 0) goto L6f
                        java.lang.Double r1 = (java.lang.Double) r1
                        if (r1 == 0) goto L6f
                        double r1 = r1.doubleValue()
                        float r0 = (float) r1
                        java.lang.Float r0 = java.lang.Float.valueOf(r0)
                        r8.put(r3, r0)
                        goto L6f
                    L94:
                        r5.put(r9, r8)
                        goto L52
                    L98:
                        if (r6 == 0) goto Lb3
                        boolean r0 = r10.isEmpty()
                        r1 = r0 ^ 1
                        int r0 = r14.LIZ
                        X.0pRg r6 = (X.C1511860pRg) r6
                        r6.LIZ(r0, r5, r1, r7)
                        goto Lb3
                    La8:
                        X.0pS0 r1 = r1
                        if (r1 == 0) goto Lb3
                        int r0 = r14.LIZ
                        X.0pRg r1 = (X.C1511860pRg) r1
                        r1.LIZ(r0, r2, r5, r5)
                    Lb3:
                        X.0pRb r4 = X.C1512030pRx.LIZ
                        int r3 = r14.LIZ
                        boolean r0 = r4.LIZ
                        if (r0 == 0) goto Lc5
                        X.0pRL r2 = r4.LJIIIIZZ
                        long r0 = java.lang.System.currentTimeMillis()
                        r2.LIZIZ = r0
                        r4.LJIIJ = r3
                    Lc5:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1511820pRc.LIZ(X.0pS4):void");
                }
            });
        }
    }
}
