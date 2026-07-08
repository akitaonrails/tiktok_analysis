package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.auth.CertAuthEntry;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1269510j8n {
    public final int LIZ;
    public final Cert LIZIZ;
    public final String LIZJ;

    public final void LIZ() {
        int i = this.LIZ;
        String str = i != 0 ? i != 1 ? null : "audio" : "video";
        CertAuthEntry.checkSDKCert(this.LIZIZ, new String[]{str}, "LiveCore", this.LIZJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkSDKCert(");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", \"");
        sbLIZ.append(str);
        sbLIZ.append("\", \"LiveCore\", \"");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("\")");
        AVLog.ioi("PrivacyCertManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1269510j8n(int i, String str, Cert cert) {
        this.LIZ = i;
        this.LIZIZ = cert;
        this.LIZJ = str;
    }
}
