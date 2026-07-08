package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524210Kh9 implements InterfaceC345200Dg6 {
    @Override // X.InterfaceC345200Dg6
    public final void LIZIZ(C1DRG c1drg) {
    }

    @Override // X.InterfaceC345200Dg6
    public final String getName() {
        return "livephoto_extract_task";
    }

    @Override // X.InterfaceC345200Dg6
    public final Object LIZ(Intent intent, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return Unit.LIZ;
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
        if (shortVideoContext == null) {
            return Unit.LIZ;
        }
        if (((ArrayList) C13LP.LJJJJLI(parcelableArrayListExtra)).isEmpty()) {
            return Unit.LIZ;
        }
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        LivePhotoModel livePhotoModel = creativeModel.livePhotoModel;
        if (livePhotoModel == null) {
            return Unit.LIZ;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (MediaModel mediaModel : new ArrayList(parcelableArrayListExtra)) {
            if (mediaModel != null) {
                C527420KmK c527420KmK = C527420KmK.LIZ;
                CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
                c527420KmK.getClass();
                MediaModel mediaModelLIZIZ = C527420KmK.LIZIZ(creativeInfo, mediaModel);
                if (mediaModelLIZIZ != null) {
                    LivePhotoInfo livePhotoInfo = mediaModel.livePhotoInfo;
                    if (livePhotoInfo != null) {
                        livePhotoInfo.setVideoPath(mediaModelLIZIZ.LJFF());
                    } else {
                        livePhotoInfo = new LivePhotoInfo(mediaModelLIZIZ.LJFF(), 0L, "LIVE_PHOTO", false);
                        mediaModel.livePhotoInfo = livePhotoInfo;
                    }
                    mediaModelLIZIZ.livePhotoInfo = livePhotoInfo;
                    linkedHashMap.put(mediaModel.id, mediaModelLIZIZ);
                    z = true;
                }
            }
        }
        livePhotoModel.embeddedVideoMap = linkedHashMap;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_enable_album_live_photo_video_check", true, true) && !z) {
            creativeModel.livePhotoModel = null;
        }
        intent.putExtra("key_choose_media_data", parcelableArrayListExtra);
        intent.putExtra("key_short_video_context", shortVideoContext);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC345200Dg6
    public final Object LIZJ(C1DRG c1drg, Intent intent, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C345230Dg9.LIZIZ(this, intent, interfaceC1364105Vn);
    }
}
