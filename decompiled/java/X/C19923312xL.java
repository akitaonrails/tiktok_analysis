package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12xL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19923312xL extends AbstractC19923612xO {
    public final C19923112xJ LL;
    public InterfaceC19923812xQ LLILLJJLI = LIZ();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.12xQ] */
    public final InterfaceC19923812xQ LIZ() {
        if (this.LL.hasNext()) {
            return this.LL.next().iterator2();
        }
        return null;
    }

    @Override // X.InterfaceC19923812xQ
    public final byte LIZJ() {
        InterfaceC19923812xQ interfaceC19923812xQ = this.LLILLJJLI;
        if (interfaceC19923812xQ == null) {
            throw new NoSuchElementException();
        }
        byte bLIZJ = interfaceC19923812xQ.LIZJ();
        if (!this.LLILLJJLI.hasNext()) {
            this.LLILLJJLI = LIZ();
        }
        return bLIZJ;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI != null;
    }

    public C19923312xL(C19922912xH c19922912xH) {
        this.LL = new C19923112xJ(c19922912xH);
    }
}
