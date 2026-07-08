package X;

import java.util.Collection;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13E1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public interface C13E1<E> extends C13D5<E>, Collection, C03W4 {
    C13E1 LJIILLIIL(AwS609S0100000_30 awS609S0100000_30);

    C13E1<E> LJZI(int i);

    C13E1<E> add(int i, E e);

    @Override // java.util.List, X.C13E1
    C13E1<E> add(E e);

    @Override // java.util.List, X.C13E1
    C13E1<E> addAll(Collection<? extends E> collection);

    C19975613Du builder();

    @Override // java.util.List, X.C13E1
    C13E1<E> remove(E e);

    @Override // java.util.List, X.C13E1
    C13E1<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    C13E1<E> set(int i, E e);
}
