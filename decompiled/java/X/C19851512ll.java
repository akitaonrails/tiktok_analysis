package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19851512ll extends AbstractC19851712ln {
    public int LL;
    public final int LLILLJJLI;
    public final /* synthetic */ AbstractC19851412lk LLILLL;

    public C19851512ll(AbstractC19851412lk abstractC19851412lk) {
        this.LLILLL = abstractC19851412lk;
        this.LLILLJJLI = abstractC19851412lk.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI;
    }

    public final byte zza() {
        int i = this.LL;
        if (i >= this.LLILLJJLI) {
            throw new NoSuchElementException();
        }
        this.LL = i + 1;
        return this.LLILLL.LIZJ(i);
    }
}
