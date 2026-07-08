package X;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: X.0fmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140250fmJ extends Exception {
    public static final int $stable = 8;
    public final C1141050fnb LL;

    public final C1141050fnb getError() {
        return this.LL;
    }

    public C1140250fmJ(C1141050fnb c1141050fnb) {
        this.LL = c1141050fnb;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Throwable th = this.LL.LIZJ;
        if (th != null) {
            th.printStackTrace(printStream);
        } else {
            super.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Throwable th = this.LL.LIZJ;
        if (th != null) {
            th.printStackTrace(printWriter);
        } else {
            super.printStackTrace(printWriter);
        }
    }

    public C1140250fmJ(int i, String str, Throwable th) {
        this.LL = new C1141050fnb(i, str, th);
    }
}
