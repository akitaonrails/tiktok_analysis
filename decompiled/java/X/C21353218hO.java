package X;

import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18hO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayPreloadManager$release$1", f = "ECLiveVideoReplayPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C21353218hO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21354518hb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21353218hO(C21354518hb c21354518hb, InterfaceC1364105Vn<? super C21353218hO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21354518hb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21353218hO(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [T, X.0956, X.09AE] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, X.18hX] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        final C188G c188g;
        long jLongValue;
        InterfaceC1482530ogN interfaceC1482530ogN;
        InterfaceC1482530ogN interfaceC1482530ogN2;
        ViewGroup viewGroup;
        C1C7U.LIZ("ECLiveVideoReplayPreloadManager@de08.release$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C21353418hQ c21353418hQ = this.LL.LIZ;
        C21353118hN c21353118hN = C21353118hN.LL;
        boolean zLJFF = C21353118hN.LJFF();
        boolean zLJIIJJI = C21353118hN.LJIIJJI();
        c21353418hQ.LJII = false;
        if (zLJFF && zLJIIJJI && C21353118hN.LLILLL == null && c21353418hQ.LJFF) {
            C21353118hN.LLILLL = c21353418hQ;
        }
        String str = null;
        if (zLJFF && zLJIIJJI && C21353118hN.LLILLL == c21353418hQ) {
            ViewParent parent = c21353418hQ.LIZIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c21353418hQ.LIZIZ, viewGroup);
            }
            c21353118hN.getClass();
            C1568780qvU c1568780qvU = c21353418hQ.LIZ;
            EnumC1569640qws enumC1569640qws = c21353418hQ.LIZLLL;
            boolean z2 = c21353418hQ.LJFF;
            boolean z3 = c21353418hQ.LJII;
            if (C21353118hN.LJIIJJI() && z2 && !z3 && c1568780qvU.LIZ(c1568780qvU) && enumC1569640qws != EnumC1569640qws.INVALID) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C21353118hN.LJIILJJIL(c21353418hQ.LIZ, false, "invalid_cache");
                C21353118hN.LJIILIIL(c21353418hQ.LIZ, true, "reset");
                if (C21353118hN.LLILLL == c21353418hQ) {
                    C21353118hN.LLILLL = null;
                }
                C21353118hN.LIZLLL(c21353418hQ);
            } else {
                AbstractC1572300r1A abstractC1572300r1A = c21353418hQ.LJ;
                if ((abstractC1572300r1A instanceof C188G) && (c188g = (C188G) abstractC1572300r1A) != null) {
                    Long lValueOf = Long.valueOf(c188g.LIZIZ.getDuration());
                    long j = 0;
                    if (lValueOf.longValue() > 0) {
                        if (!c21353418hQ.LJIIIIZZ) {
                            c21353418hQ.LIZLLL = EnumC1569640qws.LOADING;
                            c21353418hQ.LIZIZ.setStatusChangeListener(new C21354218hY(c21353418hQ));
                            boolean zLJIIL = C21353118hN.LJIIL(c21353418hQ, new VideoInfo(c188g.LIZ, c188g.LIZIZ), c188g.LIZJ, "reset");
                            C1568780qvU c1568780qvU2 = c21353418hQ.LIZ;
                            if (!zLJIIL) {
                                str = "no_visible_container";
                            }
                            C21353118hN.LJIILJJIL(c1568780qvU2, zLJIIL, str);
                        } else {
                            c21353418hQ.LIZLLL = EnumC1569640qws.LOADING;
                            c21353418hQ.LJ = C1572310r1B.LIZ;
                            final int i = c21353418hQ.LJIIZILJ + 1;
                            c21353418hQ.LJIIZILJ = i;
                            c21353418hQ.LIZLLL();
                            c21353418hQ.LIZIZ.setStatusChangeListener(new C21354218hY(c21353418hQ));
                            c21353418hQ.LIZIZ.LJ();
                            InterfaceC1482530ogN interfaceC1482530ogN3 = c21353418hQ.LJIJ;
                            if (interfaceC1482530ogN3 != null) {
                                c21353418hQ.LIZIZ.getPlayer().LJJIIZ(interfaceC1482530ogN3);
                            }
                            c21353418hQ.LJIJ = null;
                            C09AE c09ae = c21353418hQ.LJIJI;
                            if (c09ae != null) {
                                c09ae.LIZIZ(null);
                            }
                            c21353418hQ.LJIJI = null;
                            Long lValueOf2 = Long.valueOf(c21353418hQ.LIZIZ.getPlayer().LJIIIZ().getDuration());
                            if (lValueOf2.longValue() <= 0) {
                                lValueOf2 = null;
                            }
                            Long lValueOf3 = Long.valueOf(c21353418hQ.LJIILLIIL);
                            if (lValueOf3.longValue() <= 0) {
                                lValueOf3 = null;
                            }
                            if (lValueOf2 != null) {
                                jLongValue = lValueOf2.longValue();
                            } else if (lValueOf3 != null) {
                                jLongValue = lValueOf3.longValue();
                            } else {
                                jLongValue = lValueOf.longValue();
                            }
                            long j2 = c188g.LIZJ;
                            if (j2 >= 0) {
                                j = j2;
                            }
                            if (j > jLongValue) {
                                c21353418hQ.LIZLLL = EnumC1569640qws.INVALID;
                                c21353418hQ.LJ = new C188H(-5, 0, "invalid_cache", 9);
                                c21353418hQ.LIZLLL();
                                C21353118hN.LJIILJJIL(c21353418hQ.LIZ, false, "invalid_cache");
                                C21353118hN.LJIILIIL(c21353418hQ.LIZ, true, "reset");
                                if (C21353118hN.LLILLL == c21353418hQ) {
                                    C21353118hN.LLILLL = null;
                                }
                                C21353118hN.LIZLLL(c21353418hQ);
                            } else {
                                float fLIZLLL = C13LZ.LIZLLL((j / jLongValue) * 100.0f, 0.0f, 100.0f);
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                int iIntValue = LivePreCreateNextRoomPlayer.ENABLE;
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                    Integer numValueOf = Integer.valueOf(SettingsManager.LJ("ec_live_video_replay_reset_seek_timeout_ms", LivePreCreateNextRoomPlayer.ENABLE));
                                    if (numValueOf.intValue() > 0) {
                                        iIntValue = numValueOf.intValue();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                long j3 = iIntValue;
                                final C013C c013c = new C013C();
                                final C259800zU c259800zU = new C259800zU();
                                final C259800zU c259800zU2 = new C259800zU();
                                c259800zU.element = new InterfaceC1482530ogN() { // from class: X.18hX
                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void Au(Surface surface) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void VK() {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void W1(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBrightnessChanged(String str2, float f) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBufferedPercent(String str2, long j4, int i2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBufferedTimeMs(String str2, long j4) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onBuffering(String str2, boolean z4, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onCompleteLoaded(String str2, boolean z4) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onCrosstalkHappened(String str2, List list) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onDecoderBuffering(String str2, boolean z4, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onFrameAboutToBeRendered(int i2, long j4, long j5, Map map) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onLiveRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onLoopPlay(String str2, int i2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onMaskInfoCallback(String str2, C1480290ocl c1480290ocl) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPausePlay(String str2, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayCompleted(String str2, int i2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayCompletedFirstTime(String str2, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayFailed(String str2, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayPause(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayPrepare(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayPrepared(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayProgressChange(String str2, long j4, long j5) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayRelease(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayStop(String str2, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlayerInternalEvent(String str2, int i2, JSONObject jSONObject) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPlaying(String str2, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
                                    public final /* synthetic */ void onPreRenderReady(String str2) {
                                        C490850JMt.LIZ(this, str2);
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPreRenderSessionMissed(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onPreparePlay(String str2, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onResumePlay(String str2, C1480430ocz c1480430ocz) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onRetryOnError(String str2, C1481290oeN c1481290oeN) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onSeekStart(String str2, int i2, float f) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onSpeedChanged(String str2, float f) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onStopPlay(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onVideoBitrateChanged(String str2, EnumC2281141EQm enumC2281141EQm, int i2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onVideoSecondFrame(String str2) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void onVideoSizeChanged(String str2, int i2, int i3) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void tc(String str2, JSONObject jSONObject) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final /* synthetic */ void uv(JSONObject jSONObject) {
                                    }

                                    @Override // X.InterfaceC1482530ogN
                                    public final void onSeekEnd(String str2, boolean z4) {
                                        if (z4) {
                                            C21353118hN.LJIIJ(c013c, c21353418hQ, c259800zU, c259800zU2, jCurrentTimeMillis, i, c188g, true, null);
                                        } else {
                                            C21353118hN.LJIIJ(c013c, c21353418hQ, c259800zU, c259800zU2, jCurrentTimeMillis, i, c188g, false, "seek_failed");
                                        }
                                    }
                                };
                                InterfaceC1484830ok5 player = c21353418hQ.LIZIZ.getPlayer();
                                T t = c259800zU.element;
                                if (t == 0) {
                                    interfaceC1482530ogN = null;
                                } else {
                                    interfaceC1482530ogN = (InterfaceC1482530ogN) t;
                                }
                                player.LJIIZILJ(interfaceC1482530ogN);
                                T t2 = c259800zU.element;
                                if (t2 == 0) {
                                    interfaceC1482530ogN2 = null;
                                } else {
                                    interfaceC1482530ogN2 = (InterfaceC1482530ogN) t2;
                                }
                                c21353418hQ.LJIJ = interfaceC1482530ogN2;
                                ?? LIZLLL = C23250099c.LIZLLL(C21353118hN.LLILLJJLI, null, null, new C1582330rHL(j3, c013c, c21353418hQ, c259800zU, c259800zU2, jCurrentTimeMillis, i, c188g, null), 3);
                                c259800zU2.element = LIZLLL;
                                c21353418hQ.LJIJI = LIZLLL;
                                try {
                                    c21353418hQ.LIZIZ.getPlayer().seek(fLIZLLL);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C21353118hN.LJIIJ(c013c, c21353418hQ, c259800zU, c259800zU2, jCurrentTimeMillis, i, c188g, false, "seek_failed");
                                }
                            }
                        }
                    } else {
                        c21353418hQ.LIZLLL = EnumC1569640qws.INVALID;
                        C21353118hN.LJIILJJIL(c21353418hQ.LIZ, false, "invalid_cache");
                        C21353118hN.LJIILIIL(c21353418hQ.LIZ, true, "reset");
                        if (C21353118hN.LLILLL == c21353418hQ) {
                            C21353118hN.LLILLL = null;
                        }
                        C21353118hN.LIZLLL(c21353418hQ);
                    }
                } else {
                    c21353418hQ.LIZLLL = EnumC1569640qws.LOADING;
                    c21353418hQ.LIZIZ.setStatusChangeListener(new C21354218hY(c21353418hQ));
                    C21353118hN.LJIILJJIL(c21353418hQ.LIZ, true, null);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.release$1");
            return unit;
        }
        C21353118hN.LJIILJJIL(c21353418hQ.LIZ, false, "invalid_cache");
        if (C21353118hN.LLILLL == c21353418hQ) {
            C21353118hN.LLILLL = null;
        }
        C21353118hN.LIZLLL(c21353418hQ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.release$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
