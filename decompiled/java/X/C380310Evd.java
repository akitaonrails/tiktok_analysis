package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Evd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksScene$showFailedText$1", f = "AsyncTasksScene.kt", l = {171}, m = "invokeSuspend")
public final class C380310Evd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C380350Evh LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380310Evd(C380350Evh c380350Evh, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c380350Evh;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380310Evd(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksScene@382.showFailedText$1");
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
                C201955140j.LIZLLL(C563650M8t.LIZIZ, "shiwei", "has Failed task!!!");
                C380350Evh c380350Evh = this.LLILLJJLI;
                boolean z = this.LLILLL;
                this.LL = 1;
                if (c380350Evh.LLLLLL(z, this) == objLJFF) {
                    C1C7U.LIZIZ("AsyncTasksScene@382.showFailedText$1");
                    return objLJFF;
                }
            }
            if (this.LLILLL) {
                this.LLILLJJLI.LLLLLJIL();
                this.LLILLJJLI.LLLLLLL();
            }
            C426320Gne c426320Gne = this.LLILLJJLI.LLJJJJJIL;
            if (c426320Gne != null) {
                C786410Ut5.LLLZZ(c426320Gne, 8);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AsyncTasksScene@382.showFailedText$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLILLL) {
                this.LLILLJJLI.LLLLLJIL();
                this.LLILLJJLI.LLLLLLL();
            }
            C426320Gne c426320Gne2 = this.LLILLJJLI.LLJJJJJIL;
            if (c426320Gne2 != null) {
                C786410Ut5.LLLZZ(c426320Gne2, 8);
            }
            throw th;
        }
    }
}
