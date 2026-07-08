package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.send.MessageTask$sendViaPipeline$1", f = "MessageTask.kt", l = {}, m = "invokeSuspend")
public final class C865040Xwc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YTK LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865040Xwc(C0YTK c0ytk, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C865040Xwc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ytk;
        this.LLILLJJLI = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865040Xwc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageTask@276.sendViaPipeline$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0YTK c0ytk = this.LL;
            if (c0ytk != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "MessageTask is not valid";
                c0ytk.LJII(null, null, c0ymw);
            }
            C2296808zG.LIZJ(this.LLILLJJLI, null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageTask@276.sendViaPipeline$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2296808zG.LIZJ(this.LLILLJJLI, null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
