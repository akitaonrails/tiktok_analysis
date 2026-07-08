package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19920612wu extends AbstractC19887212rW<String> implements InterfaceC19921312x1, RandomAccess {
    public static final C19920612wu LLILLL = new C19920612wu();
    public final List<Object> LLILLJJLI;

    public C19920612wu() {
        super(false);
        this.LLILLJJLI = Collections.emptyList();
    }

    @Override // X.InterfaceC19921312x1
    public final InterfaceC19921312x1 LJJJ() {
        return this.LL ? new C19920712wv(this) : this;
    }

    @Override // X.InterfaceC19921312x1
    public final List<?> LJJJJJ() {
        return Collections.unmodifiableList(this.LLILLJJLI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        LIZJ();
        this.LLILLJJLI.clear();
        ((AbstractList) this).modCount++;
    }

    public C19920612wu(C19920612wu c19920612wu) {
        super(true);
        this.LLILLJJLI = new ArrayList(c19920612wu.size());
        addAll(c19920612wu);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC19922812xG) {
            AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
            String stringUtf8 = abstractC19922812xG.toStringUtf8();
            if (abstractC19922812xG.isValidUtf8()) {
                ListProtector.set(this.LLILLJJLI, i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C19922012x8.LIZ);
        if (C19920112wp.LIZ.LJ(0, bArr, 0, bArr.length) == 0) {
            ListProtector.set(this.LLILLJJLI, i, str);
        }
        return str;
    }

    public final AbstractC19922812xG LJFF(int i) {
        AbstractC19922812xG abstractC19922812xGCopyFrom;
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (obj instanceof AbstractC19922812xG) {
            abstractC19922812xGCopyFrom = (AbstractC19922812xG) obj;
        } else if (obj instanceof String) {
            abstractC19922812xGCopyFrom = AbstractC19922812xG.copyFromUtf8((String) obj);
        } else {
            abstractC19922812xGCopyFrom = AbstractC19922812xG.copyFrom((byte[]) obj);
        }
        if (abstractC19922812xGCopyFrom != obj) {
            ListProtector.set(this.LLILLJJLI, i, abstractC19922812xGCopyFrom);
        }
        return abstractC19922812xGCopyFrom;
    }

    @Override // X.InterfaceC19921012wy
    /* JADX INFO: renamed from: LJIILL */
    public final InterfaceC19921012wy LJIILL2(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.LLILLJJLI);
            return new C19920612wu((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // X.InterfaceC19921312x1
    public final Object LJJJLL(int i) {
        return ListProtector.get(this.LLILLJJLI, i);
    }

    @Override // X.InterfaceC19921312x1
    public final void LJL(AbstractC19922812xG abstractC19922812xG) {
        LIZJ();
        this.LLILLJJLI.add(abstractC19922812xG);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        LIZJ();
        this.LLILLJJLI.add(obj);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        Object objRemove = ListProtector.remove(this.LLILLJJLI, i);
        ((AbstractList) this).modCount++;
        if (!(objRemove instanceof String)) {
            if (objRemove instanceof AbstractC19922812xG) {
                return ((AbstractC19922812xG) objRemove).toStringUtf8();
            }
            return new String((byte[]) objRemove, C19922012x8.LIZ);
        }
        return objRemove;
    }

    public C19920612wu(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public C19920612wu(ArrayList<Object> arrayList) {
        super(true);
        this.LLILLJJLI = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        LIZJ();
        ListProtector.add(this.LLILLJJLI, i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        LIZJ();
        if (collection instanceof InterfaceC19921312x1) {
            collection = ((InterfaceC19921312x1) collection).LJJJJJ();
        }
        boolean zAddAll = this.LLILLJJLI.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        LIZJ();
        Object obj2 = ListProtector.set(this.LLILLJJLI, i, obj);
        if (!(obj2 instanceof String)) {
            if (obj2 instanceof AbstractC19922812xG) {
                return ((AbstractC19922812xG) obj2).toStringUtf8();
            }
            return new String((byte[]) obj2, C19922012x8.LIZ);
        }
        return obj2;
    }
}
