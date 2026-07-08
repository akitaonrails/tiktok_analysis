package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchFollowAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Pyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchFollowAssem$initFollow$3", f = "SearchFollowAssem.kt", l = {}, m = "invokeSuspend")
public final class C662640Pyw extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ SearchFollowAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C662640Pyw(SearchFollowAssem searchFollowAssem, InterfaceC1364105Vn<? super C662640Pyw> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = searchFollowAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C662640Pyw(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchFollowAssem@1324.initFollow$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchFollowAssem searchFollowAssem = this.LL;
        if (searchFollowAssem.LLJLILLLLZIIL == null) {
            C1C7U.LIZIZ("SearchFollowAssem@1324.initFollow$3");
            return true;
        }
        Function0<Unit> function0 = ((C657700Pqy) searchFollowAssem.LLJL.getValue()).LL;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("SearchFollowAssem@1324.initFollow$3");
        return false;
    }
}
