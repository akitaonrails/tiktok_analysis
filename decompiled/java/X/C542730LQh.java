package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;

/* JADX INFO: renamed from: X.0LQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542730LQh {
    public static final /* synthetic */ int LIZ = 0;

    public static Source LIZ(String str) {
        Source sourceValueOf = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            sourceValueOf = Source.valueOf(str);
            return sourceValueOf;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return sourceValueOf;
        }
    }
}
