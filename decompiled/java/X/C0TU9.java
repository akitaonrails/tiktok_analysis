package X;

import Y.ARunnableS111S0100000_11;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TU9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TU9 {
    public static final C0TU8 LJJIJIIJI = new C0TU8();
    public static final AtomicBoolean LJJIJIIJIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJJIJIL = new AtomicBoolean(false);
    public static final C01GW<Keva> LJJIJL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(198));
    public boolean LIZIZ;
    public volatile Boolean LIZJ;
    public Boolean LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;
    public boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public String LJIILL;
    public Integer LJIILLIIL;
    public String LJIIZILJ;
    public Long LJIJ;
    public String LJIJI;
    public JSONObject LJIJJ;
    public AwS556S0100000_12 LJIJJLI;
    public boolean LJIL;
    public long LJJIFFI;
    public long LJJII;
    public Long LJJIII;
    public boolean LJJIIJ;
    public C0N0Y LJJIIJZLJL;
    public ARunnableS111S0100000_11 LJJIIZI;
    public final boolean LIZ = C295500Bi8.LIZ();
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIILJJIL = "";
    public String LJJ = "";
    public String LJJI = "";
    public final C01GW LJJIIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS195S0000000_9.get$arr$(214));
    public final C583660Muq LJJIJ = new OnUIPlayListener() { // from class: X.0Muq
        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
            return C583620Mum.LIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            C583620Mum.LIZIZ(this, str, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            C583620Mum.LIZJ(this, str, j, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            C583620Mum.LIZLLL(this, str, j);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBuffering(String str, boolean z) {
            C583620Mum.LJ(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            C583620Mum.LJFF(this, str, z, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBuffering(boolean z) {
            C583620Mum.LJI(this, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            C583620Mum.LJII(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onCrosstalkHappened(String str) {
            C583620Mum.LJIIIIZZ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            C583620Mum.LJIIIZ(this, str, list);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
            C583620Mum.LJIIJ(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onDecoderBuffering(boolean z) {
            C583620Mum.LJIIL(this, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            C583620Mum.LJIILIIL(this, i, j, j2, map);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            C583620Mum.LJIILJJIL(this, str, c1480420ocy);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onLoopPlay(String str, int i) {
            C583620Mum.LJIILL(this, str, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            C583620Mum.LJIILLIIL(this, str, c1480290ocl);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPausePlay(String str) {
            C583620Mum.LJIIZILJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJIJ(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayCompleted(String str) {
            C583620Mum.LJIJI(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayCompleted(String str, int i) {
            C583620Mum.LJIJJ(this, str, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
            C583620Mum.LJIJJLI(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJIL(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayPause(String str) {
            C583620Mum.LJJII(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayPrepare(String str) {
            C583620Mum.LJJIII(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayPrepared(String str) {
            C583620Mum.LJJIIJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayProgressChange(float f) {
            C583620Mum.LJJIIJZLJL(this, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
            C583620Mum.LJJIIZ(this, str, j, j2);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayRelease(String str) {
            C583620Mum.LJJIIZI(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str) {
            C583620Mum.LJJIJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
            C583620Mum.LJJIJIIJI(this, str, jSONObject);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str, boolean z) {
            C583620Mum.LJJIJIL(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            C583620Mum.LJJIJL(this, str, i, jSONObject);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlaying(String str) {
            C583620Mum.LJJIJLIJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJJIL(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            C583620Mum.LJJIZ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPreparePlay(String str) {
            C583620Mum.LJJJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJJJI(this, str, c1480430ocz);
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
        public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJJJJJL(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
            C583620Mum.LJJJJLI(this, c1481290oeN);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            C583620Mum.LJJJJL(this, str, c1481290oeN);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            C583620Mum.LJJJJLL(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            C583620Mum.LJJJJZ(this, str, i, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onSpeedChanged(String str, float f) {
            C583620Mum.LJJJJZI(this, str, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onStopPlay(String str) {
            C583620Mum.LJJJLIIL(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onVideoSecondFrame(String str) {
            C583620Mum.LJJJLZIJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
            C583620Mum.LJJJZ(this, str, i, i2);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(C1481290oeN c1481290oeN) {
            this.LL.LJIIJJI(c1481290oeN);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
            String sourceId;
            C0TU9 c0tu9 = this.LL;
            if (c1480420ocy != null) {
                sourceId = c1480420ocy.getSourceId();
            } else {
                sourceId = null;
            }
            c0tu9.LJI(sourceId);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
            this.LL.LJIIJJI(c1481290oeN);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            C0TU9 c0tu9 = this.LL;
            if (str == null) {
                if (c1480420ocy != null) {
                    str = c1480420ocy.getSourceId();
                } else {
                    str = null;
                }
            }
            c0tu9.LJI(str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            this.LL.LJIIJJI(c1481290oeN);
        }
    };

    public final void LIZJ() {
        try {
            LJJIJIIJI.getClass();
            C0TU8.LIZIZ().erase(this.LJIL ? "pending_payload_photo_v1" : "pending_payload_video_v1");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZLLL() {
        if (this.LJFF && !C1618110sD3.LIZ()) {
            this.LJFF = false;
            LJFF();
        }
    }

    public final void LJ() {
        C0N0Y c0n0y = this.LJJIIJZLJL;
        if (c0n0y == null) {
            return;
        }
        try {
            c0n0y.LJIIL(this.LJJIJ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LJJIIJZLJL = null;
    }

    public final void LJFF() {
        Boolean bool = this.LIZJ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return;
        }
        Long lValueOf = this.LJJIII;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(this.LJJII + (this.LJJIFFI > 0 ? System.currentTimeMillis() - this.LJJIFFI : 0L));
        }
        this.LJJIII = lValueOf;
        this.LIZJ = bool2;
        LJII();
    }

    public final void LJII() {
        boolean zLJFF = this.LJIL ? Intrinsics.LJFF(this.LIZLLL, Boolean.TRUE) : this.LJ;
        if ((this.LJIL ? ((Boolean) C0AF3.LIZ.getValue()).booleanValue() : ((Boolean) C259690AFr.LIZ.getValue()).booleanValue()) && Intrinsics.LJFF(this.LIZJ, Boolean.TRUE) && zLJFF && !this.LJI && this.LJIJJ == null) {
            LJIIL(this, false, null, 3);
            LIZJ();
        }
    }

    public final void LJIIIZ() {
        if (this.LIZIZ) {
            if (this.LJJIFFI > 0) {
                this.LJJII += System.currentTimeMillis() - this.LJJIFFI;
                this.LJJIFFI = 0L;
            }
            if (!((Boolean) C295510Bi9.LIZ.getValue()).booleanValue() || this.LJI) {
                return;
            }
            String str = this.LJII;
            if (str == null || str.length() == 0) {
                return;
            }
            try {
                JSONObject jSONObject = this.LJIJJ;
                JSONObject jSONObject2 = jSONObject != null ? new JSONObject(C786410Ut5.J3(jSONObject)) : LIZIZ(false, null);
                jSONObject2.put("_pause_ts", System.currentTimeMillis());
                jSONObject2.put("_tracks_first_image_render", this.LJIL ? 1 : 0);
                LJJIJIIJI.getClass();
                C0TU8.LIZIZ().storeString(this.LJIL ? "pending_payload_photo_v1" : "pending_payload_video_v1", C786410Ut5.J3(jSONObject2));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final boolean LIZ(C0N0Y c0n0y) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        if (!this.LIZIZ) {
            return false;
        }
        C0N0Y c0n0y2 = this.LJJIIJZLJL;
        if (c0n0y2 == c0n0y) {
            return true;
        }
        if (c0n0y2 != null) {
            LJ();
        }
        if (c0n0y == null) {
            return false;
        }
        try {
            c0n0y.LJJIJIIJIL(this.LJJIJ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            this.LJJIIJZLJL = c0n0y;
            try {
                c098200Yq2 = Boolean.valueOf(c0n0y.isPlaying());
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = bool;
            }
            if (((Boolean) c098200Yq2).booleanValue()) {
                try {
                    c098200Yq3 = c0n0y.LJJJLIIL();
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                    c098200Yq3 = null;
                }
                LJI((String) c098200Yq3);
            }
        }
        return C189200o6.m8isSuccessimpl(c098200Yq);
    }

    public final void LJI(String str) {
        Object c098200Yq;
        String str2;
        Object c098200Yq2;
        boolean z;
        try {
            IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) PluggableExtentionKt.pluggableSpi$default(IMandatoryLoginService.class, false, false, false, 14, null);
            if (iMandatoryLoginService != null && iMandatoryLoginService.shouldShowForcedLogin(false)) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        if (!((Boolean) c098200Yq).booleanValue() && (str2 = this.LJII) != null && str2.length() > 0) {
            Object obj = null;
            if (1 != 0) {
                String str3 = this.LJIIIIZZ;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                if (str == null || str.length() <= 0) {
                    try {
                        C0N0Y c0n0y = this.LJJIIJZLJL;
                        if (c0n0y != null) {
                            c098200Yq2 = c0n0y.LJJJLIIL();
                        } else {
                            c098200Yq2 = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                        obj = c098200Yq2;
                    }
                    str = (String) obj;
                    if (str == null) {
                        return;
                    }
                }
                if (str.length() != 0) {
                    if (Intrinsics.LJFF(str, str2) || (str3 != null && Intrinsics.LJFF(str, str3))) {
                        if (C1618110sD3.LIZ()) {
                            this.LJFF = true;
                        } else {
                            LJFF();
                        }
                    }
                }
            }
        }
    }

    public final void LJIIIIZZ(C0TUB c0tub) {
        if (!this.LIZIZ) {
            return;
        }
        ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LJJIIZI;
        if (aRunnableS111S0100000_11 != null) {
            ((Handler) this.LJJIIZ.getValue()).removeCallbacks(aRunnableS111S0100000_11);
        }
        this.LJJIIZI = null;
        if (!this.LJI) {
            LJIIL(this, false, c0tub, 1);
        }
        LIZJ();
        LJ();
    }

    public final void LJIIJ(C0TUB c0tub) {
        if (!this.LIZ || !c0tub.LIZ) {
            return;
        }
        if (!c0tub.LJIILJJIL && !C295520BiA.LIZ()) {
            return;
        }
        this.LIZIZ = true;
        if (this.LJII != null) {
            return;
        }
        this.LJIL = c0tub.LJIILJJIL;
        this.LJII = c0tub.LIZIZ;
        this.LJIIIIZZ = c0tub.LIZJ;
        this.LJIIIZ = c0tub.LIZLLL;
        this.LJIIJ = c0tub.LJ;
        this.LJIIJJI = c0tub.LJFF ? 1 : 0;
        this.LJIIL = c0tub.LJI ? 1 : 0;
        this.LJIILIIL = c0tub.LJII;
        this.LJIILJJIL = c0tub.LJIIIIZZ;
        this.LJIILL = c0tub.LJIIIZ;
        this.LJIILLIIL = c0tub.LJIIJ;
        this.LJIIZILJ = c0tub.LJIIJJI;
        this.LJIJ = c0tub.LJIIL;
        this.LJIJI = c0tub.LJIILIIL;
        long jLongValue = ((Number) C277490AuB.LIZ.getValue()).longValue();
        if (jLongValue > 0 && this.LJJIIZI == null) {
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = new ARunnableS111S0100000_11(this, 41);
            this.LJJIIZI = aRunnableS111S0100000_11;
            C786410Ut5.LJLIIL(jLongValue, (Handler) this.LJJIIZ.getValue(), aRunnableS111S0100000_11);
        }
    }

    public final void LJIIJJI(C1481290oeN c1481290oeN) {
        String string;
        if (c1481290oeN == null) {
            return;
        }
        this.LJJ = String.valueOf(c1481290oeN.LJ);
        Object obj = c1481290oeN.LJI;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        String strLIZIZ = "";
        if (string == null) {
            string = "";
        }
        int i = c1481290oeN.LJFF;
        if (string.length() > 0) {
            strLIZIZ = string;
        } else if (i != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sub_code=");
            sbLIZ.append(i);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LJJI = strLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZIZ(boolean r32, X.C0TUB r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TU9.LIZIZ(boolean, X.0TUB):org.json.JSONObject");
    }

    public static void LJIIL(C0TU9 c0tu9, boolean z, C0TUB c0tub, int i) {
        JSONObject jSONObjectLIZIZ;
        if ((i & 1) != 0) {
            z = false;
        }
        C0TUB c0tub2 = null;
        if ((i & 2) != 0) {
            c0tub = null;
        }
        if (!c0tu9.LJI) {
            c0tu9.LJI = true;
            c0tu9.LIZLLL();
            JSONObject jSONObject = c0tu9.LJIJJ;
            if (jSONObject != null) {
                jSONObjectLIZIZ = new JSONObject(C786410Ut5.J3(jSONObject));
            } else {
                if (c0tub == null) {
                    AwS556S0100000_12 awS556S0100000_12 = c0tu9.LJIJJLI;
                    if (awS556S0100000_12 != null) {
                        c0tub2 = (C0TUB) awS556S0100000_12.invoke();
                    }
                } else {
                    c0tub2 = c0tub;
                }
                jSONObjectLIZIZ = c0tu9.LIZIZ(z, c0tub2);
            }
            C20684815ws.LJIJ("explore_card_play_attribution", jSONObjectLIZIZ);
        }
    }
}
