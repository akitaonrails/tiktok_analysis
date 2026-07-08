package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427890nGF extends AbstractC1427970nGN {
    public final CategoryInfo LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1427890nGF)) {
            return false;
        }
        C1427890nGF c1427890nGF = (C1427890nGF) obj;
        return Intrinsics.LJFF(this.LIZ, c1427890nGF.LIZ) && this.LIZIZ == c1427890nGF.LIZIZ;
    }

    public final int hashCode() {
        CategoryInfo categoryInfo = this.LIZ;
        return ((categoryInfo == null ? 0 : categoryInfo.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickTab(tab=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", forceUpdate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1427890nGF(CategoryInfo categoryInfo, boolean z) {
        this.LIZ = categoryInfo;
        this.LIZIZ = z;
    }
}
