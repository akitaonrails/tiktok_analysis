package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.experiment.TakoAIVideoTipConfig;

/* JADX INFO: renamed from: X.0yWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860640yWE {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));

    public static boolean LIZ(Context context) {
        C1863130yaF.LIZ.getClass();
        if (!C1863130yaF.LIZ() || !C14TF.LIZIZ.LJJIJ(context)) {
            return false;
        }
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LJIJ()) {
            return false;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_ai_video_top_title_tip_show_times_");
        sbLIZ.append(curUserId);
        int i = kevaLJIIL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        C1860650yWF.LIZ.getClass();
        if (i >= ((TakoAIVideoTipConfig) C1860650yWF.LIZJ.getValue()).maxShowTimes) {
            return false;
        }
        return true;
    }
}
