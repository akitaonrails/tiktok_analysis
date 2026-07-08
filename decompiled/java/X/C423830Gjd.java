package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423830Gjd implements InterfaceC423860Gjg {
    public final String LIZ;
    public final int LIZIZ = R.attr.a1h;
    public final int LIZJ = R.attr.a03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423830Gjd)) {
            return false;
        }
        C423830Gjd c423830Gjd = (C423830Gjd) obj;
        return Intrinsics.LJFF(this.LIZ, c423830Gjd.LIZ) && this.LIZIZ == c423830Gjd.LIZIZ && this.LIZJ == c423830Gjd.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tag(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textColorTuxIdentifier=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", backgroundTuxColorIdentifier=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C423830Gjd(String str) {
        this.LIZ = str;
    }
}
