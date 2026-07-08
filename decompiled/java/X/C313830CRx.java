package X;

import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.core.cache.SugHistoryCache$addSugList$1", f = "SugHistoryCache.kt", l = {}, m = "invokeSuspend")
public final class C313830CRx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<SearchSugEntity> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C313830CRx(List<? extends SearchSugEntity> list, InterfaceC1364105Vn<? super C313830CRx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313830CRx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SugHistoryCache@3084.addSugList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        System.currentTimeMillis();
        C0QOI c0qoi = C0QOI.LIZ;
        C0QOI.LIZJ.addAll(this.LL);
        AnonymousClass0956 anonymousClass0956 = C0QOI.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C0QOI.LIZLLL = C23250099c.LIZLLL(C0QOI.LJ, null, null, new C0QOH(null), 3);
        System.currentTimeMillis();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugHistoryCache@3084.addSugList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
