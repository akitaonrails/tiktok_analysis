package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.address.AddressApi;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.DistrictDTO;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01Vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.address.AddressHelper$getDistrict$1", f = "AddressHelper.kt", l = {26, 28, 32}, m = "invokeSuspend")
public final class C345201Vq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, DistrictDTO, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345201Vq(String str, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345201Vq(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressHelper@93b4.getDistrict$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AddressHelper@93b4.getDistrict$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1505740pHo c1505740pHo = AddressApi.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            String strT2 = C786410Ut5.t2(Locale.getDefault());
            String str2 = C1505740pHo.LIZIZ;
            c1505740pHo.getClass();
            AddressApi addressApiLIZ = C1505740pHo.LIZ();
            if (addressApiLIZ != null) {
                obj = addressApiLIZ.fetchDistrict(strT2, str2, "1", str, this);
            } else {
                obj = null;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AddressHelper@93b4.getDistrict$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null && c0x52.LIZJ() && Intrinsics.LJFF(((DistrictDTO) c0x52.LIZIZ).status, "1")) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C345101Vp c345101Vp = new C345101Vp(this.LLILLL, c0x52, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c345101Vp) == objLJFF) {
                C1C7U.LIZIZ("AddressHelper@93b4.getDistrict$1");
                return objLJFF;
            }
        } else {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C345001Vo c345001Vo = new C345001Vo(this.LLILLL, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq2, c345001Vo) == objLJFF) {
                C1C7U.LIZIZ("AddressHelper@93b4.getDistrict$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AddressHelper@93b4.getDistrict$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
