package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.ab.DanmakuUIPerfConf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ChoreographerFrameCallbackC1402070mab implements Choreographer.FrameCallback {
    public final int $t;
    public Object l0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) throws Throwable {
        switch (this.$t) {
            case 0:
                doFrame$0(this, j);
                break;
            case 1:
                doFrame$1(this, j);
                break;
            case 2:
                doFrame$2(this, j);
                break;
        }
    }

    public ChoreographerFrameCallbackC1402070mab(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void doFrame$0(ChoreographerFrameCallbackC1402070mab choreographerFrameCallbackC1402070mab, long j) {
        boolean z;
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ;
        ((C1396830mS9) choreographerFrameCallbackC1402070mab.l0).LJIIJJI.LIZ.LIZLLL.getClass();
        InterfaceC1396960mSM interfaceC1396960mSMLJJJI = ((C1396830mS9) choreographerFrameCallbackC1402070mab.l0).LJJJI();
        if (interfaceC1396960mSMLJJJI != null) {
            interfaceC1396960mSMLJJJI.LIZIZ(((C1396830mS9) choreographerFrameCallbackC1402070mab.l0).LJIILJJIL, System.nanoTime());
        }
        ((C1396830mS9) choreographerFrameCallbackC1402070mab.l0).LJIILJJIL = System.nanoTime();
        C1396830mS9 c1396830mS9 = (C1396830mS9) choreographerFrameCallbackC1402070mab.l0;
        if (c1396830mS9.LJIIL) {
            c1396830mS9.LJIIJJI.LIZ.LIZLLL.getClass();
            if (C1384750m8f.LJIIJJI && !c1396830mS9.LJFF.LIZJ.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            long jLJI = c1396830mS9.LJFF.LJI();
            long jNanoTime = System.nanoTime();
            List<AbstractC1384320m7y> listLJFF = c1396830mS9.LJFF.LJFF();
            long jNanoTime2 = System.nanoTime();
            if (z) {
                listLJFF = C13LP.LJLLLL(C20085613iQ.LIZ(AFwS259S0000000_21.get$arr$(25), AFwS259S0000000_21.get$arr$(26)), listLJFF);
            }
            c1396830mS9.LJJJIL().LIZ(jLJI, listLJFF);
            long jNanoTime3 = System.nanoTime();
            int iLJIIIIZZ = c1396830mS9.LJJJIL().LJIIIIZZ(jLJI, true, false);
            long jNanoTime4 = System.nanoTime();
            InterfaceC1396960mSM interfaceC1396960mSMLJJJI2 = c1396830mS9.LJJJI();
            if (interfaceC1396960mSMLJJJI2 != null) {
                interfaceC1396960mSMLJJJI2.LIZJ(iLJIIIIZZ, jNanoTime, jNanoTime2, jNanoTime3, jNanoTime4);
            }
            if (c1396830mS9.LJIIL) {
                if (!c1396830mS9.LIZIZ.LIZLLL.LJIIJ) {
                    c1396830mS9.LJJJJI();
                    c1396830mS9.LJJJJ();
                    return;
                }
                if (iLJIIIIZZ > 0) {
                    c1396830mS9.LJJJJ();
                    return;
                }
                C1396850mSB c1396850mSB = c1396830mS9.LJFF;
                if (c1396850mSB.LIZ().size() - c1396850mSB.LJFF <= 0) {
                    return;
                }
                long jLIZJ = c1396830mS9.LJFF.LIZJ();
                int i = c1396830mS9.LIZIZ.LIZLLL.LJ;
                if (i > 0) {
                    jLIZJ = (jLIZJ * ((long) 100)) / ((long) i);
                }
                if (0 <= jLIZJ && 160 >= jLIZJ) {
                    c1396830mS9.LJJJJ();
                } else {
                    if (jLIZJ < 0 || (interfaceC1396910mSHLJJJ = c1396830mS9.LJJJ()) == null) {
                        return;
                    }
                    interfaceC1396910mSHLJJJ.LIZIZ(jLIZJ - 80, new AwS565S0100000_21(c1396830mS9, 52));
                }
            }
        }
    }

    public static final void doFrame$1(ChoreographerFrameCallbackC1402070mab choreographerFrameCallbackC1402070mab, long j) {
        Video video;
        ((C1383900m7I) choreographerFrameCallbackC1402070mab.l0).LIZ().add(Long.valueOf(j));
        if (((C1383900m7I) choreographerFrameCallbackC1402070mab.l0).LIZ().size() > ((DanmakuUIPerfConf.Config) DanmakuUIPerfConf.LIZIZ.getValue()).frameSize) {
            C1383900m7I c1383900m7I = (C1383900m7I) choreographerFrameCallbackC1402070mab.l0;
            boolean z = true;
            c1383900m7I.LJIILJJIL = Integer.valueOf((int) (((c1383900m7I.LIZ().getLast().longValue() - ((C1383900m7I) choreographerFrameCallbackC1402070mab.l0).LIZ().getFirst().longValue()) / ((long) (((C1383900m7I) choreographerFrameCallbackC1402070mab.l0).LIZ().size() - 1))) / ((long) 1000000)));
            ((C1383900m7I) choreographerFrameCallbackC1402070mab.l0).LIZ().clear();
            Integer num = ((C1383900m7I) choreographerFrameCallbackC1402070mab.l0).LJIILJJIL;
            if (num != null && num.intValue() > 0) {
                Integer numValueOf = null;
                if (1 != 0) {
                    C1383900m7I c1383900m7I2 = (C1383900m7I) choreographerFrameCallbackC1402070mab.l0;
                    int iIntValue = num.intValue();
                    Aweme aweme = c1383900m7I2.LJIIL;
                    if (aweme != null && (video = aweme.getVideo()) != null) {
                        Integer numValueOf2 = Integer.valueOf(video.getDuration() / iIntValue);
                        if (numValueOf2.intValue() <= 0) {
                            z = false;
                        }
                        if (Boolean.valueOf(z).booleanValue()) {
                            numValueOf = Integer.valueOf(C1383900m7I.LJIJJ.nextInt(numValueOf2.intValue()));
                        }
                    }
                    c1383900m7I2.LJIIZILJ = numValueOf;
                    return;
                }
                return;
            }
            return;
        }
        C786410Ut5.v2().postFrameCallback(choreographerFrameCallbackC1402070mab);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e A[Catch: Exception -> 0x0167, all -> 0x01e6, TryCatch #2 {Exception -> 0x0167, blocks: (B:81:0x0142, B:83:0x014e, B:85:0x0152, B:89:0x015b, B:91:0x015f, B:102:0x0177, B:104:0x017b, B:105:0x017f, B:107:0x0183, B:108:0x0187, B:110:0x018b, B:111:0x018f, B:113:0x0193, B:114:0x0197, B:122:0x01a6, B:124:0x01ad, B:126:0x01b3, B:127:0x01b7, B:129:0x01bc, B:131:0x01c0), top: B:145:0x0142, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void doFrame$2(X.ChoreographerFrameCallbackC1402070mab r12, long r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ChoreographerFrameCallbackC1402070mab.doFrame$2(X.0mab, long):void");
    }
}
