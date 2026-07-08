package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;

/* JADX INFO: renamed from: X.0OVD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, TuxImageModel tuxImageModel) {
        if (tuxImageModel == null || !C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_gameplay_image_preload_setting", true, true)) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C0OSD.LIZIZ(context, tuxImageModel));
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJIILL();
    }
}
