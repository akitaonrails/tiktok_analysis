package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0AvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C278320AvW {
    public static boolean LIZ(long j) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 24, "search_middle_recommend_expired_time", true) == 24 || System.currentTimeMillis() - j > C0C64.LJIILLIIL().LJIJ(31744, 24, "search_middle_recommend_expired_time", true) * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
            return true;
        }
        return false;
    }
}
