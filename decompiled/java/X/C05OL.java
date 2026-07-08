package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.result.model.DynamicSearchResponseData;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.LiveVerticalAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.LiveVerticalAssem$onViewCreated$3$1", f = "LiveVerticalAssem.kt", l = {}, m = "invokeSuspend")
public final class C05OL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveVerticalAssem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OL(LiveVerticalAssem liveVerticalAssem, String str, long j, InterfaceC1364105Vn<? super C05OL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveVerticalAssem;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveVerticalAssem@d986.onViewCreated$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            LiveVerticalAssem.Lo(this.LL, false, 1, ((DynamicSearchResponseData) this.LL.LLJI.LJII(this.LLILLJJLI, DynamicSearchResponseData.class)).response, 0, C2286608xc.LJFF(this.LLILLL), 16);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveVerticalAssem@d986.onViewCreated$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
