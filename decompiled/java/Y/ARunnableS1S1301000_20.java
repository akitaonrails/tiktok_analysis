package Y;

import X.C1267520j5a;
import X.C1268610j7L;
import X.C1270150j9p;
import X.C1270170j9r;
import X.C1270500jAO;
import X.C1270520jAQ;
import X.C1270530jAR;
import X.C1272090jCx;
import X.C1272100jCy;
import X.C1272300jDI;
import X.C1273730jFb;
import X.C1283100jUi;
import X.C1C7U;
import X.InterfaceC1270540jAS;
import X.InterfaceC1270560jAU;
import X.InterfaceC1272120jD0;
import X.InterfaceC1272570jDj;
import X.InterfaceC1272600jDm;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S1301000_20 implements Runnable {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.0j9p, X.0j9r, com.ss.ttlivestreamer.core.engine.VideoSource] */
    public final void LIZ$0() {
        int i;
        if (((C1270500jAO) this.l3).LLJJIII.get() == 4 || ((C1270500jAO) this.l3).LLJJIII.get() == 1) {
            return;
        }
        C1270500jAO c1270500jAO = (C1270500jAO) this.l3;
        InterfaceC1270540jAS interfaceC1270540jAS = c1270500jAO.LL;
        if (interfaceC1270540jAS != null && (i = this.i4) == 2) {
            c1270500jAO.LLJJJIL = i;
            interfaceC1270540jAS.LIZ(this.s0, (InterfaceC1270560jAU) this.l1, (C1270520jAQ) this.l2, i);
            return;
        }
        String str = this.s0;
        final InterfaceC1270560jAU interfaceC1270560jAU = (InterfaceC1270560jAU) this.l1;
        C1270520jAQ c1270520jAQ = (C1270520jAQ) this.l2;
        int i2 = this.i4;
        if (c1270500jAO.LLJJIII.get() == 1) {
            interfaceC1270560jAU.LIZIZ(-8, new IllegalStateException("Already start"));
        }
        if (c1270500jAO.LLJJIII.get() == 3) {
            interfaceC1270560jAU.LIZIZ(-9, new IllegalStateException("Error status call and no stop."));
            return;
        }
        if (C1267520j5a.LIZ()) {
            InterfaceC1270560jAU interfaceC1270560jAU2 = new InterfaceC1270560jAU() { // from class: X.0jAT
                @Override // X.InterfaceC1270560jAU
                public final void LIZ() {
                    InterfaceC1270560jAU interfaceC1270560jAU3 = interfaceC1270560jAU;
                    if (interfaceC1270560jAU3 != null) {
                        interfaceC1270560jAU3.LIZ();
                    }
                }

                @Override // X.InterfaceC1270560jAU
                public final void LIZJ(String str2) {
                    InterfaceC1270560jAU interfaceC1270560jAU3 = interfaceC1270560jAU;
                    if (interfaceC1270560jAU3 != null) {
                        interfaceC1270560jAU3.LIZJ(str2);
                    }
                }

                @Override // X.InterfaceC1270560jAU
                public final void LIZIZ(int i3, Exception exc) {
                    InterfaceC1270560jAU interfaceC1270560jAU3 = interfaceC1270560jAU;
                    if (interfaceC1270560jAU3 != null) {
                        interfaceC1270560jAU3.LIZIZ(i3, exc);
                    }
                }
            };
            c1270500jAO.getClass();
            c1270500jAO.LLJJ = interfaceC1270560jAU2;
        } else {
            c1270500jAO.LLJJ = interfaceC1270560jAU;
        }
        boolean z = false;
        if (c1270520jAQ.LIZ && (c1270520jAQ.LJ < 1 || c1270520jAQ.LIZIZ < 1 || c1270520jAQ.LIZJ < 1 || c1270520jAQ.LIZLLL < 1)) {
            c1270500jAO.LLJJ.LIZIZ(-2, new IllegalArgumentException("video parameter invalid."));
            return;
        }
        if (c1270520jAQ.LJI && (c1270520jAQ.LJIIIZ < 1 || c1270520jAQ.LJII < 1 || c1270520jAQ.LJIIIIZZ < 0)) {
            c1270500jAO.LLJJ.LIZIZ(-3, new IllegalArgumentException("Audio parameter invalid"));
            return;
        }
        c1270500jAO.LLJIJIL = c1270520jAQ;
        c1270520jAQ.LIZJ = (((c1270520jAQ.LIZJ + 16) - 1) / 16) * 16;
        c1270520jAQ.LIZIZ = (((c1270520jAQ.LIZIZ + 16) - 1) / 16) * 16;
        c1270500jAO.LLJJI = str;
        c1270500jAO.LLJJJIL = i2;
        c1270500jAO.LLJIJIL.getClass();
        C1270520jAQ c1270520jAQ2 = c1270500jAO.LLJIJIL;
        C1270530jAR c1270530jAR = new C1270530jAR(c1270520jAQ2.LIZ, c1270520jAQ2.LJI);
        c1270530jAR.setEventObserver(c1270500jAO);
        TEBundle parameter = c1270530jAR.getParameter();
        parameter.dump();
        parameter.setInt("mp4_video_height", c1270500jAO.LLJIJIL.LIZJ);
        parameter.setInt("mp4_video_width", c1270500jAO.LLJIJIL.LIZIZ);
        parameter.setInt("mp4_fps", c1270500jAO.LLJIJIL.LJ);
        parameter.setBool("mp4_enable_BFrame", false);
        parameter.setString("mp4_file_name", c1270500jAO.LLJJI);
        parameter.dump();
        c1270530jAR.setParameter(parameter);
        c1270500jAO.LLJJJJLIIL = c1270530jAR;
        c1270530jAR.nativeStartRecord();
        if (c1270500jAO.LLJJJJLIIL == null) {
            c1270500jAO.LLJJIII.set(3);
            interfaceC1270560jAU.LIZIZ(-6, new UnsupportedOperationException("Not found MediaRecorder"));
            return;
        }
        if (c1270500jAO.LLJJJIL == 1) {
            if (c1270500jAO.LLJIJIL.LIZ) {
                ?? r3 = new C1270170j9r(c1270500jAO.LLJJIJI, c1270500jAO) { // from class: X.0j9p
                    public long LLJJJJLIIL;
                    public long LLJJL;

                    @Override // X.AbstractC1268600j7K
                    public final int LLJ(VideoFrame.Buffer buffer, int i3, int i4, int i5, long j) {
                        if (this.LLJJL == 0) {
                            this.LLJJL = j;
                        }
                        if (this.LLJJJJLIIL == 0) {
                            this.LLJJJJLIIL = TimeUtils.nativeNanoTime() / 1000;
                            long jLLJILLL = LiveStreamVideoCapture.LLJILLL(j);
                            if (jLLJILLL > 0) {
                                this.LLJJJJLIIL -= jLLJILLL;
                            }
                        }
                        long j2 = this.LLJJJJLIIL + (j - this.LLJJL);
                        this.LLJJJJLIIL = j2;
                        this.LLJJL = j;
                        return super.LLJ(buffer, i3, i4, 0, j2);
                    }
                };
                if (c1270500jAO.LLJILJILJ == null) {
                    GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "RecorderProcessThread");
                    c1270500jAO.LLJILJIL = gLThreadLIZ;
                    gLThreadLIZ.start();
                    c1270500jAO.LLJILJILJ = c1270500jAO.LLJILJIL.getHandler();
                }
                C1283100jUi.LIZIZ(c1270500jAO.LLJILJILJ, new ARunnableS120S0100000_20(c1270500jAO, 298));
                r3.LLJILJILJ(c1270500jAO.LLJ, c1270500jAO.LLJJIJIIJIL);
                C1270520jAQ c1270520jAQ3 = c1270500jAO.LLJIJIL;
                r3.nativeAdaptedOutputFormat(c1270520jAQ3.LIZIZ, c1270520jAQ3.LIZJ, c1270520jAQ3.LJ);
                c1270500jAO.LLJI = r3;
                c1270500jAO.LJII();
            }
            c1270500jAO.LJIIIIZZ();
            if (c1270500jAO.LLJI != null && c1270500jAO.LLJJIII.get() != 3) {
                C1270150j9p c1270150j9p = c1270500jAO.LLJI;
                C1270520jAQ c1270520jAQ4 = c1270500jAO.LLJIJIL;
                c1270150j9p.LLJI(c1270520jAQ4.LIZIZ, c1270520jAQ4.LIZJ, c1270520jAQ4.LJ);
            }
        } else {
            if (c1270500jAO.LLJIJIL.LIZ) {
                if (c1270500jAO.LLJJIJIL == null) {
                    c1270500jAO.LLJJIJIL = c1270500jAO.LLJLLL;
                    z = true;
                }
                c1270500jAO.LJII();
                if (z) {
                    C1268610j7L c1268610j7L = c1270500jAO.LLJLLL;
                    C1270520jAQ c1270520jAQ5 = c1270500jAO.LLJIJIL;
                    c1268610j7L.LLJI(c1270520jAQ5.LIZIZ, c1270520jAQ5.LIZJ, c1270520jAQ5.LJ);
                }
            }
            c1270500jAO.LJIIIIZZ();
        }
        if (c1270500jAO.LLJJIII.get() != 3) {
            c1270500jAO.LLJJIII.set(1);
            c1270500jAO.LLILLL.start();
            c1270500jAO.LLJJ.LIZ();
        }
    }

    public static final void run$0(ARunnableS1S1301000_20 aRunnableS1S1301000_20) {
        boolean zLIZ;
        int iComposerSetNodesWithTags;
        C1C7U.LIZ("FilterManager@d45d.composerSetNodesWithTags$2");
        try {
            if (((C1272090jCx) aRunnableS1S1301000_20.l3).isValid() && (iComposerSetNodesWithTags = ((C1272090jCx) aRunnableS1S1301000_20.l3).LLJJIJIIJIL.composerSetNodesWithTags((String[]) aRunnableS1S1301000_20.l1, aRunnableS1S1301000_20.i4, (String[]) aRunnableS1S1301000_20.l2)) != 0) {
                ((C1272090jCx) aRunnableS1S1301000_20.l3).LLJZIJLIL.onError(iComposerSetNodesWithTags, aRunnableS1S1301000_20.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerSetNodesWithTags$2");
    }

    public static final void run$1(ARunnableS1S1301000_20 aRunnableS1S1301000_20) {
        int iComposerAppendNodesWithTags;
        int iLIZ;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS1S1301000_20.l1;
        String[] strArr = (String[]) aRunnableS1S1301000_20.l2;
        String[] strArr2 = (String[]) aRunnableS1S1301000_20.l3;
        int i = aRunnableS1S1301000_20.i4;
        String str = aRunnableS1S1301000_20.s0;
        C1C7U.LIZ("VideoEffectNode@5e69.composerAppendNodesWithTags$3L");
        if (c1272100jCy.LJIILIIL()) {
            c1272100jCy.LJIIJJI(strArr);
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                iComposerAppendNodesWithTags = interfaceC1272120jD0.composerAppendNodesWithTags(strArr2, i, strArr);
            } else {
                iComposerAppendNodesWithTags = -1;
            }
            InterfaceC1272600jDm interfaceC1272600jDm = c1272100jCy.LLJJL;
            if (interfaceC1272600jDm != null) {
                InterfaceC1272570jDj interfaceC1272570jDj = c1272100jCy.LLJJLIIIJLLLLLLLZ;
                if (interfaceC1272570jDj != null) {
                    iLIZ = interfaceC1272570jDj.LIZ();
                } else {
                    iLIZ = 0;
                }
                interfaceC1272600jDm.onMessageReceived(4106, iLIZ, iComposerAppendNodesWithTags, str);
            }
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerAppendNodesWithTags$3L");
    }

    public static final void run$2(ARunnableS1S1301000_20 aRunnableS1S1301000_20) {
        int iComposerSetNodesWithTags;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS1S1301000_20.l1;
        String[] strArr = (String[]) aRunnableS1S1301000_20.l2;
        int i = aRunnableS1S1301000_20.i4;
        String[] strArr2 = (String[]) aRunnableS1S1301000_20.l3;
        String str = aRunnableS1S1301000_20.s0;
        C1C7U.LIZ("VideoEffectNode@5e69.composerSetNodesWithTags$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                iComposerSetNodesWithTags = interfaceC1272120jD0.composerSetNodesWithTags(strArr, i, strArr2);
                if (iComposerSetNodesWithTags != 0) {
                }
            } else {
                iComposerSetNodesWithTags = -1;
            }
            C1272300jDI c1272300jDI = c1272100jCy.LLJLILLLLZIIL;
            if (c1272300jDI != null) {
                c1272300jDI.onError(iComposerSetNodesWithTags, str);
            }
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerSetNodesWithTags$1L");
    }

    public static final void run$3(ARunnableS1S1301000_20 aRunnableS1S1301000_20) {
        boolean zLIZ;
        C1C7U.LIZ("RecorderManager@dfee.start$1");
        try {
            aRunnableS1S1301000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecorderManager@dfee.start$1");
    }

    public ARunnableS1S1301000_20(int i, C1272100jCy c1272100jCy, String str, String[] strArr, String[] strArr2, int i2) {
        this.$t = i2;
        if (1 - i2 != 0) {
            this.l1 = c1272100jCy;
            this.l2 = strArr;
            this.i4 = i;
            this.l3 = strArr2;
            this.s0 = str;
            return;
        }
        this.l1 = c1272100jCy;
        this.l2 = strArr;
        this.l3 = strArr2;
        this.i4 = i;
        this.s0 = str;
    }

    public ARunnableS1S1301000_20(Object obj, Object obj2, int i, Object obj3, String str, int i2) {
        this.$t = i2;
        this.l3 = obj;
        this.l1 = obj2;
        this.i4 = i;
        this.l2 = obj3;
        this.s0 = str;
    }
}
