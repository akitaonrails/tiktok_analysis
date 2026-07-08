package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.hook.AfterLogoutHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.AuthSequenceManager$startLogout$1$1$1$1", f = "AuthSequenceManager.kt", l = {259}, m = "invokeSuspend")
public final class C0NPG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AfterLogoutHook LLILLJJLI;
    public final /* synthetic */ C0XVI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPG(AfterLogoutHook afterLogoutHook, C0XVI c0xvi, InterfaceC1364105Vn<? super C0NPG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = afterLogoutHook;
        this.LLILLL = c0xvi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthSequenceManager@5a17.startLogout$1$1$1$1");
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
                this.LLILLJJLI.LIZLLL();
                AfterLogoutHook afterLogoutHook = this.LLILLJJLI;
                C0XVI c0xvi = this.LLILLL;
                this.LL = 1;
                if (afterLogoutHook.LIZ(c0xvi, this) == objLJFF) {
                    C1C7U.LIZIZ("AuthSequenceManager@5a17.startLogout$1$1$1$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startLogout$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
