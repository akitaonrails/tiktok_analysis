package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ewl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108290ewl extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1108220ewe LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108290ewl(C1108220ewe c1108220ewe) {
        super(1);
        this.LL = c1108220ewe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.LIZ(bool.booleanValue());
        return Unit.LIZ;
    }
}
