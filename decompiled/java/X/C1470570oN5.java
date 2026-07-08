package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0oN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470570oN5 implements InterfaceC1470540oN2<InterfaceC1470560oN4> {
    public final int LIZ = C1474810oTv.LLJI().pluginPoolSize;
    public final List<InterfaceC1470560oN4> LIZIZ = new ArrayList();
    public final Lock LIZJ = new ReentrantLock();

    @Override // X.InterfaceC1470540oN2
    public final /* synthetic */ boolean isAvailable() {
        return true;
    }

    @Override // X.InterfaceC1470540oN2
    public final boolean LIZ(InterfaceC1470600oN8 interfaceC1470600oN8) {
        InterfaceC1470560oN4 interfaceC1470560oN4 = (InterfaceC1470560oN4) interfaceC1470600oN8;
        ((ReentrantLock) this.LIZJ).lock();
        if (interfaceC1470560oN4 != null) {
            try {
                if (interfaceC1470560oN4.isRecyclable() && ((ArrayList) this.LIZIZ).size() < this.LIZ) {
                    ((ArrayList) this.LIZIZ).size();
                    ((ArrayList) this.LIZIZ).add(interfaceC1470560oN4);
                    ((ReentrantLock) this.LIZJ).unlock();
                    return true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) this.LIZJ).unlock();
                throw th;
            }
        }
        ((ReentrantLock) this.LIZJ).unlock();
        return false;
    }

    @Override // X.InterfaceC1470540oN2
    public final boolean LIZJ(InterfaceC1470600oN8 interfaceC1470600oN8) {
        ((ReentrantLock) this.LIZJ).lock();
        try {
            boolean zRemove = ((ArrayList) this.LIZIZ).remove(interfaceC1470600oN8);
            ((ReentrantLock) this.LIZJ).unlock();
            return zRemove;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZJ).unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1470540oN2
    public final InterfaceC1470600oN8 LIZIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        ((ReentrantLock) this.LIZJ).lock();
        try {
            if (((ArrayList) this.LIZIZ).isEmpty()) {
                ((ReentrantLock) this.LIZJ).unlock();
                return null;
            }
            InterfaceC1470560oN4 interfaceC1470560oN4 = (InterfaceC1470560oN4) ((ArrayList) this.LIZIZ).remove(0);
            interfaceC1470560oN4.setPool(this);
            interfaceC1470560oN4.update(abstractC1470590oN7, interfaceC1469660oLc);
            ((ReentrantLock) this.LIZJ).unlock();
            return interfaceC1470560oN4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZJ).unlock();
            throw th;
        }
    }
}
