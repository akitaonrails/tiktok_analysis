package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;

/* JADX INFO: renamed from: X.0Dtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353710Dtp {
    public static File LIZIZ() {
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        EnumC20227914Cv enumC20227914Cv = EnumC20227914Cv.REVERSE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("workspace_");
        sbLIZ.append(C1017903yT.LIZ());
        return pathService.LJIIJ(enumC20227914Cv, C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static C0VSJ LIZ(CreativeInfo creativeInfo) {
        C0VSJ c0vsj = new C0VSJ(C354080DuQ.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, "", 4));
        C570490MZb.LJFF(c0vsj);
        return c0vsj;
    }
}
