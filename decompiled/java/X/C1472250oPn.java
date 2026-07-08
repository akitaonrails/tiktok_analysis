package X;

import Y.AComparatorS42S0000000_23;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.playerkit.exp.model.ConfigCenterBlockList;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.AudioProxyTrait;
import com.ss.ttm.player.TTRVideoTrait;
import com.ss.ttm.player.VoiceTrait;
import com.ss.ttm.player.s;
import com.ss.ttm.player.x;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.tts.oecverify.BdTuring;
import cxo.s0;
import fyo.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472250oPn extends AbstractC1472670oQT implements s0, InterfaceC1471960oPK, InterfaceC1472340oPw, InterfaceC1472230oPl, InterfaceC1467980oIu {
    public static volatile boolean LLLILZLLLI = false;
    public static volatile boolean LLLIZZ = false;
    public static volatile boolean LLLJ = true;
    public static volatile boolean LLLJIL;
    public static volatile WeakReference<Surface> LLLJL;
    public final Context LL;
    public final SparseIntArray LLILLJJLI;
    public final SparseArray LLILLL;
    public final C1480980ods LLILZ;
    public C1472150oPd LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public volatile String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public Surface LLJIJIL;
    public Surface LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public InterfaceC1472350oPx LLJJ;
    public final C1472820oQi LLJLLL;
    public final C1473490oRn LLLIIIL;
    public final C1469680oLe LLLIIL;
    public final C1470220oMW LLLIILIL;
    public final C1473510oRp LLLIL;
    public final C1472730oQZ LLLILZ;
    public final C1472260oPo LLLILZJ;
    public final C1472130oPb LLJJI = new InterfaceC1469360oL8() { // from class: X.0oPb
        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJI(e eVar) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJJ(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJJLI(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJII(int i, int i2) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJIIJ(int i, int i2) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJIJ(Map map) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJL(e eVar, String str) {
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJ(TTVideoEngine tTVideoEngine) {
            int iLJJJJZI;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRenderStart() called with: engine = [");
                sbLIZ.append(tTVideoEngine);
                sbLIZ.append("] mFromResume:");
                sbLIZ.append(this.LL.LLILZLL);
                sbLIZ.append(", ");
                sbLIZ.append(SystemClock.elapsedRealtime());
                sbLIZ.append(" sourceId ");
                sbLIZ.append(this.LL.LLJ);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            Surface surface = this.LL.LLJIJIL;
            if (surface != null) {
                TextureView textureViewLIZJ = C1471640oOo.LIZJ(surface);
                if ((textureViewLIZJ instanceof C1473810oSJ) && ((iLJJJJZI = tTVideoEngine.LJJJJZI(43)) <= 0 || iLJJJJZI == 2)) {
                    C1473810oSJ c1473810oSJ = (C1473810oSJ) textureViewLIZJ;
                    if (C1481110oe5.LIZ) {
                        c1473810oSJ.getClass();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("cancelMarkNeedReCreateSurface keepSurfaceTexture:");
                        sbLIZ2.append(c1473810oSJ.LL);
                        sbLIZ2.append(", surface ");
                        sbLIZ2.append(c1473810oSJ.LLILLJJLI);
                        C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    c1473810oSJ.LLILLL = false;
                }
            }
            C1472250oPn c1472250oPn = this.LL;
            if (c1472250oPn.LLILZLL) {
                c1472250oPn.LLJJIII.LJLJJL();
            } else {
                c1472250oPn.LLJJIII.LJLIIIL();
            }
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            this.LL.LLJJIII.LJLLI();
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPrepare() called with: engine = [");
                sbLIZ.append(tTVideoEngine);
                sbLIZ.append("], ");
                sbLIZ.append(SystemClock.elapsedRealtime());
                sbLIZ.append(" sourceId ");
                sbLIZ.append(this.LL.LLJ);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LL.LLJJIII.onPrepare();
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
            C1472250oPn c1472250oPn;
            C1472150oPd c1472150oPd;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPrepared() called with: engine = [");
                sbLIZ.append(tTVideoEngine);
                sbLIZ.append("], ");
                sbLIZ.append(SystemClock.elapsedRealtime());
                sbLIZ.append(" sourceId ");
                sbLIZ.append(this.LL.LLJ);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LL.LLJJIII.onPrepared();
            if (TextUtils.isEmpty(this.LL.LLIZLLLIL) && (c1472150oPd = (c1472250oPn = this.LL).LLILZIL) != null) {
                c1472250oPn.LLIZLLLIL = c1472150oPd.LJJJI();
            }
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIILL(TTVideoEngine tTVideoEngine) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompletion() called with: engine = [");
                sbLIZ.append(tTVideoEngine);
                sbLIZ.append(e3.f);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LL.LLJJIII.onCompletion();
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJJLIIIIJ(int i) {
            SurfaceHolder surfaceHolderLIZ;
            InterfaceC1472350oPx interfaceC1472350oPx;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceControlResetSurface. reason:");
                sbLIZ.append(i);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            Surface surface = this.LL.LLJILJIL;
            if (surface != null && (surfaceHolderLIZ = C1471640oOo.LIZ(surface)) != null) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("TTPlayer", "do retrySetSurface. add for adapt surfaceControl");
                }
                if (C1472280oPq.LIZLLL() && C1471640oOo.LIZIZ(this.LL.LLJILJIL) != null && (interfaceC1472350oPx = this.LL.LLJJ) != null) {
                    C1472280oPq.LIZ(interfaceC1472350oPx);
                    this.LL.LLJJ = null;
                }
                this.LL.LLILZIL.LLIZ(surfaceHolderLIZ);
                if (i == 4) {
                    this.LL.LLILZIL.LLJJJJ();
                }
            }
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(this.LL.LLJ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onPreRenderReady");
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReadyForDisplay() called with: engine = [");
                sbLIZ2.append(tTVideoEngine);
                sbLIZ2.append(e3.f);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LL.LLJJIII.LJJZZIII();
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBufferingUpdate() called with: engine = [");
                sbLIZ.append(tTVideoEngine);
                sbLIZ.append("], percent = [");
                sbLIZ.append(i);
                sbLIZ.append(e3.f);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            long jLJJJJLI = (long) (this.LL.LJJJJLI() * (i / 100.0f));
            this.LL.LLJJIII.LJLJLJ(jLJJJJLI);
            this.LL.LLJJIII.LJLILLLLZI(i, jLJJJJLI);
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStreamChanged() called with: type = [");
                sbLIZ.append(i);
                sbLIZ.append(e3.f);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIL(TTVideoEngine tTVideoEngine, int i) {
            this.LL.LLJJIII.LJLJJI(i);
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
            boolean z;
            Surface surface = this.LL.LLJIJIL;
            if (surface != null) {
                TextureView textureViewLIZJ = C1471640oOo.LIZJ(surface);
                if (textureViewLIZJ instanceof C1473810oSJ) {
                    C1473810oSJ c1473810oSJ = (C1473810oSJ) textureViewLIZJ;
                    boolean z2 = true;
                    if (c1473810oSJ.LLILZLL == 2 && (i != c1473810oSJ.LLILZ || i2 != c1473810oSJ.LLILZIL)) {
                        c1473810oSJ.LLILZLL = 13;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c1473810oSJ.LLILZLL == 3 && i == c1473810oSJ.LLILZ && i2 == c1473810oSJ.LLILZIL) {
                        c1473810oSJ.LLILZLL = 12;
                    } else {
                        z2 = z;
                    }
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reCheckVideoSize reuseState:");
                        sbLIZ.append(c1473810oSJ.LLILZLL);
                        sbLIZ.append(", lastBindVideoWidth:");
                        sbLIZ.append(c1473810oSJ.LLILZ);
                        sbLIZ.append(", lastBindVideoHeight:");
                        sbLIZ.append(c1473810oSJ.LLILZIL);
                        sbLIZ.append(", width:");
                        sbLIZ.append(i);
                        sbLIZ.append(", height:");
                        sbLIZ.append(i2);
                        C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    c1473810oSJ.LLILZ = i;
                    c1473810oSJ.LLILZIL = i2;
                    if (z2) {
                        this.LL.LLILZIL.LIZJ(1807, c1473810oSJ.getSurfaceTextureReuseState());
                    }
                }
            }
            this.LL.LLJJIII.onVideoSizeChanged(i, i2);
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
            long j;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlaybackStateChanged() called with: engine = [");
                sbLIZ.append(tTVideoEngine);
                sbLIZ.append("], playbackState = [");
                sbLIZ.append(i);
                sbLIZ.append(e3.f);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            int i2 = this.LL.LLJILLL;
            if (((Boolean) C1474810oTv.P3.getValue()).booleanValue() && (i2 == i || (i2 == 0 && 2 == i))) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ignore state change, from: ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", to: ");
                    sbLIZ2.append(i);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            C1472250oPn c1472250oPn = this.LL;
            c1472250oPn.LLJILLL = i;
            if (i == 1) {
                c1472250oPn.LLJJIII.LJJZ();
                return;
            }
            if (i == 0) {
                if (c1467860oIi != null) {
                    j = c1467860oIi.LIZ;
                } else {
                    j = -1;
                }
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onPlaybackStateChanged() stopped current position ");
                    sbLIZ3.append(j);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LL.LLJJIII.LJLLILLLL(j);
                return;
            }
            if (i != 2) {
                return;
            }
            c1472250oPn.LLJJIII.LJJZZI();
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map<Integer, String> map) {
            this.LL.LLJJIII.onFrameAboutToBeRendered(i, j, j2, map);
        }
    };
    public InterfaceC1472110oPZ LLJJIII = new InterfaceC1472110oPZ() { // from class: X.0oPJ
        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJJZ() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJJZZI() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void LJJZZIII() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJL(boolean z) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLI(int i, int i2, String str) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void LJLIIIL() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void LJLIIL(EnumC2281141EQm enumC2281141EQm, int i) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLIL(float f) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLILLLLZI(int i, long j) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLJI(float f, int i) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLJJI(int i) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLJJL() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLJJLL() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void LJLJL(int i, int i2, Object obj, Map map) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void LJLJLJ(long j) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLJLLL(int i, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLL(List list) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLLI() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void LJLLILLLL(long j) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void onBuffering(boolean z) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void onCompletion() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        }

        @Override // X.InterfaceC1472110oPZ
        public final /* synthetic */ void onPrepare() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void onPrepared() {
        }

        @Override // X.InterfaceC1472110oPZ
        public final void onVideoSizeChanged(int i, int i2) {
        }
    };
    public float LLJJIJI = 1.0f;
    public final C1469490oLL LLJJIJIIJIL = new C1469760oLm(this) { // from class: X.0oLL
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIJIIJI() {
            int iIntValue;
            C1480980ods c1480980odsUe = this.LLILLJJLI.ue();
            if (c1480980odsUe != null && 1 == c1480980odsUe.LJJIFFI && (iIntValue = ((Number) C1474810oTv.LLLLZLL.getValue()).intValue()) > 0) {
                try {
                    Class cls = Integer.TYPE;
                    x.class.getDeclaredMethod("LJI", cls, cls).invoke(null, 25, Integer.valueOf(iIntValue));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }

        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIIJZLJL(Map<String, Object> map) {
            C1472150oPd player;
            C1480980ods c1480980odsUe = this.LLILLJJLI.ue();
            if (c1480980odsUe == null || (player = this.LLILLJJLI.getPlayer()) == null) {
                return;
            }
            player.LIZJ(411, c1480980odsUe.LJJIFFI);
        }
    };
    public final C1471980oPM LLJJIJIL = new C1471980oPM(this);
    public final C1469460oLI LLJJJ = new C1469760oLm(this) { // from class: X.0oLI
        public final C1467710oIT LLILLL = new C1467710oIT(this);

        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJI() {
            C1472150oPd player = this.LLILLJJLI.getPlayer();
            if (player == null) {
                return;
            }
            int i = this.LLILLJJLI.LJIIIZ().get(59, 0);
            player.LIZJ(664, i);
            if (1 == i) {
                player.LIZ.LLLLZLLLI = this.LLILLL;
            }
        }
    };
    public final C1472320oPu LLJJJIL = new C1472320oPu(this);
    public final C1473320oRW LLJJJJ = new C1473320oRW(this);
    public final C1472840oQk LLJJJJJIL = new C1472840oQk(this);
    public final C1469450oLH LLJJJJLIIL = new C1469760oLm(this) { // from class: X.0oLH
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJI() {
            LIZLLL(2);
        }

        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final int getOrder() {
            return Integer.MIN_VALUE;
        }

        public final void LIZLLL(int i) {
            C1480980ods c1480980odsUe;
            List<C308310C6r> list;
            int i2;
            int i3;
            C1472150oPd player = this.LLILLJJLI.getPlayer();
            if (player != null && (c1480980odsUe = this.LLILLJJLI.ue()) != null && (list = c1480980odsUe.LJJJJLL) != null && list.size() > 0) {
                for (C308310C6r c308310C6r : list) {
                    if (c308310C6r.LIZIZ != null && c308310C6r.LIZLLL == i && (!C1474810oTv.LJJJJLL() || 40000 > (i2 = c308310C6r.LIZ) || i2 >= 50000 || i2 < C1474810oTv.LLILZLL() || c308310C6r.LIZ > C1474810oTv.LLIZ() || (((i3 = c308310C6r.LIZLLL) != 3 && i3 != 2) || ((ConfigCenterBlockList) C1474810oTv.m1.getValue()).isBlocked(c308310C6r.LIZ)))) {
                        try {
                            int i4 = c308310C6r.LIZJ;
                            if (i4 == 1) {
                                player.LIZJ(c308310C6r.LIZ, ((Integer) c308310C6r.LIZIZ).intValue());
                            } else if (i4 == 2) {
                                player.LIZIZ(c308310C6r.LIZ, ((Long) c308310C6r.LIZIZ).longValue());
                            } else if (i4 == 3) {
                                player.LLD(((Float) c308310C6r.LIZIZ).floatValue(), c308310C6r.LIZ);
                            } else if (i4 == 4) {
                                player.LIZ(c308310C6r.LIZ, (String) c308310C6r.LIZIZ);
                            } else if (i4 == 5) {
                                player.LIZ(c308310C6r.LIZ, C786410Ut5.J3((JSONObject) c308310C6r.LIZIZ));
                            } else if (i4 == 6) {
                                player.LIZ(c308310C6r.LIZ, ((JSONArray) c308310C6r.LIZIZ).toString());
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        }

        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIIJZLJL(Map<String, Object> map) {
            LIZLLL(3);
        }
    };
    public final C1472950oQv LLJJL = new C1469760oLm(this) { // from class: X.0oQv
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIIJZLJL(Map<String, Object> map) {
            int iIntValue;
            C1472900oQq c1472900oQq;
            int iLJ;
            int iIntValue2;
            int iIntValue3;
            int iIntValue4;
            int iIntValue5;
            C1472150oPd player = this.LLILLJJLI.getPlayer();
            if (player == null) {
                return;
            }
            boolean zBooleanValue = ((Boolean) map.get("prepare_only")).booleanValue();
            C1480980ods c1480980odsUe = this.LLILLJJLI.ue();
            if (c1480980odsUe == null || (iIntValue = c1480980odsUe.LJJII) <= 0) {
                iIntValue = 512000;
            }
            C01GW c01gw = C1474810oTv.LLLIIL;
            int i = 0;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                if (map.get("duration") == null || (iIntValue4 = ((Integer) map.get("duration")).intValue() / LSPassThroughRecordSizeConfig.DEFAULT) <= 0) {
                    iIntValue4 = ((Number) C1474810oTv.LLLIIIIL.getValue()).intValue();
                }
                if (iIntValue4 >= ((Number) c01gw.getValue()).intValue()) {
                    if (map.get("is_dash") != null && ((Boolean) map.get("is_dash")).booleanValue()) {
                        iIntValue = ((Number) C1474810oTv.LLLILZ.getValue()).intValue();
                    } else {
                        iIntValue = Math.min(iIntValue4 * 30 * ((Number) C1474810oTv.LLLIILIL.getValue()).intValue(), ((Number) C1474810oTv.LLLIL.getValue()).intValue());
                    }
                }
                if (map.get("bitrate") != null) {
                    iIntValue5 = ((Integer) map.get("bitrate")).intValue();
                } else {
                    iIntValue5 = 0;
                }
                iIntValue += (((Number) C1474810oTv.LLLIIIL.getValue()).intValue() * iIntValue5) / 8;
            }
            boolean zBooleanValue2 = ((Boolean) map.get("header_prepare_only_range_request")).booleanValue();
            boolean zBooleanValue3 = ((Boolean) map.get("header_prepare_need_check_cache_size")).booleanValue();
            int iIntValue6 = ((Number) C1474810oTv.LLLILZJ.getValue()).intValue();
            int iIntValue7 = ((Number) C1474810oTv.LLLILZLLLI.getValue()).intValue();
            if (iIntValue6 > 0 && iIntValue7 > 0 && (c1472900oQq = (C1472900oQq) C1472050oPT.LIZ("video_extra", map)) != null && c1472900oQq.getFrameOffsets() != null && (iLJ = C1475150oUT.LJ(c1472900oQq.getFrameOffsets(), iIntValue6, iIntValue7)) > 0) {
                if (zBooleanValue3) {
                    iIntValue2 = ((Number) C1474810oTv.LLLIZZ.getValue()).intValue();
                    iIntValue3 = ((Number) C1474810oTv.LLLJ.getValue()).intValue();
                } else {
                    iIntValue2 = ((Number) C1474810oTv.LLLJIL.getValue()).intValue();
                    iIntValue3 = ((Number) C1474810oTv.LLLJL.getValue()).intValue();
                }
                if (iIntValue2 > 0) {
                    if (iIntValue3 > iIntValue2) {
                        iLJ = Math.max(iIntValue2, Math.min(iLJ, iIntValue3));
                    } else {
                        iLJ = Math.max(iIntValue2, iLJ);
                    }
                } else {
                    if (iIntValue3 > 0) {
                        iLJ = Math.min(iIntValue3, iLJ);
                    }
                    iIntValue = iLJ;
                }
                if (iLJ > 0) {
                    iIntValue = iLJ;
                }
            }
            if (zBooleanValue && zBooleanValue2) {
                i = 2;
            }
            player.LJLL(i, iIntValue);
        }
    };
    public final C1472860oQm LLJJLIIIJLLLLLLLZ = new C1472860oQm(this);
    public final C1469470oLJ LLJL = new C1469470oLJ(this);
    public final C1471570oOh LLJLIL = new C1469760oLm(this) { // from class: X.0oOh
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJI() {
            C1472150oPd player = this.LLILLJJLI.getPlayer();
            if (player == null) {
                return;
            }
            player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oOg
                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJI(e eVar) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJLI(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJII(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIIJ(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIJ(Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJL(e eVar, String str) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJ(TTVideoEngine tTVideoEngine) {
                    C1471570oOh c1471570oOh = this.LL;
                    C1472150oPd player2 = c1471570oOh.LLILLJJLI.getPlayer();
                    if (player2 != null) {
                        if (player2.LJJJJZI(43) == 2) {
                            C1472150oPd player3 = c1471570oOh.LLILLJJLI.getPlayer();
                            if (player3 != null) {
                                Parcelable parcelable = player3.LIZ.LJIIL;
                                if (parcelable instanceof InterfaceC1471580oOi) {
                                    ((InterfaceC1471580oOi) parcelable).LJIILIIL("Render-Hardware", true);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C1472150oPd player4 = c1471570oOh.LLILLJJLI.getPlayer();
                        if (player4 == null) {
                            return;
                        }
                        Parcelable parcelable2 = player4.LIZ.LJIIL;
                        if (!(parcelable2 instanceof InterfaceC1471580oOi)) {
                            return;
                        }
                        ((InterfaceC1471580oOi) parcelable2).LJIILIIL("Render-Software", false);
                    }
                }
            });
        }
    };
    public final C1471630oOn LLJLILLLLZIIL = new C1471630oOn(this);
    public final C1473530oRr LLJLL = new C1469760oLm(this) { // from class: X.0oRr
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJJIIJZLJL(java.util.Map<java.lang.String, java.lang.Object> r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1473530oRr.LJJIIJZLJL(java.util.Map):void");
        }
    };
    public final C1471470oOX LLJLLIL = new C1471470oOX(this);
    public final C1471590oOj LLJZ = new C1471590oOj(this);
    public final C1471610oOl LLJZIJLIL = new C1471610oOl(this);
    public final C1473230oRN LLL = new C1469760oLm(this) { // from class: X.0oRN
        public final Map<String, String> LLILLL = new HashMap();

        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJI() {
            C1472150oPd player = this.LLILLJJLI.getPlayer();
            if (player == null) {
                return;
            }
            if (((Boolean) C1474810oTv.LLJLLIL.getValue()).booleanValue() && !C1474930oU7.LJFF) {
                SimRadar.keyScan("CBOF", "[VolumeBalance] EngineVolumeBalanceHelper onAfterEnsurePlayer skip", new Object[0]);
                return;
            }
            int i = this.LLILLJJLI.LJIIIZ().get(28);
            player.LIZJ(329, i);
            SparseArray sparseArrayLJJIIZ = this.LLILLJJLI.LJJIIZ();
            Float fValueOf = Float.valueOf(0.0f);
            float fFloatValue = ((Float) sparseArrayLJJIIZ.get(29, fValueOf)).floatValue();
            float fFloatValue2 = ((Float) sparseArrayLJJIIZ.get(30, fValueOf)).floatValue();
            float fFloatValue3 = ((Float) sparseArrayLJJIIZ.get(31, fValueOf)).floatValue();
            float fFloatValue4 = ((Float) sparseArrayLJJIIZ.get(32, fValueOf)).floatValue();
            if (i == 1) {
                player.LLD(fFloatValue, 325);
                player.LLD(fFloatValue2, 326);
                player.LLD(fFloatValue3, 327);
                player.LLD(fFloatValue4, 328);
            }
        }

        @Override // X.C1469760oLm, X.InterfaceC1472340oPw
        public final Map<String, String> LJIL() {
            return this.LLILLL;
        }

        @Override // X.C1469760oLm, X.InterfaceC1472340oPw
        public final Map<String, String> LJJIII() {
            return this.LLILLL;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(38:15|(1:53)(1:19)|20|(1:52)(1:24)|25|(1:51)(1:29)|30|(1:50)(1:34)|35|(1:49)(1:39)|40|(1:48)(1:44)|45|(31:47|243|54|239|55|237|56|(0)(1:72)|73|(1:75)(1:86)|76|(20:78|(1:80)|81|(1:83)(1:87)|234|88|(1:90)(1:94)|91|(3:93|236|95)|96|(1:98)|(1:102)|103|(1:109)|(4:113|(1:115)|245|116)|120|125|(2:127|(1:129))|130|(2:132|133)(7:134|(2:136|(2:138|(2:140|(1:142))(2:172|(2:174|(1:176)))))(2:177|(3:(1:180)(4:184|(1:186)|187|(0))|181|(1:183))(6:190|(5:(1:193)(4:201|(1:203)|204|(0))|194|(1:196)|(3:198|(1:200)|144)|230)(2:207|(2:209|(7:215|(1:217)|218|(4:220|(1:222)|223|(0))|225|(3:227|(1:229)|144)|230)(2:213|214))(2:231|(1:250)))|145|(2:147|(1:247))(1:(2:154|(2:156|(5:158|241|159|(3:161|(3:163|(1:165)|166)|167)|170)(1:171)))(1:249))|149|(2:151|152)(1:248)))|(1:144)(1:230)|145|(0)(0)|149|(0)(0)))(1:84)|85|81|(0)(0)|234|88|(0)(0)|91|(0)|96|(0)|(2:100|102)|103|(3:105|107|109)|(5:111|113|(0)|245|116)|120|125|(0)|130|(0)(0))(1:63)|67|73|(0)(0)|76|(0)(0)|85|81|(0)(0)|234|88|(0)(0)|91|(0)|96|(0)|(0)|103|(0)|(0)|120|125|(0)|130|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x029f, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x022e A[Catch: Exception -> 0x029d, TryCatch #1 {Exception -> 0x029d, blocks: (B:95:0x0217, B:98:0x0226, B:100:0x022e, B:102:0x0234, B:103:0x023f, B:105:0x024a, B:107:0x0252, B:109:0x0258, B:111:0x0261, B:113:0x0267, B:115:0x027d, B:116:0x0286, B:118:0x028f, B:119:0x0297, B:120:0x0298), top: B:236:0x0217, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x024a A[Catch: Exception -> 0x029d, TryCatch #1 {Exception -> 0x029d, blocks: (B:95:0x0217, B:98:0x0226, B:100:0x022e, B:102:0x0234, B:103:0x023f, B:105:0x024a, B:107:0x0252, B:109:0x0258, B:111:0x0261, B:113:0x0267, B:115:0x027d, B:116:0x0286, B:118:0x028f, B:119:0x0297, B:120:0x0298), top: B:236:0x0217, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0261 A[Catch: Exception -> 0x029d, TryCatch #1 {Exception -> 0x029d, blocks: (B:95:0x0217, B:98:0x0226, B:100:0x022e, B:102:0x0234, B:103:0x023f, B:105:0x024a, B:107:0x0252, B:109:0x0258, B:111:0x0261, B:113:0x0267, B:115:0x027d, B:116:0x0286, B:118:0x028f, B:119:0x0297, B:120:0x0298), top: B:236:0x0217, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x027d A[Catch: Exception -> 0x029d, TRY_LEAVE, TryCatch #1 {Exception -> 0x029d, blocks: (B:95:0x0217, B:98:0x0226, B:100:0x022e, B:102:0x0234, B:103:0x023f, B:105:0x024a, B:107:0x0252, B:109:0x0258, B:111:0x0261, B:113:0x0267, B:115:0x027d, B:116:0x0286, B:118:0x028f, B:119:0x0297, B:120:0x0298), top: B:236:0x0217, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x02a7  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02cf  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x033c  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0347  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0357  */
        /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01f8 A[Catch: Exception -> 0x029f, TryCatch #0 {Exception -> 0x029f, blocks: (B:88:0x01f2, B:90:0x01f8, B:91:0x01fd, B:93:0x0203, B:94:0x020e), top: B:234:0x01f2 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0203 A[Catch: Exception -> 0x029f, TryCatch #0 {Exception -> 0x029f, blocks: (B:88:0x01f2, B:90:0x01f8, B:91:0x01fd, B:93:0x0203, B:94:0x020e), top: B:234:0x01f2 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x020e A[Catch: Exception -> 0x029f, TRY_LEAVE, TryCatch #0 {Exception -> 0x029f, blocks: (B:88:0x01f2, B:90:0x01f8, B:91:0x01fd, B:93:0x0203, B:94:0x020e), top: B:234:0x01f2 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0226 A[Catch: Exception -> 0x029d, TryCatch #1 {Exception -> 0x029d, blocks: (B:95:0x0217, B:98:0x0226, B:100:0x022e, B:102:0x0234, B:103:0x023f, B:105:0x024a, B:107:0x0252, B:109:0x0258, B:111:0x0261, B:113:0x0267, B:115:0x027d, B:116:0x0286, B:118:0x028f, B:119:0x0297, B:120:0x0298), top: B:236:0x0217, inners: #6 }] */
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJJIIJZLJL(java.util.Map<java.lang.String, java.lang.Object> r35) {
            /*
                Method dump skipped, instruction units count: 1557
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1473230oRN.LJJIIJZLJL(java.util.Map):void");
        }

        public static float LJFF(int i, String str) {
            JSONObject jSONObject;
            double dOptDouble;
            float f = 0.0f;
            if (TextUtils.isEmpty(str)) {
                return 0.0f;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        dOptDouble = jSONObject.optDouble("large_spl_target_LU", 0.0d);
                    }
                    return f;
                }
                dOptDouble = jSONObject.optDouble("medium_spl_target_LU", 0.0d);
            } else {
                dOptDouble = jSONObject.optDouble("small_spl_target_LU", 0.0d);
            }
            f = (float) dOptDouble;
            return f;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final float LIZLLL(float f, Map map) {
            float fFloatValue;
            String simpleName;
            if (map.get("strategy_loud_target_future") != null && (map.get("strategy_loud_target_future") instanceof Future) && f != 0.0f) {
                SparseIntArray sparseIntArrayLJIIIZ = this.LLILLJJLI.LJIIIZ();
                int i = sparseIntArrayLJIIIZ.get(105);
                boolean z = true;
                if (sparseIntArrayLJIIIZ.get(106) != 1) {
                    z = false;
                }
                try {
                    fFloatValue = ((Float) ((Future) map.get("strategy_loud_target_future")).get(i, TimeUnit.MILLISECONDS)).floatValue();
                    if (fFloatValue != 0.0f && fFloatValue != Float.MIN_VALUE && z) {
                        f += fFloatValue;
                    }
                    if (fFloatValue == Float.MIN_VALUE) {
                        simpleName = "AlgTaskFailed";
                    } else {
                        simpleName = "Success";
                    }
                } catch (Exception e) {
                    fFloatValue = 0.0f;
                    TryCatchGuardChecker.doCheck(e);
                    if (e.getCause() != null) {
                        simpleName = e.getCause().getMessage();
                    } else {
                        simpleName = e.getClass().getSimpleName();
                    }
                }
                ((HashMap) this.LLILLL).put("loudness_strategy_success", simpleName);
                ((HashMap) this.LLILLL).put("loud_target_offset_value", String.valueOf(fFloatValue));
                ((HashMap) this.LLILLL).put("loud_target_offset_apply", String.valueOf(z));
                ((HashMap) this.LLILLL).put("target_loudness", String.valueOf(f));
            }
            if (((Integer) map.get("scene_loudness_offset")).intValue() != 0 && map.get("vod_scene_tag") != null && f != 0.0f) {
                int iIntValue = ((Integer) map.get("scene_loudness_offset")).intValue();
                float f2 = f + iIntValue;
                ((HashMap) this.LLILLL).put("vod_scene_tag", String.valueOf(map.get("vod_scene_tag")));
                ((HashMap) this.LLILLL).put("scene_loudness_offset", String.valueOf(iIntValue));
                ((HashMap) this.LLILLL).put("target_loudness", String.valueOf(f2));
                return f2;
            }
            return f;
        }

        public final String LJ(String str, Map map) {
            boolean z;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) C1474810oTv.z2.getValue()).booleanValue() || (((Boolean) C1474810oTv.H1.getValue()).booleanValue() && ((Integer) map.get("scene_loudness_offset")).intValue() != 0)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        float f = (float) JSONObjectProtectorUtils.getDouble(jSONObject, "small_spl_target_LU");
                        float f2 = (float) JSONObjectProtectorUtils.getDouble(jSONObject, "medium_spl_target_LU");
                        float f3 = (float) JSONObjectProtectorUtils.getDouble(jSONObject, "large_spl_target_LU");
                        if (this.LLILLJJLI.getPlayer() != null) {
                            this.LLILLJJLI.getPlayer().LJJLIIJ();
                        }
                        float fLIZLLL = LIZLLL(f, map);
                        float fLIZLLL2 = LIZLLL(f2, map);
                        float fLIZLLL3 = LIZLLL(f3, map);
                        jSONObject.put("small_spl_target_LU", fLIZLLL);
                        jSONObject.put("medium_spl_target_LU", fLIZLLL2);
                        jSONObject.put("large_spl_target_LU", fLIZLLL3);
                        ((HashMap) this.LLILLL).put("small_target_LU", String.valueOf(fLIZLLL));
                        ((HashMap) this.LLILLL).put("medium_target_LU", String.valueOf(fLIZLLL2));
                        ((HashMap) this.LLILLL).put("large_target_LU", String.valueOf(fLIZLLL3));
                        str = C786410Ut5.J3(jSONObject);
                        return str;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            return str;
        }
    };
    public final C1472760oQc LLLF = new C1472760oQc(this);
    public final C1472080oPW LLLFF = new C1469760oLm(this) { // from class: X.0oPW
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIIJZLJL(Map<String, Object> map) {
            C1472990oQz c1472990oQz;
            int iIntValue;
            C1472150oPd player = this.LLILLJJLI.getPlayer();
            if (player == null) {
                return;
            }
            SparseIntArray sparseIntArrayLJIIIZ = this.LLILLJJLI.LJIIIZ();
            C1480980ods c1480980odsUe = this.LLILLJJLI.ue();
            C1472050oPT.LIZIZ("header_url", map);
            Object obj = map.get("header_dashinfo");
            if (obj instanceof C1472990oQz) {
                c1472990oQz = (C1472990oQz) obj;
            } else {
                c1472990oQz = null;
            }
            boolean zLIZJ = C1472050oPT.LIZJ(c1472990oQz);
            if (c1472990oQz != null && c1472990oQz.LJIILJJIL) {
                player.LIZJ(0, c1480980odsUe.LJIJ);
            } else if (zLIZJ) {
                if (sparseIntArrayLJIIIZ.indexOfKey(56) >= 0) {
                    player.LIZJ(0, sparseIntArrayLJIIIZ.get(56));
                } else {
                    player.LIZJ(0, 15);
                }
            } else if (sparseIntArrayLJIIIZ.indexOfKey(33) >= 0) {
                player.LIZJ(0, sparseIntArrayLJIIIZ.get(33));
            } else {
                player.LIZJ(0, 15);
            }
            try {
                if (map.get("cache_duration") != null && (iIntValue = ((Integer) map.get("cache_duration")).intValue()) != -1) {
                    player.LIZJ(0, iIntValue);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    };
    public final C1472060oPU LLLFFI = new C1472060oPU(this);
    public final C1470120oMM LLLFZ = new C1469760oLm(this) { // from class: X.0oMM
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIIJZLJL(Map<String, Object> map) {
            C1472150oPd player;
            C1473210oRL c1473210oRL;
            Object barrageMaskInfo;
            if (!((Boolean) C1474810oTv.LLF.getValue()).booleanValue() || (player = this.LLILLJJLI.getPlayer()) == null) {
                return;
            }
            if (map.get("meta_info") != null) {
                c1473210oRL = (C1473210oRL) map.get("meta_info");
            } else {
                c1473210oRL = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SourceId: ");
            sbLIZ.append(this.LLILLJJLI.getSourceId());
            sbLIZ.append("，barrageMaskInfo: ");
            if (c1473210oRL == null) {
                barrageMaskInfo = " null";
            } else {
                barrageMaskInfo = c1473210oRL.getBarrageMaskInfo();
            }
            sbLIZ.append(barrageMaskInfo);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c1473210oRL != null && c1473210oRL.getBarrageMaskInfo() != null) {
                C1470140oMO barrageMaskInfo2 = c1473210oRL.getBarrageMaskInfo();
                if (!barrageMaskInfo2.isValid()) {
                    return;
                }
                player.LIZJ(510, 1);
                player.LIZJ(1300, 1);
                player.LIZJ(1301, 1);
                player.LIZJ(1302, 1);
                player.LJLLI(barrageMaskInfo2.getBarrageMaskUrl(), barrageMaskInfo2.getFileId());
                if (barrageMaskInfo2.getHeadLen() > 0) {
                    player.LIZ.v0 = barrageMaskInfo2.getHeadLen();
                }
                C1472150oPd player2 = this.LLILLJJLI.getPlayer();
                if (player2 != null) {
                    player2.LLIIIJ(new InterfaceC1467890oIl() { // from class: X.0oMN
                        @Override // X.InterfaceC1467890oIl
                        public final void LJLI(int i, int i2, String str) {
                            InterfaceC1472110oPZ interfaceC1472110oPZLJJIJL = this.LIZ.LLILLJJLI.LJJIJL();
                            if (interfaceC1472110oPZLJJIJL != null) {
                                interfaceC1472110oPZLJJIJL.LJLI(i, i2, str);
                            }
                        }
                    });
                }
            }
        }

        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIL(boolean z) {
            C1472150oPd player;
            if (!((Boolean) C1474810oTv.LLF.getValue()).booleanValue() || (player = this.LLILLJJLI.getPlayer()) == null) {
                return;
            }
            player.LIZJ(510, 0);
            player.LJLLI("", "");
            player.LIZ.v0 = 0;
            player.LLIIIJ(null);
            player.LIZJ(499, 0);
        }
    };
    public final C1472700oQW LLLI = new C1472700oQW(this);
    public final C1472570oQJ LLLII = new C1472570oQJ(this);
    public final C1472780oQe LLLIIII = new C1469760oLm(this) { // from class: X.0oQe
        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIIZI() {
            C1472790oQf c1472790oQf = C1472790oQf.LIZJ;
            if (C1472790oQf.LIZJ.LIZIZ) {
                SimRadar.keyScan("TTPlayer", String.valueOf(this.LLILLJJLI.getPlayer()), "resetCoreWhenStop");
                C607330Nrv.LIZ.LIZ().getBindCpuCore().getClass();
            }
        }

        @Override // X.C1469760oLm, X.InterfaceC1472290oPr
        public final void LJJIIJZLJL(Map<String, Object> map) {
            C1472790oQf c1472790oQf = C1472790oQf.LIZJ;
            if (C1472790oQf.LIZJ.LIZ) {
                SimRadar.keyScan("TTPlayer", String.valueOf(this.LLILLJJLI.getPlayer()), "bindBigCoreWhenPrepare");
                C607330Nrv.LIZ.LIZ().getBindCpuCore().getClass();
            }
        }
    };
    public final C1470230oMX LLLIIIIL = new C1470230oMX(this);

    @Override // X.InterfaceC1479610obf
    public final void LJ() {
    }

    public static void LJLILLLLZI() {
        List<C308310C6r> listEngineStaticOptionList;
        IPlayerExperiment iPlayerExperimentLIZIZ = C607330Nrv.LIZ.LIZIZ();
        if (iPlayerExperimentLIZIZ == null || (listEngineStaticOptionList = iPlayerExperimentLIZIZ.engineStaticOptionList()) == null || listEngineStaticOptionList.size() == 0) {
            return;
        }
        for (C308310C6r c308310C6r : listEngineStaticOptionList) {
            Object obj = c308310C6r.LIZIZ;
            if (obj != null) {
                try {
                    int i = c308310C6r.LIZJ;
                    if (i == 1) {
                        TTVideoEngine.LLFII(c308310C6r.LIZ, ((Integer) obj).intValue());
                    } else if (i == 2) {
                        TTVideoEngine.LLIIIILZ(c308310C6r.LIZ, ((Long) obj).longValue());
                    } else if (i == 4) {
                        TTVideoEngine.LLILLJJLI(c308310C6r.LIZ, (String) obj);
                    } else if (i == 5) {
                        TTVideoEngine.LLILLJJLI(c308310C6r.LIZ, C786410Ut5.J3((JSONObject) obj));
                    } else if (i == 6) {
                        TTVideoEngine.LLILLJJLI(c308310C6r.LIZ, ((JSONArray) obj).toString());
                    }
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setStaticOptions key ");
                        sbLIZ.append(c308310C6r.LIZ);
                        sbLIZ.append(" type ");
                        sbLIZ.append(c308310C6r.LIZJ);
                        sbLIZ.append(" value ");
                        sbLIZ.append(c308310C6r.LIZIZ);
                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("setStaticOptions ");
                        sbLIZ2.append(e);
                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1479610obf
    public final C1472440oQ6 LJIIIIZZ() {
        C1472440oQ6 c1472440oQ6 = new C1472440oQ6();
        C1472150oPd c1472150oPd = this.LLILZIL;
        c1472440oQ6.LIZ = c1472150oPd != null ? c1472150oPd.LJJLIIIJJIZ(80) : null;
        return c1472440oQ6;
    }

    @Override // X.InterfaceC1472340oPw
    public final Map<String, String> LJIILLIIL() {
        return this.LLLILZJ.LJIILLIIL();
    }

    @Override // X.InterfaceC1472340oPw
    public final Map<String, String> LJIIZILJ() {
        return this.LLLILZJ.LJIIZILJ();
    }

    @Override // X.InterfaceC1471960oPK
    public final List<C1471890oPD> LJIJI() {
        InterfaceC1471870oPB interfaceC1471870oPB = this.LLLFFI.LLILLL;
        if (interfaceC1471870oPB != null) {
            return interfaceC1471870oPB.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1479610obf
    public final void LJIJJ() {
        C1472150oPd player;
        C1472730oQZ c1472730oQZ = this.LLLILZ;
        if (c1472730oQZ.LLILLJJLI.getPlayer() == null || !c1472730oQZ.LIZLLL(null) || !c1472730oQZ.LJ() || (player = c1472730oQZ.LLILLJJLI.getPlayer()) == null) {
            return;
        }
        player.LIZJ(4318, 1);
    }

    @Override // X.InterfaceC1472340oPw
    public final Map<String, String> LJIL() {
        Map<String, String> mapLJIL = this.LLLILZJ.LJIL();
        mapLJIL.putAll(this.LLLFFI.LJ());
        return mapLJIL;
    }

    @Override // X.InterfaceC1472340oPw
    public final Map<String, String> LJJIII() {
        return this.LLLILZJ.LJJIII();
    }

    @Override // X.InterfaceC1479610obf
    public final boolean LJJIIJ() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd == null) {
            return false;
        }
        return c1472150oPd.LJJZZI();
    }

    public final void LJJJJ() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            c1472150oPd.LJJIFFI(0, true);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("asyncInitDecoder : ");
                sbLIZ.append(false);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LJJJJI() {
        Surface surface = this.LLJILJIL;
        if (surface == null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("TTPlayer", "clearSurfaceViewSurface, mSurfaceViewSurface is null return");
                return;
            }
            return;
        }
        if (C1471640oOo.LIZ(surface) == null || this.LLILZIL == null) {
            return;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearSurfaceViewSurface, setSurfaceHolder null, surface = ");
            sbLIZ.append(this.LLJILJIL);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (((Boolean) C1474810oTv.p5.getValue()).booleanValue() && LLLJL != null && LLLJL.get() == this.LLJILJIL) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("TTPlayer", "clearSurfaceViewSurface, clear old weakDisableSurfaceControlSurface");
            }
            LLLJL = null;
        }
        if (!C1472280oPq.LIZLLL() || this.LLJJ == null) {
            this.LLILZIL.LLIZ(null);
        } else if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("TTPlayer", "use surface control. try ignore setSurfaceHolder(null).");
        }
        this.LLJILJIL = null;
        this.LLJILJILJ = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJJJJL() {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZ("ensurePlayer");
        }
        if (this.LLILZIL == null) {
            int i = this.LLILLJJLI.get(0);
            int i2 = this.LLILLJJLI.get(2);
            boolean z = this.LLILLJJLI.get(18) == 1;
            int i3 = this.LLILLJJLI.get(23);
            int i4 = this.LLILLJJLI.get(26);
            int i5 = this.LLILLJJLI.get(27);
            int i6 = this.LLILLJJLI.get(43);
            int i7 = this.LLILLJJLI.get(44);
            int i8 = this.LLILLJJLI.get(47);
            int i9 = this.LLILLJJLI.get(55);
            int i10 = this.LLILLJJLI.get(58);
            int i11 = this.LLILLJJLI.get(82);
            int i12 = this.LLILLJJLI.get(83);
            int i13 = this.LLILLJJLI.get(51, 0);
            int i14 = this.LLILLJJLI.get(52, 0);
            int i15 = this.LLILLJJLI.get(60);
            int i16 = this.LLILLJJLI.get(84);
            int i17 = this.LLILLJJLI.get(85);
            int i18 = this.LLILLJJLI.get(86);
            int i19 = this.LLILLJJLI.get(61);
            int i20 = this.LLILLJJLI.get(68);
            int i21 = this.LLILLJJLI.get(63);
            int i22 = this.LLILLJJLI.get(64);
            int i23 = this.LLILLJJLI.get(65);
            int i24 = this.LLILLJJLI.get(69);
            int i25 = this.LLILLJJLI.get(70);
            int i26 = this.LLILLJJLI.get(71);
            int i27 = this.LLILLJJLI.get(81);
            int i28 = this.LLILLJJLI.get(87, 0);
            int i29 = this.LLILLJJLI.get(88);
            int i30 = this.LLILLJJLI.get(91, 1);
            float fFloatValue = ((Float) this.LLILLL.get(67, Float.valueOf(0.0f))).floatValue();
            int i31 = this.LLILLJJLI.get(100, 0);
            int i32 = this.LLILLJJLI.get(101, 0);
            int i33 = this.LLILLJJLI.get(102, 0);
            boolean z2 = this.LLILLJJLI.get(99, 0) == 1;
            boolean z3 = ((Boolean) C1474810oTv.V.getValue()).booleanValue() && this.LLILLJJLI.get(103) == 1;
            String str = (String) this.LLILLL.get(92, "");
            int i34 = this.LLILLJJLI.get(104, 0);
            this.LLLILZJ.LJJIJIIJI();
            HashMap map = new HashMap();
            map.put("only_local_url_player", Boolean.valueOf(z2));
            map.put("new_user_opt_harden_diversion", Integer.valueOf(i34));
            map.put("is_mediabox_player", Boolean.TRUE);
            this.LLILZIL = new C1472150oPd(this.LL, i, map, this);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ensurePlayer, create MTTVideoEngine mPlayer = ");
                sbLIZ.append(this.LLILZIL);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (i == 1) {
                this.LLILZIL.LIZJ(117, 1);
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("useSysAudioCodec: ");
                sbLIZ2.append(z);
                sbLIZ2.append(", enableAACSwFallback: ");
                sbLIZ2.append(i30);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (z) {
                this.LLILZIL.LIZJ(216, 1);
            }
            this.LLILZIL.LIZJ(714, this.LLILLJJLI.get(98, 0));
            this.LLILZIL.LIZJ(585, ((Number) C1474810oTv.LLLLLZIL.getValue()).intValue());
            this.LLILZIL.LIZJ(415, 1);
            this.LLILZIL.LIZJ(4, i2);
            this.LLILZIL.LIZJ(550, i14);
            this.LLILZIL.LIZJ(27, i13);
            if (i13 > 0) {
                this.LLILZIL.LIZJ(550, 1);
            }
            this.LLILZIL.LIZJ(586, i28);
            String str2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str2) && str2.toLowerCase().contains("sony")) {
                this.LLILZIL.LJJIJ(new int[]{44100});
            }
            this.LLILZIL.LLJJJJJIL(this.LLJJI);
            this.LLILZIL.LLILLIZIL(new InterfaceC1469380oLA() { // from class: X.0oPa
                @Override // X.InterfaceC1469380oLA
                public final void LJFF(int i35, EnumC2281151EQn enumC2281151EQn) {
                    this.LL.LLJJIII.LJLIIL(C2281201EQs.LIZIZ(enumC2281151EQn), i35);
                }
            });
            this.LLILZIL.LIZJ(204, (!C1474810oTv.LJJJJZI() || ((Boolean) C1474810oTv.j0.getValue()).booleanValue()) ? 1 : 0);
            this.LLILZIL.LIZJ(12, 0);
            this.LLILZIL.LIZJ(213, ((Number) C1474810oTv.LJJJJJL.getValue()).intValue());
            this.LLILZIL.LIZJ(498, i6);
            this.LLILZIL.LIZJ(509, i7);
            this.LLILZIL.LIZJ(198, i8);
            this.LLILZIL.LIZJ(543, i9);
            this.LLILZIL.LIZJ(552, i10);
            this.LLILZIL.LIZJ(575, i11);
            if (i11 == 1) {
                this.LLILZIL.LIZJ(576, i12);
            }
            this.LLILZIL.LIZJ(557, i15);
            this.LLILZIL.LIZJ(577, i16);
            this.LLILZIL.LIZJ(578, i17);
            this.LLILZIL.LIZJ(580, i18);
            this.LLILZIL.LLD(fFloatValue, 535);
            this.LLILZIL.LIZJ(525, i20);
            if (i19 > 0) {
                this.LLILZIL.LIZJ(602, i19);
            }
            this.LLILZIL.LIZJ(371, i21);
            this.LLILZIL.LIZJ(560, i22);
            this.LLILZIL.LIZJ(561, i23);
            this.LLILZIL.LIZJ(564, i24);
            this.LLILZIL.LIZJ(565, i25);
            this.LLILZIL.LIZJ(669, i26);
            this.LLILZIL.LIZJ(800, i27);
            this.LLILZIL.LIZJ(21, i29);
            this.LLILZIL.LIZJ(703, ((Number) C1474810oTv.LLZL.getValue()).intValue());
            this.LLILZIL.LIZJ(322, i3);
            this.LLILZIL.LLIIZ(i5, i4 == 1);
            this.LLILZIL.LIZJ(976, this.LLILLJJLI.get(93, 0));
            this.LLILZIL.LIZJ(1122, i31);
            this.LLILZIL.LIZJ(996, i32);
            this.LLILZIL.LIZJ(990, i33);
            if (C1474810oTv.LJJLI()) {
                this.LLILZIL.LIZJ(1413, 1);
            }
            this.LLILZIL.LIZJ(766, C1474810oTv.LLJJLIIIJLLLLLLLZ() ? 1 : 0);
            if (!TextUtils.isEmpty(str)) {
                this.LLILZIL.LIZ(5000, str);
            }
            this.LLILZIL.LJIJJ.LIZLLL(new InterfaceC1467780oIa() { // from class: X.0oLd
                @Override // X.InterfaceC1467780oIa
                public final void LJJJIL(C1467470oI5 c1467470oI5) {
                    if (c1467470oI5 != null) {
                        if (TextUtils.equals(c1467470oI5.LIZ, "mdlcacheend")) {
                            this.LL.LLJJIII.LJLJJLL();
                        }
                        if (TextUtils.equals(c1467470oI5.LIZ, "renderSeekComplete")) {
                            this.LL.LLLILZJ.LJIIL();
                        }
                        if (TextUtils.equals(c1467470oI5.LIZ, "crosstalk_happened")) {
                            this.LL.LLJJIII.LJLL((List) c1467470oI5.LIZJ);
                        }
                    }
                }
            });
            this.LLILZIL.LJIL.LIZLLL(new InterfaceC989230bqj() { // from class: X.0oMP
                @Override // X.InterfaceC989230bqj
                public final void accept(Object obj) {
                    this.LL.LLJJIII.LJLIL(((Float) obj).floatValue());
                }
            });
            this.LLILZIL.LIZ.LLLZ = this;
            this.LLLILZJ.LJJI();
            if (!z3) {
                synchronized (FFmpegLibLoaderWrapper.class) {
                    FFmpegLibLoaderWrapper.LIZ();
                }
            }
            if (z2 || z3 || C1474930oU7.LJ) {
                C1474930oU7.LJ = false;
                this.LLIZ = true;
            }
        }
    }

    public final long LJJJJL() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        long jLJJJIL = 0;
        if (c1472150oPd == null) {
            return 0L;
        }
        try {
            jLJJJIL = this.LLJI ? c1472150oPd.LJJJIL() : c1472150oPd.LJJJJ();
            return jLJJJIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jLJJJIL;
        }
    }

    public final long LJJJJLI() {
        try {
            if (this.LLILZIL != null) {
                return r0.LJJJJL();
            }
            return 1073741823L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1073741823L;
        }
    }

    public final int LJJJJLL() {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        C1481110oe5.LIZIZ("TTPlayer", "Enter getSubtitleId");
        if (player == null) {
            C1481110oe5.LIZLLL("TTPlayer", "getSubtitleId: mPlayer is null");
            return 0;
        }
        int iLJJJJZI = player.LJJJJZI(1408);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSubtitleId: ret=");
        sbLIZ.append(iLJJJJZI);
        sbLIZ.append(", mSubtitleId=");
        sbLIZ.append(c1471980oPM.LLJJ);
        sbLIZ.append(", mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        return iLJJJJZI;
    }

    public final Surface LJJJJZ() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            return c1472150oPd.LJJLIIIJL();
        }
        return null;
    }

    public final float LJJJJZI() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            return c1472150oPd.LJJLJLI();
        }
        return -1.0f;
    }

    public final int LJJJLIIL() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        int iLJJLL = c1472150oPd != null ? c1472150oPd.LJJLL() : -1;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getWatchedDuration: ");
            sbLIZ.append(iLJJLL);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iLJJLL;
    }

    public final void LJJJLL() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            c1472150oPd.LJJIJIIJIL();
            this.LLLILZJ.LJIILIIL();
        }
        C0X35.LJIIJJI("player_precreate_ttvideoengine_create_duration", true);
    }

    public final boolean LJJJLZIJ() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        return c1472150oPd != null && c1472150oPd.LJJJLIIL() == 2;
    }

    public final boolean LJJJZ() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        return c1472150oPd != null && c1472150oPd.LJJLIIIJILLIZJL() == 2;
    }

    public final boolean LJJL() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        return c1472150oPd != null && c1472150oPd.LJJLIIIJILLIZJL() == 1;
    }

    public final boolean LJJLI() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        return c1472150oPd != null && c1472150oPd.LJJLIIIJILLIZJL() == 0;
    }

    public final void LJJLIIIJ() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pause  mPlayer = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", surface = ");
            sbLIZ.append(this.LLJILJILJ ? this.LLJILJIL : this.LLJIJIL);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLLILZJ.LJJ();
        try {
            C1472150oPd c1472150oPd = this.LLILZIL;
            if (c1472150oPd != null) {
                c1472150oPd.pause();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "pause", new C1473280oRS(e), new Object[0]);
        }
        this.LLLILZJ.LJJIJIIJIL();
        this.LLILZLL = false;
    }

    public final void LJJLIIIJLLLLLLLZ() {
        InterfaceC1472350oPx interfaceC1472350oPx;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release  mPlayer = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", surface = ");
            sbLIZ.append(this.LLJILJILJ ? this.LLJILJIL : this.LLJIJIL);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLLILZJ.LJIILJJIL();
        try {
            this.LLILZIL.LLI(null);
            LJJJJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VIDEO@");
            sbLIZ2.append(this.LLJ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ2)).LIZIZ("TTRelease-1");
            this.LLILZIL.release();
            if (C1472280oPq.LIZLLL() && (interfaceC1472350oPx = this.LLJJ) != null) {
                C1472280oPq.LIZ(interfaceC1472350oPx);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("destroySurfaceControlSession. mSurfaceControlSession:");
                    sbLIZ3.append(this.LLJJ);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LLJJ = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "release", new C1473280oRS(e), new Object[0]);
        }
        this.LLLILZJ.LJIJ();
    }

    public final void LJJLJ() {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter setAudioInfoListener, mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (player != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setAudioInfoListener: do: ");
            sbLIZ2.append(c1471980oPM.LLJJIJIL);
            sbLIZ2.append(", mSourceId=");
            sbLIZ2.append(c1471980oPM.LLJJIJI);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            player.LLJJJJJIL(c1471980oPM.LLJJIJIL);
        }
    }

    public final void LJLIIIL() {
        if (((Boolean) C1474810oTv.LJJL.getValue()).booleanValue()) {
            this.LLILZIL.LIZJ(604, ((Number) C1474810oTv.LJJLI.getValue()).intValue());
            this.LLILZIL.LIZJ(605, ((Number) C1474810oTv.LJJLIIIIJ.getValue()).intValue());
            this.LLILZIL.LIZJ(857, ((Number) C1474810oTv.LJJLIIIJ.getValue()).intValue());
            this.LLILZIL.LIZ(715, (String) C1474810oTv.LJL.getValue());
        }
    }

    public final void LJLJJL() {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter setSubInfoListener; mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        sbLIZ.append(", callback: ");
        sbLIZ.append(c1471980oPM.LLJJIJIIJIL);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (player != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSubInfoListener do:");
            sbLIZ2.append(c1471980oPM.LLJJIJIIJIL);
            sbLIZ2.append(", mSourceId=");
            sbLIZ2.append(c1471980oPM.LLJJIJI);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            player.LLILLL(c1471980oPM.LLJJIJIIJIL);
        }
    }

    public final void LJLJLLL() {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter setSubtitlesEnableLazyLoading; mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (player != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSubtitlesEnableLazyLoading:");
            sbLIZ2.append(true);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            player.LIZJ(859, 1);
        }
    }

    public final boolean LJLLILLLL() {
        return Build.VERSION.SDK_INT < 26 && this.LLJLLL.LLILLL;
    }

    public final void LJLLJ() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start mPlayer = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", surface = ");
            sbLIZ.append(this.LLJILJILJ ? this.LLJILJIL : this.LLJIJIL);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VIDEO@");
        sbLIZ2.append(this.LLJ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ2)).LIZ("TTPlay-TTStop").LIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("VIDEO@");
        sbLIZ3.append(this.LLJ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ3)).LIZ("TTPlay-FirstFrame").LIZ();
        this.LLLILZJ.LJIILL();
        if (!((Boolean) C1474810oTv.e3.getValue()).booleanValue() || !this.LLILZIL.LJLI() || this.LLILZIL.LJJJJZI(100) != 1) {
            this.LLILZIL.LIZJ(100, 1);
            this.LLILZIL.LLJL(false);
        }
        this.LLLILZJ.LJJIJLIJ();
    }

    public final void LJLLL() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop  mPlayer = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", surface = ");
            sbLIZ.append(this.LLJILJILJ ? this.LLJILJIL : this.LLJIJIL);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLLILZJ.LJJIJ();
        try {
            if (this.LLILZIL != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("VIDEO@");
                sbLIZ2.append(this.LLJ);
                SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ2)).LIZ("TTPlay-TTStop").end();
                this.LLILZIL.stop();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "stop", new C1473280oRS(e), new Object[0]);
        }
        this.LLLILZJ.LJJIIZI();
    }

    public final boolean LJLLLL() {
        try {
            C1472150oPd c1472150oPd = this.LLILZIL;
            if (c1472150oPd != null) {
                return c1472150oPd.LJIJJ();
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "supportHevcPlayback", new C1473280oRS(e), new Object[0]);
            return true;
        }
    }

    @Override // X.InterfaceC1479610obf
    public final C1471500oOa getVideoInfo() {
        C1471470oOX c1471470oOX = this.LLJLLIL;
        C1472150oPd player = c1471470oOX.LLILLJJLI.getPlayer();
        if (player != null) {
            InterfaceC1468030oIz interfaceC1468030oIzLJJL = c1471470oOX.LLILZ;
            if (interfaceC1468030oIzLJJL != null || (interfaceC1468030oIzLJJL = player.LJJL()) != null) {
                C1472400oQ2 c1472400oQ2 = new C1472400oQ2();
                c1472400oQ2.LIZ = c1471470oOX.LLILZIL;
                C1468460oJg c1468460oJg = (C1468460oJg) interfaceC1468030oIzLJJL;
                c1468460oJg.LIZ("ffr_read_head_duration");
                c1472400oQ2.LIZIZ = c1468460oJg.LIZ("ffr_read_first_data_duration");
                c1468460oJg.LIZ("ffr_decode_duration");
                c1472400oQ2.LIZJ = c1468460oJg.LIZ("ffr_render_duration");
                c1472400oQ2.LIZLLL = c1468460oJg.LIZ("ffr_playback_buffering_duration");
                c1468460oJg.LIZ("ffr_prender_duration");
                c1471470oOX.LLILLL.LJI = c1472400oQ2;
            }
            if (((Boolean) C1474810oTv.g3.getValue()).booleanValue()) {
                c1471470oOX.LLILLL.LIZ = player.LJJJJZI(43);
                c1471470oOX.LLILLL.LIZIZ = player.LJJJJZI(45);
                if (c1471470oOX.LLILLL.LIZIZ < 0 || c1471470oOX.LLILLL.LIZ < 0) {
                    c1471470oOX.LLILLL.LIZIZ = player.LJJJJZI(46);
                    c1471470oOX.LLILLL.LIZ = player.LJJJJZI(44);
                }
            }
        }
        c1471470oOX.LLILLL.LJIIJJI = c1471470oOX.LLJI;
        return c1471470oOX.LLILLL;
    }

    @Override // X.InterfaceC1479610obf
    public final boolean isMute() {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd == null) {
            return false;
        }
        return c1472150oPd.isMute();
    }

    public final void LJJLIIIIJ() {
        if (LJLLILLLL()) {
            this.LLILZLL = true;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTPlayer{mPlayer=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1471960oPK
    public final SparseIntArray LJIIIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1479610obf
    public final float LJIIJ() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1471960oPK
    public final SparseArray LJJIIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1471960oPK
    public final InterfaceC1472110oPZ LJJIJL() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1471960oPK
    public final C1472150oPd getPlayer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1471960oPK
    public final String getSourceId() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1471960oPK
    public final C1480980ods ue() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1479610obf
    public final void LIZ(boolean z) {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            c1472150oPd.LIZJ(480, z ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v34, types: [T] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1479610obf, X.InterfaceC1471960oPK
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        C1472150oPd c1472150oPd;
        int iLJJJIL;
        ?? r3;
        int i = 1;
        boolean z = true;
        int iIntValue = 0;
        Integer num = (T) null;
        if (abstractC586270Mz3 instanceof AbstractC1472270oPp) {
            AbstractC1472270oPp abstractC1472270oPp = (AbstractC1472270oPp) abstractC586270Mz3;
            try {
                if (abstractC1472270oPp instanceof C1473070oR7) {
                    C1472150oPd c1472150oPd2 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd2 != null) {
                        r3 = (T) c1472150oPd2.LJJLIIIJJIZ(1415);
                    }
                } else if (abstractC1472270oPp instanceof C1473040oR4) {
                    C1472150oPd c1472150oPd3 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd3 != null) {
                        r3 = (T) Integer.valueOf(c1472150oPd3.LJJJJZI(756));
                    }
                } else if (abstractC1472270oPp instanceof C1473050oR5) {
                    C1472150oPd c1472150oPd4 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd4 != null) {
                        r3 = (T) Long.valueOf(c1472150oPd4.LJJJLZIJ(757));
                    }
                } else if (abstractC1472270oPp instanceof C1472610oQN) {
                    C1472150oPd c1472150oPd5 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd5 != null) {
                        r3 = (T) Integer.valueOf(c1472150oPd5.LJJJJZI(758));
                    }
                } else if (abstractC1472270oPp instanceof C1473060oR6) {
                    C1472150oPd c1472150oPd6 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd6 != null) {
                        r3 = (T) Long.valueOf(c1472150oPd6.LJJJLZIJ(759));
                    }
                } else if (abstractC1472270oPp instanceof C1472600oQM) {
                    C1472150oPd c1472150oPd7 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd7 != null) {
                        r3 = (T) Integer.valueOf(c1472150oPd7.LJJJJZI(761));
                    }
                } else if (abstractC1472270oPp instanceof C1473080oR8) {
                    C1472150oPd c1472150oPd8 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd8 != null) {
                        r3 = (T) Float.valueOf(c1472150oPd8.LJJJJLI(760));
                    }
                } else if (abstractC1472270oPp instanceof C1472500oQC) {
                    String str = this.LLJ;
                    ((C1472500oQC) abstractC1472270oPp).getClass();
                    if (!Intrinsics.LJFF(str, null) || !LJJL()) {
                        z = false;
                    }
                    r3 = (T) Boolean.valueOf(z);
                } else if (abstractC1472270oPp instanceof C1472640oQQ) {
                    C1472150oPd c1472150oPd9 = this.LLILZIL;
                    Integer num2 = num;
                    if (c1472150oPd9 != null) {
                        num2 = (T) Integer.valueOf(c1472150oPd9.LJJJJZI(1403));
                    }
                    r3 = (T) C1469960oM6.LIZJ(num2);
                } else if (abstractC1472270oPp instanceof C1472580oQK) {
                    C1472150oPd c1472150oPd10 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd10 != null) {
                        r3 = (T) Long.valueOf(c1472150oPd10.LJJJLZIJ(64));
                    }
                } else if (abstractC1472270oPp instanceof C1473030oR3) {
                    C1472150oPd c1472150oPd11 = this.LLILZIL;
                    if (c1472150oPd11 != null) {
                        iLJJJIL = c1472150oPd11.LJJJIL();
                    } else {
                        iLJJJIL = -1;
                    }
                    r3 = (T) Integer.valueOf(iLJJJIL);
                } else if (abstractC1472270oPp instanceof C1472650oQR) {
                    C1472150oPd c1472150oPd12 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd12 != null) {
                        r3 = (T) Long.valueOf(c1472150oPd12.LJJJLZIJ(60));
                    }
                } else if (abstractC1472270oPp instanceof C1472590oQL) {
                    C1472150oPd c1472150oPd13 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd13 != null) {
                        r3 = (T) Integer.valueOf(c1472150oPd13.LJJJJZI(44));
                    }
                } else if (abstractC1472270oPp instanceof C1472810oQh) {
                    C1472150oPd c1472150oPd14 = this.LLILZIL;
                    Integer num3 = num;
                    if (c1472150oPd14 != null) {
                        num3 = (T) Integer.valueOf(c1472150oPd14.LJJJJZI(44));
                    }
                    if (num3 != null && num3.intValue() == 4096) {
                        r3 = (T) "AAC";
                    } else {
                        r3 = (T) ((String) abstractC1472270oPp.LIZIZ);
                    }
                } else if (abstractC1472270oPp instanceof C1472550oQH) {
                    C1472150oPd c1472150oPd15 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd15 != null) {
                        r3 = (T) Integer.valueOf(c1472150oPd15.LJJJJZI(59));
                    }
                } else if (abstractC1472270oPp instanceof C1472630oQP) {
                    C1472150oPd c1472150oPd16 = this.LLILZIL;
                    Integer num4 = num;
                    if (c1472150oPd16 != null) {
                        num4 = (T) Integer.valueOf(c1472150oPd16.LJJJJZI(59));
                    }
                    r3 = (T) C1469960oM6.LIZ(num4);
                } else if (abstractC1472270oPp instanceof C1472620oQO) {
                    r3 = (T) Boolean.valueOf(this.LLJILJILJ);
                } else if (abstractC1472270oPp instanceof C1472660oQS) {
                    r3 = (T) Float.valueOf(LJFF(12));
                } else if (abstractC1472270oPp instanceof C1472960oQw) {
                    C1472150oPd c1472150oPd17 = this.LLILZIL;
                    r3 = num;
                    if (c1472150oPd17 != null) {
                        r3 = (T) Integer.valueOf(c1472150oPd17.LJJJJZI(45));
                    }
                } else if (abstractC1472270oPp instanceof C1472540oQG) {
                    HashMap map = (T) new HashMap();
                    map.putAll(LJIL());
                    r3 = map;
                } else if (abstractC1472270oPp instanceof C1472520oQE) {
                    HashMap map2 = (T) new HashMap();
                    map2.putAll(LJIIZILJ());
                    r3 = map2;
                } else if (abstractC1472270oPp instanceof C1472530oQF) {
                    HashMap map3 = (T) new HashMap();
                    map3.putAll(LJJIII());
                    r3 = map3;
                } else if (abstractC1472270oPp instanceof C1472970oQx) {
                    HashMap map4 = (T) new HashMap();
                    map4.putAll(LJIILLIIL());
                    r3 = map4;
                } else if (abstractC1472270oPp instanceof C1472510oQD) {
                    r3 = (T) C1469960oM6.LIZIZ(this);
                } else {
                    r3 = abstractC1472270oPp.LIZIZ;
                }
                return r3 == 0 ? abstractC1472270oPp.LIZIZ : (T) r3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String.valueOf(th);
                return abstractC1472270oPp.LIZIZ;
            }
        }
        if (abstractC586270Mz3 instanceof AbstractC1472300oPs) {
            AbstractC1472300oPs abstractC1472300oPs = (AbstractC1472300oPs) abstractC586270Mz3;
            if (abstractC1472300oPs instanceof C1472370oPz) {
                if (((C1472370oPz) abstractC1472300oPs).LIZJ) {
                    C1472150oPd c1472150oPd18 = this.LLILZIL;
                    if (c1472150oPd18 == null) {
                        return null;
                    }
                    c1472150oPd18.LIZJ(4321, 1);
                    return null;
                }
                C1472150oPd c1472150oPd19 = this.LLILZIL;
                if (c1472150oPd19 == null) {
                    return null;
                }
                c1472150oPd19.LIZJ(4322, 1);
                return null;
            }
            if (abstractC1472300oPs instanceof C1472470oQ9) {
                C1472150oPd c1472150oPd20 = this.LLILZIL;
                if (c1472150oPd20 == null) {
                    return null;
                }
                abstractC1472300oPs.getClass();
                c1472150oPd20.LIZJ(950, 0);
                return null;
            }
            if (abstractC1472300oPs instanceof C1472380oQ0) {
                C1472150oPd c1472150oPd21 = this.LLILZIL;
                if (c1472150oPd21 == null) {
                    return null;
                }
                c1472150oPd21.LIZJ(35002, ((C1472380oQ0) abstractC1472300oPs).LIZJ ? 1 : 0);
                return null;
            }
            if (abstractC1472300oPs instanceof C1472410oQ3) {
                return null;
            }
            if (abstractC1472300oPs instanceof C1472480oQA) {
                C1472150oPd c1472150oPd22 = this.LLILZIL;
                if (c1472150oPd22 == null) {
                    return null;
                }
                abstractC1472300oPs.getClass();
                c1472150oPd22.LIZ(957, null);
                return null;
            }
            if (abstractC1472300oPs instanceof C1472390oQ1) {
                C1472150oPd c1472150oPd23 = this.LLILZIL;
                if (c1472150oPd23 == null) {
                    return null;
                }
                C1472390oQ1 c1472390oQ1 = (C1472390oQ1) abstractC1472300oPs;
                Surface surface = c1472390oQ1.LIZJ;
                int i2 = c1472390oQ1.LIZLLL;
                if (i2 >= 1) {
                    i = i2;
                }
                c1472150oPd23.LLILZ(i, surface);
                return null;
            }
            if (abstractC1472300oPs instanceof C1472450oQ7) {
                C1472150oPd c1472150oPd24 = this.LLILZIL;
                if (c1472150oPd24 == null) {
                    return null;
                }
                abstractC1472300oPs.getClass();
                c1472150oPd24.LIZJ(499, Intrinsics.LJFF(Boolean.FALSE, Boolean.TRUE) ? 1 : 0);
                return null;
            }
            if (abstractC1472300oPs instanceof C1472360oPy) {
                C1472150oPd c1472150oPd25 = this.LLILZIL;
                if (c1472150oPd25 == null) {
                    return null;
                }
                T t = abstractC1472300oPs.LIZIZ;
                if (t != null) {
                    iIntValue = ((Number) t).intValue();
                }
                c1472150oPd25.LIZJ(1428, iIntValue);
                return null;
            }
            if (!(abstractC1472300oPs instanceof C1472460oQ8) || (c1472150oPd = this.LLILZIL) == null) {
                return null;
            }
            abstractC1472300oPs.getClass();
            c1472150oPd.LIZJ(1093, 1);
            return null;
        }
        if (abstractC586270Mz3 instanceof AbstractC582780MtQ) {
            return null;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1479610obf
    public final void LIZJ(String str) {
        C1472150oPd player = this.LLLF.LLILLJJLI.getPlayer();
        if (player != null) {
            player.LJLLLL(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC1479610obf
    public final float LJFF(int i) {
        long jLJJJJL;
        int iLJJJJL;
        C1472150oPd c1472150oPd = this.LLILZIL;
        float fLJJJJZI = -1.0f;
        if (c1472150oPd == null) {
            return -1.0f;
        }
        int iHashCode = 0;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 5) {
                                switch (i) {
                                    case 8:
                                        jLJJJJL = c1472150oPd.LJJJLZIJ(60);
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        iLJJJJL = c1472150oPd.LJJJJZI(42);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        return c1472150oPd.LJJJJLI(70);
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        fLJJJJZI = c1472150oPd.LJJJJZI(660);
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("SrStrategyV2 getSrFailReason ");
                                            sbLIZ.append(fLJJJJZI);
                                            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                                            return fLJJJJZI;
                                        }
                                        return fLJJJJZI;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        return 0.0f;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        iLJJJJL = c1472150oPd.LJJJJZI(59);
                                        break;
                                    case 14:
                                        jLJJJJL = c1472150oPd.LJJJLZIJ(64);
                                        break;
                                    case 15:
                                        jLJJJJL = ((C1467030oHN) c1472150oPd.LJJLIIIJLJLI()).LIZLLL(15);
                                        break;
                                    case 16:
                                        iLJJJJL = c1472150oPd.hashCode();
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        Surface surface = this.LLJILJIL;
                                        if (surface != null) {
                                            iHashCode = surface.hashCode();
                                        } else {
                                            Surface surface2 = this.LLJIJIL;
                                            if (surface2 != null) {
                                                iHashCode = surface2.hashCode();
                                            }
                                        }
                                        return iHashCode;
                                    default:
                                        return fLJJJJZI;
                                }
                            } else {
                                jLJJJJL = c1472150oPd.LJJJLZIJ(61);
                            }
                        } else {
                            jLJJJJL = c1472150oPd.LJJJLZIJ(62);
                        }
                    } else {
                        return c1472150oPd.LJJJJLI(71);
                    }
                } else {
                    iLJJJJL = c1472150oPd.LJJJJL();
                }
                return iLJJJJL;
            }
            jLJJJJL = LJJJJL();
            return jLJJJJL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "getInfo", new C1473280oRS(e), Integer.valueOf(i));
            return -1.0f;
        }
    }

    @Override // X.InterfaceC1479610obf
    public final void LJI(float f) {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            s sVar = new s();
            sVar.LIZLLL = f;
            c1472150oPd.LIZLLL(sVar);
        }
    }

    @Override // cxo.s0
    public final void LJII(boolean z) {
        this.LLJJIII.LJL(z);
    }

    public final void LJJJI(int i) {
        C1472150oPd player;
        C1469490oLL c1469490oLL = this.LLJJIJIIJIL;
        c1469490oLL.getClass();
        if (1 == C1474810oTv.LLILLL() && (player = c1469490oLL.LLILLJJLI.getPlayer()) != null) {
            player.LIZJ(562, 1);
            player.LIZJ(570, i);
            player.LIZJ(563, i);
        }
    }

    public final void LJJJIL(EnumC1473260oRQ enumC1473260oRQ) {
        C1472150oPd player;
        C1469490oLL c1469490oLL = this.LLJJIJIIJIL;
        c1469490oLL.getClass();
        if (((Boolean) C1474810oTv.LLL.getValue()).booleanValue() && (player = c1469490oLL.LLILLJJLI.getPlayer()) != null) {
            player.LIZJ(562, 1);
            if (enumC1473260oRQ.ordinal() == EnumC1473260oRQ.LOW.ordinal()) {
                player.LIZJ(570, 286331153);
                player.LIZJ(563, 286331153);
            } else {
                if (enumC1473260oRQ.ordinal() != EnumC1473260oRQ.NORMAL.ordinal()) {
                    return;
                }
                player.LIZJ(570, 572662306);
                player.LIZJ(563, 572662306);
            }
        }
    }

    public final void LJJLIIIJL(Map<String, Object> map) {
        if (map.get("is_dash") == null || !((Boolean) map.get("is_dash")).booleanValue()) {
            String strLIZIZ = C1472050oPT.LIZIZ("header_check_sum", map);
            if (!TextUtils.isEmpty(strLIZIZ)) {
                this.LLILZIL.LIZJ(313, 1);
                this.LLILZIL.LIZ(662, strLIZIZ);
            }
        }
    }

    public final void LJJLIIIJLJLI(Map<String, Object> map) {
        this.LLLILZJ.LJJIIJZLJL(map);
    }

    public final void LJJLIIJ(boolean z) {
        InterfaceC1472350oPx interfaceC1472350oPx;
        Surface surface;
        boolean z2 = false;
        SimRadar.keyScan("TTPlayer", "reset", this.LLILZIL, this.LLJ);
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reset  mPlayer = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", surface = ");
            if (this.LLJILJILJ) {
                surface = this.LLJILJIL;
            } else {
                surface = this.LLJIJIL;
            }
            sbLIZ.append(surface);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1472150oPd c1472150oPd = this.LLILZIL;
        s sVar = new s();
        sVar.LIZLLL = -1.0f;
        c1472150oPd.LIZLLL(sVar);
        if (!z && (this.LLILLJJLI.get(34) == 1 || this.LLJJLIIIJLLLLLLLZ.LLILLL)) {
            z2 = true;
        }
        this.LLLILZJ.LJJIL(z2);
        if (!z2) {
            this.LLILZIL.LLI(null);
            LJJJJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VIDEO@");
            sbLIZ2.append(this.LLJ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ2)).LIZIZ("TTRelease-2");
            this.LLILZIL.release();
            if (C1472280oPq.LIZLLL() && (interfaceC1472350oPx = this.LLJJ) != null) {
                C1472280oPq.LIZ(interfaceC1472350oPx);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("destroySurfaceControlSession. mSurfaceControlSession:");
                    sbLIZ3.append(this.LLJJ);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LLJJ = null;
            }
            this.LLILZIL = null;
            LJJJJJL();
        } else {
            this.LLILZIL.pause();
            LJJJJI();
            this.LLILZIL.setSurface(null);
        }
        this.LLIZLLLIL = null;
        this.LLLILZJ.LJIJJLI(z2);
    }

    public final void LJJLIL(float f) {
        try {
            C1472150oPd c1472150oPd = this.LLILZIL;
            if (c1472150oPd != null) {
                int iLJJJJL = (int) (((double) f) * 0.01d * ((double) c1472150oPd.LJJJJL()));
                this.LLJJIII.LJLJI(f, iLJJJJL);
                this.LLLILZJ.LJIIJJI();
                this.LLILZIL.LJIJJLI(iLJJJJL, this);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "seekTo", new C1473280oRS(e), Float.valueOf(f));
        }
    }

    public final void LJJLJLI(final InterfaceC1499700p84 interfaceC1499700p84) {
        C1472150oPd player = this.LLJJIJIL.LLILLJJLI.getPlayer();
        if (player != null && interfaceC1499700p84 != null) {
            player.LJJII(new AudioProcessor() { // from class: X.0p82
                @Override // com.ss.ttm.player.AudioProcessor
                public final void audioClose() {
                    interfaceC1499700p84.LIZ();
                }

                @Override // com.ss.ttm.player.AudioProcessor
                public final void audioRelease(int i) {
                    interfaceC1499700p84.LIZIZ();
                }

                @Override // com.ss.ttm.player.AudioProcessor
                public final void audioProcess(ByteBuffer[] byteBufferArr, int i, long j) {
                    interfaceC1499700p84.LIZJ(byteBufferArr, i, j);
                }

                @Override // com.ss.ttm.player.AudioProcessor
                public final void audioOpen(int i, int i2, int i3, int i4) {
                    interfaceC1499700p84.LIZLLL(i, i2, i3);
                }
            });
        }
    }

    public final void LJJLL(String str) {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            c1472150oPd.LIZ(1419, str);
        }
    }

    public final void LJJZ(SurfaceHolder surfaceHolder) {
        try {
            if (this.LLILZIL != null) {
                this.LLILZIL.LLIZ(surfaceHolder);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "setDisplay", new C1473280oRS(e), surfaceHolder);
        }
    }

    public final void LJJZZI(InterfaceC1472490oQB interfaceC1472490oQB) {
        C1472320oPu c1472320oPu = this.LLJJJIL;
        if (interfaceC1472490oQB != c1472320oPu.LLILLL && interfaceC1472490oQB != null) {
            c1472320oPu.LLILLL = interfaceC1472490oQB;
            C1472320oPu.LLILZ = new WeakReference<>(c1472320oPu.LLILLL);
            C0WPS.instance.setListener(C1472320oPu.LLILZIL);
        }
    }

    public final void LJL(String str) {
        C1472760oQc c1472760oQc = this.LLLF;
        C1472150oPd player = c1472760oQc.LLILLJJLI.getPlayer();
        if (player != null) {
            try {
                if (c1472760oQc.LLILLL == null) {
                    c1472760oQc.LLILLL = new C650110Pej();
                }
                player.LL(c1472760oQc.LLILLL, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJLIIL(InterfaceC1284280jWc interfaceC1284280jWc) {
        C1469470oLJ c1469470oLJ = this.LLJL;
        if (interfaceC1284280jWc != c1469470oLJ.LLJ) {
            c1469470oLJ.LLJ = interfaceC1284280jWc;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setNorPrepareEventTimeListener listener  = ");
            sbLIZ.append(interfaceC1284280jWc);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJLIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        C1472860oQm c1472860oQm = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1472880oQo != c1472860oQm.LLJ) {
            c1472860oQm.LLJ = interfaceC1472880oQo;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnginePrePrepareEventTimeHelper：setPrePrepareEventTimeListener listener  = ");
            sbLIZ.append(interfaceC1472880oQo);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJLJI(String str) {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            c1472150oPd.LIZ(4305, str);
        }
    }

    public final void LJLJJI(boolean z) {
        C1472150oPd player = this.LLJJIJIL.LLILLJJLI.getPlayer();
        C1481110oe5.LIZIZ("TTPlayer", "Enter setSubCallbackEnable");
        if (player != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSubCallbackEnable callbackEnable:");
            sbLIZ.append(z);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            player.LIZJ(533, z ? 1 : 0);
        }
    }

    public final void LJLJJLL(Object obj) {
        if (this.LLILZIL == null) {
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setSubTag: ");
                    sbLIZ.append(obj);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LLILZIL.LLILZIL(str);
                return;
            }
        }
        this.LLILZIL.LLILZIL("playersdk_tt");
    }

    public final void LJLJLJ(boolean z) {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter setSubtitlesEnable; mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (player != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSubtitlesEnable:");
            sbLIZ2.append(z);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            player.LIZJ(534, z ? 1 : 0);
            player.LIZJ(42060, 1);
        }
    }

    public final void LJLL(Surface surface) {
        C0X35.LJIIJJI("cold_boot_start_to_setsurface", true);
        C0X35.LJIIJJI("player_prerender_onprepared_to_setsurface", true);
        C0X35.LIZ("player_setsurface_duration", true);
        try {
            if (this.LLILZIL != null) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setSurface surface = ");
                    sbLIZ.append(surface);
                    sbLIZ.append(", this = ");
                    sbLIZ.append(this);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LLLILZJ.LJJII(surface);
                if (surface == null) {
                    if (this.LLJILJILJ) {
                        LJJJJI();
                    } else {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("TTPlayer", "setSurface null");
                        }
                        this.LLILZIL.setSurface(surface);
                        this.LLJIJIL = null;
                    }
                } else {
                    SurfaceHolder surfaceHolderLIZ = C1471640oOo.LIZ(surface);
                    if (surfaceHolderLIZ != null) {
                        if (!((Boolean) C1474810oTv.r0.getValue()).booleanValue()) {
                            if (surface != this.LLJILJIL) {
                                if (this.LLJIJIL != null && !this.LLJILJILJ) {
                                    if (C1481110oe5.LIZ) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("not same surface. setSurface, setSurfaceHolder, clear player original surface, mTextureViewSurface = ");
                                        sbLIZ2.append(this.LLJIJIL);
                                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                    this.LLILZIL.setSurface(null);
                                }
                                if (C1481110oe5.LIZ) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("not same surface. setSurface, call setSurfaceHolder, surface = ");
                                    sbLIZ3.append(surface);
                                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                this.LLILZIL.LIZJ(611, 1);
                                this.LLILZIL.LIZJ(950, ((Number) C1474810oTv.l.getValue()).intValue());
                                if (LJZ("not same surface", surface)) {
                                    if (C1481110oe5.LIZ) {
                                        C1481110oe5.LIZIZ("TTPlayer", "success set SurfaceControl surface");
                                    }
                                } else {
                                    this.LLILZIL.LLIZ(surfaceHolderLIZ);
                                }
                                this.LLJIJIL = null;
                                this.LLJILJIL = surface;
                                this.LLJILJILJ = true;
                            }
                        } else {
                            if (this.LLJIJIL != null && !this.LLJILJILJ) {
                                if (C1481110oe5.LIZ) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("setSurface, setSurfaceHolder, clear player original surface, mTextureViewSurface = ");
                                    sbLIZ4.append(this.LLJIJIL);
                                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                this.LLILZIL.setSurface(null);
                            }
                            if (C1481110oe5.LIZ) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("setSurface, call setSurfaceHolder, surface = ");
                                sbLIZ5.append(surface);
                                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ5));
                            }
                            this.LLILZIL.LIZJ(611, 1);
                            this.LLILZIL.LIZJ(950, ((Number) C1474810oTv.l.getValue()).intValue());
                            if (LJZ("always set surface", surface)) {
                                if (C1481110oe5.LIZ) {
                                    C1481110oe5.LIZIZ("TTPlayer", "success set SurfaceControl surface");
                                }
                            } else {
                                this.LLILZIL.LLIZ(surfaceHolderLIZ);
                            }
                            this.LLJIJIL = null;
                            this.LLJILJIL = surface;
                            this.LLJILJILJ = true;
                        }
                    } else {
                        if (this.LLJILJIL != null && this.LLJILJILJ) {
                            LJJJJI();
                        }
                        if (C1481110oe5.LIZ) {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("setSurface, call setSurface, surface = ");
                            sbLIZ6.append(surface);
                            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ6));
                        }
                        this.LLILZIL.setSurface(surface);
                        this.LLJIJIL = surface;
                        this.LLJILJIL = null;
                        this.LLJILJILJ = false;
                    }
                }
                this.LLLILZJ.LJJIFFI(surface);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "setSurface", new C1473280oRS(e), new Object[0]);
        }
        C0X35.LJIIJJI("player_setsurface_duration", true);
        C0X35.LJIIJJI("cold_boot_start_to_setsurface_end", true);
        C0X35.LIZ("player_setsurface_to_renderstart", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r5.LLILZLL != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLLLLL(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472250oPn.LJLLLLLL(java.lang.String):void");
    }

    public final void LJLZ(int i) {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        C1481110oe5.LIZIZ("TTPlayer", "Enter switchSubtitlesLanguage");
        if (player != null) {
            c1471980oPM.LLJJ = i;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchSubtitlesLanguage: subtitleId=");
            sbLIZ.append(i);
            sbLIZ.append(", mSourceId=");
            sbLIZ.append(c1471980oPM.LLJJIJI);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            player.LIZJ(530, i);
        }
    }

    public final void LJZI(InterfaceC1471920oPG interfaceC1471920oPG) {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        c1471980oPM.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter updateAudioInfoListener, mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1471920oPG != c1471980oPM.LLILZ) {
            c1471980oPM.LLILZ = interfaceC1471920oPG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateAudioInfoListener: listener=");
            sbLIZ2.append(c1471980oPM.LLILZ);
            sbLIZ2.append(", mSourceId=");
            sbLIZ2.append(c1471980oPM.LLJJIJI);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJZL(InterfaceC1472010oPP interfaceC1472010oPP) {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        c1471980oPM.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter updateSubInfoListener; listener: ");
        sbLIZ.append(interfaceC1472010oPP);
        sbLIZ.append("; mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1472010oPP != c1471980oPM.LLILLL) {
            c1471980oPM.LLILLL = interfaceC1472010oPP;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateSubInfoListener listener=");
            sbLIZ2.append(interfaceC1472010oPP);
            sbLIZ2.append(", mSourceId=");
            sbLIZ2.append(c1471980oPM.LLJJIJI);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1479610obf
    public final void setLooping(boolean z) {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            c1472150oPd.setLooping(z);
        }
    }

    public static void LJJJJJ(String str, boolean z) {
        if (!C1474810oTv.LLJJJJ()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("TTPlayer", "createSessionId, sourceId is null");
                return;
            }
            return;
        }
        C1477400oY6.LJJJJI.LJFF(str, z);
    }

    @Override // X.InterfaceC1479610obf
    public final void LIZLLL(String str, String str2) {
        C1472150oPd player = this.LLLF.LLILLJJLI.getPlayer();
        if (player != null && player.LJJJLL() != null) {
            player.LJJJLL().LIZLLL(str, str2);
        }
    }

    public final void LJJJ(int i, JSONObject jSONObject) {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        c1471980oPM.getClass();
        C1481110oe5.LIZIZ("TTPlayer", "Enter addSubtitleLanguage");
        if (i == c1471980oPM.LLJJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addSubtitleLanguage: SKIP, mSubtitleId==subtitleId=");
            sbLIZ.append(i);
            sbLIZ.append(", mSourceId=");
            sbLIZ.append(c1471980oPM.LLJJIJI);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        c1471980oPM.LLJJ = i;
        C1469120oKk c1469120oKk = new C1469120oKk(jSONObject);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addSubtitleLanguage: subtitleId=");
        sbLIZ2.append(i);
        sbLIZ2.append(", mSourceId=");
        sbLIZ2.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        player.LJLJL(c1469120oKk);
        if (!c1471980oPM.LLJJI) {
            return;
        }
        c1471980oPM.LLJJI = false;
        c1471980oPM.LLJJIII = true;
        c1471980oPM.LIZLLL(216, 0);
    }

    public final void LJJLIIIJILLIZJL(String str, Map<String, Object> map) {
        LJJLIIIJJI(null, str, map);
    }

    public final void LJJLIIIJJIZ(C1472990oQz c1472990oQz, Map<String, Object> map) {
        LJJLIIIJJI(c1472990oQz, null, map);
    }

    public final void LJJZZIII(int i, String str) {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            if (!str.equals("header_play_init_subid")) {
                if (str.equals("subtitle_is_realtime_translated")) {
                    c1472150oPd.LIZJ(767, i);
                    return;
                }
                return;
            }
            c1472150oPd.LIZJ(764, i);
        }
    }

    public final void LJLI(int i, int i2) {
        C1472150oPd c1472150oPd = this.LLILZIL;
        if (c1472150oPd != null) {
            c1472150oPd.LIZJ(24, Integer.valueOf(i).intValue());
            this.LLILZIL.LIZJ(25, Integer.valueOf(i2).intValue());
        }
    }

    public final void LJLJL(int i, JSONObject jSONObject) {
        C1471980oPM c1471980oPM = this.LLJJIJIL;
        C1472150oPd player = c1471980oPM.LLILLJJLI.getPlayer();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enter setSubtitlesDefaultLanguageWithJSONObject; mSourceId=");
        sbLIZ.append(c1471980oPM.LLJJIJI);
        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (player != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setSubtitlesDefaultLanguageWithJSONObject subtitleId=");
            sbLIZ2.append(i);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            c1471980oPM.LLJJ = i;
            player.LIZJ(530, i);
            if (jSONObject != null) {
                c1471980oPM.LLJI = true;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setSubtitlesDefaultLanguageWithJSONObject subtitleDesInfoModelJSONObject: ");
                sbLIZ3.append(jSONObject);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                player.LJJIIJ(new C1469110oKj(jSONObject));
            }
        }
    }

    public final void LJLLI(float f, float f2) {
        try {
            C1472150oPd c1472150oPd = this.LLILZIL;
            if (c1472150oPd != null) {
                c1472150oPd.LJIILLIIL(f, f2);
                this.LLJJIJI = f;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SimRadar.errorScan("TTPlayer", "setVolume", new C1473280oRS(e), Float.valueOf(f), Float.valueOf(f2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJZ(java.lang.String r10, android.view.Surface r11) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472250oPn.LJZ(java.lang.String, android.view.Surface):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32, types: [X.0oPd, com.ss.ttvideoengine.TTVideoEngine] */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r5v49, types: [X.0oPd, com.ss.ttvideoengine.TTVideoEngine] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.0oPd, com.ss.ttvideoengine.TTVideoEngine] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJJJIZL(C1472990oQz c1472990oQz, String str, Map<String, Object> map) {
        boolean zBooleanValue;
        int iIntValue;
        int iIntValue2;
        ?? BooleanValue;
        Float f;
        ?? BooleanValue2;
        InterfaceC1469840oLu interfaceC1469840oLu;
        ?? BooleanValue3;
        C1473010oR1 c1473010oR1;
        C1473210oRL c1473210oRL;
        int iIntValue3;
        if (map == null) {
            map = new HashMap<>();
        }
        SimRadar.keyScan("TTPlayer", "prepareAsync", c1472990oQz, str);
        boolean zLIZJ = C1472050oPT.LIZJ(c1472990oQz);
        map.put("is_dash", Boolean.valueOf(zLIZJ));
        if (map.get("group_id") != null) {
            String string = map.get("group_id").toString();
            this.LLJ = string;
            this.LLILZIL.LIZ(1416, string);
        }
        if (map.get("cross_talk_call_link") != null) {
            this.LLILZIL.LJJII = map.get("cross_talk_call_link").toString();
        }
        this.LLLILZJ.LJJIJIL();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepareAsync url: ");
            sbLIZ.append(str);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILZIL.LIZJ(583, 0);
        if (map.get("header_play_aweme_type") != null) {
            this.LLILZIL.LIZJ(4303, ((Integer) map.get("header_play_aweme_type")).intValue());
        }
        if (map.get("header_url_counts") != null) {
            this.LLILZIL.LIZJ(4314, ((Integer) map.get("header_url_counts")).intValue());
        }
        if (map.get("header_play_aweme_cache_type") != null) {
            this.LLILZIL.LIZJ(4311, ((Integer) map.get("header_play_aweme_cache_type")).intValue());
        }
        if (map.get("header_play_aweme_distribute_source") != null) {
            this.LLILZIL.LIZ(4312, (String) map.get("header_play_aweme_distribute_source"));
        }
        if (map.get("header_play_event_type") != null) {
            this.LLILZIL.LIZ(4305, (String) map.get("header_play_event_type"));
        }
        if (map.get("header_play_audio_meta") != null) {
            this.LLILZIL.LIZ(4326, (String) map.get("header_play_audio_meta"));
        }
        if (map.get("enable_radio_mode") != null) {
            this.LLILZIL.LIZJ(480, ((Boolean) map.get("enable_radio_mode")).booleanValue() ? 1 : 0);
        }
        if (map.get("aweme_feed_born_time") != null) {
            long jLongValue = ((Long) map.get("aweme_feed_born_time")).longValue();
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("prepareAsync: with aweme_born_time, set PLAYER_OPTION_AWEME_BORN_TIME_TRACE_ID, awemeBornMs=");
                sbLIZ2.append(jLongValue);
                sbLIZ2.append(", mSourceId=");
                sbLIZ2.append(this.LLJ);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C1472150oPd c1472150oPd = this.LLILZIL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(String.valueOf(jLongValue));
            sbLIZ3.append("_");
            sbLIZ3.append(this.LLJ);
            c1472150oPd.LIZ(4304, C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LLLILZ.LJFF(map);
        C1470240oMY tag = null;
        this.LLIZLLLIL = null;
        boolean zBooleanValue2 = ((Boolean) map.get("prepare_only")).booleanValue();
        if (map.get("skip_start_when_prepare") != null && (map.get("skip_start_when_prepare") instanceof Boolean)) {
            zBooleanValue = ((Boolean) map.get("skip_start_when_prepare")).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue && zBooleanValue2) {
            this.LLILZIL.LIZJ(984, 1);
        } else {
            this.LLILZIL.LIZJ(984, 0);
        }
        this.LLILZIL.LIZJ(100, !zBooleanValue2 ? 1 : 0);
        this.LLILZIL.LIZJ(707, ((Boolean) map.get("header_support_play_no_surface")).booleanValue() ? 1 : 0);
        if (map.get("header_play_init_subid") != null) {
            this.LLILZIL.LIZJ(764, ((Integer) map.get("header_play_init_subid")).intValue());
        }
        if (map.get("subtitle_is_realtime_translated") != null) {
            this.LLILZIL.LIZJ(767, ((Boolean) map.get("subtitle_is_realtime_translated")).booleanValue() ? 1 : 0);
        }
        if (map.get("duration") != null) {
            iIntValue = ((Integer) map.get("duration")).intValue();
            this.LLILZIL.LIZJ(1074, iIntValue);
        } else {
            iIntValue = 0;
        }
        if ((map.get("predemux_only") instanceof Boolean) && ((Boolean) map.get("predemux_only")).booleanValue()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("TTPlayer", "preDemux open");
            }
            this.LLILZIL.LIZJ(586, 1);
        }
        if (map.get("header_audio_track_content_type") != null && (map.get("header_audio_track_content_type") instanceof Integer)) {
            iIntValue2 = ((Integer) map.get("header_audio_track_content_type")).intValue();
        } else {
            iIntValue2 = -1;
        }
        C01GW c01gw = C1474810oTv.LJJJI;
        if (((Number) c01gw.getValue()).intValue() == 1 && iIntValue2 >= 0) {
            this.LLILZIL.LIZJ(744, iIntValue2);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("set audioTrackContentType from meta ");
                sbLIZ4.append(iIntValue2);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ4));
            }
        } else if (((Number) c01gw.getValue()).intValue() == 2) {
            C01GW c01gw2 = C1474810oTv.LJJJIL;
            if (((Number) c01gw2.getValue()).intValue() >= 0) {
                int iIntValue4 = ((Number) c01gw2.getValue()).intValue();
                this.LLILZIL.LIZJ(744, iIntValue4);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("set audioTrackContentType from setting ");
                    sbLIZ5.append(iIntValue4);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
        }
        if (map.get("header_enable_report_url") != null) {
            this.LLILZIL.LIZJ(1430, ((Boolean) map.get("header_enable_report_url")).booleanValue() ? 1 : 0);
        }
        if (map.get("header_enable_safe_mode") != null && ((Boolean) map.get("header_enable_safe_mode")).booleanValue()) {
            this.LLILZIL.LIZJ(1431, 1);
        }
        if (map.get("dash_hijack_retry") != null) {
            BooleanValue = ((Boolean) map.get("dash_hijack_retry")).booleanValue();
        } else {
            BooleanValue = 0;
        }
        if (map.get("network_speed") != null && (map.get("network_speed") instanceof Integer)) {
            this.LLILZIL.LIZJ(487, ((Integer) map.get("network_speed")).intValue());
        }
        LJLIIIL();
        if (map.get("is_play_loop") != null && (map.get("is_play_loop") instanceof Boolean)) {
            this.LLILZIL.setLooping(((Boolean) map.get("is_play_loop")).booleanValue());
        } else {
            this.LLILZIL.setLooping(true);
        }
        if (map.get("play_loop_start_time") instanceof Integer) {
            this.LLILZIL.LIZJ(24, ((Integer) map.get("play_loop_start_time")).intValue());
        }
        if (map.get("play_loop_end_time") instanceof Integer) {
            this.LLILZIL.LIZJ(25, ((Integer) map.get("play_loop_end_time")).intValue());
        }
        if (map.get("play_speed") != null && (map.get("play_speed") instanceof Float)) {
            f = (Float) map.get("play_speed");
        } else {
            f = null;
        }
        if (map.get("enable_buffer_preload") != null && ((Boolean) map.get("enable_buffer_preload")).booleanValue() && map.get("buffer_preload_danger") != null && map.get("buffer_preload_secure") != null) {
            this.LLILZIL.LJLLILLLL(((Integer) map.get("buffer_preload_danger")).intValue(), ((Integer) map.get("buffer_preload_secure")).intValue());
        }
        if (map.get("call_current_playback_time") != null && (map.get("call_current_playback_time") instanceof Boolean)) {
            this.LLJI = ((Boolean) map.get("call_current_playback_time")).booleanValue();
        }
        if (map.get("header_voice_stream_type") != null) {
            this.LLILZIL.LIZJ(255, ((Integer) map.get("header_voice_stream_type")).intValue());
        }
        if (map.get("header_enable_correct_real_clock") == null) {
            BooleanValue2 = 0;
        } else {
            BooleanValue2 = ((Boolean) map.get("header_enable_correct_real_clock")).booleanValue();
        }
        this.LLILZIL.LIZJ(42004, BooleanValue2);
        int i = this.LLILLJJLI.get(46);
        if (i > 0) {
            this.LLILZIL.LIZJ(205, i);
        }
        int i2 = this.LLILLJJLI.get(94, 0);
        int i3 = this.LLILLJJLI.get(95, C538540LAe.LLJJJIL);
        if (i2 == 1 && iIntValue > i3) {
            this.LLILZIL.LIZJ(118, this.LLILLJJLI.get(96, 2000));
            this.LLILZIL.LIZJ(202, this.LLILLJJLI.get(97, 10000));
        }
        this.LLILZIL.LLFF(this.LLJ);
        this.LLLFFI.LIZLLL(map);
        if (C1474810oTv.LJLLJ() && map.get("header_surface") != null) {
            LJLL((Surface) map.get("header_surface"));
        }
        Surface surface = this.LLJIJIL;
        if (surface != null) {
            TextureView textureViewLIZJ = C1471640oOo.LIZJ(surface);
            if (textureViewLIZJ instanceof C1473810oSJ) {
                C1473810oSJ c1473810oSJ = (C1473810oSJ) textureViewLIZJ;
                c1473810oSJ.LIZ();
                this.LLILZIL.LIZJ(1807, c1473810oSJ.getSurfaceTextureReuseState());
            }
        }
        this.LLILZIL.LLFFF(this.LLJ);
        if (C1474810oTv.LLJJJJ()) {
            String strLJIILJJIL = C1477400oY6.LJJJJI.LJIILJJIL(this.LLJ);
            if (TextUtils.isEmpty(strLJIILJJIL) && C1474810oTv.LJJLIIIJL()) {
                LJJJJJ(this.LLJ, zBooleanValue2);
                strLJIILJJIL = C1477400oY6.LJIIL().LJIILJJIL(this.LLJ);
            }
            this.LLILZIL.LJLLL(EnumC1471520oOc.VIDEOEVENT_CUSTOM_INFO_CUSTOM_PLAY_SESSION_ID, strLJIILJJIL);
            if (C1474810oTv.LJJLI()) {
                C1477400oY6.LJIIL().LJJJJI(strLJIILJJIL);
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("sourceId = ");
                sbLIZ6.append(this.LLJ);
                sbLIZ6.append(", use v2 customSessionId = ");
                sbLIZ6.append(strLJIILJJIL);
                sbLIZ6.append(", this=");
                sbLIZ6.append(this);
                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ6));
            }
        } else if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("sourceId = ");
            sbLIZ7.append(this.LLJ);
            sbLIZ7.append(", old sessionId,do not set to player ");
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ7));
        }
        this.LLIZLLLIL = str;
        if (C1472310oPt.LIZLLL) {
            C1472310oPt.LIZ();
            this.LLILZIL.LLIIIL(new C1469830oLt(C1472310oPt.LJ));
        } else {
            C1480980ods c1480980ods = this.LLILZ;
            if (c1480980ods.LJIIZILJ && (interfaceC1469840oLu = c1480980ods.LJIJJLI) != null) {
                this.LLILZIL.LLIIIL(new C1469830oLt(interfaceC1469840oLu));
            } else {
                this.LLILZIL.LLIIIL(null);
            }
        }
        C1472310oPt.LIZJ();
        InterfaceC1472690oQV interfaceC1472690oQV = this.LLILZ.LJIL;
        if (interfaceC1472690oQV != null) {
            interfaceC1472690oQV.LIZ();
        }
        if (map.get("init_start_time_ms") != null) {
            this.LLILZIL.LLILII(((Integer) map.get("init_start_time_ms")).intValue());
        } else {
            this.LLILZIL.LLILII(0);
        }
        if (((Boolean) C1474810oTv.LLZILL.getValue()).booleanValue()) {
            if (map.get("loop_start_time_ms") != null) {
                this.LLILZIL.LIZJ(24, ((Integer) map.get("loop_start_time_ms")).intValue());
            } else {
                this.LLILZIL.LIZJ(24, 0);
            }
            if (map.get("loop_end_time_ms") != null) {
                this.LLILZIL.LIZJ(25, ((Integer) map.get("loop_end_time_ms")).intValue());
            } else {
                this.LLILZIL.LIZJ(25, 0);
            }
        }
        if (LLLJ) {
            this.LLILZIL.LLJIJIL("vod_cold_start");
        } else if (map.get("tag") != null) {
            this.LLILZIL.LLJIJIL((String) map.get("tag"));
        } else {
            this.LLILZIL.LLJIJIL(null);
        }
        LJLJJLL(map.get("sub_tag"));
        this.LLILZIL.LLJJIJIIJIL((Map) map.get("vod_scene_tag"));
        this.LLILZIL.LIZJ(332, this.LLILZ.LJIIJ ? 1 : 0);
        if (map.get("header_enable_video_second_frame") != null && ((Boolean) map.get("header_enable_video_second_frame")).booleanValue()) {
            this.LLILZIL.LIZJ(992, 1);
        }
        this.LLILZIL.LIZJ(110, 1);
        this.LLILZIL.LIZJ(3, 1);
        this.LLILZIL.LIZJ(183, 0);
        if (this.LLILLJJLI.indexOfKey(39) >= 0) {
            this.LLILZIL.LIZJ(301, this.LLILLJJLI.get(39));
            int i4 = this.LLILLJJLI.get(48);
            if (this.LLILLJJLI.get(39) > 0 && i4 > 0) {
                C1472150oPd c1472150oPd2 = this.LLILZIL;
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(i4);
                sbLIZ8.append("");
                c1472150oPd2.LJJIII("X-PCDN-FRange-Size", C2188811AlT.LIZIZ(sbLIZ8));
            }
        }
        String str2 = (String) C1474810oTv.LJLJL.getValue();
        if (!TextUtils.isEmpty(str2)) {
            this.LLILZIL.LJJIII("X-PCDN-MinCache", str2);
        }
        if (this.LLILLJJLI.indexOfKey(49) >= 0) {
            this.LLILZIL.LIZJ(656, this.LLILLJJLI.get(49));
        }
        if (this.LLILLJJLI.indexOfKey(50) >= 0) {
            this.LLILZIL.LIZJ(657, this.LLILLJJLI.get(50));
        }
        if (this.LLILLJJLI.indexOfKey(38) >= 0) {
            this.LLILZIL.LIZJ(416, this.LLILLJJLI.get(38));
        }
        if (this.LLILLJJLI.indexOfKey(37) >= 0) {
            this.LLILZIL.LIZJ(302, this.LLILLJJLI.get(37));
        }
        if (this.LLILLJJLI.indexOfKey(41) >= 0) {
            this.LLILZIL.LIZJ(481, this.LLILLJJLI.get(41));
        }
        if (this.LLILLJJLI.indexOfKey(40) >= 0) {
            this.LLILZIL.LIZJ(479, this.LLILLJJLI.get(40));
        }
        this.LLILZIL.LIZJ(333, this.LLILZ.LJJIIZ ? 1 : 0);
        this.LLILZIL.LIZJ(609, this.LLILZ.LJJIIZI);
        this.LLILZIL.LIZJ(28, this.LLILZ.LJJIJ);
        if (this.LLILZ.LJJIII) {
            this.LLILZIL.LIZJ(5, 5);
        }
        if (map.get("header_play_3d_video") != null && ((Boolean) map.get("header_play_3d_video")).booleanValue()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("TTPlayer", " prepareAsync is3DVideoPlay");
            }
            this.LLILZIL.LIZJ(5, 8);
            this.LLILZIL.LIZJ(4325, 1);
        }
        if (map.get("header_play_alpha_video") != null && ((Boolean) map.get("header_play_alpha_video")).booleanValue()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("TTPlayer", " prepareAsync isAlphaVideoPlay");
            }
            this.LLILZIL.LIZJ(5, 8);
            this.LLILZIL.LIZJ(4325, 2);
        }
        if ((map.get("header_enable_file_io_opt") instanceof Boolean) && ((Boolean) map.get("header_enable_file_io_opt")).booleanValue()) {
            this.LLILZIL.LIZJ(668, ((Integer) map.get("resume_fileio_block_duration_threshold")).intValue());
            int iIntValue5 = ((Integer) map.get("mem_cache_video_duration_threshold")).intValue();
            if (iIntValue5 > 0 && iIntValue > iIntValue5) {
                this.LLILZIL.LJJIII("X-Mem-Cache", CardStruct.IStatusCode.DEFAULT);
            } else {
                this.LLILZIL.LJJIII("X-Mem-Cache", "1");
            }
        } else {
            this.LLILZIL.LIZJ(668, 0);
            this.LLILZIL.LJJIII("X-Mem-Cache", CardStruct.IStatusCode.DEFAULT);
        }
        if ((map.get("header_bind_big_core") instanceof Boolean) && ((Boolean) map.get("header_bind_big_core")).booleanValue()) {
            this.LLILZIL.LIZJ(42081, 1);
        }
        if (map.get("header_ttr_audio_effect_type") != null) {
            this.LLILZIL.LIZJ(1371, ((Integer) map.get("header_ttr_audio_effect_type")).intValue());
        }
        this.LLILZIL.LIZJ(508, this.LLILZ.LJJIIJ);
        this.LLILZIL.LIZJ(482, this.LLILZ.LJIJI);
        this.LLILZIL.LIZJ(516, this.LLILZ.LJJIIJZLJL);
        this.LLILZIL.LIZJ(402, this.LLILZ.LJIILL);
        this.LLILZIL.LIZJ(323, this.LLILZ.LJIILLIIL);
        this.LLILZIL.LIZJ(484, 1);
        this.LLILZIL.LIZJ(490, this.LLILZ.LJJI);
        C1481010odv c1481010odv = this.LLILZ.LJII;
        if (c1481010odv != null) {
            this.LLILZIL.LIZJ(473, c1481010odv.LJIIIZ);
            this.LLILZIL.LIZJ(474, c1481010odv.LJIIJ);
            this.LLILZIL.LIZJ(475, c1481010odv.LJIIJJI);
            this.LLILZIL.LIZJ(422, c1481010odv.LIZIZ);
            this.LLILZIL.LIZJ(423, c1481010odv.LIZJ);
            this.LLILZIL.LIZJ(204, c1481010odv.LIZLLL);
            this.LLILZIL.LIZJ(424, c1481010odv.LJFF);
            this.LLILZIL.LIZJ(425, c1481010odv.LJI);
            this.LLILZIL.LIZJ(427, BooleanValue);
            this.LLILZIL.LIZJ(471, c1481010odv.LJIIIIZZ);
            if (zLIZJ) {
                this.LLILZIL.LIZJ(313, c1481010odv.LJ);
                this.LLILZIL.LIZJ(483, c1481010odv.LJIIL);
            } else {
                this.LLILZIL.LIZJ(473, c1481010odv.LJIILIIL);
                this.LLILZIL.LIZJ(422, c1481010odv.LJIILJJIL);
                this.LLILZIL.LIZJ(483, c1481010odv.LJIILL);
            }
        }
        LJJLIIIJL(map);
        this.LLLILZ.LJI(map);
        LJJLIIIJLJLI(map);
        this.LLILZIL.LJLLJ();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("start prepare mPlayer = ");
            sbLIZ9.append(this.LLILZIL);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ9));
        }
        if (f != null && Math.abs(f.floatValue() - 1.0f) > 0.01f) {
            LJI(f.floatValue());
        }
        if (map.get("core_vc1_thread_num") != null && (iIntValue3 = ((Integer) map.get("core_vc1_thread_num")).intValue()) > 0) {
            this.LLILZIL.LIZJ(42321, iIntValue3);
        }
        if ((map.get("header_disable_split_voice_write") instanceof Integer) && ((Integer) map.get("header_disable_split_voice_write")).intValue() == 1) {
            this.LLILZIL.LIZJ(565, 1);
            this.LLILZIL.LIZJ(994, 0);
        }
        if (zBooleanValue2 && map.get("pre_render_stage") != null) {
            this.LLILZIL.LIZJ(1425, ((Integer) map.get("pre_render_stage")).intValue());
        }
        if (map.get("main_url") != null) {
            this.LLILZIL.LIZ(1426, String.valueOf(map.get("main_url")));
        }
        if (map.get("api_url") != null) {
            this.LLILZIL.LIZ(1427, String.valueOf(map.get("api_url")));
        }
        if (map.get("header_fid_labels") != null) {
            this.LLILZIL.LIZ(1429, String.valueOf(map.get("header_fid_labels")));
        }
        Object obj = map.get("formater_buffer_type");
        Object obj2 = map.get("formater_buffer_threshold");
        Object obj3 = map.get("formater_buffer_speed_changed");
        if (obj != null) {
            this.LLILZIL.LIZJ(1122, ((Integer) obj).intValue());
        }
        if (obj2 != null) {
            this.LLILZIL.LIZJ(996, ((Integer) obj2).intValue());
        }
        if (obj3 != null) {
            this.LLILZIL.LIZJ(990, ((Integer) obj3).intValue());
        }
        if (zLIZJ && c1472990oQz != null && ((Boolean) C1474810oTv.M0.getValue()).booleanValue()) {
            C1474600oTa c1474600oTa = c1472990oQz.LIZIZ;
            if (c1474600oTa != null) {
                tag = c1474600oTa.getTag();
            }
            C1466990oHJ c1466990oHJ = this.LLILZIL.LIZ;
            if (!c1466990oHJ.F5) {
                c1466990oHJ.LLLLII(tag, false);
                c1466990oHJ.F5 = true;
            }
        }
        if (map.get("video_extra") != null && (map.get("video_extra") instanceof C1472900oQq)) {
            String vmaf = ((C1472900oQq) map.get("video_extra")).getVmaf();
            if (!TextUtils.isEmpty(vmaf)) {
                this.LLILZIL.LIZ(1227, vmaf);
            }
            String ufq = ((C1472900oQq) map.get("video_extra")).getUfq();
            if (!TextUtils.isEmpty(ufq)) {
                this.LLILZIL.LIZ(1502, ufq);
            }
            String transcodeFeatureId = ((C1472900oQq) map.get("video_extra")).getTranscodeFeatureId();
            if (!TextUtils.isEmpty(transcodeFeatureId)) {
                this.LLILZIL.LIZ(1421, transcodeFeatureId);
            }
            map.get("video_extra");
            String audioEnhanceMetrics = ((C1472900oQq) map.get("video_extra")).getAudioEnhanceMetrics();
            if (!TextUtils.isEmpty(audioEnhanceMetrics)) {
                this.LLILZIL.LIZ(1422, audioEnhanceMetrics);
            }
            String audioScore = ((C1472900oQq) map.get("video_extra")).getAudioScore();
            if (!TextUtils.isEmpty(audioScore)) {
                this.LLILZIL.LIZ(1423, audioScore);
            }
            C1472890oQp loudNormInfo = ((C1472900oQq) map.get("video_extra")).getLoudNormInfo();
            if (loudNormInfo != null) {
                this.LLILZIL.LLD((float) loudNormInfo.getLoudness(), 1424);
            }
            if (map.get("meta_info") != null && (c1473210oRL = (C1473210oRL) map.get("meta_info")) != null) {
                String flightId = c1473210oRL.getFlightId();
                if (!TextUtils.isEmpty(flightId)) {
                    this.LLILZIL.LIZ(1283, flightId);
                }
                String spExtraInfo = c1473210oRL.getSpExtraInfo();
                if (!TextUtils.isEmpty(spExtraInfo)) {
                    this.LLILZIL.LIZ(1432, spExtraInfo);
                }
            }
        }
        if (map.get("header_signal_state") != null && (c1473010oR1 = (C1473010oR1) map.get("header_signal_state")) != null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("TTPlayer", C786410Ut5.j4("transfer signal, TTPlayer to Engine when prepare, aid:%s, prepareOnly:%s, isScrolling:%s", new Object[]{this.LLJ, Boolean.valueOf(zBooleanValue2), Boolean.valueOf(c1473010oR1.LIZ)}));
            }
            this.LLILZIL.LIZJ(35002, c1473010oR1.LIZ ? 1 : 0);
        }
        if (map.get("header_vq_score") != null && (map.get("header_vq_score") instanceof Float)) {
            float fFloatValue = ((Float) map.get("header_vq_score")).floatValue();
            if (fFloatValue > 0.0f) {
                this.LLILZIL.LLD(fFloatValue, 1228);
            }
        }
        if (((Boolean) C1474810oTv.f1.getValue()).booleanValue()) {
            this.LLILZIL.LIZJ(1282, C0V12.LJ(this.LL) ? 1 : 0);
        }
        if (((Boolean) C1474810oTv.h4.getValue()).booleanValue()) {
            if (map.get("is_cache") != null) {
                BooleanValue3 = ((Boolean) map.get("is_cache")).booleanValue();
            } else {
                BooleanValue3 = 0;
            }
            this.LLILZIL.LIZJ(42938, BooleanValue3);
        }
        if (LLLJ) {
            this.LLILZIL.LIZJ(42703, ((Number) C1474810oTv.c5.getValue()).intValue());
        }
        LLLJ = false;
        this.LLILZIL.LLJL(zBooleanValue2);
        this.LLLILZJ.LJJIZ(map);
        C1477400oY6 c1477400oY6LJIIL = C1477400oY6.LJIIL();
        this.LLILZIL.LJJLIIIJJIZ(1420);
        c1477400oY6LJIIL.getClass();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("before play prepareOnly ");
            sbLIZ10.append(zBooleanValue2);
            sbLIZ10.append(" ");
            sbLIZ10.append(SystemClock.elapsedRealtime());
            sbLIZ10.append(" sourceId ");
            sbLIZ10.append(this.LLJ);
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ10));
        }
    }

    public final void LJJLIIIJJI(C1472990oQz c1472990oQz, String str, Map map) {
        LJJJJIZL(c1472990oQz, str, map);
        if (C1472750oQb.LIZ) {
            C1472750oQb.LIZ = false;
            C1472750oQb.LJIIIIZZ = true;
        } else {
            if (!C1472750oQb.LJIIIIZZ) {
                return;
            }
            C1602860roS.LIZ.getClass();
            if (!C1602860roS.LJFF()) {
                return;
            }
            C1150504el.LIZ().LJI("cold_boot_start_to_prerender_end_nuj_scene", false);
            C1150504el.LIZ().LJI("player_prerender_duration_after_tryplay_nuj_scene", false);
            C1472750oQb.LJIIIIZZ = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oPb] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0oQv] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0oOh] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0oRr] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0oRN] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0oPW] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0oMM] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0oQe] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.0oLe] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.0oMW] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0oLL] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.0oRp] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0oLI] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0oLH] */
    public C1472250oPn(Context context, boolean z, SparseIntArray sparseIntArray, SparseArray sparseArray, C1480980ods c1480980ods) {
        C1473490oRn c1473490oRn = new C1473490oRn(this);
        this.LLLIIIL = c1473490oRn;
        this.LLLIIL = new C1469760oLm(this) { // from class: X.0oLe
            @Override // X.C1469760oLm, X.InterfaceC1472290oPr
            public final void LJJIIJZLJL(Map<String, ? extends Object> map) {
                float fFloatValue;
                Float f;
                C1472150oPd player = this.LLILLJJLI.getPlayer();
                if (player == null) {
                    return;
                }
                boolean zLJFF = Intrinsics.LJFF(map.get("header_enable_ttr_gaussian_blur"), Boolean.TRUE);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("enableGaussianBlur:");
                    sbLIZ.append(zLJFF);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                }
                player.LIZJ(43221, zLJFF ? 1 : 0);
                if (zLJFF) {
                    player.LIZJ(5, 8);
                    Object obj = map.get("ttr_image_layout_offset");
                    if ((obj instanceof Float) && (f = (Float) obj) != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    player.LIZJ(43222, (int) (fFloatValue * 1000000));
                }
            }
        };
        this.LLLIILIL = new C1469760oLm(this) { // from class: X.0oMW
            @Override // X.C1469760oLm, X.InterfaceC1472290oPr
            public final void LJJIIJZLJL(Map<String, ? extends Object> map) {
                C0NBK c0nbk;
                C1472150oPd player = this.LLILLJJLI.getPlayer();
                if (player != null && (c0nbk = (C0NBK) map.get("header_ttr_brightness_arg")) != null) {
                    if (c0nbk.LIZ) {
                        player.LIZJ(5, 8);
                        player.LIZJ(43275, 1);
                    }
                    int i = c0nbk.LIZIZ;
                    if (i >= 0 && i <= 100) {
                        player.LIZJ(43276, i);
                    }
                    int i2 = c0nbk.LJ;
                    if (i2 >= 0 && i2 <= 100) {
                        player.LIZJ(43277, i2);
                    }
                    int i3 = c0nbk.LIZLLL;
                    if (i3 > 0) {
                        player.LIZJ(43278, i3);
                    }
                    if (c0nbk.LIZJ) {
                        player.LIZJ(43279, 1);
                    }
                }
            }
        };
        this.LLLIL = new C1469760oLm(this) { // from class: X.0oRp
            @Override // X.C1469760oLm, X.InterfaceC1472290oPr
            public final void LJJIIJZLJL(Map<String, Object> map) {
                Object objCast;
                final InterfaceC1499700p84 interfaceC1499700p84;
                C1280410jQN config;
                C1280410jQN config2;
                C1472150oPd player = this.LLILLJJLI.getPlayer();
                if (player == null) {
                    return;
                }
                Object obj = Boolean.FALSE;
                Object obj2 = map.get("disable_render_audio");
                if (obj2 != null) {
                    obj = obj2;
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object objCast2 = null;
                if (map.get("voice_trait") != null) {
                    objCast = C1ET9.class.cast(map.get("voice_trait"));
                } else {
                    objCast = null;
                }
                final C1ET9 c1et9 = (C1ET9) objCast;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setAudioTrait: disableRenderAudio: ");
                    sbLIZ.append(zBooleanValue);
                    sbLIZ.append(", voiceTraitListener: ");
                    sbLIZ.append(c1et9);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (zBooleanValue) {
                    if (c1et9 != null) {
                        if (c1et9.getConfig() == null) {
                            config2 = new C1280410jQN();
                        } else {
                            config2 = c1et9.getConfig();
                        }
                        player.LIZJ(430, 3);
                        player.LIZJ(1406, 1);
                        final int i = config2.LIZ;
                        player.LJJ(i, new VoiceTrait(i, c1et9) { // from class: X.1ET8
                            public final C1ET9 LIZIZ;

                            @Override // com.ss.ttm.player.VoiceTrait
                            public final void audioClose() {
                                this.LIZIZ.LIZ();
                            }

                            @Override // com.ss.ttm.player.VoiceTrait
                            public final void audioFlush() {
                                this.LIZIZ.LIZJ();
                            }

                            @Override // com.ss.ttm.player.VoiceTrait
                            public final void audioPause() {
                                this.LIZIZ.LJFF();
                            }

                            @Override // com.ss.ttm.player.VoiceTrait
                            public final void audioResume() {
                                this.LIZIZ.LIZIZ();
                            }

                            @Override // com.ss.ttm.player.VoiceTrait
                            public final int getLatency() {
                                this.LIZIZ.getLatency();
                                return 0;
                            }

                            @Override // com.ss.ttm.player.VoiceTrait
                            public final int audioOpen(VoiceTrait.AudioMediaInfo audioMediaInfo) {
                                this.LIZIZ.LJ(new C1280400jQM(audioMediaInfo.LIZ, audioMediaInfo.LIZIZ, audioMediaInfo.LIZJ, audioMediaInfo.LIZLLL, audioMediaInfo.LJ, audioMediaInfo.LJFF, audioMediaInfo.LJI));
                                return 0;
                            }

                            @Override // com.ss.ttm.player.VoiceTrait
                            public final int audioWrite(VoiceTrait.AudioFrameInfo audioFrameInfo) {
                                this.LIZIZ.LIZLLL(new C1280390jQL(audioFrameInfo.mBuffers, audioFrameInfo.mSamples, audioFrameInfo.mTimestamp));
                                return 0;
                            }

                            {
                                this.LIZIZ = c1et9;
                            }
                        });
                    } else if (map.get("process_audio_addr") != null && (map.get("process_audio_addr") instanceof Long)) {
                        Long l = (Long) map.get("process_audio_addr");
                        player.LIZJ(610, 0);
                        player.LIZJ(430, 2);
                        if (l.longValue() > 0) {
                            if (C1481110oe5.LIZ) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("disableRenderAudio addr ");
                                sbLIZ2.append(l);
                                C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            player.LIZIZ(440, l.longValue());
                        }
                    }
                } else if (c1et9 != null) {
                    if (c1et9.getConfig() == null) {
                        config = new C1280410jQN();
                    } else {
                        config = c1et9.getConfig();
                    }
                    player.LIZJ(43274, 1);
                    final int i2 = config.LIZ;
                    player.LJJ(i2, new AudioProxyTrait(i2, c1et9) { // from class: X.1ET7
                        public final C1280390jQL LIZIZ = new C1280390jQL(null, 0, 0);
                        public final C1ET9 LIZJ;

                        @Override // com.ss.ttm.player.AudioProxyTrait
                        public final void audioClose() {
                            this.LIZJ.LIZ();
                        }

                        @Override // com.ss.ttm.player.AudioProxyTrait
                        public final void audioOpen(AudioProxyTrait.AudioMediaInfo audioMediaInfo) {
                            this.LIZJ.LJ(new C1280400jQM(audioMediaInfo.LIZ, audioMediaInfo.LIZIZ, audioMediaInfo.LIZJ, audioMediaInfo.LIZLLL, audioMediaInfo.LJ, audioMediaInfo.LJFF, audioMediaInfo.LJI));
                        }

                        @Override // com.ss.ttm.player.AudioProxyTrait
                        public final void audioWrite(AudioProxyTrait.AudioFrameInfo audioFrameInfo) {
                            C1280390jQL c1280390jQL = this.LIZIZ;
                            c1280390jQL.LIZ = audioFrameInfo.mBuffers;
                            c1280390jQL.LIZIZ = audioFrameInfo.mSamples;
                            c1280390jQL.LIZJ = audioFrameInfo.mTimestamp;
                            this.LIZJ.LIZLLL(c1280390jQL);
                        }

                        {
                            this.LIZJ = c1et9;
                        }
                    });
                } else {
                    player.LIZJ(430, 1);
                    C1472150oPd player2 = this.LLILLJJLI.getPlayer();
                    if (player2 != null && (map.get("header_audio_processor") instanceof InterfaceC1499700p84) && (interfaceC1499700p84 = (InterfaceC1499700p84) map.get("header_audio_processor")) != null) {
                        player2.LJJII(new AudioProcessor() { // from class: X.0p83
                            @Override // com.ss.ttm.player.AudioProcessor
                            public final void audioClose() {
                                interfaceC1499700p84.LIZ();
                            }

                            @Override // com.ss.ttm.player.AudioProcessor
                            public final void audioRelease(int i3) {
                                interfaceC1499700p84.LIZIZ();
                            }

                            @Override // com.ss.ttm.player.AudioProcessor
                            public final void audioProcess(ByteBuffer[] byteBufferArr, int i3, long j) {
                                interfaceC1499700p84.LIZJ(byteBufferArr, i3, j);
                            }

                            @Override // com.ss.ttm.player.AudioProcessor
                            public final void audioOpen(int i3, int i4, int i5, int i6) {
                                interfaceC1499700p84.LIZLLL(i3, i4, i5);
                            }
                        });
                    }
                }
                if (map.get("video_trait") != null) {
                    objCast2 = InterfaceC1487080oni.class.cast(map.get("video_trait"));
                }
                final InterfaceC1487080oni interfaceC1487080oni = (InterfaceC1487080oni) objCast2;
                if (interfaceC1487080oni != null) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("setVideoTrait: ");
                        sbLIZ3.append(interfaceC1487080oni);
                        C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    C1473520oRq config3 = interfaceC1487080oni.getConfig();
                    player.LIZJ(5, 8);
                    if (config3 != null) {
                        player.LIZJ(43290, config3.LIZ ? 1 : 0);
                        player.LIZJ(43291, config3.LIZIZ);
                        player.LIZJ(43292, config3.LIZJ);
                        player.LIZJ(43293, config3.LIZLLL);
                    }
                    player.LJJ(4, new TTRVideoTrait(interfaceC1487080oni) { // from class: X.0onj
                        public final C1487110onl LIZIZ = new C1487110onl();
                        public final InterfaceC1487080oni LIZJ;

                        @Override // com.ss.ttm.player.TTRVideoTrait
                        public final void videoClose() {
                            this.LIZJ.LJFF();
                        }

                        @Override // com.ss.ttm.player.TTRVideoTrait
                        public final void videoFlush() {
                            this.LIZJ.LIZLLL();
                        }

                        @Override // com.ss.ttm.player.TTRVideoTrait
                        public final void videoPause() {
                            this.LIZJ.LIZIZ();
                        }

                        @Override // com.ss.ttm.player.TTRVideoTrait
                        public final void videoResume() {
                            this.LIZJ.LIZJ();
                        }

                        {
                            this.LIZJ = interfaceC1487080oni;
                        }

                        @Override // com.ss.ttm.player.TTRVideoTrait
                        public final int videoOpen(TTRVideoTrait.VideoMediaInfo videoMediaInfo) {
                            this.LIZJ.LJ();
                            return 0;
                        }

                        @Override // com.ss.ttm.player.TTRVideoTrait
                        public final int videoWrite(TTRVideoTrait.VideoFrameInfo videoFrameInfo) {
                            C1487110onl c1487110onl = this.LIZIZ;
                            c1487110onl.LIZ = videoFrameInfo.mBuffer;
                            c1487110onl.LIZIZ = videoFrameInfo.mWidth;
                            c1487110onl.LIZJ = videoFrameInfo.mHeight;
                            c1487110onl.LIZLLL = videoFrameInfo.mTimestamp;
                            this.LIZJ.LIZ(c1487110onl);
                            return 0;
                        }
                    });
                }
            }
        };
        this.LLLILZ = new C1472730oQZ(this, c1473490oRn);
        this.LLLILZJ = new C1472260oPo();
        if (!LLLIZZ && !LLLILZLLLI) {
            LLLILZLLLI = true;
            try {
                if (((Boolean) C1474810oTv.R2.getValue()).booleanValue()) {
                    try {
                        Class<?> clsLIZ = C1469080oKg.LIZ(200, "com.ss.ttm.player.TTPlayerClient");
                        Method declaredMethod = clsLIZ.getDeclaredMethod("initNativeCpuManager", new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(clsLIZ, new Object[0]);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (((Boolean) C1474810oTv.c3.getValue()).booleanValue()) {
                    if (!C1474930oU7.LIZLLL) {
                        C1474930oU7.LIZLLL = true;
                        LJLILLLLZI();
                    }
                    if ((C1474810oTv.LJLJL() & 1) != 0) {
                        ExecutorService executorService = C1475000oUE.LIZLLL;
                        int i = C2187451AjH.LIZ;
                        C1471660oOq.LIZJ("TTVideoEngine", "set threadpool");
                        EngineThreadPool.setExecutorInstance(executorService);
                    }
                    if (((C1474810oTv.LJLJL() >> 1) & 1) != 0) {
                        TTVideoEngine.LLIIL(C1475000oUE.LIZLLL);
                    }
                    if (((Boolean) C1474810oTv.b4.getValue()).booleanValue()) {
                        TTVideoEngine.LLFII(1076, 1);
                    }
                }
                LLLIZZ = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LLLILZLLLI = false;
        }
        this.LL = context;
        this.LLILLJJLI = sparseIntArray == null ? new SparseIntArray() : sparseIntArray;
        this.LLILLL = sparseArray == null ? new SparseArray() : sparseArray;
        this.LLILZ = c1480980ods;
        C1472820oQi c1472820oQi = new C1472820oQi(this, z);
        this.LLJLLL = c1472820oQi;
        this.LLLILZJ.LIZ(this.LLJJIJIIJIL);
        this.LLLILZJ.LIZ(this.LLJJIJIL);
        this.LLLILZJ.LIZ(this.LLJJJ);
        this.LLLILZJ.LIZ(this.LLJJJJ);
        this.LLLILZJ.LIZ(this.LLJJJJJIL);
        this.LLLILZJ.LIZ(this.LLJJJJLIIL);
        this.LLLILZJ.LIZ(this.LLJJLIIIJLLLLLLLZ);
        this.LLLILZJ.LIZ(this.LLJJL);
        this.LLLILZJ.LIZ(this.LLJL);
        this.LLLILZJ.LIZ(this.LLJLIL);
        this.LLLILZJ.LIZ(this.LLJLILLLLZIIL);
        this.LLLILZJ.LIZ(this.LLJLL);
        this.LLLILZJ.LIZ(this.LLJLLIL);
        this.LLLILZJ.LIZ(c1472820oQi);
        this.LLLILZJ.LIZ(this.LLJZ);
        this.LLLILZJ.LIZ(this.LLJZIJLIL);
        this.LLLILZJ.LIZ(this.LLL);
        this.LLLILZJ.LIZ(this.LLLF);
        this.LLLILZJ.LIZ(this.LLLFF);
        this.LLLILZJ.LIZ(this.LLLFFI);
        this.LLLILZJ.LIZ(this.LLLFZ);
        this.LLLILZJ.LIZ(this.LLLI);
        this.LLLILZJ.LIZ(this.LLLII);
        this.LLLILZJ.LIZ(this.LLLIIII);
        this.LLLILZJ.LIZ(this.LLLIIIIL);
        this.LLLILZJ.LIZ(this.LLLIIL);
        this.LLLILZJ.LIZ(this.LLLIIIL);
        this.LLLILZJ.LIZ(this.LLLIILIL);
        this.LLLILZJ.LIZ(this.LLLIL);
        this.LLLILZJ.LIZ(this.LLLILZ);
        C1472260oPo c1472260oPo = this.LLLILZJ;
        c1472260oPo.getClass();
        try {
            ArrayList arrayList = new ArrayList(c1472260oPo.LL);
            Collections.sort(arrayList, new AComparatorS42S0000000_23(12));
            ((CopyOnWriteArrayList) c1472260oPo.LL).clear();
            ((CopyOnWriteArrayList) c1472260oPo.LL).addAll(arrayList);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            SimRadar.keyScan("TTPlayer", "PlayerObservers.sort Error", new Object[0]);
        }
        LJJJJJL();
    }
}
