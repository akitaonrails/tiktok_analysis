package X;

import java.util.Set;

/* JADX INFO: renamed from: X.04l1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1189304l1 {
    public final boolean LIZ;
    public final Set<String> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizExceptionConfig{isEnableUpload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sampledLogTypes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1189304l1(boolean z, Set<String> set) {
        this.LIZ = z;
        this.LIZIZ = set;
    }
}
