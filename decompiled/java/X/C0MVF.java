package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundNavigationService;
import com.ss.android.ugc.aweme.aigc.aiplayground.navigate.AIPlaygroundBaseScene;
import com.ss.android.ugc.aweme.autopick.api.AutoPickServiceApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;
import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.memesong.MemeSongPageContainerScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoLightRecordContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordContainerScene;
import com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.tools.mvtemplate.magic.MagicTaskLoadingContainerScene;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.AILivePromptDependencyRootScene;
import com.ss.android.ugc.gamora.editor.ailive.widget.EditAIGCHelpCenterScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.CreationOnThisDayPreviewScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import com.ss.android.ugc.tools.chat.room.scene.AiChatRoomRootScene;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MVF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVF extends C09AY implements Function0<C0MGP> {
    public C0MVF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MGP] */
    @Override // kotlin.jvm.functions.Function0
    public final C0MGP invoke() {
        return new C0MWI() { // from class: X.0MGP
            public final C01GW LIZ;
            public final C01GW LIZIZ;
            public final List<Class<? extends C19A3>> LIZJ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                Class<? extends C19A3> clsLIZJ;
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(645));
                this.LIZ = c01gwLIZIZ;
                this.LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(646));
                List<Class<? extends C19A3>> listLJIILJJIL = C1697810uHb.LJIILJJIL(VideoRecordContainerScene.class, VideoLightRecordContainerScene.class, MagicTaskLoadingContainerScene.class, SelectMaterialScene.class, EPAICreateSelectMaterialScene.class, VideoPublishContainerScene.class, ImagePublishPreviewScene.class, c01gwLIZIZ.getValue(), AILivePromptDependencyRootScene.class);
                IAIPlaygroundNavigationService iAIPlaygroundNavigationServiceLIZ = C1832407Fq.LIZ();
                if (iAIPlaygroundNavigationServiceLIZ != null && (clsLIZJ = iAIPlaygroundNavigationServiceLIZ.LIZJ()) != null) {
                    listLJIILJJIL.add(clsLIZJ);
                }
                this.LIZJ = listLJIILJJIL;
            }

            @Override // X.C0MWI
            public final boolean LIZ(C198H c198h) {
                return c198h.getScene() instanceof C0L3Q;
            }

            @Override // X.C0MWI
            public final boolean LIZIZ(C198H c198h) {
                return LJII(c198h.getScene());
            }

            @Override // X.C0MWI
            public final boolean LIZJ(Scene scene) {
                return scene instanceof VideoPublishContainerScene;
            }

            @Override // X.C0MWI
            public final boolean LIZLLL(Scene scene) {
                return scene instanceof VideoPublishEditContainerScene;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0MWI
            public final LifecycleOwner LJ(Activity activity) {
                Scene scene;
                InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
                if (interfaceC20597015iiLIZJ != null) {
                    C198H c198hLC = interfaceC20597015iiLIZJ.LC();
                    if (c198hLC != null && (scene = c198hLC.getScene()) != null) {
                        return scene;
                    }
                    if (activity instanceof LifecycleOwner) {
                        return (LifecycleOwner) activity;
                    }
                } else if (activity instanceof LifecycleOwner) {
                    return (LifecycleOwner) activity;
                }
                return null;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.C0MWI
            public final C19A3 LJI(String str) {
                IAIPortraitLauncher iAIPortraitLauncherLIZ;
                C19A3 c19a3TabRootSceneInstance;
                IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
                C19A3 c19a3LIZJ;
                IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ2;
                C19A3 c19a3GenerationRootSceneInstance;
                IAIPortraitLauncher iAIPortraitLauncherLIZ2;
                C19A3 c19a3StylePreviewRootSceneInstance;
                C19A3 c19a3LJI;
                C19A3 c19a3H9;
                IAIPortraitLauncher iAIPortraitLauncherLIZ3;
                C19A3 c19a3GenerationRootSceneInstance2;
                AIPlaygroundBaseScene aIPlaygroundBaseSceneLIZIZ;
                C19A3 c19a3L9;
                IAIPortraitLauncher iAIPortraitLauncherLIZ4;
                C19A3 c19a3CustomizeRootSceneInstance;
                if (((Boolean) C04V9.LIZJ.getValue()).booleanValue()) {
                    switch (str.hashCode()) {
                        case -2102403859:
                            if (str.equals("SocialVideoRecordScene")) {
                                return ((SocialCameraEditorService) ServiceManager.get().getService(SocialCameraEditorService.class)).LIZ();
                            }
                            break;
                        case -2093897438:
                            if (str.equals("TextToImageChooseScene")) {
                                return ((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LJJIII();
                            }
                            break;
                        case -2061730070:
                            if (str.equals("StoryEditContainerScene")) {
                                return ((SocialCameraEditorService) ServiceManager.get().getService(SocialCameraEditorService.class)).LJFF();
                            }
                            break;
                        case -1604784455:
                            if (str.equals("TextToImageScene")) {
                                return ((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LJ();
                            }
                            break;
                        case -1408351548:
                            if (str.equals("CreationOnThisDayPreviewScene")) {
                                return new CreationOnThisDayPreviewScene();
                            }
                            break;
                        case -1293042422:
                            if (str.equals("AIPortraitCustomizeRootScene")) {
                                IAIPortraitFeatureService iAIPortraitFeatureService = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
                                if (iAIPortraitFeatureService != null && (iAIPortraitLauncherLIZ4 = iAIPortraitFeatureService.LIZ()) != null && (c19a3CustomizeRootSceneInstance = iAIPortraitLauncherLIZ4.customizeRootSceneInstance()) != null) {
                                    return c19a3CustomizeRootSceneInstance;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case -1208362471:
                            if (str.equals("cameo_cloud_draft_list_scene")) {
                                AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
                                if (aITheaterProfileService != null && (c19a3L9 = aITheaterProfileService.l9()) != null) {
                                    return c19a3L9;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case -1114427528:
                            if (str.equals("AIPlaygroundBaseScene")) {
                                IAIPlaygroundNavigationService iAIPlaygroundNavigationServiceLIZ = C1832407Fq.LIZ();
                                if (iAIPlaygroundNavigationServiceLIZ != null && (aIPlaygroundBaseSceneLIZIZ = iAIPlaygroundNavigationServiceLIZ.LIZIZ()) != null) {
                                    return aIPlaygroundBaseSceneLIZIZ;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case -1048083043:
                            if (str.equals("CreationChatRoomContainerScene")) {
                                return new AiChatRoomRootScene();
                            }
                            break;
                        case -454017382:
                            if (str.equals("EPAICreateSelectMaterialScene")) {
                                return new EPAICreateSelectMaterialScene();
                            }
                            break;
                        case -308341329:
                            if (str.equals("AIPortraitGenerationRootScene")) {
                                IAIPortraitFeatureService iAIPortraitFeatureService2 = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
                                if (iAIPortraitFeatureService2 != null && (iAIPortraitLauncherLIZ3 = iAIPortraitFeatureService2.LIZ()) != null && (c19a3GenerationRootSceneInstance2 = iAIPortraitLauncherLIZ3.generationRootSceneInstance()) != null) {
                                    return c19a3GenerationRootSceneInstance2;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case -202935513:
                            if (str.equals("cloud_draft_cameo_preview_scene")) {
                                AITheaterProfileService aITheaterProfileService2 = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
                                if (aITheaterProfileService2 != null && (c19a3H9 = aITheaterProfileService2.h9()) != null) {
                                    return c19a3H9;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case 251141230:
                            if (str.equals("EDIT_AIGC_TERMS_SCENE")) {
                                return new EditAIGCHelpCenterScene();
                            }
                            break;
                        case 345255955:
                            if (str.equals("OnThisDayCardPreviewScene")) {
                                return new OnThisDayCardPreviewScene();
                            }
                            break;
                        case 421275911:
                            if (str.equals("MemeSongScene")) {
                                return new MemeSongPageContainerScene();
                            }
                            break;
                        case 625324446:
                            if (str.equals("AutoPickLoadingRootScene")) {
                                AutoPickServiceApi autoPickServiceApi = (AutoPickServiceApi) PluggableExtentionKt.pluggableSpi$default(AutoPickServiceApi.class, false, false, false, 14, null);
                                if (autoPickServiceApi != null && (c19a3LJI = autoPickServiceApi.LJI()) != null) {
                                    return c19a3LJI;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case 658361063:
                            if (str.equals("AILivePromptDependencyRootScene")) {
                                return new AILivePromptDependencyRootScene();
                            }
                            break;
                        case 845621112:
                            if (str.equals("VideoRecordNewScene")) {
                                return new VideoRecordContainerScene();
                            }
                            break;
                        case 873622928:
                            if (str.equals("AIPortraitStylePreviewRootScene")) {
                                IAIPortraitFeatureService iAIPortraitFeatureService3 = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
                                if (iAIPortraitFeatureService3 != null && (iAIPortraitLauncherLIZ2 = iAIPortraitFeatureService3.LIZ()) != null && (c19a3StylePreviewRootSceneInstance = iAIPortraitLauncherLIZ2.stylePreviewRootSceneInstance()) != null) {
                                    return c19a3StylePreviewRootSceneInstance;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case 946825695:
                            if (str.equals("VideoPublishContainerScene")) {
                                return new VideoPublishContainerScene();
                            }
                            break;
                        case 1154195433:
                            if (str.equals("SelectMaterialScene")) {
                                return new SelectMaterialScene();
                            }
                            break;
                        case 1168794889:
                            if (str.equals("AITheaterGenerationRootScene")) {
                                IAITheaterFeatureService.LIZ.getClass();
                                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                                if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ2 = iAITheaterFeatureServiceLIZ.LIZ()) != null && (c19a3GenerationRootSceneInstance = iAITheaterCreationLauncherLIZ2.generationRootSceneInstance()) != null) {
                                    return c19a3GenerationRootSceneInstance;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case 1175440958:
                            if (str.equals("ExteriorVideoRecordScene")) {
                                return new ExteriorVideoRecordScene();
                            }
                            break;
                        case 1280860324:
                            if (str.equals("AITheaterCreationScene")) {
                                IAITheaterFeatureService.LIZ.getClass();
                                IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
                                if (iAITheaterFeatureServiceLIZ2 != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ2.LIZ()) != null && (c19a3LIZJ = iAITheaterCreationLauncherLIZ.LIZJ()) != null) {
                                    return c19a3LIZJ;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case 1335338327:
                            if (str.equals("VideoLightRecordContainerScene")) {
                                return new VideoLightRecordContainerScene(0);
                            }
                            break;
                        case 1401361464:
                            if (str.equals("AIPortraitTabRootScene")) {
                                IAIPortraitFeatureService iAIPortraitFeatureService4 = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
                                if (iAIPortraitFeatureService4 != null && (iAIPortraitLauncherLIZ = iAIPortraitFeatureService4.LIZ()) != null && (c19a3TabRootSceneInstance = iAIPortraitLauncherLIZ.tabRootSceneInstance()) != null) {
                                    return c19a3TabRootSceneInstance;
                                }
                                return new VideoEditContainerScene();
                            }
                            break;
                        case 1565964896:
                            if (str.equals("OnThisDayVideoPreviewScene")) {
                                return new CelebrationVideoTemplatePreviewScene();
                            }
                            break;
                        case 1720653653:
                            if (str.equals("MagicTaskLoadingContainerScene")) {
                                return new MagicTaskLoadingContainerScene();
                            }
                            break;
                        case 1926778981:
                            if (str.equals("ImageEditRootScene")) {
                                return new ImageEditRootScene();
                            }
                            break;
                    }
                    return new VideoEditContainerScene();
                }
                return (C19A3) C2350509Ix.LIZ(null, LJIIZILJ(str));
            }

            @Override // X.C0MWI
            public final boolean LJII(Scene scene) {
                for (Class<? extends C19A3> cls : this.LIZJ) {
                    if (scene.getClass() == cls) {
                        if (cls != null) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }

            @Override // X.C0MWI
            public final LifecycleOwner LJIIIIZZ(Activity activity) {
                LifecycleOwner lifecycleOwnerLJ = LJ(activity);
                if (lifecycleOwnerLJ != null) {
                    return lifecycleOwnerLJ;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }

            @Override // X.C0MWI
            public final boolean LJIIIZ(Scene scene) {
                return scene instanceof C0L3Q;
            }

            @Override // X.C0MWI
            public final boolean LJIIJ(String str) {
                return Intrinsics.LJFF(str, "VideoPublishContainerScene");
            }

            @Override // X.C0MWI
            public final Bundle LJIIJJI(Activity activity) {
                Bundle bundleLJIIL = LJIIL(activity);
                if (bundleLJIIL == null) {
                    return new Bundle();
                }
                return bundleLJIIL;
            }

            @Override // X.C0MWI
            public final Bundle LJIIL(Activity activity) {
                Scene scene;
                Bundle extras = null;
                if (activity == null) {
                    return null;
                }
                InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
                if (interfaceC20597015iiLIZJ != null) {
                    C198H c198hLC = interfaceC20597015iiLIZJ.LC();
                    if (c198hLC == null || (scene = c198hLC.getScene()) == null) {
                        return null;
                    }
                    return scene.mArguments;
                }
                try {
                    extras = activity.getIntent().getExtras();
                    return extras;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return extras;
                }
            }

            @Override // X.C0MWI
            public final boolean LJIILIIL(C198H c198h) {
                if (c198h == null) {
                    return false;
                }
                return c198h.getScene() instanceof VideoPublishEditContainerScene;
            }

            @Override // X.C0MWI
            public final boolean LJIILJJIL(String str) {
                if (!Intrinsics.LJFF(str, "VideoEditContainerScene") && !Intrinsics.LJFF(str, "StoryEditContainerScene")) {
                    return false;
                }
                return true;
            }

            @Override // X.C0MWI
            public final boolean LJIILL(C198H c198h) {
                return c198h.getScene() instanceof VideoPublishContainerScene;
            }

            @Override // X.C0MWI
            public final boolean LJIILLIIL(C198H c198h) {
                return c198h.getScene() instanceof ImageEditRootScene;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
            @Override // X.C0MWI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Class<? extends X.C19A3> LJIIZILJ(java.lang.String r7) {
                /*
                    Method dump skipped, instruction units count: 718
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0MGP.LJIIZILJ(java.lang.String):java.lang.Class");
            }

            @Override // X.C0MWI
            public final Scene getCurrentScene(Activity activity) {
                C198H c198hLC;
                InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
                if (interfaceC20597015iiLIZJ != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null) {
                    return c198hLC.getScene();
                }
                return null;
            }

            @Override // X.C0MWI
            public final void LJFF(Activity activity, Function0<Unit> function0) {
                InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
                if (interfaceC20597015iiLIZJ != null) {
                    interfaceC20597015iiLIZJ.ZN(function0);
                } else {
                    function0.invoke();
                }
            }
        };
    }
}
