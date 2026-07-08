package com.bytedance.android.live.effect.api;

import X.C0JFD;
import X.C0KWW;
import X.C0U40;
import X.C0U58;
import X.C0U59;
import X.C0U6C;
import X.C0U78;
import X.C0U7A;
import X.C0U96;
import X.C0UA2;
import X.C0UA8;
import X.C0UA9;
import X.C0UAA;
import X.C0UAE;
import X.C0UAF;
import X.C0UAG;
import X.C0UAH;
import X.C0UAI;
import X.C0UAJ;
import X.C0UAK;
import X.C0UAL;
import X.C0UAM;
import X.C0UAN;
import X.C0UCY;
import X.C0UEA;
import X.C0UEY;
import X.C0UG9;
import X.C0UGQ;
import X.C0UJY;
import X.C0UUE;
import X.C762040Tus;
import X.C767500U8u;
import X.C767820UAa;
import X.EnumC767550U8z;
import X.EnumC771230UNd;
import X.InterfaceC1268640j7O;
import X.InterfaceC1728700v5Q;
import X.InterfaceC1814530xJr;
import X.InterfaceC20340914iV;
import X.InterfaceC345370DgN;
import X.InterfaceC390601fU;
import X.InterfaceC456501q7;
import X.InterfaceC761840TuY;
import X.InterfaceC765730U1z;
import X.InterfaceC766830U6f;
import X.InterfaceC767150U7l;
import X.InterfaceC767160U7m;
import X.InterfaceC767240U7u;
import X.InterfaceC767730U9r;
import X.InterfaceC768520UCs;
import X.InterfaceC768780UDs;
import X.InterfaceC768930UEh;
import X.InterfaceC769000UEo;
import X.InterfaceC769090UEx;
import X.InterfaceC769210UFj;
import X.InterfaceC769240UFm;
import X.InterfaceC769780UHo;
import X.InterfaceC771640UOs;
import X.InterfaceC932350aMz;
import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class EffectServiceDummy implements IEffectService {
    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void applyBackgroundEffect(DataChannel dataChannel, Context context, String str) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC769000UEo baseComposerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void cleanEffectCache() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ void clearEffectAesCache() {
        C0UA8.LIZ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ void clearFontEffectPlatformCache() {
        C0UA8.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ void clearModelConfigArbiterCache() {
        C0UA8.LIZJ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ void clearStickerViewModelCache() {
        C0UA8.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC932350aMz composerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0U78 composerManagerB() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void continuePlayBGM(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveEffect convertStickerBean(Effect effect) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC932350aMz createComposerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0U78 createComposerManagerB() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAL createMagicGestureEffectAnchorHelper(DataChannel dataChannel, View view, InterfaceC768780UDs interfaceC768780UDs) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAG createMagicGestureEffectAudienceHelper(ViewGroup viewGroup, Function0<Pair<? extends Integer, ? extends Integer>> function0) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void destroyEffectPalletHandler() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean effectUsedOnMultiGuestScene(String str) {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void fetchRewardEffects(DataChannel dataChannel, Function1<C767500U8u, Unit> function1) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void fetchTargetMusic(Long l, WeakReference<Function2<Long, String, Unit>> weakReference) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void forceRefreshC2PAWhenResumeLive(Long l) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void getAnchorEffectByResourceId(LifecycleOwner lifecycleOwner, String str, Function1<LiveEffect, Unit> function1) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public EnumC771230UNd getBeautyStatus() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC1814530xJr getBoardsDisplayStateManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC769240UFm getComposerFilterSlideHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UG9 getComposerHandler(C0UJY c0ujy) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveEffect getCurrentBgEffect() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UG9 getDefaultComposerHandler(InterfaceC1268640j7O interfaceC1268640j7O, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UA9 getEcEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC1728700v5Q getEcExternalEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC390601fU getEffectBoardService(String str, String str2) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAH getEffectControlMessageHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAI getEffectMessageHandler() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UUE getEffectStatus() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getEnhanceDialogFragment(Context context, DataChannel dataChannel) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAN getH5EventStickerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0KWW getHostToolsUtil() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC769090UEx getInsertStickerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC765730U1z getKaraokeModule() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveBGMDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveBGMMiniWidget(Function1 function1, Function1 function12) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC769210UFj getLiveBeautyLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveBgDialogFragment(Context context, DataChannel dataChannel, String str, C0U58 c0u58, InterfaceC767730U9r interfaceC767730U9r, View.OnClickListener onClickListener, C0U59 c0u59, String str2, Boolean bool) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC456501q7 getLiveBoardsEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC767240U7u getLiveComposerFilterHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC767150U7l<LiveEffect> getLiveComposerFilterManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UEA getLiveEffectController() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0U40 getLiveEffectDataProvider() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAF getLiveEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC768930UEh getLiveEffectPalletHandler(WeakReference<DataChannel> weakReference, WeakReference<Fragment> weakReference2, C0UCY c0ucy) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC20340914iV getLiveEffectPreviewHelper(ViewGroup viewGroup, SurfaceView surfaceView) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAJ getLiveEffectRemoveList() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0U7A getLiveEffectRestoreManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC767160U7m getLiveFilterLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0JFD getLiveGameEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAE getLiveGoalAreaHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveGoalBackgroundDialogFragment(JSONObject jSONObject, VideoSize videoSize) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0U6C getLiveGoalEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveGoalEffectWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAK getLiveGoalLogHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void getLiveMultiGuestEffectByResourceId(LifecycleOwner lifecycleOwner, String str, Function1<LiveEffect, Unit> function1) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UEY getLiveMultiGuestStickerLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveMusicDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveSoundEffectDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveSoundEffectMiniWidget(Function1 function1, Function1 function12) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC771640UOs getLiveStickerLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveStickerShortCutWidget(Function1 function1, Function1 function12) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UGQ getLiveTouchEventEffect() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveVoiceEffectDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC761840TuY getLiveVoiceEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public BaseFragment getMultiGuestEffectFragment(C0U78 c0u78, InterfaceC766830U6f interfaceC766830U6f) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public View getMultiGuestFullStickerListView(Fragment fragment, ViewGroup viewGroup, int i, InterfaceC1268640j7O interfaceC1268640j7O, InterfaceC769000UEo interfaceC769000UEo, C767820UAa c767820UAa) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public View getMultiGuestStickerListView(Fragment fragment, ViewGroup viewGroup, int i, InterfaceC1268640j7O interfaceC1268640j7O, InterfaceC769000UEo interfaceC769000UEo, C0U96 c0u96) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC768520UCs getPreviewableEffectPanel(String str, String str2, String str3, String str4, String str5) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0U58 getSoloBgEffectLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public ArrayList<InterfaceC345370DgN> getStorageList() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAM getUploadEffectRelatedLog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UUE getVoiceEffectStatus() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean hasUsedBGMFunction() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean isAccompanimentPlaying() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean isBGMPlaying() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean isLastUsedSticker(LiveEffect liveEffect) {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ boolean isStickerPanelOpen() {
        return C0UA8.LJIIIZ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean isUsingAccompanimentBusiness() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean isUsingBGMFunction() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean isWearSpecialEffect(List<String> list) {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onEndBroadcast() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onEnterBroadcastPreview() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ void onGoLive() {
        C0UA8.LJIIJ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onLeavePreview() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onLiveCreate() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onLiveDestroy() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onStreamStart() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void openEnhanceDialog(DataChannel dataChannel, Context context) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void openMusicDialog(DataChannel dataChannel, Long l) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void openSingleToolSelectorDialog(FragmentManager fragmentManager, C0UA2 c0ua2) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void openSoundEffectDialog(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void openVoiceEffectDialog(DataChannel dataChannel, String str) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void pauseAccompanimentPlay(Boolean bool) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void pauseBGM(Boolean bool) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadAccompanimentList() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadBroadcastApi() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadLinkMicEffectSmallModel() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadMultiGuestEffects(DataChannel dataChannel, int i) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void prepareEndBGM() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseAccompanimentResources(boolean z, boolean z2) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseBGMPlayerManager(boolean z, boolean z2) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseBgApplyManager() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseBgPanelResource() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseNaviAvatarResources() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releasePanelResource(boolean z) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releasePanelResourceInCritical(boolean z) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseResourceInBackground() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void removeSoloBgEffect(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void reportClickSoundEffectIconLog(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void reportUseC2PAPicture(Long l, String str, String str2, LifecycleOwner lifecycleOwner, Boolean bool) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void restoreMultiGuestEffectToLiveCoreForGuest(LifecycleCoroutineScope lifecycleCoroutineScope, C0U78 c0u78) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void resumeAccompanimentPlay() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void resumeBGM() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void selectSoundEffectAfterGameLiveResume() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void showBackgroundPanel(Context context, DataChannel dataChannel, InterfaceC767730U9r interfaceC767730U9r) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void showEffectTextInputDialog(DataChannel dataChannel, C762040Tus c762040Tus, Function1<Boolean, Unit> function1) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void showStickerPanel(Context context, DataChannel dataChannel, boolean z, InterfaceC767730U9r interfaceC767730U9r, boolean z2, boolean z3, boolean z4, Map<String, String> map) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC769780UHo stickerPresenter() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void tryRestoreLastUsedSticker(InterfaceC767730U9r interfaceC767730U9r) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void updateGallerySticker(String str, String str2) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean usingSlideGestureEffect() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean usingVoiceEffect() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0UAA getMultiGuestBeautyLogManager() {
        return C0UA8.LJIIIIZZ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean hasUsedAccompanimentBusiness() {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveEffect createEffectByType(EnumC767550U8z enumC767550U8z) {
        return new LiveEffectOld();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void fetchAndDownloadEffectList(LifecycleOwner lifecycleOwner, List<String> list, Map<String, String> map, Function1<? super List<? extends Effect>, Unit> function1) {
        function1.invoke(Collections.emptyList());
    }
}
