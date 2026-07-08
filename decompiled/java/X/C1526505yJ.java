package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.acfeeds.ACFeedsBridgeModel$notifyUpdate$1$1", f = "ACFeedsBridgeModel.kt", l = {}, m = "invokeSuspend")
public final class C1526505yJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1884220z8G LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526505yJ(C1884220z8G c1884220z8G, InterfaceC1364105Vn<? super C1526505yJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1884220z8G;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1526505yJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ACFeedsBridgeModel@97aa.notifyUpdate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<InterfaceC1526205yG> list = this.LL.mNotifyListeners;
        if (list != null) {
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ACFeedsBridgeModel@97aa.notifyUpdate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
