package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import jv6.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842870X4r {
    public static final C842870X4r LIZ = new C842870X4r();
    public static final FutureC842880X4s LIZIZ = new FutureC842880X4s();

    public static boolean LIZ() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_push_sdk_oppo_module_df_on_demand", true, false)) {
            return true;
        }
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService == null) {
            return false;
        }
        return iPluginService.checkPluginInstalled("com.ss.android.ugc.df.oppopush_on_demand");
    }

    public final void LIZJ(final Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "push_sdk_oppo_module_df_kill_switch", true, false) || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_push_sdk_oppo_module_df_on_demand", true, false)) {
            return;
        }
        if (LIZ()) {
            FutureC842880X4s futureC842880X4s = LIZIZ;
            futureC842880X4s.LL = true;
            if (futureC842880X4s.LLILLJJLI) {
                futureC842880X4s.LLILLL.release();
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                FutureC842880X4s futureC842880X4s2 = LIZIZ;
                if (!futureC842880X4s2.LL && !futureC842880X4s2.LLILLJJLI) {
                    futureC842880X4s2.LLILLJJLI = true;
                    IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                    if (iPluginService == null) {
                        LIZIZ(-2, -1L, false);
                        return;
                    }
                    AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                    anonymousClass1403.LIZ = false;
                    anonymousClass1403.LIZIZ();
                    anonymousClass1403.LIZJ = false;
                    anonymousClass1403.LIZLLL = false;
                    anonymousClass1403.LJFF = false;
                    AnonymousClass1405 anonymousClass1405 = new AnonymousClass1405(anonymousClass1403);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    C844020X9c c844020X9c = new C844020X9c();
                    c844020X9c.LIZ = "com.ss.android.ugc.df.oppopush_on_demand";
                    c844020X9c.LIZIZ = true;
                    c844020X9c.LJ = anonymousClass1405;
                    c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.0X1S
                        @Override // X.InterfaceC842850X4p
                        public final void LIZJ(String str, boolean z) throws JSONException {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            C842870X4r.LIZ.getClass();
                            C842870X4r.LIZIZ(0, jCurrentTimeMillis2, true);
                            Context context2 = context;
                            if (context2 != null) {
                                a.install(context2);
                            } else {
                                C844470XAv.LIZ.getClass();
                                a.install(C844470XAv.LIZ());
                            }
                        }

                        @Override // X.InterfaceC842850X4p
                        public final void LIZ(int i, String str, boolean z) throws JSONException {
                            C842870X4r.LIZ.getClass();
                            C842870X4r.LIZIZ(i, -1L, false);
                        }
                    };
                    iPluginService.LJJI(new C202068144s(c844020X9c));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(int i, long j, boolean z) throws JSONException {
        FutureC842880X4s futureC842880X4s = LIZIZ;
        futureC842880X4s.LL = z;
        futureC842880X4s.LLILLJJLI = false;
        futureC842880X4s.LLILLL.release();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reason", i);
        jSONObject.put("install_duration", j);
        AppLogNewUtils.onEventV3("oppo_df_install_status", jSONObject);
    }
}
