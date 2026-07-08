package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.history.AdWebHistoryFragment;
import com.ss.android.ugc.aweme.history.AdWebHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.05NZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryFragment$showDeleteConfirmDialog$1$1$1", f = "AdWebHistoryFragment.kt", l = {}, m = "invokeSuspend")
public final class C05NZ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdWebHistoryFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05NZ(AdWebHistoryFragment adWebHistoryFragment, InterfaceC1364105Vn<? super C05NZ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = adWebHistoryFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05NZ(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryFragment@bd5c.showDeleteConfirmDialog$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AdWebHistoryFragment adWebHistoryFragment = this.LL;
        AdWebHistoryViewModel adWebHistoryViewModel = adWebHistoryFragment.LLILLJJLI;
        if (adWebHistoryViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(adWebHistoryViewModel), C0PEM.LIZJ, null, new C1314505Cl(adWebHistoryViewModel, new AwS595S0100000_16(adWebHistoryFragment, 356), null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryFragment@bd5c.showDeleteConfirmDialog$1$1$1");
        return unit;
    }
}
