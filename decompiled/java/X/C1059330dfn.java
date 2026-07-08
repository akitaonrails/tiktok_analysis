package X;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0dfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059330dfn {
    public Pattern LIZ;
    public EnumC1062390dkj LIZIZ;
    public List<String> LIZJ;
    public List<String> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteConfig{pattern=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", permissionGroup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", includedMethods=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", excludedMethods=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
