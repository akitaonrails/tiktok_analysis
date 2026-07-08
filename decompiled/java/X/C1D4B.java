package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1D4B, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C1D4B extends C2217421BqW implements Function2<Boolean, Function1<? super C1D82, ? extends Unit>, Unit> {
    public C1D4B(C1D80 c1d80) {
        super(2, c1d80, C1D80.class, "travel", "travel$wave_release(ZLkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Function1<? super C1D82, ? extends Unit> function1) {
        boolean zBooleanValue = bool.booleanValue();
        ((C1D80) this.receiver).LJIIIIZZ(function1, zBooleanValue);
        return Unit.LIZ;
    }
}
