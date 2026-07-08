package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0sp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641710sp7 implements List<ComposerNode>, InterfaceC1687470u0v {
    public final /* synthetic */ List<ComposerNode> LL;
    public final /* synthetic */ C1641680sp4 LLILLJJLI;

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends ComposerNode> collection) {
        return this.LL.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends ComposerNode> collection) {
        return this.LL.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.LL.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<ComposerNode> iterator() {
        return this.LL.iterator();
    }

    @Override // java.util.List
    public final ListIterator<ComposerNode> listIterator() {
        return this.LL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<ComposerNode> listIterator(int i) {
        return this.LL.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.LL.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.LL.retainAll(collection);
    }

    @Override // java.util.List
    public final List<ComposerNode> subList(int i, int i2) {
        return this.LL.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ((ArrayList) this.LLILLJJLI.LLIZ).clear();
        this.LLILLJJLI.LLJ.setValue(this);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LL.size();
    }

    public C1641710sp7(C1641680sp4 c1641680sp4) {
        this.LLILLJJLI = c1641680sp4;
        this.LL = c1641680sp4.LLIZ;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd = ((ArrayList) this.LLILLJJLI.LLIZ).add(obj);
        this.LLILLJJLI.LLJ.setValue(this);
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof ComposerNode)) {
            return false;
        }
        return this.LL.contains(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.effectmanager.effect.model.ComposerNode, java.lang.Object] */
    @Override // java.util.List
    public final ComposerNode get(int i) {
        return ListProtector.get(this.LL, i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof ComposerNode)) {
            return -1;
        }
        return this.LL.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof ComposerNode)) {
            return -1;
        }
        return this.LL.lastIndexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof ComposerNode)) {
            return false;
        }
        boolean zRemove = ((ArrayList) this.LLILLJJLI.LLIZ).remove(obj);
        this.LLILLJJLI.LLJ.setValue(this);
        return zRemove;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.effectmanager.effect.model.ComposerNode, java.lang.Object] */
    @Override // java.util.List
    public final ComposerNode remove(int i) {
        return ListProtector.remove(this.LL, i);
    }

    @Override // java.util.List
    public final void add(int i, ComposerNode composerNode) {
        ListProtector.add(this.LL, i, composerNode);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.effectmanager.effect.model.ComposerNode, java.lang.Object] */
    @Override // java.util.List
    public final ComposerNode set(int i, ComposerNode composerNode) {
        return ListProtector.set(this.LL, i, composerNode);
    }
}
