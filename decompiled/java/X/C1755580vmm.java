package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxItemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS62S1300000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxItemVM$onItemBound$2", f = "PdpLynxItemVM.kt", l = {39}, m = "invokeSuspend")
public final class C1755580vmm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpLynxItemVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1755400vmU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755580vmm(PdpLynxItemVM pdpLynxItemVM, String str, String str2, C1755400vmU c1755400vmU, InterfaceC1364105Vn<? super C1755580vmm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpLynxItemVM;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1755400vmU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1755580vmm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpLynxItemVM@bff4.onItemBound$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951Fa = this.LLILLJJLI.LL.fa(this.LLILLL);
            final PdpLynxItemVM pdpLynxItemVM = this.LLILLJJLI;
            final String str = this.LLILZ;
            final C1755400vmU c1755400vmU = this.LLILZIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0vml
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    InterfaceC1457205n8 interfaceC1457205n8 = (InterfaceC1457205n8) obj2;
                    if (interfaceC1457205n8 instanceof C1457105n7) {
                        PdpLynxItemVM pdpLynxItemVM2 = pdpLynxItemVM;
                        pdpLynxItemVM2.setState(new AwS62S1300000_26(pdpLynxItemVM2, str, c1755400vmU, interfaceC1457205n8, 3));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0951Fa.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PdpLynxItemVM@bff4.onItemBound$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
