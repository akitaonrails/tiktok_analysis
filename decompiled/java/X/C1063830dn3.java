package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063830dn3 {
    public static void LIZ() {
        IBulletHostProxy iBulletHostProxy;
        HashMap<Class<?>, HashMap<String, Class<?>>> mapLJ;
        C1063810dn1 c1063810dn1 = new C1063810dn1();
        LIZIZ();
        if (!C1544000qHW.LJIIZILJ && (iBulletHostProxy = C1063840dn4.LIZIZ) != null && (mapLJ = iBulletHostProxy.LJ()) != null) {
            c1063810dn1.LIZLLL(mapLJ);
        }
        C1543410qGZ.LJIIJJI = c1063810dn1;
        C1063910dnB.LIZ(Boolean.TRUE, "jsb_tt_bridge_factory_manager_init");
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJJJ();
            iSparkHostApi.LJJJJI();
        }
        C1063910dnB.LIZ("true", "jsb_tt_init_optimize_settings_1");
        C1063910dnB.LIZ("true", "jsb_tt_init_bridgeFactoryManager_finish");
    }

    public static void LIZIZ() {
        Object c098200Yq;
        if (C1063840dn4.LIZIZ != null) {
            return;
        }
        try {
            C1063840dn4.LIZIZ = (IBulletHostProxy) PluggableExtentionKt.pluggableSpi$default(IBulletHostProxy.class, false, false, false, 14, null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1063910dnB.LIZ(C1063840dn4.LIZIZ, "jsb_tt_init_bullet_host_proxy");
        C1063910dnB.LIZ(C189200o6.m9toStringimpl(c098200Yq), "jsb_tt_init_bullet_host_proxy_result");
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            System.out.println((Object) ("registerIBridges fail with " + ((Object) C189200o6.m9toStringimpl(c098200Yq))));
        }
    }
}
