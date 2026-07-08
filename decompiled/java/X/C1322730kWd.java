package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0kWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322730kWd extends AbstractC1322740kWe {
    public int LL;
    public final int LLILLJJLI;
    public final /* synthetic */ AbstractC1322720kWc LLILLL;

    public final byte LIZJ() {
        int i = this.LL;
        if (i >= this.LLILLJJLI) {
            throw new NoSuchElementException();
        }
        this.LL = i + 1;
        return this.LLILLL.LJFF(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI;
    }

    public C1322730kWd(AbstractC1322720kWc abstractC1322720kWc) {
        this.LLILLL = abstractC1322720kWc;
        this.LLILLJJLI = abstractC1322720kWc.size();
    }
}
