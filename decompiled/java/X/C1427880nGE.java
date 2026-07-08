package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427880nGE extends AbstractC1427970nGN {
    public final CategoryInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1427880nGE) && Intrinsics.LJFF(this.LIZ, ((C1427880nGE) obj).LIZ);
    }

    public final int hashCode() {
        CategoryInfo categoryInfo = this.LIZ;
        if (categoryInfo == null) {
            return 0;
        }
        return categoryInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectedTab(tab=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1427880nGE(CategoryInfo categoryInfo) {
        this.LIZ = categoryInfo;
    }
}
