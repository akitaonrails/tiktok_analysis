package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi;

/* JADX INFO: renamed from: X.0CN6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CN6 implements IStartupConfigApi {
    public static final C0CN6 LIZIZ = new C0CN6();
    public final /* synthetic */ IStartupConfigApi LIZ = (IStartupConfigApi) ServiceManager.get().getService(IStartupConfigApi.class);

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IStartupConfigApi
    public final Context getApplicationContext() {
        return this.LIZ.getApplicationContext();
    }
}
