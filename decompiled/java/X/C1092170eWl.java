package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092170eWl extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1092150eWj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092170eWl(C1092150eWj c1092150eWj) {
        super(1);
        this.LL = c1092150eWj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.setEnableShow(!bool.booleanValue());
        return Unit.LIZ;
    }
}
