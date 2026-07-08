package X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.0bFB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965950bFB {
    public final byte[] LIZ;
    public final byte[] LIZIZ;
    public final Map<String, String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicRespModel(rspData=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", bizData=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", customData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C965950bFB(byte[] bArr, byte[] bArr2, Map<String, String> map) {
        this.LIZ = bArr;
        this.LIZIZ = bArr2;
        this.LIZJ = map;
    }
}
