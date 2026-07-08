package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1AcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183211AcR {
    public final String LIZ;
    public final EnumC2229271CMz LIZIZ;
    public final String LIZJ;
    public final byte[] LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicRequest(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", method=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", invokeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", body=");
        sbLIZ.append(Arrays.toString(this.LIZLLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2183211AcR(String str, EnumC2229271CMz enumC2229271CMz, String str2, byte[] bArr) {
        this.LIZ = str;
        this.LIZIZ = enumC2229271CMz;
        this.LIZJ = str2;
        this.LIZLLL = bArr;
    }
}
