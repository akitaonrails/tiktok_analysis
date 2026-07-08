package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11KW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KW extends AtomicReference<C11KX> implements InterfaceC420801kM {
    public static final long serialVersionUID = 5718521705281392066L;

    @Override // X.InterfaceC420801kM
    public void dispose() throws Throwable {
        C11KX andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C11SP.LIZ(e);
            C19489211Ms.LIZIZ(e);
        }
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == null;
    }

    public C11KW(C11KX c11kx) {
        super(c11kx);
    }
}
