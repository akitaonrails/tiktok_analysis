package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.io.File;
import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.168g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207256168g extends AbstractC207272168w {
    public static final Queue<AbstractC1749630vdB> LJ = new PriorityBlockingQueue(10, new Comparator() { // from class: X.0vdA
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC1749630vdB abstractC1749630vdB = (AbstractC1749630vdB) obj;
            AbstractC1749630vdB abstractC1749630vdB2 = (AbstractC1749630vdB) obj2;
            if (abstractC1749630vdB.LIZIZ() != abstractC1749630vdB2.LIZIZ()) {
                return Intrinsics.LJII(abstractC1749630vdB.LIZIZ(), abstractC1749630vdB2.LIZIZ());
            }
            return Intrinsics.LJII(abstractC1749630vdB.LIZ(), abstractC1749630vdB2.LIZ());
        }
    });
    public long LIZJ;
    public final String LIZ = "im_download_image";
    public final C054G LIZIZ = C2296808zG.LIZ(C2153208c6.LIZ().LIZ.plus(new C1712620ufU(CoroutineExceptionHandler.LJJLIL)));
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static String LJI() {
        C0I0B.LJFF.LIZJ();
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(C894660Z7w.LIZ()), "im/image/cache/");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj.getAbsolutePath();
    }

    @Override // X.AbstractC207272168w
    public final String LIZJ() {
        return this.LIZ;
    }

    public final void LJFF(long j) {
        if (j <= 0) {
            this.LIZLLL.set(false);
            return;
        }
        this.LIZLLL.set(true);
        AbstractC1749630vdB abstractC1749630vdB = (AbstractC1749630vdB) ((PriorityBlockingQueue) LJ).poll();
        if (abstractC1749630vdB == null) {
            this.LIZLLL.set(false);
        } else {
            C23250099c.LIZLLL(this.LIZIZ, null, null, new C1702770uPb(this, abstractC1749630vdB, j, null), 3);
        }
    }

    @Override // X.AbstractC207272168w
    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
        String str;
        String str2;
        Long l;
        String str3;
        long jLongValue;
        AbstractC1749630vdB c1749640vdC;
        Long l2;
        Long l3;
        long jLongValue2 = 1;
        if (c207274168y.LIZIZ.get("start_download") != null) {
            Object obj = c207274168y.LIZIZ.get("max_download_count");
            if ((obj instanceof Long) && (l3 = (Long) obj) != null) {
                jLongValue2 = l3.longValue();
            }
            if (System.currentTimeMillis() - this.LIZJ >= 60000 && !this.LIZLLL.get()) {
                this.LIZJ = System.currentTimeMillis();
                LJFF(jLongValue2);
            }
        } else {
            Object obj2 = c207274168y.LIZIZ.get("url");
            if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                Object obj3 = c207274168y.LIZIZ.get("file_name");
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                } else {
                    str2 = null;
                }
                Object obj4 = c207274168y.LIZIZ.get("is_permanent");
                if (obj4 instanceof Long) {
                    l = (Long) obj4;
                } else {
                    l = null;
                }
                Object obj5 = c207274168y.LIZIZ.get("cache_space");
                if (obj5 instanceof String) {
                    str3 = (String) obj5;
                } else {
                    str3 = null;
                }
                Object obj6 = c207274168y.LIZIZ.get("priority");
                if ((obj6 instanceof Long) && (l2 = (Long) obj6) != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                if (l != null && l.longValue() == 1) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    c1749640vdC = new C1749650vdD(str2, str, jLongValue, System.currentTimeMillis());
                } else if (str3 != null) {
                    c1749640vdC = new C1749640vdC(str3, str, jLongValue, System.currentTimeMillis());
                }
                C23250099c.LIZLLL(this.LIZIZ, null, null, new C1702760uPa(c1749640vdC, this, null), 3);
            }
        }
        LIZLLL(c207274168y, null);
    }

    public final void LJ(final AbstractC1749630vdB abstractC1749630vdB, final long j) {
        try {
            if (abstractC1749630vdB instanceof C1749650vdD) {
                C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LJI());
                sbLIZ.append(File.separator);
                sbLIZ.append(((C1749650vdD) abstractC1749630vdB).LIZ);
                if (c2137908Zd.LJFF(C2188811AlT.LIZIZ(sbLIZ))) {
                    LJFF(j - 1);
                    return;
                }
                AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(((C1749650vdD) abstractC1749630vdB).LIZIZ);
                abstractC2199801B7qWith.LIZJ = ((C1749650vdD) abstractC1749630vdB).LIZ;
                abstractC2199801B7qWith.LJ = LJI();
                abstractC2199801B7qWith.LJII = 1;
                abstractC2199801B7qWith.LJIIL = new IDownloadListener() { // from class: X.0vdF
                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFirstStart(DownloadInfo downloadInfo) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onPause(DownloadInfo downloadInfo) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onPrepare(DownloadInfo downloadInfo) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onProgress(DownloadInfo downloadInfo) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onStart(DownloadInfo downloadInfo) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onCanceled(DownloadInfo downloadInfo) {
                        this.LJFF(j - 1);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        IMStickerApi.LIZ.LIZIZ().getImStickerMessageService().LJIIJ(((C1749650vdD) abstractC1749630vdB).LIZ);
                        this.LJFF(j - 1);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        String message;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Download ");
                        sbLIZ2.append(((C1749650vdD) abstractC1749630vdB).LIZIZ);
                        sbLIZ2.append(" failed, ");
                        if (baseException != null) {
                            message = baseException.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ2.append(message);
                        sbLIZ2.append(", try to download next image ");
                        sbLIZ2.append(j);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        this.LJFF(j - 1);
                    }
                };
                abstractC2199801B7qWith.LJ(new InterfaceC2329409Au() { // from class: X.168h
                    @Override // X.InterfaceC2329409Au
                    public final void onStart(int i) {
                    }
                });
                return;
            }
            if (abstractC1749630vdB instanceof C1749640vdC) {
                Uri uri = UriProtector.parse(((C1749640vdC) abstractC1749630vdB).LIZIZ);
                String str = ((C1749640vdC) abstractC1749630vdB).LIZ;
                C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                if (str.length() != 0) {
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
                    c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
                    c1325700kbQLIZLLL.LJIJI = str;
                    if (!c1325540kbALIZ.LJIILJJIL(c1325700kbQLIZLLL.LIZ())) {
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(((C1749640vdC) abstractC1749630vdB).LIZIZ);
                        c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                        c1331670kl3LJIIIZ.LJJJJJ = ((C1749640vdC) abstractC1749630vdB).LIZ;
                        c1331670kl3LJIIIZ.LJIILLIIL(new InterfaceC605070NoH() { // from class: X.0vdE
                            @Override // X.InterfaceC605070NoH
                            public final void onCanceled() {
                                this.LJFF(j - 1);
                            }

                            @Override // X.InterfaceC605070NoH
                            public final void LIZ(File file) {
                                this.LJFF(j - 1);
                            }

                            @Override // X.InterfaceC605070NoH
                            public final void onFailed(Throwable th) {
                                String message;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Download ");
                                sbLIZ2.append(((C1749640vdC) abstractC1749630vdB).LIZIZ);
                                sbLIZ2.append(" failed, ");
                                if (th != null) {
                                    message = th.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ2.append(message);
                                sbLIZ2.append(", try to download next image ");
                                sbLIZ2.append(j);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                this.LJFF(j - 1);
                            }
                        });
                        return;
                    }
                }
                LJFF(j - 1);
                return;
            }
            throw new C1954807lC();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
