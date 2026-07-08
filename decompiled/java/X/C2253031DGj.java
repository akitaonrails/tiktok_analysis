package X;

import com.bytedance.bpea.basics.Cert;

/* JADX INFO: renamed from: X.1DGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253031DGj {
    public final InterfaceC2253051DGl LIZ;
    public final Cert LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiActionInfo(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", privacyCert=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2253031DGj(AbstractC2253041DGk abstractC2253041DGk, Cert cert) {
        this.LIZ = abstractC2253041DGk;
        this.LIZIZ = cert;
    }
}
