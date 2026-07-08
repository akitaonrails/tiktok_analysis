package X;

import java.util.Set;

/* JADX INFO: renamed from: X.12qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19883012qq<E> extends AbstractC19882912qp<E> implements Set<E> {
    @Override // X.AbstractC19882912qp
    /* JADX INFO: renamed from: LJJ, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC19875112pZ LJIIL();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return LJIIL().hashCode();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this && !LJIIL().equals(obj)) {
            return false;
        }
        return true;
    }
}
