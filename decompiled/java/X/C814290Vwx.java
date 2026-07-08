package X;

import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;

/* JADX INFO: renamed from: X.0Vwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814290Vwx implements ICrashSdkApi {
    public static final C814290Vwx LIZIZ = new C814290Vwx();
    public final /* synthetic */ ICrashSdkApi LIZ = (ICrashSdkApi) ServiceManager.get().getService(ICrashSdkApi.class);

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LJIIZILJ(Context context) {
        this.LIZ.LJIIZILJ(context);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LJIJ() {
        this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LJIJI() {
        this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final Application.ActivityLifecycleCallbacks LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void ensureNotReachHere(Throwable th, String str) {
        this.LIZ.ensureNotReachHere(th, str);
    }
}
