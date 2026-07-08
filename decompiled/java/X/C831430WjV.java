package X;

import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831430WjV<L> {
    public volatile L LIZ;
    public volatile C831450WjX<L> LIZIZ;

    public C831430WjV(final Looper looper, final L l, final String str) {
        new Executor(looper) { // from class: X.0Wjf
            public final zzi LL;

            {
                this.LL = new zzi(looper);
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C786410Ut5.LJJZZIII(this.LL, runnable);
            }
        };
        C0W3J.LJIIIZ(l, "Listener must not be null");
        this.LIZ = l;
        C0W3J.LJI(str);
        this.LIZIZ = (C831450WjX<L>) new Object(l, str) { // from class: X.0WjX
            public final L LIZ;
            public final String LIZIZ;

            {
                this.LIZ = l;
                this.LIZIZ = str;
            }

            public final int hashCode() {
                return (System.identityHashCode(this.LIZ) * 31) + this.LIZIZ.hashCode();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C831450WjX)) {
                    return false;
                }
                C831450WjX c831450WjX = (C831450WjX) obj;
                if (this.LIZ == c831450WjX.LIZ && this.LIZIZ.equals(c831450WjX.LIZIZ)) {
                    return true;
                }
                return false;
            }
        };
    }
}
