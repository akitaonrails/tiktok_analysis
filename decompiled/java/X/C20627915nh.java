package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20627915nh extends C09AY implements Function2<Float, Float, Unit> {
    public final /* synthetic */ AbstractC20628015ni LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20627915nh(AbstractC20628015ni abstractC20628015ni) {
        super(2);
        this.LL = abstractC20628015ni;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Float f, Float f2) {
        f2.floatValue();
        this.LL.invalidate();
        return Unit.LIZ;
    }
}
