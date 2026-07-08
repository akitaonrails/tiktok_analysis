package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.client.ActivityStatusClientImpl$activate$1", f = "ActivityStatusClientImpl.kt", l = {222}, m = "invokeSuspend")
public final class C0NYQ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NYK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NYQ(C0NYK c0nyk, InterfaceC1364105Vn<? super C0NYQ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0nyk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NYQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusClientImpl@16b7.activate$1");
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
            C0NYK c0nyk = this.LLILLJJLI;
            C0NXR.LIZLLL(c0nyk, c0nyk.LJIILJJIL(), "activate");
            C0NYK c0nyk2 = this.LLILLJJLI;
            synchronized (c0nyk2.LJIILIIL) {
                try {
                    if (c0nyk2.LJIIJJI) {
                        C0NXR.LIZLLL(c0nyk2, c0nyk2.LJIILJJIL(), "isActive is already set to true");
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.activate$1");
                        return unit;
                    }
                    c0nyk2.LJIIJJI = true;
                    c0nyk2.LJIILIIL().LIZ(C0NYU.LIZ(c0nyk2.LJIIJ));
                    C0NYK c0nyk3 = this.LLILLJJLI;
                    C0NYX c0nyx = new C0NYX(c0nyk3);
                    this.LL = 1;
                    if (c0nyk3.LJIILL(c0nyx, this) == objLJFF) {
                        C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.activate$1");
                        return objLJFF;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0NYK c0nyk4 = this.LLILLJJLI;
        c0nyk4.LJIILL = c0nyk4.LJIIZILJ(new C0NYT(c0nyk4, null));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.activate$1");
        return unit2;
    }
}
