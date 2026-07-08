package X;

import java.io.Serializable;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0TIO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIO implements Serializable {
    public static final long serialVersionUID = -8759979445933046293L;
    public final Throwable LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationLite.Error[");
        sbLIZ.append(this.LL);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TIO(Throwable th) {
        this.LL = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0TIO)) {
            return false;
        }
        Throwable th = this.LL;
        Throwable th2 = ((C0TIO) obj).LL;
        if (th != th2 && (th == null || !th.equals(th2))) {
            return false;
        }
        return true;
    }
}
