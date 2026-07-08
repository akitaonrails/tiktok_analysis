package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity;
import com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.social.creation.api.edit.SocialEditLayoutPreloadApi;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.List;
import joo.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MB2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MB2 implements InterfaceC569060MTo {
    public static Bundle LJJII(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LIZIZ(Activity activity, Intent intent) {
        C1688680u2s.LJIIZILJ(activity, intent);
        f.LIZ.getClass();
        f.LJI(activity, 1002, intent);
    }

    @Override // X.InterfaceC569060MTo
    public final void LIZLLL(Context context, Intent intent) {
        C0MWH c0mwh = C0MWH.LIZ;
        Bundle bundleLJJII = LJJII(intent);
        c0mwh.getClass();
        if (bundleLJJII == null) {
            bundleLJJII = new Bundle();
        }
        C0MWH.LJIIL(context, bundleLJJII, "AIPlaygroundBaseScene", null, null, null, false, 120);
    }

    @Override // X.InterfaceC569060MTo
    public final void LJFF(Context context, Intent intent) {
        Bundle bundleLJJII = LJJII(intent);
        if (bundleLJJII == null) {
            bundleLJJII = new Bundle();
        }
        C0MWH.LJIIL(context, bundleLJJII, "TextToImageChooseScene", null, null, null, false, 104);
    }

    @Override // X.InterfaceC569060MTo
    public final void LJI(Activity activity, Intent intent) {
        C0MWH.LJIILIIL(activity, LJJII(intent));
    }

    @Override // X.InterfaceC569060MTo
    public final boolean LJII(Context context, Intent intent) {
        return C0LHA.LIZ(intent).LIZ(context, null);
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIIJ(Context context, Intent intent) {
        Class<?> cls;
        Bundle bundleLJIIL;
        String string;
        boolean zLIZ = C0CHQ.LIZ().getAccountService().LIZ();
        if (!zLIZ) {
            C20684815ws.LJIILLIIL("performance_video_publish_enter", C2097608Jq.LJ());
            C1439910nZd.LIZ();
            C0CHQ.LIZ().getPublishService().LJIIIIZZ();
            C0CHQ.LIZ().getPublishService().LJJLIIIIJ().LIZ();
        }
        if (zLIZ) {
            cls = FTCVideoPublishActivity.class;
        } else if (intent.getBooleanExtra("fromTTEPEffectPreview", false)) {
            cls = TTEPVideoSaveActivity.class;
        } else {
            cls = null;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && (bundleLJIIL = C0CHQ.LIZ().LJIJJ().LJIIL(activityLIZ)) != null && (string = bundleLJIIL.getString("extra_edit_effect_uid")) != null) {
            intent.putExtra("extra_edit_effect_uid", string);
        }
        if (cls != null) {
            intent.setClass(context, cls);
        }
        if (intent.getBooleanExtra("fromTTEPEffectPreview", false)) {
            if (cls == null) {
                C0MWH.LJIIJJI(context, LJJII(intent), 1003);
                return;
            }
            f fVar = f.LIZ;
            Activity activityLIZ2 = C1388190mED.LIZ(context);
            if (activityLIZ2 != null) {
                fVar.getClass();
                f.LJI(activityLIZ2, 1003, intent);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (cls == null) {
            C0MWH.LJIIJJI(context, LJJII(intent), null);
        } else {
            f.LIZ.getClass();
            f.LJ(context, intent);
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIIJJI(Activity activity, Intent intent) {
        if (C564020MAe.LIZ()) {
            intent.putExtra("extra_from_permission_requesting", true);
            intent.setClass(activity, VideoRecordPermissionActivity.class);
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIIL(Activity activity, Intent intent) {
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFiles(activity, LJJII(intent));
        C0MWH.LJIILLIIL(activity, LJJII(intent));
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIILIIL(Context context, Intent intent) {
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFiles(context, LJJII(intent));
        C0MWH.LJIILL(context, LJJII(intent));
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIILLIIL(Activity activity, Intent intent) throws Throwable {
        LJJ(activity, intent, null);
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIJI(Context context, Intent intent) {
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFiles(context, LJJII(intent));
        C0MWH.LJI(context, LJJII(intent));
    }

    @Override // X.InterfaceC569060MTo
    public final Intent LJIJJLI(Activity activity, Bundle bundle) {
        String str = MvChoosePhotoActivity._pnsPageId;
        return C0L0F.LIZ(activity, bundle, 2, 1001);
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIL(Context context, Intent intent) {
        ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFiles(context, LJJII(intent));
        C0MWH.LJIILIIL(context, LJJII(intent));
    }

    @Override // X.InterfaceC569060MTo
    public final void LJJIFFI(Activity activity, Intent intent) {
        if (C564020MAe.LIZ()) {
            f.LIZ.getClass();
            f.LJ(activity, intent);
        } else {
            C1688680u2s.LJIJJ(activity, intent);
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIIIIZZ(Activity activity, StitchParams stitchParams, CreativeInfo creativeInfo) {
        String str = StitchTrimmingActivity._pnsPageId;
        Intent intent = new Intent(activity, (Class<?>) StitchTrimmingActivity.class);
        intent.putExtra("stitch_params", (Parcelable) stitchParams);
        C537520L6g.LIZLLL(intent, creativeInfo);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJJJJJL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9bMnY8VR8ns3ryvYEjt/UB6LS9LG5wlQ9IPWio=", null));
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIILJJIL(Context context, int i, Intent intent) {
        String str = VECutVideoActivity._pnsPageId;
        C0L4B.LIZJ(context, i, intent);
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIILL(Activity activity, Intent intent, CreativeInfo creativeInfo) {
        String str = StitchTrimmingActivity._pnsPageId;
        Intent intent2 = new Intent(intent);
        intent2.setClass(activity, StitchTrimmingActivity.class);
        C537520L6g.LIZLLL(intent2, creativeInfo);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C2204961BRm.LJJJJJL(activity, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9bMnY8VR8ns3ryvYEjt/UB6LS9LG5wlQ9IPWio=", null));
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIIZILJ(Context context, Intent intent, boolean z) {
        boolean z2;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        boolean z3 = true;
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(context, "story", true)) {
            if (((Number) C0B0E.LIZ.getValue()).intValue() == 1) {
                z2 = false;
                SocialEditLayoutPreloadApi socialEditLayoutPreloadApi = (SocialEditLayoutPreloadApi) PluggableExtentionKt.pluggableSpi$default(SocialEditLayoutPreloadApi.class, false, false, false, 14, null);
                if (socialEditLayoutPreloadApi != null) {
                    socialEditLayoutPreloadApi.preloadLayoutFiles(context, LJJII(intent));
                }
            } else {
                z2 = false;
                ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadServiceForEditPage.class, false, false, false, 14, null);
                if (iLayoutPreloadServiceForEditPage != null) {
                    iLayoutPreloadServiceForEditPage.preloadLayoutFiles(context, LJJII(intent));
                }
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "story_creative_tool_jato_edit_page_settings", true, z2)) {
                C2139308Zr.LIZ();
            }
            Bundle bundleLJJII = LJJII(intent);
            if (bundleLJJII == null) {
                bundleLJJII = new Bundle();
            }
            if (!(C1388190mED.LIZ(context) instanceof C199Y) || !C0L2P.LIZ(bundleLJJII)) {
                z3 = false;
            }
            if (z) {
                if (z3) {
                    int i = bundleLJJII.getInt("extra_request_code", 1002);
                    C565320MFe c565320MFe = C565320MFe.LIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    c565320MFe.getClass();
                    C565320MFe.LIZ(context, bundleLJJII, numValueOf);
                    return;
                }
                C0MWH.LJIIL(context, bundleLJJII, "StoryEditContainerScene", null, Integer.valueOf(bundleLJJII.getInt("extra_request_code", 1002)), null, z2, 104);
                return;
            }
            if (z3) {
                C565320MFe.LIZ.getClass();
                C565320MFe.LIZ(context, bundleLJJII, null);
            } else {
                C0MWH.LJIIL(context, bundleLJJII, "StoryEditContainerScene", null, null, null, z2, 120);
            }
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIJ(Context context, Intent intent, Function0 function0) {
        String stringExtra;
        String stringExtra2;
        List listSingletonList;
        try {
            stringExtra = intent.getStringExtra("shoot_way");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!C535670Kzd.LIZ().LIZJ(context, stringExtra, true)) {
            return;
        }
        if (intent.hasExtra("open_sdk_import_media_list")) {
            listSingletonList = intent.getParcelableArrayListExtra("open_sdk_import_media_list");
        } else {
            try {
                stringExtra2 = intent.getStringExtra("file_path");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
            MediaModel mediaModelLIZ = C574480Mg2.LIZ(stringExtra2);
            if (mediaModelLIZ != null) {
                if (intent.getBooleanExtra("is_story_streaks", false) || intent.getBooleanExtra("is_story_event_sticker", false)) {
                    mediaModelLIZ.duration = 10000L;
                    Collections.singletonList(mediaModelLIZ);
                }
                listSingletonList = Collections.singletonList(mediaModelLIZ);
            }
            C201955140j.LJII(C1662160tM6.LIZIZ, VideoEditContainerScene.LLLLLILLIL + ", mediaModelList is null or empty");
        }
        if (listSingletonList != null && !listSingletonList.isEmpty()) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ == null) {
                C201955140j.LJII(C1662160tM6.LIZIZ, VideoEditContainerScene.LLLLLILLIL + ", context is not FragmentActivity");
                return;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new AnonymousClass0644(c19egLIZIZ, listSingletonList, intent, function0, null), 3);
            return;
        }
        C201955140j.LJII(C1662160tM6.LIZIZ, VideoEditContainerScene.LLLLLILLIL + ", mediaModelList is null or empty");
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIJJ(Context context, Intent intent, Function0 function0) {
        String str = VECutVideoActivity._pnsPageId;
        C0L4B.LIZJ(context, -1, intent);
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LJJ(Activity activity, Intent intent, Integer num) throws Throwable {
        C1688680u2s.LJIIZILJ(activity, intent);
        Bundle bundleG3 = C786410Ut5.g3(intent, "story_transition_bundle");
        intent.removeExtra("story_transition_bundle");
        String name = SAAActivity.class.getName();
        ComponentName component = intent.getComponent();
        String strLJJIJIIJIL = null;
        if (component != null) {
            strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSpdZbJ3Sai+qMNeb35YifdBPrPfOgT2uo4XX4ZXuoPVxNkdf4=", null));
        }
        if (Intrinsics.LJFF(name, strLJJIJIIJIL)) {
            C0MWH.LJIIZILJ(activity, LJJII(intent), bundleG3, num);
        } else {
            f.LIZ.getClass();
            f.LJFF(activity, intent, bundleG3);
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LJJI(Activity activity, int i, Intent intent) {
        C20684815ws.LJIILLIIL("performance_video_publish_enter", C2097608Jq.LJ());
        C1439910nZd.LIZ();
        C0CHQ.LIZ().getPublishService().LJIIIIZZ();
        C0CHQ.LIZ().getPublishService().LJJLIIIIJ().LIZ();
        C0MWH.LJIIJJI(activity, LJJII(intent), Integer.valueOf(i));
    }

    @Override // X.InterfaceC569060MTo
    public final void LIZ(Activity activity, Intent intent, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isRefresh : ");
        sbLIZ.append(z);
        sbLIZ.append(", trace : ");
        sbLIZ.append(new RuntimeException());
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        intent.putExtra("need_finish_posted_draft_fragment", z2);
        intent.putExtra("need_refresh_draft", z);
        intent.setClass(activity, DraftBoxActivity.class);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSpdZbJ3Sai+qMNeb35YifdBPrPfOgT2uo4XX4ZXuoPVxNkdf4=", null));
        if (((Boolean) C258540ABg.LIZ.getValue()).booleanValue()) {
            try {
                ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).finishSAAActivitySafely(activity);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LIZJ(Context context, Bundle bundle, int i, int i2) {
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        C786410Ut5.LJJJI("extra_saa_scene_launch_mode", "STANDARD", bundle);
        String str = MvChoosePhotoActivity._pnsPageId;
        Integer numValueOf = Integer.valueOf(i2);
        String string = bundle.getString("shoot_way");
        if (string == null) {
            string = "unknown";
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("album_legacy6_");
            sbLIZ.append(string);
            sbLIZ.append('_');
            sbLIZ.append(numValueOf);
            if (creativeToolsPluginService.LIZJ(context, C2188811AlT.LIZIZ(sbLIZ), true)) {
                C0MWH.LIZLLL(context, bundle, i, numValueOf);
            }
        }
    }

    @Override // X.InterfaceC569060MTo
    public final void LJIIIZ(Activity activity, Bundle bundle, int i, int i2) throws Throwable {
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LJI(activity, bundle, i, i2);
    }

    @Override // X.InterfaceC569060MTo
    public final void LJ(C19EG c19eg, MediaModel mediaModel, CreativeInfo creativeInfo, Effect effect, ShortVideoCommonParams shortVideoCommonParams) throws Throwable {
        String str = CustomStickerPreviewActivity._pnsPageId;
        C1322200kVm.LIZ().LIZLLL.LIZIZ(new InterfaceC1325100kaS() { // from class: X.0MB3
            @Override // X.InterfaceC1325100kaS
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return true;
            }
        });
        Intent intent = new Intent();
        intent.setClass(c19eg, CustomStickerPreviewActivity.class);
        intent.putExtra("preview_sticker_params", mediaModel);
        if (!(effect instanceof Parcelable)) {
            effect = null;
        }
        intent.putExtra("custom_sticker", (Parcelable) effect);
        intent.putExtra("shoot_way", shortVideoCommonParams.shootWay);
        intent.putExtra("content_source", shortVideoCommonParams.contentSource);
        intent.putExtra("content_type", shortVideoCommonParams.contentType);
        C537520L6g.LIZLLL(intent, creativeInfo);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, c19eg);
        C2204961BRm.LJIIZILJ(10004, c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZD9yDsHH5CASStf3DW23DCNOrI/q1gj7n0VTZ9lsSKxU0ZEVwLwqQOGeosWqzOgXQVfbI1uPt5tuxbPoA==", null));
    }
}
