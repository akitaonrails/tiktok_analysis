package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821110xUT extends C09AY implements Function1<C1820790xTx, Unit> {
    public final /* synthetic */ OneStopPageVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821110xUT(OneStopPageVM oneStopPageVM) {
        super(1);
        this.LL = oneStopPageVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1820790xTx c1820790xTx) {
        this.LL.setState(new C1821120xUU());
        return Unit.LIZ;
    }
}
