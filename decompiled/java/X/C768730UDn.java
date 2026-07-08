package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768730UDn {
    public static final C768730UDn LIZ = new C768730UDn();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(352));

    public static final void LIZ(DownloadInfo downloadInfo, boolean z) {
        ((C2200151B8z) LIZIZ.getValue()).clearDownloadData(downloadInfo.getId(), z);
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(downloadInfo.getSavePath());
            sbLIZ.append(downloadInfo.getName());
            C08P1.LIZLLL(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }
}
