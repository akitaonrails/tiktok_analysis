package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NYP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.client.ActivityStatusClientImpl$destroy$1", f = "ActivityStatusClientImpl.kt", l = {}, m = "invokeSuspend")
public final class C0NYP extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NYK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NYP(C0NYK c0nyk, InterfaceC1364105Vn<? super C0NYP> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0nyk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NYP(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusClientImpl@16b7.destroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NYK c0nyk = this.LL;
        C0NXR.LIZLLL(c0nyk, c0nyk.LJIILJJIL(), "destroy");
        if (this.LL.LJIIJJI) {
            C0NYK c0nyk2 = this.LL;
            synchronized (c0nyk2.LJIILIIL) {
                try {
                    List<String> listLIZ = C0NYU.LIZ(c0nyk2.LJIIJ);
                    c0nyk2.LJIIJ.clear();
                    c0nyk2.LJIILIIL().LJI(listLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LL.LJIIJJI = false;
        C2296808zG.LIZJ((InterfaceC497601wk) this.LL.LJIILJJIL.getValue(), null);
        AnonymousClass0956 anonymousClass0956 = this.LL.LJIILL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LL.LJIILL = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.destroy$1");
        return unit;
    }
}
