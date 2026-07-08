package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.startup.task.delay.EPMagicPrefetchTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05FH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.delay.EPMagicPrefetchTask$startPrefetchTask$1", f = "EPMagicPrefetchTask.kt", l = {79}, m = "invokeSuspend")
public final class C05FH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EPMagicPrefetchTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05FH(EPMagicPrefetchTask ePMagicPrefetchTask, InterfaceC1364105Vn<? super C05FH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ePMagicPrefetchTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05FH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPMagicPrefetchTask@22f8.startPrefetchTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILLJJLI.getClass();
            EPMagicPrefetchTask.LJ("Illegal state during magic prefetch", e2);
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LLILLJJLI.getClass();
            EPMagicPrefetchTask.LJ("Runtime error during magic prefetch", e3);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList<String> arrayListLIZJ = this.LLILLJJLI.LIZJ();
            if (!arrayListLIZJ.isEmpty()) {
                EPMagicPrefetchTask ePMagicPrefetchTask = this.LLILLJJLI;
                this.LL = 1;
                obj = ePMagicPrefetchTask.LIZLLL(arrayListLIZJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EPMagicPrefetchTask@22f8.startPrefetchTask$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EPMagicPrefetchTask@22f8.startPrefetchTask$1");
            return unit;
        }
        this.LLILLJJLI.LJFF((List) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPMagicPrefetchTask@22f8.startPrefetchTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
