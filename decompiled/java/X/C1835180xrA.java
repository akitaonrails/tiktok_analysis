package X;

import Y.AfS132S0000000_7;
import Y.AfS136S0000000_13;
import Y.AfS144S0000000_27;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayTranscodeSetting;
import com.bytedance.android.livesdk.replay.LiveReplayEventNotifyApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0xrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1835180xrA implements InterfaceC1835200xrC {
    public final String LIZ;
    public final String LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC1835200xrC
    public void LIZ(DownloadInfo downloadInfo) {
        String str;
        C20441214yg.LIZIZ("LiveReplyDownloader", "onSuccess");
        long currentUserId = C0IUA.LJFF;
        if (currentUserId == 0) {
            currentUserId = UserService.getInstance().user().getCurrentUserId();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_download_live_replay_duration");
        c474500IjALIZ.LJJII(this.LIZIZ, "room_id");
        if (this.LIZJ) {
            str = "normal";
        } else {
            str = "schedule";
        }
        c474500IjALIZ.LJJII(str, "download_type");
        c474500IjALIZ.LJJII(String.valueOf(currentUserId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(downloadInfo.getDownloadTime()), "duration");
        c474500IjALIZ.LJJII("video_page", "event_page");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "from_source");
        c474500IjALIZ.LIZ();
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new C0VSJ(downloadInfo.getTargetFilePath())));
        if (!((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).needInterceptBySandbox(intent, 1207966465)) {
            C2204961BRm.LJJJJI(C497740JfY.LJII(), intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGJR85SaO0vq0q4HuUcjl//ZXhEwtdjRcthOYLpBE", null));
        }
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            C1835240xrG.LIZIZ(this.LIZIZ);
        }
        if (this.LIZIZ != null) {
            C480460Ism.LIZ().getClass();
            LiveReplayEventNotifyApi liveReplayEventNotifyApi = (LiveReplayEventNotifyApi) C480460Ism.LIZLLL(LiveReplayEventNotifyApi.class);
            long j = CastLongProtector.parseLong(this.LIZIZ);
            LiveReplayTranscodeSetting liveReplayTranscodeSetting = LiveReplayTranscodeSetting.INSTANCE;
            liveReplayEventNotifyApi.replayEventNotify(j, 3, liveReplayTranscodeSetting.hasInApp(), liveReplayTranscodeSetting.hasInBox()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS136S0000000_13(4), new AfS136S0000000_13(5));
        }
    }

    @Override // X.InterfaceC1835200xrC
    public void onPause(DownloadInfo downloadInfo) {
        C20441214yg.LIZIZ("LiveReplyDownloader", "onPause");
    }

    @Override // X.InterfaceC1835200xrC
    public void onProgress(DownloadInfo downloadInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgress:");
        sbLIZ.append(downloadInfo.getDownloadProcess());
        C20441214yg.LIZIZ("LiveReplyDownloader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1835180xrA(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC1835200xrC
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        C20441214yg.LIZIZ("LiveReplyDownloader", "onFailed");
        if (C0IUA.LJFF == 0) {
            UserService.getInstance().user().getCurrentUserId();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_download_replay_failed");
        c474500IjALIZ.LJJII(this.LIZIZ, "room_id");
        if (this.LIZJ) {
            str = "normal";
        } else {
            str = "schedule";
        }
        c474500IjALIZ.LJJII(str, "download_type");
        c474500IjALIZ.LJJII(baseException.getErrorMessage(), "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(baseException.getErrorCode()), "failed_reason");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "from_source");
        c474500IjALIZ.LJI(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c474500IjALIZ.LIZ();
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

    public C1835180xrA(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = true;
    }
}
