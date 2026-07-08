package X;

import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitMobParams;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0LiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550360LiE {
    public static final void LIZ(C0LAB c0lab, String str, AIPortraitModel aIPortraitModel) {
        AIPortraitContextModel aIPortraitContextModel;
        String str2;
        Integer numValueOf;
        String str3;
        String value;
        AIPortraitMobParams aIPortraitMobParams;
        EnumC1419230n2H enumC1419230n2H;
        AIPortraitMobParams aIPortraitMobParams2;
        EnumC570120MXq enumC570120MXq;
        AIPortraitMobParams aIPortraitMobParams3;
        AIPortraitMobParams aIPortraitMobParams4;
        Integer numValueOf2;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        C0LQY c0lqy = C0LQY.AI_PORTRAIT;
        c0lab.LJ("ai_biz", c0lqy.getValue());
        c0lab.LJ("shoot_way", c0lqy.getValue());
        if (aIPortraitModel != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null) {
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C1E30 c1e30 = C1E30.LJIIIIZZ;
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(259);
            c548880Lfq.getClass();
            C548880Lfq.LIZ(c0lab, str, c1e30, aIPortraitContextModel, aFwS239S0000000_8);
            AIPortraitContextModel aIPortraitContextModel2 = aIPortraitModel.contextModel;
            String value2 = null;
            if (aIPortraitContextModel2 != null && (aIPortraitGeneratingModel = aIPortraitContextModel2.generatingModel) != null) {
                str2 = aIPortraitGeneratingModel.serverWorkflowId;
            } else {
                str2 = null;
            }
            c0lab.LJ("server_task_id", str2);
            AIPortraitContextModel aIPortraitContextModel3 = aIPortraitModel.contextModel;
            if (aIPortraitContextModel3 != null) {
                numValueOf = Integer.valueOf(C550460LiO.LIZ(aIPortraitContextModel3));
            } else {
                numValueOf = null;
            }
            c0lab.LIZLLL(numValueOf, "is_ref_image");
            AIPortraitContextModel aIPortraitContextModel4 = aIPortraitModel.contextModel;
            if (aIPortraitContextModel4 != null && (aIPortraitMobParams4 = aIPortraitContextModel4.mobParams) != null) {
                c0lab.LIZ(aIPortraitMobParams4.isRetry ? 1 : 0, "is_retry");
                c0lab.LJ("action_type", aIPortraitMobParams4.actionType);
                RefImageType refImageType = aIPortraitMobParams4.isRefImg;
                if (refImageType != null) {
                    numValueOf2 = Integer.valueOf(refImageType.getValue());
                } else {
                    numValueOf2 = null;
                }
                c0lab.LIZLLL(numValueOf2, "is_ref_img");
            }
            String str4 = (String) C2553409zY.LIZ.getValue();
            if (str4.length() <= 0) {
                str4 = "seedream 4.5";
            }
            c0lab.LJ("model_name", str4);
            AIPortraitContextModel aIPortraitContextModel5 = aIPortraitModel.contextModel;
            if (aIPortraitContextModel5 != null && (aIPortraitMobParams3 = aIPortraitContextModel5.mobParams) != null) {
                str3 = aIPortraitMobParams3.entranceTemplateId;
            } else {
                str3 = null;
            }
            c0lab.LJ("entrance_ai_portrait_template_id", str3);
            AIPortraitContextModel aIPortraitContextModel6 = aIPortraitModel.contextModel;
            if (aIPortraitContextModel6 != null && (aIPortraitMobParams2 = aIPortraitContextModel6.mobParams) != null && (enumC570120MXq = aIPortraitMobParams2.entranceTemplatePos) != null) {
                value = enumC570120MXq.getValue();
            } else {
                value = null;
            }
            c0lab.LJ("entrance_ai_portrait_template_pos", value);
            AIPortraitContextModel aIPortraitContextModel7 = aIPortraitModel.contextModel;
            if (aIPortraitContextModel7 != null && (aIPortraitMobParams = aIPortraitContextModel7.mobParams) != null && (enumC1419230n2H = aIPortraitMobParams.entranceTemplateType) != null) {
                value2 = enumC1419230n2H.getValue();
            }
            c0lab.LJ("entrance_ai_portrait_template_type", value2);
        }
    }
}
