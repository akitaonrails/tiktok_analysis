package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.00pW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C198000pW {
    public static final int LIZ(LiveMode liveMode) {
        int i = C197900pV.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return R.attr.emd;
                    }
                    return R.attr.djg;
                }
                return R.attr.dtm;
            }
            return R.attr.e8r;
        }
        return R.attr.eib;
    }
}
