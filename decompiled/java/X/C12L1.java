package X;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12L1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12L1 extends C09AY implements Function1<WindowLayoutInfo, Unit> {
    public final /* synthetic */ C12L0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12L1(C12L0 c12l0) {
        super(1);
        this.LL = c12l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WindowLayoutInfo windowLayoutInfo) {
        this.LL.accept(windowLayoutInfo);
        return Unit.LIZ;
    }
}
