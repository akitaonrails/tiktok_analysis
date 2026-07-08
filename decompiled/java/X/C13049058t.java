package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.event.monitor.EventMonitor$monitorClickEnter$job$1", f = "EventMonitor.kt", l = {115}, m = "invokeSuspend")
public final class C13049058t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ C13050058u LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13049058t(long j, String str, Object obj, C13050058u c13050058u, InterfaceC1364105Vn<? super C13049058t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = obj;
        this.LLILZIL = c13050058u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13049058t(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EventMonitor@182.monitorClickEnter$job$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EventMonitor@182.monitorClickEnter$job$1");
                return objLJFF;
            }
        }
        Object obj2 = this.LLILZ;
        if (obj2 != null) {
            C13048058s.LIZ.getClass();
            C13048058s.LIZIZ(obj2, "EC_CLICK_MISS_ENTER");
        }
        LinkedList<C13050058u> linkedList = C13048058s.LJII;
        C13050058u c13050058u = this.LLILZIL;
        synchronized (linkedList) {
            try {
                linkedList.remove(c13050058u);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C09AE c09ae = this.LLILZIL.LIZJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLILZIL.LIZJ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventMonitor@182.monitorClickEnter$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
