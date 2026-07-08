package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13Ao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19967213Ao extends AbstractC19967113An {
    public boolean LL;
    public final /* synthetic */ Object LLILLJJLI;

    public C19967213Ao(Object obj) {
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
