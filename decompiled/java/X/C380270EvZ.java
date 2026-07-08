package X;

import Y.AgS286S0100000_5;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0EvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksScene$hideEntranceWithAnimation$1", f = "AsyncTasksScene.kt", l = {238}, m = "invokeSuspend")
public final class C380270EvZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C380350Evh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380270EvZ(C380350Evh c380350Evh, InterfaceC1364105Vn<? super C380270EvZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c380350Evh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380270EvZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksScene@382.hideEntranceWithAnimation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                b bVarLIZ = C380400Evm.LIZ(200L, (Interpolator) C380400Evm.LIZJ.getValue(), 1.0f, 0.0f);
                AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLJJLI, 20);
                this.LL = 1;
                if (bVarLIZ.collect(agS286S0100000_5, this) == objLJFF) {
                    C1C7U.LIZIZ("AsyncTasksScene@382.hideEntranceWithAnimation$1");
                    return objLJFF;
                }
            }
            View view = this.LLILLJJLI.LLJJJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AsyncTasksScene@382.hideEntranceWithAnimation$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            View view2 = this.LLILLJJLI.LLJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            throw th;
        }
    }
}
