package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05JV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule$doFirstHoopPreconnect$2$1", f = "CommerceLandPageRealtimeResourceModule.kt", l = {}, m = "invokeSuspend")
public final class C05JV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommerceLandPageRealtimeResourceModule LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AwemeRawAd LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05JV(CommerceLandPageRealtimeResourceModule commerceLandPageRealtimeResourceModule, String str, AwemeRawAd awemeRawAd, String str2, InterfaceC1364105Vn<? super C05JV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commerceLandPageRealtimeResourceModule;
        this.LLILLJJLI = str;
        this.LLILLL = awemeRawAd;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05JV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceLandPageRealtimeResourceModule@7cec.doFirstHoopPreconnect$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommerceLandPageRealtimeResourceModule commerceLandPageRealtimeResourceModule = this.LL;
        String str = this.LLILLJJLI;
        AwemeRawAd awemeRawAd = this.LLILLL;
        String str2 = this.LLILZ;
        commerceLandPageRealtimeResourceModule.getClass();
        CommerceLandPageRealtimeResourceModule.LIZIZ(awemeRawAd, str, str2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceLandPageRealtimeResourceModule@7cec.doFirstHoopPreconnect$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
