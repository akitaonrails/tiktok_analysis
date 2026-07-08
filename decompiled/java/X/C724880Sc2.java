package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724880Sc2 extends C723430SZh {
    public final Object LIZJ;
    public final boolean LIZLLL;
    public final EnumC724870Sc1 LJ;
    public final ArrayList<Long> LJFF = new ArrayList<>();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C724880Sc2)) {
            return false;
        }
        C724880Sc2 c724880Sc2 = (C724880Sc2) obj;
        return Intrinsics.LJFF(this.LIZJ, c724880Sc2.LIZJ) && this.LIZLLL == c724880Sc2.LIZLLL && this.LJ == c724880Sc2.LJ;
    }

    public final int hashCode() {
        return (((this.LIZJ.hashCode() * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemblePerformanceParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFirstAssemble=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C724880Sc2(LifecycleOwner lifecycleOwner, boolean z, EnumC724870Sc1 enumC724870Sc1) {
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = z;
        this.LJ = enumC724870Sc1;
    }
}
