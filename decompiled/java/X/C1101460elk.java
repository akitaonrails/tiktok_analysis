package X;

import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.other.LiveRevenueFeatureCollectService;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0elk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101460elk implements InterfaceC956290azb {
    public static final C1101460elk LIZ = new C1101460elk();
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(293));

    @Override // X.InterfaceC956290azb
    public final void LIZ(String str, JSONObject jSONObject, int i, InterfaceC2179811ASt interfaceC2179811ASt) {
        String strJ3;
        InterfaceC2179811ASt interfaceC2179811ASt2 = interfaceC2179811ASt;
        C01GW c01gw = LIZIZ;
        if (((LiveRevenueFeatureCollectService) c01gw.getValue()).enable > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("collect type == ");
            sbLIZ.append(str);
            sbLIZ.append(", input data == ");
            if (jSONObject != null) {
                strJ3 = C786410Ut5.J3(jSONObject);
            } else {
                strJ3 = null;
            }
            sbLIZ.append(strJ3);
            C20441214yg.LIZIZ("LiveFeatureCollectService", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC964460bCm interfaceC964460bCmLJIIL = LivePitayaEnv.LJIIL();
            String str2 = ((LiveRevenueFeatureCollectService) c01gw.getValue()).businessName;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C1132380fZc c1132380fZc = new C1132380fZc(false, jSONObject.putOpt("feature_collect_type", str));
            if (interfaceC2179811ASt2 == null) {
                interfaceC2179811ASt2 = new InterfaceC2179811ASt() { // from class: X.0ell
                    @Override // X.InterfaceC2179811ASt
                    public final void LIZ(C21406118pv c21406118pv) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("task output data [isSuccess == ");
                        sbLIZ2.append(c21406118pv.LIZ());
                        sbLIZ2.append(", code == ");
                        sbLIZ2.append(c21406118pv.LIZ);
                        sbLIZ2.append(", data == ");
                        sbLIZ2.append(c21406118pv.LIZIZ);
                        sbLIZ2.append(']');
                        C20441214yg.LIZIZ("LiveFeatureCollectService", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                };
            }
            ((C1ATJ) interfaceC964460bCmLJIIL).LIZJ(new C1ATK(str2, c1132380fZc, interfaceC2179811ASt2, new C1ATM(0L, false, 14), 8));
        }
    }
}
