package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel.CombinedMaterialListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel.CombinedMaterialListViewModel$retryPaging$1", f = "CombinedMaterialListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C472140IfM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CombinedMaterialListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472140IfM(CombinedMaterialListViewModel combinedMaterialListViewModel, InterfaceC1364105Vn<? super C472140IfM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = combinedMaterialListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472140IfM(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C484980J0e c484980J0e;
        C1C7U.LIZ("CombinedMaterialListViewModel@65f9.retryPaging$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLJJLI.setValue(EnumC485010J0h.RUNNING);
        C470730Id5 c470730Id5 = this.LL.LLILZ;
        if (c470730Id5 != null && (c484980J0e = c470730Id5.LJ) != null) {
            ?? r1 = c484980J0e.LJIIJJI;
            c484980J0e.LJIIJJI = null;
            if (r1 != 0) {
                r1.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombinedMaterialListViewModel@65f9.retryPaging$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
