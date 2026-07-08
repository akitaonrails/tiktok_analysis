package X;

import X.InterfaceC1408530ml1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0kaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325160kaY<T extends InterfaceC1408530ml1> extends LinkedList<T> implements Queue<T> {
    public final HashSet<Class<T>> LL = new HashSet<>();
    public final ReentrantLock LLILLJJLI = new ReentrantLock();

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final T poll() {
        this.LLILLJJLI.lock();
        try {
            T t = (T) super.poll();
            if (t != null) {
                this.LL.remove(t.getClass());
            } else {
                t = null;
            }
            this.LLILLJJLI.unlock();
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.unlock();
            throw th;
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LLILLJJLI.lock();
        try {
            this.LL.clear();
            super.clear();
            this.LLILLJJLI.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.unlock();
            throw th;
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final boolean offer(T t) {
        this.LLILLJJLI.lock();
        try {
            if (this.LL.add(t.getClass())) {
                add(t);
                this.LLILLJJLI.unlock();
                return true;
            }
            this.LLILLJJLI.unlock();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.unlock();
            throw th;
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC1408530ml1)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC1408530ml1)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC1408530ml1)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof InterfaceC1408530ml1)) {
            return false;
        }
        return super.remove(obj);
    }
}
