package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.File;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;
import lgo.a;

/* JADX INFO: renamed from: X.11cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19542211cy implements InterfaceC19523111Zt<InterfaceC19542011cw> {
    @Override // X.InterfaceC19523111Zt
    public final C11ZA LJIIIIZZ() {
        return new InterfaceC19542011cw() { // from class: X.11dV
            @Override // X.InterfaceC19542011cw
            public final Object LJ(Context context, final String str, String str2, LifecycleOwner lifecycleOwner, C19541111cn c19541111cn) {
                boolean z;
                List<HttpHeader> listLJIIJJI;
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c19541111cn));
                C0VSJ c0vsj = new C0VSJ(str2);
                String parent = c0vsj.getParent();
                if (parent == null) {
                    parent = "";
                }
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && u.LJJIIJZLJL(str, "https", false) && a0.LJJIIZI(str, "policy", false)) {
                    C0CHQ.LIZ().getAccountService().getSDKVersion();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sessionid=");
                    sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).LJIIZILJ());
                    listLJIIJJI = C1697810uHb.LJIIJJI(new HttpHeader("sdk-version", "2"), new HttpHeader("Cookie", C2188811AlT.LIZIZ(sbLIZ)), new HttpHeader("X-Tt-Token", C0CHQ.LIZ().getAccountService().getUserTTToken()));
                } else {
                    listLJIIJJI = null;
                }
                DownloadTask downloadTaskWith = C2200151B8z.with(context);
                downloadTaskWith.url(str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(parent);
                sbLIZ2.append(File.separator);
                downloadTaskWith.savePath(C2188811AlT.LIZIZ(sbLIZ2));
                downloadTaskWith.name(c0vsj.getName());
                downloadTaskWith.retryCount(3);
                downloadTaskWith.ignoreDataVerify(true);
                downloadTaskWith.expiredRedownload(true);
                a.LIZIZ.LIZ().LIZIZ(lifecycleOwner, new AbstractC1656460tCu() { // from class: X.11dR
                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        String savePath;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        String name = null;
                        if (downloadInfo != null) {
                            savePath = downloadInfo.getSavePath();
                        } else {
                            savePath = null;
                        }
                        sbLIZ3.append(savePath);
                        if (downloadInfo != null) {
                            name = downloadInfo.getName();
                        }
                        sbLIZ3.append(name);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        InterfaceC1364105Vn<C19543211d8> interfaceC1364105Vn = c23260099m;
                        C19543211d8 c19543211d8 = new C19543211d8();
                        c19543211d8.LIZ = strLIZIZ;
                        c19543211d8.LIZIZ = 0;
                        C189200o6.m2constructorimpl(c19543211d8);
                        interfaceC1364105Vn.resumeWith(c19543211d8);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        int errorCode;
                        String errorMessage;
                        if (baseException != null && baseException.getErrorCode() == 1047) {
                            C19387510t7 c19387510t7 = C19387510t7.LIZ;
                            boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
                            String str3 = str;
                            c19387510t7.getClass();
                            C19387510t7.LIZ(str3, zIsLogin);
                        }
                        InterfaceC1364105Vn<C19543211d8> interfaceC1364105Vn = c23260099m;
                        C19543211d8 c19543211d8 = new C19543211d8();
                        c19543211d8.LIZ = null;
                        if (baseException != null) {
                            errorCode = baseException.getErrorCode();
                        } else {
                            errorCode = 40000;
                        }
                        c19543211d8.LIZIZ = errorCode;
                        if (baseException == null || (errorMessage = baseException.getErrorMessage()) == null) {
                            errorMessage = "download exception";
                        }
                        c19543211d8.LIZJ = errorMessage;
                        C189200o6.m2constructorimpl(c19543211d8);
                        interfaceC1364105Vn.resumeWith(c19543211d8);
                    }
                }, downloadTaskWith, "PPDownloadAudioFileAbility#downloadFile");
                if (listLJIIJJI != null) {
                    downloadTaskWith.extraHeaders(listLJIIJJI);
                }
                downloadTaskWith.download();
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(c19541111cn);
                }
                return objLIZ;
            }
        };
    }
}
