package X;

import java.io.Serializable;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.11PS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PS implements Serializable {
    public static final long serialVersionUID = -1322257508628817540L;
    public final C11LR LL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationLite.Subscription[");
        sbLIZ.append(this.LL);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C11PS(C11LR c11lr) {
        this.LL = c11lr;
    }
}
