package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20628915nr extends C09AY implements Function2<Boolean, Boolean, Unit> {
    public final /* synthetic */ AbstractC20628015ni LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20628915nr(AbstractC20628015ni abstractC20628015ni) {
        super(2);
        this.LL = abstractC20628015ni;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Boolean bool2) {
        bool2.booleanValue();
        this.LL.requestLayout();
        return Unit.LIZ;
    }
}
