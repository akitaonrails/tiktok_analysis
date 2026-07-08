package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM$updateCoverAwemes$1", f = "OfflineModeManagerVM.kt", l = {523}, m = "invokeSuspend")
public final class C1349305Pv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OfflineModeManagerVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349305Pv(OfflineModeManagerVM offlineModeManagerVM, InterfaceC1364105Vn<? super C1349305Pv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = offlineModeManagerVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1349305Pv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManagerVM@2534.updateCoverAwemes$1");
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
                obj = interfaceC624740Oeu.LJJ();
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeManagerVM@2534.updateCoverAwemes$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.setState(new AwS581S0100000_2((List) obj, (List<ActionBarButtonConfBusiness>) 616));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i8 = OfflineModeManagerVM.LLILZLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCoverAwemes failed ");
            sbLIZ.append(e);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManagerVM@2534.updateCoverAwemes$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
