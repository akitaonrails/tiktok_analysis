package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0WfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC828900WfQ extends AbstractBinderC828800WfG {
    public static final WeakReference LLILZ = new WeakReference(null);
    public WeakReference LLILLL;

    @Override // X.AbstractBinderC828800WfG
    public final byte[] LLLIIL() {
        byte[] bArrLLLLII;
        synchronized (this) {
            try {
                bArrLLLLII = (byte[]) this.LLILLL.get();
                if (bArrLLLLII == null) {
                    bArrLLLLII = LLLLII();
                    this.LLILLL = new WeakReference(bArrLLLLII);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return bArrLLLLII;
    }

    public abstract byte[] LLLLII();

    public AbstractBinderC828900WfQ(byte[] bArr) {
        super(bArr);
        this.LLILLL = LLILZ;
    }
}
