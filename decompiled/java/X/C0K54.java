package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService;
import com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.PGCSubsServiceImpl;
import java.util.Map;

/* JADX INFO: renamed from: X.0K54, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K54 {
    public static final C511640K4s LIZ = new InterfaceC511460K4a() { // from class: X.0K4s
        @Override // X.InterfaceC511460K4a
        public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
            return false;
        }

        @Override // X.InterfaceC511460K4a
        public final boolean LIZIZ(Context context, String str, Map<String, String> map) {
            return false;
        }

        @Override // X.InterfaceC511460K4a
        public final boolean LIZJ(Context context, String str, Map<String, String> map) {
            return false;
        }

        @Override // X.InterfaceC511460K4a
        public final boolean LIZLLL(Context context, String str, Map<String, String> map) {
            return false;
        }

        @Override // X.InterfaceC511460K4a
        public final boolean LJ(Context context, String str, Map<String, String> map) {
            return false;
        }

        @Override // X.InterfaceC511460K4a
        public final boolean isAvailable() {
            return true;
        }

        @Override // X.InterfaceC511460K4a
        public final boolean LJI(Context context, Map map) {
            return C511630K4r.LIZLLL(this, context, map);
        }

        @Override // X.InterfaceC511460K4a
        public final boolean LJFF(Context context, long j, Map map) {
            return C511630K4r.LIZJ(this, context, j, map);
        }
    };

    public static final InterfaceC511460K4a LIZ() {
        Object c098200Yq;
        Object objLJI;
        Object objLJFF;
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
                objLJI = pGCSubsService.LJI();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                objLJI = new C098200Yq(th2);
                C189200o6.m2constructorimpl(objLJI);
            }
        } else {
            objLJI = null;
        }
        C189200o6.m2constructorimpl(objLJI);
        if (C189200o6.m7isFailureimpl(objLJI)) {
            objLJI = null;
        }
        InterfaceC511460K4a interfaceC511460K4a = (InterfaceC511460K4a) objLJI;
        if (pGCSubsService != null) {
            try {
                objLJFF = pGCSubsService.LJFF();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                objLJFF = new C098200Yq(th3);
                C189200o6.m2constructorimpl(objLJFF);
            }
        } else {
            objLJFF = null;
        }
        C189200o6.m2constructorimpl(objLJFF);
        InterfaceC511460K4a interfaceC511460K4a2 = (InterfaceC511460K4a) (C189200o6.m7isFailureimpl(objLJFF) ? null : objLJFF);
        boolean zBooleanValue = ((Boolean) C105400aa.LIZ.getValue()).booleanValue();
        C511640K4s c511640K4s = LIZ;
        if (!zBooleanValue) {
            return interfaceC511460K4a2 == null ? interfaceC511460K4a == null ? c511640K4s : interfaceC511460K4a : interfaceC511460K4a2;
        }
        if (interfaceC511460K4a == null || !interfaceC511460K4a.isAvailable()) {
            if (interfaceC511460K4a2 == null || !interfaceC511460K4a2.isAvailable()) {
                if (interfaceC511460K4a == null) {
                    if (interfaceC511460K4a2 == null) {
                        return c511640K4s;
                    }
                }
            }
            return interfaceC511460K4a2;
        }
        return interfaceC511460K4a;
    }
}
