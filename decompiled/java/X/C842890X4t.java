package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Arrays;
import java.util.List;
import jv6.a;

/* JADX INFO: renamed from: X.0X4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842890X4t {
    public static boolean LIZIZ(boolean z, Runnable runnable) {
        if (ServiceManager.get().getService(IPluginService.class) == null) {
            return false;
        }
        if (!z) {
            return LIZ("com.ss.android.ugc.i18n.miniapp", Arrays.asList("com.ss.android.ugc.aweme.rn_kit"), runnable);
        }
        return LIZ("com.ss.android.ugc.i18n.miniapp_so", Arrays.asList("com.ss.android.ugc.aweme.rn_kit", "com.ss.android.ugc.i18n.miniapp"), runnable);
    }

    public static boolean LIZ(String str, List list, final Runnable runnable) {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService == null) {
            return false;
        }
        iPluginService.LJ();
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZ = str;
        c844020X9c.LIZIZ = false;
        c844020X9c.LIZLLL = new InterfaceC842850X4p(runnable) { // from class: X.09OM
            public final Runnable LIZ;

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str2, boolean z) {
            }

            {
                this.LIZ = runnable;
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str2, boolean z) {
                IPluginService iPluginService2 = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                if (iPluginService2 == null) {
                    return;
                }
                if (iPluginService2.LIZLLL() != null) {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    iPluginService2.LIZLLL().getClass();
                    a.install(contextLIZ);
                }
                Runnable runnable2 = this.LIZ;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
        anonymousClass1403.LIZ = true;
        anonymousClass1403.LIZIZ = true;
        anonymousClass1403.LIZJ = true;
        anonymousClass1403.LIZLLL = true;
        anonymousClass1403.LJFF = false;
        anonymousClass1403.LJIIIIZZ = list;
        c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
        iPluginService.LJJI(new C202068144s(c844020X9c));
        return true;
    }
}
