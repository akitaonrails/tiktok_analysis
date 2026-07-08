package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor$init$1$onStart$1", f = "AccessibilityEventTrackingMonitor.kt", l = {228, 71}, m = "invokeSuspend")
public final class C1305850k5P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305850k5P(Context context, InterfaceC1364105Vn<? super C1305850k5P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1305850k5P(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC383701eN mutex;
        Context context;
        C1C7U.LIZ("AccessibilityEventTrackingMonitor@71c7.init$1$onStart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            mutex = this.LL;
                            C155000ia.LIZIZ(obj);
                            mutex.LIZIZ(null);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("AccessibilityEventTrackingMonitor@71c7.init$1$onStart$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) this.LLILLJJLI;
                    mutex = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    mutex = AccessibilityEventTrackingMonitor.INSTANCE.getMutex();
                    context = this.LLILZ;
                    this.LL = mutex;
                    this.LLILLJJLI = context;
                    this.LLILLL = 1;
                    if (mutex.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("AccessibilityEventTrackingMonitor@71c7.init$1$onStart$1");
                        return objLJFF;
                    }
                }
                AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor = AccessibilityEventTrackingMonitor.INSTANCE;
                this.LL = mutex;
                this.LLILLJJLI = null;
                this.LLILLL = 2;
                if (accessibilityEventTrackingMonitor.track(context, true, this) == objLJFF) {
                    C1C7U.LIZIZ("AccessibilityEventTrackingMonitor@71c7.init$1$onStart$1");
                    return objLJFF;
                }
                mutex.LIZIZ(null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("AccessibilityEventTrackingMonitor@71c7.init$1$onStart$1");
                return unit2;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                mutex.LIZIZ(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
