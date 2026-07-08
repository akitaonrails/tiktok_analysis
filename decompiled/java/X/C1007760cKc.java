package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.preload.SearchAdPreloadModule;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.preload.SearchAdPreloadModule$onRecallResultsIncludeAds$1", f = "SearchAdPreloadModule.kt", l = {}, m = "invokeSuspend")
public final class C1007760cKc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SearchAdPreloadModule LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007760cKc(Integer num, String str, SearchAdPreloadModule searchAdPreloadModule, InterfaceC1364105Vn<? super C1007760cKc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = searchAdPreloadModule;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007760cKc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdPreloadModule@33e4.onRecallResultsIncludeAds$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLL.LJFF();
        SearchAdPreloadModule searchAdPreloadModule = this.LLILLL;
        Set<EnumC1007780cKe> set = searchAdPreloadModule.LIZ;
        EnumC1007780cKe enumC1007780cKe = EnumC1007780cKe.EVENT_TRACKER;
        if (!set.contains(enumC1007780cKe)) {
            C1009980cOC c1009980cOC = C1009980cOC.LIZ;
            C1009970cOB c1009970cOB = C1009970cOB.LIZ;
            searchAdPreloadModule.LIZ.add(enumC1007780cKe);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdPreloadModule@33e4.onRecallResultsIncludeAds$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
