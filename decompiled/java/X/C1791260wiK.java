package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0wiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791260wiK {
    public static final /* synthetic */ int LIZJ = 0;
    public final IMinisRevisitMissionService LIZ;
    public final Function0<C1781340wSK> LIZIZ;

    public C1791260wiK(IMinisRevisitMissionService iMinisRevisitMissionService, int i) {
        AFwS216S0000000_27 aFwS216S0000000_27;
        iMinisRevisitMissionService = (i & 1) != 0 ? (IMinisRevisitMissionService) PluggableExtentionKt.pluggableSpi$default(IMinisRevisitMissionService.class, false, false, false, 14, null) : iMinisRevisitMissionService;
        if ((i & 2) != 0) {
            aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(285);
        } else {
            aFwS216S0000000_27 = null;
        }
        this.LIZ = iMinisRevisitMissionService;
        this.LIZIZ = aFwS216S0000000_27;
    }
}
