package X;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: renamed from: X.00ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C205700ql extends C0RSU {
    public final boolean LJI;

    public C205700ql() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C205700ql) && this.LJI == ((C205700ql) obj).LJI;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Uploading(enableCancel=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C205700ql(boolean z) {
        super(2131849120, false, 0, false, z, 0, 110);
        this.LJI = z;
    }

    @Override // X.C0RSU
    public final String LIZ(float f, Context context) {
        return C786410Ut5.j4(context.getResources().getString(this.LIZ), Arrays.copyOf(new Object[]{Integer.valueOf((int) (f * 100))}, 1));
    }
}
