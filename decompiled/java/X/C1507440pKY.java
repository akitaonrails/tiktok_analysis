package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkHandler$asyncCheckExpired$1", f = "ECAPIInterceptorNetworkHandler.kt", l = {}, m = "invokeSuspend")
public final class C1507440pKY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ECAPIInterceptorNetworkHandler LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507440pKY(ECAPIInterceptorNetworkHandler eCAPIInterceptorNetworkHandler, long j, InterfaceC1364105Vn<? super C1507440pKY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = eCAPIInterceptorNetworkHandler;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507440pKY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECAPIInterceptorNetworkHandler@853.asyncCheckExpired$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, C1507530pKh>> setLIZ = this.LL.LIZIZ.LIZ();
        long j = this.LLILLJJLI;
        Iterator<T> it2 = setLIZ.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((C1507530pKh) entry.getValue()).LIZIZ < j) {
                arrayList.add(entry.getKey());
            }
        }
        if (!arrayList.isEmpty()) {
            this.LL.LIZIZ.LJ(arrayList);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAPIInterceptorNetworkHandler@853.asyncCheckExpired$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
