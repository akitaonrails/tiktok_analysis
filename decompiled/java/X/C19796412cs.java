package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19796412cs implements Iterator<InterfaceC19797112cz> {
    public int LL;
    public final /* synthetic */ C19796612cu LLILLJJLI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI.LJIILIIL();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC19797112cz next() {
        if (this.LL < this.LLILLJJLI.LJIILIIL()) {
            C19796612cu c19796612cu = this.LLILLJJLI;
            int i = this.LL;
            this.LL = i + 1;
            return c19796612cu.LIZJ(i);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.LL);
    }

    public C19796412cs(C19796612cu c19796612cu) {
        this.LLILLJJLI = c19796612cu;
    }
}
