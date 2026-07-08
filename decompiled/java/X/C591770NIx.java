package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.state.store.PDPPageStateStore$getValueOrDefault$1", f = "PDPPageStateStore.kt", l = {73}, m = "invokeSuspend")
public final class C591770NIx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ C0NJ9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591770NIx(C0NJ9 c0nj9, String str, Object obj, InterfaceC1364105Vn<? super C591770NIx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nj9;
        this.LLILLL = str;
        this.LLILZ = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591770NIx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPPageStateStore@55c5.getValueOrDefault$1");
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
            C0NJE c0nje = this.LLILLJJLI.LIZ;
            String str = this.LLILLL;
            Object obj2 = this.LLILZ;
            this.LL = 1;
            ReentrantReadWriteLock.ReadLock lock = c0nje.LIZ.readLock();
            lock.lock();
            try {
                obj = ((LinkedHashMap) c0nje.LIZIZ).get(str);
                if (obj == null) {
                    obj = null;
                }
                if (obj == null) {
                    obj = obj2;
                }
                lock.unlock();
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PDPPageStateStore@55c5.getValueOrDefault$1");
                    return objLJFF;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        }
        if (obj == null) {
            obj = this.LLILZ;
        }
        C1C7U.LIZIZ("PDPPageStateStore@55c5.getValueOrDefault$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
