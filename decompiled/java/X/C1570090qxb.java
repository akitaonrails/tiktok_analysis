package X;

import com.bytedance.android.live.walletnew.RechargeDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletnew.RechargeDialogNew$onProductLoadError$1", f = "RechargeDialogNew.kt", l = {1564}, m = "invokeSuspend")
public final class C1570090qxb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RechargeDialogNew LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570090qxb(RechargeDialogNew rechargeDialogNew, InterfaceC1364105Vn<? super C1570090qxb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargeDialogNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1570090qxb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeDialogNew@383d.onProductLoadError$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("RechargeDialogNew@383d.onProductLoadError$1");
                return objLJFF;
            }
        }
        InterfaceC1805160x4k interfaceC1805160x4k = this.LLILLJJLI.LLJZIJLIL;
        if (interfaceC1805160x4k == null) {
            interfaceC1805160x4k = null;
        }
        interfaceC1805160x4k.dismiss();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeDialogNew@383d.onProductLoadError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
