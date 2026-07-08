package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$clickAddAddressForResult$2", f = "IAddressListViewModel.kt", l = {597}, m = "invokeSuspend")
public final class C976003ri extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC975703rf LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ InterfaceC1748810vbr LLILZ;
    public final /* synthetic */ Function1<AddressPageStarter.AddressEvent, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C976003ri(InterfaceC975703rf interfaceC975703rf, Activity activity, InterfaceC1748810vbr interfaceC1748810vbr, Function1<? super AddressPageStarter.AddressEvent, Unit> function1, InterfaceC1364105Vn<? super C976003ri> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC975703rf;
        this.LLILLL = activity;
        this.LLILZ = interfaceC1748810vbr;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C976003ri(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAddressListViewModel@9425.clickAddAddressForResult$2");
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
            InterfaceC975703rf interfaceC975703rf = this.LLILLJJLI;
            C975903rh c975903rh = new C975903rh(interfaceC975703rf, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = interfaceC975703rf.eF0(this, c975903rh);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IAddressListViewModel@9425.clickAddAddressForResult$2");
                return objLJFF;
            }
        }
        AddressPageStarter.AddressEvent addressEvent = (AddressPageStarter.AddressEvent) obj;
        if (addressEvent != null) {
            Function1<AddressPageStarter.AddressEvent, Unit> function1 = this.LLILZIL;
            int i2 = addressEvent.type;
            if (!Intrinsics.LJFF(addressEvent.addressId, CardStruct.IStatusCode.DEFAULT) && C123100dR.LIZ(addressEvent.addressId) && i2 == 0 && function1 != null) {
                function1.invoke(addressEvent);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAddressListViewModel@9425.clickAddAddressForResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
