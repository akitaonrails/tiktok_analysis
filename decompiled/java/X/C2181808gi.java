package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.08gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2181808gi {
    public final String LIZ;
    public final Set<String> LIZIZ;
    public final String LIZJ;

    public C2181808gi() {
        this(null, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicCardPreserveData(msgId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keySet=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", preserveData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2181808gi(String str, int i) {
        LinkedHashSet linkedHashSet;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            linkedHashSet = new LinkedHashSet();
        } else {
            linkedHashSet = null;
        }
        this(str, (i & 4) == 0 ? null : "", linkedHashSet);
    }

    public C2181808gi(String str, String str2, Set set) {
        this.LIZ = str;
        this.LIZIZ = set;
        this.LIZJ = str2;
    }
}
