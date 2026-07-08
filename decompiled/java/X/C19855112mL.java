package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12mL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19855112mL extends AbstractC19855212mM {
    public int LL;
    public final int LLILLJJLI;
    public final /* synthetic */ AbstractC19854812mI LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI;
    }

    @Override // X.InterfaceC19854612mG
    public final byte zza() {
        int i = this.LL;
        if (i >= this.LLILLJJLI) {
            throw new NoSuchElementException();
        }
        this.LL = i + 1;
        return this.LLILLL.LJFF(i);
    }

    public C19855112mL(AbstractC19854812mI abstractC19854812mI) {
        this.LLILLL = abstractC19854812mI;
        this.LLILLJJLI = abstractC19854812mI.zzb();
    }
}
