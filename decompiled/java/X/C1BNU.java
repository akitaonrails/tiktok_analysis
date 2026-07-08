package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.1BNU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNU implements Iterator<C1BNV> {
    public int LL;
    public final /* synthetic */ C1BNT LLILLJJLI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.LL;
        return i >= 0 && i < this.LLILLJJLI.LIZJ;
    }

    @Override // java.util.Iterator
    public final C1BNV next() {
        C1BNT c1bnt = this.LLILLJJLI;
        int i = this.LL;
        int i2 = c1bnt.LIZIZ + i;
        C1BNV[] c1bnvArr = c1bnt.LIZ;
        C1BNV c1bnv = c1bnvArr[i2 % c1bnvArr.length];
        if (c1bnv != null) {
            this.LL = i + 1;
        }
        return c1bnv;
    }

    public C1BNU(C1BNT c1bnt, int i) {
        this.LLILLJJLI = c1bnt;
        this.LL = c1bnt.LIZIZ(i);
    }
}
