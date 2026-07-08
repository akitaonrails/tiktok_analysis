package Y;

import X.C08SA;
import X.C08Y5;
import X.C0CHQ;
import X.C0PEM;
import X.C1C7U;
import X.C20684815ws;
import X.C2162308dZ;
import X.C2237608pi;
import X.C2237708pj;
import X.C2296808zG;
import X.C23250099c;
import X.C844470XAv;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.jar.JarFile;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS147S0000000_3 implements Callable {
    public final int $t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public ACallableS147S0000000_3(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS147S0000000_3 aCallableS147S0000000_3) {
        C1C7U.LIZ("EffectJobService@b067.onCreate$1L");
        try {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().clearDraftEffectCache();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("EffectJobService@b067.onCreate$1L");
        return null;
    }

    public static final Object call$1(ACallableS147S0000000_3 aCallableS147S0000000_3) {
        C1C7U.LIZ("EffectCompatJobService@67d4.onStartJob$1L");
        try {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().clearDraftEffectCache();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("EffectCompatJobService@67d4.onStartJob$1L");
        return null;
    }

    public static final Object call$2(ACallableS147S0000000_3 aCallableS147S0000000_3) {
        C1C7U.LIZ("EffectDataProvider@abb5.copyInternalFilterResources$1L");
        Application application = C0CHQ.LIZ;
        C08SA.LIZLLL(application, R.raw.fake3d, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIIJ(""));
        C08SA.LIZLLL(application, R.raw.soul_scale, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIIJ(""));
        C1C7U.LIZIZ("EffectDataProvider@abb5.copyInternalFilterResources$1L");
        return null;
    }

    public static final Object call$3(ACallableS147S0000000_3 aCallableS147S0000000_3) {
        C1C7U.LIZ("PlayerController@7763.tryPlay$1L");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C08Y5(false, null), 3);
        C1C7U.LIZIZ("PlayerController@7763.tryPlay$1L");
        return null;
    }

    public static final Object call$4(ACallableS147S0000000_3 aCallableS147S0000000_3) {
        C1C7U.LIZ("TrimMemoryUtils@8d2e.clearJarcache$1L");
        try {
            Field declaredField = Class.forName("libcore.net.url.JarURLConnectionImpl").getDeclaredField("jarCache");
            declaredField.setAccessible(true);
            HashMap<URL, JarFile> map = (HashMap) declaredField.get(null);
            C2237608pi.LIZ = map;
            synchronized (map) {
                try {
                    HashMap<URL, JarFile> map2 = C2237608pi.LIZ;
                    if (map2 != null) {
                        Iterator<Map.Entry<URL, JarFile>> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<URL, JarFile> next = it2.next();
                            URL key = next.getKey();
                            if (key.toString().endsWith(".apk") || key.toString().endsWith(".jar")) {
                                try {
                                    next.getValue().close();
                                    it2.remove();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                } finally {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } catch (Exception e22) {
        }
        C1C7U.LIZIZ("TrimMemoryUtils@8d2e.clearJarcache$1L");
        return null;
    }

    public static final Object call$5(ACallableS147S0000000_3 aCallableS147S0000000_3) {
        String strLIZ;
        C1C7U.LIZ("BackgroundStartReport@7e7c.reportBackgroundStartUseTime$1L");
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                strLIZ = C2162308dZ.LIZ(contextLIZ);
            } else {
                strLIZ = "";
            }
            int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - C2237708pj.LIZ) / 1000);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", iCurrentTimeMillis);
            jSONObject.put("processName", strLIZ);
            AppLogNewUtils.onEventV3("background_start_sucess", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("BackgroundStartReport@7e7c.reportBackgroundStartUseTime$1L");
        return null;
    }

    public static final Object call$6(ACallableS147S0000000_3 aCallableS147S0000000_3) {
        C1C7U.LIZ("LoadMoreFrameLayout@3c7d.reportShowLoadingEvent$1L");
        C20684815ws.onEventV3("slide_up_show_loading");
        C1C7U.LIZIZ("LoadMoreFrameLayout@3c7d.reportShowLoadingEvent$1L");
        return null;
    }
}
