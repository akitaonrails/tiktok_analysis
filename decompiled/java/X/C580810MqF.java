package X;

import Y.ACallableS240S0200000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ailivephoto.AILivePhotoCreateActivity;
import com.ss.android.ugc.aweme.music.v2.assem.MusicCreateSongAssem;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraActivity;
import com.ss.android.ugc.aweme.video.SubOnlyVideoItemCell;
import com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS286S0300000_8;

/* JADX INFO: renamed from: X.0MqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580810MqF extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case 4:
                onFailed$0(this);
                break;
            case 5:
                onFailed$1(this);
                break;
            default:
                super.onFailed();
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
            case 4:
                onLoad$4(this, asyncAVService, j);
                break;
            case 5:
                onLoad$5(this, asyncAVService, j);
                break;
            case 6:
                onLoad$6(this, asyncAVService, j);
                break;
            case 7:
                onLoad$7(this, asyncAVService, j);
                break;
            case 8:
                onLoad$8(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    public static final void onFailed$0(C580810MqF c580810MqF) {
        ((ShortcutShootingActivity) c580810MqF.l0).finish();
    }

    public static final void onFailed$1(C580810MqF c580810MqF) {
        ((VideoShare2GifEditActivity) c580810MqF.l0).finish();
    }

    public C580810MqF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLoad$0(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        AILivePhotoCreateActivity aILivePhotoCreateActivity = (AILivePhotoCreateActivity) c580810MqF.l0;
        C575870MiH c575870MiH = new C575870MiH();
        c575870MiH.LIZ.setEnableLivePhoto(true);
        iRecordServiceRecordService.startAlbum(aILivePhotoCreateActivity, c575870MiH.LIZ, true);
        ((AILivePhotoCreateActivity) c580810MqF.l0).finish();
    }

    public static final void onLoad$1(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startAiSelfScanFace("aime_notification", "aime_notification", (AimeCameraActivity) c580810MqF.l0, "aime_notification", "");
    }

    public static final void onLoad$2(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        Activity activity = (Activity) c580810MqF.l0;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.showStickerPanel(true);
        iRecordServiceRecordService.startRecord(activity, builder.build());
    }

    public static final void onLoad$3(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        IAVDraftService iAVDraftServiceDraftService = ((IExternalService) ((SubOnlyVideoItemCell) c580810MqF.l0).LL.getValue()).draftService();
        Context context = ((SubOnlyVideoItemCell) c580810MqF.l0).itemView.getContext();
        Bundle bundle = new Bundle();
        bundle.putBoolean("entered_from_sub_only_videos_page", true);
        iAVDraftServiceDraftService.openDraftActivity(context, bundle);
    }

    public static final void onLoad$4(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        ((ShortcutShootingActivity) c580810MqF.l0).finish();
        Intent intent = ((ShortcutShootingActivity) c580810MqF.l0).getIntent();
        intent.putExtra("shoot_way", "short_cut");
        asyncAVService.uiService().recordService().startRecord((ShortcutShootingActivity) c580810MqF.l0, intent);
    }

    public static final void onLoad$5(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        C15O7.LIZIZ(new ACallableS240S0200000_8(c580810MqF, asyncAVService, 3), ExecutorC1592406Li.LLILLJJLI, null);
    }

    public static final void onLoad$6(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        C19EG c19eg = ((MusicCreateSongAssem) c580810MqF.l0).LLJJIII;
        if (c19eg != null) {
            asyncAVService.uiService().recordService().startMemeSongPage(c19eg, "MusicDetail", null, new AwS286S0300000_8((MusicCreateSongAssem) c580810MqF.l0, asyncAVService, c19eg, 5));
        }
    }

    public static final void onLoad$7(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        ((Function1) c580810MqF.l0).invoke(asyncAVService);
    }

    public static final void onLoad$8(C580810MqF c580810MqF, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startAiSelfScanFace("personal_homepage_profile", "personal_homepage_profile", ((Fragment) c580810MqF.l0).requireContext(), "personal_homepage_profile", "");
    }
}
