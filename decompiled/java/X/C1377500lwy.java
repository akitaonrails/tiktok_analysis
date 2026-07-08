package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0lwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377500lwy {
    public final WeakReference<Context> LIZ;

    public C1377500lwy(WeakReference<Context> weakReference) {
        this.LIZ = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, android.net.Uri] */
    public final void LIZ(String str, final C1377510lwz c1377510lwz) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            c1377510lwz.onFailure();
            return;
        }
        Context context = this.LIZ.get();
        if (context != null) {
            if (C1375500ltk.LJI(context)) {
                c1377510lwz.LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C08HM.LIZJ(str));
                sbLIZ.append(".png");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                final C259800zU c259800zU = new C259800zU();
                ?? LJFF = C2400409as.LJFF(this.LIZ.get(), strLIZIZ, "image/png");
                c259800zU.element = LJFF;
                if (LJFF == 0) {
                    c259800zU.element = C2400409as.LIZIZ(this.LIZ.get(), strLIZIZ, "image/png");
                }
                if (!C2400409as.LJIIIZ(this.LIZ.get(), (Uri) c259800zU.element) && this.LIZ.get() != null) {
                    AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                    abstractC2199801B7qWith.LIZJ = strLIZIZ;
                    abstractC2199801B7qWith.LJ = ((Uri) c259800zU.element).toString();
                    abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.0lx0
                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onCanceled(DownloadInfo downloadInfo) {
                            super.onCanceled(downloadInfo);
                            InterfaceC1377560lx4 interfaceC1377560lx4 = c1377510lwz;
                            if (interfaceC1377560lx4 != null) {
                                new RuntimeException("Download is canceled");
                                interfaceC1377560lx4.onFailure();
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                            super.onProgress(downloadInfo);
                            if (downloadInfo != null) {
                                InterfaceC1377560lx4 interfaceC1377560lx4 = c1377510lwz;
                                downloadInfo.getCurBytes();
                                downloadInfo.getTotalBytes();
                                if (interfaceC1377560lx4 != null) {
                                    interfaceC1377560lx4.LIZ();
                                }
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            super.onSuccessed(downloadInfo);
                            InterfaceC1377560lx4 interfaceC1377560lx4 = c1377510lwz;
                            if (interfaceC1377560lx4 != null) {
                                interfaceC1377560lx4.LIZIZ(c259800zU.element);
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            super.onFailed(downloadInfo, baseException);
                            InterfaceC1377560lx4 interfaceC1377560lx4 = c1377510lwz;
                            if (interfaceC1377560lx4 != null) {
                                interfaceC1377560lx4.onFailure();
                            }
                        }
                    };
                    abstractC2199801B7qWith.LIZJ();
                    return;
                }
                return;
            }
            C1374720lsU.LJIIIIZZ(context, TokenCert.Companion.with("bpea-share_jsb_save_web_image_permission"), null, null, null);
        }
    }
}
