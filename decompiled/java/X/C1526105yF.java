package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds.WHFeedsBridgeModel$notifyFail$2", f = "WHFeedsBridgeModel.kt", l = {}, m = "invokeSuspend")
public final class C1526105yF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1884130z87 LL;
    public final /* synthetic */ C1876870ywP LLILLJJLI;
    public final /* synthetic */ Exception LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526105yF(C1884130z87 c1884130z87, C1876870ywP c1876870ywP, Exception exc, InterfaceC1364105Vn<? super C1526105yF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1884130z87;
        this.LLILLJJLI = c1876870ywP;
        this.LLILLL = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1526105yF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("WHFeedsBridgeModel@17b3.notifyFail$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1884130z87 c1884130z87 = this.LL;
        c1884130z87.mIsLoading = false;
        int i = c1884130z87.mListQueryType;
        Integer num = this.LLILLJJLI.LJFF;
        if (num != null) {
            c1884130z87.mListQueryType = num.intValue();
        }
        List<InterfaceC1526205yG> list = this.LL.mNotifyListeners;
        if (list != null) {
            Exception exc = this.LLILLL;
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onFailed(exc);
            }
        }
        Integer num2 = this.LLILLJJLI.LJFF;
        if (num2 != null) {
            C1884130z87 c1884130z872 = this.LL;
            num2.intValue();
            c1884130z872.mListQueryType = i;
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.notifyFail$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
