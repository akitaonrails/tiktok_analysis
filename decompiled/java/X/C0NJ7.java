package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.state.store.PDPOptionalStateDelegate$setValue$1", f = "PDPOptionalStateDelegate.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0NJ7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NJ8<T> LLILLJJLI;
    public final /* synthetic */ T LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJ7(C0NJ8<T> c0nj8, T t, InterfaceC1364105Vn<? super C0NJ7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nj8;
        this.LLILLL = t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJ7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int readHoldCount;
        C1C7U.LIZ("PDPOptionalStateDelegate@81cb.setValue$1");
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
            C0NJ8<T> c0nj8 = this.LLILLJJLI;
            C0NJE c0nje = c0nj8.LL;
            String str = c0nj8.LLILLJJLI;
            Object obj2 = this.LLILLL;
            this.LL = 1;
            ReentrantReadWriteLock reentrantReadWriteLock = c0nje.LIZ;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            } else {
                readHoldCount = 0;
            }
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                c0nje.LIZIZ.put(str, obj2);
                while (i2 < readHoldCount) {
                    lock.lock();
                    i2++;
                }
                writeLock.unlock();
                Object objLIZLLL = c0nje.LIZLLL(this);
                if (objLIZLLL != C099R.LJFF()) {
                    objLIZLLL = Unit.LIZ;
                }
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("PDPOptionalStateDelegate@81cb.setValue$1");
                    return objLJFF;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i2 < readHoldCount) {
                    lock.lock();
                    i2++;
                }
                writeLock.unlock();
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PDPOptionalStateDelegate@81cb.setValue$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
