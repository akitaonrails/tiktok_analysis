package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeleteRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.041R, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$delete$1", f = "AddressEditViewModel.kt", l = {1326}, m = "invokeSuspend")
public final class C041R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressEditViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C041R(AddressEditViewModel addressEditViewModel, InterfaceC1364105Vn<? super C041R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressEditViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C041R(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressEditViewModel@7f24.delete$1");
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
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(736));
                C980703sT c980703sT = AddressApi.LIZ;
                AddressEditViewModel addressEditViewModel = this.LLILLJJLI;
                String str = addressEditViewModel.LLJI;
                Integer num = addressEditViewModel.LLLIIL;
                this.LL = 1;
                c980703sT.getClass();
                obj = ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).kt(new DeleteRequest(Collections.singletonList(str), num, C1747870vaL.LIZ), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressEditViewModel@7f24.delete$1");
                    return objLJFF;
                }
            }
            if (!((Response) obj).isCodeOK()) {
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(737));
            } else {
                this.LLILLJJLI.GR2();
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(738));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(739));
            C1019103yf.LIZ(EnumC1014603xw.ERR57, e, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditViewModel@7f24.delete$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
