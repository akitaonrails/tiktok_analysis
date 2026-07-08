package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1AabService;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchTop1AabServiceDefaultImpl;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0QG1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QG1 {
    public static final C0QG1 LIZ = new C0QG1();
    public static volatile ISearchTop1AabService LIZIZ = LIZ(true);

    public static ISearchTop1AabService LIZ(boolean z) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            try {
                c098200Yq = (ISearchTop1AabService) PluggableExtentionKt.pluggableSpi$default(ISearchTop1AabService.class, false, false, false, 14, null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            ISearchTop1AabService iSearchTop1AabService = (ISearchTop1AabService) c098200Yq;
            if (iSearchTop1AabService != null) {
                try {
                    c098200Yq2 = Boolean.valueOf(iSearchTop1AabService.LIZ());
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = bool;
                }
                if (((Boolean) c098200Yq2).booleanValue()) {
                    return iSearchTop1AabService;
                }
            }
            if (z) {
                try {
                    C673090Qah.LIZIZ.LIZ();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
            return new SearchTop1AabServiceDefaultImpl();
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            return new SearchTop1AabServiceDefaultImpl();
        }
    }
}
