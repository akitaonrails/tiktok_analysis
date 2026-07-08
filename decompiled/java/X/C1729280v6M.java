package X;

import android.content.Context;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS57S0100100_26;
import kotlin.jvm.internal.AwS73S0100100_26;
import njp.a;

/* JADX INFO: renamed from: X.0v6M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel$updateTemplateStatus$1", f = "TemplateListViewModel.kt", l = {317}, m = "invokeSuspend")
public final class C1729280v6M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateListViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ TemplateItem LLILZ;
    public final /* synthetic */ C1728990v5t LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729280v6M(TemplateListViewModel templateListViewModel, Context context, TemplateItem templateItem, C1728990v5t c1728990v5t, long j, InterfaceC1364105Vn<? super C1729280v6M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateListViewModel;
        this.LLILLL = context;
        this.LLILZ = templateItem;
        this.LLILZIL = c1728990v5t;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729280v6M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TemplateListViewModel@ac46.updateTemplateStatus$1");
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
            C1730010v7X c1730010v7X = this.LLILLJJLI.LLILLL;
            Context context = this.LLILLL;
            TemplateItem templateItem = this.LLILZ;
            C1728990v5t c1728990v5t = this.LLILZIL;
            List<TemplateItem> list = c1728990v5t.LLJILJIL;
            RootData rootData = c1728990v5t.LL;
            AwS73S0100100_26 awS73S0100100_26 = new AwS73S0100100_26(c1728990v5t, this.LLILZLL, 0);
            AwS57S0100100_26 awS57S0100100_26 = new AwS57S0100100_26(this.LLILZIL, this.LLILZLL, 2);
            this.LL = 1;
            Object objLIZLLL = c1730010v7X.LIZLLL(context, templateItem, list, rootData, false, "", awS73S0100100_26, awS57S0100100_26, this);
            if (objLIZLLL != C099R.LJFF()) {
                objLIZLLL = Unit.LIZ;
            }
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("TemplateListViewModel@ac46.updateTemplateStatus$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateListViewModel@ac46.updateTemplateStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
