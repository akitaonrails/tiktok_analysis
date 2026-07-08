package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$startOnStartTimeoutMonitorIfNeeded$1", f = "PCSBoardEffectManager.kt", l = {354}, m = "invokeSuspend")
public final class C386701er extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C389701fL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C386701er(C389701fL c389701fL, InterfaceC1364105Vn<? super C386701er> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C386701er(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.startOnStartTimeoutMonitorIfNeeded$1");
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
                C01PP c01pp = new C01PP(this.LLILLJJLI, null);
                this.LL = 1;
                if (C099A.LIZIZ(3000L, c01pp, this) == objLJFF) {
                    C1C7U.LIZIZ("PCSBoardEffectManager@20d3.startOnStartTimeoutMonitorIfNeeded$1");
                    return objLJFF;
                }
            }
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            C392601fo.LJI(new C392701fp(new C386801es(-1011, "ON_START not received within 3000ms")));
            C386801es c386801es = new C386801es(-1011, "ON_START not received within 3000ms");
            C470401sM.LIZIZ(c386801es.getErrorCode(), 5, c386801es.getErrMsg());
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.startOnStartTimeoutMonitorIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
