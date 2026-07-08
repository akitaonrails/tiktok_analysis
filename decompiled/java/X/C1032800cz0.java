package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS35S0110000_16;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdStyleActionModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.OpenLandingPageConfigModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.InterstitialAdInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.OneToNInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032800cz0 implements InterfaceC1032100cxs, InterfaceC1032120cxu {
    public static final C1033490d07 Companion = new Object() { // from class: X.0d07
    };
    public final C1031810cxP LL;
    public final InterfaceC1032940czE LLILLJJLI;
    public final InterfaceC1032830cz3 LLILLL;
    public final InterfaceC1032410cyN LLILZ;
    public boolean LLILZIL;
    public final InterfaceC1033100czU LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJILJIL;
    public InterfaceC1032870cz7 LLJILJILJ;
    public InterfaceC1032240cy6 LLJILLL;
    public List<? extends HashMap<String, Object>> LLJJIJIIJIL;
    public boolean LLJJJJ;
    public Double LLJJJJJIL;
    public AbstractC1032220cy4 LLJJJJLIIL;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(499));
    public final List<Object> LLJI = new ArrayList();
    public final List<GmtRewardAdModel> LLJIJIL = new ArrayList();
    public final HashMap<String, Object> LLJJ = new HashMap<>();
    public final Map<String, Integer> LLJJI = new LinkedHashMap();
    public final Set<String> LLJJIII = new LinkedHashSet();
    public final List<InterfaceC1032710cyr> LLJJIJI = new ArrayList();
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(500));
    public EnumC1032860cz6 LLJJJ = EnumC1032860cz6.UNKNOWN;
    public EnumC993300bxI LLJJJIL = EnumC993300bxI.NOT_INIT;

    @Override // X.InterfaceC1032120cxu
    public void reset() {
        this.LLIZ = false;
        this.LLJJJJJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJIII.clear();
        ((LinkedHashMap) this.LLJJI).clear();
        this.LLJILJIL = 0;
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

    @Override // X.InterfaceC1032120cxu
    public void unregisterAdContainerDelegate() {
        this.LLJILJILJ = null;
    }

    public final void LIZJ() {
        if (this.LLIZLLLIL && Intrinsics.LJFF(this.LLJJJJLIIL, C1032530cyZ.LIZ)) {
            InterfaceC1033100czU interfaceC1033100czU = this.LLILZLL;
            if (interfaceC1033100czU != null) {
                interfaceC1033100czU.clearAllWithParams(this.LLJJIJIIJIL);
            }
            this.LLILLL.exit();
            this.LLJJ.clear();
        }
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void distributeRewards() {
        this.LLILLJJLI.distributeRewards();
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void exit() {
        this.LLILLL.exit();
    }

    @Override // X.InterfaceC1032120cxu
    public ViewGroup getBottomInteractView() {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            return interfaceC1032870cz7.getBottomInteractView();
        }
        return null;
    }

    @Override // X.InterfaceC1032120cxu
    public Map<String, Object> getCarouselAdExtraParams() {
        Map<String, Object> carouselAdExtraParams;
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        return (interfaceC1032870cz7 == null || (carouselAdExtraParams = interfaceC1032870cz7.getCarouselAdExtraParams()) == null) ? C2097608Jq.LJ() : carouselAdExtraParams;
    }

    @Override // X.InterfaceC1032120cxu
    public HashMap<String, Object> getCustomAdExtraDataParams() {
        HashMap<String, Object> map = new HashMap<>();
        map.putAll(this.LLJJ);
        map.put("is_pre_request", Integer.valueOf(this.LLILZIL ? 1 : 0));
        Object hostModel = getHostModel();
        String strLJ = hostModel != null ? getHostUtils().LJ(hostModel) : null;
        int loopTimesForCid = 0;
        if (strLJ != null && !a0.LJJJIL(strLJ)) {
            loopTimesForCid = getLoopTimesForCid(strLJ);
        }
        map.put("loop_times", Integer.valueOf(loopTimesForCid));
        return map;
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public InterfaceC1032290cyB getCustomAdVideo() {
        return this.LLILLL.getCustomAdVideo();
    }

    public final C1033020czM getExitInfo() {
        return (C1033020czM) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public InterfaceC1032380cyK getGpMiniCardManager() {
        return this.LLILLL.getGpMiniCardManager();
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1033000czK
    public Gson getGson() {
        return this.LLILLL.getGson();
    }

    @Override // X.InterfaceC1032120cxu
    public Object getHostModel() {
        return C13LP.LJJJLZIJ(this.LLJILJIL, this.LLJI);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public InterfaceC1032330cyF getHostUtils() {
        return this.LLILLL.getHostUtils();
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public InterfaceC1032240cy6 getLandingPageManager() {
        if (this.LLJILLL == null) {
            this.LLJILLL = this.LLILLL.getLandingPageManager();
        }
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1032120cxu
    public List<HashMap<String, Object>> getLatestPrefetchParams() {
        List<? extends HashMap<String, Object>> list = this.LLJJIJIIJIL;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends HashMap<String, Object>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new HashMap(it2.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1032120cxu
    public Object getNextHostModel() {
        return C13LP.LJJJLZIJ(this.LLJILJIL + 1, this.LLJI);
    }

    @Override // X.InterfaceC1032120cxu
    public GmtRewardAdModel getNextRewardAdModel() {
        return (GmtRewardAdModel) C13LP.LJJJLZIJ(this.LLJILJIL + 1, this.LLJIJIL);
    }

    @Override // X.InterfaceC1032120cxu
    public List<Object> getPreviousHostModels() {
        int i = this.LLJILJIL;
        return i <= 0 ? C13BV.INSTANCE : ((ArrayList) this.LLJI).subList(0, i);
    }

    @Override // X.InterfaceC1032120cxu
    public int getRewardAdDataStatus() {
        return this.LLJJJIL.getValue();
    }

    @Override // X.InterfaceC1032120cxu
    public GmtRewardAdModel getRewardAdModel() {
        return (GmtRewardAdModel) C13LP.LJJJLZIJ(this.LLJILJIL, this.LLJIJIL);
    }

    @Override // X.InterfaceC1032100cxs
    public long getVideoDuration() {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            return interfaceC1032870cz7.getVideoDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC1032100cxs
    public long getVideoPosition() {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            return interfaceC1032870cz7.getVideoPosition();
        }
        return 0L;
    }

    @Override // X.InterfaceC1032120cxu
    public void notifyBusinessUpdateBubbleTip() {
        GmtRewardAdModel rewardAdModel;
        String bubbleText;
        AdRewardData adRewardData;
        OneToNInfo oneToNInfo;
        if (this.LLJJJ.isOneToN() && (rewardAdModel = getRewardAdModel()) != null) {
            GMTBaseModel gMTBaseModel = rewardAdModel.awemeRawAd;
            if (gMTBaseModel == null || (adRewardData = gMTBaseModel.adRewardData) == null || (oneToNInfo = adRewardData.getOneToNInfo()) == null || (bubbleText = oneToNInfo.getBubbleText()) == null) {
                bubbleText = "";
            }
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(bubbleText, "{current}", String.valueOf(this.LLJILJIL + 1), false), "{total}", String.valueOf(((ArrayList) this.LLJIJIL).size()), false);
            this.LLILLJJLI.updateBubbleTip(strLJJIFFI);
            InterfaceC1032410cyN interfaceC1032410cyN = this.LLILZ;
            if (interfaceC1032410cyN != null) {
                interfaceC1032410cyN.LIZLLL(strLJJIFFI);
            }
        }
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void onRewardAdDataReady() {
        this.LLILLJJLI.onRewardAdDataReady();
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void onRewardCountdownFinished() {
        this.LLILLJJLI.onRewardCountdownFinished();
    }

    @Override // X.InterfaceC1032100cxs
    public void pause() {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            interfaceC1032870cz7.pause(null);
        }
    }

    @Override // X.InterfaceC1032100cxs
    public void resume() {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            interfaceC1032870cz7.resume();
        }
    }

    @Override // X.InterfaceC1032120cxu
    public boolean switchNextAdByOneToN() {
        int i = this.LLJILJIL + 1;
        if (i >= ((ArrayList) this.LLJIJIL).size()) {
            return false;
        }
        this.LLJILJIL = i;
        this.LLILLL.onAdSelected(C13LP.LJJJLZIJ(i, this.LLJI));
        updateState(C1032550cyb.LIZ);
        updateState(C1032520cyY.LIZ);
        notifyBusinessUpdateBubbleTip();
        return true;
    }

    @Override // X.InterfaceC1032120cxu
    public void videoPlayFailed() {
        LIZIZ(new C1032960czG(C1033170czb.LIZ));
    }

    @Override // X.InterfaceC1032100cxs
    public String getAdID() {
        GMTBaseModel gMTBaseModel;
        Long adId;
        GmtRewardAdModel rewardAdModel = getRewardAdModel();
        if (rewardAdModel == null || (gMTBaseModel = rewardAdModel.awemeRawAd) == null || (adId = gMTBaseModel.getAdId()) == null) {
            return null;
        }
        return adId.toString();
    }

    @Override // X.InterfaceC1032120cxu
    public int getCurrentAdLoopTimes() {
        String strLJ;
        Object hostModel = getHostModel();
        if (hostModel == null || (strLJ = getHostUtils().LJ(hostModel)) == null || a0.LJJJIL(strLJ)) {
            return 0;
        }
        return getLoopTimesForCid(strLJ);
    }

    @Override // X.InterfaceC1032120cxu
    public Long getInterstitialCloseDuration() {
        GMTBaseModel gMTBaseModel;
        InterstitialAdInfo interstitialAdInfo;
        GmtRewardAdModel rewardAdModel = getRewardAdModel();
        if (rewardAdModel == null || (gMTBaseModel = rewardAdModel.awemeRawAd) == null || (interstitialAdInfo = gMTBaseModel.getInterstitialAdInfo()) == null) {
            return null;
        }
        return interstitialAdInfo.getInterstitialCloseDuration();
    }

    @Override // X.InterfaceC1032120cxu
    public void increaseCurrentAdLoopTimes() {
        String strLJ;
        Object hostModel = getHostModel();
        if (hostModel == null || (strLJ = getHostUtils().LJ(hostModel)) == null || a0.LJJJIL(strLJ)) {
            return;
        }
        increaseLoopTimesForCid(strLJ);
    }

    @Override // X.InterfaceC1032100cxs
    public boolean isInterstitialAd() {
        GMTBaseModel gMTBaseModel;
        InterstitialAdInfo interstitialAdInfo;
        Integer interstitialSceneType;
        GmtRewardAdModel rewardAdModel = getRewardAdModel();
        return (rewardAdModel == null || (gMTBaseModel = rewardAdModel.awemeRawAd) == null || (interstitialAdInfo = gMTBaseModel.getInterstitialAdInfo()) == null || (interstitialSceneType = interstitialAdInfo.getInterstitialSceneType()) == null || interstitialSceneType.intValue() != 1) ? false : true;
    }

    @Override // X.InterfaceC1032120cxu
    public boolean markCurrentAdShowIfNeeded() {
        String strLJ;
        Object hostModel = getHostModel();
        if (hostModel == null || (strLJ = getHostUtils().LJ(hostModel)) == null || a0.LJJJIL(strLJ)) {
            return true;
        }
        return this.LLJJIII.add(strLJ);
    }

    @Override // X.InterfaceC1032100cxs
    public void reportSuccess() {
        taskCompleted(false, getCustomAdExtraDataParams(), null);
        C786410Ut5.LJLIIL(2000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 233));
    }

    @Override // X.InterfaceC1032120cxu
    public boolean shouldDirectOpenLandingPage() {
        OpenLandingPageConfigModel openLandingPageConfigModel;
        GmtRewardAdModel rewardAdModel = getRewardAdModel();
        String str = null;
        GMTBaseModel gMTBaseModel = rewardAdModel != null ? rewardAdModel.awemeRawAd : null;
        if (gMTBaseModel != null) {
            if (gMTBaseModel.isOpenSystemBrowser()) {
                return false;
            }
            AdStyleActionModel adStyleActionModel = gMTBaseModel.getAdStyleActionModel();
            if (adStyleActionModel == null || (openLandingPageConfigModel = adStyleActionModel.openLandingPageConfig) == null || (str = openLandingPageConfigModel.openType) == null) {
                str = "default";
            }
        }
        return Intrinsics.LJFF(String.valueOf(str), EnumC1031630cx7.DIRECT.getValue());
    }

    @Override // X.InterfaceC1032120cxu
    public C1031810cxP getAdConfig() {
        return this.LL;
    }

    @Override // X.InterfaceC1032120cxu
    public Double getCloseButtonDelaySeconds() {
        return this.LLJJJJJIL;
    }

    public final InterfaceC1032410cyN getCountdownDelegate() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1032120cxu
    public boolean getCurrentRewardResume() {
        return this.LLIZ;
    }

    public final InterfaceC1032940czE getDelegate() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1032830cz3 getHostDelegate() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1032120cxu
    public InterfaceC1033100czU getPreRequestManager() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1032120cxu
    public boolean getRewardAdHasShow() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1032100cxs
    public EnumC1032860cz6 getSceneType() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1032120cxu
    public AbstractC1032220cy4 getState() {
        return this.LLJJJJLIIL;
    }

    public final boolean isPreload() {
        return this.LLILZIL;
    }

    public final void LIZ(boolean z) {
        InterfaceC1032630cyj interfaceC1032630cyjXf;
        InterfaceC1032610cyh interfaceC1032610cyhO1;
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null && (interfaceC1032610cyhO1 = interfaceC1032870cz7.O1()) != null) {
            if (z) {
                interfaceC1032610cyhO1.start();
            } else {
                interfaceC1032610cyhO1.stop();
            }
        }
        InterfaceC1032870cz7 interfaceC1032870cz72 = this.LLJILJILJ;
        if (interfaceC1032870cz72 != null && (interfaceC1032630cyjXf = interfaceC1032870cz72.Xf()) != null) {
            if (z) {
                interfaceC1032630cyjXf.start();
            } else {
                interfaceC1032630cyjXf.stop();
            }
        }
    }

    public final void LIZIZ(AbstractC1032220cy4 abstractC1032220cy4) {
        this.LLJJJJLIIL = abstractC1032220cy4;
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1032710cyr) it2.next()).oi(abstractC1032220cy4);
        }
        if (abstractC1032220cy4 instanceof C1032960czG) {
            exit(false);
            this.LLILLL.showToast(this.LL.LIZLLL);
        } else {
            if (!(abstractC1032220cy4 instanceof C1032530cyZ)) {
                return;
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 234));
        }
    }

    public final void LIZLLL(HashMap<String, Object> map) {
        Object obj;
        Double d;
        this.LLJJJJJIL = null;
        if (map != null && (obj = map.get("close_button_delay_seconds")) != null) {
            if ((obj instanceof Double) && (d = (Double) obj) != null && !Double.isNaN(d.doubleValue()) && !Double.isInfinite(d.doubleValue()) && d.doubleValue() > 0.0d) {
                this.LLJJJJJIL = d;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update close button delay seconds: ");
                sbLIZ.append(d);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invalid close button delay seconds: ");
            sbLIZ2.append(obj);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final void LJ(List<? extends HashMap<String, Object>> list) {
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (HashMap<String, Object> map : list) {
                if (!map.isEmpty()) {
                    arrayList2.add(new HashMap(map));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        this.LLJJIJIIJIL = arrayList;
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void didExit(C1033020czM c1033020czM) {
        this.LLILLJJLI.didExit(c1033020czM);
    }

    @Override // X.InterfaceC1032100cxs
    public void exit(boolean z) {
        LIZIZ(C1032530cyZ.LIZ);
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            interfaceC1032870cz7.LLZLLLL(z);
        }
        LIZJ();
    }

    @Override // X.InterfaceC1032120cxu
    public View getInteractContainerView(String str) {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            return interfaceC1032870cz7.getInteractContainerView(str);
        }
        return null;
    }

    @Override // X.InterfaceC1032120cxu
    public int getLoopTimesForCid(String str) {
        Integer num = (Integer) ((LinkedHashMap) this.LLJJI).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1033000czK
    public void incentiveAdPreloadData(Object obj) {
        this.LLILLL.incentiveAdPreloadData(obj);
    }

    @Override // X.InterfaceC1032120cxu
    public void increaseLoopTimesForCid(String str) {
        this.LLJJI.put(str, Integer.valueOf(getLoopTimesForCid(str) + 1));
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void loadDataSuccess(List<Object> list) {
        this.LLILLL.loadDataSuccess(list);
    }

    @Override // X.InterfaceC1032120cxu
    public boolean notifyContainerEvent(AbstractC1016110cY5 abstractC1016110cY5) {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            return interfaceC1032870cz7.j8(abstractC1016110cY5);
        }
        return false;
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void onAdSelected(Object obj) {
        this.LLILLL.onAdSelected(obj);
    }

    @Override // X.InterfaceC1032100cxs
    public void onHandleTapFinished(String str) {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            interfaceC1032870cz7.onHandleTapFinished(str);
        }
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void onRewardAdPause(Integer num) {
        this.LLIZ = false;
        this.LLILLJJLI.onRewardAdPause(null);
        LIZ(false);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void onRewardAdResume(Integer num) {
        this.LLIZ = true;
        this.LLILLJJLI.onRewardAdResume(null);
        LIZ(true);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void onRewardAdShow(Integer num) {
        this.LLIZ = true;
        this.LLJJJJ = true;
        this.LLILLJJLI.onRewardAdShow(null);
        LIZ(true);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1033000czK
    public Object parsingHostModel(k kVar) {
        return this.LLILLL.parsingHostModel(kVar);
    }

    @Override // X.InterfaceC1032120cxu
    public void registerAdContainerDelegate(InterfaceC1032870cz7 interfaceC1032870cz7) {
        this.LLJILJILJ = interfaceC1032870cz7;
    }

    @Override // X.InterfaceC1032120cxu
    public void registerStateChangeListener(InterfaceC1032710cyr interfaceC1032710cyr) {
        ((ArrayList) this.LLJJIJI).add(interfaceC1032710cyr);
    }

    @Override // X.InterfaceC1032120cxu
    public Object searchHostModelByCid(String str) {
        for (Object obj : this.LLJI) {
            if (Intrinsics.LJFF(getHostUtils().LJ(obj), str)) {
                return obj;
            }
        }
        return null;
    }

    public final void setHostModel(Object obj) {
        if (obj == null) {
            return;
        }
        ((ArrayList) this.LLJI).clear();
        ((ArrayList) this.LLJI).add(obj);
    }

    public final void setPreload(boolean z) {
        this.LLILZIL = z;
    }

    @Override // X.InterfaceC1032120cxu
    public void setRewardAdDataStatus(EnumC993300bxI enumC993300bxI) {
        this.LLJJJIL = enumC993300bxI;
    }

    public final void setRewardAdModel(GmtRewardAdModel gmtRewardAdModel) {
        if (gmtRewardAdModel == null) {
            return;
        }
        ((ArrayList) this.LLJIJIL).clear();
        ((ArrayList) this.LLJIJIL).add(gmtRewardAdModel);
    }

    public final void setSceneType(Integer num) {
        EnumC1032860cz6 enumC1032860cz6;
        EnumC1032860cz6.Companion.getClass();
        EnumC1032860cz6[] enumC1032860cz6ArrValues = EnumC1032860cz6.values();
        int length = enumC1032860cz6ArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC1032860cz6 = enumC1032860cz6ArrValues[i];
                int value = enumC1032860cz6.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC1032860cz6 = EnumC1032860cz6.NORMAL;
                break;
            }
        }
        this.LLJJJ = enumC1032860cz6;
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void showToast(Context context) {
        this.LLILLL.showToast(context);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void skipRewardAdWatchDuration(int i) {
        this.LLILLJJLI.skipRewardAdWatchDuration(i);
    }

    @Override // X.InterfaceC1032120cxu
    public void unregisterStateChangeListener(InterfaceC1032710cyr interfaceC1032710cyr) {
        ((ArrayList) this.LLJJIJI).remove(interfaceC1032710cyr);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void updateBubbleTip(String str) {
        this.LLILLJJLI.updateBubbleTip(str);
    }

    @Override // X.InterfaceC1032120cxu
    public void updateState(AbstractC1032220cy4 abstractC1032220cy4) {
        LIZIZ(abstractC1032220cy4);
        if (!(abstractC1032220cy4 instanceof C1032960czG)) {
            return;
        }
        C1032960czG c1032960czG = (C1032960czG) abstractC1032220cy4;
        AbstractC1033140czY abstractC1033140czY = c1032960czG.LIZ;
        if (abstractC1033140czY instanceof C1033170czb) {
            getExitInfo().LIZ = 5;
            getExitInfo().LIZIZ = c1032960czG.LIZ.LIZ();
        } else {
            if (abstractC1033140czY instanceof C1032980czI) {
                C1032980czI c1032980czI = (C1032980czI) abstractC1033140czY;
                getExitInfo().LIZ = c1032980czI.LIZ.LIZ();
                getExitInfo().LIZIZ = c1032980czI.LIZ.LIZIZ();
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void willExit(Context context) {
        if (this.LL.LIZJ) {
            this.LLILLJJLI.willExit(context);
        } else {
            exit(true);
        }
    }

    public final void setHostModel(List<Object> list) {
        ((ArrayList) this.LLJI).clear();
        ((ArrayList) this.LLJI).addAll(list);
    }

    public final void setRewardAdModel(List<GmtRewardAdModel> list) {
        ((ArrayList) this.LLJIJIL).clear();
        ((ArrayList) this.LLJIJIL).addAll(list);
    }

    @Override // X.InterfaceC1032120cxu
    public void addOverlayViewIfNeed(String str, boolean z) {
        InterfaceC1032870cz7 interfaceC1032870cz7 = this.LLJILJILJ;
        if (interfaceC1032870cz7 != null) {
            interfaceC1032870cz7.addOverlayViewIfNeed(str, z);
        }
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void addVideoWaterMarker(Object obj, ViewGroup viewGroup) {
        this.LLILLL.addVideoWaterMarker(obj, viewGroup);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public Object getHybridConfig(Object obj, Context context) {
        return this.LLILLL.getHybridConfig(obj, context);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void report(Context context, Object obj) {
        this.LLILLL.report(context, obj);
    }

    @Override // X.InterfaceC1032100cxs
    public void startByCacheKey(Context context, String str) {
        C1033640d0M c098200Yq;
        this.LLJJJJJIL = null;
        try {
            ConcurrentHashMap<String, C1033640d0M> concurrentHashMap = C990930btT.LIZ;
            if (concurrentHashMap.containsKey(str)) {
                c098200Yq = concurrentHashMap.remove(str);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
            String str2 = RewardAdActivity._pnsPageId;
            C817330W4l.LIZ(context, this);
            setRewardAdModel((List<GmtRewardAdModel>) null);
            setHostModel((List<Object>) null);
            C13LP.LJJJLL(null);
            throw null;
        }
    }

    @Override // X.InterfaceC1032120cxu
    public boolean switchNextAdByCid(String str, Function1<? super Boolean, Unit> function1) {
        Object objSearchHostModelByCid = searchHostModelByCid(str);
        if (objSearchHostModelByCid == null) {
            function1.invoke(Boolean.FALSE);
            return false;
        }
        int iIndexOf = ((ArrayList) this.LLJI).indexOf(objSearchHostModelByCid);
        if (iIndexOf < 0) {
            function1.invoke(Boolean.FALSE);
            return false;
        }
        function1.invoke(Boolean.TRUE);
        this.LLJILJIL = iIndexOf;
        this.LLILLL.onAdSelected(C13LP.LJJJLZIJ(iIndexOf, this.LLJI));
        updateState(C1032550cyb.LIZ);
        updateState(C1032520cyY.LIZ);
        notifyBusinessUpdateBubbleTip();
        return true;
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void track3rdPartyURL(C1031380cwi c1031380cwi, Object obj) {
        this.LLILLL.track3rdPartyURL(c1031380cwi, obj);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void trackEvent(C1031480cws c1031480cws, Object obj) {
        this.LLILLL.trackEvent(c1031480cws, obj);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void trackEventFromJSB(C1031480cws c1031480cws, Object obj) {
        this.LLILLL.trackEventFromJSB(c1031480cws, obj);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void trackUserEvent(String str, JSONObject jSONObject) {
        this.LLILLL.trackUserEvent(str, jSONObject);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void videoPlayStateDidChange(EnumC1031610cx5 enumC1031610cx5, int i) {
        this.LLILLJJLI.videoPlayStateDidChange(enumC1031610cx5, i);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032940czE
    public void viewDidLoad(ViewGroup viewGroup, Fragment fragment) {
        this.LLILLJJLI.viewDidLoad(viewGroup, fragment);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void handleTap(Context context, Map<EnumC1005430cGr, ? extends Object> map, Object obj) {
        this.LLILLL.handleTap(context, map, obj);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void jumpRoute(Context context, C1016240cYI c1016240cYI, Object obj) {
        this.LLILLL.jumpRoute(context, c1016240cYI, obj);
    }

    @Override // X.InterfaceC1032100cxs
    public void taskCompleted(boolean z, HashMap<String, Object> map, C1032720cys c1032720cys) {
        Object hostModel;
        String str;
        String str2;
        this.LLIZLLLIL = true;
        if (z) {
            getExitInfo().LIZ = 0;
            getExitInfo().LIZIZ = "";
            getExitInfo().LIZJ = true;
        }
        Object hostModel2 = getHostModel();
        if (hostModel2 != null) {
            if (z) {
                str2 = "adtask_finish";
            } else {
                str2 = "adtask_finish_fail";
            }
            HashMap<String, Object> customAdExtraDataParams = getCustomAdExtraDataParams();
            if (map != null && !map.isEmpty()) {
                customAdExtraDataParams.putAll(map);
            }
            trackEvent(new C1031480cws(str2, customAdExtraDataParams, 4), hostModel2);
            if (z && getSceneType().isOneToN()) {
                Iterator<Object> it2 = getPreviousHostModels().iterator();
                while (it2.hasNext()) {
                    trackEvent(new C1031480cws("related_ad_finish", customAdExtraDataParams, 4), it2.next());
                }
            }
        }
        if (c1032720cys != null) {
            boolean z2 = c1032720cys.LIZ;
            if (C1033560d0E.LIZ && (hostModel = getHostModel()) != null) {
                if (z2) {
                    str = "reward_finish";
                } else {
                    str = "reward_finish_fail";
                }
                HashMap<String, Object> customAdExtraDataParams2 = getCustomAdExtraDataParams();
                if (map != null && !map.isEmpty()) {
                    customAdExtraDataParams2.putAll(map);
                }
                trackEvent(new C1031480cws(str, customAdExtraDataParams2, 4), hostModel);
            }
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS35S0110000_16(this, z, 6));
        LIZJ();
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public void trackOMSDK(AbstractC1892207b6 abstractC1892207b6, Object obj, Context context) {
        this.LLILLL.trackOMSDK(abstractC1892207b6, obj, context);
    }

    @Override // X.InterfaceC1032100cxs
    public void watchNext(HashMap<String, Object> map, HashMap<String, String> map2, HashMap<String, Object> map3, List<? extends HashMap<String, Object>> list) {
        this.LLIZLLLIL = false;
        this.LLJJ.clear();
        if (map3 != null && !map3.isEmpty()) {
            this.LLJJ.putAll(map3);
        }
        LIZLLL(map);
        InterfaceC1033100czU interfaceC1033100czU = this.LLILZLL;
        if (interfaceC1033100czU != null) {
            interfaceC1033100czU.clearAllWithParams(this.LLJJIJIIJIL);
        }
        LJ(list);
        updateState(C1032560cyc.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start, state.shouldLoadADData(): ");
        sbLIZ.append(this.LLJJJJLIIL.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJJJLIIL.LIZ()) {
            ((C1032820cz2) this.LLJJIJIL.getValue()).LIZIZ(this, map2);
        }
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1032830cz3
    public InterfaceC1032210cy3 getRewardAnoleModule(Context context, InterfaceC1032120cxu interfaceC1032120cxu, ViewGroup viewGroup, InterfaceC1032280cyA interfaceC1032280cyA, InterfaceC1016100cY4 interfaceC1016100cY4) {
        return this.LLILLL.getRewardAnoleModule(context, interfaceC1032120cxu, viewGroup, interfaceC1032280cyA, interfaceC1016100cY4);
    }

    @Override // X.InterfaceC1032120cxu, X.InterfaceC1033000czK
    public void request(EnumC1033600d0I enumC1033600d0I, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033390czx, Unit> function1) {
        this.LLILLL.request(enumC1033600d0I, str, map, map2, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0215 A[PHI: r10
      0x0215: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:117:0x0211, B:28:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    @Override // X.InterfaceC1032100cxs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void start(boolean r24, java.util.HashMap<java.lang.String, java.lang.Object> r25, java.util.HashMap<java.lang.String, java.lang.String> r26, java.util.HashMap<java.lang.String, java.lang.Object> r27, java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.Object>> r28) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1032800cz0.start(boolean, java.util.HashMap, java.util.HashMap, java.util.HashMap, java.util.List):void");
    }

    public C1032800cz0(C1031810cxP c1031810cxP, C1033040czO c1033040czO, InterfaceC1032940czE interfaceC1032940czE, InterfaceC1032830cz3 interfaceC1032830cz3, InterfaceC1032410cyN interfaceC1032410cyN, InterfaceC1033100czU interfaceC1033100czU) {
        this.LL = c1031810cxP;
        this.LLILLJJLI = interfaceC1032940czE;
        this.LLILLL = interfaceC1032830cz3;
        this.LLILZ = interfaceC1032410cyN;
        this.LLILZLL = interfaceC1033100czU;
        if (c1033040czO != null) {
            C1031970cxf.LIZ = c1033040czO.LIZ;
            C1031980cxg.LIZ = c1033040czO.LIZIZ;
            C1032740cyu.LIZ = c1033040czO.LIZJ;
            C1016220cYG.LIZ = c1033040czO.LIZLLL;
            C1032750cyv.LIZ = c1033040czO.LJ;
            C1032730cyt.LIZ = c1033040czO.LJFF;
            C1033560d0E.LIZ = c1033040czO.LJI;
        }
        this.LLJJJJLIIL = C1032540cya.LIZ;
    }
}
