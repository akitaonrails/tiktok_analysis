package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.model.PoiFeedPlayNumModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePoiRealTimeFeatureService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import defpackage.v0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DC5, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DC5 implements InterfaceC1333005Jo<C0XLL> {
    public static final C1DCC LIZ = new C1DCC();
    public static final C01GW<AbstractC1604130rqV> LIZIZ = C452501pT.LIZIZ(new C165I());

    @Override // X.InterfaceC1333005Jo
    public final String getTag() {
        return "signal";
    }

    @Override // X.InterfaceC1333005Jo
    public final int getType() {
        return 0;
    }

    @Override // X.InterfaceC1333005Jo
    public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
        Unit unit;
        String stringFeature$default;
        int i;
        float fFloatValue;
        C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
        C0XLL c0xll = c1440305kP.LIZJ;
        if (!C300960Bqw.LIZ()) {
            return;
        }
        C1EST c1est = c0xll.LIZ;
        int iLIZ = C1DD1.LIZ();
        int iLIZIZ = C1DD1.LIZIZ();
        int iLIZJ = C1DD1.LIZJ();
        int iLIZLLL = C1DD1.LIZLLL();
        String strLJ = C486660J6q.LJ();
        String strLIZLLL = C486660J6q.LIZLLL();
        c1est.LJJL = Integer.valueOf(iLIZ);
        c1est.LJJLI = Integer.valueOf(iLIZIZ);
        c1est.LJJLIIIIJ = Integer.valueOf(iLIZJ);
        c1est.LJJLIIIJ = Integer.valueOf(iLIZLLL);
        LIZ.getClass();
        C1DC6 c1dc6 = new C1DC6();
        C1DC9 c1dc9 = new C1DC9();
        c1dc9.LJII = strLJ;
        c1dc9.LJIIIIZZ = strLIZLLL;
        c1dc9.LJIIIZ = Integer.valueOf(iLIZ);
        c1dc9.LJIIJ = Integer.valueOf(iLIZIZ);
        c1dc9.LJIIJJI = Integer.valueOf(iLIZJ);
        c1dc9.LJIIL = Integer.valueOf(iLIZLLL);
        try {
            PoiFeedPlayNumModel poiFeedPlayNumModelLIZIZ = ((ILocalServicePoiRealTimeFeatureService) ServiceManager.get().getService(ILocalServicePoiRealTimeFeatureService.class)).LIZIZ();
            if (poiFeedPlayNumModelLIZIZ != null) {
                C2251681DBe c2251681DBe = new C2251681DBe();
                c2251681DBe.LJI = Integer.valueOf(poiFeedPlayNumModelLIZIZ.batchNum);
                c2251681DBe.LJ = Integer.valueOf(poiFeedPlayNumModelLIZIZ.batchNumAll);
                c2251681DBe.LJFF = Integer.valueOf(poiFeedPlayNumModelLIZIZ.playNum);
                c2251681DBe.LIZLLL = Integer.valueOf(poiFeedPlayNumModelLIZIZ.playNumAll);
                c1dc9.LJIILLIIL = c2251681DBe.build();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ.getValue().LJIIZILJ("get poi num failed", e);
            C1AF0.LJ(e);
        }
        try {
            c1dc6.LIZLLL = C1DCC.LIZJ();
            c1dc6.LJ = C1DCC.LIZIZ(c1601460rmC, c1dc9);
            MLDataCenterService.Companion.getClass();
            JSONObject flashFeedFeatures = C1349505Px.LIZ.getFlashFeedFeatures("pitaya_info");
            if (flashFeedFeatures != null) {
                c1dc6.LJFF = C786410Ut5.J3(flashFeedFeatures);
            }
            if (((Boolean) C1ENV.LIZLLL.getValue()).booleanValue() && c1601460rmC.LIZIZ == 8) {
                C590410NDr c590410NDr = C590410NDr.LIZ;
                String str = c1dc6.LJFF;
                c590410NDr.getClass();
                String strLIZ = C590410NDr.LIZ(str);
                if (strLIZ != null) {
                    c1dc6.LJFF = strLIZ;
                }
            }
            if (((Boolean) C270520Aiw.LIZ.getValue()).booleanValue() && ((i = c1601460rmC.LIZIZ) == 0 || i == 2)) {
                C1D9V c1d9v = new C1D9V();
                C1514090pVH.LIZ.getClass();
                Float fLIZJ = C1514090pVH.LIZJ();
                float fFloatValue2 = 0.0f;
                if (fLIZJ != null) {
                    fFloatValue = fLIZJ.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                Float fLIZLLL = C1514090pVH.LIZLLL();
                if (fLIZLLL != null) {
                    fFloatValue2 = fLIZLLL.floatValue();
                }
                float f = LSPassThroughRecordSizeConfig.DEFAULT;
                c1d9v.LJ = Integer.valueOf((int) (fFloatValue2 * f));
                c1d9v.LIZLLL = Integer.valueOf((int) (fFloatValue * f));
                c1dc6.LJI = c1d9v.build();
            }
            if (((Boolean) v0.LIZ.getValue()).booleanValue() && c1601460rmC.LIZIZ == 8) {
                c1dc6.LJI = C1DCC.LIZ();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZIZ.getValue().LJIIZILJ("build v2 failed", e2);
            C1AF0.LJ(e2);
        }
        C1DC8 c1dc8Build = c1dc6.build();
        if (C21141917oP.LIZ()) {
            C0R16.LIZ.getClass();
            c1dc8Build.search_signal = C0R16.LIZIZ(null);
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_user", 0, 2, null);
        if (producer$default != null && (stringFeature$default = FeatureProducer.getStringFeature$default(producer$default, "session_id", (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null)) != null) {
            c1est.LLJI = stringFeature$default;
        }
        c1est.LLJJJ = c1dc8Build;
        if (C300580BqK.LIZ()) {
            C2183771AdL c2183771AdL = C2183801AdO.LIZ;
            c2183771AdL.getClass();
            MLDataCenterService.Companion.getClass();
            JSONObject flashFeedFeatures2 = C1349505Px.LIZ.getFlashFeedFeatures("realtime_client_info_v3");
            if (flashFeedFeatures2 == null) {
                flashFeedFeatures2 = new JSONObject();
            }
            try {
                if (c1601460rmC.LIZIZ == 0) {
                    c2183771AdL.LIZJ(flashFeedFeatures2);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            try {
                C2183771AdL.LIZLLL(c1601460rmC, c1dc8Build, flashFeedFeatures2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            Iterator<T> it2 = c2183771AdL.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                try {
                    Object objLIZ = ((InterfaceC2183821AdQ) entry.getValue()).LIZ(c1601460rmC);
                    if (objLIZ != null) {
                        c2183771AdL.LIZIZ(flashFeedFeatures2, (String) entry.getKey(), objLIZ);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
            c1est.LLLJL = C786410Ut5.J3(flashFeedFeatures2);
        }
        c1est.LLLLIIIILLL = Integer.valueOf(((Number) C300580BqK.LIZ.getValue()).intValue());
    }
}
