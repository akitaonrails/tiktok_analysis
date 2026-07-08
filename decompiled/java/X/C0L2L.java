package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0L2L, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2L {
    public static final /* synthetic */ int LIZ = 0;

    public static Size LIZ(Context context, C0L9L c0l9l, int i) {
        int i2;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_album_use_fixed_thumbnail_size", true) != 0) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "story_album_use_fixed_thumbnail_size", true);
            if (iLJIJ != 1 && iLJIJ == 2) {
                i2 = 200;
            } else {
                i2 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            }
            return new Size(i2, i2);
        }
        Configuration configuration = context.getResources().getConfiguration();
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = (configuration.screenWidthDp - 2.0f) / i;
        float fWidthToHeightRatio = f2 / c0l9l.widthToHeightRatio();
        int iLIZIZ = C814420VxA.LIZIZ(f2 * f);
        int iLIZIZ2 = C814420VxA.LIZIZ(fWidthToHeightRatio * f);
        if (C23214097s.LIZ()) {
            float fLIZ = C274430ApF.LIZ();
            if (fLIZ != 1.0f) {
                return new Size((int) (iLIZIZ * fLIZ), (int) (iLIZIZ2 * fLIZ));
            }
        }
        return new Size(iLIZIZ, iLIZIZ2);
    }
}
