package X;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0j6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268350j6v {
    public boolean LIZ;
    public Exception LIZIZ;
    public List<String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHCepResult{success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ruleName='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", bizName='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", paths=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", matchedEvents=");
        sbLIZ.append(Arrays.toString((Object[]) null));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
