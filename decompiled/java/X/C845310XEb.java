package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS51S0000100_13;
import njp.a;

/* JADX INFO: renamed from: X.0XEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.websocket.bridge.WsManager$close$1", f = "WsManager.kt", l = {339}, m = "invokeSuspend")
public final class C845310XEb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C845310XEb(String str, InterfaceC1364105Vn<? super C845310XEb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C845310XEb(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        String str;
        boolean z;
        C1C7U.LIZ("WsManager@5c00.close$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = C845320XEc.LJIIIZ;
            str = this.LLILZ;
            this.LL = c1dev;
            this.LLILLJJLI = str;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("WsManager@5c00.close$1");
                return objLJFF;
            }
        }
        try {
            C2261941Dg8.LIZ.getClass();
            if (C2261941Dg8.LJIIIIZZ != EnumC2261951Dg9.UNKNOWN) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[recordActivelyCloseConnection], enterFrom = ");
                sbLIZ.append(str);
                C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
                if (!C2261941Dg8.LJIILJJIL) {
                    C2261941Dg8.LJIILJJIL = true;
                    C20648087a.LIZ(new AwS51S0000100_13(SystemClock.uptimeMillis(), 1));
                }
            }
            C821300WJs c821300WJs = C845320XEc.LJIIJJI;
            if (c821300WJs != null) {
                c821300WJs.LIZJ();
            }
            C845320XEc c845320XEc = C845320XEc.LJI;
            C845320XEc.LJIIJJI = null;
            C0XEY.LIZ.getClass();
            C0XEY.LIZ(str, "close");
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("WsManager@5c00.close$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
