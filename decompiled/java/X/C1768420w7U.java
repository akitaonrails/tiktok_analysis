package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0w7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768420w7U {
    public static final C01GW<Double> LJIIIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(543));
    public static final C01GW<IAccountDependencyService> LJIIJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1411));
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final double LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final Map<String, Object> LJIIIIZZ;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768420w7U.LIZ():boolean");
    }

    public final boolean LIZIZ() {
        if (this.LJ <= 0.0d) {
            return true;
        }
        C01GW<Double> c01gw = LJIIIZ;
        return c01gw.getValue().doubleValue() <= 0.0d || c01gw.getValue().doubleValue() >= this.LJ;
    }

    public final boolean LIZJ() {
        IECommerceHostService iECommerceHostService;
        if (this.LJI < 0) {
            return true;
        }
        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("networkLevel: ");
            sbLIZ.append(effectiveConnectionType);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MixMall", strLIZIZ);
        }
        return effectiveConnectionType >= this.LJI;
    }

    public final boolean LIZLLL(Context context) {
        int i;
        if (this.LJFF != 1) {
            return true;
        }
        EnumC804620VhM enumC804620VhMLJ = C804420Vh2.LJ(context);
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("networkType: ");
        sbLIZ.append(enumC804620VhMLJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MixMall", strLIZIZ);
        if (enumC804620VhMLJ != null && ((i = C804630VhN.LIZ[enumC804620VhMLJ.ordinal()]) == 1 || i == 2 || i == 3)) {
            return true;
        }
        return false;
    }

    public C1768420w7U(int i, int i2, int i3, int i4, double d, int i5, int i6, int i7, Map map) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = d;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = map;
    }
}
