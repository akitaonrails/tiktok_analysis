package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LC8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0LC8 extends C2217421BqW implements Function1<InnerPushMessage, Unit> {
    public C0LC8(C0LC5 c0lc5) {
        super(1, c0lc5, C0LC5.class, "onAILiveInnerPushClick", "onAILiveInnerPushClick(Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InnerPushMessage innerPushMessage) {
        String str;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        EnumC545550LaT enumC545550LaT;
        AwemeDraft awemeDraft;
        C0LC5 c0lc5 = (C0LC5) this.receiver;
        c0lc5.getClass();
        C0LCA c0lcaLJIILIIL = C0LC5.LJIILIIL(innerPushMessage);
        if (c0lcaLJIILIIL != null && Intrinsics.LJFF(c0lcaLJIILIIL.LIZ, "ai_live_photo") && (str = c0lcaLJIILIIL.LIZIZ) != null && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C538810LBf c538810LBf = (C538810LBf) ((LinkedHashMap) c0lc5.LL).get(str);
            if (c538810LBf != null) {
                enumC545550LaT = c538810LBf.LIZ;
            } else {
                enumC545550LaT = null;
            }
            if (enumC545550LaT == EnumC545550LaT.COMPLETE && (awemeDraft = c538810LBf.LIZIZ) != null) {
                AILivePhotoModel aILivePhotoModel = awemeDraft.LIZ.aiLivePhotoModel;
                aILivePhotoModel.isFailureRecall = false;
                aILivePhotoModel.LJIILJJIL(c0lcaLJIILIIL.LIZLLL);
                AwemeDraft awemeDraft2 = c538810LBf.LIZIZ;
                awemeDraft2.LJIJI = 13;
                C570560MZi.LJFF(activityLIZ, awemeDraft2, 13, System.currentTimeMillis(), null);
                C201955140j.LIZLLL(C0L76.LIZIZ, "AILivePhotoInnerPush", "editDraft");
            } else {
                SmartRouter.buildRoute(activityLIZ, c0lcaLJIILIIL.LIZJ).open();
                C201955140j.LIZLLL(C0L76.LIZIZ, "AILivePhotoInnerPush", "goAILivePhotoMiddleActivity");
            }
        }
        return Unit.LIZ;
    }
}
