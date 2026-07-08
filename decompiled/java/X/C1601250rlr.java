package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rlr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601250rlr extends ArrayList<Aweme> {
    public static final int $stable = 8;
    public final C1160560gJ4 LL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Aweme> iterator() {
        return new C1601260rls(super.iterator(), this.LL);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Aweme)) {
            return false;
        }
        return contains((Aweme) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Aweme)) {
            return -1;
        }
        return indexOf((Aweme) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Aweme)) {
            return -1;
        }
        return lastIndexOf((Aweme) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Aweme)) {
            return false;
        }
        return remove((Aweme) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            this.LL.LJ((Aweme) it2.next());
        }
        return !collection.isEmpty();
    }

    public Aweme removeAt(int i) {
        Aweme aweme = get(i);
        this.LL.LJ(aweme);
        return aweme;
    }

    public /* bridge */ boolean contains(Aweme aweme) {
        return super.contains((Object) aweme);
    }

    public /* bridge */ int indexOf(Aweme aweme) {
        return super.indexOf((Object) aweme);
    }

    public /* bridge */ int lastIndexOf(Aweme aweme) {
        return super.lastIndexOf((Object) aweme);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ Aweme remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(Aweme aweme) {
        return super.remove((Object) aweme);
    }

    public C1601250rlr(List<? extends Aweme> list, C1160560gJ4 c1160560gJ4) {
        super(list);
        this.LL = c1160560gJ4;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, Aweme aweme) {
        this.LL.LIZLLL(i, aweme);
    }
}
