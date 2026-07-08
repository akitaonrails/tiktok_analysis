package X;

import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845650XFj extends AbstractC845670XFl {
    public final OneTapLoginShareInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C845650XFj) && Intrinsics.LJFF(this.LIZ, ((C845650XFj) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TokenAvailable(tokenInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C845650XFj(OneTapLoginShareInfo oneTapLoginShareInfo) {
        this.LIZ = oneTapLoginShareInfo;
    }
}
