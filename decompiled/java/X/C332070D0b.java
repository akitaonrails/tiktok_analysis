package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpPreloadManager$preloadRecommendations$6$2$finalSlots$2", f = "PdpPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C332070D0b extends C09AX implements Function2<List<? extends AbstractC331870Czh>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D2Y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332070D0b(C0D2Y c0d2y, InterfaceC1364105Vn<? super C332070D0b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d2y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C332070D0b c332070D0b = new C332070D0b(this.LLILLJJLI, interfaceC1364105Vn);
        c332070D0b.LL = obj;
        return c332070D0b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC332980D3o value;
        AbstractC332980D3o abstractC332980D3oLIZIZ;
        C1C7U.LIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2$finalSlots$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        if (((ArrayList) C332090D0d.LIZ(list)).isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2$finalSlots$2");
            return unit;
        }
        InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u = this.LLILLJJLI.LIZJ;
        do {
            value = interfaceC332260D0u.getValue();
            abstractC332980D3oLIZIZ = value;
            if (abstractC332980D3oLIZIZ instanceof C0D21) {
                abstractC332980D3oLIZIZ = C0D20.LIZIZ((C0D21) abstractC332980D3oLIZIZ, new C0D0Z(list));
            }
        } while (!interfaceC332260D0u.compareAndSet(value, abstractC332980D3oLIZIZ));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2$finalSlots$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends AbstractC331870Czh> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
