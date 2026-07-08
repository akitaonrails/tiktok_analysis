package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ykx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883290Ykx extends C09AY implements Function1<EnumC883260Yku, Unit> {
    public final /* synthetic */ C883100Yke LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883290Ykx(C883100Yke c883100Yke) {
        super(1);
        this.LL = c883100Yke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC883260Yku enumC883260Yku) {
        this.LL.LJIILJJIL(new C883310Ykz(enumC883260Yku, 1));
        return Unit.LIZ;
    }
}
