package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872520YKs implements InterfaceC868420Y4y, InterfaceC870610YDj {
    public final String LL;
    public final int[] LLILLJJLI;
    public final int LLILLL;
    public final C872530YKt LLILZ;
    public InterfaceC868420Y4y LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C0YEM LLIZLLLIL;
    public final C0Y9J LLJ;
    public final Boolean LLJI;

    @Override // X.InterfaceC870610YDj
    public final void LJI() {
        this.LLILZIL = null;
        this.LLILZ.clear();
        this.LLIZLLLIL.LJIIZILJ().getDomain().LIZ.LJII(this.LL, this);
    }

    @Override // X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void nc(List<C869590Y9l> list) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.InterfaceC870610YDj
    public final void LJII() {
        if (this.LLIZ) {
            this.LLIZLLLIL.LIZLLL().LJIIJJI("MessageBrowserModel initMessageList querying now");
        } else {
            this.LLIZ = true;
            this.LLIZLLLIL.LJIIJJI().LIZIZ(new C914050ZtT(this, 7), new C914030ZtR(this, 8));
        }
    }

    @Override // X.InterfaceC870610YDj
    public final List<C869590Y9l> LJIIIIZZ() {
        return this.LLILZ.toListCopy();
    }

    @Override // X.InterfaceC870610YDj
    public final void LJJIII() {
        if (this.LLIZ) {
            this.LLIZLLLIL.LIZLLL().LJIIJJI("MessageBrowserModel loadOlderMessageList querying now");
        } else {
            this.LLIZ = true;
            this.LLIZLLLIL.LJIIJJI().LIZIZ(new C914050ZtT(this, 9), new C914030ZtR(this, 10));
        }
    }

    @Override // X.InterfaceC870610YDj
    public final void LJJJI() {
        if (!this.LLILZLL && !this.LLIZ) {
            this.LLIZ = true;
            this.LLIZLLLIL.LJIIJJI().LIZIZ(new C914050ZtT(this, 8), new C914030ZtR(this, 9));
            return;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LLIZLLLIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageBrowserModel loadNewerMessageList uptonew or querying:");
        sbLIZ.append(this.LLIZ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC870610YDj
    public final void LJJJIL(InterfaceC868420Y4y interfaceC868420Y4y) {
        this.LLILZIL = interfaceC868420Y4y;
        this.LLIZLLLIL.LJIIZILJ().getDomain().LIZ.LJIIL(this.LL, this);
    }

    @Override // X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && this.LLILZIL != null) {
            this.LLILZ.update(c869590Y9l);
            this.LLILZIL.LLILZ(c869590Y9l);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && this.LLILZIL != null) {
            this.LLIZLLLIL.LJIIIZ().getClass();
            this.LLILZIL.Re(c869590Y9l);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        InterfaceC868420Y4y interfaceC868420Y4y;
        if (this.LLILZ.delete(c869590Y9l) && (interfaceC868420Y4y = this.LLILZIL) != null) {
            interfaceC868420Y4y.mf(c869590Y9l);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
        if (this.LLJI.booleanValue() && c869590Y9l != null && this.LLILZIL != null) {
            this.LLILZ.add(c869590Y9l);
            this.LLILZIL.Jk(c869590Y9l, i);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
        if (list != null && !list.isEmpty()) {
            this.LLILZ.appendList(list);
        }
        InterfaceC868420Y4y interfaceC868420Y4y = this.LLILZIL;
        if (interfaceC868420Y4y != null) {
            interfaceC868420Y4y.Us(list, enumC872590YKz);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void kl(List<C869590Y9l> list, List<C869590Y9l> list2) {
        if (list != null && !list.isEmpty()) {
            this.LLILZ.replaceList(list);
        }
        InterfaceC868420Y4y interfaceC868420Y4y = this.LLILZIL;
        if (interfaceC868420Y4y != null) {
            interfaceC868420Y4y.kl(list, list2);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
        InterfaceC868420Y4y interfaceC868420Y4y = this.LLILZIL;
        if (interfaceC868420Y4y != null) {
            interfaceC868420Y4y.u6(list, z);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        if (this.LLJI.booleanValue() && c869590Y9l != null && this.LLILZIL != null && i == C0YIF.LIZ) {
            this.LLILZ.add(c869590Y9l);
            this.LLILZIL.Ip(i, c0yc9, c869590Y9l);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        if (this.LLJI.booleanValue()) {
            if (list != null) {
                this.LLILZ.addList(list);
            }
            InterfaceC868420Y4y interfaceC868420Y4y = this.LLILZIL;
            if (interfaceC868420Y4y != null) {
                interfaceC868420Y4y.d5(list, i, c0y7p);
            }
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        InterfaceC868420Y4y interfaceC868420Y4y = this.LLILZIL;
        if (interfaceC868420Y4y != null) {
            interfaceC868420Y4y.a(1, str, list, l);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        if (this.LLJI.booleanValue()) {
            this.LLILZ.updateList(list);
            InterfaceC868420Y4y interfaceC868420Y4y = this.LLILZIL;
            if (interfaceC868420Y4y != null) {
                interfaceC868420Y4y.gb(c0y3i, list, map, i);
            }
        }
    }

    public C872520YKs(C0YEM c0yem, String str, int[] iArr, int i, List<C869590Y9l> list, Boolean bool) {
        this.LL = str;
        this.LLILLJJLI = iArr;
        this.LLILLL = i;
        this.LLJI = bool;
        C872530YKt c872530YKt = new C872530YKt(false);
        this.LLILZ = c872530YKt;
        if (list != null && !list.isEmpty()) {
            c872530YKt.addAll(list);
        }
        this.LLILZLL = false;
        this.LLIZLLLIL = c0yem;
        this.LLJ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
    }
}
