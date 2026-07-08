package X;

import com.ss.android.ugc.aweme.setting.performance.AnimationDowngradeConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.jvm.internal.AFwS224S0000000_33;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176211AEx {
    public static final AnimationDowngradeConfig LIZ = new AnimationDowngradeConfig(0, -1.0f, -1.0f, -1.0f);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(540));

    public static AnimationDowngradeConfig LIZ() {
        return (AnimationDowngradeConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().animationCurveOpt == 1;
    }

    public static boolean LIZJ() {
        Float f;
        if (LIZ().animationCloseLowerDeviceScore < 0.0f) {
            return false;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "overall_score", (JSONObject) null, "feed_animation_downgrade", (ReturnCode) null, 10, (Object) null) : null;
        if (!(feature$default instanceof Float) || (f = (Float) feature$default) == null) {
            return false;
        }
        float fFloatValue = f.floatValue();
        return fFloatValue <= LIZ().animationCloseLowerDeviceScore && fFloatValue > 0.0f;
    }

    public static boolean LIZLLL() {
        Float f;
        if (LIZ().animationCloseLowestDeviceScore < 0.0f) {
            return false;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "overall_score", (JSONObject) null, "p1_animation", (ReturnCode) null, 10, (Object) null) : null;
        if (!(feature$default instanceof Float) || (f = (Float) feature$default) == null) {
            return false;
        }
        float fFloatValue = f.floatValue();
        return fFloatValue < LIZ().animationCloseLowestDeviceScore && fFloatValue > 0.0f;
    }

    public static boolean LJ() {
        Float f;
        if (LIZ().resourceAnimationCloseLowestDeviceScore < 0.0f) {
            return false;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "overall_score", (JSONObject) null, "resource_animation", (ReturnCode) null, 10, (Object) null) : null;
        if (!(feature$default instanceof Float) || (f = (Float) feature$default) == null) {
            return false;
        }
        float fFloatValue = f.floatValue();
        return fFloatValue <= LIZ().resourceAnimationCloseLowestDeviceScore && fFloatValue > 0.0f;
    }
}
