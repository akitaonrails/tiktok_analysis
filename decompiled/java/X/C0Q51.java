package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchInitTaskPreConnectForImageExp;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Q51, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q51 {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile ScheduledFuture<?> LIZLLL;
    public static final C0Q51 LIZ = new C0Q51();
    public static final AtomicLong LJ = new AtomicLong(0);
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static volatile EnumC325100Com LJI = EnumC325100Com.STRONG;
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(554));

    public static final int LIZ() {
        Object c098200Yq;
        EnumC325100Com enumC325100Com;
        LIZ.getClass();
        if (LIZJ) {
            enumC325100Com = LJI;
        } else {
            try {
                c098200Yq = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            EnumC325100Com enumC325100Com2 = LJI;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = enumC325100Com2;
            }
            enumC325100Com = (EnumC325100Com) c098200Yq;
            LJI = enumC325100Com;
        }
        int i = C325380CpE.LIZ[enumC325100Com.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }

    public static void LIZIZ() {
        if (!LJFF.compareAndSet(false, true) || SearchInitTaskPreConnectForImageExp.LIZ() <= 0) {
            return;
        }
        Long l = ((SearchInitTaskPreConnectForImageExp.Config) SearchInitTaskPreConnectForImageExp.LIZIZ.getValue()).delay;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                C823050WQl.LJ().schedule(new Runnable() { // from class: X.0PQ8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchNetworkControl@69b7.preloadImageUrl$1");
                        try {
                            C0Q51.LIZJ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchNetworkControl@69b7.preloadImageUrl$1");
                    }
                }, jLongValue, TimeUnit.MILLISECONDS);
            }
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0PQ9
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchNetworkControl@69b7.preloadImageUrl$2");
                try {
                    C0Q51.LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchNetworkControl@69b7.preloadImageUrl$2");
            }
        });
    }

    public static final void LIZJ() {
        Object c098200Yq;
        String str = ((SearchInitTaskPreConnectForImageExp.Config) SearchInitTaskPreConnectForImageExp.LIZIZ.getValue()).domainList;
        if (str != null) {
            Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6).iterator();
            while (it2.hasNext()) {
                try {
                    TTNetInit.preconnectUrl((String) it2.next());
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m8isSuccessimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        }
    }
}
