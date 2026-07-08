package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM$toggleSetRefresh$1", f = "OfflineModeManagerVM.kt", l = {434}, m = "invokeSuspend")
public final class C1349005Ps extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OfflineModeManagerVM LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349005Ps(OfflineModeManagerVM offlineModeManagerVM, Function0<Unit> function0, InterfaceC1364105Vn<? super C1349005Ps> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = offlineModeManagerVM;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1349005Ps(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManagerVM@2534.toggleSetRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC624740Oeu interfaceC624740Oeu = (InterfaceC624740Oeu) this.LLILLJJLI.wQ2().getOperator();
                this.LL = 1;
                if (interfaceC624740Oeu.h(true, false, this) == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeManagerVM@2534.toggleSetRefresh$1");
                    return objLJFF;
                }
            }
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LLILLJJLI);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1310605Ay(this.LLILLL, null), 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i8 = OfflineModeManagerVM.LLILZLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear User cache failed ");
            sbLIZ.append(e);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManagerVM@2534.toggleSetRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
