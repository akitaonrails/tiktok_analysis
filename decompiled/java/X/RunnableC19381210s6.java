package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19381210s6 implements Runnable {
    public final /* synthetic */ Drawable LL;
    public final /* synthetic */ Matrix LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ C12MM LLILZIL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILZIL.LJIIJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC19381210s6(C12MM c12mm, Drawable drawable, Matrix matrix, float f, float f2) {
        this.LLILZIL = c12mm;
        this.LL = drawable;
        this.LLILLJJLI = matrix;
        this.LLILLL = f;
        this.LLILZ = f2;
    }
}
