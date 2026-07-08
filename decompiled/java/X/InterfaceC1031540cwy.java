package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1031540cwy extends Serializable, InterfaceC1032940czE, InterfaceC1032840cz4 {
    void addOverlayViewIfNeed(String str, boolean z);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void didExit(C1033020czM c1033020czM);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void distributeRewards();

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void exit();

    C1031810cxP getAdConfig();

    ViewGroup getBottomInteractView();

    boolean getCurrentRewardResume();

    HashMap<String, Object> getCustomAdExtraDataParams();

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ InterfaceC1031720cxG getGpMiniCardManager();

    Object getHostModel();

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ C1008080cL8 getHybridConfig(Object obj, Context context);

    RewardAdModel getRewardAdModel();

    AbstractC1031660cxA getState();

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void handleTap(Context context, Map<EnumC1005420cGq, ? extends Object> map, Object obj);

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void loadDataSuccess(Object obj);

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

    void registerAdContainerDelegate(InterfaceC1033010czL interfaceC1033010czL);

    void registerStateChangeListener(InterfaceC1031950cxd interfaceC1031950cxd);

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void report(Context context, Object obj);

    @Override // X.InterfaceC1033030czN
    /* synthetic */ void request(EnumC1033610d0J enumC1033610d0J, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033380czw, Unit> function1);

    boolean shouldDirectOpenLandingPage();

    void showOrHideViewWithAnim(boolean z, AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel);

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void showToast(Context context);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void skipRewardAdWatchDuration(int i);

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void track3rdPartyURL(C1031370cwh c1031370cwh, Object obj);

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void trackEvent(C1031310cwb c1031310cwb, Object obj);

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void trackOMSDK(AbstractC1891907b3 abstractC1891907b3, Object obj, Context context);

    @Override // X.InterfaceC1032840cz4
    /* synthetic */ void trackUserEvent(String str, JSONObject jSONObject);

    void unregisterAdContainerDelegate();

    void unregisterStateChangeListener(InterfaceC1031950cxd interfaceC1031950cxd);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void updateBubbleTip(String str);

    void updateState(AbstractC1031660cxA abstractC1031660cxA);

    void videoPlayFailed();

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void videoPlayStateDidChange(EnumC1031610cx5 enumC1031610cx5, int i);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void viewDidLoad(ViewGroup viewGroup, Fragment fragment);

    @Override // X.InterfaceC1032940czE
    /* synthetic */ void willExit(Context context);
}
