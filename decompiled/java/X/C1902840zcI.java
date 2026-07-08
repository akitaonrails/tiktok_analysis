package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902840zcI {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final C01GW LJ;

    public C1902840zcI() {
        this(true, true);
    }

    public final boolean LIZ() {
        if (((Map) this.LJ.getValue()).isEmpty()) {
            return false;
        }
        if (this.LIZIZ) {
            String strLIZ = C1910990zpR.LIZIZ.LIZ();
            if (!Intrinsics.LJFF(strLIZ, this.LIZJ)) {
                this.LIZJ = strLIZ;
                ((Map) this.LJ.getValue()).clear();
                return false;
            }
        }
        if (!this.LIZ) {
            return true;
        }
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        if (Intrinsics.LJFF(curUserId, this.LIZLLL)) {
            return true;
        }
        this.LIZLLL = curUserId;
        ((Map) this.LJ.getValue()).clear();
        return false;
    }

    public C1902840zcI(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = C1910990zpR.LIZIZ.LIZ();
        this.LIZLLL = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        this.LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(515));
    }
}
