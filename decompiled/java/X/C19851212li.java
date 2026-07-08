package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19851212li extends AbstractC19851112lh {
    public boolean LL;
    public final /* synthetic */ Object LLILLJJLI;

    public C19851212li(Object obj) {
        this.LLILLJJLI = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.LL;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.LL) {
            throw new NoSuchElementException();
        }
        this.LL = true;
        return this.LLILLJJLI;
    }
}
