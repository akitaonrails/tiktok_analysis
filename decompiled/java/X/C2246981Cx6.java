package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import cxo.s0;
import fyo.e;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1Cx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246981Cx6 extends AbsPlayer<C2246981Cx6> implements InterfaceC2247111CxJ {
    public static String LJIJ;
    public final AtomicBoolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public TTVideoEngine LIZLLL;
    public InterfaceC2247071CxF LJ;
    public long LJFF;
    public String LJI;
    public final boolean LJII;
    public boolean LJIIIIZZ;
    public InterfaceC2247101CxI LJIIIZ;
    public boolean LJIIJ;
    public float LJIIJJI;
    public C2246691Cwd LJIIL;
    public final C2247041CxC LJIILIIL;
    public final C2247041CxC LJIILJJIL;
    public final C2247021CxA LJIILL;
    public boolean LJIILLIIL;
    public final C2246991Cx7 LJIIZILJ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
    }

    public final void LIZIZ() throws Exception {
        TTVideoEngine tTVideoEngine;
        InterfaceC2247071CxF interfaceC2247071CxF = this.LJ;
        if (interfaceC2247071CxF != null) {
            interfaceC2247071CxF.LIZ();
        }
        InterfaceC2247071CxF interfaceC2247071CxF2 = this.LJ;
        if (interfaceC2247071CxF2 != null) {
            this.LJFF = interfaceC2247071CxF2.LIZIZ(this.LJIIJJI);
        } else {
            this.LJFF = 0L;
        }
        if (C1141290fnz.LIZ().LJII && this.LJFF == 0 && !C1BY7.LIZ.getBoolean("has_gift_play_internal_error", false)) {
            this.LIZLLL = new TTVideoEngine(this.context, 2);
            this.LJI = "TTEnginePlayerImpl_OS";
            C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", "build, PlayerType TTEnginePlayerImpl_OS");
        } else {
            TTVideoEngine tTVideoEngine2 = new TTVideoEngine(this.context, 0);
            this.LIZLLL = tTVideoEngine2;
            if (C176600m4.LIZIZ(Boolean.valueOf(tTVideoEngine2.LJLIIL()))) {
                C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", "build, videoEngine?.isSystemPlayer()=true, throw error");
                throw new Exception("create ttVideoEngine failure");
            }
            if ((C1141290fnz.LIZ().LIZIZ == 1 && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).hasPlayerHardDecodeSupport(true)) || (C1141290fnz.LIZ().LIZIZ == 0 && C1141290fnz.LIZ().LIZ == 1)) {
                TTVideoEngine tTVideoEngine3 = this.LIZLLL;
                if (tTVideoEngine3 != null) {
                    tTVideoEngine3.LIZJ(7, 1);
                }
                TTVideoEngine tTVideoEngine4 = this.LIZLLL;
                if (tTVideoEngine4 != null) {
                    tTVideoEngine4.LIZJ(955, 0);
                }
                this.LJI = "TTEnginePlayerImpl_HARD";
                C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", "build, PlayerType HARD DECODE");
            } else {
                TTVideoEngine tTVideoEngine5 = this.LIZLLL;
                if (tTVideoEngine5 != null) {
                    tTVideoEngine5.LIZJ(7, 0);
                }
                if (C1141290fnz.LIZ().LIZJ == 1) {
                    TTVideoEngine tTVideoEngine6 = this.LIZLLL;
                    if (tTVideoEngine6 != null) {
                        tTVideoEngine6.LIZJ(581, 1);
                    }
                    this.LJI = "TTEnginePlayerImpl_SOFT_OPT";
                    C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", "build, PlayerType SOFT DECODE OPT");
                } else {
                    TTVideoEngine tTVideoEngine7 = this.LIZLLL;
                    if (tTVideoEngine7 != null) {
                        tTVideoEngine7.LIZJ(581, 0);
                    }
                    this.LJI = "TTEnginePlayerImpl_SOFT";
                    C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", "build, PlayerType SOFT DECODE");
                }
            }
        }
        TTVideoEngine tTVideoEngine8 = this.LIZLLL;
        if (tTVideoEngine8 != null) {
            tTVideoEngine8.LLJIJIL("live_gift");
        }
        TTVideoEngine tTVideoEngine9 = this.LIZLLL;
        if (tTVideoEngine9 != null) {
            tTVideoEngine9.LIZJ(4, 1);
        }
        TTVideoEngine tTVideoEngine10 = this.LIZLLL;
        if (tTVideoEngine10 != null) {
            tTVideoEngine10.LIZJ(216, 1);
        }
        TTVideoEngine tTVideoEngine11 = this.LIZLLL;
        if (tTVideoEngine11 != null) {
            tTVideoEngine11.LIZJ(610, 0);
        }
        TTVideoEngine tTVideoEngine12 = this.LIZLLL;
        if (tTVideoEngine12 != null) {
            tTVideoEngine12.LIZJ(602, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        TTVideoEngine tTVideoEngine13 = this.LIZLLL;
        if (tTVideoEngine13 != null) {
            tTVideoEngine13.LLI(this.LJIIZILJ);
        }
        TTVideoEngine tTVideoEngine14 = this.LIZLLL;
        if (tTVideoEngine14 != null) {
            tTVideoEngine14.LLJILLL(this.LJIILL);
        }
        if (this.LJIIJ && (tTVideoEngine = this.LIZLLL) != null) {
            tTVideoEngine.LJ(true);
        }
        float f = this.LJIIJJI;
        TTVideoEngine tTVideoEngine15 = this.LIZLLL;
        if (tTVideoEngine15 == null || f >= 1.0f) {
            return;
        }
        tTVideoEngine15.LIZJ(415, 1);
        TTVideoEngine tTVideoEngine16 = this.LIZLLL;
        if (tTVideoEngine16 != null) {
            tTVideoEngine16.LJIILLIIL(f, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine == null) {
            return 0;
        }
        return tTVideoEngine.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        if (!LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnable()) {
            TTVideoEngine tTVideoEngine = this.LIZLLL;
            if (tTVideoEngine == null) {
                return new C2247041CxC(0, 0, 0);
            }
            int iLJJLJ = tTVideoEngine.LJJLJ();
            TTVideoEngine tTVideoEngine2 = this.LIZLLL;
            int iLJJLIIIJLLLLLLLZ = tTVideoEngine2 != null ? tTVideoEngine2.LJJLIIIJLLLLLLLZ() : 0;
            TTVideoEngine tTVideoEngine3 = this.LIZLLL;
            return new C2247041CxC(iLJJLJ, iLJJLIIIJLLLLLLLZ, tTVideoEngine3 != null ? tTVideoEngine3.LJJJJL() : 0);
        }
        TTVideoEngine tTVideoEngine4 = this.LIZLLL;
        if (tTVideoEngine4 == null) {
            return this.LJIILJJIL;
        }
        this.LJIILIIL.setVideoWidth(tTVideoEngine4.LJJLJ());
        C2247041CxC c2247041CxC = this.LJIILIIL;
        TTVideoEngine tTVideoEngine5 = this.LIZLLL;
        c2247041CxC.setVideoHeight(tTVideoEngine5 != null ? tTVideoEngine5.LJJLIIIJLLLLLLLZ() : 0);
        C2247041CxC c2247041CxC2 = this.LJIILIIL;
        TTVideoEngine tTVideoEngine6 = this.LIZLLL;
        c2247041CxC2.setDuration(tTVideoEngine6 != null ? tTVideoEngine6.LJJJJL() : 0);
        return this.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        return tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 1;
    }

    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTPlayer = [");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("], GiftPlayer = ");
        sbLIZ.append(this);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() throws Exception {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initMediaPlayer() called, hasInitMediaPlayer = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", engine=");
        sbLIZ.append(this);
        C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        if (!LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReplay()) {
            LIZIZ();
        } else {
            if (this.LIZ.getAndSet(true)) {
                return;
            }
            LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause(), called with player : ");
        sbLIZ.append(LIZLLL());
        C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.pause();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.1Cx6 for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "prepareAsync(), called with player : "
            r1.append(r0)
            java.lang.String r0 = r2.LIZLLL()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TTEnginePlayerImplKt_gift_video_engine"
            X.C20441214yg.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer$OnPreparedListener<com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer<T extends com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer>> r0 = r2.preparedListener
            if (r0 == 0) goto L20
            r0.onPrepared(r2)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2246981Cx6.prepareAsync():void");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release(), called with player : ");
        sbLIZ.append(LIZLLL());
        C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
        this.LIZIZ = false;
        this.LIZJ = false;
        InterfaceC2247071CxF interfaceC2247071CxF = this.LJ;
        if (interfaceC2247071CxF != null) {
            interfaceC2247071CxF.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset(), called with player : ");
        sbLIZ.append(LIZLLL());
        C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        InterfaceC1141280fny interfaceC1141280fnyLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start() , isReplayDataPath = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPreloadDataPath = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", called with player : ");
        sbLIZ.append(LIZLLL());
        C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine != null) {
            if (this.LIZIZ) {
                tTVideoEngine.LLILII(0);
                TTVideoEngine tTVideoEngine2 = this.LIZLLL;
                if (tTVideoEngine2 != null) {
                    tTVideoEngine2.LJIJJLI(0, new s0() { // from class: X.1Cx8
                        @Override // cxo.s0
                        public final void LJII(boolean z) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("start(), seekTo success, isReplayDataPath = ");
                            sbLIZ2.append(this.LL.LIZIZ);
                            sbLIZ2.append(", isPreloadDataPath=");
                            sbLIZ2.append(this.LL.LIZJ);
                            sbLIZ2.append(", called with player : ");
                            sbLIZ2.append(this.LL.LIZLLL());
                            C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
                            TTVideoEngine tTVideoEngine3 = this.LL.LIZLLL;
                            if (tTVideoEngine3 != null) {
                                tTVideoEngine3.play();
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (!C1141290fnz.LJ() && ((interfaceC1141280fnyLIZIZ = C1141290fnz.LIZIZ()) == null || !interfaceC1141280fnyLIZIZ.LIZIZ())) {
                if (this.LJIIIIZZ) {
                    C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", "initSuperResolution initialized");
                } else if (this.LJII) {
                    this.LJIIIIZZ = true;
                    if (this.LIZLLL != null) {
                        C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", "obtainSRKernelBinPath");
                        if (LJIJ != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("obtainSRKernelBinPath result == ");
                            sbLIZ2.append(LJIJ);
                            C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            File fileW2 = C786410Ut5.w2(this.context);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("tt_live_sdk");
                            sbLIZ3.append(File.pathSeparator);
                            sbLIZ3.append("SRKernelBinPath");
                            C0VSJ c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ3));
                            if (c0vsj.exists() || c0vsj.mkdir()) {
                                LJIJ = c0vsj.getAbsolutePath();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("obtainSRKernelBinPath result == ");
                                sbLIZ4.append(LJIJ);
                                C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ4));
                            } else {
                                C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", "obtainSRKernelBinPath fail when create dir");
                            }
                        }
                    }
                    new Bundle().putBoolean("srIsMaliSync", true);
                } else {
                    C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", "initSuperResolution sr is disable");
                }
            }
            TTVideoEngine tTVideoEngine3 = this.LIZLLL;
            if (tTVideoEngine3 != null) {
                tTVideoEngine3.play();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop(), called with player : ");
        sbLIZ.append(LIZLLL());
        C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.stop();
        }
        this.LIZIZ = false;
        this.LIZJ = false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[TTEnginePlayerImplKotlin@");
        sbLIZ.append(hashCode());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return this.LJI;
    }

    @Override // X.InterfaceC2247111CxJ
    public final void LIZ(C2246861Cwu c2246861Cwu) {
        this.LJIIIZ = c2246861Cwu;
    }

    public final String LIZJ(String str) {
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        String str2 = "";
        if (tTVideoEngine == null) {
            return "";
        }
        String strLJJJI = tTVideoEngine.LJJJI();
        if (strLJJJI != null) {
            str2 = strLJJJI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentDataSource(), source = ");
        sbLIZ.append(str);
        sbLIZ.append(", currentPlayPath = ");
        sbLIZ.append(str2);
        sbLIZ.append(", called with player : ");
        sbLIZ.append(LIZLLL());
        C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine == null) {
            return;
        }
        tTVideoEngine.LJIJJLI(i, new s0() { // from class: X.1CxD
            @Override // cxo.s0
            public final void LJII(boolean z) {
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        TTVideoEngine tTVideoEngine;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSource(),  dataPath = ");
        sbLIZ.append(str);
        sbLIZ.append(", called with player : ");
        sbLIZ.append(LIZLLL());
        C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = false;
        if (this.LIZLLL != null) {
            if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReplay()) {
                if (TextUtils.equals(str, LIZJ("setDataSource"))) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setDataSource(), dataPath = ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", isReplayDataPath = true, isPreloadDataPath = ");
                    sbLIZ2.append(this.LIZJ);
                    sbLIZ2.append(", called with player : ");
                    sbLIZ2.append(LIZLLL());
                    C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZIZ = true;
                    TTVideoEngine tTVideoEngine2 = this.LIZLLL;
                    if (tTVideoEngine2 != null) {
                        tTVideoEngine2.LLILII(0);
                    }
                    TTVideoEngine tTVideoEngine3 = this.LIZLLL;
                    if (tTVideoEngine3 != null) {
                        tTVideoEngine3.LJIJJLI(0, new s0() { // from class: X.1CxE
                            @Override // cxo.s0
                            public final void LJII(boolean z) {
                            }
                        });
                    }
                } else {
                    TTVideoEngine tTVideoEngine4 = this.LIZLLL;
                    if (tTVideoEngine4 != null) {
                        tTVideoEngine4.LJIJ(str);
                    }
                }
            } else {
                TTVideoEngine tTVideoEngine5 = this.LIZLLL;
                if (tTVideoEngine5 != null) {
                    tTVideoEngine5.LJIJ(str);
                }
            }
        }
        InterfaceC2247071CxF interfaceC2247071CxF = this.LJ;
        if (interfaceC2247071CxF != null) {
            this.LJFF = interfaceC2247071CxF.LIZIZ(this.LJIIJJI);
        } else {
            this.LJFF = 0L;
        }
        long j = this.LJFF;
        if (j != 0 && (tTVideoEngine = this.LIZLLL) != null) {
            tTVideoEngine.LIZIZ(440, j);
            TTVideoEngine tTVideoEngine6 = this.LIZLLL;
            if (tTVideoEngine6 != null) {
                tTVideoEngine6.LIZJ(430, 2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setLooping(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface(), surface=");
        sbLIZ.append(surface);
        sbLIZ.append(", called with player : ");
        sbLIZ.append(LIZLLL());
        C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZLLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(surface);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1Cx7] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.1CxA] */
    public C2246981Cx6(Context context, InterfaceC2247071CxF interfaceC2247071CxF) {
        boolean z;
        super(context);
        this.LIZ = new AtomicBoolean(false);
        this.LJI = "";
        if (C1141290fnz.LIZ().LIZLLL > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
        this.LJIIJJI = 1.0f;
        this.LJIILIIL = new C2247041CxC(0, 0, 0);
        this.LJIILJJIL = new C2247041CxC(0, 0, 0);
        this.LJIILL = new InterfaceC1469360oL8() { // from class: X.1CxA
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine) {
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
            public final void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
                try {
                    C2246981Cx6 c2246981Cx6 = this.LL;
                    C2246691Cwd c2246691Cwd = c2246981Cx6.LJIIL;
                    if (c2246691Cwd != null) {
                        c2246691Cwd.LIZ(i, c2246981Cx6.getVideoInfo().getDuration(), c2246981Cx6.self);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        this.LJIIZILJ = new a4() { // from class: X.1Cx7
            @Override // cxo.a4
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
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
            @Override // cxo.a4
            public final void LJ(TTVideoEngine tTVideoEngine) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRenderStart : ");
                sbLIZ.append(this.LL.LIZLLL());
                C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                C2246981Cx6 c2246981Cx6 = this.LL;
                IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener = c2246981Cx6.firstFrameListener;
                if (onFirstFrameListener != 0) {
                    onFirstFrameListener.onFirstFrame(c2246981Cx6.self);
                } else {
                    C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", "tte onRenderStart fail, firstFrameListener is null");
                }
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
            @Override // cxo.a4
            public final void LJI(e eVar) {
                boolean z2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tte onError, code=");
                sbLIZ.append(eVar.LIZ);
                sbLIZ.append(", internal=");
                sbLIZ.append(eVar.LIZIZ);
                sbLIZ.append(", desc=");
                sbLIZ.append(eVar.LIZLLL);
                sbLIZ.append(", hasListener=");
                if (this.LL.errorListener != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbLIZ.append(z2);
                C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                C2246981Cx6 c2246981Cx6 = this.LL;
                IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c2246981Cx6.errorListener;
                if (onErrorListener != 0) {
                    onErrorListener.onError(c2246981Cx6.self, eVar.LIZ, eVar.LIZIZ, eVar.LIZLLL);
                }
                C2246981Cx6 c2246981Cx62 = this.LL;
                c2246981Cx62.LIZIZ = false;
                c2246981Cx62.LIZJ = false;
            }

            @Override // cxo.a4
            public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
                this.LL.LJIILLIIL = false;
                C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", "tte onPrepare");
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
            @Override // cxo.a4
            public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPrepared : ");
                sbLIZ.append(this.LL.LIZLLL());
                C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                C2246981Cx6 c2246981Cx6 = this.LL;
                IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c2246981Cx6.preparedListener;
                if (onPreparedListener != 0) {
                    onPreparedListener.onPrepared(c2246981Cx6.self);
                } else {
                    C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", "onPrepared missed, preparedListener is null");
                }
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
            @Override // cxo.a4
            public final void LJIILL(TTVideoEngine tTVideoEngine) {
                int iLJJJJZI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompletion : ");
                sbLIZ.append(this.LL.LIZLLL());
                C1149270g0r.LIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                C2246981Cx6 c2246981Cx6 = this.LL;
                if (c2246981Cx6.LJII) {
                    TTVideoEngine tTVideoEngine2 = c2246981Cx6.LIZLLL;
                    if (tTVideoEngine2 != null) {
                        iLJJJJZI = tTVideoEngine2.LJJJJZI(660);
                    } else {
                        iLJJJJZI = 0;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SR play fail and fail reason is ");
                    sbLIZ2.append(iLJJJJZI);
                    C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC2247101CxI interfaceC2247101CxI = c2246981Cx6.LJIIIZ;
                    if (interfaceC2247101CxI != null) {
                        interfaceC2247101CxI.LIZ(iLJJJJZI);
                    }
                } else {
                    InterfaceC2247101CxI interfaceC2247101CxI2 = c2246981Cx6.LJIIIZ;
                    if (interfaceC2247101CxI2 != null) {
                        interfaceC2247101CxI2.LIZIZ();
                    }
                }
                C2246981Cx6 c2246981Cx62 = this.LL;
                IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c2246981Cx62.completionListener;
                if (onCompletionListener != 0) {
                    onCompletionListener.onCompletion(c2246981Cx62.self);
                } else {
                    C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", "onCompletion missed, preparedListener is null");
                }
                C2246981Cx6 c2246981Cx63 = this.LL;
                c2246981Cx63.LIZIZ = false;
                c2246981Cx63.LIZJ = false;
            }

            @Override // cxo.a4
            public final void LJIJJLI(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tte onVideoStatusException, status=");
                sbLIZ.append(i);
                C20441214yg.LJ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // cxo.a4
            public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tte onPlaybackStateChanged, state=");
                sbLIZ.append(i);
                C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // cxo.a4
            public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
                C2246981Cx6 c2246981Cx6 = this.LL;
                if (!c2246981Cx6.LJIILLIIL) {
                    c2246981Cx6.LJIILLIIL = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tte onBufferingUpdate first, percent=");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // cxo.a4
            public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tte onLoadStateChanged, loadState=");
                sbLIZ.append(i);
                C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // cxo.a4
            public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
                C20441214yg.LJIIIZ("TTEnginePlayerImplKt_gift_video_engine", "onStreamChanged");
            }
        };
        this.context = context;
        this.LJ = interfaceC2247071CxF;
    }
}
