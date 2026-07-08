package X;

import Y.ARunnableS127S0100000_27;
import Y.ARunnableS17S1100000_12;
import Y.ARunnableS96S0200000_27;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.game.broadcast.highlight.DownloadProgressDialog;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811940xFg implements C0UW7 {
    public DownloadProgressDialog LIZJ;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final C1836440xtC LIZIZ = new C1836440xtC();
    public final AtomicInteger LIZLLL = new AtomicInteger(0);

    @Override // X.C0UW7
    public final void LIZ(C19EG c19eg, final GameLiveFragment gameLiveFragment) {
        boolean z;
        String str = gameLiveFragment.downloadUrl;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadVideoAndSaveToDraft(). downloadUrl is null or empty. url=");
            sbLIZ.append(gameLiveFragment.downloadUrl);
            C20441214yg.LJ("HighLightVideoOperateImpl", C2188811AlT.LIZIZ(sbLIZ));
            C779470Uht.LIZ(0, 3, gameLiveFragment.fragmentIdStr, "download url is empty or null");
            return;
        }
        if (c19eg == null) {
            C20441214yg.LJ("HighLightVideoOperateImpl", "downloadVideoAndSaveToDraft(). activity is null.");
            C779470Uht.LIZ(0, 0, gameLiveFragment.fragmentIdStr, "activity is null");
        } else {
            this.LIZIZ.LIZJ(c19eg, gameLiveFragment.downloadUrl, ".mp4", gameLiveFragment.fragmentIdStr, new InterfaceC1836480xtG() { // from class: X.0Ukx
                @Override // X.InterfaceC1836480xtG
                public final void onProgress(DownloadInfo downloadInfo) {
                }

                @Override // X.InterfaceC1836480xtG
                public final void LIZIZ(int i) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                }

                @Override // X.InterfaceC1836480xtG
                public final void LJJI(String str2, String str3) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    C786410Ut5.LJJZZIII(this.LIZ.LIZ, new ARunnableS17S1100000_12(gameLiveFragment, str2, 2));
                }

                @Override // X.InterfaceC1836480xtG
                public final void LIZ(int i, int i2, String str2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadVideoAndSaveToDraft(). onFailure. errorType=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", failureCode=");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", errorMsg=");
                    sbLIZ2.append(str2);
                    C20441214yg.LJ("HighLightVideoOperateImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    C779470Uht.LIZ(i, i2, gameLiveFragment.fragmentIdStr, str2);
                }
            });
        }
    }

    @Override // X.C0UW7
    public final void Ut(Context context, String str, final String str2, String str3, final String str4, final int i, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final Integer num, final String str13, final String str14, final Map<String, String> map, final C580610Mpv c580610Mpv) {
        boolean z;
        C1811950xFh.LIZ = str;
        C1811950xFh.LIZIZ = str2;
        C1811950xFh.LIZJ = str4;
        C1811950xFh.LIZLLL = str5;
        C1811950xFh.LJ = str9;
        C1811950xFh.LJFF = str10;
        C1811950xFh.LJI = System.currentTimeMillis();
        DownloadProgressDialog downloadProgressDialog = this.LIZJ;
        if (downloadProgressDialog != null) {
            downloadProgressDialog.dismiss();
        }
        DownloadProgressDialog downloadProgressDialog2 = new DownloadProgressDialog();
        this.LIZJ = downloadProgressDialog2;
        downloadProgressDialog2.LLILLL = new InterfaceC1811910xFd() { // from class: X.0xFi
            @Override // X.InterfaceC1811910xFd
            public final void LIZ() {
                int i2 = this.LIZ.LIZLLL.get();
                if (i2 != 0) {
                    C1811950xFh.LIZ(null, "termination");
                    this.LIZ.LIZIZ.getClass();
                    C1811980xFk.LIZ.getClass();
                    Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C497740JfY.LJII()).cancel(i2);
                }
            }
        };
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadVideoAndJumpShortVideoEditPage(). downloadUrl is null or empty. url=");
            sbLIZ.append(str);
            C20441214yg.LJ("HighLightVideoOperateImpl", C2188811AlT.LIZIZ(sbLIZ));
            C1811950xFh.LIZ(3, "termination");
            C779470Uht.LIZIZ(0, 3, "download url is empty or null", str2);
            return;
        }
        final C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
        if (c19egLIZIZ != null && fragmentManagerLJIL != null) {
            DownloadProgressDialog downloadProgressDialog3 = this.LIZJ;
            if (downloadProgressDialog3 != null) {
                downloadProgressDialog3.show(fragmentManagerLJIL, "DownloadHighLightProgressDialog");
            }
            this.LIZIZ.LIZJ(c19egLIZIZ, str, str3, str4, new InterfaceC1836480xtG() { // from class: X.0xFf
                @Override // X.InterfaceC1836480xtG
                public final void LIZIZ(int i2) {
                    this.LIZ.LIZLLL.set(i2);
                    C1811950xFh.LJII = System.currentTimeMillis();
                }

                @Override // X.InterfaceC1836480xtG
                public final void onProgress(DownloadInfo downloadInfo) {
                    C1811940xFg c1811940xFg = this.LIZ;
                    C786410Ut5.LJJZZIII(c1811940xFg.LIZ, new ARunnableS96S0200000_27(c1811940xFg, downloadInfo, 5));
                }

                @Override // X.InterfaceC1836480xtG
                public final void LJJI(final String str15, String str16) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    final C1811940xFg c1811940xFg = this.LIZ;
                    BPEAHandler bPEAHandler = c1811940xFg.LIZ;
                    final C19EG c19eg = c19egLIZIZ;
                    final String str17 = str2;
                    final String str18 = str4;
                    final int i2 = i;
                    final String str19 = str5;
                    final String str20 = str6;
                    final String str21 = str9;
                    final String str22 = str7;
                    final String str23 = str8;
                    final String str24 = str10;
                    final String str25 = str11;
                    final String str26 = str12;
                    final Integer num2 = num;
                    final String str27 = str13;
                    final String str28 = str14;
                    final C580610Mpv c580610Mpv2 = c580610Mpv;
                    C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0xFe
                        public final void LIZ() {
                            DownloadProgressDialog downloadProgressDialog4 = c1811940xFg.LIZJ;
                            if (downloadProgressDialog4 != null) {
                                downloadProgressDialog4.dismiss();
                            }
                            c1811940xFg.LIZJ = null;
                            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).Gq2(c19eg, str15, str17, str18, i2, str19, str20, str21, str22, str23, str24, str25, str26, num2, str27, str28, c580610Mpv2);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("HighLightVideoOperateImpl@b167.downloadVideoAndJumpShortVideoEditPage$2$onSuccess$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("HighLightVideoOperateImpl@b167.downloadVideoAndJumpShortVideoEditPage$2$onSuccess$1");
                        }
                    });
                    Map<String, String> map3 = map;
                    if (Intrinsics.LJFF(C1811950xFh.LIZIZ, "livesdk_anchor_highlight_post_click")) {
                        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - C1811950xFh.LJII);
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_download_live_replay_duration");
                        c474500IjALIZ.LJJII(C1811950xFh.LIZLLL, "room_id");
                        c474500IjALIZ.LJJII("highlight_post", "download_type");
                        c474500IjALIZ.LJJII(C1811950xFh.LJFF, "anchor_id");
                        c474500IjALIZ.LJJII(Integer.valueOf(iCurrentTimeMillis), "duration");
                        c474500IjALIZ.LJJII("highlight_page", "event_page");
                        c474500IjALIZ.LJJII("1", "from_source");
                        c474500IjALIZ.LJJIIZI(map3);
                        c474500IjALIZ.LIZ();
                    }
                    C1811950xFh.LIZ(null, "finish");
                    String str29 = str2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("save_path", str15);
                    linkedHashMap.put("file_name", str16);
                    linkedHashMap.put("shoot_way", str29);
                    C1CC2.LJII(0, C0KQH.LIZ("ttlive_highlight_jump_edit_result"), linkedHashMap);
                }

                @Override // X.InterfaceC1836480xtG
                public final void LIZ(int i2, int i3, String str15) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadVideoAndJumpShortVideoEditPage(). onFailure. errorType=");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", failureCode=");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(", errorMsg=");
                    sbLIZ2.append(str15);
                    C20441214yg.LJ("HighLightVideoOperateImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    C1811940xFg c1811940xFg = this.LIZ;
                    C786410Ut5.LJJZZIII(c1811940xFg.LIZ, new ARunnableS127S0100000_27(c1811940xFg, 7));
                    C1811950xFh.LIZ(Integer.valueOf(i3), "fail");
                    Map mapLJ = C2097608Jq.LJ();
                    if (Intrinsics.LJFF(C1811950xFh.LIZIZ, "livesdk_anchor_highlight_post_click")) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_download_replay_failed");
                        c474500IjALIZ.LJJII(C1811950xFh.LIZLLL, "room_id");
                        c474500IjALIZ.LJJII("highlight_post", "download_type");
                        c474500IjALIZ.LJJII(C1811950xFh.LJFF, "anchor_id");
                        c474500IjALIZ.LJJII("highlight_page", "event_page");
                        c474500IjALIZ.LJJII("1", "from_source");
                        c474500IjALIZ.LJJII(str15, "error_msg");
                        c474500IjALIZ.LJJII(Integer.valueOf(i3), "failed_reason");
                        c474500IjALIZ.LJJII("highlight_page", "event_page");
                        c474500IjALIZ.LJJIIZI(mapLJ);
                        c474500IjALIZ.LIZ();
                    }
                    C779470Uht.LIZIZ(i2, i3, str15, str2);
                }
            });
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("downloadVideoAndJumpShortVideoEditPage(). activity is null. context=");
        sbLIZ2.append(context);
        C20441214yg.LJ("HighLightVideoOperateImpl", C2188811AlT.LIZIZ(sbLIZ2));
        C1811950xFh.LIZ(0, "fail");
        C779470Uht.LIZIZ(0, 0, "activity is null", str2);
    }
}
