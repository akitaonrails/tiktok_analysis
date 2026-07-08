package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872530YKt extends ArrayList<C869590Y9l> implements InterfaceC872570YKx {
    public static final C0YL1 LLILLL = new Comparator<C869590Y9l>() { // from class: X.0YL1
        @Override // java.util.Comparator
        public final int compare(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2) {
            C869590Y9l c869590Y9l3 = c869590Y9l;
            C869590Y9l c869590Y9l4 = c869590Y9l2;
            if (c869590Y9l3 == c869590Y9l4) {
                return 0;
            }
            if (c869590Y9l3 == null) {
                return 1;
            }
            if (c869590Y9l4 == null) {
                return -1;
            }
            int iCompare = Long.compare(c869590Y9l4.getOrderIndex(), c869590Y9l3.getOrderIndex());
            if (iCompare != 0) {
                return iCompare;
            }
            return Long.compare(c869590Y9l4.getCreatedAt(), c869590Y9l3.getCreatedAt());
        }
    };
    public final boolean LL;
    public Map<String, C869590Y9l> LLILLJJLI;

    @Override // X.InterfaceC872570YKx
    public List<C869590Y9l> toListCopy() {
        return new ArrayList(this);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, X.InterfaceC872570YKx
    public void clear() {
        super.clear();
        Map<String, C869590Y9l> map = this.LLILLJJLI;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public C872530YKt(boolean z) {
        this.LL = z;
    }

    public static boolean LJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && !c869590Y9l.isDeleted() && c869590Y9l.getSvrStatus() == 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(C869590Y9l c869590Y9l) {
        int iIndexOf = indexOf(c869590Y9l);
        if (iIndexOf < 0) {
            add(0, c869590Y9l);
            if (this.LLILLJJLI != null && c869590Y9l.getUuid() != null) {
                ((HashMap) this.LLILLJJLI).put(c869590Y9l.getUuid(), c869590Y9l);
            }
            return this.LL;
        }
        return LJFF(c869590Y9l, iIndexOf);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(C869590Y9l c869590Y9l) {
        if (LIZJ(c869590Y9l)) {
            Collections.sort(this, LLILLL);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC872570YKx
    public void addAll(List<C869590Y9l> list) {
        if (list != null && !list.isEmpty()) {
            for (C869590Y9l c869590Y9l : list) {
                if (LJ(c869590Y9l)) {
                    super.add(c869590Y9l);
                }
            }
        }
    }

    @Override // X.InterfaceC872570YKx
    public void addList(List<C869590Y9l> list) {
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            for (C869590Y9l c869590Y9l : list) {
                if (LJ(c869590Y9l) && LIZJ(c869590Y9l)) {
                    z = true;
                }
            }
            if (z) {
                Collections.sort(this, LLILLL);
            }
        }
    }

    @Override // X.InterfaceC872570YKx
    public void appendList(List<C869590Y9l> list) {
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            for (C869590Y9l c869590Y9l : list) {
                if (LJ(c869590Y9l)) {
                    int iIndexOf = indexOf(c869590Y9l);
                    if (iIndexOf < 0) {
                        super.add(c869590Y9l);
                        if (this.LLILLJJLI != null && c869590Y9l.getUuid() != null) {
                            ((HashMap) this.LLILLJJLI).put(c869590Y9l.getUuid(), c869590Y9l);
                        }
                    } else if (LJFF(c869590Y9l, iIndexOf)) {
                        z = true;
                    }
                }
            }
            if (z) {
                Collections.sort(this, LLILLL);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        if (r2 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (remove(r2) == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        return r3;
     */
    @Override // X.InterfaceC872570YKx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean delete(X.C869590Y9l r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            if (r5 != 0) goto L6
            monitor-exit(r4)
            return r3
        L6:
            r2 = 0
        L7:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L2d
            r1 = -1
            if (r2 >= r0) goto L2b
            java.lang.Object r0 = r4.get(r2)     // Catch: java.lang.Throwable -> L2d
            X.0Y9l r0 = (X.C869590Y9l) r0     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L1d
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L1d
            goto L20
        L1d:
            int r2 = r2 + 1
            goto L7
        L20:
            if (r2 == r1) goto L2b
            X.0Y9l r0 = r4.remove(r2)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L29
            r3 = 1
        L29:
            monitor-exit(r4)
            return r3
        L2b:
            monitor-exit(r4)
            return r3
        L2d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872530YKt.delete(X.0Y9l):boolean");
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, X.InterfaceC872570YKx
    public /* bridge */ /* synthetic */ C869590Y9l get(int i) {
        return get(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        boolean zRemove = super.remove(obj);
        if (this.LLILLJJLI != null && zRemove && (obj instanceof C869590Y9l)) {
            C869590Y9l c869590Y9l = (C869590Y9l) obj;
            if (c869590Y9l.getUuid() != null) {
                ((HashMap) this.LLILLJJLI).remove(c869590Y9l.getUuid());
            }
        }
        return zRemove;
    }

    @Override // X.InterfaceC872570YKx
    public void replaceList(List<C869590Y9l> list) {
        Map<String, C869590Y9l> map;
        Object obj;
        if (list.isEmpty()) {
            clear();
            return;
        }
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new HashMap();
            for (C869590Y9l c869590Y9l : new ArrayList(this)) {
                if (c869590Y9l.getUuid() != null) {
                    ((HashMap) this.LLILLJJLI).put(c869590Y9l.getUuid(), c869590Y9l);
                }
            }
        }
        ArrayList<C869590Y9l> arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l2 : list) {
            String uuid = c869590Y9l2.getUuid();
            if (uuid != null && (map = this.LLILLJJLI) != null && (obj = ((HashMap) map).get(uuid)) != null) {
                arrayList.add(obj);
            } else if (LJ(c869590Y9l2)) {
                arrayList.add(c869590Y9l2);
            }
        }
        clear();
        ((HashMap) this.LLILLJJLI).clear();
        Collections.sort(arrayList, LLILLL);
        addAll((List<C869590Y9l>) arrayList);
        for (C869590Y9l c869590Y9l3 : arrayList) {
            if (c869590Y9l3.getUuid() != null) {
                ((HashMap) this.LLILLJJLI).put(c869590Y9l3.getUuid(), c869590Y9l3);
            }
        }
    }

    @Override // X.InterfaceC872570YKx
    public boolean update(C869590Y9l c869590Y9l) {
        boolean zLJFF;
        int iIndexOf = indexOf(c869590Y9l);
        if (iIndexOf < 0) {
            zLJFF = this.LL;
        } else {
            zLJFF = LJFF(c869590Y9l, iIndexOf);
        }
        if (zLJFF) {
            Collections.sort(this, LLILLL);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC872570YKx
    public void updateList(List<C869590Y9l> list) {
        boolean zLJFF;
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            for (C869590Y9l c869590Y9l : list) {
                if (LJ(c869590Y9l)) {
                    int iIndexOf = indexOf(c869590Y9l);
                    if (iIndexOf < 0) {
                        zLJFF = this.LL;
                    } else {
                        zLJFF = LJFF(c869590Y9l, iIndexOf);
                    }
                    if (zLJFF) {
                        z = true;
                    }
                }
            }
            if (z) {
                Collections.sort(this, LLILLL);
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public C869590Y9l remove(int i) {
        C869590Y9l c869590Y9l = (C869590Y9l) super.remove(i);
        if (this.LLILLJJLI != null && c869590Y9l != null && c869590Y9l.getUuid() != null) {
            ((HashMap) this.LLILLJJLI).remove(c869590Y9l.getUuid());
        }
        return c869590Y9l;
    }

    public C872530YKt(Collection<? extends C869590Y9l> collection, boolean z) {
        super(collection);
        this.LL = z;
    }

    public final boolean LJFF(C869590Y9l c869590Y9l, int i) {
        C869590Y9l c869590Y9l2 = get(i);
        set(i, c869590Y9l);
        if (this.LLILLJJLI != null) {
            if (c869590Y9l2 != null && c869590Y9l2.getUuid() != null) {
                ((HashMap) this.LLILLJJLI).remove(c869590Y9l2.getUuid());
            }
            if (c869590Y9l.getUuid() != null) {
                ((HashMap) this.LLILLJJLI).put(c869590Y9l.getUuid(), c869590Y9l);
            }
        }
        if (c869590Y9l2 != null && c869590Y9l2.getOrderIndex() != c869590Y9l.getOrderIndex()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC872570YKx
    public InterfaceC872570YKx toSubList(int i, int i2) {
        return new C872530YKt(subList(i, i2), this.LL);
    }
}
