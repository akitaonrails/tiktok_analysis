package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1573906Ef extends AbstractC1573806Ee {
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573906Ef)) {
            return false;
        }
        C1573906Ef c1573906Ef = (C1573906Ef) obj;
        return Intrinsics.LJFF(this.LIZJ, c1573906Ef.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1573906Ef.LIZLLL) && Intrinsics.LJFF(this.LJ, c1573906Ef.LJ);
    }

    public final int hashCode() {
        return (((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WidgetMounted(uuid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", convId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1573906Ef(String str, String str2, Map<String, ? extends Object> map) {
        super("streak_floating_widget_mounted", map);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = map;
    }
}
