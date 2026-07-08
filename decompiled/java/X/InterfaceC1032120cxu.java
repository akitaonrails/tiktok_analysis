package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.google.gson.k;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1032120cxu extends Serializable, InterfaceC1032940czE, InterfaceC1032830cz3 {
    void addOverlayViewIfNeed(String str, boolean z);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void addVideoWaterMarker(Object obj, ViewGroup viewGroup);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void didExit(C1033020czM c1033020czM);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void distributeRewards();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void exit();

    C1031810cxP getAdConfig();

    ViewGroup getBottomInteractView();

    Map<String, Object> getCarouselAdExtraParams();

    Double getCloseButtonDelaySeconds();

    int getCurrentAdLoopTimes();

    boolean getCurrentRewardResume();

    HashMap<String, Object> getCustomAdExtraDataParams();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ InterfaceC1032290cyB getCustomAdVideo();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ InterfaceC1032380cyK getGpMiniCardManager();

    @Override // X.InterfaceC1033000czK
    /* synthetic */ Gson getGson();

    Object getHostModel();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ InterfaceC1032330cyF getHostUtils();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ Object getHybridConfig(Object obj, Context context);

    View getInteractContainerView(String str);

    Long getInterstitialCloseDuration();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ InterfaceC1032240cy6 getLandingPageManager();

    List<HashMap<String, Object>> getLatestPrefetchParams();

    int getLoopTimesForCid(String str);

    Object getNextHostModel();

    GmtRewardAdModel getNextRewardAdModel();

    InterfaceC1033100czU getPreRequestManager();

    List<Object> getPreviousHostModels();

    int getRewardAdDataStatus();

    boolean getRewardAdHasShow();

    GmtRewardAdModel getRewardAdModel();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ InterfaceC1032210cy3 getRewardAnoleModule(Context context, InterfaceC1032120cxu interfaceC1032120cxu, ViewGroup viewGroup, InterfaceC1032280cyA interfaceC1032280cyA, InterfaceC1016100cY4 interfaceC1016100cY4);

    AbstractC1032220cy4 getState();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void handleTap(Context context, Map<EnumC1005430cGr, ? extends Object> map, Object obj);

    @Override // X.InterfaceC1033000czK
    /* synthetic */ void incentiveAdPreloadData(Object obj);

    void increaseCurrentAdLoopTimes();

    void increaseLoopTimesForCid(String str);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void jumpRoute(Context context, C1016240cYI c1016240cYI, Object obj);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void loadDataSuccess(List<Object> list);

    boolean markCurrentAdShowIfNeeded();

    void notifyBusinessUpdateBubbleTip();

    boolean notifyContainerEvent(AbstractC1016110cY5 abstractC1016110cY5);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void onAdSelected(Object obj);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void onRewardAdDataReady();

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void onRewardAdPause(Integer num);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void onRewardAdResume(Integer num);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void onRewardAdShow(Integer num);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void onRewardCountdownFinished();

    @Override // X.InterfaceC1033000czK
    /* synthetic */ Object parsingHostModel(k kVar);

    void registerAdContainerDelegate(InterfaceC1032870cz7 interfaceC1032870cz7);

    void registerStateChangeListener(InterfaceC1032710cyr interfaceC1032710cyr);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void report(Context context, Object obj);

    @Override // X.InterfaceC1033000czK
    /* synthetic */ void request(EnumC1033600d0I enumC1033600d0I, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033390czx, Unit> function1);

    void reset();

    Object searchHostModelByCid(String str);

    void setRewardAdDataStatus(EnumC993300bxI enumC993300bxI);

    boolean shouldDirectOpenLandingPage();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void showToast(Context context);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void skipRewardAdWatchDuration(int i);

    boolean switchNextAdByCid(String str, Function1<? super Boolean, Unit> function1);

    boolean switchNextAdByOneToN();

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void track3rdPartyURL(C1031380cwi c1031380cwi, Object obj);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void trackEvent(C1031480cws c1031480cws, Object obj);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void trackEventFromJSB(C1031480cws c1031480cws, Object obj);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void trackOMSDK(AbstractC1892207b6 abstractC1892207b6, Object obj, Context context);

    @Override // X.InterfaceC1032830cz3
    /* synthetic */ void trackUserEvent(String str, JSONObject jSONObject);

    void unregisterAdContainerDelegate();

    void unregisterStateChangeListener(InterfaceC1032710cyr interfaceC1032710cyr);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void updateBubbleTip(String str);

    void updateState(AbstractC1032220cy4 abstractC1032220cy4);

    void videoPlayFailed();

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void videoPlayStateDidChange(EnumC1031610cx5 enumC1031610cx5, int i);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void viewDidLoad(ViewGroup viewGroup, Fragment fragment);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void willExit(Context context);
}
