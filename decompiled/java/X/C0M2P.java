package X;

import Y.AObserverS212S0100000_8;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M2P, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.migration.DraftBoxMigrationComponent$init$6", f = "DraftBoxMigrationComponent.kt", l = {}, m = "invokeSuspend")
public final class C0M2P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxPageViewModel LL;
    public final /* synthetic */ C1DZY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M2P(DraftBoxPageViewModel draftBoxPageViewModel, C1DZY c1dzy, InterfaceC1364105Vn<? super C0M2P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxPageViewModel;
        this.LLILLJJLI = c1dzy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M2P(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        C1C7U.LIZ("DraftBoxMigrationComponent@a71e.init$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftBoxPageViewModel draftBoxPageViewModel = this.LL;
        if (draftBoxPageViewModel != null && (mutableLiveData = draftBoxPageViewModel.LLIZ) != null) {
            C1DZY c1dzy = this.LLILLJJLI;
            mutableLiveData.observe(c1dzy.LIZIZ, new AObserverS212S0100000_8(c1dzy, 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxMigrationComponent@a71e.init$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
