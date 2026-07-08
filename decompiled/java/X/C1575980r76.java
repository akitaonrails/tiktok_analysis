package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0r76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575980r76 {
    public static final boolean LIZ(String str) {
        if (C1576040r7C.LIZ() && Intrinsics.LJFF(str, "shared_feed_like_history")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(String str) {
        if (C1576040r7C.LIZ() && Intrinsics.LJFF(str, "shared_feed")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(BaseResponse baseResponse) {
        if (baseResponse == null || baseResponse.status_code != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme == null || !Intrinsics.LJFF(aweme.getAid(), "vibe_page_chat_guide") || aweme.getAwemeType() != 333) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(Aweme aweme) {
        if (aweme == null || !Intrinsics.LJFF(aweme.getAid(), "vibe_page_chat_invite") || aweme.getAwemeType() != 333) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "vibe_feed_page_summary_", false)) {
            return false;
        }
        return true;
    }

    public static final String LJII(Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 1514764800) {
                long j = jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j);
                if (calendar.get(1) == Calendar.getInstance().get(1)) {
                    return C2215101Bmm.LIZ(j, "ll-Y");
                }
                return C2215101Bmm.LIZ(j, "ll");
            }
            return null;
        }
        return null;
    }
}
