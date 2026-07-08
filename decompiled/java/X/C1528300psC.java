package X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.0psC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528300psC {
    public final byte[] LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, String> LJI;
    public final boolean LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpLinkMessageParam(payload=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", methodId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", seqId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serviceId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", payloadType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", payloadEncoding=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", headers=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", forceHttp=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1528300psC(byte[] bArr, int i) {
        this(bArr, i, -1L, 134217839, "pb", "pb", null, false);
    }

    public C1528300psC(byte[] bArr, int i, long j, int i2, String str, String str2, Map<String, String> map, boolean z) {
        this.LIZ = bArr;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = i2;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = map;
        this.LJII = z;
    }
}
