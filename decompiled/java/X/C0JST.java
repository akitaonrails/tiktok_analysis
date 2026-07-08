package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JST, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JST {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1324720kZq c1324720kZq, Room room) {
        if (c1324720kZq == null) {
            return;
        }
        if (room.background != null) {
            c1324720kZq.setForeground(null);
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C1324610kZf c1324610kZfLJIJJ = C1819620xS4.LIZ().LJIJJ(R.drawable.dmp);
                c1324610kZfLJIJJ.LJIIIZ(room.background);
                c1324610kZfLJIJJ.LJJI(c1324720kZq);
                return;
            }
            C1324570kZb.LIZJ(c1324720kZq, room.background, C497740JfY.LJII().getResources().getDrawable(R.drawable.dmp), null, null, false);
            return;
        }
        String strLJIIJ = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1"), "ttlive_bg_broadcast_fragment.png");
        if (TextUtils.isEmpty(strLJIIJ)) {
            return;
        }
        C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJIIJ);
        url.LJIIIZ = R.drawable.dmp;
        url.LJIL = true;
        url.LJJ = Boolean.FALSE;
        url.LJJI(c1324720kZq);
    }
}
