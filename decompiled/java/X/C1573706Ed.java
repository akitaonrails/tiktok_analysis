package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1573706Ed extends AbstractC1573806Ee {
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573706Ed)) {
            return false;
        }
        C1573706Ed c1573706Ed = (C1573706Ed) obj;
        return Intrinsics.LJFF(this.LIZJ, c1573706Ed.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1573706Ed.LIZLLL) && Intrinsics.LJFF(this.LJ, c1573706Ed.LJ);
    }

    public final int hashCode() {
        return (((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WidgetHiddenFinished(uuid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", convId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1573706Ed(String str, String str2, Map<String, ? extends Object> map) {
        super("streak_floating_widget_hidden_finished", map);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = map;
    }
}
