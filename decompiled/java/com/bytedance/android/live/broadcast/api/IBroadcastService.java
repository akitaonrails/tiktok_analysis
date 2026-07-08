package com.bytedance.android.live.broadcast.api;

import X.AbstractBinderC775240Ub4;
import X.AbstractC1120020fFg;
import X.AbstractC1273900jFs;
import X.C006A;
import X.C09JN;
import X.C0JFW;
import X.C0UFE;
import X.C0UH0;
import X.C0UHD;
import X.C0UJY;
import X.C0UKU;
import X.C0UPO;
import X.C0UU3;
import X.C0UU4;
import X.C0UU5;
import X.C0UU6;
import X.C0UU7;
import X.C0UU8;
import X.C0UU9;
import X.C0UUD;
import X.C0UUE;
import X.C0UX3;
import X.C0UZ4;
import X.C0UZ9;
import X.C0UZK;
import X.C0UZN;
import X.C11NZ;
import X.C1AKO;
import X.C1AKR;
import X.C1AKS;
import X.C470590Icr;
import X.C474500IjA;
import X.C754060Ti0;
import X.C758340Tou;
import X.C773070UUf;
import X.C776310Ucn;
import X.C783980UpA;
import X.EnumC767550U8z;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC1113710f5V;
import X.InterfaceC1113900f5o;
import X.InterfaceC1304380k32;
import X.InterfaceC1631620sYq;
import X.InterfaceC1833480xoQ;
import X.InterfaceC202141147n;
import X.InterfaceC20313114e1;
import X.InterfaceC337570DLf;
import X.InterfaceC466590IRl;
import X.InterfaceC498680Jh4;
import X.InterfaceC754220TiG;
import X.InterfaceC761180TtU;
import X.InterfaceC761860Tua;
import X.InterfaceC767110U7h;
import X.InterfaceC769120UFa;
import X.InterfaceC769940UIe;
import X.InterfaceC770050UIp;
import X.InterfaceC770130UIx;
import X.InterfaceC771710UOz;
import X.InterfaceC773010UTz;
import X.InterfaceC773130UUl;
import X.InterfaceC775230Ub3;
import X.InterfaceC775270Ub7;
import X.InterfaceC780300UjE;
import X.InterfaceC780650Ujn;
import X.InterfaceC781090UkV;
import X.InterfaceC782930UnT;
import X.InterfaceC923890a9L;
import X.InterfaceC923940a9Q;
import X.InterfaceC924050a9b;
import X.InterfaceC978780bZs;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayDeleteResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelRequest;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelResponse;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.dualdevice.IDualDeviceVideoWidget;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import tikcast.api.anchor.AnchorClipInfoResponse;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;
import tikcast.api.anchor.CancelAutoDownloadResponse;
import tikcast.api.anchor.ReminderWordQueryStatusRequest;
import tikcast.api.anchor.ReminderWordQueryStatusResponse;
import tikcast.api.anchor.ReminderWordUpdateStatusRequest;
import tikcast.api.anchor.ReminderWordUpdateStatusResponse;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;
import webcast.api.creator.PreScheduleStream;
import webcast.api.room.EntranceConditionsPopup;
import webcast.data.AutoShareLiveCardToBulletinBoard;

/* JADX INFO: loaded from: classes13.dex */
public interface IBroadcastService extends C006A {
    boolean addDisplaySourceOption(long j, InterfaceC1113900f5o interfaceC1113900f5o);

    void addHostToolsCallback(EnumC773040UUc enumC773040UUc, C0UUD c0uud);

    void advancePushStream();

    void againHandlerBundle(JSONObject jSONObject);

    void boostCpu();

    C11NZ<CancelAutoDownloadResponse> cancelLiveReplayAutoDownload(long j);

    C11NZ<C470590Icr<AnchorReplayInfoData>> checkScheduledLiveReplayVideoTask(boolean z, Long l, Boolean bool, Integer num, Boolean bool2);

    boolean checkStickerIntercept();

    void clearPreviewImageInfo();

    C11NZ<AnchorLiveFragmentEditResponse> clipOrSaveLiveReplayFragment(long j, long j2, long j3, int i);

    LiveSheetFragment createAIReplySettingFragment(String str);

    AbstractBinderC775240Ub4 createBgBroadcastBinder();

    Widget createCaptchaLiveWidget(View view);

    void createCloseRoomHelper(Room room, Context context, DataChannel dataChannel, Fragment fragment, C0UZ4 c0uz4);

