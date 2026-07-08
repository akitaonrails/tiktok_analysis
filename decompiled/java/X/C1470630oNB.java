package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideo.TTKPlayerV2;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0oNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1470630oNB implements InterfaceC1470540oN2<InterfaceC1470660oNE> {
    public final int LIZ = C1474810oTv.LLJI().playerPoolSize;
    public final Deque<InterfaceC1470660oNE> LIZIZ = new LinkedList();
    public final Lock LIZJ = new ReentrantLock();

    public boolean LIZLLL(AbstractC1470590oN7 abstractC1470590oN7) {
        return this instanceof C1470700oNI;
    }

    @Override // X.InterfaceC1470540oN2
    public final boolean isAvailable() {
        ((ReentrantLock) this.LIZJ).lock();
        try {
            boolean z = ((LinkedList) this.LIZIZ).size() < this.LIZ;
            ((ReentrantLock) this.LIZJ).unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZJ).unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1470540oN2
    public final boolean LIZ(InterfaceC1470600oN8 interfaceC1470600oN8) {
        InterfaceC1470660oNE interfaceC1470660oNE = (InterfaceC1470660oNE) interfaceC1470600oN8;
        ((ReentrantLock) this.LIZJ).lock();
        try {
            if (interfaceC1470660oNE.isRecyclable() && ((LinkedList) this.LIZIZ).size() < this.LIZ) {
                if (!((LinkedList) this.LIZIZ).contains(interfaceC1470660oNE)) {
                    interfaceC1470660oNE.clearModules();
                    ((LinkedList) this.LIZIZ).offer(interfaceC1470660oNE);
                }
                ((ReentrantLock) this.LIZJ).unlock();
                return true;
            }
            ((ReentrantLock) this.LIZJ).unlock();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZJ).unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1470540oN2
    public final boolean LIZJ(InterfaceC1470600oN8 interfaceC1470600oN8) {
        ((ReentrantLock) this.LIZJ).lock();
        try {
            boolean zRemove = ((LinkedList) this.LIZIZ).remove(interfaceC1470600oN8);
            ((ReentrantLock) this.LIZJ).unlock();
            return zRemove;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZJ).unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1470540oN2
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC1470660oNE LIZIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        InterfaceC1470660oNE tTKPlayerV2;
        if (!LIZLLL(abstractC1470590oN7)) {
            return null;
        }
        ((ReentrantLock) this.LIZJ).lock();
        try {
            if (!this.LIZIZ.isEmpty()) {
                tTKPlayerV2 = (InterfaceC1470660oNE) ((LinkedList) this.LIZIZ).poll();
                tTKPlayerV2.update(abstractC1470590oN7, interfaceC1469660oLc);
            } else {
                tTKPlayerV2 = new TTKPlayerV2(abstractC1470590oN7, interfaceC1469660oLc);
            }
            tTKPlayerV2.setPool(this);
            ((ReentrantLock) this.LIZJ).unlock();
            return tTKPlayerV2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZJ).unlock();
            throw th;
        }
    }
}
