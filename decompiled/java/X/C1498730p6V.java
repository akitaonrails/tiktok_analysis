package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0p6V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1498730p6V implements InterfaceC1498780p6a {
    public final boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ = -1;
    public final Set<String> LIZLLL = new HashSet();
    public final /* synthetic */ C1498750p6X LJ;

    @Override // X.InterfaceC1498780p6a
    public final boolean LIZIZ() {
        return true;
    }

    public C1498730p6V(C1498750p6X c1498750p6X) {
        this.LJ = c1498750p6X;
        if (c1498750p6X.LJII > 0 && !c1498750p6X.LJI.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // X.InterfaceC1498780p6a
    public void LIZ(List<HttpHeader> list) {
        int i;
        if (this.LIZ && this.LIZIZ && (i = this.LIZJ) >= 0 && i < this.LJ.LJII) {
            this.LIZIZ = false;
            StringBuilder sb = new StringBuilder();
            Iterator it2 = ((HashSet) this.LIZLLL).iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
                sb.append(",");
            }
            if (C1490830otl.LIZ()) {
                int i2 = this.LJ.LJIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Add extra_ttnet_change_ip:");
                sbLIZ.append(sb.toString());
                C1490830otl.LIZLLL(i2, "NetworkFailoverStrategy", "handleIpChangeHeader", C2188811AlT.LIZIZ(sbLIZ));
            }
            ((ArrayList) list).add(new HttpHeader("extra_ttnet_change_ip", sb.toString()));
        }
    }

    @Override // X.InterfaceC1498780p6a
    public boolean LIZJ(BaseException baseException) {
        int iIndexOf;
        boolean z = false;
        if (this.LIZ && (baseException instanceof DownloadTTNetException)) {
            int i = this.LIZJ;
            C1498750p6X c1498750p6X = this.LJ;
            if (i < c1498750p6X.LJII) {
                if (((HashSet) c1498750p6X.LJI).contains(Integer.valueOf(baseException.getErrorCode()))) {
                    String remoteIp = ((DownloadTTNetException) baseException).getRemoteIp();
                    int i2 = this.LIZJ;
                    int i3 = this.LJ.LJII;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        this.LIZJ = i4;
                        if (i4 == i3) {
                            if (C1490830otl.LIZ()) {
                                int i5 = this.LJ.LJIIL;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("CurrentIpChangeCount:");
                                sbLIZ.append(this.LIZJ);
                                sbLIZ.append(" mIpChangeCountLimit:");
                                sbLIZ.append(this.LJ.LJII);
                                C1490830otl.LIZLLL(i5, "NetworkFailoverStrategy", "handleIpChangeError", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else {
                            if (!TextUtils.isEmpty(remoteIp) && (iIndexOf = remoteIp.indexOf(":")) > 0 && iIndexOf < remoteIp.length()) {
                                ((HashSet) this.LIZLLL).add(remoteIp.substring(0, iIndexOf));
                            } else {
                                ((HashSet) this.LIZLLL).add("0.0.0.0");
                            }
                            z = true;
                        }
                    } else if (C1490830otl.LIZ()) {
                        int i6 = this.LJ.LJIIL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(" RemoteIp:");
                        sbLIZ2.append(remoteIp);
                        sbLIZ2.append(" currentIpChangeCount:");
                        sbLIZ2.append(this.LIZJ);
                        sbLIZ2.append(" errorCode:");
                        sbLIZ2.append(baseException.getErrorCode());
                        sbLIZ2.append(" mIpChangeErrorIps:");
                        sbLIZ2.append(this.LIZLLL.toString());
                        C1490830otl.LIZLLL(i6, "NetworkFailoverStrategy", "handleIpChangeError", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }
        this.LIZIZ = z;
        return z;
    }
}
