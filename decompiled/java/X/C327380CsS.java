package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMMediaVideoPreloader$addResources$1", f = "IMMediaVideoPreloader.kt", l = {}, m = "invokeSuspend")
public final class C327380CsS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<InterfaceC1329505If> LL;
    public final /* synthetic */ C327390CsT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C327380CsS(List<? extends InterfaceC1329505If> list, C327390CsT c327390CsT, InterfaceC1364105Vn<? super C327380CsS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c327390CsT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327380CsS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        C1C7U.LIZ("IMMediaVideoPreloader@ce33.addResources$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<InterfaceC1329505If> list = this.LL;
        C327390CsT c327390CsT = this.LLILLJJLI;
        Iterator<InterfaceC1329505If> it2 = list.iterator();
        while (it2.hasNext()) {
            Map<String, Object> mapLJJIFFI = it2.next().LJJIFFI();
            Object obj2 = null;
            if (mapLJJIFFI != null) {
                obj2 = mapLJJIFFI.get("AWEME");
            }
            if ((obj2 instanceof Aweme) && (aweme = (Aweme) obj2) != null) {
                C1483340ohg.LJIL(c327390CsT.LJIIIZ.LIZLLL, aweme);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMediaVideoPreloader@ce33.addResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
