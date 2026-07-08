package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.creative.model.ailive.TransitionModel;
import com.ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MF5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MF5 {
    public static final C0MF5 LIZ = new C0MF5();
    public static long LIZIZ;

    public static String LIZJ() {
        String strLJIILIIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.AI_LIVE_PHOTO, "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIILIIL);
        sbLIZ.append("guide_video.mp4");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C0MF5 c0mf5) {
        c0mf5.getClass();
        C0M8O.LIZ.getClass();
        if (!C0M8O.LIZJ()) {
            final String strLIZ = C2539709xL.LIZ();
            String strLJIILIIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.AI_LIVE_PHOTO, "");
            final String strLIZJ = LIZJ();
            if (!C2286708xd.LIZJ(strLIZJ)) {
                LIZIZ = System.currentTimeMillis();
                C0MF7 c0mf7 = new IMonitorLogSendDepend() { // from class: X.0MF7
                    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend
                    public final void sendMonitorLog(String str, JSONObject jSONObject) {
                        try {
                            int i = JSONObjectProtectorUtils.getInt(jSONObject, "error_code");
                            if (i == 0) {
                                return;
                            }
                            String string = JSONObjectProtectorUtils.getString(jSONObject, "error_msg");
                            Object obj = jSONObject.get("request_log");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("errorCode=");
                            sbLIZ.append(i);
                            sbLIZ.append(", errorMsg=");
                            sbLIZ.append(string);
                            sbLIZ.append(", requestLog=");
                            sbLIZ.append(obj);
                            C559010LwB.LIZ("AILiveResDownloader", C2188811AlT.LIZIZ(sbLIZ));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C559010LwB.LIZ("AILiveResDownloader", String.valueOf(e.getStackTrace()));
                        }
                    }
                };
                AbstractC2199801B7q abstractC2199801B7qWith = ((IBaseDownloadService) ServiceManager.get().getService(IDownloadService.class)).with(strLIZ);
                abstractC2199801B7qWith.LJ = strLJIILIIL;
                abstractC2199801B7qWith.LIZJ = "guide_video.mp4";
                abstractC2199801B7qWith.LJII = 3;
                abstractC2199801B7qWith.LJIIJ = "ai_live_photo_anchor_guide";
                abstractC2199801B7qWith.LJIJI = true;
                abstractC2199801B7qWith.LJJ = true;
                final Function0 function0 = null;
                final Object[] objArr = 0 == true ? 1 : 0;
                abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.0MF6
                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        super.onSuccessed(downloadInfo);
                        Function1<String, Unit> function1 = objArr;
                        if (function1 != null) {
                            function1.invoke(strLIZJ);
                        }
                        C0MF5 c0mf52 = C0MF5.LIZ;
                        String str = strLIZ;
                        c0mf52.getClass();
                        C0MF5.LIZLLL(str, null, true);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        Integer numValueOf;
                        super.onFailed(downloadInfo, baseException);
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fail=");
                        sbLIZ.append(strLIZJ);
                        sbLIZ.append(",errorCode=");
                        String errorMessage = null;
                        if (baseException != null) {
                            numValueOf = Integer.valueOf(baseException.getErrorCode());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", msg=");
                        if (baseException != null) {
                            errorMessage = baseException.getErrorMessage();
                        }
                        sbLIZ.append(errorMessage);
                        C559010LwB.LIZ("AILiveResDownloader", C2188811AlT.LIZIZ(sbLIZ));
                        C0MF5 c0mf52 = C0MF5.LIZ;
                        String str = strLIZ;
                        c0mf52.getClass();
                        C0MF5.LIZLLL(str, "download failed", false);
                    }
                };
                abstractC2199801B7qWith.LJIJI = true;
                abstractC2199801B7qWith.LJIILL = new DownloadMonitorDepend(c0mf7, new LinkedHashMap(), "ai_live_photo_anchor_guide", "ai_live_photo_guide_video_download_state");
                abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.VIDEO);
            }
        }
    }

    public static void LIZIZ(final VideoPublishEditModel videoPublishEditModel) {
        String str;
        final String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "ai_live_photo_transition_effect_resource_id", "7184265783797617154", true);
        if (strLJJ.length() == 0) {
            return;
        }
        TransitionModel transitionModel = videoPublishEditModel.getAILivePhotoModel().transitionModel;
        if (transitionModel != null) {
            str = transitionModel.path;
        } else {
            str = null;
        }
        try {
            if (C123100dR.LIZ(str)) {
                if (new C0VSJ(str).exists()) {
                    return;
                }
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("transition file, ");
            sbLIZ.append(e);
            C559010LwB.LIZIZ("AILiveResDownloader", C2188811AlT.LIZIZ(sbLIZ));
        }
        new C565780MGy().LIZ(Collections.singletonList(strLJJ), "edit_independent_panel", new IFetchEffectListListener() { // from class: X.0MCP
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("transition download fail, resId=");
                sbLIZ2.append(strLJJ);
                C559010LwB.LIZIZ("AILiveResDownloader", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list) {
                JSONObject jSONObjectOptJSONObject;
                List<Effect> list2 = list;
                if (list2 != null) {
                    boolean zOptBoolean = false;
                    Effect effect = (Effect) C13LP.LJJJLZIJ(0, list2);
                    if (effect != null) {
                        TransitionModel transitionModel2 = new TransitionModel(null, null, null, true, null);
                        transitionModel2.resourceId = effect.getResource_id();
                        transitionModel2.effectId = effect.getEffect_id();
                        transitionModel2.name = effect.getName();
                        transitionModel2.path = effect.getUnzipPath();
                        if (!a0.LJJJIL(effect.getSdkExtra())) {
                            C1446130njf.LIZ.getClass();
                            JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                            if (jSONObjectLJIIIZ != null && (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("transition")) != null) {
                                zOptBoolean = jSONObjectOptJSONObject.optBoolean("isOverlap", false);
                            }
                        }
                        transitionModel2.isOverlap = zOptBoolean;
                        videoPublishEditModel.getAILivePhotoModel().transitionModel = transitionModel2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("transition download success, resId=");
                        sbLIZ2.append(strLJJ);
                        sbLIZ2.append(", localPath=");
                        sbLIZ2.append(transitionModel2.path);
                        C559010LwB.LIZIZ("AILiveResDownloader", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }, true);
    }

    public static void LIZLLL(String str, String str2, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "is_download");
        c2344009Gk.LIZJ(z ? 1 : 0, "success");
        c2344009Gk.LJIIIIZZ("video_url", str);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        if (!z) {
            c2344009Gk.LJFF("error_msg", str2);
        }
        C20684815ws.LJIILLIIL("ai_live_photo_guide_video_download_state", c2344009Gk.LIZ);
    }
}
