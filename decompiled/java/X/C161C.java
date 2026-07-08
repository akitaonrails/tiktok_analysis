package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.161C, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C161C {
    public static final Set<EnumC207101162h> LIZ = C13LQ.LJLIIL(new EnumC207101162h[]{EnumC207101162h.COMMERCE, EnumC207101162h.ADS_PRIMARY_STICKER});

    public static final String LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Long creativeId;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            return creativeId.toString();
        }
        return null;
    }

    public static final Long LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getAdId();
        }
        return null;
    }

    public static final String LIZJ(Aweme aweme, C161Q<?> c161q) {
        String strLJ;
        if (aweme != null && (strLJ = c161q.LJ(aweme)) != null) {
            if (strLJ.length() != 0) {
                Intrinsics.LJFF(strLJ, "un");
                if (strLJ == null) {
                }
            }
            return strLJ;
        }
        return "";
    }
}
