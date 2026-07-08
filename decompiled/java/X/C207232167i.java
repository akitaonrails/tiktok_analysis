package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.167i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207232167i {
    public static final C207232167i LIZ = new C207232167i();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(252));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(52));

    public static final void LIZ(Function1<? super DownloadInfo, Boolean> function1) {
        int status;
        List<DownloadInfo> allDownloadInfo = ((C2200151B8z) LIZIZ.getValue()).getAllDownloadInfo();
        if (allDownloadInfo != null) {
            for (DownloadInfo downloadInfo : allDownloadInfo) {
                if (C207234167k.LIZ(downloadInfo.getStatus()) || (status = downloadInfo.getStatus()) == -1 || status == -2 || status == -7 || status == -4 || status == -5) {
                    if (function1.invoke(downloadInfo).booleanValue()) {
                        ((C2200151B8z) LIZIZ.getValue()).clearDownloadData(downloadInfo.getId());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.livesdkapi.util.file.FileDownloadTaskController LIZIZ(X.C207209166l r7, kotlin.jvm.functions.Function1 r8) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207232167i.LIZIZ(X.166l, kotlin.jvm.functions.Function1):com.bytedance.android.livesdkapi.util.file.FileDownloadTaskController");
    }
}
