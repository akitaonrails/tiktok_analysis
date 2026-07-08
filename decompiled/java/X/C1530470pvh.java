package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0pvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530470pvh {
    public static final long LIZ(Uri uri) {
        String str;
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        boolean z;
        long jLongValue = -1;
        if (uri == null) {
            return -1L;
        }
        try {
            try {
                String strLIZIZ = C1942307jB.LIZIZ(uri, "surl");
                if ((strLIZIZ == null || strLIZIZ.length() == 0) && (strLIZIZ = C1942307jB.LIZIZ(uri, "url")) == null) {
                    strLIZIZ = "";
                }
                try {
                    strLIZIZ = URLDecoder.decode(strLIZIZ, StandardCharsets.UTF_8.name());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1533720q0w.LIZ.getClass();
                String name = null;
                C1533510q0b c1533510q0bLIZLLL = C1533720q0w.LIZLLL(strLIZIZ, null, true);
                if (c1533510q0bLIZLLL == null || (str = c1533510q0bLIZLLL.LIZIZ) == null) {
                    str = "null_channel";
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IHybridDependencyService.class.getName();
                    if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                }
                IHybridDependencyService iHybridDependencyService = (IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
                Long latestChannelVersion = iHybridDependencyService.getLatestChannelVersion(iHybridDependencyService.geckoXRootDir(), iHybridDependencyService.getAccessKey(), str);
                if (latestChannelVersion == null) {
                    return -1L;
                }
                jLongValue = latestChannelVersion.longValue();
                return jLongValue;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return jLongValue;
            }
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        }
    }
}
