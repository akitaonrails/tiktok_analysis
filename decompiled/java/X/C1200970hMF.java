package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.UgcPoiTicketDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200970hMF {
    public static final /* synthetic */ C1200970hMF LIZ = new C1200970hMF();

    public static boolean LIZ(Aweme aweme, String str) {
        UgcPoiTicketDetail ugcPoiTicketDetail;
        String str2;
        if (aweme == null || str == null || !Intrinsics.LJFF(str, "personal_homepage") || (ugcPoiTicketDetail = aweme.getUgcPoiTicketDetail()) == null || (str2 = ugcPoiTicketDetail.ticketId) == null) {
            return false;
        }
        boolean zLIZJ = C1199400hJi.LIZJ(aweme.getUgcPoiTicketDetail());
        boolean zLIZ = C1199400hJi.LIZ(aweme.getUgcPoiTicketDetail());
        if (zLIZJ && C1200990hMH.LIZIZ.LJ(str2)) {
            return false;
        }
        if (zLIZ && C1200980hMG.LIZIZ.LJ(str2)) {
            return false;
        }
        if (!zLIZJ && !zLIZ) {
            return false;
        }
        return true;
    }
}
