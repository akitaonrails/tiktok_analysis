package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912370zrf {
    public static final C1912370zrf LIZ = new C1912370zrf();
    public static WeakReference<InterfaceC1912570zrz> LIZIZ;
    public static final MutableLiveData<Boolean> LIZJ;
    public static final MutableLiveData LIZLLL;
    public static InterfaceC1912580zs0 LJ;
    public static final List<Function1<Boolean, Unit>> LJFF;
    public static boolean LJI;

    static {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        LIZJ = mutableLiveData;
        LIZLLL = mutableLiveData;
        LJFF = new ArrayList();
    }

    public static void LIZIZ() {
        C1911410zq7.LIZ("NUJR_Slogan", "enter completeConsentComponent");
        Object obj = LJ;
        if (obj != null && (obj instanceof C1912530zrv)) {
            C1911410zq7.LIZ("NUJR_Slogan", "completeConsentComponent toNextPage");
            ((C10P5) obj).LJ();
            LJ = null;
            LJFF();
        }
    }

    public static void LIZJ() {
        C1911410zq7.LIZ("NUJR_Slogan", "onConsentBoxApproved: notifying waiting components");
        LJI = true;
        Iterator it2 = ((ArrayList) LJFF).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Boolean.TRUE);
        }
        ((ArrayList) LJFF).clear();
    }

    public static boolean LJ() {
        try {
            C1911490zqF.LIZ.getClass();
            boolean zLIZ = C1911490zqF.LIZ();
            EnumC1911450zqB enumC1911450zqB = (EnumC1911450zqB) C1911470zqD.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldWaitForConsentBox: isTreatment = ");
            sbLIZ.append(zLIZ);
            sbLIZ.append(", currentMode = ");
            sbLIZ.append(enumC1911450zqB);
            C1911410zq7.LIZ("NUJR_Slogan", C2188811AlT.LIZIZ(sbLIZ));
            if (LIZLLL() && zLIZ) {
                return enumC1911450zqB == EnumC1911450zqB.DEFAULT;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error checking experiment config: ");
            sbLIZ2.append(e.getMessage());
            C1911410zq7.LIZIZ("NUJR_Slogan", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    public static void LJFF() {
        InterfaceC1912580zs0 interfaceC1912580zs0 = LJ;
        boolean z = interfaceC1912580zs0 != null && (interfaceC1912580zs0 instanceof C1912530zrv);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateConsentComponentReadyState: ");
        sbLIZ.append(z);
        C1911410zq7.LIZ("NUJR_Slogan", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ.postValue(Boolean.valueOf(z));
    }

    public static boolean LIZLLL() {
        if (Intrinsics.LJFF("HU", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase())) {
            return false;
        }
        C19233810Mm.LIZ.getClass();
        if (!Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            return ComplianceServiceProvider.LJJIII().LJ();
        }
        C1911410zq7.LIZ("NUJR_Slogan", "skip consent page in Slogan");
        return false;
    }

    public static void LIZ(InterfaceC1912580zs0 interfaceC1912580zs0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindSloganComponent: component: ");
        sbLIZ.append(interfaceC1912580zs0);
        C1911410zq7.LIZ("NUJR_Slogan", C2188811AlT.LIZIZ(sbLIZ));
        LJ = interfaceC1912580zs0;
        LJFF();
    }
}
