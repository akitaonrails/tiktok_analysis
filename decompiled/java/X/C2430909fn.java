package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM$checkCLAStatus$3", f = "SearchEllipsisVM.kt", l = {}, m = "invokeSuspend")
public final class C2430909fn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchEllipsisVM LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2430909fn(SearchEllipsisVM searchEllipsisVM, Fragment fragment, C19EG c19eg, InterfaceC1364105Vn<? super C2430909fn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchEllipsisVM;
        this.LLILLJJLI = fragment;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2430909fn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1389890mGx c1389890mGx;
        C1C7U.LIZ("SearchEllipsisVM@dbf6.checkCLAStatus$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchEllipsisVM searchEllipsisVM = this.LL;
        Fragment fragment = this.LLILLJJLI;
        C19EG c19eg = this.LLILLL;
        searchEllipsisVM.getClass();
        if (C1835007Gq.LIZ()) {
            c1389890mGx = new C1389890mGx(fragment);
        } else {
            c1389890mGx = new C1389890mGx(c19eg);
        }
        c1389890mGx.LJIIIZ(2131858106);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchEllipsisVM@dbf6.checkCLAStatus$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
