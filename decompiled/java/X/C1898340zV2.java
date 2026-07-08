package X;

import com.bytedance.touchpoint.core.pendant.BaseTouchPointManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898340zV2 extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ BaseTouchPointManager<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898340zV2(BaseTouchPointManager<T> baseTouchPointManager) {
        super(1);
        this.LL = baseTouchPointManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        l.longValue();
        BaseTouchPointManager<T> baseTouchPointManager = this.LL;
        baseTouchPointManager.LJJII(baseTouchPointManager.LJIIZILJ());
        BaseTouchPointManager<T> baseTouchPointManager2 = this.LL;
        baseTouchPointManager2.LJIL(baseTouchPointManager2.LJIIZILJ());
        return Unit.LIZ;
    }
}
