package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.AuthSequenceManager$startSwitchSuccess$1$1$1$1", f = "AuthSequenceManager.kt", l = {169}, m = "invokeSuspend")
public final class C0NPI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AfterSwitchAccountHook LLILLJJLI;
    public final /* synthetic */ C0XVI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPI(AfterSwitchAccountHook afterSwitchAccountHook, C0XVI c0xvi, InterfaceC1364105Vn<? super C0NPI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = afterSwitchAccountHook;
        this.LLILLL = c0xvi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AuthSequenceManager@5a17.startSwitchSuccess$1$1$1$1");
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
                if (!C0XQ7.LJFF().LIZ() || this.LLILLJJLI.LIZIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.LLILLJJLI.LJI(this.LLILLL)) {
                    AfterSwitchAccountHook afterSwitchAccountHook = this.LLILLJJLI;
                    C0XVI c0xvi = this.LLILLL;
                    this.LL = 1;
                    if (afterSwitchAccountHook.LIZ(c0xvi, this) == objLJFF) {
                        C1C7U.LIZIZ("AuthSequenceManager@5a17.startSwitchSuccess$1$1$1$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startSwitchSuccess$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
