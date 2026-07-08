package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;

/* JADX INFO: renamed from: X.0CiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321050CiF {
    public static final CommerceAgentMixFeed LIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new CommerceAgentMixFeed(null, null, null, null, 0, null, 0, null, null, null, null, null, null, 8191, null);
            }
            return (CommerceAgentMixFeed) C321270Cib.LIZ().LJII(str, CommerceAgentMixFeed.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new CommerceAgentMixFeed(null, null, null, null, 0, null, 0, null, null, null, null, null, null, 8191, null);
        }
    }
}
