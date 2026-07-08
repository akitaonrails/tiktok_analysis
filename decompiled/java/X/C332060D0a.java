package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpPreloadManager$preloadRecommendations$6$2", f = "PdpPreloadManager.kt", l = {227}, m = "invokeSuspend")
public final class C332060D0a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<UcpRecommendationItem> LLILLJJLI;
    public final /* synthetic */ C0D2Y LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332060D0a(List<UcpRecommendationItem> list, C0D2Y c0d2y, InterfaceC1364105Vn<? super C332060D0a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c0d2y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332060D0a(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC332980D3o value;
        AbstractC332980D3o abstractC332980D3oLIZIZ;
        InterfaceC332200D0o c0d0z;
        C1C7U.LIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2");
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
            List<UcpRecommendationItem> list = this.LLILLJJLI;
            C0D0X c0d0x = new C0D0X(this.LLILLL, null);
            C332070D0b c332070D0b = new C332070D0b(this.LLILLL, null);
            this.LL = 1;
            obj = C2296808zG.LJ(new C331810Czb(list, c332070D0b, c0d0x, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2");
                return objLJFF;
            }
        }
        List list2 = (List) obj;
        InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u = this.LLILLL.LIZJ;
        do {
            value = interfaceC332260D0u.getValue();
            abstractC332980D3oLIZIZ = value;
            if (abstractC332980D3oLIZIZ instanceof C0D21) {
                C0D21 c0d21 = (C0D21) abstractC332980D3oLIZIZ;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    c0d0z = new C332100D0e("Failed to load products");
                    abstractC332980D3oLIZIZ = C0D20.LIZIZ(c0d21, c0d0z);
                } else {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() instanceof C0D0F) {
                            c0d0z = new C0D0Z(list2);
                            break;
                        }
                    }
                    c0d0z = new C332100D0e("Failed to load products");
                    abstractC332980D3oLIZIZ = C0D20.LIZIZ(c0d21, c0d0z);
                }
            }
        } while (!interfaceC332260D0u.compareAndSet(value, abstractC332980D3oLIZIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
