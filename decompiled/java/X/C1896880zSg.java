package X;

import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896880zSg extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ SpecActPendantManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1896880zSg(SpecActPendantManager specActPendantManager) {
        super(1);
        this.LL = specActPendantManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        l.longValue();
        SpecActPendantManager specActPendantManager = this.LL;
        specActPendantManager.LLJILJILJ = false;
        specActPendantManager.LLJILLL = false;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894690zP9 c1894690zP9 = C2178808gE.LIZ().LJII;
        if (specActPendantManager.LJIJJLI() && specActPendantManager.LL != null) {
            specActPendantManager.LJJIJ();
            specActPendantManager.LL = null;
        }
        specActPendantManager.LL = c1894690zP9;
        specActPendantManager.LJJ();
        this.LL.LJJIIJZLJL();
        return Unit.LIZ;
    }
}
