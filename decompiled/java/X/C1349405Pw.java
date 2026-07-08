package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM$toggleUpdateWatchState$1", f = "OfflineModeManagerVM.kt", l = {390, 391}, m = "invokeSuspend")
public final class C1349405Pw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public OfflineModeManagerVM LL;
    public int LLILLJJLI;
    public final /* synthetic */ OfflineModeManagerVM LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349405Pw(OfflineModeManagerVM offlineModeManagerVM, String str, InterfaceC1364105Vn<? super C1349405Pw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = offlineModeManagerVM;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1349405Pw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        OfflineModeManagerVM offlineModeManagerVM;
        C1C7U.LIZ("OfflineModeManagerVM@2534.toggleUpdateWatchState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i8 = OfflineModeManagerVM.LLILZLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear User cache failed ");
            sbLIZ.append(e);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                this.LLILLL.HQ2((List) obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OfflineModeManagerVM@2534.toggleUpdateWatchState$1");
                return unit;
            }
            offlineModeManagerVM = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ((ArrayList) this.LLILLL.LLILZIL).add(this.LLILZ);
            if (((ArrayList) this.LLILLL.LLILZIL).size() > 8) {
                List<String> listSubList = ((ArrayList) this.LLILLL.LLILZIL).subList(0, 6);
                MLDataCenterService.Companion.getClass();
                C1349505Px.LIZ.removeAwemeContentListForScore(listSubList);
                ((ArrayList) this.LLILLL.LLILZIL).removeAll(listSubList);
            }
            offlineModeManagerVM = this.LLILLL;
            InterfaceC624740Oeu interfaceC624740Oeu = (InterfaceC624740Oeu) offlineModeManagerVM.wQ2().getOperator();
            String str = this.LLILZ;
            this.LL = offlineModeManagerVM;
            this.LLILLJJLI = 1;
            obj = interfaceC624740Oeu.LLLLLLLLL(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OfflineModeManagerVM@2534.toggleUpdateWatchState$1");
                return objLJFF;
            }
        }
        offlineModeManagerVM.JQ2(((Number) obj).intValue(), this.LLILZ);
        InterfaceC624740Oeu interfaceC624740Oeu2 = (InterfaceC624740Oeu) this.LLILLL.wQ2().getOperator();
        this.LL = null;
        this.LLILLJJLI = 2;
        obj = interfaceC624740Oeu2.C(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("OfflineModeManagerVM@2534.toggleUpdateWatchState$1");
            return objLJFF;
        }
        this.LLILLL.HQ2((List) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManagerVM@2534.toggleUpdateWatchState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
