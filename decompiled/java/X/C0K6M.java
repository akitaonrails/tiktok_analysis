package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService;
import com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.PGCSubsServiceImpl;
import java.util.Map;

/* JADX INFO: renamed from: X.0K6M, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6M {
    public static final C0K6N LIZ = new C0K6O() { // from class: X.0K6N
        @Override // X.C0K6O
        public final void LIZ(FragmentManager fragmentManager, String str, EnumC513420KBo enumC513420KBo) {
        }

        @Override // X.C0K6O
        public final void LIZIZ(FragmentManager fragmentManager, C0KCC c0kcc, Map<String, String> map, LifecycleOwner lifecycleOwner) {
        }

        @Override // X.C0K6O
        public final void LIZJ(Context context, Map map, Map map2, Map map3, Map map4, Map map5, C0KOP c0kop, C0KR6 c0kr6) {
        }

        @Override // X.C0K6O
        public final void LIZLLL(FragmentManager fragmentManager, C0KCC c0kcc, Map<String, String> map) {
        }

        @Override // X.C0K6O
        public final boolean isAvailable() {
            return false;
        }
    };

    public static final C0K6O LIZ() {
        Object c098200Yq;
        Object objLIZJ;
        try {
            c098200Yq = PGCSubsServiceImpl.LJIIIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PGCSubsService pGCSubsService = (PGCSubsService) c098200Yq;
        if (pGCSubsService != null) {
            try {
                objLIZJ = pGCSubsService.LIZJ();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                objLIZJ = new C098200Yq(th2);
                C189200o6.m2constructorimpl(objLIZJ);
            }
        } else {
            objLIZJ = null;
        }
        C189200o6.m2constructorimpl(objLIZJ);
        C0K6O c0k6o = (C0K6O) (C189200o6.m7isFailureimpl(objLIZJ) ? null : objLIZJ);
        if (c0k6o == null) {
            return LIZ;
        }
        c0k6o.isAvailable();
        return c0k6o;
    }
}
