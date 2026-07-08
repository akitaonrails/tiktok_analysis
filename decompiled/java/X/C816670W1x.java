package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816670W1x {
    public final String LIZ;
    public final C816640W1u LIZIZ;
    public final C816680W1y LIZJ;
    public final C816650W1v LIZLLL;

    public final int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.LIZ.hashCode());
        C816680W1y c816680W1y = this.LIZJ;
        objArr[1] = c816680W1y != null ? c816680W1y.LIZIZ : null;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserEntity(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mafInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        C816670W1x c816670W1x;
        String str;
        String str2 = null;
        if (obj instanceof C816670W1x) {
            c816670W1x = (C816670W1x) obj;
        } else {
            c816670W1x = null;
        }
        if (c816670W1x == null || !Intrinsics.LJFF(c816670W1x.LIZ, this.LIZ)) {
            return false;
        }
        C816680W1y c816680W1y = c816670W1x.LIZJ;
        if (c816680W1y != null) {
            str = c816680W1y.LIZIZ;
        } else {
            str = null;
        }
        C816680W1y c816680W1y2 = this.LIZJ;
        if (c816680W1y2 != null) {
            str2 = c816680W1y2.LIZIZ;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        return true;
    }

    public C816670W1x(String str, C816640W1u c816640W1u, C816680W1y c816680W1y, C816650W1v c816650W1v) {
        this.LIZ = str;
        this.LIZIZ = c816640W1u;
        this.LIZJ = c816680W1y;
        this.LIZLLL = c816650W1v;
    }
}
