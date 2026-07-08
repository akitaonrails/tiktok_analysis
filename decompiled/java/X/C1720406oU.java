package X;

import com.ss.android.ugc.aweme.experiment.LogInterceptImpl;
import com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1720406oU implements ILogInterceptApi {
    public static final C1720406oU LIZIZ = new C1720406oU();
    public final /* synthetic */ ILogInterceptApi LIZ;

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZIZ(String str, JSONObject jSONObject) {
        return this.LIZ.LIZIZ(str, jSONObject);
    }

    public C1720406oU() {
        ILogInterceptApi iLogInterceptApi;
        Object objLIZ = C04TD.LIZ(ILogInterceptApi.class, false);
        if (objLIZ != null) {
            iLogInterceptApi = (ILogInterceptApi) objLIZ;
        } else {
            if (C04TD.l0 == null) {
                synchronized (ILogInterceptApi.class) {
                    if (C04TD.l0 == null) {
                        C04TD.l0 = new LogInterceptImpl();
                    }
                }
            }
            iLogInterceptApi = C04TD.l0;
        }
        this.LIZ = iLogInterceptApi;
    }
}
