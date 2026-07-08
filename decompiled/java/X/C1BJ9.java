package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1BJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJ9 extends AbstractList<GraphRequest> {
    public static final AtomicInteger LLILZ = new AtomicInteger();
    public BPEAHandler LL;
    public final List<GraphRequest> LLILLJJLI;
    public final List<C1BK9> LLILLL;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LLILLJJLI.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLJJLI.size();
    }

    public C1BJ9(GraphRequest... graphRequestArr) {
        LLILZ.incrementAndGet();
        this.LLILLL = new ArrayList();
        this.LLILLJJLI = new ArrayList(Arrays.asList(graphRequestArr));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        return this.LLILLJJLI.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null && !(obj instanceof GraphRequest)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return ((ArrayList) this.LLILLJJLI).get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null && !(obj instanceof GraphRequest)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null && !(obj instanceof GraphRequest)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null && !(obj instanceof GraphRequest)) {
            return false;
        }
        return super.remove(obj);
    }

    public C1BJ9(Collection<GraphRequest> collection) {
        LLILZ.incrementAndGet();
        this.LLILLL = new ArrayList();
        this.LLILLJJLI = new ArrayList(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.LLILLJJLI.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.LLILLJJLI.add(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.LLILLJJLI.set(i, obj);
    }
}
