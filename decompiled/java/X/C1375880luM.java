package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;

/* JADX INFO: renamed from: X.0luM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375880luM {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 504) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        Integer numValueOf;
        if (aweme == null) {
            return false;
        }
        if ((AwemeSaaSExtKt.isForwardAweme(aweme) && (aweme = aweme.getForwardItem()) == null) || (numValueOf = Integer.valueOf(aweme.getAwemeType())) == null) {
            return false;
        }
        if (numValueOf.intValue() != 501 && numValueOf.intValue() != 502 && numValueOf.intValue() != 504) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        if (num.intValue() != 501 && num.intValue() != 502 && num.intValue() != 504) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() != 501 && aweme.getAwemeType() != 502) {
            return false;
        }
        return true;
    }
}
