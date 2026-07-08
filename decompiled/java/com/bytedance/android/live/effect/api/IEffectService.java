package com.bytedance.android.live.effect.api;

import X.C006A;
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
import X.InterfaceC1294060jmO;
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
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public interface IEffectService extends C006A {
    void applyBackgroundEffect(DataChannel dataChannel, Context context, String str);

    InterfaceC769000UEo baseComposerManager();

    @InterfaceC1294060jmO
    void cleanEffectCache();

    void clearEffectAesCache();

    void clearFontEffectPlatformCache();

    void clearModelConfigArbiterCache();

    void clearStickerViewModelCache();

    @InterfaceC1294060jmO
    InterfaceC932350aMz composerManager();

    C0U78 composerManagerB();

    void continuePlayBGM(DataChannel dataChannel);

    LiveEffect convertStickerBean(Effect effect);

    InterfaceC932350aMz createComposerManager();

    C0U78 createComposerManagerB();

    LiveEffect createEffectByType(EnumC767550U8z enumC767550U8z);

    C0UAL createMagicGestureEffectAnchorHelper(DataChannel dataChannel, View view, InterfaceC768780UDs interfaceC768780UDs);

    C0UAG createMagicGestureEffectAudienceHelper(ViewGroup viewGroup, Function0<Pair<? extends Integer, ? extends Integer>> function0);

    void destroyEffectPalletHandler();

    boolean effectUsedOnMultiGuestScene(String str);

    void fetchAndDownloadEffectList(LifecycleOwner lifecycleOwner, List<String> list, Map<String, String> map, Function1<? super List<? extends Effect>, Unit> function1);

    void fetchRewardEffects(DataChannel dataChannel, Function1<C767500U8u, Unit> function1);

    void fetchTargetMusic(Long l, WeakReference<Function2<Long, String, Unit>> weakReference);

    void forceRefreshC2PAWhenResumeLive(Long l);

    void getAnchorEffectByResourceId(LifecycleOwner lifecycleOwner, String str, Function1<LiveEffect, Unit> function1);

    EnumC771230UNd getBeautyStatus();

    InterfaceC1814530xJr getBoardsDisplayStateManager();

    InterfaceC769240UFm getComposerFilterSlideHelper();

    C0UG9 getComposerHandler(C0UJY c0ujy);

    LiveEffect getCurrentBgEffect();

    C0UG9 getDefaultComposerHandler(InterfaceC1268640j7O interfaceC1268640j7O, String str);

    C0UA9 getEcEffectHelper();

    InterfaceC1728700v5Q getEcExternalEffectHelper();

    InterfaceC390601fU getEffectBoardService(String str, String str2);

    C0UAH getEffectControlMessageHelper();

    C0UAI getEffectMessageHandler();

    C0UUE getEffectStatus();

    LiveDialogFragment getEnhanceDialogFragment(Context context, DataChannel dataChannel);

    C0UAN getH5EventStickerManager();

    C0KWW getHostToolsUtil();

    InterfaceC769090UEx getInsertStickerManager();

    InterfaceC765730U1z getKaraokeModule();

    LiveDialogFragment getLiveBGMDialog();

    LiveWidget getLiveBGMMiniWidget(Function1 function1, Function1 function12);

    InterfaceC769210UFj getLiveBeautyLogManager();

    LiveDialogFragment getLiveBgDialogFragment(Context context, DataChannel dataChannel, String str, C0U58 c0u58, InterfaceC767730U9r interfaceC767730U9r, View.OnClickListener onClickListener, C0U59 c0u59, String str2, Boolean bool);

    InterfaceC456501q7 getLiveBoardsEffectHelper();

    InterfaceC767240U7u getLiveComposerFilterHelper();

    InterfaceC767150U7l<LiveEffect> getLiveComposerFilterManager();

    C0UEA getLiveEffectController();

    C0U40 getLiveEffectDataProvider();

    C0UAF getLiveEffectHelper();

    InterfaceC768930UEh getLiveEffectPalletHandler(WeakReference<DataChannel> weakReference, WeakReference<Fragment> weakReference2, C0UCY c0ucy);

    InterfaceC20340914iV getLiveEffectPreviewHelper(ViewGroup viewGroup, SurfaceView surfaceView);

    C0UAJ getLiveEffectRemoveList();

    C0U7A getLiveEffectRestoreManager();

    InterfaceC767160U7m getLiveFilterLogManager();

    C0JFD getLiveGameEffectHelper();

    C0UAE getLiveGoalAreaHelper();

    LiveDialogFragment getLiveGoalBackgroundDialogFragment(JSONObject jSONObject, VideoSize videoSize);

    C0U6C getLiveGoalEffectHelper();

    LiveWidget getLiveGoalEffectWidget();

    C0UAK getLiveGoalLogHelper();

    void getLiveMultiGuestEffectByResourceId(LifecycleOwner lifecycleOwner, String str, Function1<LiveEffect, Unit> function1);

    C0UEY getLiveMultiGuestStickerLogManager();

    LiveDialogFragment getLiveMusicDialog();

    LiveDialogFragment getLiveSoundEffectDialog();

    LiveWidget getLiveSoundEffectMiniWidget(Function1 function1, Function1 function12);

    InterfaceC771640UOs getLiveStickerLogManager();

    LiveWidget getLiveStickerShortCutWidget(Function1 function1, Function1 function12);

    C0UGQ getLiveTouchEventEffect();

    LiveDialogFragment getLiveVoiceEffectDialog();

    InterfaceC761840TuY getLiveVoiceEffectHelper();

    C0UAA getMultiGuestBeautyLogManager();

    BaseFragment getMultiGuestEffectFragment(C0U78 c0u78, InterfaceC766830U6f interfaceC766830U6f);

    View getMultiGuestFullStickerListView(Fragment fragment, ViewGroup viewGroup, int i, InterfaceC1268640j7O interfaceC1268640j7O, InterfaceC769000UEo interfaceC769000UEo, C767820UAa c767820UAa);

    View getMultiGuestStickerListView(Fragment fragment, ViewGroup viewGroup, int i, InterfaceC1268640j7O interfaceC1268640j7O, InterfaceC769000UEo interfaceC769000UEo, C0U96 c0u96);

    InterfaceC768520UCs getPreviewableEffectPanel(String str, String str2, String str3, String str4, String str5);

    C0U58 getSoloBgEffectLogManager();

    ArrayList<InterfaceC345370DgN> getStorageList();

    C0UAM getUploadEffectRelatedLog();

    C0UUE getVoiceEffectStatus();

    Boolean hasUsedAccompanimentBusiness();

    Boolean hasUsedBGMFunction();

    boolean isAccompanimentPlaying();

    Boolean isBGMPlaying();

    boolean isLastUsedSticker(LiveEffect liveEffect);

    boolean isStickerPanelOpen();

    boolean isUsingAccompanimentBusiness();

    Boolean isUsingBGMFunction();

    boolean isWearSpecialEffect(List<String> list);

    void onEndBroadcast();

    void onEnterBroadcastPreview();

    void onGoLive();

    /* bridge */ /* synthetic */ void onInit();

    void onLeavePreview();

    void onLiveCreate();

    void onLiveDestroy();

    void onStreamStart();

    void openEnhanceDialog(DataChannel dataChannel, Context context);

    void openMusicDialog(DataChannel dataChannel, Long l);

    void openSingleToolSelectorDialog(FragmentManager fragmentManager, C0UA2 c0ua2);

    void openSoundEffectDialog(DataChannel dataChannel);

    void openVoiceEffectDialog(DataChannel dataChannel, String str);

    void pauseAccompanimentPlay(Boolean bool);

    void pauseBGM(Boolean bool);

    void preloadAccompanimentList();

    void preloadBroadcastApi();

    void preloadLinkMicEffectSmallModel();

    void preloadMultiGuestEffects(DataChannel dataChannel, int i);

    void prepareEndBGM();

    void releaseAccompanimentResources(boolean z, boolean z2);

    void releaseBGMPlayerManager(boolean z, boolean z2);

    void releaseBgApplyManager();

    void releaseBgPanelResource();

    void releaseNaviAvatarResources();

    void releasePanelResource(boolean z);

    void releasePanelResourceInCritical(boolean z);

    void releaseResourceInBackground();

    void removeSoloBgEffect(DataChannel dataChannel);

    void reportClickSoundEffectIconLog(DataChannel dataChannel);

    void reportUseC2PAPicture(Long l, String str, String str2, LifecycleOwner lifecycleOwner, Boolean bool);

    void restoreMultiGuestEffectToLiveCoreForGuest(LifecycleCoroutineScope lifecycleCoroutineScope, C0U78 c0u78);

    void resumeAccompanimentPlay();

    void resumeBGM();

    void selectSoundEffectAfterGameLiveResume();

    void showBackgroundPanel(Context context, DataChannel dataChannel, InterfaceC767730U9r interfaceC767730U9r);

    void showEffectTextInputDialog(DataChannel dataChannel, C762040Tus c762040Tus, Function1<Boolean, Unit> function1);

    void showStickerPanel(Context context, DataChannel dataChannel, boolean z, InterfaceC767730U9r interfaceC767730U9r, boolean z2, boolean z3, boolean z4, Map<String, String> map);

    InterfaceC769780UHo stickerPresenter();

    void tryRestoreLastUsedSticker(InterfaceC767730U9r interfaceC767730U9r);

    void updateGallerySticker(String str, String str2);

    boolean usingSlideGestureEffect();

    boolean usingVoiceEffect();
}
