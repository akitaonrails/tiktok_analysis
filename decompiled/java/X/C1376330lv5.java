package X;

import android.app.Activity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1376330lv5 {
    public static final /* synthetic */ int LJ = 0;
    public final WeakReference<Activity> LIZ;
    public final C1260870iur<?, ?> LIZIZ;
    public final Pair<Integer, String> LIZJ;
    public String LIZLLL;

    public C1376330lv5(WeakReference<Activity> weakReference, Integer num) {
        Pair<Integer, String> pairLIZLLL;
        this.LIZ = weakReference;
        C1260870iur<?, ?> c1260870iur = new C1260870iur<>();
        this.LIZIZ = c1260870iur;
        c1260870iur.LJIIJ(new C1373260lq8());
        if (num != null) {
            pairLIZLLL = C1376320lv4.LIZLLL(num.intValue());
        } else {
            pairLIZLLL = null;
        }
        this.LIZJ = pairLIZLLL;
    }

    public void LIZ(String str, final AbstractC1375080lt4 abstractC1375080lt4, C1374320lrq c1374320lrq, final boolean z) {
        String str2;
        boolean zLJI = MethodIDManager.LJI(137876);
        Activity activity = this.LIZ.get();
        if (activity != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C08HM.LIZJ(str));
            if (!z) {
                str2 = ".png";
            } else {
                str2 = ".mp4";
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String strLJIJ = C2427709fH.LJIJ(activity);
            C2354709Kn.LJFF(strLJIJ, false);
            AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            abstractC2199801B7qWith.LIZJ = strLIZIZ;
            strLJIJ.toString();
            abstractC2199801B7qWith.LJ = strLJIJ;
            abstractC2199801B7qWith.LJIIJJI = new AbsDownloadListener() { // from class: X.0lvT
                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    Integer numValueOf;
                    String strLIZIZ2;
                    super.onCanceled(downloadInfo);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cancel");
                    if (downloadInfo != null) {
                        numValueOf = Integer.valueOf(downloadInfo.getId());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    AbstractC1375080lt4 abstractC1375080lt42 = abstractC1375080lt4;
                    if (abstractC1375080lt42 != null) {
                        abstractC1375080lt42.LIZ(this.LIZLLL);
                    }
                    if (downloadInfo != null) {
                        if (u.LJIIZILJ(downloadInfo.getSavePath(), "/", false)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(downloadInfo.getSavePath());
                            sbLIZ3.append(downloadInfo.getName());
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(downloadInfo.getSavePath());
                            sbLIZ4.append('/');
                            sbLIZ4.append(downloadInfo.getName());
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                        }
                        if (C2354709Kn.LIZIZ(strLIZIZ2)) {
                            C2354709Kn.LJIJJLI(strLIZIZ2);
                        }
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                    if (downloadInfo != null) {
                        AbstractC1375080lt4 abstractC1375080lt42 = abstractC1375080lt4;
                        int curBytes = (int) ((downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()) * 100.0f);
                        if (abstractC1375080lt42 != null) {
                            abstractC1375080lt42.LIZIZ(curBytes);
                        }
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    super.onStart(downloadInfo);
                    AbstractC1375080lt4 abstractC1375080lt42 = abstractC1375080lt4;
                    if (abstractC1375080lt42 != null) {
                        abstractC1375080lt42.LJ(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    Integer numValueOf;
                    super.onSuccessed(downloadInfo);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("success");
                    String savePath = null;
                    if (downloadInfo != null) {
                        numValueOf = Integer.valueOf(downloadInfo.getId());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    sbLIZ2.append(' ');
                    if (downloadInfo != null) {
                        savePath = downloadInfo.getSavePath();
                    }
                    sbLIZ2.append(savePath);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (downloadInfo == null) {
                        AbstractC1375080lt4 abstractC1375080lt42 = abstractC1375080lt4;
                        if (abstractC1375080lt42 != null) {
                            abstractC1375080lt42.LIZJ(this.LIZLLL);
                            return;
                        }
                        return;
                    }
                    if (u.LJIIZILJ(downloadInfo.getSavePath(), "/", false)) {
                        AbstractC1375080lt4 abstractC1375080lt43 = abstractC1375080lt4;
                        if (abstractC1375080lt43 == null) {
                            return;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(downloadInfo.getSavePath());
                        sbLIZ3.append(downloadInfo.getName());
                        abstractC1375080lt43.LJFF(C2188811AlT.LIZIZ(sbLIZ3), this.LIZLLL, z);
                        return;
                    }
                    AbstractC1375080lt4 abstractC1375080lt44 = abstractC1375080lt4;
                    if (abstractC1375080lt44 == null) {
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(downloadInfo.getSavePath());
                    sbLIZ4.append('/');
                    sbLIZ4.append(downloadInfo.getName());
                    abstractC1375080lt44.LJFF(C2188811AlT.LIZIZ(sbLIZ4), this.LIZLLL, z);
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    Integer numValueOf;
                    String strLIZIZ2;
                    super.onFailed(downloadInfo, baseException);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("failed");
                    if (downloadInfo != null) {
                        numValueOf = Integer.valueOf(downloadInfo.getId());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    AbstractC1375080lt4 abstractC1375080lt42 = abstractC1375080lt4;
                    if (abstractC1375080lt42 != null) {
                        abstractC1375080lt42.LIZJ(this.LIZLLL);
                    }
                    if (downloadInfo != null) {
                        if (u.LJIIZILJ(downloadInfo.getSavePath(), "/", false)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(downloadInfo.getSavePath());
                            sbLIZ3.append(downloadInfo.getName());
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(downloadInfo.getSavePath());
                            sbLIZ4.append('/');
                            sbLIZ4.append(downloadInfo.getName());
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                        }
                        if (C2354709Kn.LIZIZ(strLIZIZ2)) {
                            C2354709Kn.LJIJJLI(strLIZIZ2);
                        }
                    }
                }
            };
            abstractC2199801B7qWith.LIZJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119 A[PHI: r8
      0x0119: PHI (r8v1 java.util.List<java.lang.String>) = (r8v0 java.util.List<java.lang.String>), (r8v5 java.util.List<java.lang.String>) binds: [B:93:0x0118, B:49:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r10, int r11, X.C1374320lrq r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376330lv5.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, int, X.0lrq, boolean):java.lang.String");
    }
}
