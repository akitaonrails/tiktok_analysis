package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LAF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LAF {
    public static final C0LAF LIZ = new C0LAF();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", str);
        if (z) {
            str2 = "failed";
        } else {
            str2 = "process";
        }
        pairArr[1] = new Pair("async_status", str2);
        LIZJ("enter_template_async_page", C2097608Jq.LJIIIIZZ(pairArr), videoPublishEditModel);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        LIZJ("exit_template_async_page", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("exit_method", str2)), videoPublishEditModel);
    }

    public static void LIZJ(String str, Map map, VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        if (videoPublishEditModel != null) {
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("tt_template_id", C1416310mxZ.LJJIJ(videoPublishEditModel, true));
            c0lab.LJ("tt_template_type", C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true));
            String str2 = videoPublishEditModel.creativeModel.asyncFuncList;
            if (C123100dR.LIZ(str2)) {
                c0lab.LJ("async_function_list", str2);
            }
        }
        c0lab.LJI(map);
        Map<String, String> map2 = c0lab.LIZ;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEvent: event=");
        sbLIZ.append(str);
        sbLIZ.append(", params=");
        sbLIZ.append(map2);
        C201955140j.LIZLLL(c563650M8t, "I2VMagicMobHelper", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL(str, map2);
    }
}
