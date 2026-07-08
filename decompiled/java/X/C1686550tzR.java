package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS120S0400000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {953}, m = "invokeSuspend")
public final class C1686550tzR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Float>, Object> {
    public C817403Hg LL;
    public C1677580tky LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ C1686560tzS LLILZIL;
    public final /* synthetic */ InterfaceC1392705cj LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686550tzR(float f, C1686560tzS c1686560tzS, InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super C1686550tzR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = f;
        this.LLILZIL = c1686560tzS;
        this.LLILZLL = interfaceC1392705cj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1686550tzR(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
        C817403Hg c817403Hg;
        C1677580tky c1677580tkyLIZ;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c1677580tkyLIZ = this.LLILLJJLI;
                c817403Hg = this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (CancellationException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    c817403Hg.element = ((Number) c1677580tkyLIZ.LJIIL()).floatValue();
                }
                f = c817403Hg.element;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (Math.abs(this.LLILZ) > 1.0f) {
                c817403Hg = new C817403Hg();
                c817403Hg.element = this.LLILZ;
                C817403Hg c817403Hg2 = new C817403Hg();
                c1677580tkyLIZ = C1677590tkz.LIZ(0.0f, this.LLILZ, 28);
                try {
                    C1686560tzS c1686560tzS = this.LLILZIL;
                    InterfaceC1677940tlY<Float> interfaceC1677940tlY = c1686560tzS.LIZ;
                    AwS120S0400000_25 awS120S0400000_25 = new AwS120S0400000_25(c817403Hg2, this.LLILZLL, c817403Hg, c1686560tzS, 26);
                    this.LL = c817403Hg;
                    this.LLILLJJLI = c1677580tkyLIZ;
                    this.LLILLL = 1;
                    if (C1677810tlL.LIZLLL(c1677580tkyLIZ, interfaceC1677940tlY, false, awS120S0400000_25, this) == objLJFF) {
                        return objLJFF;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    c817403Hg.element = ((Number) c1677580tkyLIZ.LJIIL()).floatValue();
                }
                f = c817403Hg.element;
            } else {
                f = this.LLILZ;
            }
        }
        return C2286608xc.LIZLLL(f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Float> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
