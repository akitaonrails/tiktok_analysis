package com.bytedance.android.live.gift;

import X.AbstractC1126600fQI;
import X.AbstractC1132980faa;
import X.AnonymousClass0054;
import X.C006A;
import X.C0UIY;
import X.C1086850eOB;
import X.C1096780eeC;
import X.C1117630fBp;
import X.C1120640fGg;
import X.C1121570fIB;
import X.C1124340fMe;
import X.C1125830fP3;
import X.C1129400fUo;
import X.C1129740fVM;
import X.C1129950fVh;
import X.C1130250fWB;
import X.C1142370fpj;
import X.C1AI6;
import X.C1AII;
import X.EnumC1090760eUU;
import X.EnumC1133020fae;
import X.InterfaceC1089980eTE;
import X.InterfaceC1095420ec0;
import X.InterfaceC1118110fCb;
import X.InterfaceC1125320fOE;
import X.InterfaceC1125350fOH;
import X.InterfaceC1125480fOU;
import X.InterfaceC1133090fal;
import X.InterfaceC1133140faq;
import X.InterfaceC1137650fi7;
import X.InterfaceC1138820fk0;
import X.InterfaceC769400UGc;
import X.InterfaceC769550UGr;
import X.InterfaceC769900UIa;
import X.InterfaceC773910UXl;
import X.InterfaceC949480aoc;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.CrossScreenSeiInfo;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.goal.model.CommitV2RequestParams;
import com.bytedance.android.livesdk.goal.model.CommitV2Response;
import com.bytedance.android.livesdk.goal.model.PinRequestParams;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public interface IGiftService extends C006A {
    void addAsset(AssetsModel assetsModel);

    boolean canShowGiftTagInPublicScreen(DataChannel dataChannel, GiftMessage giftMessage);

    boolean checkIsViewerWishesConflictedAndShowToast(DataChannel dataChannel);

    void clearAssetModels();

    void clearAssets(String str);

    void clearFastGift(long j);

    void clearGiftMap();

    void commitV2Goal(CommitV2RequestParams commitV2RequestParams, Function1<? super CommitV2Response.Data, Unit> function1, Function1<? super Throwable, Unit> function12);

    void consumeBagItemFromJsb(Context context, C1130250fWB c1130250fWB);

    C0UIY createGameGiftMessageManager(InterfaceC1137650fi7 interfaceC1137650fi7, DataChannel dataChannel);

    InterfaceC1125480fOU createGiftDebugService(Context context, DataChannel dataChannel);

    C0UIY createMusicGiftMessageManager(InterfaceC1137650fi7 interfaceC1137650fi7, DataChannel dataChannel);

    InterfaceC769400UGc createStickerGiftEffectManager(String str, boolean z);

    C0UIY createStickerMessageManager(InterfaceC1137650fi7 interfaceC1137650fi7, DataChannel dataChannel);

    InterfaceC1095420ec0 createTeamChallengeChecker(DataChannel dataChannel);

    void destroyGiftBannedManager();

    void downloadAssets(long j, InterfaceC1138820fk0 interfaceC1138820fk0, int i);

    boolean enablePlatformPortal();

    boolean enablePortal();

    boolean enableRedEnvelope();

    boolean enableRedEnvelopeForSuperFan();

    boolean enableRedEnvelopeForUserDiamond();

    void exitRoom(boolean z, Room room);

    void fetchGiftAnchorPanelActivityInfo(Room room, DataChannel dataChannel);

    Gift findClosetGift(int i);

    Gift findGiftById(long j);

    ImageModel findImageFromMultiResourceMap(Gift gift);

    View generateCPCTopView(Context context, boolean z, Function0<Unit> function0);

    AssetsModel getAssets(String str, long j);

    String getAssetsPath(String str, long j);

    LiveWidget getAudiencePinCardWidget(boolean z);

    Gift getCommunityGift();

    List<AbstractC1126600fQI<? extends AnonymousClass0054>> getCurrentGiftPanelList();

    C1125830fP3 getCurrentGoalInfo();

    String getESVersion();

    Class<? extends LiveRecyclableWidget> getExtendScreenGiftTrayWidget();

    Gift getFansClubGift();

    long getFirstSubscribeGiftId();

    String getGiftEnterFrom();

    View getGiftEntranceIcon(Context context);

    boolean getGiftGalleryAllSponsored(long j);

    GiftGalleryMetrics getGiftGalleryMetrics();

    Class<? extends LiveRecyclableWidget> getGiftGuideWidgetClass();

    GiftsInfo.LevelUpGiftInfo getGiftLevelUpInfo();

    GiftListResult getGiftListResult();

    GiftMessage getGiftMessage(long j, SendGiftResult sendGiftResult, User user);

    String getGiftMessageDesc(DataChannel dataChannel, GiftMessage giftMessage);

    List<GiftPage> getGiftPages();

    InterfaceC769550UGr getGiftPreDownloadService();

    GiftSuspension getGiftSuspensionData(DataChannel dataChannel);

    void getGiftTagInPublicScreenAsync(DataChannel dataChannel, GiftMessage giftMessage, Function1<? super List<? extends CharSequence>, Unit> function1);

    LiveWidget getGiftWidget(EnterRoomConfig enterRoomConfig, RecyclableWidgetManager recyclableWidgetManager);

    Class<? extends LiveRecyclableWidget> getGiftWidget();

    Class<? extends Widget> getGiftWidgetClass();

    Pair<String, String> getLeagueInfo(long j);

    Class<? extends LiveRecyclableWidget> getLiveGiftTrayWidgetV2Class();

    String getLowAgeReportUrl();

    LynxUI<?> getLynxAudioLiveView(s sVar);

    InterfaceC1089980eTE getOverloadScoreRetriever();

    int getPanelWidthInPad();

    C1086850eOB getPollGifts();

    LiveRecyclableWidget getRedEnvelopeWidget();

    Class<? extends LiveRecyclableWidget> getRedEnvelopeWidgetClass();

    String getRoomStatus();

    C1142370fpj getSendGiftResultLog(SendGiftResult sendGiftResult);

    LiveWidget getSpecialGiftWidget();

    InterfaceC769900UIa getStickerEffectListener();

    int getTargetGiftDiamondCount(long j);

    Gift getUpgradeGift();

    InterfaceC949480aoc getViewerWishesService();

    long giftVideoResourcesClear(boolean z);

    boolean hasAvailableDiamonds();

    void initGiftBannedManager(Room room, DataChannel dataChannel, boolean z);

    void initGiftResource();

    void initGiftResourceManager(Context context);

    void initPublicScreenConfiguration();

    boolean isAssetsDownloaded(String str, long j);

    boolean isFansCLubGiftLimited(DataChannel dataChannel);

    boolean isGiftGuideInAvoid();

    boolean isGiftSuspended(DataChannel dataChannel);

    boolean isGiftingAvailable(DataChannel dataChannel);

    boolean isNewsAccount(DataChannel dataChannel);

    boolean isSubscriptionGift(long j);

    void liveCoinConsumption(LiveCoinConsumptionInput liveCoinConsumptionInput);

    void loadBehavior(Context context, DataChannel dataChannel, int i);

    void monitorBroadcastClicked(long j);

    void monitorBroadcastMonitor(long j, boolean z);

    void monitorGiftIconShow(DataChannel dataChannel, boolean z, EnumC1090760eUU enumC1090760eUU, String str, String str2, int i);

    void notifyUserLeaveRoom();

    /* bridge */ /* synthetic */ void onInit();

    void onLiveActivityDestroyed();

    void onLiveBroadcastActivityDestroyed();

    void onLocaleChanged(Locale locale);

    void onPlayFragmentCreate(Context context);

    void onSeiUpdate(Object obj);

    void openGiftDialog(String str);

    void openGiftDialog(String str, long j, long j2, String str2);

    void openGiftDialog(String str, C1129740fVM c1129740fVM);

    void openGiftDialogFromJSB(C1120640fGg c1120640fGg);

    void openGiftDialogFromNative(DataChannel dataChannel, C1121570fIB c1121570fIB);

    void openGiftMessageRightTagPage(Context context, GiftMessage giftMessage, Room room);

    void openGiftSetting(FragmentManager fragmentManager, C1096780eeC c1096780eeC);

    void pinGoal(PinRequestParams pinRequestParams);

    void preloadBroadcastApi();

    void preloadGiftTabs(int i);

    void preloadLayout();

    InterfaceC773910UXl provideInteractionView(LifecycleOwner lifecycleOwner);

    InterfaceC773910UXl provideSuperFanTreasureBoxView(LifecycleOwner lifecycleOwner);

    InterfaceC773910UXl provideViewerWishesIconForInteractionPanel();

    void registerLiveGoalBehavior();

    void removeAnimationEngine(EnumC1133020fae enumC1133020fae);

    void removeEffectPreloadCallback();

    void reportCrossScreenSeiWrite(CrossScreenSeiInfo crossScreenSeiInfo, long j, boolean z);

    void resetGiftInfo(long j, long j2, DataChannel dataChannel);

    void resetPinCardStatus();

    void resetRoomStatus(boolean z);

    void saveViewerWishesItems(C1AII c1aii);

    void sendExclusiveShowRedDotEvent(DataChannel dataChannel);

    void sendFansClubJoinGift(DataChannel dataChannel, InterfaceC1125350fOH interfaceC1125350fOH, String str, String str2, int i, Map<String, ? extends Object> map, Integer num);

    void sendGiftForBecomeGuest(long j, Room room, DataChannel dataChannel);

    void sendGiftFromIncentivePage(DataChannel dataChannel, String str, long j, InterfaceC1125350fOH interfaceC1125350fOH);

    void sendGiftInternal(Context context, C1129400fUo c1129400fUo);

    void sendGiftPoll(long j, long j2, Room room, DataChannel dataChannel, InterfaceC1125320fOE interfaceC1125320fOE);

    void sendIncentiveGift(C1129950fVh c1129950fVh, DataChannel dataChannel);

    void sendPtyFeature2(String str);

    void setFirstRechargePendingOpenDialogEvent(C1121570fIB c1121570fIB);

    void setGiftAnimationEngine(EnumC1133020fae enumC1133020fae, InterfaceC1133090fal interfaceC1133090fal);

    boolean shouldForceInsertLevelUpGift();

    boolean shouldShowCPCMessageFromService();

    boolean shouldShowPostRechargeRetentionSheet(C1124340fMe c1124340fMe, long j, int i);

    void showBroadCaseEndPage(boolean z);

    void showGiftBannedPopup(Context context, boolean z);

    boolean showOnPublicScreen(GiftMessage giftMessage);

    void showViewerWishesSettingPage(DataChannel dataChannel, C1AI6 c1ai6, boolean z);

    void switchGiftIconBySkinId(long j, long j2);

    void syncAssetList(int i, ArrayList<Long> arrayList, InterfaceC1133140faq interfaceC1133140faq);

    void syncGiftList(int i);

    void syncGiftList(AbstractC1132980faa abstractC1132980faa, long j, int i, boolean z);

    void toggleGiftBehavior(Context context, DataChannel dataChannel, boolean z);

    void updateGiftStickerEffectComposer(InterfaceC1137650fi7 interfaceC1137650fi7);

    void updateSettingSwitch(Context context, C1117630fBp c1117630fBp, InterfaceC1118110fCb interfaceC1118110fCb);
}
