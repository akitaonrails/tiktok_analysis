package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.03t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$changeOnOrder$2", f = "AddressEditViewModel.kt", l = {3517}, m = "invokeSuspend")
public final class C984003t0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ Address LLILZ;
    public final /* synthetic */ AddressEditViewModel LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C984003t0(Integer num, C259800zU<String> c259800zU, Address address, AddressEditViewModel addressEditViewModel, long j, InterfaceC1364105Vn<? super C984003t0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = c259800zU;
        this.LLILZ = address;
        this.LLILZIL = addressEditViewModel;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C984003t0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressEditViewModel@7f24.changeOnOrder$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C980703sT c980703sT = AddressApi.LIZ;
                Integer num = this.LLILLJJLI;
                String str = this.LLILLL.element;
                Address address = this.LLILZ;
                this.LL = 1;
                obj = C980703sT.LIZ(c980703sT, num, str, "", null, null, address, null, null, null, this, 472);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressEditViewModel@7f24.changeOnOrder$2");
                    return objLJFF;
                }
            }
            this.LLILZIL.CR2((Response) obj, this.LLILZLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR62, e, null);
            this.LLILZIL.setState(AFwS268S0000000_26.get$arr$(732));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditViewModel@7f24.changeOnOrder$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
