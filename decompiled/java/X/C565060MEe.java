package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.ailivephoto.AILivePhotoSheetFragment;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.HelpCenterResultEvent;
import com.ss.android.ugc.aweme.services.external.IAIGCQuotaService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IShortVideoContext;
import com.ss.android.ugc.aweme.services.external.ImageMonitorParams;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import com.ss.android.ugc.aweme.services.story.IAlbumParam;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.util.performance.PhotoModeTemplateOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.gamora.editor.ailive.util.AILiveInboxBannerFreqCache;
import com.zhiliaoapp.musically.R;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS124S1200000_8;
import kotlin.jvm.internal.AwS157S1100000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565060MEe implements IAILiveService {
    public TuxSheet LIZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public final Map<String, String> LIZLLL = Collections.synchronizedMap(new C2093108Hx(100));

    public static SocialMediaPickerConfig LIZ() {
        SocMediaPickerService socMediaPickerService;
        SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfig = new SocialMediaPickerConfig.TitleAreaUIConfig(false, false, null, null);
        SocialMediaPickerConfig.StickySelectorAreaUIConfig stickySelectorAreaUIConfig = new SocialMediaPickerConfig.StickySelectorAreaUIConfig(false, false);
        C0LJE c0lje = C0LJE.IMAGE_ONLY;
        SocialMediaPickerConfig socialMediaPickerConfig = new SocialMediaPickerConfig(new SocialMediaPickerConfig.PageUIConfig(false, EnumC563950M9x.STORY_STYLE, false), titleAreaUIConfig, null, stickySelectorAreaUIConfig, new SocialMediaPickerConfig.TabAreaUIConfig(null, c0lje, 1, null), new SocialMediaPickerConfig.MediaAreaUIConfig(false, false, false, C0L9L.WIDTH_HEIGHT_9_16, false), new SocialMediaPickerConfig.MediaLoadingStrategy(c0lje, false, false, C0LJD.FIXED_TOP), new SocialMediaPickerConfig.MediaSelectorStrategy(false, 1, false, false), false, false, false);
        C563910M9t.LIZ.getClass();
        if (C563910M9t.LIZ() && (socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null)) != null) {
            C728060ShA.LIZ.getClass();
            C728060ShA.LIZ();
            SocialMediaPickerConfig socialMediaPickerConfigLIZ = socMediaPickerService.LIZ();
            if (socialMediaPickerConfigLIZ != null) {
                SocialMediaPickerConfig socialMediaPickerConfigCopy = socialMediaPickerConfigLIZ.copy(socialMediaPickerConfigLIZ.pageUIConfig, socialMediaPickerConfigLIZ.titleAreaUIConfig, socialMediaPickerConfigLIZ.multiEntranceAreaUIConfig, socialMediaPickerConfigLIZ.stickySelectorAreaUIConfig, socialMediaPickerConfigLIZ.tabAreaUIConfig, socialMediaPickerConfigLIZ.mediaAreaUIConfig, socialMediaPickerConfigLIZ.mediaLoadingStrategy, socialMediaPickerConfigLIZ.selectorStrategy, C563910M9t.LIZ(), true, socialMediaPickerConfigLIZ.hasStoryArchiveV2Entrance);
                if (socialMediaPickerConfigCopy != null) {
                    return socialMediaPickerConfigCopy;
                }
            }
        }
        return socialMediaPickerConfig;
    }

    public final void LIZJ() {
        C19EH c19ehLJIIJ;
        Fragment fragment = this.LIZ;
        if (fragment != null) {
            try {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                C19EG activity = fragment.getActivity();
                if (activity != null && !activity.isDestroyed() && parentFragmentManager != null && (c19ehLJIIJ = parentFragmentManager.LJIIJ()) != null) {
                    c19ehLJIIJ.LJIIZILJ(fragment);
                    c19ehLJIIJ.LJIIL();
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJII(C0L76.LIZIZ, "AILiveService hide guide error");
            }
        }
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean canShowBanner() {
        boolean z = false;
        if (((IAILiveService) C562340M3s.LIZIZ.getValue()).enableInboxBanner()) {
            C0M8O.LIZ.getClass();
            AILiveInboxBannerFreqCache aILiveInboxBannerFreqCacheLIZIZ = C0M8O.LIZIZ();
            if (aILiveInboxBannerFreqCacheLIZIZ.noOperationTime >= C562340M3s.LIZIZ().limitNoOperationReject) {
                C0L76 c0l76 = C0L76.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("disable, more than ");
                sbLIZ.append(C562340M3s.LIZIZ().limitNoOperationReject);
                sbLIZ.append(" times no operation");
                C201955140j.LIZLLL(c0l76, "AILiveInboxBanner", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                String strLIZLLL = C0M8O.LIZLLL();
                Date dateLIZ = C0M8O.LIZ();
                if (dateLIZ != null) {
                    C0L76 c0l762 = C0L76.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("currentDate=");
                    sbLIZ2.append(dateLIZ);
                    C201955140j.LIZLLL(c0l762, "AILiveInboxBanner", C2188811AlT.LIZIZ(sbLIZ2));
                    if (aILiveInboxBannerFreqCacheLIZIZ.lastResetDayDate.length() == 0) {
                        aILiveInboxBannerFreqCacheLIZIZ.lastResetDayDate = strLIZLLL;
                    }
                    String str = C0M8O.LIZIZ().lastResetDayDate;
                    if (!(str.length() == 0)) {
                        try {
                            Date date = C0M8O.LJFF.parse(str);
                            if (date != null && !C562340M3s.LIZJ(date, dateLIZ) && C562340M3s.LIZ(dateLIZ, C562340M3s.LIZIZ().refreshInHour)) {
                                C201955140j.LIZLLL(C0L76.LIZIZ, "AILiveInboxBanner", "reset show today");
                                aILiveInboxBannerFreqCacheLIZIZ.showOneDay = 0;
                                aILiveInboxBannerFreqCacheLIZIZ.lastResetDayDate = strLIZLLL;
                            }
                        } catch (ParseException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (aILiveInboxBannerFreqCacheLIZIZ.showOneDay >= C562340M3s.LIZIZ().limitPerDay) {
                        C201955140j.LIZLLL(C0L76.LIZIZ, "AILiveInboxBanner", "disable, more than one time today");
                        C0M8O.LIZ.getClass();
                        C0M8O.LJFF();
                        return false;
                    }
                    if (aILiveInboxBannerFreqCacheLIZIZ.showConsecutiveDay >= C562340M3s.LIZIZ().limitConsecutiveTimes) {
                        C0M8O.LIZ.getClass();
                        AILiveInboxBannerFreqCache aILiveInboxBannerFreqCacheLIZIZ2 = C0M8O.LIZIZ();
                        String strLIZLLL2 = C0M8O.LIZLLL();
                        Date dateLIZ2 = C0M8O.LIZ();
                        if (dateLIZ2 != null) {
                            if (aILiveInboxBannerFreqCacheLIZIZ2.lastResetPhraseDate.length() == 0) {
                                aILiveInboxBannerFreqCacheLIZIZ2.lastResetPhraseDate = strLIZLLL2;
                            }
                            String str2 = C0M8O.LIZIZ().lastResetPhraseDate;
                            if (str2.length() != 0) {
                                try {
                                    Date date2 = C0M8O.LJFF.parse(str2);
                                    if (date2 != null) {
                                        Calendar calendar = Calendar.getInstance();
                                        calendar.setTime(date2);
                                        LocalDate localDateOf = LocalDate.of(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.setTime(dateLIZ2);
                                        if (TimeUnit.MILLISECONDS.toDays(Math.abs(LocalDate.of(calendar2.get(1), calendar2.get(2) + 1, calendar2.get(5)).toEpochDay() - localDateOf.toEpochDay()) * TimeUnit.DAYS.toMillis(1L)) >= C562340M3s.LIZIZ().lowReqlimitDays && C562340M3s.LIZ(dateLIZ2, C562340M3s.LIZIZ().refreshInHour)) {
                                            C0L76 c0l763 = C0L76.LIZIZ;
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("low frequency, more than ");
                                            sbLIZ3.append(C562340M3s.LIZIZ().lowReqlimitDays);
                                            sbLIZ3.append("days, reset show time");
                                            C201955140j.LIZLLL(c0l763, "AILiveInboxBanner", C2188811AlT.LIZIZ(sbLIZ3));
                                            aILiveInboxBannerFreqCacheLIZIZ2.showLowFreqOnePhrase = 0;
                                            aILiveInboxBannerFreqCacheLIZIZ2.lastResetPhraseDate = strLIZLLL2;
                                        }
                                    }
                                } catch (ParseException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                            if (aILiveInboxBannerFreqCacheLIZIZ2.showLowFreqOnePhrase >= 1) {
                                C0L76 c0l764 = C0L76.LIZIZ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("low frequency disable, now=");
                                sbLIZ4.append(aILiveInboxBannerFreqCacheLIZIZ2.showLowFreqOnePhrase);
                                C201955140j.LIZLLL(c0l764, "AILiveInboxBanner", C2188811AlT.LIZIZ(sbLIZ4));
                            } else {
                                C201955140j.LIZLLL(C0L76.LIZIZ, "AILiveInboxBanner", "low frequency can show");
                            }
                        }
                        C0M8O.LIZ.getClass();
                        C0M8O.LJFF();
                        return z;
                    }
                    C201955140j.LIZLLL(C0L76.LIZIZ, "AILiveInboxBanner", "high frequency can show");
                    z = true;
                    C0M8O.LIZ.getClass();
                    C0M8O.LJFF();
                    return z;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final IAlbumParam defaultAlbumParam() {
        return new EnterStoryParam(null, null, null, null, null, null, null, null, null, false, false, false, 0, 0.0f, 0, AFwS194S0000000_8.get$arr$(435), LIZ(), null, null, null, null, false, null, false, null, null, 67010559, null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void downloadGuideResourceIfNeed() {
        C0MF5.LIZ(C0MF5.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean enableStoryAILivePhotoAlbumEntrance() {
        C563910M9t.LIZ.getClass();
        return C563910M9t.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean enableStoryAILiveSearchBanner() {
        C0AH4.LIZ.getClass();
        if (((Number) C0AH4.LIZIZ.getValue()).intValue() != 1) {
            return false;
        }
        C0M97.LIZ.getClass();
        return C0M97.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final String getAILivePhotoEntranceCoverUrl() {
        return (String) C2506209rw.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final String getAILivePhotoEntranceDynamicCoverUrl() {
        return (String) C2506309rx.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean isAILiveEnable() {
        C0M97.LIZ.getClass();
        if (C0M97.LIZ()) {
            return true;
        }
        C0MDM.LIZ.getClass();
        return C0MDM.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean isPostAILiveEnable() {
        C0MDM.LIZ.getClass();
        return C0MDM.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean isStoryAILiveEnable() {
        C0M97.LIZ.getClass();
        return C0M97.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void onClickBanner() {
        C0M8O.LIZ.getClass();
        C0M8O.LIZIZ().noOperationTime = 0;
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset n=");
        sbLIZ.append(C562340M3s.LIZIZ().limitConsecutiveTimes);
        C201955140j.LIZLLL(c0l76, "AILiveInboxBanner", C2188811AlT.LIZIZ(sbLIZ));
        C0M8O.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void onShowBanner() {
        if (C562340M3s.LIZJ) {
            return;
        }
        C0M8O.LIZ.getClass();
        AILiveInboxBannerFreqCache aILiveInboxBannerFreqCacheLIZIZ = C0M8O.LIZIZ();
        if (aILiveInboxBannerFreqCacheLIZIZ.showConsecutiveDay < C562340M3s.LIZIZ().limitConsecutiveTimes) {
            C562340M3s.LIZJ = true;
            aILiveInboxBannerFreqCacheLIZIZ.showOneDay++;
            aILiveInboxBannerFreqCacheLIZIZ.showConsecutiveDay++;
            C201955140j.LIZLLL(C0L76.LIZIZ, "AILiveInboxBanner", "high frequency show");
        } else {
            int i = aILiveInboxBannerFreqCacheLIZIZ.showLowFreqOnePhrase;
            if (i < 1) {
                C562340M3s.LIZJ = true;
                aILiveInboxBannerFreqCacheLIZIZ.showOneDay++;
                aILiveInboxBannerFreqCacheLIZIZ.showLowFreqOnePhrase = i + 1;
                aILiveInboxBannerFreqCacheLIZIZ.noOperationTime++;
                C201955140j.LIZLLL(C0L76.LIZIZ, "AILiveInboxBanner", "low frequency show");
            }
        }
        C0M8O.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean enableInboxBanner() {
        return isStoryAILiveEnable() && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_inbox_banner", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean enableMDPBanner() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_enable_mdp_banner", true) > 0;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean forbidAnchor() {
        return !C0A15.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean shouldShowSheetWhenClickAnchor() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_follow_creation_sheet", true) > 0;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final int getQuotaRemain(String str) {
        if (str == null) {
            str = Source.EDIT_AI_LIVE_PHOTO.getSource();
        }
        return C0LXU.LIZ(str, true).quotaRemain;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final String getTranslateResult(String str) {
        if (str != null && str.length() != 0) {
            return this.LIZLLL.get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void mobInboxBanner(String str) {
        C564410MBr.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", str);
        c0lab.LJ("enter_from", "notification_page");
        C20684815ws.LJIILLIIL("ai_livephoto_inbox_banner", c0lab.LIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onResultEvent(HelpCenterResultEvent helpCenterResultEvent) {
        C19EG activity;
        switch (helpCenterResultEvent.getActionType()) {
            case 1001:
                TuxSheet tuxSheet = this.LIZ;
                if (tuxSheet != null && (activity = tuxSheet.getActivity()) != null) {
                    goStoryAlbum(activity, new EnterStoryParam(this.LIZIZ, this.LIZJ, "ai_live_photo_anchor", null, null, null, null, null, null, false, false, false, 0, 0.0f, 18, AFwS194S0000000_8.get$arr$(436), LIZ(), null, null, null, null, false, null, false, null, null, 66994168, null));
                }
                LIZJ();
                break;
            case 1002:
                LIZJ();
                break;
            case 1003:
                EventBus.LIZLLL().LJJI(this);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void postEvent(HelpCenterResultEvent helpCenterResultEvent) {
        EventBus.LIZLLL().LJIILL(helpCenterResultEvent);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final InterfaceC658750Psf provideImageMonitorListener(final ImageMonitorParams imageMonitorParams) {
        return new InterfaceC658750Psf() { // from class: X.0MEf
            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                long jCurrentTimeMillis = System.currentTimeMillis() - imageMonitorParams.getStartTimeGetter().invoke().longValue();
                boolean zBooleanValue = imageMonitorParams.getParentVisibleGetter().invoke().booleanValue();
                C565150MEn c565150MEn = C565150MEn.LIZ;
                String scene = imageMonitorParams.getScene();
                int i = 1;
                if (!jSONObject.optBoolean("isSuccess")) {
                    i = 0;
                }
                c565150MEn.getClass();
                C0LAB c0lab = new C0LAB();
                C0HWW.LIZ.getClass();
                c0lab.LIZ(i, "success");
                c0lab.LIZIZ(jCurrentTimeMillis, "duration");
                c0lab.LJ(Scene.SCENE_SERVICE, scene);
                c0lab.LIZ(zBooleanValue ? 1 : 0, "parent_visible");
                C20684815ws.LJIILLIIL("ai_livephoto_style_image_load_performance", c0lab.LIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void refreshQuotaCache(RefreshQuotaScene refreshQuotaScene) {
        IAIGCQuotaService aIGCQuotaService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (aIGCQuotaService = iExternalService.getAIGCQuotaService()) != null) {
            aIGCQuotaService.refreshQuotaCache(Source.EDIT_AI_LIVE_PHOTO.getSource(), refreshQuotaScene);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void refreshQuotaCacheIfNeed(RefreshQuotaScene refreshQuotaScene) {
        IAIGCQuotaService aIGCQuotaService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (aIGCQuotaService = iExternalService.getAIGCQuotaService()) != null) {
            aIGCQuotaService.refreshQuotaCacheIfNeed(Source.EDIT_AI_LIVE_PHOTO.getSource(), refreshQuotaScene);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final Object requestNotifyQuotaUpdate(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            Object objLJJJJIZL = iCreationAsyncTaskManagerLIZ.LJJJJIZL(interfaceC1364105Vn);
            if (objLJJJJIZL == C099R.LJFF()) {
                return objLJJJJIZL;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final void LIZIZ(OpenPostAlbumParams openPostAlbumParams, Activity activity) {
        CreativeInfo creativeInfo;
        C575870MiH c575870MiH = new C575870MiH();
        String str = openPostAlbumParams.shootWay;
        if (str == null) {
            str = "ai_livephoto_anchor";
        }
        c575870MiH.LIZ.setShootWay(str);
        c575870MiH.LIZ.setEnterMethod(openPostAlbumParams.enterMethod);
        String str2 = openPostAlbumParams.enterFrom;
        if (str2 == null) {
            str2 = "ai_live_photo_anchor";
        }
        c575870MiH.LIZ.setEnterFrom(str2);
        c575870MiH.LIZ.setEnableLivePhoto(true);
        C575860MiG c575860MiG = c575870MiH.LIZ;
        AILivePhotoConsumptionModel aILivePhotoConsumptionModel = new AILivePhotoConsumptionModel(true, openPostAlbumParams.aiAliveInfo, openPostAlbumParams.delayGuideShow, openPostAlbumParams.originAIAliveInfo, openPostAlbumParams.music, false);
        C524780Ki4.LIZ.start(PhotoModeTemplateOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        String creationId = c575860MiG.getCreationId();
        if (creationId != null) {
            creativeInfo = new CreativeInfo(creationId, 0, null, 6, null);
        } else {
            creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        }
        shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
        shortVideoContext.creativeInfo = creativeInfo;
        shortVideoContext.shootWay = c575860MiG.getShootWay();
        shortVideoContext.enterFrom = c575860MiG.getEnterFrom();
        shortVideoContext.enterMethod = c575860MiG.getEnterMethod();
        shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel = aILivePhotoConsumptionModel;
        Bundle bundle = new Bundle();
        C537520L6g.LJFF(bundle, creativeInfo);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_set_column_count", 3);
        bundle.putInt("key_choose_scene", 57);
        bundle.putInt("key_support_flag", 25);
        bundle.putBoolean("Key_enable_single_select_mode", false);
        String str3 = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LIZLLL(activity, bundle, 1);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", c575860MiG.getShootWay());
        c0lab.LJ("enter_method", c575860MiG.getEnterMethod());
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJFF("is_draft", false);
        C20684815ws.LJIILLIIL("click_upload_entrance", c0lab.LIZ);
        String modelPrompt = null;
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("shoot_way", c575860MiG.getShootWay());
            c0lab2.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab2.LJ("group_id", C1443560nfW.LIZIZ);
            c0lab2.LJ("enter_from", c575860MiG.getEnterFrom());
            c0lab2.LJ("enter_method", c575860MiG.getEnterMethod());
            AIAliveInfo originAIAliveInfo = aILivePhotoConsumptionModel.getOriginAIAliveInfo();
            String modelPrompt2 = null;
            if (originAIAliveInfo != null) {
                modelPrompt = originAIAliveInfo.getModelPrompt();
            }
            c0lab2.LJ("origin_ai_alive_prompt", modelPrompt);
            AIAliveInfo aiAliveInfo = shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getAiAliveInfo();
            if (aiAliveInfo != null) {
                modelPrompt2 = aiAliveInfo.getModelPrompt();
            }
            c0lab2.LJ("prompt_text", modelPrompt2);
            c0lab2.LJ("follow_prompt_type", shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getFollowPromptTypeSafelyBeforeEdit());
            iRecordMobService.LIZ(c0lab2.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void goStoryAlbum(Activity activity, IAlbumParam iAlbumParam) {
        EnterStoryParam enterStoryParam;
        SocMediaPickerService socMediaPickerService;
        C563770M9f c563770M9fLIZLLL;
        if ((iAlbumParam instanceof EnterStoryParam) && (enterStoryParam = (EnterStoryParam) iAlbumParam) != null && (socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null)) != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
            this.LIZJ = enterStoryParam.getEnterMethod();
            this.LIZIZ = enterStoryParam.getShootWay();
            c563770M9fLIZLLL.startStoryPublish(activity, enterStoryParam, c563770M9fLIZLLL.chooseBPEAToken("bpea-story_ai_live_photo_anchor_request_read_storage_permission_target34", "bpea-story_ai_live_photo_anchor_request_read_storage_permission_target33", "bpea-ai_live_photo_anchor_request_read_storage_permission"));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final boolean isAILiveShootWay(String str, String str2) {
        if (Intrinsics.LJFF(str, "ai_livephoto_anchor") || (Intrinsics.LJFF(str, "general_search") && Intrinsics.LJFF(str2, "ai_livephoto_search_card"))) {
            return true;
        }
        if (Intrinsics.LJFF(str, "notification_page") && Intrinsics.LJFF(str2, "ai_livephoto_inbox_banner")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final DialogFragment provideAILiveSheetContentView(Context context, OpenPostAlbumParams openPostAlbumParams) {
        AILivePhotoSheetFragment aILivePhotoSheetFragment = new AILivePhotoSheetFragment();
        aILivePhotoSheetFragment.setArguments(C799520VXy.LIZ(new Pair("open_album_params", openPostAlbumParams)));
        return aILivePhotoSheetFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object translateAnchorText(java.lang.String r21, X.InterfaceC1364105Vn<? super java.lang.String> r22) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C565060MEe.translateAnchorText(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final String getDynamicString(int i, String str, Object... objArr) {
        C0MEB next;
        C0MEB.Companion.getClass();
        Iterator<C0MEB> it2 = C0MEB.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getResId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0MEB c0meb = next;
        if (str == null && c0meb != null) {
            return C0MED.LIZ(c0meb, Arrays.copyOf(objArr, objArr.length));
        }
        C0C9P c0c9p = C0C9P.AI_ALIVE;
        if (str == null) {
            str = "";
        }
        return C555520LqY.LIZ(c0c9p, i, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final Object processMusicFollowingCreation(IShortVideoContext iShortVideoContext, Context context, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ShortVideoContext shortVideoContext;
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_ai_alive_follow_allow_music_download", true) > 0) {
            if (iShortVideoContext instanceof ShortVideoContext) {
                shortVideoContext = (ShortVideoContext) iShortVideoContext;
            } else {
                shortVideoContext = null;
            }
            Object objLIZ = new C565670MGn(context, shortVideoContext).LIZ(interfaceC1364105Vn);
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void goPostAlbum(Activity activity, OpenPostAlbumParams openPostAlbumParams, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, Function0<Unit> function0) {
        C0M8O.LIZ.getClass();
        if (!C0M8O.LIZJ() && lifecycleOwner != null && fragmentManager != null && !openPostAlbumParams.delayGuideShow) {
            LIZLLL(activity, C786410Ut5.L3(activity), lifecycleOwner, fragmentManager, openPostAlbumParams.enterMethod, new AwS252S0300000_8((Function0) function0, (Function0<Unit>) openPostAlbumParams, (OpenPostAlbumParams) activity, (Activity) 37));
            return;
        }
        LIZIZ(openPostAlbumParams, activity);
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAILiveService
    public final void goStoryAlbumWithGuideCheck(Activity activity, Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, IAlbumParam iAlbumParam) {
        EnterStoryParam enterStoryParam;
        if ((iAlbumParam instanceof EnterStoryParam) && (enterStoryParam = (EnterStoryParam) iAlbumParam) != null) {
            this.LIZJ = enterStoryParam.getEnterMethod();
            this.LIZIZ = enterStoryParam.getShootWay();
            C0M8O.LIZ.getClass();
            if (!C0M8O.LIZJ() && lifecycleOwner != null && fragmentManager != null) {
                LIZLLL(activity, context, lifecycleOwner, fragmentManager, enterStoryParam.getEnterMethod(), new AwS252S0300000_8(this, activity, enterStoryParam, 38));
            } else {
                goStoryAlbum(activity, enterStoryParam);
            }
        }
    }

    public final void LIZLLL(Activity activity, Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, String str, Function0<Unit> function0) {
        C0M8O.LIZ.getClass();
        C0M8O.LJ();
        String strLIZ = C2539709xL.LIZ();
        C0MF5.LIZ.getClass();
        String strLIZJ = C0MF5.LIZJ();
        C0MES c0mes = C0MES.LIZ;
        String str2 = this.LIZIZ;
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this, activity, 122);
        c0mes.getClass();
        C0MFM c0mfm = new C0MFM(strLIZ, strLIZJ, C0MES.LIZIZ(context, null, null, "feed", str2, str, awS409S0200000_8), new AwS124S1200000_8(this, str, function0, 5), new AwS157S1100000_8(this, str, 11), new AwS157S1100000_8(this, str, 12));
        if (this.LIZ != null) {
            LIZJ();
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = new C0MFL(c0mfm, lifecycleOwner.getLifecycle(), null, context);
        c1390920mIc.LJIIIIZZ(4);
        c1390920mIc.LIZLLL(R.style.y0, false);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLLIL = false;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC580970MqV(this, 4);
        this.LIZ = tuxSheet;
        if (fragmentManager != null) {
            C1440005kM.LIZ(new C453940Hr6(true, false, 4));
            TuxSheet tuxSheet2 = this.LIZ;
            if (tuxSheet2 != null) {
                tuxSheet2.show(fragmentManager, "guide");
            }
        }
        C564410MBr c564410MBr = C564410MBr.LIZ;
        String str3 = this.LIZIZ;
        c564410MBr.getClass();
        C564410MBr.LJIILL(null, null, "show", "feed", str3, str);
    }
}
