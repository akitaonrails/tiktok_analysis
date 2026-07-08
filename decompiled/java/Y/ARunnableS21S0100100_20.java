package Y;

import X.C1266350j3h;
import X.C1268630j7N;
import X.C1270420jAG;
import X.C1270610jAZ;
import X.C1271390jBp;
import X.C1273010jER;
import X.C1273520jFG;
import X.C1274830jHN;
import X.C1277680jLy;
import X.C1278930jNz;
import X.C1278940jO0;
import X.C1279540jOy;
import X.C1279640jP8;
import X.C1285160jY2;
import X.C1289620jfE;
import X.C1298890juB;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1279610jP5;
import X.EnumC1279620jP6;
import X.InterfaceC1279380jOi;
import X.InterfaceC1279680jPC;
import X.InterfaceC1285170jY3;
import android.graphics.Matrix;
import com.bytedance.pitaya.cep_engine.inner.TimerV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.core.LynxEngineProxy;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.pusher.core.base.TEBundle;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS21S0100100_20 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    public static final void run$4(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        TimerV2.lambda$semisugar$timer$lambda$6$0(aRunnableS21S0100100_20.j1, (Runnable) aRunnableS21S0100100_20.l0);
    }

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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l0;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j1, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j1, "rtc_reconnected");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("elapsed", 0L);
            if (((C1274830jHN) this.l0).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_reconnected");
            }
            ((C1274830jHN) this.l0).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$1() {
        Matrix matrix;
        if (!((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLIFFJFJJ()) {
            if (((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLLIIIL) {
                ARunnableS0S0200200_20 aRunnableS0S0200200_20 = (ARunnableS0S0200200_20) this.l0;
                C1270610jAZ c1270610jAZ = (C1270610jAZ) aRunnableS0S0200200_20.l1;
                C1271390jBp c1271390jBp = c1270610jAZ.LLLIIII;
                if (c1271390jBp != null) {
                    c1270610jAZ.LLJIJIL(c1271390jBp.LIZIZ, false, c1270610jAZ.LLILZLL, c1270610jAZ.LLIZ, c1270610jAZ.LLJLLL, c1270610jAZ.LLLF, this.j1, null, aRunnableS0S0200200_20.j2, aRunnableS0S0200200_20.j3);
                    return;
                }
            }
            if (((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLLIIIL) {
                return;
            }
            ARunnableS0S0200200_20 aRunnableS0S0200200_202 = (ARunnableS0S0200200_20) this.l0;
            C1270610jAZ c1270610jAZ2 = (C1270610jAZ) aRunnableS0S0200200_202.l1;
            C1271390jBp c1271390jBp2 = c1270610jAZ2.LLLII;
            if (c1271390jBp2 != null) {
                c1270610jAZ2.LLJIJIL(c1271390jBp2.LIZIZ, false, c1270610jAZ2.LLILZLL, c1270610jAZ2.LLIZ, c1270610jAZ2.LLJLLL, c1270610jAZ2.LLLF, this.j1, null, aRunnableS0S0200200_202.j2, aRunnableS0S0200200_202.j3);
                return;
            }
            return;
        }
        if (C1273520jFG.LIZJ) {
            C1270610jAZ c1270610jAZ3 = (C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1;
            C1270420jAG c1270420jAG = c1270610jAZ3.LLLZ;
            int i = c1270610jAZ3.LLJLLL;
            boolean z = c1270610jAZ3.LLJJI;
            boolean z2 = c1270610jAZ3.LLJJIII;
            float[] fArr = c1270610jAZ3.LLLF;
            if (c1270420jAG.LIZ == null || c1270420jAG.LIZIZ != i || c1270420jAG.LIZJ != z || c1270420jAG.LIZLLL != z2 || ((fArr != null || c1270420jAG.LJ != null) && !Arrays.equals(fArr, c1270420jAG.LJ))) {
                c1270420jAG.LIZIZ = i;
                c1270420jAG.LIZJ = z;
                c1270420jAG.LIZLLL = z2;
                c1270420jAG.LJ = fArr != null ? Arrays.copyOf(fArr, fArr.length) : null;
                Matrix matrix2 = new Matrix();
                matrix2.preTranslate(0.5f, 0.5f);
                matrix2.preRotate(i);
                matrix2.preScale(z ? -1.0f : 1.0f, z2 ? -1.0f : 1.0f);
                matrix2.preTranslate(-0.5f, -0.5f);
                matrix2.postConcat(C1273010jER.LIZJ(0, fArr));
                c1270420jAG.LIZ = matrix2;
            }
            matrix = ((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLLZ.LIZ;
        } else {
            matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLJLLL);
            C1270610jAZ c1270610jAZ4 = (C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1;
            matrix.preScale(c1270610jAZ4.LLJJI ? -1.0f : 1.0f, c1270610jAZ4.LLJJIII ? -1.0f : 1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            matrix.postConcat(C1273010jER.LIZJ(0, ((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLLF));
        }
        if (((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLLIIIL) {
            ARunnableS0S0200200_20 aRunnableS0S0200200_203 = (ARunnableS0S0200200_20) this.l0;
            C1270610jAZ c1270610jAZ5 = (C1270610jAZ) aRunnableS0S0200200_203.l1;
            C1271390jBp c1271390jBp3 = c1270610jAZ5.LLLIIII;
            if (c1271390jBp3 != null) {
                c1270610jAZ5.LLJILJIL(c1271390jBp3.LIZIZ, false, c1270610jAZ5.LLILZLL, c1270610jAZ5.LLIZ, matrix, this.j1, aRunnableS0S0200200_203.j2, 0L);
                return;
            }
        }
        if (((C1270610jAZ) ((ARunnableS0S0200200_20) this.l0).l1).LLLIIIL) {
            return;
        }
        ARunnableS0S0200200_20 aRunnableS0S0200200_204 = (ARunnableS0S0200200_20) this.l0;
        C1270610jAZ c1270610jAZ6 = (C1270610jAZ) aRunnableS0S0200200_204.l1;
        C1271390jBp c1271390jBp4 = c1270610jAZ6.LLLII;
        if (c1271390jBp4 != null) {
            c1270610jAZ6.LLJILJIL(c1271390jBp4.LIZIZ, false, c1270610jAZ6.LLILZLL, c1270610jAZ6.LLIZ, matrix, this.j1, aRunnableS0S0200200_204.j2, 0L);
        }
    }

    public static final void run$0(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreImpl@e164.setSeiCurrentShiftDiffTime$1");
        try {
            C1266350j3h c1266350j3h = ((C1268630j7N) aRunnableS21S0100100_20.l0).LLJI;
            if (c1266350j3h != null) {
                c1266350j3h.setSeiCurrentShiftDiffTime(aRunnableS21S0100100_20.j1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreImpl@e164.setSeiCurrentShiftDiffTime$1");
    }

    public static final void run$1(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxEngineProxy@d809.startEventCapture$1");
        try {
            LynxEngineProxy lynxEngineProxy = (LynxEngineProxy) aRunnableS21S0100100_20.l0;
            long j = lynxEngineProxy.LIZ;
            if (j == 0) {
                LynxLog.e("LynxEngineProxy", "startEventCapture failed since mNativePtr is null");
            } else {
                lynxEngineProxy.nativeStartEventCapture(j, aRunnableS21S0100100_20.j1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxEngineProxy@d809.startEventCapture$1");
    }

    public static final void run$10(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        C1C7U.LIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onRenderStallStart$1L");
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LJI(EnumC1279620jP6.VIDEO, j);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onRenderStallStart$1L");
    }

    public static final void run$11(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        C1285160jY2 c1285160jY2 = (C1285160jY2) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        C1C7U.LIZ("CustomGameView$FrameService@6988.updateFrame$1L");
        List<InterfaceC1285170jY3> list = c1285160jY2.LIZ;
        List<InterfaceC1285170jY3> list2 = null;
        if (list == null) {
            list = null;
        }
        ArrayList<InterfaceC1285170jY3> arrayList = new ArrayList(list);
        List<InterfaceC1285170jY3> list3 = c1285160jY2.LIZ;
        if (list3 == null) {
            list3 = null;
        }
        list3.clear();
        for (InterfaceC1285170jY3 interfaceC1285170jY3 : arrayList) {
            if (!c1285160jY2.LJ.get()) {
                c1285160jY2.LJ.set(false);
            }
            interfaceC1285170jY3.doFrame(j);
        }
        List<InterfaceC1285170jY3> list4 = c1285160jY2.LIZIZ;
        if (list4 != null) {
            list2 = list4;
        }
        Iterator<InterfaceC1285170jY3> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().doFrame(j);
        }
        C1C7U.LIZIZ("CustomGameView$FrameService@6988.updateFrame$1L");
    }

    public static final void run$12(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onReconnected$1");
        try {
            aRunnableS21S0100100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onReconnected$1");
    }

    public static final void run$13(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onCallJoinChannel$1");
        try {
            JSONObject jSONObjectLIZIZ = ((C1274830jHN) aRunnableS21S0100100_20.l0).LIZIZ(aRunnableS21S0100100_20.j1, "call_join_channel");
            if (jSONObjectLIZIZ != null) {
                ((C1274830jHN) aRunnableS21S0100100_20.l0).LJJ(jSONObjectLIZIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onCallJoinChannel$1");
    }

    public static final void run$14(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.onTextureFrame$1$1");
        try {
            aRunnableS21S0100100_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.onTextureFrame$1$1");
    }

    public static final void run$15(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        TEBundle tEBundle;
        C1278930jNz c1278930jNz = (C1278930jNz) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        c1278930jNz.getClass();
        C1C7U.LIZ("VeLiveSEIMetaDataWrapper@de0a.setSeiCurrentShiftDiffTime$1L");
        C1278940jO0 c1278940jO0 = (C1278940jO0) c1278930jNz.LIZIZ.LJFF();
        c1278930jNz.LIZLLL = j;
        if (c1278940jO0 != null && c1278940jO0.LJIIL != null && (tEBundle = c1278940jO0.LJIILIIL) != null) {
            tEBundle.setLong("sei_ntp_time_shift", j);
            c1278940jO0.LJIIL.setParameter(c1278940jO0.LJIILIIL);
        }
        C1C7U.LIZIZ("VeLiveSEIMetaDataWrapper@de0a.setSeiCurrentShiftDiffTime$1L");
    }

    public static final void run$2(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxEngineProxy@d809.startEventBubble$1");
        try {
            LynxEngineProxy lynxEngineProxy = (LynxEngineProxy) aRunnableS21S0100100_20.l0;
            long j = lynxEngineProxy.LIZ;
            if (j == 0) {
                LynxLog.e("LynxEngineProxy", "startEventBubble failed since mNativePtr is null");
            } else {
                lynxEngineProxy.nativeStartEventBubble(j, aRunnableS21S0100100_20.j1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxEngineProxy@d809.startEventBubble$1");
    }

    public static final void run$3(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        int i;
        boolean z;
        MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        markdownShadowNode.getClass();
        C1C7U.LIZ("MarkdownShadowNode@bccc.onVSync$1L");
        int i2 = markdownShadowNode.LJJIJIIJIL;
        if (i2 != 0 && markdownShadowNode.LJJIIJ != null) {
            float f = markdownShadowNode.LJJIJ;
            if (f <= 0.0f || markdownShadowNode.LJJIZ || (i2 != 2 ? markdownShadowNode.LJJIJIL >= markdownShadowNode.LJJJ : markdownShadowNode.LJJJIL >= markdownShadowNode.LJJJI)) {
                i = 0;
            } else {
                long j2 = (long) (1000.0d / ((double) f));
                long j3 = markdownShadowNode.LJJLIIJ;
                long j4 = j - j3;
                if (j4 >= j2) {
                    if (j3 == 0) {
                        markdownShadowNode.LJJLIIJ = j;
                        i = 1;
                    } else {
                        i = (int) (j4 / j2);
                        markdownShadowNode.LJJLIIJ = j3 + (((long) i) * j2);
                    }
                } else {
                    i = 0;
                }
                if (i2 == 2) {
                    int iMin = Math.min(markdownShadowNode.LJJJIL + i, markdownShadowNode.LJJJI);
                    markdownShadowNode.LJJJIL = iMin;
                    markdownShadowNode.LJJIJIL = markdownShadowNode.LJJIIZI(iMin);
                    if (markdownShadowNode.LJJJIL >= markdownShadowNode.LJJJI) {
                        markdownShadowNode.LJJLIIJ = 0L;
                    }
                } else {
                    int i3 = markdownShadowNode.LJJIJIL + i;
                    markdownShadowNode.LJJIJIL = i3;
                    int i4 = markdownShadowNode.LJJJ;
                    if (i3 > i4) {
                        markdownShadowNode.LJJIJIL = i4;
                        markdownShadowNode.LJJLIIJ = 0L;
                    }
                }
                if (i > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateAnimationStep: time=");
                    sbLIZ.append(j);
                    sbLIZ.append(", steps=");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(markdownShadowNode.LJJIII());
                    LynxLog.d("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            int i5 = markdownShadowNode.LJJLIL;
            int i6 = markdownShadowNode.LJJIJIL;
            if (i5 != i6) {
                markdownShadowNode.LJJLIL = i6;
                C1298890juB.LIZ(markdownShadowNode, i6, markdownShadowNode.LJJJ, markdownShadowNode.LJJJJI);
            }
            if (markdownShadowNode.LJJIJIL >= markdownShadowNode.LJJJ) {
                z = true;
            } else {
                z = false;
            }
            if (markdownShadowNode.LJJIJIIJIL == 2) {
                if (!z && markdownShadowNode.LJJJIL < markdownShadowNode.LJJJI) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!markdownShadowNode.LJJLIIIJLLLLLLLZ && z) {
                if (markdownShadowNode.LJJI) {
                    C1298890juB.LIZIZ(markdownShadowNode, "drawEnd");
                }
                markdownShadowNode.LJJLIIIJLLLLLLLZ = true;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onVSync complete: time=");
                sbLIZ2.append(j);
                sbLIZ2.append(", contentComplete=");
                sbLIZ2.append(markdownShadowNode.LJJI);
                LynxLog.i("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (i > 0 || (markdownShadowNode.LJJIJLIJ > 0.0f && !markdownShadowNode.LJJLJLI.LIZ())) {
                float f2 = markdownShadowNode.LJJJJZI;
                markdownShadowNode.LJJIIJ();
                markdownShadowNode.LJJIJIIJIL(j, false);
                if (Float.compare(f2, markdownShadowNode.LJJJJZI) != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateAnimationHeight dirty: previousHeight=");
                    sbLIZ3.append(f2);
                    sbLIZ3.append(", newHeight=");
                    sbLIZ3.append(markdownShadowNode.LJJJJZI);
                    LynxLog.d("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ3));
                    markdownShadowNode.LJIILLIIL();
                } else if (i > 0 && markdownShadowNode.LJJLIIIJJI != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("updateAnimationHeight syncViewStep: step=");
                    sbLIZ4.append(markdownShadowNode.LJJIJIL);
                    LynxLog.d("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ4));
                    C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(markdownShadowNode, 164));
                }
            }
        }
        C1C7U.LIZIZ("MarkdownShadowNode@bccc.onVSync$1L");
    }

    public static final void run$5(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        C1C7U.LIZ("LyraxPlayerImpl@d373.setNtpTimeDiff$1L");
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LJJZ = j;
        }
        C1C7U.LIZIZ("LyraxPlayerImpl@d373.setNtpTimeDiff$1L");
    }

    public static final void run$6(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        C1C7U.LIZ("LyraxPlayerImpl$registerListener$1@37cf.onAudioRenderStallStart$1L");
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LJI(EnumC1279620jP6.AUDIO, j);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl$registerListener$1@37cf.onAudioRenderStallStart$1L");
    }

    public static final void run$7(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        C1C7U.LIZ("LyraxPlayerImpl$registerListener$1@37cf.onAudioRenderStallEnd$1L");
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LJFF(EnumC1279620jP6.AUDIO, j);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl$registerListener$1@37cf.onAudioRenderStallEnd$1L");
    }

    public static final void run$8(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        C1C7U.LIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onRenderStallEnd$1L");
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LJFF(EnumC1279620jP6.VIDEO, j);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onRenderStallEnd$1L");
    }

    public static final void run$9(ARunnableS21S0100100_20 aRunnableS21S0100100_20) {
        InterfaceC1279680jPC interfaceC1279680jPC;
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS21S0100100_20.l0;
        long j = aRunnableS21S0100100_20.j1;
        C1C7U.LIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onFirstFrameRendered$1L");
        InterfaceC1279380jOi interfaceC1279380jOi = c1277680jLy.LJJI;
        if (interfaceC1279380jOi != null && (interfaceC1279680jPC = ((C1279640jP8) interfaceC1279380jOi).LLILLJJLI) != null) {
            interfaceC1279680jPC.LJIJI(true);
        }
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LIZJ(EnumC1279610jP5.LyraxPlayerPullLocation_Render, j);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onFirstFrameRendered$1L");
    }

    public ARunnableS21S0100100_20(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
