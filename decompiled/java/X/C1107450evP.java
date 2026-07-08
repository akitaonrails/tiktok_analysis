package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0evP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107450evP extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ AbstractC1107400evK LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1107450evP(AbstractC1107400evK abstractC1107400evK, int i) {
        super(1);
        this.LL = abstractC1107400evK;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.LJI(1 << this.LLILLJJLI, bool.booleanValue());
        return Unit.LIZ;
    }
}
