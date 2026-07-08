package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0KhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524220KhA implements InterfaceC345200Dg6 {
    public final CreativeInfo LIZ;

    @Override // X.InterfaceC345200Dg6
    public final void LIZIZ(C1DRG c1drg) {
    }

    @Override // X.InterfaceC345200Dg6
    public final String getName() {
        return "livephoto_extract_task";
    }

    public C524220KhA(CreativeInfo creativeInfo) {
        this.LIZ = creativeInfo;
    }

    @Override // X.InterfaceC345200Dg6
    public final Object LIZ(Intent intent, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null) {
            HashMap map = new HashMap();
            for (MediaModel mediaModel : new ArrayList(parcelableArrayListExtra)) {
                if (mediaModel != null) {
                    C527420KmK c527420KmK = C527420KmK.LIZ;
                    CreativeInfo creativeInfo = this.LIZ;
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
                        map.put(mediaModel.id, mediaModelLIZIZ);
                    }
                }
            }
            if (!map.isEmpty()) {
                synchronized (intent) {
                    try {
                        intent.putExtra("key_choose_media_add_live_photo", map);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC345200Dg6
    public final Object LIZJ(C1DRG c1drg, Intent intent, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C345230Dg9.LIZIZ(this, intent, interfaceC1364105Vn);
    }
}
