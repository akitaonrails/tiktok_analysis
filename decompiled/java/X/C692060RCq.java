package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0RCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692060RCq {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static final boolean LIZ(Aweme aweme) {
        if (aweme != null && aweme.getAid() != null) {
            return LIZ.contains(aweme.getAid());
        }
        return false;
    }

    public static final void LIZIZ(Aweme aweme) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("record aid:");
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null && aweme.getAid() != null) {
            LIZ.add(aweme.getAid());
        }
    }
}
