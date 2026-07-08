package X;

import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896900zSi extends C09AY implements Function1<C1895120zPq, Unit> {
    public final /* synthetic */ SpecActPendantManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1896900zSi(SpecActPendantManager specActPendantManager) {
        super(1);
        this.LL = specActPendantManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1895120zPq c1895120zPq) {
        SpecActPendantManager specActPendantManager = this.LL;
        if (specActPendantManager.LL != null) {
            specActPendantManager.LJJIJ();
            specActPendantManager.LL = null;
        }
        return Unit.LIZ;
    }
}
