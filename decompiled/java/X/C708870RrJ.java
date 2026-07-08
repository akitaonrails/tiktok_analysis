package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0RrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708870RrJ {
    public static final boolean LIZ;

    static {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getABService().getClass();
        LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_replace_lemon8_photo_post_music", true, false);
    }

    public static final boolean LIZ(Aweme aweme) {
        if (!C729980SkG.LJIIIIZZ(aweme) || !AwemeExtKt.isPhotoMode(aweme) || !LIZ || C0JME.LIZ(aweme.getEditPostPermission()) != C0JMD.SHOW.getValue()) {
            return false;
        }
        String aid = aweme.getAid();
        C01GW c01gw = C0RZ7.LIZ;
        Keva keva = (Keva) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_replace_music_close");
        sbLIZ.append(aid);
        if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String aid2 = aweme.getAid();
        Keva keva2 = (Keva) c01gw.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key_replace_music_display_time");
        sbLIZ2.append(aid2);
        if (jCurrentTimeMillis - keva2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L) < TimeUnit.DAYS.toMillis(1L)) {
            return false;
        }
        return true;
    }
}
