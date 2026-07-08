package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06E1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06E1 extends AbstractC1573806Ee {
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06E1)) {
            return false;
        }
        C06E1 c06e1 = (C06E1) obj;
        return Intrinsics.LJFF(this.LIZJ, c06e1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c06e1.LIZLLL) && Intrinsics.LJFF(this.LJ, c06e1.LJ);
    }

    public final int hashCode() {
        return (((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditStreakPetFeData(uuid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", convId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06E1(String str, String str2, Map<String, ? extends Object> map) {
        super("edit_streak_pet_fe_data", map);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = map;
    }
}
