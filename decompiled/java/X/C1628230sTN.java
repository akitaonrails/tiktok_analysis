package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1628230sTN extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1628230sTN(AbstractC1628090sT9 abstractC1628090sT9) {
        super(1, abstractC1628090sT9, AbstractC1628090sT9.class, "onVisibilityChanged", "onVisibilityChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((AbstractC1628090sT9) this.receiver).onVisibilityChanged(bool.booleanValue());
        return Unit.LIZ;
    }
}
