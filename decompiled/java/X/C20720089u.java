package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.089u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20720089u<T> implements Iterable<T>, C03W4 {
    public final /* synthetic */ Object[] LL;

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C089E(this.LL);
    }

    public C20720089u(Object[] objArr) {
        this.LL = objArr;
    }
}
