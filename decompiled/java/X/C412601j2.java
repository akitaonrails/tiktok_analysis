package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01j2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.adapter.SharePanelHeadAdapter$expandAggregationContacts$1$1", f = "SharePanelHeadAdapter.kt", l = {}, m = "invokeSuspend")
public final class C412601j2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RecyclerView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C412601j2(RecyclerView recyclerView, InterfaceC1364105Vn<? super C412601j2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = recyclerView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C412601j2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelHeadAdapter@c417.expandAggregationContacts$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelHeadAdapter@c417.expandAggregationContacts$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
