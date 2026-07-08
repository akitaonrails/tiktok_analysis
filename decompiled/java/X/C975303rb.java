package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.cache.data.AddressCacheModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$loadAddressListFromCache$1", f = "IAddressListViewModel.kt", l = {458}, m = "invokeSuspend")
public final class C975303rb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC975703rf LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C975303rb(InterfaceC975703rf interfaceC975703rf, String str, InterfaceC1364105Vn<? super C975303rb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC975703rf;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C975303rb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("IAddressListViewModel@9425.loadAddressListFromCache$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C962103pT c962103pT = C962103pT.LIZ;
            InterfaceC975703rf interfaceC975703rf = this.LLILLJJLI;
            if (C123100dR.LIZ(interfaceC975703rf.getProductId())) {
                i = 2;
            } else if (C123100dR.LIZ(interfaceC975703rf.ZM2())) {
                i = 0;
            } else {
                i = 1;
            }
            c962103pT.getClass();
            AddressCacheModel addressCacheModelLIZ = C962103pT.LIZ(i);
            String str = this.LLILLL;
            InterfaceC975703rf interfaceC975703rf2 = this.LLILLJJLI;
            addressCacheModelLIZ.LIZIZ = str;
            if (addressCacheModelLIZ.LIZ()) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C975403rc c975403rc = new C975403rc(addressCacheModelLIZ, interfaceC975703rf2, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c975403rc) == objLJFF) {
                    C1C7U.LIZIZ("IAddressListViewModel@9425.loadAddressListFromCache$1");
                    return objLJFF;
                }
            } else {
                C977303rv.LIZ(C977303rv.LIZ, 0, null, null, addressCacheModelLIZ, 4);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAddressListViewModel@9425.loadAddressListFromCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
