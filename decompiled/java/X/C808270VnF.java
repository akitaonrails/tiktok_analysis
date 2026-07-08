package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0VnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMContactServiceImpl$onSDKLogout$1", f = "IMContactServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C808270VnF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C808270VnF(InterfaceC1364105Vn<? super C808270VnF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C808270VnF(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int readHoldCount;
        C1C7U.LIZ("IMContactServiceImpl@37c5.onSDKLogout$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1BG1.LIZ.getClass();
        C191862104e c191862104eLJ = C191871104n.LJ();
        C1725006pE c1725006pE = C1BG1.LJIJI;
        c191862104eLJ.getClass();
        C191862104e.LIZLLL(c1725006pE);
        C1BG1.LJIILIIL().clear();
        C11JF c11jf = C1BG1.LJIIZILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1BG1.LJIIZILJ = null;
        C1BG1.LJJI();
        IMContactDatabase.LL.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = IMContactDatabase.LLILZIL;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            IMContactDatabase.LLILZ = null;
            IMContactDatabase.LLILLJJLI = null;
            IMContactDatabase.LLILLL = null;
            C805480Vik.LIZIZ = null;
            C808280VnG.LIZIZ = null;
            C808290VnH.LIZIZ = null;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMContactServiceImpl@37c5.onSDKLogout$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C808270VnF(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
