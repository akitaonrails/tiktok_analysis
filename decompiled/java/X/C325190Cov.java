package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabsResponse;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageTemplateTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import njp.a;

/* JADX INFO: renamed from: X.0Cov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageTemplateTabViewModel$fetchAllTemplatesSquare$1", f = "TakoImageTemplateTabViewModel.kt", l = {67}, m = "invokeSuspend")
public final class C325190Cov extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoImageTemplateTabViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325190Cov(TakoImageTemplateTabViewModel takoImageTemplateTabViewModel, InterfaceC1364105Vn<? super C325190Cov> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoImageTemplateTabViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325190Cov(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageTemplateTabViewModel@ff21.fetchAllTemplatesSquare$1");
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
                C1863980ybc c1863980ybc = C1863980ybc.LIZ;
                this.LL = 1;
                obj = c1863980ybc.LJIILIIL(0, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoImageTemplateTabViewModel@ff21.fetchAllTemplatesSquare$1");
                    return objLJFF;
                }
            }
            TemplateTabsResponse templateTabsResponse = (TemplateTabsResponse) obj;
            if (templateTabsResponse != null && templateTabsResponse.statusCode == 0) {
                C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c1860520yW2.getClass();
                C1860520yW2.LJJIL(jCurrentTimeMillis);
                this.LLILLJJLI.setState(AFwS269S0000000_27.get$arr$(494));
            } else {
                this.LLILLJJLI.setState(AFwS269S0000000_27.get$arr$(495));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(AFwS269S0000000_27.get$arr$(496));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageTemplateTabViewModel@ff21.fetchAllTemplatesSquare$1");
        return unit;
    }
}
