package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1703106lh {
    public static final /* synthetic */ C1703106lh LIZ = new C1703106lh();
    public static final C01GW<IReportUtils> LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(387));

    public static IReportUtils LIZ() {
        return LIZIZ.getValue();
    }

    public static long LIZIZ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.LJFF(curUserId, "-1")) {
            return jCurrentTimeMillis;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append(jCurrentTimeMillis);
        long jCharAt = 0;
        for (int i = 0; i < C2188811AlT.LIZIZ(sbLIZ).length(); i++) {
            jCharAt = ((jCharAt * ((long) 10)) + ((long) (r7.charAt(i) - '0'))) % Long.MAX_VALUE;
        }
        return Math.abs(jCharAt);
    }

    public static String LIZJ(IMUser iMUser) {
        String shortId;
        if (iMUser != null) {
            String uniqueId = iMUser.getUniqueId();
            if (uniqueId != null && uniqueId.length() != 0) {
                shortId = iMUser.getUniqueId();
                if (shortId == null) {
                }
            } else {
                shortId = iMUser.getShortId();
                if (shortId == null) {
                    return "";
                }
            }
            return shortId;
        }
        return "";
    }
}
