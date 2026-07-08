package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel$setVisibleIndex$2", f = "ClickSearchViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CVQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ClickSearchViewModel LL;
    public final /* synthetic */ Integer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVQ(ClickSearchViewModel clickSearchViewModel, Integer num, InterfaceC1364105Vn<? super C0CVQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = clickSearchViewModel;
        this.LLILLJJLI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ClickSearchViewModel@2c5d.setVisibleIndex$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((LiveData) this.LL.LLILLL.getValue()).setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ClickSearchViewModel@2c5d.setVisibleIndex$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
