package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.08KE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KE implements Iterator<String>, C03W4 {
    public String LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ C08KD LLILLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.LL == null && !this.LLILLJJLI) {
            String line = this.LLILLL.LIZ.readLine();
            this.LL = line;
            if (line == null) {
                this.LLILLJJLI = true;
            }
        }
        return this.LL != null;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.LL;
        this.LL = null;
        return str;
    }

    public C08KE(C08KD c08kd) {
        this.LLILLL = c08kd;
    }
}
