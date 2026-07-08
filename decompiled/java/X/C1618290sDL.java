package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0sDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618290sDL {
    public static final C1618290sDL LIZ = new C1618290sDL();

    public static boolean LIZJ() {
        boolean zVp = false;
        try {
            Object objLIZIZ = LIZIZ();
            if ((objLIZIZ instanceof InterfaceC1603190roz) && (((InterfaceC1603190roz) objLIZIZ).getCurFragment() instanceof InterfaceC1593630rZZ)) {
                C128Y curFragment = ((InterfaceC1603190roz) objLIZIZ).getCurFragment();
                if (curFragment == null) {
                    return false;
                }
                zVp = ((InterfaceC1593630rZZ) curFragment).Vp();
                return zVp;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zVp;
    }

    public static boolean LIZLLL() {
        boolean zIk = false;
        try {
            Object objLIZIZ = LIZIZ();
            if ((objLIZIZ instanceof InterfaceC1603190roz) && (((InterfaceC1603190roz) objLIZIZ).getCurFragment() instanceof InterfaceC1593630rZZ)) {
                C128Y curFragment = ((InterfaceC1603190roz) objLIZIZ).getCurFragment();
                if (curFragment == null) {
                    return false;
                }
                zIk = ((InterfaceC1593630rZZ) curFragment).Ik();
                return zIk;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zIk;
    }

    public static boolean LJ() {
        try {
            Object objLIZIZ = LIZIZ();
            if (objLIZIZ instanceof InterfaceC1603190roz) {
                if (((InterfaceC1603190roz) objLIZIZ).getCurFragment() instanceof InterfaceC1593630rZZ) {
                    C128Y curFragment = ((InterfaceC1603190roz) objLIZIZ).getCurFragment();
                    if (curFragment != null) {
                        return ((InterfaceC1593630rZZ) curFragment).UH();
                    }
                    return false;
                }
                Fragment curFragment2 = ((InterfaceC1603190roz) objLIZIZ).getCurFragment();
                if (curFragment2 != null) {
                    return ((INearbyFeedService) ServiceManager.get().getService(INearbyFeedService.class)).LIZIZ(curFragment2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static boolean LJFF() {
        boolean zTQ = false;
        try {
            Object objLIZIZ = LIZIZ();
            if ((objLIZIZ instanceof InterfaceC1603190roz) && (((InterfaceC1603190roz) objLIZIZ).getCurFragment() instanceof InterfaceC1593630rZZ)) {
                C128Y curFragment = ((InterfaceC1603190roz) objLIZIZ).getCurFragment();
                if (curFragment == null) {
                    return false;
                }
                zTQ = ((InterfaceC1593630rZZ) curFragment).tQ();
                return zTQ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zTQ;
    }

    public static String LIZ() {
        return (String) C01U6.LJ(AFwS213S0000000_24.get$arr$(548), "others");
    }

    public static Object LIZIZ() {
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            return abstractC1387200mCcLJ.LIZ;
        }
        return null;
    }
}
