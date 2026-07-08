package X;

import com.ss.android.ugc.aweme.discover.model.EnterMiddlePageMethod;
import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0QKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668710QKv implements C0PWT {
    public final EnterMiddlePageMethod LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C668710QKv) && this.LL == ((C668710QKv) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateMidpageEnterActionAction(enterBy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Wg1().LIZIZ(C13LE.LIZ(C668710QKv.class), AFwS293S0000000_10.get$arr$(82));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C668710QKv(EnterMiddlePageMethod enterMiddlePageMethod) {
        this.LL = enterMiddlePageMethod;
    }
}
