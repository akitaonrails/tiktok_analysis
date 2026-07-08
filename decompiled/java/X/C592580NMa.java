package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$renderCache$1", f = "SeaPdpViewModel.kt", l = {4558, 4559}, m = "invokeSuspend")
public final class C592580NMa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ProductPackStruct LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592580NMa(SeaPdpViewModel seaPdpViewModel, Context context, String str, ProductPackStruct productPackStruct, InterfaceC1364105Vn<? super C592580NMa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpViewModel;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = productPackStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592580NMa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpViewModel@98e7.renderCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SeaPdpViewModel@98e7.renderCache$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.xS2(this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.renderCache$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C592590NMb c592590NMb = new C592590NMb(this.LLILLJJLI, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c592590NMb) == objLJFF) {
            C1C7U.LIZIZ("SeaPdpViewModel@98e7.renderCache$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.renderCache$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
