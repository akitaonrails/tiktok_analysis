package X;

import com.ss.android.ugc.aweme.config.Crowd;

/* JADX INFO: renamed from: X.0QRL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QRL {
    public static final boolean LIZ(Crowd crowd) {
        Integer num;
        if (crowd == null || (num = crowd.enableVisualSearchGuide) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }
}
