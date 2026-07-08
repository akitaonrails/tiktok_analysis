package X;

import com.ss.android.ugc.airemix.model.AIRemixMobContextModel;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCreationInputInfo;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0Lfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548870Lfp {
    public static final void LIZ(C0LAB c0lab) {
        C0LQY c0lqy = C0LQY.AI_REMIX;
        c0lab.LJ("ai_biz", c0lqy.getValue());
        c0lab.LJ("shoot_way", c0lqy.getValue());
    }

    public static void LIZIZ(C0LAB c0lab, String str, AIRemixMobContextModel aIRemixMobContextModel) {
        if (aIRemixMobContextModel != null) {
            LIZ(c0lab);
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C2275071E3d c2275071E3d = new C2275051E3b() { // from class: X.1E3d
                {
                    C323580CmK c323580CmK = new C323580CmK(8);
                    c323580CmK.LIZIZ(C2275051E3b.LIZLLL);
                    c323580CmK.LIZIZ(C2275051E3b.LJ);
                    c323580CmK.LIZIZ(C2275051E3b.LJFF);
                    c323580CmK.LIZIZ(C2275051E3b.LJI);
                    c323580CmK.LIZIZ(C2275051E3b.LJII);
                    c323580CmK.LIZIZ(C2275051E3b.LJIIIIZZ);
                    c323580CmK.LIZIZ(C2275051E3b.LJIIIZ);
                    c323580CmK.LIZ(C1E3T.LIZIZ);
                }
            };
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(259);
            c548880Lfq.getClass();
            C548880Lfq.LIZ(c0lab, str, c2275071E3d, aIRemixMobContextModel, aFwS239S0000000_8);
            AIRemixCreationInputInfo aIRemixCreationInputInfo = aIRemixMobContextModel.aiRemixCreationInputInfo;
            if (aIRemixCreationInputInfo == null || aIRemixCreationInputInfo.contentSource == null) {
                c0lab.LJ("content_source", "");
            }
        }
    }

    public static void LIZJ(C0LAB c0lab, String str, AIRemixMobContextModel aIRemixMobContextModel) {
        if (aIRemixMobContextModel != null) {
            LIZ(c0lab);
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C2275101E3g c2275101E3g = new C2275051E3b() { // from class: X.1E3g
                {
                    C323580CmK c323580CmK = new C323580CmK(7);
                    c323580CmK.LIZIZ(C2275051E3b.LIZJ);
                    c323580CmK.LIZIZ(C2275051E3b.LJ);
                    c323580CmK.LIZIZ(C2275051E3b.LJFF);
                    c323580CmK.LIZIZ(C2275051E3b.LJI);
                    c323580CmK.LIZIZ(C2275051E3b.LJII);
                    c323580CmK.LIZIZ(C2275051E3b.LJIIIIZZ);
                    c323580CmK.LIZ(new C2275091E3f<Integer>() { // from class: X.1E42
                    });
                }
            };
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(259);
            c548880Lfq.getClass();
            C548880Lfq.LIZ(c0lab, str, c2275101E3g, aIRemixMobContextModel, aFwS239S0000000_8);
        }
    }
}
