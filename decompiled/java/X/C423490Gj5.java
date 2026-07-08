package X;

import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423490Gj5 {
    public static TuxIconDrawable LIZ(int i, int i2, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (!C296090Bj5.LIZ() || C296090Bj5.LIZIZ() == 0) {
            c419910GdJ.LIZ = R.raw.icon_color_share_shadow_alt_2;
        } else if (C296090Bj5.LIZIZ() == 1) {
            c419910GdJ.LIZ = R.raw.icon_media_share;
        } else if (C296090Bj5.LIZIZ() == 2) {
            c419910GdJ.LIZ = R.raw.icon_exp_exp_01_icon_media_share;
        } else if (C296090Bj5.LIZIZ() == 3) {
            c419910GdJ.LIZ = R.raw.icon_exp_exp_02_icon_media_share;
        }
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i2;
        return c419910GdJ.LIZ(context);
    }
}
