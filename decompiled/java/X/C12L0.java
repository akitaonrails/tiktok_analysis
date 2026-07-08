package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.12L0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12L0 implements C092O<WindowLayoutInfo> {
    public final Context LIZ;
    public C0N9B LIZJ;
    public final ReentrantLock LIZIZ = new ReentrantLock();
    public final Set<C092O<C0N9B>> LIZLLL = new LinkedHashSet();

    public C12L0(Context context) {
        this.LIZ = context;
    }

    @Override // X.C092O
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        C0N9B c0n9bLIZIZ;
        ReentrantLock reentrantLock = this.LIZIZ;
        reentrantLock.lock();
        try {
            Context context = this.LIZ;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                c0n9bLIZIZ = C19738712Kr.LIZIZ(C19738212Km.LIZIZ.LIZIZ(context), windowLayoutInfo);
            } else if (i >= 29 && (context instanceof Activity)) {
                C19738212Km c19738212Km = C19738212Km.LIZIZ;
                c0n9bLIZIZ = C19738712Kr.LIZIZ(C19738212Km.LIZ((Activity) context), windowLayoutInfo);
            } else {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            this.LIZJ = c0n9bLIZIZ;
            Iterator<C092O<C0N9B>> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                it2.next().accept(this.LIZJ);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LIZIZ(C12LA c12la) {
        ReentrantLock reentrantLock = this.LIZIZ;
        reentrantLock.lock();
        try {
            C0N9B c0n9b = this.LIZJ;
            if (c0n9b != null) {
                c12la.accept(c0n9b);
            }
            this.LIZLLL.add(c12la);
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
