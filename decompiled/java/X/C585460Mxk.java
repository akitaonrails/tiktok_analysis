package X;

import Y.ACallableS0S1800000_23;
import Y.ACallableS62S1100000_9;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585460Mxk implements OnUIPlayListener {
    public final C1482320og2 LL;
    public final InterfaceC1481730of5 LLILLJJLI;
    public OnUIPlayListener LLILLL;
    public HashMap<String, Object> LLILZLL;
    public final List<OnUIPlayListener> LLILZ = new CopyOnWriteArrayList();
    public final C585450Mxj LLILZIL = C585450Mxj.LL;
    public final C603840NmI<String, Long> LLIZ = new C603840NmI<>(20);
    public final C603840NmI<String, Boolean> LLIZLLLIL = new C603840NmI<>(20);
    public final C603840NmI<String, Boolean> LLJ = new C603840NmI<>(20);
    public final C603840NmI<String, Boolean> LLJI = new C603840NmI<>(20);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
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
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    public final boolean LIZ() {
        InterfaceC585470Mxl interfaceC585470Mxl;
        C1482320og2 c1482320og2 = this.LL;
        return (c1482320og2 == null || (interfaceC585470Mxl = c1482320og2.LIZJ) == null || !interfaceC585470Mxl.LIZ()) ? false : true;
    }

    public final InterfaceC1481780ofA LIZIZ() {
        C1482320og2 c1482320og2 = this.LL;
        if (c1482320og2 != null) {
            return c1482320og2.LIZLLL;
        }
        return null;
    }

    public final InterfaceC585470Mxl LIZJ() {
        InterfaceC585470Mxl interfaceC585470Mxl;
        C1482320og2 c1482320og2 = this.LL;
        return (c1482320og2 == null || (interfaceC585470Mxl = c1482320og2.LIZJ) == null) ? new InterfaceC585470Mxl() { // from class: X.0Mxm
            @Override // X.InterfaceC585470Mxl
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJ(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJFF(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIJ(String str, boolean z) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIL(String str, JSONObject jSONObject) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIILIIL() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIILJJIL() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIILL(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIILLIIL() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIZILJ(String str, boolean z) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final EnumC585580Mxw LIZLLL() {
                return EnumC585580Mxw.DEFAULT;
            }

            @Override // X.InterfaceC585470Mxl
            public final EnumC1987207qQ LJIIJJI() {
                return EnumC1987207qQ.VIDEO;
            }
        } : interfaceC585470Mxl;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return this.LLILLL;
    }

    public final boolean LIZLLL(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str) || !this.LLJ.containsKey(str) || (bool = this.LLJ.get(str)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayCompleted(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPause(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayPause(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepare(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayPrepare(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepared(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepared(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            C583620Mum.LJJIIJ(c585450Mxj, str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayPrepared(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayRelease(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayRelease(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayRelease(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayStop(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrameFromResume(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderReady(c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onStopPlay(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onStopPlay(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onStopPlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSecondFrame(String str) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoSecondFrame(str);
        }
    }

    public C585460Mxk(C1479550obZ c1479550obZ, C1482320og2 c1482320og2) {
        this.LLILLJJLI = c1479550obZ;
        this.LL = c1482320og2;
    }

    public final void LJ(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LLJ.put(str, Boolean.valueOf(z));
    }

    public final void LJFF(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LLIZLLLIL.put(str, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBrightnessChanged(String str, float f) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBrightnessChanged(str, f);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onBrightnessChanged(str, f);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onBrightnessChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedTimeMs(str, j);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onBufferedTimeMs(str, j);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onBufferedTimeMs(str, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onCompleteLoaded(str, z);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onCompleteLoaded(str, z);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onDecoderBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCrosstalkHappened(String str, List<Map<String, Object>> list) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onCrosstalkHappened(str, list);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            C583620Mum.LJIIIZ(c585450Mxj, str, list);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onCrosstalkHappened(str, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onLiveRenderFirstFrame(str, c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLoopPlay(String str, int i) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onLoopPlay(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onMaskInfoCallback(str, c1480290ocl);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onMaskInfoCallback(str, c1480290ocl);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        Boolean bool;
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPausePlay(str, c1480430ocz);
            this.LLILLL.onPausePlay(str);
            if (LIZ() && ((LIZJ().LJII() || c1480430ocz.LJI) && !TextUtils.isEmpty(str) && this.LLIZLLLIL.containsKey(str) && (bool = this.LLIZLLLIL.get(str)) != null && bool.booleanValue())) {
                LJFF(str, false);
                InterfaceC585470Mxl interfaceC585470MxlLIZJ = LIZJ();
                InterfaceC1481780ofA interfaceC1481780ofALIZIZ = LIZIZ();
                InterfaceC1481730of5 interfaceC1481730of5 = this.LLILLJJLI;
                HashMap<String, Object> map = this.LLILZLL;
                C1481610oet.LIZ().reportVideoPause(str, new ACallableS0S1800000_23(interfaceC1481780ofALIZIZ, C1481310oeP.LJIIL(interfaceC1481730of5, str), C1481310oeP.LIZJ(interfaceC585470MxlLIZJ), interfaceC1481730of5, str, C585530Mxr.LIZ.get(str), c1480430ocz, interfaceC585470MxlLIZJ, map, 0), null);
            }
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPausePlay(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPausePlay(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        if (str != null && i > 0) {
            C1481310oeP.LIZIZ.put(str, Integer.valueOf(i));
        }
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str, i);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayCompleted(str, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayCompleted(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str, c1480430ocz);
            this.LLILLL.onPlayCompletedFirstTime(str);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayCompletedFirstTime(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayCompletedFirstTime(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str, z);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayStop(str, z);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayStop(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlaying(str, c1480430ocz);
            this.LLILLL.onPlaying(str);
            if (LIZ() && (LIZJ().LJIIIZ() || c1480430ocz.LJI)) {
                C1481610oet.LIZ().reportVideoPlaying(str);
            }
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlaying(str, c1480430ocz);
            this.LLILZIL.onPlaying(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(final String str, final C1480430ocz c1480430ocz) {
        long j;
        InterfaceC1481730of5 interfaceC1481730of5;
        int iLIZ;
        if (this.LLILLL != null) {
            if (LIZ() && (LIZJ().LJIILLIIL() || c1480430ocz.LJI)) {
                LJFF(str, true);
                LJ(str, true);
                if (!TextUtils.isEmpty(str)) {
                    this.LLJI.put(str, Boolean.TRUE);
                }
                if (!((Boolean) C1474810oTv.u1.getValue()).booleanValue()) {
                    if (!TextUtils.isEmpty(str) && (interfaceC1481730of5 = this.LLILLJJLI) != null) {
                        SimVideoUrlModel simVideoUrlModelLJJII = interfaceC1481730of5.LJJII(str);
                        InterfaceC1481780ofA interfaceC1481780ofALIZIZ = LIZIZ();
                        if (simVideoUrlModelLJJII != null && interfaceC1481780ofALIZIZ != null) {
                            iLIZ = interfaceC1481780ofALIZIZ.LIZ(simVideoUrlModelLJJII);
                        } else {
                            iLIZ = -1;
                        }
                        j = iLIZ;
                        this.LLIZ.put(str, Long.valueOf(j));
                    } else {
                        j = -1;
                    }
                } else {
                    j = 0;
                }
                final InterfaceC585470Mxl interfaceC585470MxlLIZJ = LIZJ();
                final InterfaceC1481780ofA interfaceC1481780ofALIZIZ2 = LIZIZ();
                final InterfaceC1481730of5 interfaceC1481730of52 = this.LLILLJJLI;
                final int i = (int) j;
                final HashMap<String, Object> map = this.LLILZLL;
                final Long lValueOf = Long.valueOf(System.currentTimeMillis());
                C585530Mxr.LIZ.put(str, lValueOf);
                C585530Mxr.LIZIZ.put(str, Boolean.FALSE);
                C585530Mxr.LIZJ.put(str, 1);
                final EnumC585580Mxw enumC585580MxwLIZJ = C1481310oeP.LIZJ(interfaceC585470MxlLIZJ);
                final SimVideoUrlModel simVideoUrlModelLJIIL = C1481310oeP.LJIIL(interfaceC1481730of52, str);
                C1481610oet.LIZ().reportVideoPlayStart(str, new Callable() { // from class: X.0oem
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String strLIZIZ;
                        String strLIZIZ2;
                        String networkTypeDetail;
                        int iLJIILIIL;
                        int iLIZLLL;
                        Session sessionLJI;
                        String str2 = str;
                        Long l = lValueOf;
                        SimVideoUrlModel simVideoUrlModel = simVideoUrlModelLJIIL;
                        EnumC585580Mxw enumC585580Mxw = enumC585580MxwLIZJ;
                        InterfaceC1481730of5 interfaceC1481730of53 = interfaceC1481730of52;
                        InterfaceC1481780ofA interfaceC1481780ofA = interfaceC1481780ofALIZIZ2;
                        C1480430ocz c1480430ocz2 = c1480430ocz;
                        int i2 = i;
                        InterfaceC585470Mxl interfaceC585470Mxl = interfaceC585470MxlLIZJ;
                        HashMap map2 = map;
                        C1C7U.LIZ("SimReporterSdkImpl@afcb.reportVideoRequestEvent$1L");
                        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                        InterfaceC1477220oXo interfaceC1477220oXoLJIJI = c1477400oY6.LJIJI(str2);
                        if (C1474810oTv.LLJJJJ()) {
                            strLIZIZ = C1481310oeP.LJIIJJI(str2);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(l);
                            sbLIZ.append("");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        if (C1474810oTv.LJJLI() && TextUtils.isEmpty(strLIZIZ) && C1474810oTv.LJJLIIIJL()) {
                            c1477400oY6.LJFF(str2, true);
                            strLIZIZ = c1477400oY6.LJIILJJIL(str2);
                        }
                        int i3 = 0;
                        if (simVideoUrlModel == null || (sessionLJI = c1477400oY6.LJI(simVideoUrlModel.getUri())) == null || !TextUtils.equals(sessionLJI.sourceId, simVideoUrlModel.getSourceId())) {
                            strLIZIZ2 = "notAssign";
                        } else {
                            String str3 = sessionLJI.selectFlow;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str3);
                            sbLIZ2.append(", ServerInputNum:");
                            List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
                            sbLIZ2.append(bitRate == null ? 0 : bitRate.size());
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        if (C1474810oTv.LJIILL()) {
                            networkTypeDetail = null;
                            iLJIILIIL = -1;
                            iLIZLLL = -1;
                        } else {
                            networkTypeDetail = C1475000oUE.LIZIZ().getNetworkTypeDetail(C786410Ut5.M3(C1475000oUE.LIZ));
                            iLJIILIIL = C1481310oeP.LJIILIIL(simVideoUrlModel);
                            iLIZLLL = C1481310oeP.LIZLLL(simVideoUrlModel);
                        }
                        C1481980ofU c1481980ofU = new C1481980ofU();
                        C1481580oeq c1481580oeq = c1481980ofU.LIZ;
                        c1481580oeq.LIZIZ = str2;
                        c1481580oeq.LJIL = enumC585580Mxw;
                        c1481580oeq.LJIILJJIL = iLJIILIIL;
                        c1481580oeq.LJIILLIIL = iLIZLLL;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(C1475000oUE.LIZIZ().getAppID());
                        sbLIZ3.append("");
                        c1481980ofU.LIZ.LIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        c1481980ofU.LIZ.LIZJ = C1475000oUE.LIZIZ().getAppVersion();
                        c1481980ofU.LIZ.LJ = C1480850odf.LIZJ.getPreloadType();
                        c1481980ofU.LIZ.LJIILL = C1481310oeP.LJIILJJIL(interfaceC1481730of53, str2);
                        c1481980ofU.LIZ.LJIIZILJ = C1481310oeP.LJ(interfaceC1481730of53, str2);
                        c1481980ofU.LIZ.LJIJI = interfaceC1481780ofA != null ? interfaceC1481780ofA.LIZLLL() : 0;
                        c1481980ofU.LIZ.LJIJJ = (interfaceC1477220oXoLJIJI == null || !(interfaceC1477220oXoLJIJI.getHdrType() == 1 || interfaceC1477220oXoLJIJI.getHdrType() == 2)) ? (simVideoUrlModel == null || !simVideoUrlModel.isHaveHdr() || interfaceC1477220oXoLJIJI == null || interfaceC1477220oXoLJIJI.getHdrType() != 0) ? 0 : -1 : 1;
                        c1481980ofU.LIZ.LJIIJ = interfaceC1481730of53 != null ? interfaceC1481730of53.LJIJJLI() : -1;
                        int duration = simVideoUrlModel != null ? (int) simVideoUrlModel.getDuration() : -1;
                        C1481580oeq c1481580oeq2 = c1481980ofU.LIZ;
                        c1481580oeq2.LIZLLL = duration;
                        c1481580oeq2.LJFF = strLIZIZ;
                        c1481980ofU.LIZ.LJIILIIL = interfaceC1481730of53 != null ? (int) interfaceC1481730of53.getBitrate() : -1L;
                        String strLIZIZ3 = C1481310oeP.LIZIZ(simVideoUrlModel, true);
                        C1481580oeq c1481580oeq3 = c1481980ofU.LIZ;
                        c1481580oeq3.LJIJ = strLIZIZ3;
                        c1481580oeq3.LJIIL = strLIZIZ2;
                        String strValueOf = String.valueOf(interfaceC1481730of53 != null ? interfaceC1481730of53.LIZLLL() : -1);
                        C1481580oeq c1481580oeq4 = c1481980ofU.LIZ;
                        c1481580oeq4.LJIIJJI = strValueOf;
                        c1481580oeq4.LJI = networkTypeDetail;
                        c1481580oeq4.LIZ(Integer.valueOf(c1480430ocz2.LJIILJJIL), "model_type");
                        if (EnumC585580Mxw.DEFAULT == enumC585580Mxw || EnumC585580Mxw.D_FEED == enumC585580Mxw) {
                            C1481580oeq c1481580oeq5 = c1481980ofU.LIZ;
                            c1481580oeq5.LJIIIZ = i2;
                            c1481580oeq5.LJII = i2 > 0 ? 1 : 0;
                        }
                        if (interfaceC585470Mxl != null) {
                            c1481580oeq4.LIZ(interfaceC585470Mxl.LJIIJJI(), "play_type");
                            c1481580oeq4.LIZIZ(interfaceC585470Mxl.LJ(str2));
                        }
                        c1481580oeq4.LIZIZ(map2);
                        c1481580oeq4.LIZIZ(c1480430ocz2.LJIIL);
                        if (c1480430ocz2.LJIIJ == 2 && c1480430ocz2.LJIIJJI != 1) {
                            i3 = 1;
                        }
                        c1481580oeq4.LIZ(l, "request_t");
                        c1481580oeq4.LIZ(Integer.valueOf(i3), "is_prerender");
                        c1481580oeq4.LIZ(Integer.valueOf(i2), "pre_cache_size");
                        c1481580oeq4.LIZ(Integer.valueOf(c1480430ocz2.LJIILLIIL ? 1 : 0), "is_mediabox");
                        C1C7U.LIZIZ("SimReporterSdkImpl@afcb.reportVideoRequestEvent$1L");
                        return c1481580oeq4;
                    }
                });
            }
            this.LLILLL.onPreparePlay(str, c1480430ocz);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPreparePlay(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPreparePlay(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, final C1480420ocy c1480420ocy) {
        Boolean bool;
        long jLongValue;
        boolean z;
        Long l;
        C585500Mxo.LIZ++;
        if (this.LLILLL != null) {
            if (LIZ() && !TextUtils.isEmpty(str) && this.LLJI.containsKey(str) && (bool = this.LLJI.get(str)) != null && bool.booleanValue()) {
                if (LIZJ().LIZIZ() || c1480420ocy.isPlayerSdkEventTrackingEnabled()) {
                    if (!TextUtils.isEmpty(str) && this.LLIZ.containsKey(str) && (l = this.LLIZ.get(str)) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = -1;
                    }
                    final InterfaceC585470Mxl interfaceC585470MxlLIZJ = LIZJ();
                    final InterfaceC1481780ofA interfaceC1481780ofALIZIZ = LIZIZ();
                    final InterfaceC1481730of5 interfaceC1481730of5 = this.LLILLJJLI;
                    final int i = (int) jLongValue;
                    final HashMap<String, Object> map = this.LLILZLL;
                    final String sourceId = c1480420ocy.getSourceId();
                    C603840NmI<String, Long> c603840NmI = C585530Mxr.LIZ;
                    Long lValueOf = c603840NmI.get(sourceId);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(System.currentTimeMillis());
                        c603840NmI.put(sourceId, lValueOf);
                    }
                    C585530Mxr.LIZIZ.put(sourceId, Boolean.TRUE);
                    C585530Mxr.LIZJ.put(sourceId, 2);
                    final int iLJIILJJIL = C1481310oeP.LJIILJJIL(interfaceC1481730of5, sourceId);
                    final int iLJ = C1481310oeP.LJ(interfaceC1481730of5, sourceId);
                    final EnumC585580Mxw enumC585580MxwLIZJ = C1481310oeP.LIZJ(interfaceC585470MxlLIZJ);
                    final SimVideoUrlModel simVideoUrlModelLJIIL = C1481310oeP.LJIIL(interfaceC1481730of5, sourceId);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    final Long l2 = lValueOf;
                    Callable<C1481560oeo> callable = new Callable() { // from class: X.0oei
                        /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
                        /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instruction units count: 1266
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.CallableC1481500oei.call():java.lang.Object");
                        }
                    };
                    Callable<HashMap<String, Object>> callable2 = new Callable() { // from class: X.0Mxt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            HashMap<String, Object> mapLJIILL;
                            EnumC585580Mxw enumC585580Mxw = enumC585580MxwLIZJ;
                            int i2 = i;
                            C1480420ocy c1480420ocy2 = c1480420ocy;
                            InterfaceC585470Mxl interfaceC585470Mxl = interfaceC585470MxlLIZJ;
                            String str2 = sourceId;
                            C1C7U.LIZ("SimReporterSdkImpl@afcb.reportVideoFirstFrameEvent$2L");
                            HashMap map2 = new HashMap();
                            if (EnumC585580Mxw.T_FEED == enumC585580Mxw) {
                                map2.put("is_cache", Integer.valueOf(i2 > 0 ? 1 : 0));
                                map2.put("url_type", Integer.valueOf(c1480420ocy2 == null ? -1 : c1480420ocy2.getUrlProtocolType()));
                            }
                            if (interfaceC585470Mxl != null && (mapLJIILL = interfaceC585470Mxl.LJIILL(str2)) != null && !mapLJIILL.isEmpty()) {
                                map2.putAll(mapLJIILL);
                            }
                            C1C7U.LIZIZ("SimReporterSdkImpl@afcb.reportVideoFirstFrameEvent$2L");
                            return map2;
                        }
                    };
                    if (interfaceC585470MxlLIZJ.LIZJ()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1481610oet.LIZ().reportRenderFirstFrame(sourceId, callable, map, callable2, z);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.LLJI.put(str, false);
                }
            }
            this.LLILLL.onRenderFirstFrame(c1480420ocy);
            this.LLILLL.onRenderFirstFrame(str, c1480420ocy);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onRenderFirstFrame(str, c1480420ocy);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onRenderFirstFrame(str, c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        boolean zLJI = MethodIDManager.LJI(71870);
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onResumePlay(str, c1480430ocz);
            this.LLILLL.onResumePlay(str);
            if (LIZ() && (LIZJ().LJI() || c1480430ocz.LJI)) {
                LJFF(str, true);
                C1481610oet.LIZ().reportVideoOnResume(str, null);
            }
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onResumePlay(str, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onResumePlay(str, c1480430ocz);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(str, c1481290oeN);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onRetryOnError(str, c1481290oeN);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onRetryOnError(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        int iIntValue;
        Integer num;
        if (LIZ() && LIZJ().LJIIIIZZ()) {
            if (str != null) {
                C603840NmI<String, Integer> c603840NmI = C1481310oeP.LIZ;
                if (c603840NmI.containsKey(str) && (num = c603840NmI.get(str)) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int i = iIntValue + 1;
                if (str != null && i > 0) {
                    C1481310oeP.LIZ.put(str, Integer.valueOf(i));
                }
            }
            C1481610oet.LIZ().reportSeekEnd(str);
        }
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onSeekEnd(str, z);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSpeedChanged(str, f);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onSpeedChanged(str, f);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedPercent(str, j, i);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onBufferedPercent(str, j, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onBufferedPercent(str, j, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        if (this.LLILLL != null) {
            if (LIZ() && (LIZJ().LJIIIIZZ() || c1480430ocz.LJI)) {
                C585530Mxr.LIZ(LIZJ(), LIZIZ(), this.LLILLJJLI, str, z, c1480430ocz, true, this.LLILZLL);
            }
            this.LLILLL.onBuffering(str, z, c1480430ocz);
            this.LLILLL.onBuffering(str, z);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onBuffering(str, z, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onBuffering(str, z, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(str, z, c1480430ocz);
            this.LLILLL.onDecoderBuffering(str, z);
            if (LIZ() && (LIZJ().LJIIIIZZ() || c1480430ocz.LJI)) {
                C585530Mxr.LIZ(LIZJ(), LIZIZ(), this.LLILLJJLI, str, z, c1480430ocz, false, this.LLILZLL);
            }
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onDecoderBuffering(str, z, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onDecoderBuffering(str, z, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, final C1481290oeN c1481290oeN, final C1480430ocz c1480430ocz) {
        final float fFloatValue;
        boolean z;
        Float f;
        C603840NmI<String, Integer> c603840NmI;
        Integer num;
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        final String str2 = str;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str2, c1481290oeN, c1480430ocz);
            this.LLILLL.onPlayFailed(str2, c1481290oeN);
            if (LIZ() && (LIZJ().LJIILIIL() || c1480430ocz.LJI)) {
                final InterfaceC585470Mxl interfaceC585470MxlLIZJ = LIZJ();
                final InterfaceC1481780ofA interfaceC1481780ofALIZIZ = LIZIZ();
                final InterfaceC1481730of5 interfaceC1481730of5 = this.LLILLJJLI;
                final HashMap<String, Object> map = this.LLILZLL;
                final Long l = C585530Mxr.LIZ.get(str2);
                final EnumC585580Mxw enumC585580MxwLIZJ = C1481310oeP.LIZJ(interfaceC585470MxlLIZJ);
                final SimVideoUrlModel simVideoUrlModelLJIIL = C1481310oeP.LJIIL(interfaceC1481730of5, str2);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (!C1474810oTv.LLIILZL() && (num = (c603840NmI = C585530Mxr.LIZJ).get(str2)) != null) {
                    if (num.intValue() >= 2 && num.intValue() != 3) {
                        c603840NmI.put(str2, 4);
                    } else if (num.intValue() == 1) {
                        c603840NmI.put(str2, 3);
                    }
                }
                if (interfaceC1481730of5 != null && (f = (Float) interfaceC1481730of5.LJIJI(C1473080oR8.LIZLLL)) != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                Callable<C1481720of4> callable = new Callable(interfaceC1481730of5, simVideoUrlModelLJIIL, str2, enumC585580MxwLIZJ, interfaceC1481780ofALIZIZ, fFloatValue, l, jCurrentTimeMillis, c1480430ocz, interfaceC585470MxlLIZJ, map) { // from class: X.0of2
                    public final /* synthetic */ InterfaceC1481730of5 LLILLJJLI;
                    public final /* synthetic */ SimVideoUrlModel LLILLL;
                    public final /* synthetic */ String LLILZ;
                    public final /* synthetic */ InterfaceC1481780ofA LLILZIL;
                    public final /* synthetic */ float LLILZLL;
                    public final /* synthetic */ Long LLIZ;
                    public final /* synthetic */ long LLIZLLLIL;
                    public final /* synthetic */ C1480430ocz LLJ;
                    public final /* synthetic */ InterfaceC585470Mxl LLJI;
                    public final /* synthetic */ HashMap LLJIJIL;

                    {
                        this.LLILZIL = interfaceC1481780ofALIZIZ;
                        this.LLILZLL = fFloatValue;
                        this.LLIZ = l;
                        this.LLIZLLLIL = jCurrentTimeMillis;
                        this.LLJ = c1480430ocz;
                        this.LLJI = interfaceC585470MxlLIZJ;
                        this.LLJIJIL = map;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x0199 A[LOOP:0: B:57:0x0193->B:59:0x0199, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x01ae  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instruction units count: 475
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.CallableC1481700of2.call():java.lang.Object");
                    }
                };
                ACallableS62S1100000_9 aCallableS62S1100000_9 = new ACallableS62S1100000_9(enumC585580MxwLIZJ, interfaceC585470MxlLIZJ, str2, 4);
                if (interfaceC585470MxlLIZJ.LIZJ()) {
                    z = true;
                } else {
                    z = false;
                }
                str2 = str2;
                C1481610oet.LIZ().reportPlayFailed(str2, callable, map, aCallableS62S1100000_9, z);
            }
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayFailed(str2, c1481290oeN, c1480430ocz);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayFailed(str2, c1481290oeN, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayProgressChange(str, j, j2);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        if (((Boolean) C1474810oTv.c2.getValue()).booleanValue()) {
            if (LIZ() && LIZLLL(str)) {
                if (LIZJ().LJIILJJIL() || c1480430ocz.LJI) {
                    C585530Mxr.LIZIZ(LIZJ(), LIZIZ(), this.LLILLJJLI, jSONObject, str, this.LLILZLL, c1480430ocz);
                }
                LJ(str, false);
            }
            OnUIPlayListener onUIPlayListener = this.LLILLL;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayStop(str, jSONObject, c1480430ocz);
                this.LLILLL.onPlayStop(str, jSONObject);
            }
            C585450Mxj c585450Mxj = this.LLILZIL;
            if (c585450Mxj != null) {
                c585450Mxj.onPlayStop(str, jSONObject, c1480430ocz);
            }
            Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
            while (it2.hasNext()) {
                ((OnUIPlayListener) it2.next()).onPlayStop(str, jSONObject, c1480430ocz);
            }
            return;
        }
        if (this.LLILLL != null) {
            if (LIZ() && LIZLLL(str)) {
                if (LIZJ().LJIILJJIL() || c1480430ocz.LJI) {
                    C585530Mxr.LIZIZ(LIZJ(), LIZIZ(), this.LLILLJJLI, jSONObject, str, this.LLILZLL, c1480430ocz);
                }
                LJ(str, false);
            }
            this.LLILLL.onPlayStop(str, jSONObject, c1480430ocz);
            this.LLILLL.onPlayStop(str, jSONObject);
        }
        C585450Mxj c585450Mxj2 = this.LLILZIL;
        if (c585450Mxj2 != null) {
            c585450Mxj2.onPlayStop(str, jSONObject, c1480430ocz);
        }
        Iterator it3 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it3.hasNext()) {
            ((OnUIPlayListener) it3.next()).onPlayStop(str, jSONObject, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayerInternalEvent(str, i, jSONObject);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onPlayerInternalEvent(str, i, jSONObject);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onPlayerInternalEvent(str, i, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        if (LIZ() && LIZJ().LJIIIIZZ()) {
            C1481610oet.LIZ().reportSeekStart(str, i);
        }
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onSeekStart(str, i, f);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoBitrateChanged(str, enumC2281141EQm, i);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onVideoBitrateChanged(str, enumC2281141EQm, i);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onVideoBitrateChanged(str, enumC2281141EQm, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        OnUIPlayListener onUIPlayListener = this.LLILLL;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoSizeChanged(str, i, i2);
        }
        C585450Mxj c585450Mxj = this.LLILZIL;
        if (c585450Mxj != null) {
            c585450Mxj.onVideoSizeChanged(str, i, i2);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((OnUIPlayListener) it2.next()).onVideoSizeChanged(str, i, i2);
        }
    }
}
