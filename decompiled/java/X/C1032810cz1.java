package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.OpenLandingPageConfigModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032810cz1 implements InterfaceC1032100cxs, InterfaceC1031540cwy {
    public static final C1033470d05 Companion = new Object() { // from class: X.0d05
    };
    public final C1031810cxP LL;
    public final InterfaceC1032840cz4 LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Object LLIZ;
    public RewardAdModel LLIZLLLIL;
    public InterfaceC1033010czL LLJ;
    public final InterfaceC1032940czE delegate;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(219));
    public final HashMap<String, Object> LLJI = new HashMap<>();
    public final List<InterfaceC1031950cxd> LLJIJIL = new ArrayList();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(220));
    public AbstractC1031660cxA LLJILJILJ = C1031880cxW.LIZ;

    @Override // X.InterfaceC1032100cxs
    public boolean isInterstitialAd() {
        return false;
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void onRewardCountdownFinished() {
    }

    @Override // X.InterfaceC1032100cxs
    public void setAdID(String str) {
    }

    @Override // X.InterfaceC1032100cxs
    public void setVideoDuration(long j) {
    }

    @Override // X.InterfaceC1032100cxs
    public void setVideoPosition(long j) {
    }

    @Override // X.InterfaceC1032100cxs
    public void startByCacheKey(Context context, String str) {
    }

    @Override // X.InterfaceC1031540cwy
    public void unregisterAdContainerDelegate() {
        this.LLJ = null;
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void updateBubbleTip(String str) {
    }

    @Override // X.InterfaceC1032100cxs
    public void watchNext(HashMap<String, Object> map, HashMap<String, String> map2, HashMap<String, Object> map3, List<? extends HashMap<String, Object>> list) {
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void distributeRewards() {
        this.delegate.distributeRewards();
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void exit() {
        this.LLILLJJLI.exit();
    }

    @Override // X.InterfaceC1032100cxs
    public String getAdID() {
        AwemeRawAd awemeRawAd;
        Long adId;
        RewardAdModel rewardAdModel = this.LLIZLLLIL;
        if (rewardAdModel == null || (awemeRawAd = rewardAdModel.awemeRawAd) == null || (adId = awemeRawAd.getAdId()) == null) {
            return null;
        }
        return adId.toString();
    }

    @Override // X.InterfaceC1031540cwy
    public ViewGroup getBottomInteractView() {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            return interfaceC1033010czL.getBottomInteractView();
        }
        return null;
    }

    @Override // X.InterfaceC1031540cwy
    public HashMap<String, Object> getCustomAdExtraDataParams() {
        HashMap<String, Object> map = new HashMap<>();
        map.putAll(this.LLJI);
        map.put("is_pre_request", Integer.valueOf(this.LLILLL ? 1 : 0));
        return map;
    }

    public final C1033020czM getExitInfo() {
        return (C1033020czM) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public InterfaceC1031720cxG getGpMiniCardManager() {
        return this.LLILLJJLI.getGpMiniCardManager();
    }

    @Override // X.InterfaceC1032100cxs
    public long getVideoDuration() {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            return interfaceC1033010czL.getVideoDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC1032100cxs
    public long getVideoPosition() {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            return interfaceC1033010czL.getVideoPosition();
        }
        return 0L;
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void onRewardAdDataReady() {
        this.delegate.onRewardAdDataReady();
    }

    @Override // X.InterfaceC1032100cxs
    public void pause() {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            interfaceC1033010czL.pause(null);
        }
    }

    @Override // X.InterfaceC1032100cxs
    public void resume() {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            interfaceC1033010czL.resume();
        }
    }

    @Override // X.InterfaceC1031540cwy
    public boolean shouldDirectOpenLandingPage() {
        String str;
        AwemeRawAd awemeRawAd;
        OpenLandingPageConfigModel openLandingPageConfigModel;
        AwemeRawAd awemeRawAd2;
        RewardAdModel rewardAdModel = this.LLIZLLLIL;
        if (rewardAdModel != null && (awemeRawAd2 = rewardAdModel.awemeRawAd) != null && awemeRawAd2.isOpenSystemBrowser()) {
            return false;
        }
        RewardAdModel rewardAdModel2 = this.LLIZLLLIL;
        if (rewardAdModel2 == null || (awemeRawAd = rewardAdModel2.awemeRawAd) == null) {
            str = null;
        } else {
            AdStyleActionModel adStyleActionModel = awemeRawAd.getAdStyleActionModel();
            if (adStyleActionModel == null || (openLandingPageConfigModel = adStyleActionModel.openLandingPageConfig) == null || (str = openLandingPageConfigModel.openType) == null) {
                str = "default";
            }
        }
        return Intrinsics.LJFF(String.valueOf(str), EnumC1031620cx6.DIRECT.getValue());
    }

    @Override // X.InterfaceC1031540cwy
    public void videoPlayFailed() {
        LIZIZ(new C1032950czF(C1033160cza.LIZ));
    }

    @Override // X.InterfaceC1032100cxs
    public void reportSuccess() {
        taskCompleted(false, getCustomAdExtraDataParams(), null);
        C786410Ut5.LJLIIL(2000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 66));
    }

    @Override // X.InterfaceC1031540cwy
    public C1031810cxP getAdConfig() {
        return this.LL;
    }

    @Override // X.InterfaceC1031540cwy
    public boolean getCurrentRewardResume() {
        return this.LLILZ;
    }

    public final InterfaceC1032840cz4 getHostDelegate() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1031540cwy
    public Object getHostModel() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1031540cwy
    public RewardAdModel getRewardAdModel() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1032100cxs
    public EnumC1032860cz6 getSceneType() {
        return EnumC1032860cz6.NORMAL;
    }

    @Override // X.InterfaceC1031540cwy
    public AbstractC1031660cxA getState() {
        return this.LLJILJILJ;
    }

    public final boolean isPreload() {
        return this.LLILLL;
    }

    public final void LIZ(boolean z) {
        InterfaceC1031910cxZ interfaceC1031910cxZO1;
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null && (interfaceC1031910cxZO1 = interfaceC1033010czL.O1()) != null) {
            if (z) {
                interfaceC1031910cxZO1.start();
            } else {
                interfaceC1031910cxZO1.stop();
            }
        }
    }

    public final void LIZIZ(AbstractC1031660cxA abstractC1031660cxA) {
        this.LLJILJILJ = abstractC1031660cxA;
        Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1031950cxd) it2.next()).We(abstractC1031660cxA);
        }
        if (abstractC1031660cxA instanceof C1032950czF) {
            exit(false);
            this.LLILLJJLI.showToast(this.LL.LIZLLL);
        } else {
            if (!(abstractC1031660cxA instanceof C1031870cxV)) {
                return;
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 67));
        }
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void didExit(C1033020czM c1033020czM) {
        this.delegate.didExit(c1033020czM);
    }

    @Override // X.InterfaceC1032100cxs
    public void exit(boolean z) {
        C1031870cxV c1031870cxV = C1031870cxV.LIZ;
        LIZIZ(c1031870cxV);
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            interfaceC1033010czL.LLZLLLL(z);
        }
        if (this.LLILZIL && Intrinsics.LJFF(this.LLJILJILJ, c1031870cxV)) {
            this.LLILLJJLI.exit();
            this.LLJI.clear();
        }
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void loadDataSuccess(Object obj) {
        this.LLILLJJLI.loadDataSuccess(obj);
    }

    @Override // X.InterfaceC1032100cxs
    public void onHandleTapFinished(String str) {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            interfaceC1033010czL.onHandleTapFinished(str);
        }
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void onRewardAdPause(Integer num) {
        this.LLILZ = false;
        this.delegate.onRewardAdPause(null);
        LIZ(false);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void onRewardAdResume(Integer num) {
        this.LLILZ = true;
        this.delegate.onRewardAdResume(null);
        LIZ(true);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void onRewardAdShow(Integer num) {
        this.LLILZ = true;
        this.delegate.onRewardAdShow(null);
        LIZ(true);
    }

    @Override // X.InterfaceC1031540cwy
    public void registerAdContainerDelegate(InterfaceC1033010czL interfaceC1033010czL) {
        this.LLJ = interfaceC1033010czL;
    }

    @Override // X.InterfaceC1031540cwy
    public void registerStateChangeListener(InterfaceC1031950cxd interfaceC1031950cxd) {
        ((ArrayList) this.LLJIJIL).add(interfaceC1031950cxd);
    }

    public final void setHostModel(Object obj) {
        this.LLIZ = obj;
    }

    public final void setPreload(boolean z) {
        this.LLILLL = z;
    }

    public final void setRewardAdModel(RewardAdModel rewardAdModel) {
        this.LLIZLLLIL = rewardAdModel;
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void showToast(Context context) {
        this.LLILLJJLI.showToast(context);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void skipRewardAdWatchDuration(int i) {
        this.delegate.skipRewardAdWatchDuration(i);
    }

    @Override // X.InterfaceC1031540cwy
    public void unregisterStateChangeListener(InterfaceC1031950cxd interfaceC1031950cxd) {
        ((ArrayList) this.LLJIJIL).remove(interfaceC1031950cxd);
    }

    @Override // X.InterfaceC1031540cwy
    public void updateState(AbstractC1031660cxA abstractC1031660cxA) {
        LIZIZ(abstractC1031660cxA);
        if (!(abstractC1031660cxA instanceof C1032950czF)) {
            return;
        }
        C1032950czF c1032950czF = (C1032950czF) abstractC1031660cxA;
        AbstractC1033120czW abstractC1033120czW = c1032950czF.LIZ;
        if (abstractC1033120czW instanceof C1033160cza) {
            getExitInfo().LIZ = 5;
            getExitInfo().LIZIZ = c1032950czF.LIZ.LIZ();
        } else {
            if (abstractC1033120czW instanceof C1032970czH) {
                C1032970czH c1032970czH = (C1032970czH) abstractC1033120czW;
                getExitInfo().LIZ = c1032970czH.LIZ.LIZ();
                getExitInfo().LIZIZ = c1032970czH.LIZ.LIZIZ();
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void willExit(Context context) {
        if (this.LL.LIZJ) {
            this.delegate.willExit(context);
        } else {
            exit(true);
        }
    }

    @Override // X.InterfaceC1031540cwy
    public void addOverlayViewIfNeed(String str, boolean z) {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            interfaceC1033010czL.addOverlayViewIfNeed(str, z);
        }
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public C1008080cL8 getHybridConfig(Object obj, Context context) {
        return this.LLILLJJLI.getHybridConfig(obj, context);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void report(Context context, Object obj) {
        this.LLILLJJLI.report(context, obj);
    }

    @Override // X.InterfaceC1031540cwy
    public void showOrHideViewWithAnim(boolean z, AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel) {
        InterfaceC1033010czL interfaceC1033010czL = this.LLJ;
        if (interfaceC1033010czL != null) {
            interfaceC1033010czL.showOrHideViewWithAnim(z, anoleComponentBusinessAppearModel);
        }
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void track3rdPartyURL(C1031370cwh c1031370cwh, Object obj) {
        this.LLILLJJLI.track3rdPartyURL(c1031370cwh, obj);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void trackEvent(C1031310cwb c1031310cwb, Object obj) {
        this.LLILLJJLI.trackEvent(c1031310cwb, obj);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void trackUserEvent(String str, JSONObject jSONObject) {
        this.LLILLJJLI.trackUserEvent(str, jSONObject);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void videoPlayStateDidChange(EnumC1031610cx5 enumC1031610cx5, int i) {
        this.delegate.videoPlayStateDidChange(enumC1031610cx5, i);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032940czE
    public void viewDidLoad(ViewGroup viewGroup, Fragment fragment) {
        this.delegate.viewDidLoad(viewGroup, fragment);
    }

    public C1032810cz1(C1031810cxP c1031810cxP, InterfaceC1032940czE interfaceC1032940czE, InterfaceC1032840cz4 interfaceC1032840cz4) {
        this.LL = c1031810cxP;
        this.delegate = interfaceC1032940czE;
        this.LLILLJJLI = interfaceC1032840cz4;
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void handleTap(Context context, Map<EnumC1005420cGq, ? extends Object> map, Object obj) {
        this.LLILLJJLI.handleTap(context, map, obj);
    }

    @Override // X.InterfaceC1032100cxs
    public void taskCompleted(boolean z, HashMap<String, Object> map, C1032720cys c1032720cys) {
        String str;
        this.LLILZIL = true;
        if (z) {
            getExitInfo().LIZ = 0;
            getExitInfo().LIZIZ = "";
            getExitInfo().LIZJ = true;
        }
        Object hostModel = getHostModel();
        if (hostModel != null) {
            if (z) {
                str = "adtask_finish";
            } else {
                str = "adtask_finish_fail";
            }
            HashMap<String, Object> customAdExtraDataParams = getCustomAdExtraDataParams();
            if (map != null && !map.isEmpty()) {
                customAdExtraDataParams.putAll(map);
            }
            trackEvent(new C1031310cwb(str, customAdExtraDataParams, 4), hostModel);
        }
        if (this.LLILZIL && Intrinsics.LJFF(this.LLJILJILJ, C1031870cxV.LIZ)) {
            this.LLILLJJLI.exit();
            this.LLJI.clear();
        }
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1032840cz4
    public void trackOMSDK(AbstractC1891907b3 abstractC1891907b3, Object obj, Context context) {
        this.LLILLJJLI.trackOMSDK(abstractC1891907b3, obj, context);
    }

    @Override // X.InterfaceC1031540cwy, X.InterfaceC1033030czN
    public void request(EnumC1033610d0J enumC1033610d0J, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033380czw, Unit> function1) {
        this.LLILLJJLI.request(enumC1033610d0J, str, map, map2, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0289 A[PHI: r2
      0x0289: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v10 java.lang.String) binds: [B:133:0x0285, B:44:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    @Override // X.InterfaceC1032100cxs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void start(boolean r25, java.util.HashMap<java.lang.String, java.lang.Object> r26, java.util.HashMap<java.lang.String, java.lang.String> r27, java.util.HashMap<java.lang.String, java.lang.Object> r28, java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.Object>> r29) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1032810cz1.start(boolean, java.util.HashMap, java.util.HashMap, java.util.HashMap, java.util.List):void");
    }
}
