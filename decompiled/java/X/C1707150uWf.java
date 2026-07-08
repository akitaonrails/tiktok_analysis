package X;

import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.GeneralQueryResultData;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.QueryStatusManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.QueryStatusManager$doQuery$2$1$3", f = "QueryStatusManager.kt", l = {}, m = "invokeSuspend")
public final class C1707150uWf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ QueryStatusManager LLILZ;
    public final /* synthetic */ C259800zU<GeneralQueryResultData> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ C259800zU<String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707150uWf(C118300cf c118300cf, int i, QueryStatusManager queryStatusManager, C259800zU<GeneralQueryResultData> c259800zU, int i2, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, C259800zU<String> c259800zU4, InterfaceC1364105Vn<? super C1707150uWf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c118300cf;
        this.LLILLL = i;
        this.LLILZ = queryStatusManager;
        this.LLILZIL = c259800zU;
        this.LLILZLL = i2;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = c259800zU3;
        this.LLJ = c259800zU4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1707150uWf c1707150uWf = new C1707150uWf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1707150uWf.LL = obj;
        return c1707150uWf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("QueryStatusManager@726c.doQuery$2$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LLILLJJLI.element;
        String str3 = "";
        if (i == this.LLILLL) {
            InterfaceC1707160uWg interfaceC1707160uWg = this.LLILZ.LIZIZ;
            if (interfaceC1707160uWg != null) {
                interfaceC1707160uWg.LIZIZ(this.LLILZIL.element);
            }
            QueryStatusManager queryStatusManager = this.LLILZ;
            C1707180uWi c1707180uWi = queryStatusManager.LIZLLL;
            if (c1707180uWi != null && (str2 = c1707180uWi.LIZJ) != null) {
                str3 = str2;
            }
            queryStatusManager.LIZIZ(0, str3, System.currentTimeMillis() - this.LLILZ.LJIILL, queryStatusManager.LJIILJJIL, null, null);
        } else if (i == this.LLILZLL) {
            String str4 = this.LLIZ.element;
            if (str4.length() <= 0) {
                str4 = null;
            }
            String string = str4;
            if (string == null) {
                C1711340udQ.LIZ.getClass();
                string = ((IAppContextManagerService) ServiceManager.get().getService(IAppContextManagerService.class)).getApplicationContext().getString(2131835079);
            }
            InterfaceC1707160uWg interfaceC1707160uWg2 = this.LLILZ.LIZIZ;
            if (interfaceC1707160uWg2 != null) {
                interfaceC1707160uWg2.onFail(string, this.LLIZLLLIL.element);
            }
            QueryStatusManager queryStatusManager2 = this.LLILZ;
            C1707180uWi c1707180uWi2 = queryStatusManager2.LIZLLL;
            if (c1707180uWi2 != null && (str = c1707180uWi2.LIZJ) != null) {
                str3 = str;
            }
            queryStatusManager2.LIZIZ(1, str3, System.currentTimeMillis() - this.LLILZ.LJIILL, queryStatusManager2.LJIILJJIL, this.LLJ.element, this.LLIZ.element);
        } else {
            this.LLILZ.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QueryStatusManager@726c.doQuery$2$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
