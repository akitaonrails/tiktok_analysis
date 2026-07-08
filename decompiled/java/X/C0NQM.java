package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallImpressionRepository$request$2", f = "ShopMallImpressionRepository.kt", l = {23, 25}, m = "invokeSuspend")
public final class C0NQM extends C09AX implements Function2<InterfaceC346701Wf<? super C0NQN>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NSZ LLILLL;
    public final /* synthetic */ n LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQM(C0NSZ c0nsz, n nVar, InterfaceC1364105Vn<? super C0NQM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0nsz;
        this.LLILZ = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NQM c0nqm = new C0NQM(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0nqm.LLILLJJLI = obj;
        return c0nqm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("ShopMallImpressionRepository@c827.request$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShopMallImpressionRepository@c827.request$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            ShopMallMixViewModel shopMallMixViewModel = this.LLILLL.LIZ;
            n nVar = this.LLILZ;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = shopMallMixViewModel.wQ2(nVar, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShopMallImpressionRepository@c827.request$2");
                return objLJFF;
            }
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mixhome mix impression: ");
        sbLIZ.append(obj);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MixMall", strLIZIZ);
        C0NQO c0nqo = new C0NQO() { // from class: X.0NQN
        };
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(c0nqo, this) == objLJFF) {
            C1C7U.LIZIZ("ShopMallImpressionRepository@c827.request$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallImpressionRepository@c827.request$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0NQN> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
