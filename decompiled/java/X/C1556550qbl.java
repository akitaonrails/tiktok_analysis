package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556550qbl {
    public final List<CreativeTemplate> LIZ;
    public final int LIZIZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556550qbl)) {
            return false;
        }
        C1556550qbl c1556550qbl = (C1556550qbl) obj;
        return Intrinsics.LJFF(this.LIZ, c1556550qbl.LIZ) && this.LIZIZ == c1556550qbl.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobTemplateBatch(templates=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rankStart=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556550qbl(List list) {
        this.LIZ = list;
    }
}
