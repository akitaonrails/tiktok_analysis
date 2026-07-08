package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.minis.exp.MinisPreloadPerformanceData;
import java.util.List;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1AyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196741AyG {
    public final EnumC2196771AyJ LIZ;
    public final List<String> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 179));

    public final C2196751AyH LJFF() {
        return (C2196751AyH) this.LIZJ.getValue();
    }

    public final void LJI() {
        InterfaceC2196861AyS interfaceC2196861AySXm;
        IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        if (iMinisApiService == null || (interfaceC2196861AySXm = iMinisApiService.xm()) == null) {
            return;
        }
        interfaceC2196861AySXm.LIZ(this.LIZ, LJFF());
    }

    public final void LIZIZ() {
        LJFF().LJIIIIZZ = true;
    }

    public final void LIZJ() {
        LJFF().LJFF = true;
    }

    public final void LJ() {
        LJFF().LJI = true;
    }

    public final void LIZ(MinisPreloadPerformanceData minisPreloadPerformanceData) {
        LJFF().LJIIJ = minisPreloadPerformanceData;
    }

    public final void LIZLLL(C1024540clg c1024540clg) {
        LJFF().LJII = true;
        LJFF().LJIIIZ = c1024540clg;
    }

    public C2196741AyG(EnumC2196771AyJ enumC2196771AyJ, List<String> list) {
        this.LIZ = enumC2196771AyJ;
        this.LIZIZ = list;
    }
}
