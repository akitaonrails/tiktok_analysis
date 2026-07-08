package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0n4H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420470n4H {
    public final String LIZ;

    public C1420470n4H(String str) {
        this.LIZ = str;
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (!C523670KgH.LIZ()) {
            return;
        }
        C543670LTx c543670LTx = new C543670LTx();
        C1431320nLm c1431320nLm = new C1431320nLm(c543670LTx);
        c1431320nLm.LIZIZ = this.LIZ;
        c1431320nLm.LIZJ = videoPublishEditModel;
        c1431320nLm.LIZ();
        VideoPublishEditModel videoPublishEditModel2 = c1431320nLm.LIZJ;
        String str = null;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        c543670LTx.LIZLLL("prop_list", videoPublishEditModel2.getStickers());
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Publish Id: ");
        String str2 = c1431320nLm.LIZIZ;
        if (str2 != null) {
            str = str2;
        }
        sbLIZ.append(str);
        c1437510nVlLJJLIIIJ.LIZJ("build_publish_monitor_metrics", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        if (jSONObjectLJ == null) {
            jSONObjectLJ = new JSONObject();
        }
        Iterator<String> itKeys = jSONObjectLJ.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObjectLJ.opt(next);
            if (objOpt instanceof String) {
                c0lab.LJ(next, (String) objOpt);
            } else if (objOpt instanceof Long) {
                c0lab.LIZIZ(((Number) objOpt).longValue(), next);
            } else if (objOpt instanceof Integer) {
                c0lab.LIZ(((Number) objOpt).intValue(), next);
            } else if (objOpt instanceof Boolean) {
                c0lab.LJFF(next, ((Boolean) objOpt).booleanValue());
            } else {
                c0lab.LIZLLL(objOpt, next);
            }
        }
    }
}
