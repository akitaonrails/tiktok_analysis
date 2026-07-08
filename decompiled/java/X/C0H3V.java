package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H3V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment$initSubscribe$21$1", f = "AddressEditFragment.kt", l = {1069}, m = "invokeSuspend")
public final class C0H3V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressEditFragment LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H3V(AddressEditFragment addressEditFragment, C118300cf c118300cf, InterfaceC1364105Vn<? super C0H3V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressEditFragment;
        this.LLILLL = c118300cf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H3V(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressEditFragment@d406.initSubscribe$21$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C450740Hlw c450740HlwGS = this.LLILLJJLI.gS();
            this.LL = 1;
            if (C0H1U.LJ(c450740HlwGS, this, false) == objLJFF) {
                C1C7U.LIZIZ("AddressEditFragment@d406.initSubscribe$21$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.gS().smoothScrollToPosition(this.LLILLL.element);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditFragment@d406.initSubscribe$21$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
