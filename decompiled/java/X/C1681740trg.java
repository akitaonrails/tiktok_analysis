package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0trg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681740trg extends C09AY implements Function1<InterfaceC1679550to9, Unit> {
    public final /* synthetic */ C05P0<Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681740trg(C05P0<Boolean> c05p0) {
        super(1);
        this.LL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1679550to9 interfaceC1679550to9) {
        float f;
        InterfaceC1679550to9 interfaceC1679550to92 = interfaceC1679550to9;
        if (this.LL.getValue().booleanValue()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        interfaceC1679550to92.setAlpha(f);
        return Unit.LIZ;
    }
}
