package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NYO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.client.ActivityStatusClientImpl$removeAllObserver$1", f = "ActivityStatusClientImpl.kt", l = {}, m = "invokeSuspend")
public final class C0NYO extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NYK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NYO(C0NYK c0nyk, InterfaceC1364105Vn<? super C0NYO> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0nyk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NYO(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusClientImpl@16b7.removeAllObserver$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NYK c0nyk = this.LL;
        synchronized (c0nyk.LJIILIIL) {
            try {
                List<String> listLIZ = C0NYU.LIZ(c0nyk.LJIIJ);
                c0nyk.LJIIJ.clear();
                int size = listLIZ.size();
                if (c0nyk.LJIIJJI) {
                    c0nyk.LJIILIIL().LJI(listLIZ);
                }
                C0NXT c0nxtLJIILJJIL = c0nyk.LJIILJJIL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("remove all isActive(");
                sbLIZ.append(c0nyk.LJIIJJI);
                sbLIZ.append(") pre(");
                sbLIZ.append(size);
                sbLIZ.append(')');
                C0NXR.LIZLLL(c0nyk, c0nxtLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.removeAllObserver$1");
        return unit;
    }
}
