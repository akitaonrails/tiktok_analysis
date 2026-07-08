package X;

import java.util.Set;

/* JADX INFO: renamed from: X.01Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C295501Cn {
    public final String LIZ;
    public final String LIZIZ;
    public final Set<String> LIZJ;

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C295501Cn(String str, String str2, Set<String> set) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = set;
    }
}
