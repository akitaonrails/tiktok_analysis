package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.12mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19856112mV extends AbstractC19856012mU {
    public int LL;
    public final int LLILLJJLI;
    public final /* synthetic */ AbstractC19855612mQ LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI;
    }

    public C19856112mV(AbstractC19855612mQ abstractC19855612mQ) {
        Objects.requireNonNull(abstractC19855612mQ);
        this.LLILLL = abstractC19855612mQ;
        this.LL = 0;
        this.LLILLJJLI = abstractC19855612mQ.zze();
    }
}
