package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06hK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.freqcontrol.room.PromptUFCWaitingWindow$startTimer$1", f = "PromptUFCWaitingWindow.kt", l = {167, 169}, m = "invokeSuspend")
public final class C1676006hK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1675806hI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676006hK(C1675806hI c1675806hI, InterfaceC1364105Vn<? super C1676006hK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1675806hI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1676006hK c1676006hK = new C1676006hK(this.LLILLL, interfaceC1364105Vn);
        c1676006hK.LLILLJJLI = obj;
        return c1676006hK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("PromptUFCWaitingWindow@117c.startTimer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.startTimer$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            long j = this.LLILLL.LIZLLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.startTimer$1");
                return objLJFF;
            }
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.startTimer$1");
            return unit2;
        }
        C1675806hI c1675806hI = this.LLILLL;
        this.LLILLJJLI = null;
        this.LL = 2;
        if (c1675806hI.LIZIZ(true, this) == objLJFF) {
            C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.startTimer$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.startTimer$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
