package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589300N9k {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C301100BrA());

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LJ() {
        Float f;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "overall_score", (JSONObject) null, "digg_ui_optimize", (ReturnCode) null, 10, (Object) null) : null;
        if (!(feature$default instanceof Float) || (f = (Float) feature$default) == null) {
            return false;
        }
        float fFloatValue = f.floatValue();
        return ((double) fFloatValue) < 6.6d && fFloatValue > 0.0f;
    }

    public static boolean LIZIZ() {
        return LIZ() == 2 || LIZ() == 4 || LIZ() == 6 || LIZ() == 7;
    }

    public static boolean LIZJ() {
        return LIZ() == 3 || LIZ() == 5 || LIZ() == 6 || LIZ() == 7;
    }

    public static boolean LIZLLL() {
        return LIZ() == 1 || LIZ() == 4 || LIZ() == 5 || LIZ() == 7;
    }
}
