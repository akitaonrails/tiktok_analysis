package com.bytedance.android.live.gift;

import X.AbstractC1126600fQI;
import X.AbstractC1132980faa;
import X.AnonymousClass0054;
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
import X.C1161920gLG;
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
public final class GiftService implements IGiftService {
    public static final GiftService LLILLJJLI = new GiftService();
    public final /* synthetic */ IGiftService LL = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void addAsset(AssetsModel assetsModel) {
        this.LL.addAsset(assetsModel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean canShowGiftTagInPublicScreen(DataChannel dataChannel, GiftMessage giftMessage) {
        return this.LL.canShowGiftTagInPublicScreen(dataChannel, giftMessage);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean checkIsViewerWishesConflictedAndShowToast(DataChannel dataChannel) {
        return this.LL.checkIsViewerWishesConflictedAndShowToast(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearAssetModels() {
        this.LL.clearAssetModels();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearAssets(String str) {
        this.LL.clearAssets(str);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearFastGift(long j) {
        this.LL.clearFastGift(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearGiftMap() {
        this.LL.clearGiftMap();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void commitV2Goal(CommitV2RequestParams commitV2RequestParams, Function1<? super CommitV2Response.Data, Unit> function1, Function1<? super Throwable, Unit> function12) {
        this.LL.commitV2Goal(commitV2RequestParams, function1, function12);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void consumeBagItemFromJsb(Context context, C1130250fWB c1130250fWB) {
        this.LL.consumeBagItemFromJsb(context, c1130250fWB);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C0UIY createGameGiftMessageManager(InterfaceC1137650fi7 interfaceC1137650fi7, DataChannel dataChannel) {
        return this.LL.createGameGiftMessageManager(interfaceC1137650fi7, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC1125480fOU createGiftDebugService(Context context, DataChannel dataChannel) {
        return this.LL.createGiftDebugService(context, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C0UIY createMusicGiftMessageManager(InterfaceC1137650fi7 interfaceC1137650fi7, DataChannel dataChannel) {
        return this.LL.createMusicGiftMessageManager(interfaceC1137650fi7, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC769400UGc createStickerGiftEffectManager(String str, boolean z) {
        return this.LL.createStickerGiftEffectManager(str, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C0UIY createStickerMessageManager(InterfaceC1137650fi7 interfaceC1137650fi7, DataChannel dataChannel) {
        return this.LL.createStickerMessageManager(interfaceC1137650fi7, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC1095420ec0 createTeamChallengeChecker(DataChannel dataChannel) {
        return this.LL.createTeamChallengeChecker(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void destroyGiftBannedManager() {
        this.LL.destroyGiftBannedManager();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void downloadAssets(long j, InterfaceC1138820fk0 interfaceC1138820fk0, int i) {
        this.LL.downloadAssets(j, interfaceC1138820fk0, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enablePlatformPortal() {
        return this.LL.enablePlatformPortal();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enablePortal() {
        return this.LL.enablePortal();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enableRedEnvelope() {
        return this.LL.enableRedEnvelope();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enableRedEnvelopeForSuperFan() {
        return this.LL.enableRedEnvelopeForSuperFan();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enableRedEnvelopeForUserDiamond() {
        return this.LL.enableRedEnvelopeForUserDiamond();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void exitRoom(boolean z, Room room) {
        this.LL.exitRoom(z, room);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void fetchGiftAnchorPanelActivityInfo(Room room, DataChannel dataChannel) {
        this.LL.fetchGiftAnchorPanelActivityInfo(room, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Gift findClosetGift(int i) {
        return this.LL.findClosetGift(i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Gift findGiftById(long j) {
        return this.LL.findGiftById(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final ImageModel findImageFromMultiResourceMap(Gift gift) {
        return this.LL.findImageFromMultiResourceMap(gift);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final View generateCPCTopView(Context context, boolean z, Function0<Unit> function0) {
        return this.LL.generateCPCTopView(context, z, function0);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final AssetsModel getAssets(String str, long j) {
        return this.LL.getAssets(str, j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getAssetsPath(String str, long j) {
        return this.LL.getAssetsPath(str, j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LiveWidget getAudiencePinCardWidget(boolean z) {
        return this.LL.getAudiencePinCardWidget(z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Gift getCommunityGift() {
        return this.LL.getCommunityGift();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final List<AbstractC1126600fQI<? extends AnonymousClass0054>> getCurrentGiftPanelList() {
        return this.LL.getCurrentGiftPanelList();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C1125830fP3 getCurrentGoalInfo() {
        return this.LL.getCurrentGoalInfo();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getESVersion() {
        return this.LL.getESVersion();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getExtendScreenGiftTrayWidget() {
        return this.LL.getExtendScreenGiftTrayWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Gift getFansClubGift() {
        return this.LL.getFansClubGift();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final long getFirstSubscribeGiftId() {
        return this.LL.getFirstSubscribeGiftId();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getGiftEnterFrom() {
        return this.LL.getGiftEnterFrom();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final View getGiftEntranceIcon(Context context) {
        return this.LL.getGiftEntranceIcon(context);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean getGiftGalleryAllSponsored(long j) {
        return this.LL.getGiftGalleryAllSponsored(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final GiftGalleryMetrics getGiftGalleryMetrics() {
        return this.LL.getGiftGalleryMetrics();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getGiftGuideWidgetClass() {
        return this.LL.getGiftGuideWidgetClass();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final GiftsInfo.LevelUpGiftInfo getGiftLevelUpInfo() {
        return this.LL.getGiftLevelUpInfo();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final GiftListResult getGiftListResult() {
        return this.LL.getGiftListResult();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final GiftMessage getGiftMessage(long j, SendGiftResult sendGiftResult, User user) {
        return this.LL.getGiftMessage(j, sendGiftResult, user);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getGiftMessageDesc(DataChannel dataChannel, GiftMessage giftMessage) {
        return this.LL.getGiftMessageDesc(dataChannel, giftMessage);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final List<GiftPage> getGiftPages() {
        return this.LL.getGiftPages();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC769550UGr getGiftPreDownloadService() {
        return this.LL.getGiftPreDownloadService();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final GiftSuspension getGiftSuspensionData(DataChannel dataChannel) {
        return this.LL.getGiftSuspensionData(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void getGiftTagInPublicScreenAsync(DataChannel dataChannel, GiftMessage giftMessage, Function1<? super List<? extends CharSequence>, Unit> function1) {
        this.LL.getGiftTagInPublicScreenAsync(dataChannel, giftMessage, function1);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LiveWidget getGiftWidget(EnterRoomConfig enterRoomConfig, RecyclableWidgetManager recyclableWidgetManager) {
        return this.LL.getGiftWidget(enterRoomConfig, recyclableWidgetManager);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getGiftWidget() {
        return this.LL.getGiftWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends Widget> getGiftWidgetClass() {
        return this.LL.getGiftWidgetClass();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Pair<String, String> getLeagueInfo(long j) {
        return this.LL.getLeagueInfo(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getLiveGiftTrayWidgetV2Class() {
        return this.LL.getLiveGiftTrayWidgetV2Class();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getLowAgeReportUrl() {
        return this.LL.getLowAgeReportUrl();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LynxUI<?> getLynxAudioLiveView(s sVar) {
        return this.LL.getLynxAudioLiveView(sVar);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC1089980eTE getOverloadScoreRetriever() {
        return this.LL.getOverloadScoreRetriever();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final int getPanelWidthInPad() {
        return this.LL.getPanelWidthInPad();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C1086850eOB getPollGifts() {
        return this.LL.getPollGifts();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LiveRecyclableWidget getRedEnvelopeWidget() {
        return this.LL.getRedEnvelopeWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getRedEnvelopeWidgetClass() {
        return this.LL.getRedEnvelopeWidgetClass();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getRoomStatus() {
        return this.LL.getRoomStatus();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C1142370fpj getSendGiftResultLog(SendGiftResult sendGiftResult) {
        return this.LL.getSendGiftResultLog(sendGiftResult);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LiveWidget getSpecialGiftWidget() {
        return this.LL.getSpecialGiftWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC769900UIa getStickerEffectListener() {
        return this.LL.getStickerEffectListener();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final int getTargetGiftDiamondCount(long j) {
        return this.LL.getTargetGiftDiamondCount(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Gift getUpgradeGift() {
        return this.LL.getUpgradeGift();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC949480aoc getViewerWishesService() {
        return this.LL.getViewerWishesService();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final long giftVideoResourcesClear(boolean z) {
        return this.LL.giftVideoResourcesClear(z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean hasAvailableDiamonds() {
        return this.LL.hasAvailableDiamonds();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initGiftBannedManager(Room room, DataChannel dataChannel, boolean z) {
        this.LL.initGiftBannedManager(room, dataChannel, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initGiftResource() {
        this.LL.initGiftResource();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initGiftResourceManager(Context context) {
        this.LL.initGiftResourceManager(context);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initPublicScreenConfiguration() {
        this.LL.initPublicScreenConfiguration();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isAssetsDownloaded(String str, long j) {
        return this.LL.isAssetsDownloaded(str, j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isFansCLubGiftLimited(DataChannel dataChannel) {
        return this.LL.isFansCLubGiftLimited(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isGiftGuideInAvoid() {
        return this.LL.isGiftGuideInAvoid();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isGiftSuspended(DataChannel dataChannel) {
        return this.LL.isGiftSuspended(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isGiftingAvailable(DataChannel dataChannel) {
        return this.LL.isGiftingAvailable(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isNewsAccount(DataChannel dataChannel) {
        return this.LL.isNewsAccount(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isSubscriptionGift(long j) {
        return this.LL.isSubscriptionGift(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void liveCoinConsumption(LiveCoinConsumptionInput liveCoinConsumptionInput) {
        this.LL.liveCoinConsumption(liveCoinConsumptionInput);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void loadBehavior(Context context, DataChannel dataChannel, int i) {
        this.LL.loadBehavior(context, dataChannel, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void monitorBroadcastClicked(long j) {
        this.LL.monitorBroadcastClicked(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void monitorBroadcastMonitor(long j, boolean z) {
        this.LL.monitorBroadcastMonitor(j, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void monitorGiftIconShow(DataChannel dataChannel, boolean z, EnumC1090760eUU enumC1090760eUU, String str, String str2, int i) {
        this.LL.monitorGiftIconShow(dataChannel, z, enumC1090760eUU, str, str2, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void notifyUserLeaveRoom() {
        this.LL.notifyUserLeaveRoom();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onLiveActivityDestroyed() {
        this.LL.onLiveActivityDestroyed();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onLiveBroadcastActivityDestroyed() {
        this.LL.onLiveBroadcastActivityDestroyed();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onLocaleChanged(Locale locale) {
        this.LL.onLocaleChanged(locale);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onPlayFragmentCreate(Context context) {
        this.LL.onPlayFragmentCreate(context);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onSeiUpdate(Object obj) {
        this.LL.onSeiUpdate(obj);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialog(String str) {
        this.LL.openGiftDialog(str);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialog(String str, long j, long j2, String str2) {
        this.LL.openGiftDialog(str, j, j2, str2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialog(String str, C1129740fVM c1129740fVM) {
        this.LL.openGiftDialog(str, c1129740fVM);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialogFromJSB(C1120640fGg c1120640fGg) {
        this.LL.openGiftDialogFromJSB(c1120640fGg);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialogFromNative(DataChannel dataChannel, C1121570fIB c1121570fIB) {
        this.LL.openGiftDialogFromNative(dataChannel, c1121570fIB);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftMessageRightTagPage(Context context, GiftMessage giftMessage, Room room) {
        this.LL.openGiftMessageRightTagPage(context, giftMessage, room);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftSetting(FragmentManager fragmentManager, C1096780eeC c1096780eeC) {
        this.LL.openGiftSetting(fragmentManager, c1096780eeC);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void pinGoal(PinRequestParams pinRequestParams) {
        this.LL.pinGoal(pinRequestParams);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void preloadBroadcastApi() {
        this.LL.preloadBroadcastApi();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void preloadGiftTabs(int i) {
        this.LL.preloadGiftTabs(i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void preloadLayout() {
        this.LL.preloadLayout();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC773910UXl provideInteractionView(LifecycleOwner lifecycleOwner) {
        return this.LL.provideInteractionView(lifecycleOwner);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC773910UXl provideSuperFanTreasureBoxView(LifecycleOwner lifecycleOwner) {
        return this.LL.provideSuperFanTreasureBoxView(lifecycleOwner);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC773910UXl provideViewerWishesIconForInteractionPanel() {
        return this.LL.provideViewerWishesIconForInteractionPanel();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void registerLiveGoalBehavior() {
        this.LL.registerLiveGoalBehavior();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void removeAnimationEngine(EnumC1133020fae enumC1133020fae) {
        this.LL.removeAnimationEngine(enumC1133020fae);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void removeEffectPreloadCallback() {
        this.LL.removeEffectPreloadCallback();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void reportCrossScreenSeiWrite(CrossScreenSeiInfo crossScreenSeiInfo, long j, boolean z) {
        this.LL.reportCrossScreenSeiWrite(crossScreenSeiInfo, j, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void resetGiftInfo(long j, long j2, DataChannel dataChannel) {
        this.LL.resetGiftInfo(j, j2, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void resetPinCardStatus() {
        this.LL.resetPinCardStatus();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void resetRoomStatus(boolean z) {
        this.LL.resetRoomStatus(z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void saveViewerWishesItems(C1AII c1aii) {
        this.LL.saveViewerWishesItems(c1aii);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendExclusiveShowRedDotEvent(DataChannel dataChannel) {
        this.LL.sendExclusiveShowRedDotEvent(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendFansClubJoinGift(DataChannel dataChannel, InterfaceC1125350fOH interfaceC1125350fOH, String str, String str2, int i, Map<String, ? extends Object> map, Integer num) {
        this.LL.sendFansClubJoinGift(dataChannel, interfaceC1125350fOH, str, str2, i, map, num);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendGiftForBecomeGuest(long j, Room room, DataChannel dataChannel) {
        this.LL.sendGiftForBecomeGuest(j, room, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendGiftFromIncentivePage(DataChannel dataChannel, String str, long j, InterfaceC1125350fOH interfaceC1125350fOH) {
        this.LL.sendGiftFromIncentivePage(dataChannel, str, j, interfaceC1125350fOH);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendGiftInternal(Context context, C1129400fUo c1129400fUo) {
        this.LL.sendGiftInternal(context, c1129400fUo);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendGiftPoll(long j, long j2, Room room, DataChannel dataChannel, InterfaceC1125320fOE interfaceC1125320fOE) {
        this.LL.sendGiftPoll(j, j2, room, dataChannel, interfaceC1125320fOE);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendIncentiveGift(C1129950fVh c1129950fVh, DataChannel dataChannel) {
        this.LL.sendIncentiveGift(c1129950fVh, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendPtyFeature2(String str) {
        this.LL.sendPtyFeature2(str);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void setFirstRechargePendingOpenDialogEvent(C1121570fIB c1121570fIB) {
        this.LL.setFirstRechargePendingOpenDialogEvent(c1121570fIB);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void setGiftAnimationEngine(EnumC1133020fae enumC1133020fae, InterfaceC1133090fal interfaceC1133090fal) {
        this.LL.setGiftAnimationEngine(enumC1133020fae, interfaceC1133090fal);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean shouldForceInsertLevelUpGift() {
        return this.LL.shouldForceInsertLevelUpGift();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean shouldShowCPCMessageFromService() {
        return this.LL.shouldShowCPCMessageFromService();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean shouldShowPostRechargeRetentionSheet(C1124340fMe c1124340fMe, long j, int i) {
        return this.LL.shouldShowPostRechargeRetentionSheet(c1124340fMe, j, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void showBroadCaseEndPage(boolean z) {
        this.LL.showBroadCaseEndPage(z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void showGiftBannedPopup(Context context, boolean z) {
        this.LL.showGiftBannedPopup(context, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean showOnPublicScreen(GiftMessage giftMessage) {
        return this.LL.showOnPublicScreen(giftMessage);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void showViewerWishesSettingPage(DataChannel dataChannel, C1AI6 c1ai6, boolean z) {
        this.LL.showViewerWishesSettingPage(dataChannel, c1ai6, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void switchGiftIconBySkinId(long j, long j2) {
        this.LL.switchGiftIconBySkinId(j, j2);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void syncAssetList(int i, ArrayList<Long> arrayList, InterfaceC1133140faq interfaceC1133140faq) {
        this.LL.syncAssetList(i, arrayList, interfaceC1133140faq);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void syncGiftList(int i) {
        this.LL.syncGiftList(i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void syncGiftList(AbstractC1132980faa abstractC1132980faa, long j, int i, boolean z) {
        this.LL.syncGiftList(abstractC1132980faa, j, i, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void toggleGiftBehavior(Context context, DataChannel dataChannel, boolean z) {
        this.LL.toggleGiftBehavior(context, dataChannel, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void updateGiftStickerEffectComposer(InterfaceC1137650fi7 interfaceC1137650fi7) {
        this.LL.updateGiftStickerEffectComposer(interfaceC1137650fi7);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void updateSettingSwitch(Context context, C1117630fBp c1117630fBp, InterfaceC1118110fCb interfaceC1118110fCb) {
        this.LL.updateSettingSwitch(context, c1117630fBp, interfaceC1118110fCb);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
