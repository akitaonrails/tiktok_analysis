package X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: X.12lU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19849812lU {
    public final Deque LIZ = new ArrayDeque(16);

    public final void LIZ() {
        if (!((ArrayDeque) this.LIZ).isEmpty()) {
            throw new IOException(C786410Ut5.j4("data item not completed, stackSize: %s scope: %s", new Object[]{Integer.valueOf(((ArrayDeque) this.LIZ).size()), Long.valueOf(LIZJ())}));
        }
    }

    public final long LIZJ() {
        if (((ArrayDeque) this.LIZ).isEmpty()) {
            return 0L;
        }
        return ((Long) ((ArrayDeque) this.LIZ).peek()).longValue();
    }

    public final void LIZIZ(long j) throws IOException {
        long jLIZJ = LIZJ();
        if (jLIZJ != j) {
            if (jLIZJ != -1) {
                if (jLIZJ == -2) {
                    jLIZJ = -2;
                } else {
                    return;
                }
            }
            throw new IOException(C786410Ut5.j4("expected non-string scope or scope %s but found %s", new Object[]{Long.valueOf(j), Long.valueOf(jLIZJ)}));
        }
    }

    public final void LIZLLL(long j) {
        ((ArrayDeque) this.LIZ).pop();
        ((ArrayDeque) this.LIZ).push(Long.valueOf(j));
    }
}
