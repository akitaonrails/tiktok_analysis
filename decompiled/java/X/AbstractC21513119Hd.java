package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: X.19Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21513119Hd<T> {
    public final int LIZ = 16;
    public final Queue<T> LIZIZ = new LinkedList();

    public abstract T LIZ();

    public abstract T LIZIZ(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public final T LIZJ() {
        if (((LinkedList) this.LIZIZ).size() == 0) {
            return (T) LIZ();
        }
        try {
            return (T) LIZIZ(((LinkedList) this.LIZIZ).poll());
        } catch (NoSuchElementException e) {
            TryCatchGuardChecker.doCheck(e);
            return (T) LIZ();
        }
    }
}
