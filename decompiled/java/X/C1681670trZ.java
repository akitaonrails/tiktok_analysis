package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0trZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681670trZ extends C09AY implements Function1<InterfaceC1679550to9, Unit> {
    public final /* synthetic */ Function0<Float> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681670trZ(Function0<Float> function0) {
        super(1);
        this.LL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1679550to9 interfaceC1679550to9) {
        interfaceC1679550to9.setAlpha(C13LZ.LIZLLL(this.LL.invoke().floatValue() * 4.0f, 0.0f, 1.0f));
        return Unit.LIZ;
    }
}
