package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03pR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.view.dialog.AddressMapLocationDialog$show$1$2$builder$1$2$2$1$1", f = "AddressMapLocationDialog.kt", l = {165}, m = "invokeSuspend")
public final class C961903pR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C961903pR(Address address, InterfaceC1364105Vn<? super C961903pR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C961903pR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressMapLocationDialog@cd26.show$1$2$builder$1$2$2$1$1");
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
            C980703sT c980703sT = AddressApi.LIZ;
            Address address = this.LLILLJJLI;
            Integer numLJ = C2286608xc.LJ(9);
            this.LL = 1;
            EnumC962003pS enumC962003pS = EnumC962003pS.DEFAULT;
            c980703sT.getClass();
            if (C980703sT.LJFF(address, 2, true, numLJ, null, enumC962003pS, this) == objLJFF) {
                C1C7U.LIZIZ("AddressMapLocationDialog@cd26.show$1$2$builder$1$2$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressMapLocationDialog@cd26.show$1$2$builder$1$2$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
