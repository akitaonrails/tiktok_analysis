package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06E8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06E8 extends AbstractC1573806Ee {
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06E8)) {
            return false;
        }
        C06E8 c06e8 = (C06E8) obj;
        return Intrinsics.LJFF(this.LIZJ, c06e8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c06e8.LIZLLL);
    }

    public final int hashCode() {
        return (this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImStreakPetLogger(convId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06E8(String str, Map<String, ? extends Object> map) {
        super("im_streak_pet_logger", map);
        this.LIZJ = str;
        this.LIZLLL = map;
    }
}
