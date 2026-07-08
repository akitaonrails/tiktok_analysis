package X;

import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zQI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895400zQI extends C09AY implements Function1<Long, Unit> {
    public C1895400zQI() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        l.longValue();
        C1895550zQX c1895550zQX = C1895550zQX.LL;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List listLJFF = C2178808gE.LIZ().LJFF(11);
        c1895550zQX.getClass();
        C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
        if (C1894330zOZ.LIZ().LJIIJJI().isBound()) {
            C1895550zQX.LLILLJJLI = C1894330zOZ.LIZ();
        }
        if ((listLJFF != null && !listLJFF.isEmpty()) || C2178808gE.LIZ().LJII != null) {
            for (InterfaceC1895240zQ2 interfaceC1895240zQ2 : C1895550zQX.LLILZ) {
                C01GW<SpecActPendantManager> c01gw3 = SpecActPendantManager.LLJJIJIIJIL;
                C1894330zOZ.LIZ();
                interfaceC1895240zQ2.LJFF(listLJFF);
            }
            C1895550zQX.LLILLL = true;
            SpecActPendantManager specActPendantManager = C1895550zQX.LLILLJJLI;
            if (specActPendantManager != null) {
                specActPendantManager.LJJIFFI();
            }
        }
        return Unit.LIZ;
    }
}
