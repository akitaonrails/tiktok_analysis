package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0on1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486650on1 {
    public final String[] LIZ;
    public final String LIZIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;
    public final String[] LJ;
    public final String[] LJFF;
    public final String LJI;
    public final String LJII;
    public String LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(":\nmApplogURL : ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("\nmApplogTimelyUrl : ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("\nmDeviceRegisterUrl : ");
        sbLIZ.append(this.LJ);
        sbLIZ.append("\nmAppActiveUrl : ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("\nmApplogSettingsUrl : ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("\n\nmApplogFallbackUrl : ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("\nmApplogSettingsFallbackUrl : ");
        sbLIZ.append(this.LJI);
        sbLIZ.append("\nmApplogMonitorUrl : ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append("\nmUserProfileUrl : ");
        sbLIZ.append(this.LJII);
        sbLIZ.append("\n\n\n\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1486650on1(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2, String[] strArr4, String str3, String str4) {
        String str5;
        this.LIZ = strArr;
        this.LIZIZ = str2;
        this.LIZJ = strArr2;
        this.LIZLLL = new String[]{str};
        this.LJ = strArr3;
        this.LJFF = strArr4;
        this.LJI = str3;
        this.LJII = str4;
        if (strArr.length > 0 && (str5 = strArr[0]) != null && !str5.isEmpty()) {
            try {
                Uri uri = UriProtector.parse(str5);
                String host = uri.getHost();
                String path = uri.getPath();
                String scheme = uri.getScheme();
                int port = uri.getPort();
                if (port > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(host);
                    sbLIZ.append(":");
                    sbLIZ.append(port);
                    host = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (host != null && path != null && scheme != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(scheme);
                    sbLIZ2.append("://");
                    sbLIZ2.append(host);
                    sbLIZ2.append("/service/2/app_log_monitor/");
                    this.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
