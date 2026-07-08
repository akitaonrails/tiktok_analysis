package X;

import com.bytedance.bpea.basics.Cert;

/* JADX INFO: renamed from: X.0TFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TFZ {
    public String LIZ;
    public final Cert LIZIZ;
    public final Cert LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BpeaData(bpeaAction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bpeaCert=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", decryptCert=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TFZ(String str, Cert cert, Cert cert2, int i) {
        str = (i & 1) != 0 ? "" : str;
        cert = (i & 2) != 0 ? null : cert;
        cert2 = (i & 4) != 0 ? null : cert2;
        this.LIZ = str;
        this.LIZIZ = cert;
        this.LIZJ = cert2;
    }
}
