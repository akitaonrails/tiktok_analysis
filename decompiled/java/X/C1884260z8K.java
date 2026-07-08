package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.0z8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.acfeeds.ACFeedsBridgeModel$injectFeeds$3$1", f = "ACFeedsBridgeModel.kt", l = {239}, m = "invokeSuspend")
public final class C1884260z8K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1884220z8G LLILLJJLI;
    public final /* synthetic */ C1884270z8L LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884260z8K(C1884220z8G c1884220z8G, C1884270z8L c1884270z8L, InterfaceC1364105Vn<? super C1884260z8K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1884220z8G;
        this.LLILLL = c1884270z8L;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1884260z8K(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ACFeedsBridgeModel@97aa.injectFeeds$3$1");
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
            C1884220z8G c1884220z8G = this.LLILLJJLI;
            C1884270z8L c1884270z8L = this.LLILLL;
            List<String> list = c1884270z8L.LIZLLL;
            boolean z = c1884270z8L.LIZJ;
            String str = c1884270z8L.LIZIZ;
            String str2 = c1884270z8L.LIZ;
            AwS546S0100000_2 awS546S0100000_2 = c1884220z8G.LLJI;
            this.LL = 1;
            if (c1884220z8G.LJIILJJIL(list, z, str, str2, awS546S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("ACFeedsBridgeModel@97aa.injectFeeds$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ACFeedsBridgeModel@97aa.injectFeeds$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
