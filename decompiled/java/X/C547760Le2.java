package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Le2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547760Le2 implements IAIPortraitLauncher {
    public static final C547760Le2 LIZ = new C547760Le2();

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> customizeRootSceneClass() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 customizeRootSceneInstance() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> generationRootSceneClass() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 generationRootSceneInstance() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> stylePreviewRootSceneClass() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 stylePreviewRootSceneInstance() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final Class<? extends C19A3> tabRootSceneClass() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final C19A3 tabRootSceneInstance() {
        return null;
    }

    public static void LIZ(Context context) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(context, "ai_portrait", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void launchGeneratePage(OpenGenerationPageParams openGenerationPageParams, Context context) {
        LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void onClickPortraitFromProfileAsset(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openPortraitCustomizeTab(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openPortraitTab(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openStylePreviewScene(Context context, AIPortraitEnterParams aIPortraitEnterParams) {
        LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final boolean handlePortraitRoute(Context context, String str, Bundle bundle) {
        LIZ(context);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void openAssetHub(Activity activity, String str, String str2, String str3) {
        LIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher
    public final void enterPhotoEditPageAfterSuccess(C19EG c19eg, CreativeInfo creativeInfo, CreativeModel creativeModel, boolean z, Function0<Unit> function0) {
        LIZ(c19eg);
    }
}
