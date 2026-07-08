package X;

import Y.AfS48S1200000_27;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.browser.dialog.DownloadProgressDialog;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.TimeUnit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0xyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839850xyh extends AbstractC1839880xyk implements InterfaceC1839930xyp {
    public DownloadProgressDialog LLILLL;
    public String LLILZ = "";
    public String LLILZIL;
    public String LLILZLL;
    public C11JF LLIZ;
    public CompletionBlock<InterfaceC1839920xyo> LLIZLLLIL;

    @Override // X.InterfaceC1839930xyp
    public final void LIZIZ() {
        if (Build.VERSION.SDK_INT >= 33) {
            C1836420xtA.LJFF().LIZIZ(1, this.LLILZLL, this.LLILZIL, getName());
        } else {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            new C0UT9(C500260Jjc.LJ(interfaceC634840OvC != null ? interfaceC634840OvC.getContext() : null), TokenCert.Companion.with("bpea-live_recharge_invoice_delete_undownload")).LIZ(new C142V() { // from class: X.0xym
                @Override // X.C142V
                public final /* synthetic */ void LIZIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZLLL(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJ(String str, String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.C142V
                public final void LIZ(String... strArr) {
                    C1839850xyh c1839850xyh = this.LIZ;
                    CompletionBlock<InterfaceC1839920xyo> completionBlock = c1839850xyh.LLIZLLLIL;
                    if (completionBlock != null) {
                        c1839850xyh.getClass();
                        XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1839920xyo.class);
                        ((InterfaceC1839920xyo) xBaseModelLIZ).setPath(this.LIZ.LLILZ);
                        completionBlock.onFailure(0, "", (XBaseResultModel) xBaseModelLIZ);
                    }
                }

                @Override // X.C142V
                public final void LIZJ(String... strArr) {
                    C1836420xtA c1836420xtALJFF = C1836420xtA.LJFF();
                    C1839850xyh c1839850xyh = this.LIZ;
                    c1836420xtALJFF.LIZIZ(1, c1839850xyh.LLILZLL, c1839850xyh.LLILZIL, c1839850xyh.getName());
                }
            }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        CompletionBlock<InterfaceC1839920xyo> completionBlock = this.LLIZLLLIL;
        if (completionBlock != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1839920xyo.class, null);
            ((InterfaceC1839920xyo) xBaseModelLIZJ).setPath(this.LLILZ);
            completionBlock.onFailure(0, "", (XBaseResultModel) xBaseModelLIZJ);
        }
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        C1836420xtA.LJFF().LIZIZ.clear();
        C11JF c11jf = this.LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        byte[] bytes;
        long j;
        Context context;
        InterfaceC1839910xyn interfaceC1839910xyn = (InterfaceC1839910xyn) xBaseParamModel;
        if (C497740JfY.LJII() != null) {
            this.LLIZLLLIL = completionBlock;
            DownloadProgressDialog downloadProgressDialog = new DownloadProgressDialog();
            this.LLILLL = downloadProgressDialog;
            downloadProgressDialog.LLILLJJLI = this;
            final String url = interfaceC1839910xyn.getUrl();
            C1836420xtA.LJFF().LJIIIIZZ(url, new InterfaceC1835200xrC(url, completionBlock) { // from class: X.0xyi
                public final String LIZ;
                public final CompletionBlock<InterfaceC1839920xyo> LIZIZ;

                @Override // X.InterfaceC1835200xrC
                public final void onPause(DownloadInfo downloadInfo) {
                }

                @Override // X.InterfaceC1835200xrC
                public final void LIZ(DownloadInfo downloadInfo) {
                    DownloadProgressDialog downloadProgressDialog2 = this.LIZJ.LLILLL;
                    if (downloadProgressDialog2 != null) {
                        downloadProgressDialog2.dismiss();
                    }
                    CompletionBlock<InterfaceC1839920xyo> completionBlock2 = this.LIZIZ;
                    this.LIZJ.getClass();
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1839920xyo.class, null);
                    ((InterfaceC1839920xyo) xBaseModelLIZJ).setPath(this.LIZJ.LLILZ);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }

                @Override // X.InterfaceC1835200xrC
                public final void onProgress(DownloadInfo downloadInfo) {
                    DownloadProgressDialog downloadProgressDialog2 = this.LIZJ.LLILLL;
                    if (downloadProgressDialog2 != null) {
                        int downloadProcess = downloadInfo.getDownloadProcess();
                        C367280Eac c367280Eac = downloadProgressDialog2.LL;
                        if (c367280Eac != null) {
                            c367280Eac.LLIZLLLIL = downloadProcess;
                        }
                    }
                }

                @Override // X.InterfaceC1835200xrC
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    DownloadProgressDialog downloadProgressDialog2 = this.LIZJ.LLILLL;
                    if (downloadProgressDialog2 != null) {
                        downloadProgressDialog2.dismiss();
                    }
                    C1836420xtA c1836420xtALJFF = C1836420xtA.LJFF();
                    String str = this.LIZ;
                    C1839850xyh c1839850xyh = this.LIZJ;
                    c1836420xtALJFF.LIZIZ(1, str, c1839850xyh.LLILZIL, c1839850xyh.getName());
                    CompletionBlock<InterfaceC1839920xyo> completionBlock2 = this.LIZIZ;
                    this.LIZJ.getClass();
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1839920xyo.class, null);
                    ((InterfaceC1839920xyo) xBaseModelLIZJ).setPath(this.LIZJ.LLILZ);
                    completionBlock2.onFailure(0, "", (XBaseResultModel) xBaseModelLIZJ);
                }

                {
                    this.LIZ = url;
                    this.LIZIZ = completionBlock;
                }
            });
            String url2 = interfaceC1839910xyn.getUrl();
            this.LLILZLL = url2;
            if (C2093608Ic.LJ(url2)) {
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1839920xyo.class, null);
                ((InterfaceC1839920xyo) xBaseModelLIZJ).setPath(this.LLILZ);
                completionBlock.onFailure(0, "", (XBaseResultModel) xBaseModelLIZJ);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str = this.LLILZLL;
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
            } else {
                bytes = null;
            }
            sbLIZ.append(C1836420xtA.LJI(bytes));
            sbLIZ.append(".pdf");
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && interfaceC634840OvC.getContext() != null) {
                this.LLILZIL = EnumC771350UNp.INVOICE.getFullPathWithoutPostSuffix();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LLILZIL);
                sbLIZ2.append('/');
                sbLIZ2.append(strLIZIZ);
                this.LLILZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (new C0VSJ(this.LLILZ).exists()) {
                if (Build.VERSION.SDK_INT >= 33) {
                    C1836420xtA.LJFF().LIZIZ(1, this.LLILZLL, this.LLILZIL, strLIZIZ);
                } else {
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        context = interfaceC634840OvC2.getContext();
                    } else {
                        context = null;
                    }
                    new C0UT9(C500260Jjc.LJ(context), TokenCert.Companion.with("bpea-live_recharge_invoice_download")).LIZ(new C142V() { // from class: X.0xyl
                        @Override // X.C142V
                        public final /* synthetic */ void LIZIZ(String... strArr) {
                        }

                        @Override // X.C142V
                        public final /* synthetic */ void LIZLLL(String... strArr) {
                        }

                        @Override // X.C142V
                        public final /* synthetic */ void LJ(String str2, String... strArr) {
                        }

                        @Override // X.C142V
                        public final /* synthetic */ void LJFF(String... strArr) {
                        }

                        @Override // X.C142V
                        public final void LIZ(String... strArr) {
                            CompletionBlock<InterfaceC1839920xyo> completionBlock2 = completionBlock;
                            this.LIZ.getClass();
                            XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1839920xyo.class);
                            ((InterfaceC1839920xyo) xBaseModelLIZ).setPath(this.LIZ.LLILZ);
                            completionBlock2.onFailure(0, "", (XBaseResultModel) xBaseModelLIZ);
                        }

                        @Override // X.C142V
                        public final void LIZJ(String... strArr) {
                            C1836420xtA c1836420xtALJFF = C1836420xtA.LJFF();
                            C1839850xyh c1839850xyh = this.LIZ;
                            c1836420xtALJFF.LIZIZ(1, c1839850xyh.LLILZLL, c1839850xyh.LLILZIL, strLIZIZ);
                        }
                    }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                }
                j = 500;
            } else {
                j = 0;
            }
            try {
                this.LLIZ = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS48S1200000_27(this, completionBlock, strLIZIZ, 1));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1839920xyo.class, null);
                ((InterfaceC1839920xyo) xBaseModelLIZJ2).setPath(this.LLILZ);
                completionBlock.onFailure(0, "", (XBaseResultModel) xBaseModelLIZJ2);
            }
        }
    }
}
