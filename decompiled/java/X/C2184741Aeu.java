package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aeu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184741Aeu extends FeatureProducer {
    public static final C2184741Aeu LIZIZ = new C2184741Aeu();
    public static String LIZJ = "f_scene";

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        boolean z;
        C2184751Aev c2184751Aev;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (returnCode != null) {
                returnCode.code = 1;
            }
            return null;
        }
        if (returnCode != null) {
            try {
                returnCode.code = 200;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (returnCode != null) {
                    returnCode.code = 3;
                }
                C1337780kuu.LIZ(e, null, 6);
                return null;
            }
        }
        switch (str.hashCode()) {
            case -893305568:
                if (str.equals("is_scrolling")) {
                    return Boolean.valueOf(C1BCA.LJIIJ().LIZ);
                }
                break;
            case -359764761:
                if (str.equals("is_page_start")) {
                    C2200821BBo.LIZ.getClass();
                    if (C2200821BBo.LIZ() || ((C2184761Aew) C2201101BCq.LJI(EnumC2184731Aet.Activity, null)) == null) {
                        new C2184761Aew();
                    }
                    return Boolean.FALSE;
                }
                break;
            case -349526181:
                if (str.equals("cur_fragment_name")) {
                    return C104100aN.LIZ().LJJIIZ();
                }
                break;
            case 1896965500:
                if (str.equals("is_cold_start")) {
                    C2200821BBo.LIZ.getClass();
                    if (C2200821BBo.LIZ() || (c2184751Aev = (C2184751Aev) C2201101BCq.LJI(EnumC2184731Aet.ColdStart, null)) == null) {
                        c2184751Aev = new C2184751Aev();
                    }
                    return Boolean.valueOf(c2184751Aev.LIZ);
                }
                break;
        }
        if (returnCode != null) {
            returnCode.code = 1;
        }
        return null;
    }
}
