package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardSettingsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS109S1200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel$init$2", f = "BillboardGlobalViewModel.kt", l = {157}, m = "invokeSuspend")
public final class C1728930v5n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BillboardGlobalViewModel LLILLJJLI;
    public final /* synthetic */ RootData LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728930v5n(BillboardGlobalViewModel billboardGlobalViewModel, RootData rootData, String str, InterfaceC1364105Vn<? super C1728930v5n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = billboardGlobalViewModel;
        this.LLILLL = rootData;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728930v5n(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BillboardSettingsData billboardSettingsData;
        C1C7U.LIZ("BillboardGlobalViewModel@db34.init$2");
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
                C1728220v4e c1728220v4e = this.LLILLJJLI.LLILLJJLI.LLILLJJLI;
                String str = this.LLILLL.authorId;
                this.LL = 1;
                obj = c1728220v4e.LL.LL.getBillboardSettings(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BillboardGlobalViewModel@db34.init$2");
                    return objLJFF;
                }
            }
            billboardSettingsData = (BillboardSettingsData) ((Response) ((C0X52) obj).LIZIZ).data;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            billboardSettingsData = null;
        }
        if (billboardSettingsData != null) {
            BillboardGlobalViewModel billboardGlobalViewModel = this.LLILLJJLI;
            RootData rootData = this.LLILLL;
            billboardGlobalViewModel.setStateImmediate(new AwS109S1200000_26(billboardSettingsData, billboardGlobalViewModel, this.LLILZ, 10));
            C1728940v5o.LLJLILLLLZIIL(rootData.authorId, billboardSettingsData.setting.isAutoDisplay);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardGlobalViewModel@db34.init$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
