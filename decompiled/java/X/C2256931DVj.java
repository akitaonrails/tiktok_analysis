package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy;

/* JADX INFO: renamed from: X.1DVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256931DVj {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        ICreativePathServiceProxy iCreativePathServiceProxyCreativePathServiceProxy = DMPublishService.INSTANCE.creativePathServiceProxy();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iCreativePathServiceProxyCreativePathServiceProxy.getCacheRoot());
            sbLIZ.append(str);
            C2260008tK.LJ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(iCreativePathServiceProxyCreativePathServiceProxy.getCreativeRoot());
            sbLIZ2.append(str);
            C2260008tK.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(iCreativePathServiceProxyCreativePathServiceProxy.getPersistentRoot());
            sbLIZ3.append(str);
            C2260008tK.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
