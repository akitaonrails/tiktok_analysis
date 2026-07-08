package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.IIMCreativeCameraService;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702560uPG implements IIMCreativeCameraService {
    public static volatile IIMCreativeCameraService LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile long LJ;
    public static final C1702560uPG LIZ = new C1702560uPG();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(354));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3357));

    public static IIMCreativeCameraService LIZIZ() {
        Object c098200Yq;
        try {
            final Class<?> cls = Class.forName("com.ss.android.ugc.aweme.im.creative.common.impl.framework.IMCreativeCameraServiceImpl");
            ServiceManager.get().bind(IIMCreativeCameraService.class, new ServiceProvider() { // from class: X.0uPH
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return cls.newInstance();
                }
            }).asSingleton();
            c098200Yq = (IIMCreativeCameraService) PluggableExtentionKt.pluggableSpi$default(IIMCreativeCameraService.class, false, false, false, 14, null);
            if (c098200Yq == null || c098200Yq == LIZJ()) {
                LJ = SystemClock.elapsedRealtime();
                c098200Yq = LIZJ();
            } else {
                LJ = 0L;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LJ = SystemClock.elapsedRealtime();
        }
        C1702550uPF c1702550uPFLIZJ = LIZJ();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c1702550uPFLIZJ;
        }
        return (IIMCreativeCameraService) c098200Yq;
    }

    public static C1702550uPF LIZJ() {
        return (C1702550uPF) LIZIZ.getValue();
    }

    public static IIMCreativeCameraService LIZLLL() {
        IIMCreativeCameraService iIMCreativeCameraService = (IIMCreativeCameraService) PluggableExtentionKt.pluggableSpiForReal(IIMCreativeCameraService.class);
        if (iIMCreativeCameraService != null) {
            return iIMCreativeCameraService;
        }
        long j = LJ;
        if (j != 0 && SystemClock.elapsedRealtime() - j < 30000) {
            return LIZJ();
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return LIZIZ();
        }
        if (!LIZLLL) {
            LIZLLL = true;
            C23250099c.LIZLLL((InterfaceC497601wk) LJFF.getValue(), null, null, new C1702540uPE(null), 3);
        }
        return LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.creative.common.api.navigation.IIMCreativeCameraService
    public final boolean LIZ(Context context, Bundle bundle) {
        IIMCreativeCameraService iIMCreativeCameraServiceLIZLLL = LIZJ;
        if (iIMCreativeCameraServiceLIZLLL == null && (iIMCreativeCameraServiceLIZLLL = LIZLLL()) != LIZJ()) {
            LIZJ = iIMCreativeCameraServiceLIZLLL;
        }
        return iIMCreativeCameraServiceLIZLLL.LIZ(context, bundle);
    }
}