    InterfaceC780650Ujn createCommonInteractionFunctionHelper(Context context, BaseFragment baseFragment, InterfaceC781090UkV interfaceC781090UkV, View view, RecyclableWidgetManager recyclableWidgetManager);

    LiveEffect createEffectByType(EnumC767550U8z enumC767550U8z);

    LiveRecyclableWidget createGameLiveNetSpeedMonitorWidget();

    InterfaceC773010UTz createImagePicker(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, InterfaceC202141147n interfaceC202141147n, boolean z, boolean z2, boolean z3);

    InterfaceC923890a9L createLinkMicPreviewView(Context context, C758340Tou c758340Tou, DataChannel dataChannel, Object obj);

    InterfaceC923890a9L createLinkVideoView(Context context, C758340Tou c758340Tou, InterfaceC924050a9b interfaceC924050a9b, DataChannel dataChannel);

    C1AKR createLiveBroadcastEndFragment(Bundle bundle);

    InterfaceC337570DLf createLiveBroadcastEndSafetyToolsFragment(Bundle bundle);

    C1AKS createLiveBroadcastFragment(Context context, InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    LiveWidget createLiveCenterEntranceTopNoticeWidget();

    LiveWidget createLiveCenterEntranceWidget();

    C0UU9 createLiveCoverCameraFragment();

    C0UU7 createLiveIllegalHelper(Room room, Context context, DataChannel dataChannel, C0UZ4 c0uz4);

    InterfaceC769940UIe createLiveStream(C776310Ucn c776310Ucn);

    C1AKO createLiveStudioMonitorFragment(Context context, Bundle bundle);

    C0UU4 createLongPressHelper(Room room, Fragment fragment, View view, Context context, DataChannel dataChannel);

    C0UH0 createMonitorReport();

    C1AKO createObsBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    void createPauseLiveHelper(DataChannel dataChannel, InterfaceC769940UIe interfaceC769940UIe, C0UZ9 c0uz9);

    Widget createPauseLiveWidget(View view);

    InterfaceC782930UnT createStartLiveFragment(InterfaceC498680Jh4 interfaceC498680Jh4);

    C0UZK createStatusReporter(Room room);

    InterfaceC775270Ub7 createStreamLogger();

    InterfaceC780300UjE createStreamUploader(String str);

    C0UU8 createSyncGiftHelper(Room room);

    LiveDialogFragment createTryModeEducationDialogFragment(String str, View.OnClickListener onClickListener);

    <T extends ViewModel> T createViewModel(Class<T> cls);

    InterfaceC923890a9L createVirtualAvatarView(Context context, C758340Tou c758340Tou, DataChannel dataChannel, C773070UUf c773070UUf);

    C1AKO createVoiceChatBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    InterfaceC754220TiG createVoiceChatVideoClientFactory();

    C11NZ<AnchorReplayDeleteResponse> deleteLiveReplayAutoDownload(long j);

    C0UFE disableFunctionAccordingLevel(DataChannel dataChannel, Function1<AnchorLevelPermission, C0UFE> function1, Function1<C0UFE, Unit> function12, Function1<C474500IjA, C474500IjA> function13, String str, Boolean bool);

    C0UFE disableFunctionAccordingLevel(DataChannel dataChannel, Function1<AnchorLevelPermission, C0UFE> function1, Function1<C0UFE, Unit> function12, Function1<C474500IjA, C474500IjA> function13, String str, Boolean bool, WeakReference<InterfaceC978780bZs> weakReference, Boolean bool2);

    void dispatchBroadcastSchema(String str, String str2, Map<String, String> map);

    LiveDialogFragment getAISummaryDialogFragment(int i);

    Boolean getAgeRestrictedSetting(DataChannel dataChannel);

    C11NZ<AnchorClipInfoResponse> getAnchorClipInfo();

    LiveSheetFragment getAutoShareToBBFragment();

    String getBoardContentBrandLabel();

    Context getBroadcastActivity();

    C0UKU getBroadcastGestureDetector(DataChannel dataChannel);

    C0UU3 getBroadcastInstructHelper(DataChannel dataChannel, LifecycleOwner lifecycleOwner, View view, View view2, View view3);

    InterfaceC771710UOz getBroadcastKit();

    C0UU5 getBroadcastPreviewService();

    String getBroadcastScene();

    Map<String, String> getBroadcastTag();

    String getConnectionType();

    C0JFW getDebugInfoManager();

    IDualDeviceVideoWidget getDualDeviceVideoWidget(C0UHD c0uhd, SurfaceView surfaceView, int i, int i2, int i3);

    IDualDeviceVideoWidget getDualDeviceVideoWidgetV2(SurfaceView surfaceView);

    InterfaceC761860Tua getEchoHelper();

    C11NZ<C470590Icr<GetResponse.Data>> getGoalGiftInfo(String str, Long l, int i, int i2);

    C0UUE getHostToolsCurrentStatus(EnumC773040UUc enumC773040UUc);

    InterfaceC1304380k32 getKryptonCamera();

    LiveMode getLastBroadcastLiveMode(Context context);

    InterfaceC466590IRl getLiveAudioDevicesDetector();

    InterfaceC770050UIp getLiveCameraCapture(SurfaceView surfaceView, InterfaceC769940UIe interfaceC769940UIe, boolean z, boolean z2, boolean z3);

    InterfaceC767110U7h getLiveCameraResManager();

    View getLiveCenterNativeView(Context context);

    String getLiveComposerFilePath();

    InterfaceC770130UIx getLiveCoreInitUtil();

    String getLiveCoreVersion();

    C0UJY getLiveParamsListener(DataChannel dataChannel);

    C11NZ<AnchorLiveFragmentInfoResponse> getLiveReplayFragment(long j);

    C11NZ<C470590Icr<AnchorLiveReplayFrameResponse.ResponseData>> getLiveReplayFrame(long j, long j2, long j3, boolean z, long j4, int i);

    InterfaceC761180TtU getLiveStreamSoundPlayer();

    Map<String, String> getLopLogParams();

    InterfaceC923940a9Q getMultiGuestV3OriginFrameReviewManager(long j);

    List<InterfaceC1113710f5V> getOnExtendedScreenRegistryReadyListeners();

    AbstractC1120020fFg getOtherGestureDetector(Context context, DataChannel dataChannel, int i, BaseFragment baseFragment, View view);

    int getPanelLayoutType();

    InterfaceC1833480xoQ getRecordCommentsAndGiftsGuideSheet();

    C11NZ<ReminderWordQueryStatusResponse> getReminderWordStatus(ReminderWordQueryStatusRequest reminderWordQueryStatusRequest);

    C0UU6 getRequestControl();

    Object getResourceFinder(Context context);

    Map<String, String> getRoomInfo();

    String getRtcDeviceID();

    String getRtcVersion();

    String getSchemaSyncFromCache(String str);

    C11NZ<C470590Icr<GetSettingPanelResponse>> getSettingPanelByType(GetSettingPanelRequest getSettingPanelRequest);

    AutoShareLiveCardToBulletinBoard getShareToBBParam();

    int getShareToBBSwitch();

    LiveWidget getShortCutPanelWidget();

    Map<String, String> getStreamAreaInfo();

    InterfaceC769120UFa getVideoSizeManager();

    void greenScreenUploadCurrentStickerImage(long j, String str, String str2);

    boolean hasLiveCoreInitialized();

    void hasLopBubbleForLog(int i);

    void hasLopEnterBubbleForLog(int i);

    void init();

    void initDualDeviceLiveStream(Context context, int i, int i2, C09JN<InterfaceC769940UIe> c09jn);

    void initLiveBroadcastContext();

    void initPublicScreenConfiguration();

    void initTTMCore();

    boolean isBackgroundPauseRequest();

    boolean isCommerce(DataChannel dataChannel);

    boolean isMatchFloatWindowLib();

    boolean isMicMuted();

    boolean isShowFloatWindow();

    boolean isVideoAnchor();

    void loadPauseLiveButton(DataChannel dataChannel);

    C11NZ<Integer> loadShortVideoRes();

    void logLiveOver(Room room, DataChannel dataChannel);

    void notifyApplyStatusAndSaveStatus(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd, String str);

    void notifyCloseAllLynxDialog();

    void notifyCustomSei();

    void notifyHostAppBoot();

    void notifyStartAbilityChange(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd);

    /* bridge */ /* synthetic */ void onInit();

    void onLocaleChanged(Locale locale);

    boolean oneTapGoLive(Context context, Uri uri);

    void openBackgroundPanelDialog(DataChannel dataChannel, Context context, boolean z);

    void openOrApplyHostToolsAbility(EnumC773040UUc enumC773040UUc, DataChannel dataChannel, Context context, JSONObject jSONObject);

    void openStickerPropsDialog(String str, DataChannel dataChannel, FragmentManager fragmentManager, Room room);

    void preRequestPreSchedule(boolean z);

    void preloadBroadcast(Context context);

    void preloadLiveLibrary();

    void preloadLiveStream(Context context, boolean z, boolean z2);

    void preloadLiveTabLegacy(Context context);

    void preloadPlaybook(String str);

    void preloadVoiceChatLiveStream(Context context);

    void recordButtonClickTime(Long l);

    void releaseDualDeviceStream(Cert cert);

    void releaseHostToolsCallback(DataChannel dataChannel);

    void releaseLiveStream(boolean z, String str);

    void releaseMicMuteHelper(DataChannel dataChannel);

    void releasePreRequestCache();

    void releaseVoiceChatLiveStream();

    void removeHostToolsCallback(EnumC773040UUc enumC773040UUc, C0UUD c0uud);

    void reportAbnormalLive(Context context);

    void reportBannerEvent(long j);

    void reportBroadcastCreated();

    void reportBroadcastEnd();

    void reportCameraFirstShow();

    void reportEnterBroadcast();

    void reportStartPushStream(WeakHandler weakHandler);

    void reportStreamEnd(int i, long j, long j2, boolean z, int i2, int i3);

    void reportStreamEndForApi(int i, long j, long j2, boolean z, int i2);

    void reportStreamEndForLiveCore(int i, int i2, String str, long j, long j2, boolean z, int i3);

    void requestCreateInfoFromTools(String str, boolean z, C0UPO c0upo);

    void requestLiveBanCapability(Runnable runnable);

    void requestPreSchedule(LifecycleCoroutineScope lifecycleCoroutineScope, Function1<PreScheduleStream, Unit> function1);

    void resetGameLiveStreamEndFlag();

    C11NZ<ScheduleAutoDownloadResponse> scheduledLiveReplayAutoDownload(long j);

    void sendMicMuteSei(AbstractC1273900jFs abstractC1273900jFs);

    void setAgeRestricted(DataChannel dataChannel);

    void setAnchorLevelPermissionInPreview(C754060Ti0 c754060Ti0);

    void setApplyLivePermission(ApplyLivePermission applyLivePermission);

    void setBroadcastActivity(Context context);

    void setColor(int i, int i2);

    void setDetailLivePermission(DetailLivePermission detailLivePermission);

    void setGoLiveFullChainLogParams(int i, DataChannel dataChannel, int i2);

    void setLopLogParams(Map<String, String> map);

    void setMicMuted(boolean z, boolean z2, DataChannel dataChannel);

    void setNoPermissionDisplayData(boolean z, EntranceConditionsPopup entranceConditionsPopup);

    void setPushStreamParams(int i, int i2, int i3, boolean z, boolean z2, int i4, JSONObject jSONObject);

    void setResumeLiveParams(int i);

    void setStreamAreaInfo(int i, int i2, int i3, int i4, int i5);

    void setTryModeExperiment(C783980UpA c783980UpA);

    void showCppUnlockGuideDialog(String str, String str2, Boolean bool, FragmentManager fragmentManager);

    void showCppUnlockGuideDialog(String str, String str2, Boolean bool, FragmentManager fragmentManager, WeakReference<InterfaceC978780bZs> weakReference);

    void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager);

