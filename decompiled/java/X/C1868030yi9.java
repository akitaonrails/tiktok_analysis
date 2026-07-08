package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.experiment.SearchPhotoArgbScopeConfig;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0yi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868030yi9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(466));

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZJ() {
        return LIZIZ() >= 2;
    }

    public static final Bitmap.Config LIZ(int i, int i2) {
        C01GW c01gw = C1868020yi8.LIZIZ;
        if (!((SearchPhotoArgbScopeConfig) c01gw.getValue()).enabled) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = ((SearchPhotoArgbScopeConfig) c01gw.getValue()).cardCount;
        if (i3 >= 0 && i2 >= 0 && i2 >= i3) {
            return Bitmap.Config.RGB_565;
        }
        int i4 = ((SearchPhotoArgbScopeConfig) c01gw.getValue()).imageCount;
        if (i4 >= 0 && i >= 0 && i >= i4) {
            return Bitmap.Config.RGB_565;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
