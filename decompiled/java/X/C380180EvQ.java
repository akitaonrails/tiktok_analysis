package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksScene$showEntranceWithAnimation$1", f = "AsyncTasksScene.kt", l = {256}, m = "invokeSuspend")
public final class C380180EvQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C380350Evh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380180EvQ(C380350Evh c380350Evh, InterfaceC1364105Vn<? super C380180EvQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c380350Evh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380180EvQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksScene@382.showEntranceWithAnimation$1");
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
                C380350Evh c380350Evh = this.LLILLJJLI;
                c380350Evh.LLJZIJLIL = true;
                this.LL = 1;
                if (c380350Evh.LLLLLJLJLL(this) == objLJFF) {
                    C1C7U.LIZIZ("AsyncTasksScene@382.showEntranceWithAnimation$1");
                    return objLJFF;
                }
            }
            View view = this.LLILLJJLI.LLJJJIL;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            this.LLILLJJLI.LLJZIJLIL = false;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AsyncTasksScene@382.showEntranceWithAnimation$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            View view2 = this.LLILLJJLI.LLJJJIL;
            if (view2 != null) {
                C786410Ut5.T4(view2, 1.0f);
            }
            this.LLILLJJLI.LLJZIJLIL = false;
            throw th;
        }
    }
}
