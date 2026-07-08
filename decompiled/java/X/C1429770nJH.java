package X;

import com.ss.android.ugc.aweme.creative.model.NowsShootModel;

/* JADX INFO: renamed from: X.0nJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429770nJH {
    public static final String LIZ(NowsShootModel nowsShootModel) {
        int i = nowsShootModel.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return "post";
                }
                return "photo";
            }
            return "combine";
        }
        return "photo";
    }
}
