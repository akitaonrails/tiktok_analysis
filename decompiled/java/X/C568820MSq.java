package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat;
import com.ss.android.ugc.aweme.creative.tangram.dsl.edit.ImportItemModelCompat;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeRootScene;
import com.ss.android.ugc.aweme.portrait.generate.scene.AIPortraitGenerationRootScene;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.preview.AIPortraitStylePreviewRootScene;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabRootScene;
import com.ss.android.ugc.aweme.services.external.ITangramService;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.ugc.aweme.CreationConfigModel;
import com.ss.ugc.aweme.creation.base.CanvasComposer;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.ImportItemModel;
import com.ss.ugc.aweme.creation.base.PhotoModeComposer;
import com.ss.ugc.aweme.creation.base.TrackModel;
import com.ss.ugc.aweme.creation.base.VideoGroupComposer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568820MSq implements IAIPortraitLauncher {
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 customizeRootSceneInstance() {
        return new AIPortraitCustomizeRootScene();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 generationRootSceneInstance() {
        return new AIPortraitGenerationRootScene();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 stylePreviewRootSceneInstance() {
        return new AIPortraitStylePreviewRootScene();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 tabRootSceneInstance() {
        return new AIPortraitTabRootScene();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> customizeRootSceneClass() {
        return AIPortraitCustomizeRootScene.class;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> generationRootSceneClass() {
        return AIPortraitGenerationRootScene.class;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> stylePreviewRootSceneClass() {
        return AIPortraitStylePreviewRootScene.class;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> tabRootSceneClass() {
        return AIPortraitTabRootScene.class;
    }

    public static AIPortraitEnterParams LIZ(AIPortraitEnterParams aIPortraitEnterParams) {
        String str = aIPortraitEnterParams.creationId;
        if (str != null && str.length() != 0) {
            return aIPortraitEnterParams;
        }
        return AIPortraitEnterParams.LIZ(aIPortraitEnterParams, null, null, UUID.randomUUID().toString(), false, null, 251);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void launchGeneratePage(OpenGenerationPageParams openGenerationPageParams, Context context) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJIIIZ() && !creativeToolsPluginService.LJI(context)) {
            creativeToolsPluginService.LIZJ(context, "ai_portrait_generate", true);
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "enter_params", openGenerationPageParams);
        bundle.putBoolean("ignoreVEPluginCheck", true);
        C0MWH.LIZ.getClass();
        C0MWH.LJIIL(context, bundle, "AIPortraitGenerationRootScene", null, null, null, true, 56);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void onClickPortraitFromProfileAsset(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        InterfaceC549230LgP interfaceC549230LgPLIZLLL;
        C549290LgV c549290LgV;
        String str;
        String str2;
        InterfaceC550750Lir interfaceC550750LirG9;
        AIPortraitEnterParams aIPortraitEnterParamsLIZ = LIZ(aIPortraitEnterParams);
        PortraitStyleItem portraitStyleItem = null;
        if (((Boolean) C288260BRo.LIZIZ.getValue()).booleanValue()) {
            openPortraitTab(context, aIPortraitEnterParamsLIZ);
        } else {
            AITheaterProfileService.LIZ.getClass();
            AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9()) != null) {
                interfaceC549230LgPLIZLLL = interfaceC550750LirG9.LIZLLL();
            } else {
                interfaceC549230LgPLIZLLL = null;
            }
            if ((interfaceC549230LgPLIZLLL instanceof C549290LgV) && (c549290LgV = (C549290LgV) interfaceC549230LgPLIZLLL) != null) {
                if (C960203pA.LIZIZ(context)) {
                    str = "dark";
                } else {
                    str = "light";
                }
                String str3 = c549290LgV.LIZ;
                List<String> urlList = c549290LgV.LIZIZ.getUrlList();
                if (urlList != null) {
                    str2 = (String) C13LP.LJJJLL(urlList);
                } else {
                    str2 = null;
                }
                openPortraitCustomizeTab(context, AIPortraitEnterParams.LIZ(aIPortraitEnterParamsLIZ, str3, str2, null, true, str, 28));
            } else {
                return;
            }
        }
        C1687150u0P.LIZ.getClass();
        Parcelable parcelable = aIPortraitEnterParamsLIZ.styleItem;
        if (parcelable instanceof PortraitStyleItem) {
            portraitStyleItem = (PortraitStyleItem) parcelable;
        }
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C2275121E3i c2275121E3i = C2275121E3i.LJII;
        AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(portraitStyleItem, aIPortraitEnterParamsLIZ, 148);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c2275121E3i, C548910Lft.LIZ(aIPortraitEnterParamsLIZ), awS374S0200000_8);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openPortraitCustomizeTab(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        AIPortraitEnterParams aIPortraitEnterParamsLIZ = LIZ(aIPortraitEnterParams);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//ai_portrait/customize");
        smartRouteBuildRoute.withParam(aIPortraitEnterParamsLIZ.LIZIZ());
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openPortraitTab(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        AIPortraitEnterParams aIPortraitEnterParamsLIZ = LIZ(aIPortraitEnterParams);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//ai_portrait/tab");
        smartRouteBuildRoute.withParam(aIPortraitEnterParamsLIZ.LIZIZ());
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openStylePreviewScene(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        AIPortraitEnterParams aIPortraitEnterParamsLIZ = LIZ(aIPortraitEnterParams);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//ai_portrait/stylePreview");
        smartRouteBuildRoute.withParam(aIPortraitEnterParamsLIZ.LIZIZ());
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handlePortraitRoute(android.content.Context r14, java.lang.String r15, android.os.Bundle r16) {
        /*
            r13 = this;
            int r0 = r15.hashCode()
            r4 = 1
            java.lang.String r3 = "//ai_portrait/freeCreate"
            r2 = 0
            r6 = r16
            switch(r0) {
                case -1443441708: goto Le;
                case 1099943109: goto L19;
                case 1467183096: goto L3e;
                case 1552229990: goto L20;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            java.lang.String r0 = "//ai_portrait/stylePreview"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r7 = "AIPortraitStylePreviewRootScene"
            goto L48
        L19:
            boolean r0 = r15.equals(r3)
            if (r0 != 0) goto L29
            return r2
        L20:
            java.lang.String r0 = "//ai_portrait/customize"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = "is_free_create"
            boolean r0 = r6.getBoolean(r1)
            if (r0 != 0) goto L37
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r15, r3)
            if (r0 == 0) goto L38
        L37:
            r2 = 1
        L38:
            r6.putBoolean(r1, r2)
            java.lang.String r7 = "AIPortraitCustomizeRootScene"
            goto L48
        L3e:
            java.lang.String r0 = "//ai_portrait/tab"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r7 = "AIPortraitTabRootScene"
        L48:
            r8 = 0
            r11 = 0
            r12 = 120(0x78, float:1.68E-43)
            r5 = r14
            r9 = r8
            r10 = r8
            X.C0MWH.LJIIL(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568820MSq.handlePortraitRoute(android.content.Context, java.lang.String, android.os.Bundle):boolean");
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openAssetHub(Activity activity, String str, String str2, String str3) {
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null) {
            aITheaterProfileServiceLIZ.Y8(activity, new C531080KsE(true, "ai_theater_profile_management", null, null, null, new AITheaterProfileEventModel(C0LQY.AI_PORTRAIT, null, str, null, str2, str3, null, null, null, null, null, true, 1994), false, false, true, null, 732), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void enterPhotoEditPageAfterSuccess(C19EG c19eg, CreativeInfo creativeInfo, CreativeModel creativeModel, boolean z, Function0<Unit> function0) {
        AIPortraitModel aIPortraitModel;
        AIPortraitCreationModel aIPortraitCreationModel;
        List<AIPortraitResultItem> list;
        AIPortraitResultItem aIPortraitResultItem;
        String str;
        String str2;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        CreativeInfo creativeInfo2 = creativeInfo;
        new C550130Lhr().reportCreateButtonResult(creativeModel);
        C201955140j.LIZIZ(C545870Laz.LIZIZ.LIZ, "enterPhotoEditPageAfterSuccess");
        if (creativeModel != null && (aIPortraitModel = creativeModel.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitCreationModel = aIPortraitModel.creationModel) != null && (list = aIPortraitCreationModel.result) != null && (aIPortraitResultItem = (AIPortraitResultItem) ListProtector.get(list, 0)) != null && (str = aIPortraitResultItem.localFilePath) != null) {
            if (creativeInfo2 == null) {
                creativeInfo2 = creativeModel.creativeInfo;
            }
            AIGCInfo aIGCInfo = new AIGCInfo(2, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, false, false, Collections.singletonList(new AlbumAigc(creativeInfo2.getCreationId(), 5, null)), false, 98270, null);
            AIPortraitModel aIPortraitModel2 = creativeModel.aigcBusinessModel.aiPortraitModel;
            if (aIPortraitModel2 != null && (aIPortraitContextModel = aIPortraitModel2.contextModel) != null && (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) != null) {
                aIPortraitGeneratingModel.status = GenerateStatus.APPLIED;
            }
            creativeModel.aigcWorkflowModel.hasAigcNewFrameworkTask = false;
            ITangramService iTangramService = (ITangramService) PluggableExtentionKt.pluggableSpi$default(ITangramService.class, false, false, false, 14, null);
            if (iTangramService != null) {
                CreationConfigModel creationConfigModel = new CreationConfigModel("", null, null, null, null);
                BasicModelCompat basicModelCompat = new BasicModelCompat();
                basicModelCompat.setCreationId(creativeInfo2.getCreationId());
                TrackModel trackModel = new TrackModel(null, null, null, null, null, null, null, null, new LinkedHashMap(), null, null, null, null);
                trackModel.setShootWay("ai_portrait");
                if (z) {
                    str2 = "draft";
                } else {
                    str2 = "generate";
                }
                trackModel.setEnterFromPage(str2);
                basicModelCompat.setTrack(trackModel);
                basicModelCompat.setAiPortraitModel(creativeModel.aigcBusinessModel.aiPortraitModel);
                basicModelCompat.setAigcWorkflowModel(creativeModel.aigcWorkflowModel);
                basicModelCompat.setDraftInfoModel(creativeModel.draftInfoModel);
                creationConfigModel.setBasic(basicModelCompat);
                EditConfigModel editConfigModel = new EditConfigModel(null, null, null, null, null, null, null, null);
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhotoModeComposer.class);
                if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(VideoGroupComposer.class))) {
                    VideoGroupComposer videoGroupComposer = new VideoGroupComposer(new ArrayList(), null);
                    List<ImportItemModel> images = ((PhotoModeComposer) videoGroupComposer).getImages();
                    ImportItemModelCompat importItemModelCompat = new ImportItemModelCompat();
                    importItemModelCompat.setType(EnumC568840MSs.ImportItemType_IMAGE);
                    importItemModelCompat.setPath(str);
                    importItemModelCompat.setAigcInfo(aIGCInfo);
                    images.add(importItemModelCompat);
                    editConfigModel.setVideoGroupComposer(videoGroupComposer);
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(CanvasComposer.class))) {
                    CanvasComposer canvasComposer = new CanvasComposer(null);
                    List<ImportItemModel> images2 = ((PhotoModeComposer) canvasComposer).getImages();
                    ImportItemModelCompat importItemModelCompat2 = new ImportItemModelCompat();
                    importItemModelCompat2.setType(EnumC568840MSs.ImportItemType_IMAGE);
                    importItemModelCompat2.setPath(str);
                    importItemModelCompat2.setAigcInfo(aIGCInfo);
                    images2.add(importItemModelCompat2);
                    editConfigModel.setCanvasComposer(canvasComposer);
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(PhotoModeComposer.class))) {
                    PhotoModeComposer photoModeComposer = new PhotoModeComposer(null, new ArrayList());
                    List<ImportItemModel> images3 = photoModeComposer.getImages();
                    ImportItemModelCompat importItemModelCompat3 = new ImportItemModelCompat();
                    importItemModelCompat3.setType(EnumC568840MSs.ImportItemType_IMAGE);
                    importItemModelCompat3.setPath(str);
                    importItemModelCompat3.setAigcInfo(aIGCInfo);
                    images3.add(importItemModelCompat3);
                    editConfigModel.setPhotomodeComposer(photoModeComposer);
                }
                creationConfigModel.setEdit(editConfigModel);
                ITangramService.DefaultImpls.start$default(iTangramService, c19eg, creationConfigModel, null, new C5185020h(function0, (Function0<Unit>) 45), 4, null);
            }
        }
    }
}
