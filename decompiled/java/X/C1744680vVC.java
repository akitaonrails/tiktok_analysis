package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.libra.AddressMapDetailConfigModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vVC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel$saveAddress$2", f = "AddressMapDetailViewModel.kt", l = {380}, m = "invokeSuspend")
public final class C1744680vVC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressMapDetailViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744680vVC(AddressMapDetailViewModel addressMapDetailViewModel, InterfaceC1364105Vn<? super C1744680vVC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressMapDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744680vVC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Long l;
        C1C7U.LIZ("AddressMapDetailViewModel@adb3.saveAddress$2");
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
                AddressMapDetailConfigModel addressMapDetailConfigModel = (AddressMapDetailConfigModel) C1744690vVD.LIZIZ.getValue();
                if (addressMapDetailConfigModel != null && (l = addressMapDetailConfigModel.apiTimeOut) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 10000;
                }
                C1746510vY9 c1746510vY9 = new C1746510vY9(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C099A.LIZIZ(jLongValue, c1746510vY9, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressMapDetailViewModel@adb3.saveAddress$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(654));
            C1019103yf.LIZ(EnumC1014603xw.ERR20005, e, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressMapDetailViewModel@adb3.saveAddress$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
