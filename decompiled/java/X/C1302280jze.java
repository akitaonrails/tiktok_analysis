package X;

import android.telecom.DisconnectCause;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSessionLegacy$onReject$2", f = "CallSessionLegacy.kt", l = {597}, m = "invokeSuspend")
public final class C1302280jze extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1302260jzc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302280jze(C1302260jzc c1302260jzc, InterfaceC1364105Vn<? super C1302280jze> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302260jzc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302280jze(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    if (this.LLILLJJLI.getState() == 2) {
                        Function2<DisconnectCause, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLJJLI.LLIZ;
                        DisconnectCause disconnectCause = new DisconnectCause(6);
                        this.LL = 1;
                        if (function2.invoke(disconnectCause, this) == objLJFF) {
                            return objLJFF;
                        }
                    }
                }
                this.LLILLJJLI.LJIILLIIL(new DisconnectCause(6));
                C05XL<Unit> c05xl = this.LLILLJJLI.LLJILJILJ;
                Unit unit = Unit.LIZ;
                c05xl.LJIIZILJ(unit);
                return unit;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJIILLIIL(new DisconnectCause(6));
            this.LLILLJJLI.LLJILJILJ.LJIIZILJ(Unit.LIZ);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
