package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489050JFv {
    public static String LIZ(C495980Jci c495980Jci, IInteractService iInteractService) {
        String strUq0 = iInteractService.Uq0(c495980Jci.LJII);
        if (Intrinsics.LJFF(strUq0, "user")) {
            strUq0 = "audience";
        }
        if (!c495980Jci.LIZJ.LJIIIIZZ && !Intrinsics.LJFF(c495980Jci.LJIIIIZZ.clickModule, "guessing_rank")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live_anchor_c_");
            sbLIZ.append(strUq0);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "live_anchor_c_anchor";
    }

    public static String LIZIZ(C495980Jci c495980Jci, IInteractService iInteractService) {
        String strUq0;
        String strUq02 = iInteractService.Uq0(c495980Jci.LJI.getId());
        String str = "audience";
        if (Intrinsics.LJFF(strUq02, "user")) {
            strUq02 = "audience";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_");
        sbLIZ.append(strUq02);
        sbLIZ.append("_c_");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (c495980Jci.LIZJ.LJIIIIZZ || Intrinsics.LJFF(c495980Jci.LJIIIIZZ.clickModule, "guessing_rank")) {
            strUq0 = "anchor";
        } else {
            strUq0 = iInteractService.Uq0(c495980Jci.LJII);
        }
        if (!Intrinsics.LJFF(strUq0, "user")) {
            str = strUq0;
        }
        if (c495980Jci.LIZJ.LJIIIIZZ) {
            sb.append("anchor");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
