package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565460MFs {
    public final C557390LtZ LIZ;
    public final View LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C565460MFs)) {
            return false;
        }
        C565460MFs c565460MFs = (C565460MFs) obj;
        return Intrinsics.LJFF(this.LIZ, c565460MFs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c565460MFs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c565460MFs.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageDataItemWrapper(imageDataItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hostView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C565460MFs(C557390LtZ c557390LtZ, View view, String str) {
        this.LIZ = c557390LtZ;
        this.LIZIZ = view;
        this.LIZJ = str;
    }
}
