package X;

import Y.AfS132S0000000_7;
import Y.AfS138S0000000_16;
import Y.AfS144S0000000_27;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayTranscodeSetting;
import com.bytedance.android.livesdk.replay.LiveReplayEventNotifyApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1835210xrD implements InterfaceC1835200xrC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Function1<JSONObject, Unit> LJFF;

    public final String LIZIZ() {
        return TextUtils.isEmpty(this.LIZIZ) ? this.LIZ : this.LIZIZ;
    }

    @Override // X.InterfaceC1835200xrC
    public final void LIZ(DownloadInfo downloadInfo) throws Throwable {
        DownloadLiveReplayMethod.LJIIJJI(this.LIZ, 2, this.LIZIZ, 0, downloadInfo, this.LJFF);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_download_live_replay_duration");
        C1836420xtA c1836420xtALJFF = C1836420xtA.LJFF();
        int id = downloadInfo.getId();
        String str = this.LIZJ;
        c1836420xtALJFF.getClass();
        HashMap map = new HashMap();
        C1836430xtB<Long, Long> c1836430xtB = c1836420xtALJFF.LIZ.get(Integer.valueOf(id));
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getDownloadInfo(id).getTargetFilePath());
        String strLIZJ = C20144413ru.LIZJ(mediaMetadataRetriever);
        if (c1836430xtB != null) {
            map.put("duration", String.valueOf(c1836430xtB.LIZ));
        }
        map.put("live_duration", strLIZJ);
        map.put("room_id", str);
        map.put("download_type", "normal");
        c1836420xtALJFF.LIZ.remove(Integer.valueOf(id));
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(this.LIZLLL, "from_source");
        c474500IjALIZ.LJJII(this.LJ, "event_page");
        if (C0IUA.LJFF == 0) {
            c474500IjALIZ.LJI(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        c474500IjALIZ.LIZ();
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new C0VSJ(downloadInfo.getTargetFilePath())));
        if (!((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).needInterceptBySandbox(intent, 1207966465)) {
            C2204961BRm.LJJJJI(C497740JfY.LJII(), intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSAUv4UmvRvfF6t1knKY5vstA3ft/Zn70Dxr4TDp1glqd/ITAafJD84/s7Bdw==", null));
        }
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            C1835240xrG.LIZIZ(this.LIZIZ);
        }
        if (this.LIZIZ != null) {
            C480460Ism.LIZ().getClass();
            LiveReplayEventNotifyApi liveReplayEventNotifyApi = (LiveReplayEventNotifyApi) C480460Ism.LIZLLL(LiveReplayEventNotifyApi.class);
            long j = CastLongProtector.parseLong(this.LIZIZ);
            LiveReplayTranscodeSetting liveReplayTranscodeSetting = LiveReplayTranscodeSetting.INSTANCE;
            liveReplayEventNotifyApi.replayEventNotify(j, 3, liveReplayTranscodeSetting.hasInApp(), liveReplayTranscodeSetting.hasInBox()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS138S0000000_16(1), new AfS138S0000000_16(2));
        }
    }

    @Override // X.InterfaceC1835200xrC
    public final void onPause(DownloadInfo downloadInfo) {
        DownloadLiveReplayMethod.LJIIJJI(this.LIZ, 3, this.LIZIZ, 0, downloadInfo, this.LJFF);
    }

    @Override // X.InterfaceC1835200xrC
    public final void onProgress(DownloadInfo downloadInfo) {
        DownloadLiveReplayMethod.LJIIJJI(this.LIZ, 1, this.LIZIZ, 0, downloadInfo, this.LJFF);
    }

    @Override // X.InterfaceC1835200xrC
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_download_replay_failed");
        c474500IjALIZ.LJJII(this.LIZJ, "room_id");
        c474500IjALIZ.LJJII(this.LIZLLL, "from_source");
        c474500IjALIZ.LJJII(this.LJ, "event_page");
        c474500IjALIZ.LJJII("normal", "download_type");
        c474500IjALIZ.LJJII(baseException.getErrorMessage(), "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(baseException.getErrorCode()), "failed_reason");
        if (C0IUA.LJFF == 0) {
            c474500IjALIZ.LJI(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        c474500IjALIZ.LIZ();
        int i = 1006;
        if (baseException.getErrorCode() != 1006) {
            i = 0;
        }
        DownloadLiveReplayMethod.LJIIJJI(this.LIZ, 4, this.LIZIZ, i, downloadInfo, this.LJFF);
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            C1835240xrG.LIZIZ(this.LIZIZ);
        }
        if (this.LIZIZ != null) {
            C480460Ism.LIZ().getClass();
            LiveReplayEventNotifyApi liveReplayEventNotifyApi = (LiveReplayEventNotifyApi) C480460Ism.LIZLLL(LiveReplayEventNotifyApi.class);
            long j = CastLongProtector.parseLong(this.LIZIZ);
            LiveReplayTranscodeSetting liveReplayTranscodeSetting = LiveReplayTranscodeSetting.INSTANCE;
            liveReplayEventNotifyApi.replayEventNotify(j, 4, liveReplayTranscodeSetting.hasInApp(), liveReplayTranscodeSetting.hasInBox()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS144S0000000_27(4), new AfS132S0000000_7(26));
        }
    }

    public C1835210xrD(String str, String str2, C1835290xrL c1835290xrL) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LJFF = c1835290xrL;
    }

    public C1835210xrD(String str, String str2, String str3, String str4, String str5, Function1<JSONObject, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = function1;
    }
}
