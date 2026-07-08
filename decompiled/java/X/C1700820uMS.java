package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700820uMS extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1700890uMZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1700820uMS(C1700890uMZ c1700890uMZ) {
        super(1);
        this.LL = c1700890uMZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.LIZIZ.invoke(Boolean.TRUE);
        }
        return Unit.LIZ;
    }
}
