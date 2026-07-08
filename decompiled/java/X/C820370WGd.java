package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0WGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820370WGd {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;
    public final Map<String, Object> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDKCallRequest(sdkDescriptor='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', methodName='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', methodParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C820370WGd(C820360WGc c820360WGc) {
        this.LIZ = c820360WGc.LIZ;
        this.LIZIZ = c820360WGc.LIZIZ;
        this.LIZJ = c820360WGc.LIZJ;
        this.LIZLLL = c820360WGc.LIZLLL;
    }
}
