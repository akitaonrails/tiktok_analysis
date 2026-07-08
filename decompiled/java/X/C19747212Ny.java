package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19747212Ny {
    public static final int LIZIZ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || iSparkHostApi.LJLLJ() == null) {
            return 0;
        }
        return R.style.y0;
    }

    public static final int LIZJ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || iSparkHostApi.LJLLJ() == null) {
            return 0;
        }
        return R.style.xm;
    }

    public static final Integer LIZ(Context context) {
        return C1308910kAL.LIZJ(R.attr.bx, context);
    }
}
