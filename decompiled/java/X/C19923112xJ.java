package X;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12xJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19923112xJ implements Iterator<AbstractC19923712xP> {
    public final ArrayDeque<C19922912xH> LL;
    public AbstractC19923712xP LLILLJJLI;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final AbstractC19923712xP next() {
        AbstractC19923712xP abstractC19923712xP;
        AbstractC19923712xP abstractC19923712xP2 = this.LLILLJJLI;
        if (abstractC19923712xP2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<C19922912xH> arrayDeque = this.LL;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                abstractC19923712xP = null;
                break;
            }
            AbstractC19922812xG abstractC19922812xG = this.LL.pop().LLILZIL;
            while (abstractC19922812xG instanceof C19922912xH) {
                C19922912xH c19922912xH = (C19922912xH) abstractC19922812xG;
                this.LL.push(c19922912xH);
                abstractC19922812xG = c19922912xH.LLILZ;
            }
            abstractC19923712xP = (AbstractC19923712xP) abstractC19922812xG;
        } while (abstractC19923712xP.isEmpty());
        this.LLILLJJLI = abstractC19923712xP;
        return abstractC19923712xP2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C19923112xJ(AbstractC19922812xG abstractC19922812xG) {
        if (abstractC19922812xG instanceof C19922912xH) {
            C19922912xH c19922912xH = (C19922912xH) abstractC19922812xG;
            ArrayDeque<C19922912xH> arrayDeque = new ArrayDeque<>(c19922912xH.LLIZ);
            this.LL = arrayDeque;
            arrayDeque.push(c19922912xH);
            AbstractC19922812xG abstractC19922812xG2 = c19922912xH.LLILZ;
            while (abstractC19922812xG2 instanceof C19922912xH) {
                C19922912xH c19922912xH2 = (C19922912xH) abstractC19922812xG2;
                this.LL.push(c19922912xH2);
                abstractC19922812xG2 = c19922912xH2.LLILZ;
            }
            this.LLILLJJLI = (AbstractC19923712xP) abstractC19922812xG2;
            return;
        }
        this.LL = null;
        this.LLILLJJLI = (AbstractC19923712xP) abstractC19922812xG;
    }
}
