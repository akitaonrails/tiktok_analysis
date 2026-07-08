package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.record.ShootLinkPerfMobModel;
import com.ss.android.ugc.aweme.performance.IShootLinkPerfService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Ml2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577580Ml2 implements IShootLinkPerfService {
    public static final C577580Ml2 LIZ = new C577580Ml2();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(602));

    public static IShootLinkPerfService LIZ() {
        return (IShootLinkPerfService) LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final boolean LIZIZ() {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            return iShootLinkPerfServiceLIZ.LIZIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJI() {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            iShootLinkPerfServiceLIZ.LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final long LJIIIIZZ() {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            return iShootLinkPerfServiceLIZ.LJIIIIZZ();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void clear() {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            iShootLinkPerfServiceLIZ.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LIZLLL(long j) {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            iShootLinkPerfServiceLIZ.LIZLLL(j);
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJ(long j) {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            iShootLinkPerfServiceLIZ.LJ(j);
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJFF(ShootLinkPerfMobModel shootLinkPerfMobModel, Bundle bundle) {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            iShootLinkPerfServiceLIZ.LJFF(shootLinkPerfMobModel, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final Map<String, String> LIZJ(long j, List<String> list, List<Long> list2) {
        Map<String, String> mapLIZJ;
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ == null || (mapLIZJ = iShootLinkPerfServiceLIZ.LIZJ(j, list, list2)) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJII(long j, long j2, String str, String str2, String str3, String str4) {
        IShootLinkPerfService iShootLinkPerfServiceLIZ = LIZ();
        if (iShootLinkPerfServiceLIZ != null) {
            iShootLinkPerfServiceLIZ.LJII(j, j2, str, str2, str3, str4);
        }
    }
}
