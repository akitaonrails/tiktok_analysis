package X;

import X.C1BU1;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.1BTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2205581BTw<T extends C1BU1> implements InterfaceC2205541BTs<T> {
    public final ReadWriteLock LIZ = new ReentrantReadWriteLock();

    @Override // X.InterfaceC2205541BTs
    public final void lock() {
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
    }

    @Override // X.InterfaceC2205541BTs
    public final void unlock() {
        ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
    }
}
