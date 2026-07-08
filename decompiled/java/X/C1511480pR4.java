package X;

import Y.ARunnableS28S1100000_23;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511480pR4 implements InterfaceC588340N5s {
    public static InterfaceC830890Wid LJIILL;
    public static boolean LJIILLIIL;
    public static final ConcurrentHashMap<String, C1511480pR4> LJIIZILJ = new ConcurrentHashMap<>();
    public final String LIZIZ;
    public final float LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public int LJI;
    public boolean LJII;
    public LinkedList<C1511560pRC> LJIIIIZZ;
    public final C1511650pRL LJIIIZ;
    public final C1511650pRL LJIIJ;
    public final C1511650pRL LJIIJJI;
    public int LJIIL;
    public C1510500pPU LJIILIIL;
    public InterfaceC1488230opZ LJIILJJIL;

    public final void LIZ(int i) {
        String str;
        switch (i) {
            case 100:
                str = "play_prepare";
                break;
            case 101:
                str = "play_call_playtime";
                break;
            case 102:
                str = "play_first_frame";
                break;
            case 103:
                str = "play_stop";
                break;
            default:
                return;
        }
        MLCommonService.Companion.getClass();
        C0NAL.LIZ.addCommonEventListener(str, this);
    }

    public final void LJ(int i) {
        LinkedList<C1511560pRC> linkedList;
        String aid;
        JSONObject jSONObjectLIZJ;
        Aweme awemeLIZ;
        List<Integer> list;
        C1510500pPU c1510500pPU = this.LJIILIIL;
        if (c1510500pPU != null) {
            if ((c1510500pPU.LIZ != i && ((list = c1510500pPU.LIZIZ) == null || !list.contains(Integer.valueOf(i)))) || (linkedList = this.LJIIIIZZ) == null || linkedList.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (linkedList) {
                try {
                    for (C1511560pRC c1511560pRC : linkedList) {
                        int i2 = c1511560pRC.LIZ - 1;
                        c1511560pRC.LIZ = i2;
                        if (i2 <= 0) {
                            if (c1511560pRC.LIZJ.optInt("error_code", -999) == 0) {
                                InterfaceC1488230opZ interfaceC1488230opZ = this.LJIILJJIL;
                                if (interfaceC1488230opZ != null) {
                                    interfaceC1488230opZ.LIZ(c1511560pRC.LIZJ, c1511560pRC.LIZIZ);
                                }
                                C1509310pNZ c1509310pNZ = c1511560pRC.LIZIZ;
                                if (this.LJFF != null && (((aid = c1509310pNZ.LIZIZ) != null || ((awemeLIZ = C1511360pQs.LIZ(c1509310pNZ)) != null && (aid = awemeLIZ.getAid()) != null)) && (jSONObjectLIZJ = C1509290pNX.LIZJ(this.LJFF, c1509310pNZ, this.LIZIZ)) != null && jSONObjectLIZJ.keys().hasNext())) {
                                    jSONObjectLIZJ.put("inference_id", aid);
                                    JSONObject jSONObject = c1511560pRC.LIZJ;
                                    Object objLJI = LJI(this.LJ, jSONObject, "truth", new TTMParamData(new TTMParamData(jSONObjectLIZJ)));
                                    if (objLJI != null) {
                                        jSONObject.put("truth", objLJI);
                                    }
                                    c1511560pRC.LIZJ.put("truth_map", C786410Ut5.J3(jSONObjectLIZJ));
                                }
                            }
                            C20684815ws.LJFF().execute(new ARunnableS28S1100000_23(c1511560pRC.LIZJ, 33));
                            arrayList.add(c1511560pRC);
                        }
                    }
                    if (true ^ arrayList.isEmpty()) {
                        linkedList.removeAll(C13LP.LLIIJI(arrayList));
                    }
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C1337780kuu.LIZ(th, null, 6);
                        linkedList.clear();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }
    }

    public final void LIZIZ(JSONObject jSONObject, Map map) throws JSONException {
        Map map2;
        Object objLJI = LJI(this.LIZLLL, jSONObject, "predict_label", new TTMParamData((Map<String, Object>) map));
        if ((objLJI instanceof Map) && (map2 = (Map) objLJI) != null) {
            for (Map.Entry entry : map2.entrySet()) {
                jSONObject.put("predict_label", entry.getKey());
                jSONObject.put("predict_value", entry.getValue());
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC588340N5s
    public final void LIZJ(String str, C1510130pOt c1510130pOt) {
        switch (str.hashCode()) {
            case -1877535187:
                if (str.equals("play_stop")) {
                    LJ(103);
                }
                break;
            case -1704536429:
                if (str.equals("play_first_frame")) {
                    LJ(102);
                }
                break;
            case 1168529143:
                if (str.equals("play_call_playtime")) {
                    LJ(101);
                }
                break;
            case 1274399484:
                if (str.equals("play_prepare")) {
                    LJ(100);
                }
                break;
        }
    }

    public final void LIZLLL(int i, AbstractC1511520pR8 abstractC1511520pR8) {
        String engineType;
        int i2;
        SmartSdkConfig sdkConfig;
        SmartSceneConfig smartSceneConfigLIZJ = C1511360pQs.LIZJ(abstractC1511520pR8.LIZIZ);
        if (smartSceneConfigLIZJ != null && (sdkConfig = smartSceneConfigLIZJ.getSdkConfig()) != null) {
            engineType = sdkConfig.getEngineType();
        } else {
            engineType = null;
        }
        if (Intrinsics.LJFF(engineType, "mlsdk")) {
            i2 = 1;
        } else if (Intrinsics.LJFF(engineType, "pitaya_ml")) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Scene.SCENE_SERVICE, this.LIZIZ);
            jSONObject.put("run_count", this.LJI);
            jSONObject.put("error_code", i);
            jSONObject.put("engine_type", i2);
            C20684815ws.LJFF().execute(new ARunnableS28S1100000_23(jSONObject, 33));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    public final void LJII(C1510500pPU c1510500pPU, InterfaceC1488230opZ interfaceC1488230opZ) {
        this.LJIILIIL = c1510500pPU;
        this.LJIILJJIL = interfaceC1488230opZ;
        int i = c1510500pPU.LIZ;
        if (i != 0) {
            LIZ(i);
        }
        List<Integer> list = c1510500pPU.LIZIZ;
        if (list != null) {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZ(it2.next().intValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C1509310pNZ r6, X.C1512100pS4 r7, X.AbstractC1511520pR8 r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1511480pR4.LJFF(X.0pNZ, X.0pS4, X.0pR8):void");
    }

    public static Object LJI(String str, JSONObject jSONObject, String str2, TTMParamData tTMParamData) throws JSONException {
        boolean z;
        EnumC1910390zoT enumC1910390zoTLIZIZ;
        EnumC1910390zoT enumC1910390zoTLIZIZ2;
        Object objLIZJ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (!TTMStrategyCenterManager.isInit()) {
            jSONObject.put(str2, "strategy sdk not init");
            return null;
        }
        InterfaceC830890Wid interfaceC830890Wid = LJIILL;
        if (interfaceC830890Wid == null) {
            jSONObject.put(str2, "scene null");
            return null;
        }
        InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, str, tTMParamData);
        if (interfaceC805220ViKRunScene != null) {
            enumC1910390zoTLIZIZ = interfaceC805220ViKRunScene.LIZIZ();
        } else {
            enumC1910390zoTLIZIZ = null;
        }
        if (enumC1910390zoTLIZIZ != EnumC1910390zoT.CelResult) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttm error ");
            if (interfaceC805220ViKRunScene != null) {
                enumC1910390zoTLIZIZ2 = interfaceC805220ViKRunScene.LIZIZ();
            } else {
                enumC1910390zoTLIZIZ2 = null;
            }
            sbLIZ.append(enumC1910390zoTLIZIZ2);
            sbLIZ.append(": ");
            if (interfaceC805220ViKRunScene != null) {
                objLIZJ = interfaceC805220ViKRunScene.LIZJ();
            } else {
                objLIZJ = null;
            }
            sbLIZ.append(objLIZJ);
            jSONObject.put(str2, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return interfaceC805220ViKRunScene.LIZJ();
    }

    public C1511480pR4(String str, float f, String str2, String str3, String str4) {
        this.LIZIZ = str;
        this.LIZJ = f;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ml#");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIZ = new C1511650pRL();
        this.LJIIJ = new C1511650pRL();
        this.LJIIJJI = new C1511650pRL();
    }
}
