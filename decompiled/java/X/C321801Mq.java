package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01Mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$checkBoardConflicts$3", f = "PCSBoardEffectManager.kt", l = {179}, m = "invokeSuspend")
public final class C321801Mq extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Boolean>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;

    public C321801Mq(InterfaceC1364105Vn<? super C321801Mq> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.checkBoardConflicts$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            this.LL = 1;
            if (interfaceC346701Wf.emit(false, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardConflicts$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardConflicts$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C321801Mq c321801Mq = new C321801Mq(interfaceC1364105Vn);
        c321801Mq.LLILLJJLI = interfaceC346701Wf;
        return c321801Mq.invokeSuspend(Unit.LIZ);
    }
}
