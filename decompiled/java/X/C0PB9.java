package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PB9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem$update$1", f = "SearchTopBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C0PB9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchTopBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PB9(SearchTopBarAssem searchTopBarAssem, InterfaceC1364105Vn<? super C0PB9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchTopBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PB9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchTopBarAssem@8a87.update$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.ip();
        C0Q3E.LJI().fe(new C640900PBw(null, null, null, null));
        C0Q3E.LJI().fe(new C0PBA(null));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchTopBarAssem@8a87.update$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
