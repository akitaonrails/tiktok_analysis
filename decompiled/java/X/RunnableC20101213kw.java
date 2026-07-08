package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.13kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class RunnableC20101213kw implements Runnable {
    public final List<AbstractC20101313kx> LL;
    public final int LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            int size = ((ArrayList) this.LL).size();
            int i = 0;
            if (this.LLILLJJLI != 1) {
                while (i < size) {
                    ((AbstractC20101313kx) ListProtector.get(this.LL, i)).LIZ();
                    i++;
                }
            } else {
                while (i < size) {
                    ((AbstractC20101313kx) ListProtector.get(this.LL, i)).LIZIZ();
                    i++;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public RunnableC20101213kw(Collection<AbstractC20101313kx> collection, int i, Throwable th) {
        C08IF.LIZLLL(collection, "initCallbacks cannot be null");
        this.LL = new ArrayList(collection);
        this.LLILLJJLI = i;
    }
}
