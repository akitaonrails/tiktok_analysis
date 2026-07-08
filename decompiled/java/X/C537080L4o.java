package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0L4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537080L4o implements InterfaceC21363918j7 {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ ShortVideoContext LIZIZ;

    @Override // X.InterfaceC21363918j7
    public final C21364318jB LIZ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        List parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C13BV.INSTANCE;
        }
        AIGCInfo aIGCInfo = null;
        try {
            stringExtra = intent.getStringExtra("videoPath");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            stringExtra2 = intent.getStringExtra("audioPath");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        try {
            String stringExtra3 = intent.getStringExtra("videoOriginPath");
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        Serializable serializableExtra = intent.getSerializableExtra("aigcInfo");
        if (serializableExtra instanceof AIGCInfo) {
            aIGCInfo = (AIGCInfo) serializableExtra;
        }
        return new C21364318jB((MediaModel) C13LP.LJJJLL(parcelableArrayListExtra), new C21364418jC(stringExtra, stringExtra2, str, aIGCInfo));
    }

    public C537080L4o(int i, ShortVideoContext shortVideoContext) {
        this.LIZ = i;
        this.LIZIZ = shortVideoContext;
    }

    @Override // X.InterfaceC21363918j7
    public final Bundle LIZIZ(DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure, C537090L4p c537090L4p) {
        Bundle bundle = new Bundle();
        int i = this.LIZ;
        ShortVideoContext shortVideoContext = this.LIZIZ;
        bundle.putInt("key_choose_scene", i);
        int i2 = 4;
        if (c537090L4p != null) {
            bundle.putInt("key_video_select_min_count", 0);
            bundle.putInt("key_video_select_max_count", 1);
            if (c537090L4p.LIZ) {
                bundle.putInt("key_photo_select_min_count", 0);
                bundle.putInt("key_photo_select_max_count", 1);
                i2 = 5;
            }
            if (c537090L4p.LIZIZ) {
                i2 |= 8;
            }
            bundle.putInt("key_support_flag", i2);
        } else {
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putInt("key_video_select_max_count", 1);
            bundle.putInt("key_support_flag", 4);
        }
        if (diyPropUploadVideoAutoCutConfigure != null) {
            C786410Ut5.LJJIJL(bundle, "diy_prop_upload_video_configure", diyPropUploadVideoAutoCutConfigure);
        }
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_green_screen_gallery_hint_in_dark_mode", true, true)) {
            bundle.putBoolean("album_fluency_opt", true);
        }
        return bundle;
    }
}