    void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager, WeakReference<InterfaceC978780bZs> weakReference);

    void showDialog(Context context, PerceptionMessage perceptionMessage, DataChannel dataChannel, InterfaceC775230Ub3 interfaceC775230Ub3);

    void showEndPageForPaidEvent();

    boolean showFinishEncourage();

    void showGuideBirthdayEditDialog(Context context, String str, String str2, C0UZN c0uzn);

    void showTitleEditDialog(String str, String str2, DataChannel dataChannel, C0UX3 c0ux3);

    void startGoLiveForChatGroupWithPreview(Context context, String str, ArrayList<Long> arrayList, String str2, String str3, ViewModelStoreOwner viewModelStoreOwner, InterfaceC1631620sYq<Integer, Boolean, C11NZ<?>, Unit> interfaceC1631620sYq);

    InterfaceC20313114e1 startLiveManager();

    void startOneTapGoLiveForChatGroup(Context context, Function0<Unit> function0, String str, Bundle bundle, C11NZ<?> c11nz);

    void stopVideoBroadcastService();

    void upLoadLiveEcoEvent(long j, int i);

    void updateContentBrandBoards(DataChannel dataChannel, int i);

    void updateLiveSourceParams(String str);

    C11NZ<ReminderWordUpdateStatusResponse> updateReminderWordStatus(ReminderWordUpdateStatusRequest reminderWordUpdateStatusRequest);

    void uploadStickerImage(String str, String str2, long j);
}
