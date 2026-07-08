package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ex2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108460ex2 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ AbstractC1108380ewu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108460ex2(AbstractC1108380ewu abstractC1108380ewu) {
        super(1);
        this.LL = abstractC1108380ewu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.LJIIJJI(bool.booleanValue(), 16384, EnumC1108060ewO.HIGH_PRIORITY_SLOT);
        return Unit.LIZ;
    }
}
