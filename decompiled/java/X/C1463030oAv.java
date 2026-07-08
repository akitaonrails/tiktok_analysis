package X;

import Y.ACallableS86S0110000_22;
import android.app.Application;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0oAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463030oAv {
    public InterfaceC1452170ntP LIZ;
    public AVMusic LIZJ;
    public VideoPublishEditModel LJ;
    public InterfaceC1463300oBM LJI;
    public int LJII;
    public final C1446430nk9 LJIIIIZZ;
    public final C054G LJIIIZ;
    public AnonymousClass0956 LJIIJ;
    public boolean LJIIJJI;
    public int LIZIZ = -1;
    public float LIZLLL = 1.0f;
    public final HashMap<String, List<C574370Mfr>> LJFF = new HashMap<>();

    public C1463030oAv() {
        C1446430nk9 c1446430nk9 = new C1446430nk9();
        this.LJIIIIZZ = c1446430nk9;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIIIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        c1446430nk9.LIZ = new C0E27() { // from class: X.0FWB
            @Override // X.C0E27
            public final int LIZ(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
                C1463670oBx c1463670oBx;
                C1463030oAv c1463030oAv = this.LIZ;
                InterfaceC1452170ntP interfaceC1452170ntP = c1463030oAv.LIZ;
                if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null) {
                    return c1463670oBx.LIZLLL().LJFF().LIZ().LIZ(str, i, i2, vEAlgorithmPath, c1463030oAv.LIZLLL);
                }
                return -1;
            }
        };
    }

    public final long LIZ(int i) {
        InterfaceC1463300oBM interfaceC1463300oBM = this.LJI;
        long jLIZLLL = 0;
        if (interfaceC1463300oBM != null) {
            List<VideoSegment> listLIZJ = interfaceC1463300oBM.LIZJ();
            if (C580130Mp9.LIZ(listLIZJ)) {
                return 0L;
            }
            if (i >= 0 && i < listLIZJ.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (!((VideoSegment) ListProtector.get(listLIZJ, i2)).isDeleted) {
                        jLIZLLL += ((VideoSegment) ListProtector.get(listLIZJ, i2)).LIZLLL() - ((VideoSegment) ListProtector.get(listLIZJ, i2)).LJII();
                    }
                }
            }
        }
        return jLIZLLL;
    }

    public final void LIZIZ(float f) {
        C1463670oBx c1463670oBx;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ;
        C1463860oCG c1463860oCG = null;
        if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null) {
            c1463670oBx.LIZLLL().LJFF().LJJJJLL(null);
            int i = this.LIZIZ;
            C1463860oCG c1463860oCG2 = c1463670oBx.LJI;
            if (c1463860oCG2 != null) {
                c1463860oCG = c1463860oCG2;
            }
            ((C1463850oCF) c1463860oCG.getAlgorithmApi()).removeMusic(i);
            c1463670oBx.LIZLLL().LJFF().LJIL(new C347060Dj6(f));
        }
    }

    public final void LJ(InterfaceC358010E1v interfaceC358010E1v, boolean z) {
        C15O7.LIZ(new ACallableS86S0110000_22(this, z, 0)).LJ(new C1466870oH7(interfaceC358010E1v, 11), C15O7.LJIIIIZZ, null);
    }

    public final void LJFF(int i, boolean z, List list) {
        InterfaceC1463300oBM interfaceC1463300oBM = this.LJI;
        if (interfaceC1463300oBM == null) {
            return;
        }
        List<VideoSegment> listLIZJ = interfaceC1463300oBM.LIZJ();
        if (C580130Mp9.LIZ(listLIZJ)) {
            return;
        }
        int i2 = 0;
        for (VideoSegment videoSegment : listLIZJ) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                VideoSegment videoSegment2 = videoSegment;
                videoSegment2.stickPointVideoSegment = new C574370Mfr(videoSegment2.videoIndex, 0L, ((Number) ListProtector.get(list, i2)).intValue(), videoSegment2.duration);
                interfaceC1463300oBM.LIZ();
                videoSegment2.isStickPointMode = true;
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        interfaceC1463300oBM.LJ(i, z);
        LIZ(-1);
        interfaceC1463300oBM.LIZIZ();
    }

    public final void LJI(int i, int i2, boolean z) {
        List<VEClipAlgorithmParam> allVideoRangeData;
        long j;
        boolean z2;
        int i3;
        if (this.LIZIZ >= 0) {
            InterfaceC1463300oBM interfaceC1463300oBM = this.LJI;
            if (interfaceC1463300oBM != null) {
                List<VideoSegment> listLIZJ = interfaceC1463300oBM.LIZJ();
                if (C580130Mp9.LIZ(listLIZJ)) {
                    return;
                }
                InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ;
                if (interfaceC1452170ntP != null && this.LIZIZ >= 0) {
                    allVideoRangeData = interfaceC1452170ntP.getAllVideoRangeData();
                } else {
                    allVideoRangeData = null;
                }
                if (C580130Mp9.LIZ(allVideoRangeData)) {
                    InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ;
                    if (interfaceC1452170ntP2 != null) {
                        interfaceC1452170ntP2.nf((int) 0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                        return;
                    }
                    return;
                }
                for (VideoSegment videoSegment : listLIZJ) {
                    for (VEClipAlgorithmParam vEClipAlgorithmParam : allVideoRangeData) {
                        if (vEClipAlgorithmParam.index == videoSegment.videoIndex) {
                            C533730KwV.LIZ.getClass();
                            if (C1444820nhY.LIZIZ && C2471909mP.LJJIII(videoSegment.LJFF(false), false, 4) && (i3 = vEClipAlgorithmParam.range) > 3000) {
                                videoSegment.duration = i3;
                            }
                            C574370Mfr c574370Mfr = videoSegment.stickPointVideoSegment;
                            if (c574370Mfr == null) {
                                if (i == 5) {
                                    j = vEClipAlgorithmParam.trimIn;
                                } else {
                                    j = 0;
                                }
                                videoSegment.stickPointVideoSegment = new C574370Mfr(videoSegment.videoIndex, j, vEClipAlgorithmParam.range, videoSegment.duration);
                                InterfaceC1463300oBM interfaceC1463300oBM2 = this.LJI;
                                if (interfaceC1463300oBM2 == null) {
                                    z2 = false;
                                } else {
                                    interfaceC1463300oBM2.LIZ();
                                    z2 = true;
                                }
                                videoSegment.isStickPointMode = z2;
                            } else if (i == 5) {
                                c574370Mfr.resetVideoStartTime(vEClipAlgorithmParam.trimIn, vEClipAlgorithmParam.range);
                            } else if (i != 2 && i != 6) {
                                if (i == 1 || i == 4 || i == 3) {
                                    c574370Mfr.updateVideoStartTime(vEClipAlgorithmParam.range);
                                }
                            } else {
                                List<C574370Mfr> list = this.LJFF.get(this.LIZJ.getMusicId());
                                if (C580130Mp9.LIZ(list)) {
                                    videoSegment.stickPointVideoSegment.updateVideoStartTime(vEClipAlgorithmParam.range);
                                } else {
                                    C574370Mfr c574370Mfr2 = null;
                                    for (C574370Mfr c574370Mfr3 : list) {
                                        if (c574370Mfr3.getVideoIndex() == videoSegment.videoIndex) {
                                            c574370Mfr2 = c574370Mfr3;
                                        }
                                    }
                                    if (c574370Mfr2 != null) {
                                        videoSegment.stickPointVideoSegment.resetVideoStartTime(c574370Mfr2.getVideoStart(), c574370Mfr2.getVideoRange());
                                    } else {
                                        videoSegment.stickPointVideoSegment.resetVideoStartTime(0L, vEClipAlgorithmParam.range);
                                    }
                                }
                            }
                        }
                    }
                }
                InterfaceC1463300oBM interfaceC1463300oBM3 = this.LJI;
                if (interfaceC1463300oBM3 != null) {
                    interfaceC1463300oBM3.LJ(i, z);
                    LIZ(i2);
                    interfaceC1463300oBM3.LIZIZ();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("stickpoint listener not init");
        }
    }

    public final void LIZJ(AVMusic aVMusic, final int i, final int i2, final boolean z, final InterfaceC358010E1v interfaceC358010E1v) {
        Application applicationLIZ;
        this.LIZJ = aVMusic;
        this.LJIIIIZZ.LIZIZ = aVMusic;
        if (this.LIZ != null && aVMusic != null && aVMusic.getStickPointMusicAlg() != null) {
            final String strLJFF = C1444820nhY.LJFF(aVMusic);
            try {
                ((C19221910Hx) ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService()).getClass();
                applicationLIZ = C1BWL.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIL("ServiceManager fail, no context and local music load fail");
                applicationLIZ = null;
            }
            if (!C2354709Kn.LIZIZ(strLJFF) && !C2486109oh.LIZJ(applicationLIZ, UriProtector.parse(strLJFF))) {
                return;
            }
            this.LJIIIIZZ.getClass();
            final VEAlgorithmPath vEAlgorithmPathLIZIZ = C1446430nk9.LIZIZ(aVMusic);
            if (this.LJIIJJI && z) {
                this.LJIIJJI = false;
            } else if (C1420940n52.LIZ()) {
                this.LJIIJ = C23250099c.LIZLLL(this.LJIIIZ, null, null, new C1463430oBZ(this, new InterfaceC358010E1v() { // from class: X.0oBX
                    @Override // X.InterfaceC358010E1v
                    public final void onFailed() {
                        C1463030oAv.LIZLLL(this.LIZ, strLJFF, i, i2, vEAlgorithmPathLIZIZ, interfaceC358010E1v, z);
                    }

                    @Override // X.InterfaceC358010E1v
                    public final void LIZ(int i3) {
                        this.LIZ.LIZIZ = i3;
                        InterfaceC358010E1v interfaceC358010E1v2 = interfaceC358010E1v;
                        if (interfaceC358010E1v2 != null) {
                            interfaceC358010E1v2.LIZ(i3);
                        }
                    }
                }, i2, z, null), 3);
            } else {
                LIZLLL(this, strLJFF, i, i2, vEAlgorithmPathLIZIZ, interfaceC358010E1v, z);
            }
        }
    }

    public static final void LIZLLL(final C1463030oAv c1463030oAv, final String str, final int i, final int i2, final VEAlgorithmPath vEAlgorithmPath, final InterfaceC358010E1v interfaceC358010E1v, final boolean z) {
        InterfaceC358010E1v interfaceC358010E1v2 = new InterfaceC358010E1v() { // from class: X.0oBC
            @Override // X.InterfaceC358010E1v
            public final void onFailed() {
                this.LIZ.LIZIZ = -1;
                InterfaceC358010E1v interfaceC358010E1v3 = interfaceC358010E1v;
                if (interfaceC358010E1v3 != null) {
                    interfaceC358010E1v3.onFailed();
                }
            }

            @Override // X.InterfaceC358010E1v
            public final void LIZ(int i3) {
                C1463030oAv c1463030oAv2 = this.LIZ;
                c1463030oAv2.LIZIZ = i3;
                int i4 = i2;
                if (i4 != 6 && i4 != 7) {
                    c1463030oAv2.LJI(i4, -1, z);
                } else {
                    InterfaceC1463300oBM interfaceC1463300oBM = c1463030oAv2.LJI;
                    if (interfaceC1463300oBM != null) {
                        interfaceC1463300oBM.LJ(i4, z);
                    }
                    C1463030oAv c1463030oAv3 = this.LIZ;
                    long jLIZ = c1463030oAv3.LIZ(c1463030oAv3.LJII);
                    InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ.LIZ;
                    if (interfaceC1452170ntP != null) {
                        interfaceC1452170ntP.nf((int) jLIZ, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                    }
                }
                InterfaceC358010E1v interfaceC358010E1v3 = interfaceC358010E1v;
                if (interfaceC358010E1v3 != null) {
                    interfaceC358010E1v3.LIZ(this.LIZ.LIZIZ);
                }
            }
        };
        c1463030oAv.getClass();
        Callable callable = new Callable() { // from class: X.0npP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("StickPointVideoPresenter@671e.startDefaultStickPoint$callable$1");
                int iUpdateAlgorithmFromNormal = this.LL.LJIIIIZZ.LIZJ(str, vEAlgorithmPath, i).LIZ;
                int i3 = i2;
                if ((i3 == 2 || i3 == 4) && iUpdateAlgorithmFromNormal >= 0) {
                    InterfaceC1452170ntP interfaceC1452170ntP = this.LL.LIZ;
                    if (interfaceC1452170ntP != null) {
                        iUpdateAlgorithmFromNormal = interfaceC1452170ntP.updateAlgorithmFromNormal();
                        if (iUpdateAlgorithmFromNormal >= 0) {
                            iUpdateAlgorithmFromNormal = this.LL.LIZ.genRandomSolve();
                        }
                    } else {
                        iUpdateAlgorithmFromNormal = -1;
                    }
                }
                Integer numValueOf = Integer.valueOf(iUpdateAlgorithmFromNormal);
                C1C7U.LIZIZ("StickPointVideoPresenter@671e.startDefaultStickPoint$callable$1");
                return numValueOf;
            }
        };
        ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
        C15O7.LIZIZ(callable, executorC2206508kh, null).LJ(new C1466870oH7(interfaceC358010E1v2, 12), executorC2206508kh, null);
    }
}
