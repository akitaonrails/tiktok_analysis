package X;

import Y.ACallableS411S0100000_3;
import Y.ARunnableS32S0101000_21;
import Y.ARunnableS90S0200000_21;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m6V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383410m6V implements InterfaceC1377740lxM {
    public FeedPanelStateViewModel LIZ;
    public DialogC1390150mHN LIZIZ;

    @Override // X.InterfaceC1377740lxM
    public final void LIZ() {
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme != null && aweme.getAwemeACLShareInfo() != null && aweme.getAwemeACLShareInfo().getDownloadGeneral() != null && aweme.getAwemeACLShareInfo().getDownloadGeneral().getTranscode() != 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1377740lxM
    public final void LIZIZ(final Activity activity, final String str, final Aweme aweme, final String str2) {
        CreativeToolsPluginService creativeToolsPluginService;
        String str3;
        if (!activity.isFinishing() && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class)) != null && creativeToolsPluginService.LIZJ(activity, "share_as_gif", true)) {
            C1377830lxV.LIZ.getClass();
            C01GW c01gw = C1377830lxV.LIZIZ;
            String path = new C0VSJ((String) c01gw.getValue(), aweme.getAid()).getPath();
            C0VSJ c0vsj = new C0VSJ(path);
            if (c0vsj.exists() && c0vsj.length() > 0) {
                if (activity.isFinishing()) {
                    return;
                }
                VideoShare2GifEditActivity.LLLLLZL(activity, aweme.getAid(), AwemeExtKt.getAuthorUid(aweme), path, str, str2, LIZJ(aweme));
                return;
            }
            if (activity instanceof C19EG) {
                this.LIZ = (FeedPanelStateViewModel) ViewModelProviders.of((C19EG) activity).get(FeedPanelStateViewModel.class);
            }
            if (aweme.getVideo() != null && aweme.getVideo().getPlayAddrH264() != null && aweme.getVideo().getPlayAddrH264().getUrlList() != null) {
                str3 = (String) ListProtector.get(aweme.getVideo().getPlayAddrH264().getUrlList(), 0);
            } else {
                str3 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            C0VSJ c0vsj2 = new C0VSJ(path);
            if (!c0vsj2.getParentFile().exists()) {
                c0vsj2.getParentFile().mkdir();
            }
            C844470XAv.LIZ.getClass();
            DownloadTask downloadTaskWith = C2200151B8z.with(C844470XAv.LIZ());
            downloadTaskWith.url(str3);
            downloadTaskWith.savePath((String) c01gw.getValue());
            downloadTaskWith.name(aweme.getAid());
            final String str4 = str3;
            downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.0m6W
                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                    int curBytes = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
                    C1383410m6V c1383410m6V = this.LLILZLL;
                    c1383410m6V.getClass();
                    C15O7.LIZIZ(new ACallableS411S0100000_3(new ARunnableS32S0101000_21(curBytes, c1383410m6V, 7), 21), C15O7.LJIIIIZZ, null);
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    super.onStart(downloadInfo);
                    C1383410m6V c1383410m6V = this.LLILZLL;
                    Activity activity2 = activity;
                    c1383410m6V.getClass();
                    C15O7.LIZIZ(new ACallableS411S0100000_3(new ARunnableS90S0200000_21(activity2, c1383410m6V, 33), 21), C15O7.LJIIIIZZ, null);
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    final String strLIZIZ;
                    super.onSuccessed(downloadInfo);
                    if (downloadInfo.getSavePath().endsWith("/")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(downloadInfo.getSavePath());
                        sbLIZ.append(downloadInfo.getName());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(downloadInfo.getSavePath());
                        sbLIZ2.append(File.separator);
                        sbLIZ2.append(downloadInfo.getName());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    final C1383410m6V c1383410m6V = this.LLILZLL;
                    final Activity activity2 = activity;
                    final Aweme aweme2 = aweme;
                    final String str5 = str;
                    final String str6 = str2;
                    c1383410m6V.getClass();
                    C15O7.LIZIZ(new ACallableS411S0100000_3(new Runnable() { // from class: X.0m6X
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1383410m6V c1383410m6V2 = c1383410m6V;
                            Activity activity3 = activity2;
                            Aweme aweme3 = aweme2;
                            String str7 = strLIZIZ;
                            String str8 = str5;
                            String str9 = str6;
                            c1383410m6V2.getClass();
                            C1C7U.LIZ("GifShareNew@9c1b.onDownloadSuccess$1L");
                            if (activity3.isFinishing()) {
                                C1C7U.LIZIZ("GifShareNew@9c1b.onDownloadSuccess$1L");
                                return;
                            }
                            DialogC1390150mHN dialogC1390150mHN = c1383410m6V2.LIZIZ;
                            if (dialogC1390150mHN != null) {
                                dialogC1390150mHN.dismiss();
                                C785410UrT.LIZ(dialogC1390150mHN);
                            }
                            VideoShare2GifEditActivity.LLLLLZL(activity3, aweme3.getAid(), AwemeExtKt.getAuthorUid(aweme3), str7, str8, str9, C1383410m6V.LIZJ(aweme3));
                            FeedPanelStateViewModel feedPanelStateViewModel = c1383410m6V2.LIZ;
                            if (feedPanelStateViewModel != null) {
                                feedPanelStateViewModel.LLJI.setValue(false);
                            }
                            C1C7U.LIZIZ("GifShareNew@9c1b.onDownloadSuccess$1L");
                        }
                    }, 21), C15O7.LJIIIIZZ, null);
                    C2241008qG c2241008qG = new C2241008qG();
                    c2241008qG.LIZ.put("tools_use_downloader", Boolean.TRUE);
                    c2241008qG.LIZ.put("url", str4);
                    c2241008qG.LIZ.put("from", "gifshare");
                    JSONObject jSONObjectLJ = c2241008qG.LJ();
                    CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                    C793770VBv.LJIIJJI("aweme_download_error_rate", 0, jSONObjectLJ);
                    C1379790m0f.LIZIZ(1, aweme, "gif", str4);
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    String strLIZ;
                    super.onFailed(downloadInfo, baseException);
                    C1383410m6V c1383410m6V = this.LLILZLL;
                    Activity activity2 = activity;
                    c1383410m6V.getClass();
                    C15O7.LIZIZ(new ACallableS411S0100000_3(new ARunnableS90S0200000_21(activity2, c1383410m6V, 32), 21), C15O7.LJIIIIZZ, null);
                    if (baseException != null) {
                        strLIZ = C1331420kke.LIZ(baseException);
                    } else {
                        strLIZ = "null exception";
                    }
                    C2241008qG c2241008qG = new C2241008qG();
                    c2241008qG.LIZ.put("tools_use_downloader", Boolean.TRUE);
                    c2241008qG.LIZ.put("url", str4);
                    c2241008qG.LIZ.put("from", "gifshare");
                    c2241008qG.LIZ.put("exception", strLIZ);
                    JSONObject jSONObjectLJ = c2241008qG.LJ();
                    CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                    C793770VBv.LJIIJJI("aweme_download_error_rate", 1, jSONObjectLJ);
                }
            });
            downloadTaskWith.download();
        }
    }
}
