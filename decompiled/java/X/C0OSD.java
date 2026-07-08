package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0OSD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OSD {
    public static final boolean LIZ(ImageUrlModel imageUrlModel) {
        if (imageUrlModel != null && !imageUrlModel.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final long LIZJ(String str) {
        Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6).iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue = (jLongValue * 100) + CastIntegerProtector.valueOf((String) it2.next()).longValue();
        }
        return jLongValue;
    }

    public static final ImageUrlModel LIZIZ(Context context, TuxImageModel tuxImageModel) {
        if (LIZ(tuxImageModel.imageUrlLocal) && LIZJ(C2213981Bky.LIZIZ.getVersionName()) >= tuxImageModel.minLocalVersion) {
            return tuxImageModel.imageUrlLocal;
        }
        if (LIZ(tuxImageModel.imageUrlLight) && LIZ(tuxImageModel.imageUrlDark)) {
            Integer numLIZ = C1308910kAL.LIZ(R.attr.g0d, context);
            if (numLIZ != null && numLIZ.intValue() == 0) {
                return tuxImageModel.imageUrlDark;
            }
            return tuxImageModel.imageUrlLight;
        }
        if (LIZ(tuxImageModel.imageUrlLight)) {
            return tuxImageModel.imageUrlLight;
        }
        if (LIZ(tuxImageModel.imageUrlDark)) {
            return tuxImageModel.imageUrlDark;
        }
        return null;
    }
}
