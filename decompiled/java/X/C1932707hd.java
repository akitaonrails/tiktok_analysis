package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.07hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1932707hd extends AbstractC1902407ck {
    public final long LL;
    public final long LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;

    @Override // X.AbstractC1902407ck
    public final long nextLong() {
        long j = this.LLILZ;
        if (j != this.LLILLJJLI) {
            this.LLILZ = this.LL + j;
            return j;
        }
        if (!this.LLILLL) {
            throw new NoSuchElementException();
        }
        this.LLILLL = false;
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL;
    }

    public C1932707hd(long j, long j2, long j3) {
        this.LL = j3;
        this.LLILLJJLI = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.LLILLL = z;
        this.LLILZ = z ? j : j2;
    }
}
