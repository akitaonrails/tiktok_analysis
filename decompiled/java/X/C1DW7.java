package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1DW7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DW7 implements C1DW6 {
    public final C1DW6 LL;
    public final List<C1DW6> LLILLJJLI;

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    public C1DW7(C1DW6 c1dw6) {
        this.LL = c1dw6;
        this.LLILLJJLI = new CopyOnWriteArrayList(Collections.singletonList(c1dw6));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        Iterator<C1DW6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLILZ(c869590Y9l);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
        Iterator<C1DW6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().Re(c869590Y9l);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        Iterator<C1DW6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().mf(c869590Y9l);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
        Iterator<C1DW6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().Jk(c869590Y9l, i);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
        Iterator<C1DW6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().Us(list, enumC872590YKz);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        Iterator<C1DW6> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().kl(list, list2);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).su(c869590Y9l, z);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).u6(list, z);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        if (c0yc9 != null) {
            c0yc9.LIZIZ();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).Ip(i, c0yc9, c869590Y9l);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).d5(list, i, c0y7p);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).hk(c0y3i.LIZ(), i, c0ya6);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).a(i, str, list, l);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).gb(c0y3i.LIZ(), list, map, i);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DW6) it2.next()).mp(c0y3i.LIZ(), c869590Y9l, map, map2, l, l2);
        }
    }
}
