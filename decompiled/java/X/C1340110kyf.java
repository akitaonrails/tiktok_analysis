package X;

import com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340110kyf {
    public static String LIZ;
    public static List<CmtUserBadgeInfoStruct> LIZIZ;

    public static List LIZ() {
        CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct;
        Long l;
        if (!Intrinsics.LJFF(C461720I8s.LIZIZ(), LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get");
            List<CmtUserBadgeInfoStruct> list = LIZIZ;
            sbLIZ.append(list != null ? C1741890vQh.LJIIIIZZ(list) : null);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ = C461720I8s.LIZIZ();
            LIZIZ = null;
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("get");
        List<CmtUserBadgeInfoStruct> list2 = LIZIZ;
        sbLIZ2.append(list2 != null ? C1741890vQh.LJIIIIZZ(list2) : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        List<CmtUserBadgeInfoStruct> list3 = LIZIZ;
        if (list3 == null || (cmtUserBadgeInfoStruct = (CmtUserBadgeInfoStruct) C13LP.LJJJLL(list3)) == null || (l = cmtUserBadgeInfoStruct.endTime) == null || jCurrentTimeMillis >= l.longValue()) {
            return null;
        }
        return LIZIZ;
    }
}
