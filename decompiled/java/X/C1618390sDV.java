package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sDV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618390sDV {
    public static final C1618390sDV LIZ = new C1618390sDV();

    public static boolean LIZ(Context context) {
        C19EG c19egLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C19EG c19egLIZIZ2;
        MainActivityScope mainActivityScopeLIZJ2;
        HomeTabAbility homeTabAbilityLIZ2;
        try {
            if (((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTab()) {
                if (context == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) == null || (mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egLIZIZ2)) == null || (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null || !homeTabAbilityLIZ2.zd1()) {
                    return false;
                }
                return true;
            }
            if (!((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTopTab() || context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null || !homeTabAbilityLIZ.dR("Shop")) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public static boolean LIZIZ(Context context) {
        C19EG c19egLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        try {
            if (((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTopTab() && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                if (homeTabAbilityLIZ.dR("Shop")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        try {
            C1618390sDV c1618390sDV = LIZ;
            Uri uri = UriProtector.parse(str);
            c1618390sDV.getClass();
            if (uri == null) {
                return false;
            }
            try {
                String path = uri.getPath();
                if (Intrinsics.LJFF("ec", uri.getHost())) {
                    if (Intrinsics.LJFF("/mall", path)) {
                        return true;
                    }
                    if (Intrinsics.LJFF("/fashion_mall", path)) {
                        return true;
                    }
                }
                return false;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return false;
            }
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return false;
        }
    }
}
