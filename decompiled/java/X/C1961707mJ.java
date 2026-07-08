package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07mJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1961707mJ implements InterfaceC1961807mK {
    public static final Method LIZ;
    public static final Method LIZIZ;
    public static final Method LIZJ;
    public static final Class<?> LIZLLL;
    public static Object LJ;

    static {
        try {
            Class<?> cls = Class.forName("com.ss.ugc.clientai.core.api.FeatureServiceManager");
            LIZLLL = Class.forName("com.ss.android.ugc.aweme.ml.feature.FeatureServiceManagerImpl");
            LIZ = cls.getMethod("instance", new Class[0]);
            LIZJ = Class.forName("com.ss.ugc.clientai.core.api.FeatureProducer").getMethod("getFeature", String.class, JSONObject.class, String.class, Class.forName("com.ss.ugc.clientai.core.api.meta.ReturnCode"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                LIZIZ = Class.forName("com.ss.ugc.clientai.core.api.FeatureProducer").getMethod("getFeature", String.class, JSONObject.class, Class.forName("com.ss.ugc.clientai.core.api.meta.ReturnCode"));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
