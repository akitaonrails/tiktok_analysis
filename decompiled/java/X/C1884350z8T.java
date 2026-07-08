package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884350z8T extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1884300z8O LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884350z8T(C1884300z8O c1884300z8O) {
        super(0);
        this.LL = c1884300z8O;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.showLoading();
        this.LL.notifyClickRetry();
        return Unit.LIZ;
    }
}
