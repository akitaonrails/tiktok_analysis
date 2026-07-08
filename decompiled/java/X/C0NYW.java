package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0NYW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NYW extends LinkedList<C595220NWe> {
    public final C595330NWp LL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    public C0NYW(C595330NWp c595330NWp) {
        this.LL = c595330NWp;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C595220NWe)) {
            return false;
        }
        return contains((C595220NWe) obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C595220NWe)) {
            return -1;
        }
        return indexOf((C595220NWe) obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C595220NWe)) {
            return -1;
        }
        return lastIndexOf((C595220NWe) obj);
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public boolean offer(C595220NWe c595220NWe) {
        boolean zOffer;
        synchronized (this) {
            while (super.size() > C595320NWo.LIZ(this.LL).LJIIL) {
                try {
                    poll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            zOffer = super.offer(c595220NWe);
        }
        return zOffer;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C595220NWe)) {
            return false;
        }
        return remove((C595220NWe) obj);
    }

    public /* bridge */ C595220NWe removeAt(int i) {
        return remove(i);
    }

    public /* bridge */ boolean contains(C595220NWe c595220NWe) {
        return super.contains((Object) c595220NWe);
    }

    public /* bridge */ int indexOf(C595220NWe c595220NWe) {
        return super.indexOf((Object) c595220NWe);
    }

    public /* bridge */ int lastIndexOf(C595220NWe c595220NWe) {
        return super.lastIndexOf((Object) c595220NWe);
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ C595220NWe remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(C595220NWe c595220NWe) {
        return super.remove((Object) c595220NWe);
    }
}
