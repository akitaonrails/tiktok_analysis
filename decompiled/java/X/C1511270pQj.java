package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.MLSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0pQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511270pQj extends AbstractC1513290pTz {
    public final String LIZJ;
    public boolean LIZLLL;

    @Override // X.AbstractC1513290pTz
    public final void LJ() {
    }

    public final void LJFF() {
        MLSdkConfig mlSdkConfig;
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("ohr_android");
        smartClassifySceneConfig.setFeatures(null);
        smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
        SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig != null) {
            sdkConfig.setMlSdkConfig(new MLSdkConfig());
        }
        SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
            mlSdkConfig.setPackageUrl(this.LIZJ);
        }
        C1511260pQi c1511260pQi = SmartClassifyService.Companion;
        c1511260pQi.getClass();
        ISmartClassifyService iSmartClassifyService = C1156204fg.LIZ;
        iSmartClassifyService.configSceneModel("ohr_android", smartClassifySceneConfig);
        c1511260pQi.getClass();
        iSmartClassifyService.ensureEnvAvailable("ohr_android");
    }

    @Override // X.AbstractC1513290pTz
    public final void LIZLLL() {
        LJFF();
    }

    public C1511270pQj(String str) {
        this.LIZJ = str;
    }

    @Override // X.AbstractC1513290pTz
    public final void LIZJ(C1511310pQn c1511310pQn) {
        Object obj = c1511310pQn.LIZ;
        LJFF();
        SmartClassifyService.Companion.getClass();
        ISmartClassifyService iSmartClassifyService = C1156204fg.LIZ;
        if (!iSmartClassifyService.enable("ohr_android")) {
            if (!iSmartClassifyService.isEnvReady("ohr_android")) {
                iSmartClassifyService.ensureEnvAvailable("ohr_android");
                return;
            }
            return;
        }
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.uptimeMillis();
        C0N33 c0n33 = new C0N33();
        HashMap map = new HashMap();
        map.put("ohr-inputs", obj);
        c0n33.LJ = map;
        iSmartClassifyService.classify("ohr_android", c0n33, null, new InterfaceC1511280pQk() { // from class: X.0pTw
            @Override // X.InterfaceC1511280pQk
            public final void LIZ(boolean z, int i, String str, Map map2) throws JSONException {
                Float fValueOf;
                Float fValueOf2;
                C1513300pU0 c1513300pU0LJIIIZ;
                int i2;
                float fFloatValue;
                C1513250pTv c1513250pTv;
                long jUptimeMillis = SystemClock.uptimeMillis() - c238400w2.element;
                C1513240pTu c1513240pTu = C1513240pTu.LIZ;
                C1512320pSQ.LIZJ(this.LIZJ);
                this.getClass();
                c1513240pTu.getClass();
                if (C1513240pTu.LIZIZ && (c1513250pTv = C1513240pTu.LIZLLL) != null) {
                    c1513250pTv.LJFF = i;
                    c1513250pTv.LIZLLL = jUptimeMillis;
                }
                C1511270pQj c1511270pQj = this;
                c1511270pQj.getClass();
                SystemClock.uptimeMillis();
                if (z && map2 != null && str != null) {
                    C1513270pTx c1513270pTx = new C1513270pTx(0);
                    for (String str2 : map2.keySet()) {
                        if (Intrinsics.LJFF(str2, "left")) {
                            i2 = 1;
                        } else if (Intrinsics.LJFF(str2, "right")) {
                            i2 = 2;
                        } else {
                            i2 = 0;
                        }
                        Float f = (Float) map2.get(str2);
                        if (f != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        c1513270pTx.LIZ(new C1513280pTy(fFloatValue, str2, i2));
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    C1513240pTu c1513240pTu2 = C1513240pTu.LIZ;
                    C1513280pTy c1513280pTy = c1513270pTx.LIZIZ;
                    int i3 = c1513280pTy.LIZ;
                    float f2 = c1513280pTy.LIZJ;
                    c1513240pTu2.getClass();
                    C1513240pTu.LIZ(f2, 0, i3, jUptimeMillis2);
                    InterfaceC1513310pU1 interfaceC1513310pU1 = c1511270pQj.LIZIZ;
                    if (interfaceC1513310pU1 != null) {
                        interfaceC1513310pU1.LIZ(c1513270pTx);
                    }
                } else {
                    C1513240pTu.LIZ(0.0f, -1, 0, SystemClock.uptimeMillis());
                }
                if (C2550309z3.LIZ != 0) {
                    SmartOHRService smartOHRService = C1513230pTt.LIZ;
                    Float fValueOf3 = null;
                    if (smartOHRService != null && (c1513300pU0LJIIIZ = smartOHRService.LJIIIZ()) != null) {
                        fValueOf = Float.valueOf(c1513300pU0LJIIIZ.LIZ);
                        fValueOf2 = Float.valueOf(c1513300pU0LJIIIZ.LIZIZ);
                        fValueOf3 = Float.valueOf(c1513300pU0LJIIIZ.LIZJ);
                    } else {
                        fValueOf = null;
                        fValueOf2 = null;
                    }
                    PitayaFeatureCenterService.Companion.getClass();
                    C1510980pQG.LIZ.onSlideSpeedUpdate(fValueOf, fValueOf2, fValueOf3);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("slide speed velocity=");
                    sbLIZ.append(fValueOf);
                    sbLIZ.append(" slide speed velocityX=");
                    sbLIZ.append(fValueOf2);
                    sbLIZ.append(" slide speed velocityY=");
                    sbLIZ.append(fValueOf3);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        });
    }
}
