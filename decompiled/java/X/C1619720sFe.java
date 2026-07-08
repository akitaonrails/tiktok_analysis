package X;

import com.bytedance.touchpoint.api.config.IIncentiveManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0sFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619720sFe {
    public static volatile InterfaceC1897260zTI LIZIZ;
    public static final C1619720sFe LIZ = new C1619720sFe();
    public static volatile HashMap<Integer, C1879340z0O> LIZJ = new HashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5587));
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public final InterfaceC1897260zTI LIZIZ() {
        InterfaceC1897260zTI interfaceC1897260zTI;
        IIncentiveManager iIncentiveManager;
        if (!((Boolean) LIZLLL.getValue()).booleanValue()) {
            return LIZIZ;
        }
        synchronized (this) {
            try {
                if (!LJ.get() && (iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null)) != null) {
                    iIncentiveManager.LIZLLL();
                }
                interfaceC1897260zTI = LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC1897260zTI;
    }

    public final <T extends C1879340z0O> T LIZ(int i) {
        IIncentiveManager iIncentiveManager;
        T t = null;
        if (((Boolean) LIZLLL.getValue()).booleanValue()) {
            synchronized (this) {
                try {
                    if (!LJ.get() && (iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null)) != null) {
                        iIncentiveManager.LIZLLL();
                    }
                    C1879340z0O c1879340z0O = LIZJ.get(Integer.valueOf(i));
                    if (c1879340z0O instanceof C1879340z0O) {
                        t = (T) c1879340z0O;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return t;
        }
        C1879340z0O c1879340z0O2 = LIZJ.get(Integer.valueOf(i));
        if (!(c1879340z0O2 instanceof C1879340z0O)) {
            return null;
        }
        return (T) c1879340z0O2;
    }
}
