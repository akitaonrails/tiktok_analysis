package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557340qd2 extends AbstractC1557360qd4 {
    public final EffectCategoryModel LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557340qd2)) {
            return false;
        }
        C1557340qd2 c1557340qd2 = (C1557340qd2) obj;
        return Intrinsics.LJFF(this.LIZ, c1557340qd2.LIZ) && this.LIZIZ == c1557340qd2.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabChanged(tab=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557340qd2(int i, EffectCategoryModel effectCategoryModel) {
        this.LIZ = effectCategoryModel;
        this.LIZIZ = i;
    }
}
