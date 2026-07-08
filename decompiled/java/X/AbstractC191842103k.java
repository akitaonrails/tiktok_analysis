package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.103k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC191842103k extends AbstractC191843103l {
    public final List<AbstractC191843103l> LLILLJJLI;

    @Override // X.AbstractC191843103l
    public final void LJII() {
        Iterator<AbstractC191843103l> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJII();
        }
    }

    @Override // X.AbstractC191843103l
    public final void LJIIIIZZ() {
        Iterator<AbstractC191843103l> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ();
        }
    }

    @Override // X.AbstractC191843103l
    public final void LJIIIZ() {
        Iterator<AbstractC191843103l> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ();
        }
    }

    @Override // X.AbstractC191843103l
    public final void LJIIJ() {
        Iterator<AbstractC191843103l> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC191842103k(List<? extends AbstractC191843103l> list) {
        this.LLILLJJLI = list;
    }

    @Override // X.AbstractC191843103l
    public final void LIZLLL(InterfaceC191845103n interfaceC191845103n) {
        super.LIZLLL(interfaceC191845103n);
        Iterator<AbstractC191843103l> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(interfaceC191845103n);
        }
    }
}
