package X;

import Y.ARunnableS28S1100000_23;
import Y.ARunnableS98S0000000_23;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ogM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482520ogM implements OnUIPlayListener, OnPreRenderListener {
    public static final ExecutorService LLJJ = C786410Ut5.h4();
    public static final C1024000cko LLJJI = new LinkedHashMap<String, HashMap<String, Object>>() { // from class: X.0cko
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, HashMap<String, Object>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public int LL;
    public InterfaceC1482530ogN LLILLJJLI;
    public final List<InterfaceC1482530ogN> LLILLL = new CopyOnWriteArrayList();
    public InterfaceC1481870ofJ LLILZ;
    public final InterfaceC1483670oiD LLILZIL;
    public final InterfaceC1481730of5 LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public final C1482280ofy LLJ;
    public final int LLJI;
    public final C1481530oel LLJIJIL;
    public C1024680clu LLJILJIL;
    public InterfaceC1023790ckT LLJILJILJ;
    public final C1023930ckh LLJILLL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    public static HashMap LIZJ(String str) {
        if (str == null) {
            return null;
        }
        return LLJJI.get(str);
    }

    public final void LIZ(InterfaceC1482530ogN interfaceC1482530ogN) {
        if (!((CopyOnWriteArrayList) this.LLILLL).contains(interfaceC1482530ogN)) {
            ((CopyOnWriteArrayList) this.LLILLL).add(interfaceC1482530ogN);
        }
    }

    public final void LIZLLL(InterfaceC1482530ogN interfaceC1482530ogN) {
        ((CopyOnWriteArrayList) this.LLILLL).remove(interfaceC1482530ogN);
    }

    public final void LJ(String str) {
        if (this.LLILZLL != null && !C1480850odf.LIZJ.optGlobalAppAnr()) {
            if (C1474810oTv.LJJZZI()) {
                if (this.LLJIJIL != null) {
                    this.LL = C1481530oel.LIZ(this.LLILZLL.LJJII(str), str);
                }
            } else {
                C1481530oel c1481530oel = C1482080ofe.LIZ;
                SimVideoUrlModel simVideoUrlModelLJJII = this.LLILZLL.LJJII(str);
                c1481530oel.getClass();
                this.LL = C1481530oel.LIZ(simVideoUrlModelLJJII, str);
            }
        }
        InterfaceC1481870ofJ interfaceC1481870ofJ = this.LLILZ;
        if (interfaceC1481870ofJ != null) {
            interfaceC1481870ofJ.LIZ();
            if (C1480850odf.LIZJ.optGlobalAppAnr() && this.LLILZLL != null) {
                if (C1474810oTv.LJJZZI()) {
                    if (this.LLJIJIL != null) {
                        this.LL = C1481530oel.LIZ(this.LLILZLL.LJJII(str), str);
                    }
                } else {
                    C1481530oel c1481530oel2 = C1482080ofe.LIZ;
                    SimVideoUrlModel simVideoUrlModelLJJII2 = this.LLILZLL.LJJII(str);
                    c1481530oel2.getClass();
                    this.LL = C1481530oel.LIZ(simVideoUrlModelLJJII2, str);
                }
            }
            HashMap mapLIZJ = LIZJ(str);
            if (C1474810oTv.LJJZZI()) {
                C1481530oel c1481530oel3 = this.LLJIJIL;
                if (c1481530oel3 != null) {
                    c1481530oel3.LJIIIZ(this, str, this.LL, mapLIZJ);
                    return;
                }
                return;
            }
            C1482080ofe.LIZ.LJIIIZ(this, str, this.LL, mapLIZJ);
        }
    }

    public final void LJFF(C1482540ogO c1482540ogO) {
        this.LLJILJILJ = c1482540ogO;
        if (C1474810oTv.LJJZZI()) {
            int i = this.LLJI;
            if (i == 1) {
                c1482540ogO.LIZ(this.LLJ.LIZJ);
            } else {
                if (i != 2) {
                    return;
                }
                c1482540ogO.LIZ(this.LLJIJIL.LIZIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayPause(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        if (!C1480850odf.LIZJ.optGlobalAppAnr()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayPrepare: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayPrepare(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepared(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayPrepared: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayPrepared(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayPrepared(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayRelease(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayRelease(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        InterfaceC1481870ofJ interfaceC1481870ofJ;
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter() && (interfaceC1481870ofJ = this.LLILZ) != null) {
            interfaceC1481870ofJ.LIZ();
            this.LLILZ.LJFF();
            LIZIZ(str, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final void onPreRenderReady(String str) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPreRenderReady(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((OnPreRenderListener) it2.next()).onPreRenderReady(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPreRenderSessionMissed(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPreRenderSessionMissed(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onStopPlay(String str) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onStopPlay(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onStopPlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSecondFrame(String str) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onVideoSecondFrame(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onVideoSecondFrame(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ckh] */
    public C1482520ogM(InterfaceC1482530ogN interfaceC1482530ogN, InterfaceC1483670oiD interfaceC1483670oiD) {
        int iIntValue = ((Number) C1474810oTv.I3.getValue()).intValue();
        this.LLJI = iIntValue;
        this.LLJILJIL = null;
        this.LLJILLL = new LinkedHashMap<String, Boolean>() { // from class: X.0ckh
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 20) {
                    return true;
                }
                return false;
            }
        };
        this.LLILLJJLI = interfaceC1482530ogN;
        this.LLILZIL = interfaceC1483670oiD;
        if (interfaceC1483670oiD != null) {
            this.LLILZLL = interfaceC1483670oiD.LJIIIZ();
        }
        if (C1474810oTv.LJJZZI()) {
            C1481530oel c1481530oel = new C1481530oel();
            this.LLJIJIL = c1481530oel;
            if (iIntValue == 1) {
                C1482280ofy c1482280ofy = new C1482280ofy(LLJJ);
                this.LLJ = c1482280ofy;
                IPlayerEventReportService iPlayerEventReportService = c1481530oel.LIZLLL;
                if (iPlayerEventReportService != null) {
                    iPlayerEventReportService.setTaskIScheduler(c1482280ofy);
                }
            }
        }
    }

    public static void LJII(String str, HashMap map) {
        if (str != null && map != null && !map.isEmpty()) {
            LLJJI.put(str, map);
        }
    }

    public final void LJI(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        put(str, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBrightnessChanged(String str, float f) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onBrightnessChanged(str, f);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onBrightnessChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onBufferedTimeMs(str, j);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onBufferedTimeMs(str, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onCompleteLoaded(str, z);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onCompleteLoaded(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCrosstalkHappened(String str, List<Map<String, Object>> list) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onCrosstalkHappened(str, list);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onCrosstalkHappened(str, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onLiveRenderFirstFrame(str, c1480420ocy);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onLiveRenderFirstFrame(str, c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLoopPlay(String str, int i) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onLoopPlay(str, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onLoopPlay(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onMaskInfoCallback(str, c1480290ocl);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onMaskInfoCallback(str, c1480290ocl);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        Boolean bool;
        InterfaceC1481730of5 interfaceC1481730of5 = this.LLILZLL;
        if (interfaceC1481730of5 != null) {
            interfaceC1481730of5.LJJIIZI();
        }
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPausePlay(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPausePlay(str, c1480430ocz);
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter() && !TextUtils.isEmpty(str) && containsKey(str) && (bool = get(str)) != null && bool.booleanValue()) {
            LJI(str, false);
            InterfaceC1481870ofJ interfaceC1481870ofJ = this.LLILZ;
            if (interfaceC1481870ofJ != null) {
                interfaceC1481870ofJ.LIZ();
                if (C1474810oTv.LJJZZI()) {
                    C1481530oel c1481530oel = this.LLJIJIL;
                    if (c1481530oel != null) {
                        if (C1474810oTv.LJJZZI()) {
                            c1481530oel.LIZLLL.reportVideoPause(str, null);
                            return;
                        } else {
                            C1481610oet.LIZ().reportVideoPause(str, null);
                            return;
                        }
                    }
                    return;
                }
                C1481530oel c1481530oel2 = C1482080ofe.LIZ;
                c1481530oel2.getClass();
                if (C1474810oTv.LJJZZI()) {
                    c1481530oel2.LIZLLL.reportVideoPause(str, null);
                } else {
                    C1481610oet.LIZ().reportVideoPause(str, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        C582130MsN.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy().LJ();
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayCompleted(str, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayCompleted(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayCompletedFirstTime(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayCompletedFirstTime(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
        InterfaceC1481870ofJ interfaceC1481870ofJ;
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlaying(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlaying(str, c1480430ocz);
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter() && (interfaceC1481870ofJ = this.LLILZ) != null) {
            interfaceC1481870ofJ.LIZ();
            if (C1474810oTv.LJJZZI()) {
                C1481530oel c1481530oel = this.LLJIJIL;
                if (c1481530oel != null) {
                    if (C1474810oTv.LJJZZI()) {
                        c1481530oel.LIZLLL.reportVideoPlaying(str);
                        return;
                    } else {
                        C1481610oet.LIZ().reportVideoPlaying(str);
                        return;
                    }
                }
                return;
            }
            C1481530oel c1481530oel2 = C1482080ofe.LIZ;
            c1481530oel2.getClass();
            if (C1474810oTv.LJJZZI()) {
                c1481530oel2.LIZLLL.reportVideoPlaying(str);
            } else {
                C1481610oet.LIZ().reportVideoPlaying(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPreparePlay(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPreparePlay(str, c1480430ocz);
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter()) {
            LJI(str, true);
            ExecutorService executorService = LLJJ;
            if (executorService != null && ((Boolean) C1474810oTv.m.getValue()).booleanValue()) {
                executorService.execute(new ARunnableS28S1100000_23(this, str, c1480430ocz, 34));
            } else {
                LJ(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        InterfaceC1481870ofJ interfaceC1481870ofJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRenderFirstFrame: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onRenderFirstFrame(str, c1480420ocy);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onRenderFirstFrame(str, c1480420ocy);
        }
        InterfaceC1481730of5 interfaceC1481730of5 = this.LLILZLL;
        if (interfaceC1481730of5 != null) {
            interfaceC1481730of5.LJJIIZ();
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter() && (interfaceC1481870ofJ = this.LLILZ) != null) {
            interfaceC1481870ofJ.LIZ();
            HashMap<String, Object> mapLIZJ = LIZJ(str);
            if (C1474810oTv.LJJZZI()) {
                C1481530oel c1481530oel = this.LLJIJIL;
                if (c1481530oel != null) {
                    c1481530oel.LJII(this, this.LL, c1480420ocy, mapLIZJ);
                }
            } else {
                C1482080ofe.LIZ.LJII(this, this.LL, c1480420ocy, mapLIZJ);
            }
        }
        if (C1478190oZN.LIZ().getExperiment().enableMDLInitDelay() && !C1478160oZK.LIZ) {
            C1478160oZK.LIZ = true;
            C1475000oUE.LIZLLL.submit(new ARunnableS98S0000000_23(17));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        InterfaceC1481730of5 interfaceC1481730of5 = this.LLILZLL;
        if (interfaceC1481730of5 != null) {
            interfaceC1481730of5.LJJIIZ();
        }
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onResumePlay(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onResumePlay(str, c1480430ocz);
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter()) {
            LJI(str, true);
            InterfaceC1481870ofJ interfaceC1481870ofJ = this.LLILZ;
            if (interfaceC1481870ofJ != null) {
                interfaceC1481870ofJ.LIZ();
                if (C1474810oTv.LJJZZI()) {
                    C1481530oel c1481530oel = this.LLJIJIL;
                    if (c1481530oel != null) {
                        if (C1474810oTv.LJJZZI()) {
                            c1481530oel.LIZLLL.reportVideoOnResume(str, null);
                            return;
                        } else {
                            C1481610oet.LIZ().reportVideoOnResume(str, null);
                            return;
                        }
                    }
                    return;
                }
                C1481530oel c1481530oel2 = C1482080ofe.LIZ;
                c1481530oel2.getClass();
                if (C1474810oTv.LJJZZI()) {
                    c1481530oel2.LIZLLL.reportVideoOnResume(str, null);
                } else {
                    C1481610oet.LIZ().reportVideoOnResume(str, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onRetryOnError(str, c1481290oeN);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onRetryOnError(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onSeekEnd(str, z);
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter()) {
            C1481610oet.LIZ().reportSeekEnd(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onSpeedChanged(str, f);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onSpeedChanged(str, f);
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        float fFloatValue;
        if (((Boolean) C1474810oTv.P3.getValue()).booleanValue() || (TextUtils.equals(str, this.LLIZLLLIL) && !this.LLIZ)) {
            HashMap mapLIZJ = LIZJ(str);
            HashMap<String, Object> map = new HashMap<>();
            if (mapLIZJ != null) {
                map.putAll(mapLIZJ);
            }
            if (jSONObject != null) {
                map.put("extra_play_info", jSONObject);
            }
            C1024680clu c1024680clu = this.LLJILJIL;
            if (c1024680clu != null) {
                Float f = c1024680clu.LIZ.get(str);
                if (f == null) {
                    fFloatValue = 1.0f;
                } else {
                    fFloatValue = f.floatValue();
                }
                map.put("max_play_speed", Float.valueOf(fFloatValue));
            }
            if (C1474810oTv.LJJZZI()) {
                C1481530oel c1481530oel = this.LLJIJIL;
                if (c1481530oel != null) {
                    c1481530oel.LJIIJ(this, str, c1480430ocz, map);
                }
            } else {
                C1482080ofe.LIZ.LJIIJ(this, str, c1480430ocz, map);
            }
            this.LLIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        if (i % 20 == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBufferedPercent: ");
            sbLIZ.append(str);
            sbLIZ.append(", percent:");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onBufferedPercent(str, j, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onBufferedPercent(str, j, i);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onBufferedPercent: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", percent:");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        InterfaceC1481870ofJ interfaceC1481870ofJ;
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onBuffering(str, z, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onBuffering(str, z, c1480430ocz);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBuffering: ");
        sbLIZ.append(str);
        sbLIZ.append(", start:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter() && (interfaceC1481870ofJ = this.LLILZ) != null) {
            interfaceC1481870ofJ.LIZ();
            HashMap mapLIZJ = LIZJ(str);
            if (C1474810oTv.LJJZZI()) {
                C1481530oel c1481530oel = this.LLJIJIL;
                if (c1481530oel != null) {
                    c1481530oel.LJI(this, str, z, c1480430ocz, mapLIZJ);
                    return;
                }
                return;
            }
            C1482080ofe.LIZ.LJI(this, str, z, c1480430ocz, mapLIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onDecoderBuffering(str, z, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onDecoderBuffering(str, z, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        InterfaceC1481870ofJ interfaceC1481870ofJ;
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayFailed(str, c1481290oeN, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayFailed(str, c1481290oeN, c1480430ocz);
        }
        InterfaceC1481730of5 interfaceC1481730of5 = this.LLILZLL;
        if (interfaceC1481730of5 != null) {
            interfaceC1481730of5.LJJIIZI();
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter() && (interfaceC1481870ofJ = this.LLILZ) != null) {
            interfaceC1481870ofJ.LIZ();
            HashMap<String, Object> mapLIZJ = LIZJ(str);
            if (C1474810oTv.LJJZZI()) {
                C1481530oel c1481530oel = this.LLJIJIL;
                if (c1481530oel != null) {
                    c1481530oel.LJIIIIZZ(this, c1481290oeN, str, c1480430ocz, mapLIZJ);
                    return;
                }
                return;
            }
            C1482080ofe.LIZ.LJIIIIZZ(this, c1481290oeN, str, c1480430ocz, mapLIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayProgressChange(str, j, j2);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        InterfaceC1481870ofJ interfaceC1481870ofJ;
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayStop(str, jSONObject, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayStop(str, jSONObject, c1480430ocz);
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter() && (interfaceC1481870ofJ = this.LLILZ) != null) {
            interfaceC1481870ofJ.LIZ();
            this.LLILZ.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerInternalEvent: ");
        sbLIZ.append(str);
        sbLIZ.append(", what:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onPlayerInternalEvent(str, i, jSONObject);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onPlayerInternalEvent(str, i, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onSeekStart(str, i, f);
        }
        if (!C582130MsN.LIZ().getConfig().getCommonConfig().isCloseSimKitReporter()) {
            C1481610oet.LIZ().reportSeekStart(str, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onVideoBitrateChanged(str, enumC2281141EQm, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onVideoBitrateChanged(str, enumC2281141EQm, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onVideoSizeChanged(str, i, i2);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onVideoSizeChanged(str, i, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map) {
        InterfaceC1482530ogN interfaceC1482530ogN = this.LLILLJJLI;
        if (interfaceC1482530ogN != null) {
            interfaceC1482530ogN.onFrameAboutToBeRendered(i, j, j2, map);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1482530ogN) it2.next()).onFrameAboutToBeRendered(i, j, j2, map);
        }
    }
}
