package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.creation.generation.scene.AITheaterGenerationRootScene;
import com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549650Lh5 implements IAITheaterCreationLauncher {
    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final C19A3 LIZJ() {
        return new AITheaterCreationRootScene();
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final boolean LJI() {
        InterfaceC1659430tHh interfaceC1659430tHhLIZLLL;
        AITheaterProfileService aITheaterProfileService;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC1659430tHhLIZLLL = iAITheaterFeatureServiceLIZ.LIZLLL()) == null || (aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null)) == null || !aITheaterProfileService.LIZIZ().LIZ() || !interfaceC1659430tHhLIZLLL.LJFF()) {
            return false;
        }
        InterfaceC550750Lir interfaceC550750LirG9 = aITheaterProfileService.g9();
        return (interfaceC550750LirG9.LJIIL() || (interfaceC550750LirG9.LIZLLL() instanceof C316340Cae)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final C19A3 generationRootSceneInstance() {
        return new AITheaterGenerationRootScene();
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final Class<? extends C19A3> LIZLLL() {
        return AITheaterCreationRootScene.class;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final Class<? extends C19A3> generationRootSceneClass() {
        return AITheaterGenerationRootScene.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final boolean LIZIZ(Activity activity, Bundle bundle) {
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        AITheaterProfileService aITheaterProfileService;
        InterfaceC528960Koo interfaceC528960KooJ9;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        new Object() { // from class: X.0Lh7
        }.getClass();
        String string = bundle.getString("shoot_way");
        String string2 = bundle.getString("aicreation_scene_name");
        String string3 = bundle.getString(Scene.SCENE_SERVICE);
        String string4 = bundle.getString("enter_from");
        String string5 = bundle.getString("prepage_name");
        if (string5 == null) {
            string5 = bundle.getString("referpage_name");
        }
        String string6 = bundle.getString("recall_way");
        String string7 = bundle.getString("sender_uid");
        String string8 = bundle.getString("receiver_uid");
        int i = 0;
        if (Intrinsics.LJFF(string3, "aitheater_msg_cast_card")) {
            if (C123100dR.LIZ(string7) && C123100dR.LIZ(string8)) {
                IAITheaterFeatureService.LIZ.getClass();
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.LJ()) {
                    String uid = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid();
                    if (!Intrinsics.LJFF(string7, uid)) {
                        string8 = string7;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C537470L6b(string8, uid, C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C1336205Ku.LIZ(false).getImChatService().LJJIIZ(string8)), Intrinsics.LJFF(string7, uid), activity, null), 3);
                    return true;
                }
                C549150LgH.LIZ.getClass();
                C549150LgH.LIZJ(activity);
                return true;
            }
            C0LOG.LIZ(activity);
            return false;
        }
        if (C123100dR.LIZ(string) && C123100dR.LIZ(string2)) {
            CreativeModel creativeModel = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            CreativeInfo creativeInfo = new CreativeInfo(null, i, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
            AIGC.AICreationSceneName.Companion.getClass();
            AIGC.AICreationSceneName.Custom customLIZ = C549680Lh8.LIZ(string2);
            if (string5 == null) {
                string5 = "";
            }
            AIGCEntranceInfo aIGCEntranceInfoLIZ = C550740Liq.LIZ(string, customLIZ, new AIGC.RefPageName.Custom(string5), false);
            AIGC.RecallWay.Companion.getClass();
            IAITheaterCreationLauncher.EnterParams enterParams = new IAITheaterCreationLauncher.EnterParams(creativeInfo, creativeModel, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, AIGCEntranceInfo.LIZ(aIGCEntranceInfoLIZ, null, null, 0, null, null, false, false, false, null, null, string4, null, C542160LOc.LIZ(string6), null, false, false, 1038335), 14, objArr == true ? 1 : 0);
            String strLIZ = C528840Koc.LIZ();
            AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
            if (aIGCEntranceInfo != null && (aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null)) != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
                interfaceC528960KooJ9.LIZLLL(strLIZ, aIGCEntranceInfo);
            }
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ2 == null || (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ2.LIZ()) == null) {
                return true;
            }
            iAITheaterCreationLauncherLIZ.LIZ(enterParams, activity, strLIZ, false, null);
            return true;
        }
        C0LOG.LIZ(activity);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final void LJ(IAITheaterCreationLauncher.EnterParams enterParams, Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "enter_params", enterParams);
        C0MWH.LIZ.getClass();
        C0MWH.LJIIL(context, bundle, "AITheaterGenerationRootScene", null, null, null, true, 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0105 A[PHI: r6
      0x0105: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v6 java.lang.String) binds: [B:46:0x0103, B:44:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109 A[PHI: r6
      0x0109: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String) binds: [B:46:0x0103, B:48:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams r15, android.content.Context r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C549650Lh5.LJII(com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams, android.content.Context, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final void LJFF(IAITheaterCreationLauncher.EnterParams enterParams, Context context, boolean z) {
        LJII(enterParams, context, z);
    }

    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher
    public final void LIZ(IAITheaterCreationLauncher.EnterParams enterParams, Context context, String str, boolean z, Function0<Unit> function0) {
        LifecycleOwner lifecycleOwnerLIZLLL;
        Activity activityLIZ = C085T.LIZ(context);
        if (activityLIZ != null && (lifecycleOwnerLIZLLL = C629480OmY.LIZLLL(activityLIZ)) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZLLL), null, null, new C537560L6k(this, activityLIZ, enterParams, str, function0, context, z, null), 3);
        } else {
            LJII(enterParams, context, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.app.Activity r23, com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams r24, java.lang.String r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.InterfaceC1364105Vn<? super java.lang.Boolean> r27) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C549650Lh5.LJIIIIZZ(android.app.Activity, com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams, java.lang.String, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
