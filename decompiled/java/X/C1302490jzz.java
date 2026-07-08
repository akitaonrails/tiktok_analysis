package X;

import android.telecom.DisconnectCause;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession$onDisconnect$1", f = "CallSession.kt", l = {486, 488}, m = "invokeSuspend")
public final class C1302490jzz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1302520k02 LLILLJJLI;
    public final /* synthetic */ DisconnectCause LLILLL;
    public final /* synthetic */ Consumer<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302490jzz(C1302520k02 c1302520k02, DisconnectCause disconnectCause, Consumer<Boolean> consumer, InterfaceC1364105Vn<? super C1302490jzz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302520k02;
        this.LLILLL = disconnectCause;
        this.LLILZ = consumer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302490jzz(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            C155000ia.LIZIZ(obj);
                            C05XL<Unit> c05xl = this.LLILLJJLI.LLJI;
                            Unit unit = Unit.LIZ;
                            c05xl.LJIIZILJ(unit);
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    Function2<DisconnectCause, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLJJLI.LLILZ;
                    DisconnectCause disconnectCause = this.LLILLL;
                    this.LL = 1;
                    if (function2.invoke(disconnectCause, this) == objLJFF) {
                        return objLJFF;
                    }
                }
                this.LLILZ.accept(true);
                C05YC<EnumC1302210jzX> c05yc = this.LLILLJJLI.LLIZLLLIL;
                EnumC1302210jzX enumC1302210jzX = EnumC1302210jzX.DISCONNECTED;
                this.LL = 2;
                if (c05yc.emit(enumC1302210jzX, this) == objLJFF) {
                    return objLJFF;
                }
                C05XL<Unit> c05xl2 = this.LLILLJJLI.LLJI;
                Unit unit2 = Unit.LIZ;
                c05xl2.LJIIZILJ(unit2);
                return unit2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZ.accept(false);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LLJI.LJIIZILJ(Unit.LIZ);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
