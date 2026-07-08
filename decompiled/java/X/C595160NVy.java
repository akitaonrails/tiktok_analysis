package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
public final class C595160NVy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC20072513gJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595160NVy(AbstractC20072513gJ abstractC20072513gJ, InterfaceC1364105Vn<? super C595160NVy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC20072513gJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595160NVy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC20072513gJ abstractC20072513gJ = this.LL;
        if (abstractC20072513gJ.LLJJLIIIJLLLLLLLZ == null) {
            C595170NVz c595170NVz = new C595170NVz();
            InterfaceC595010NVj interfaceC595010NVj = abstractC20072513gJ.LLJJIII;
            if (interfaceC595010NVj != null) {
                C23250099c.LIZLLL(abstractC20072513gJ.LLILLIZIL(), null, null, new C594990NVh(interfaceC595010NVj, c595170NVz, null), 3);
            }
            abstractC20072513gJ.LLJJLIIIJLLLLLLLZ = c595170NVz;
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
