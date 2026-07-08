package X;

import Y.ARunnableS14S1300000_16;
import Y.ARunnableS24S0400000_16;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.miniapp.impl.MiniAppDependServiceImpl;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030580cvQ implements IMiniAppService {
    public static final /* synthetic */ int LIZJ = 0;
    public IMiniAppService LIZ;
    public boolean LIZIZ = true;

    public final synchronized IMiniAppService LIZ() {
        IMiniAppService iMiniAppService = this.LIZ;
        if (iMiniAppService != null) {
            return iMiniAppService;
        }
        try {
            try {
                try {
                    try {
                        this.LIZ = (IMiniAppService) Class.forName("com.ss.android.ugc.aweme.miniapp.MiniAppService").getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                        C2344809Gs.LIZ(e);
                    }
                } catch (NoSuchMethodException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2344809Gs.LIZ(e2);
                }
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1AF0.LJ(e3);
                C2344809Gs.LIZ(e3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final String addScene(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean checkMiniAppEnable(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final String getJsSdkVersion(Application application) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void getShareInfo(String str, InterfaceC1030640cvW interfaceC1030640cvW) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void handleActivityImageResult(int i, int i2, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void initMiniApp(InterfaceC1030630cvV interfaceC1030630cvV) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void initWebViewSuffix(ContextWrapper contextWrapper, String str) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean isMinAppAvailable(Context context, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void logExcitingVideoAd(Context context, String str, long j, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void notifyFollowAwemeState(int i) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void notifyLocaleChange(Locale locale) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean openShortcut(Context context, Intent intent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void preloadMiniApp(String str) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void preloadMiniApp(String str, int i) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void remoteMobV3(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final String setLaunchModeHostTask(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void tryMoveMiniAppActivityToFront(String str) {
    }

    public final IMiniAppService LIZIZ() {
        try {
            if (this.LIZIZ) {
                InterfaceC1030600cvS interfaceC1030600cvSLJJII = MiniAppDependServiceImpl.LIZ().LJJII();
                HashMap map = new HashMap();
                map.put("plugin_version", "");
                interfaceC1030600cvSLJJII.LIZ(new JSONObject(map));
                this.LIZIZ = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        IMiniAppService iMiniAppServiceLIZ = LIZ();
        return iMiniAppServiceLIZ == null ? this : iMiniAppServiceLIZ;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final InterfaceC1030650cvX getMobClickCombinerIpcService() {
        return new InterfaceC1030650cvX() { // from class: X.0cvT
        };
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final InterfaceC1030660cvY getTTDownloaderIpcService() {
        return new InterfaceC1030660cvY() { // from class: X.0cvU
        };
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean openMiniApp(Context context, MicroAppInfo microAppInfo, C1611490s2N c1611490s2N) {
        String schema;
        if (microAppInfo == null) {
            schema = "";
        } else {
            schema = microAppInfo.getSchema();
        }
        boolean zEquals = false;
        if (schema != null && schema.length() != 0) {
            zEquals = TextUtils.equals(UriProtector.parse(schema).getHost(), "microgame");
        }
        return C842890X4t.LIZIZ(zEquals, new ARunnableS24S0400000_16(context, c1611490s2N, this, microAppInfo, 9));
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean openMiniApp(Context context, String str, C1611490s2N c1611490s2N) {
        boolean zEquals = false;
        if (str != null && str.length() != 0) {
            zEquals = TextUtils.equals(UriProtector.parse(str).getHost(), "microgame");
        }
        return C842890X4t.LIZIZ(zEquals, new ARunnableS14S1300000_16(context, str, c1611490s2N, this, 2));
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void jumpToMiniApp(final Context context, final String str, final String str2, final boolean z, final String str3, final String str4) {
        C842890X4t.LIZIZ(z, new Runnable() { // from class: X.0bqD
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MiniAppServiceProxy@cf.jumpToMiniApp$1");
                try {
                    if (this.LLIZ.LIZ() != null && !(this.LLIZ.LIZIZ() instanceof C1030580cvQ)) {
                        this.LLIZ.LIZIZ().jumpToMiniApp(context, str, str2, z, str3, str4);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MiniAppServiceProxy@cf.jumpToMiniApp$1");
            }
        });
    }
}
