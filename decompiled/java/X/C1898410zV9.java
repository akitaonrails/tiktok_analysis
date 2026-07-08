package X;

import com.bytedance.touchpoint.core.pendant.BaseTouchPointManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898410zV9 extends C09AY implements Function1<C1895120zPq, Unit> {
    public final /* synthetic */ BaseTouchPointManager<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898410zV9(BaseTouchPointManager<T> baseTouchPointManager) {
        super(1);
        this.LL = baseTouchPointManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1895120zPq c1895120zPq) {
        this.LL.LJIILIIL();
        return Unit.LIZ;
    }
}
