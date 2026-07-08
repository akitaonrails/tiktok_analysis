package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ISeriesPlayNextService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05J2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.commonfeed.component.playnext.SeriesAutoPlayNextProtocolImpl$loadData$1", f = "SeriesAutoPlayNextProtocolImpl.kt", l = {43}, m = "invokeSuspend")
public final class C05J2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05J3 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05J2(C05J3 c05j3, long j, Function0<Unit> function0, InterfaceC1364105Vn<? super C05J2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05j3;
        this.LLILLL = j;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05J2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesAutoPlayNextProtocolImpl@37ff.loadData$1");
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
            ISeriesPlayNextService iSeriesPlayNextService = (ISeriesPlayNextService) this.LLILLJJLI.LIZJ.getValue();
            if (iSeriesPlayNextService != null) {
                Aweme aweme = this.LLILLJJLI.LIZ.getAweme();
                long j = this.LLILLL;
                this.LL = 1;
                if (iSeriesPlayNextService.loadVideoList(aweme, j, this) == objLJFF) {
                    C1C7U.LIZIZ("SeriesAutoPlayNextProtocolImpl@37ff.loadData$1");
                    return objLJFF;
                }
            }
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeriesAutoPlayNextProtocolImpl@37ff.loadData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
