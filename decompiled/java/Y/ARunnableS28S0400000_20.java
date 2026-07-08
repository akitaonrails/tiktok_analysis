package Y;

import X.AbstractC1268600j7K;
import X.C013C;
import X.C1269940j9U;
import X.C1270110j9l;
import X.C1270180j9s;
import X.C1270330jA7;
import X.C1270610jAZ;
import X.C1271390jBp;
import X.C1271450jBv;
import X.C1271540jC4;
import X.C1271550jC5;
import X.C1272060jCu;
import X.C1272090jCx;
import X.C1272100jCy;
import X.C1272590jDl;
import X.C1273010jER;
import X.C1273520jFG;
import X.C1273620jFQ;
import X.C1273630jFR;
import X.C1275590jIb;
import X.C1282870jUL;
import X.C1282880jUM;
import X.C1283070jUf;
import X.C1283080jUg;
import X.C1283110jUj;
import X.C1283120jUk;
import X.C1301070jxh;
import X.C1301090jxj;
import X.C1301140jxo;
import X.C1315700kLI;
import X.C1315930kLf;
import X.C1316350kML;
import X.C1316590kMj;
import X.C1317680kOU;
import X.C1317700kOW;
import X.C1317710kOX;
import X.C1325710kbR;
import X.C1C7U;
import X.C1DJ6;
import X.C2188811AlT;
import X.C2250071D4z;
import X.C777170UeB;
import X.C786410Ut5;
import X.EnumC1273550jFJ;
import X.EnumC1274530jGt;
import X.InterfaceC1267390j5N;
import X.InterfaceC1270140j9o;
import X.InterfaceC1271470jBx;
import X.InterfaceC1271560jC6;
import X.InterfaceC1272120jD0;
import X.InterfaceC1273880jFq;
import X.InterfaceC1282910jUP;
import X.InterfaceC1283880jVy;
import X.InterfaceC1301080jxi;
import android.content.Context;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoStreamHDFilterImpl;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS28S0400000_20 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AbstractC1268600j7K abstractC1268600j7K = ((LiveStreamVideoCapture) this.l3).LLJJL;
        if (abstractC1268600j7K != null && (abstractC1268600j7K instanceof C1270110j9l) && abstractC1268600j7K.status() == 1) {
            final C1270110j9l c1270110j9l = (C1270110j9l) ((LiveStreamVideoCapture) this.l3).LLJJL;
            Bundle bundle = (Bundle) this.l0;
            C777170UeB c777170UeB = (C777170UeB) this.l1;
            final InterfaceC1270140j9o interfaceC1270140j9o = (InterfaceC1270140j9o) this.l2;
            if (c1270110j9l.LLLI == null) {
                c1270110j9l.LLLI = new C1271450jBv();
                c1270110j9l.LLLF = bundle.getInt("max_border", 0);
                c1270110j9l.LLLFF = bundle.getFloat("rotation", 0.0f);
                c1270110j9l.LLLFFI = bundle.getInt("width", 0);
                int i = bundle.getInt("height", 0);
                c1270110j9l.LLLFZ = i;
                c1270110j9l.LLLII = c777170UeB;
                int[] iArrLLJJI = c1270110j9l.LLJJI(c1270110j9l.LLJ, c1270110j9l.LLJI, c1270110j9l.LLLFFI, i, c1270110j9l.LLLF);
                C1271450jBv c1271450jBv = c1270110j9l.LLLI;
                int i2 = iArrLLJJI[0];
                int i3 = iArrLLJJI[1];
                float f = c1270110j9l.LLLFF;
                InterfaceC1271470jBx interfaceC1271470jBx = new InterfaceC1271470jBx() { // from class: X.0j9m
                    @Override // X.InterfaceC1271470jBx
                    public final void onError(int i4, String str) {
                    }

                    @Override // X.InterfaceC1271470jBx
                    public final void LJJLIIIJJIZ(C1271450jBv c1271450jBv2) {
                        InterfaceC1270140j9o interfaceC1270140j9o2 = interfaceC1270140j9o;
                        if (interfaceC1270140j9o2 != null) {
                            interfaceC1270140j9o2.LIZIZ(c1271450jBv2.LIZIZ(), c1271450jBv2.LLJILLL, c1271450jBv2.LLJJ);
                        }
                    }
                };
                Handler handler = c1270110j9l.LLLIIII.LLJILJIL;
                c1271450jBv.LLJJIII = f;
                c1271450jBv.LJII(1, i2, i3, 0, false, null, interfaceC1271470jBx, null, handler);
            }
        }
    }

    public final void LIZ$1() {
        C1272090jCx c1272090jCx = (C1272090jCx) this.l3;
        if (c1272090jCx.LLJJIJIIJIL == null || !c1272090jCx.isValid()) {
            return;
        }
        InterfaceC1272120jD0 interfaceC1272120jD0 = ((C1272090jCx) this.l3).LLJJIJIIJIL;
        GLTexture[] gLTextureArr = (GLTexture[]) this.l0;
        if (interfaceC1272120jD0.mixFrame(gLTextureArr, gLTextureArr.length, (GLTexture) this.l1) != 0) {
            ((VideoFrame[]) this.l2)[0] = null;
        } else {
            ((VideoFrame[]) this.l2)[0] = new VideoFrame(new k(((GLTexture) this.l1).getWidth(), ((GLTexture) this.l1).getHeight(), EnumC1273550jFJ.RGB, ((GLTexture) this.l1).getTextureId(), (Matrix) null, (SurfaceTextureHelper) null, (Runnable) null), 0, System.nanoTime());
        }
    }

    public final void LIZ$2() {
        C1272090jCx c1272090jCx = (C1272090jCx) this.l3;
        if (c1272090jCx.LLLIIII != null || c1272090jCx.LLLIIIIL != null) {
            InterfaceC1267390j5N interfaceC1267390j5N = (InterfaceC1267390j5N) this.l0;
            if (interfaceC1267390j5N != null) {
                interfaceC1267390j5N.onError(-2, "Already started a catching task");
                return;
            }
            return;
        }
        MediaEngineFactory mediaEngineFactory = (MediaEngineFactory) ((WeakReference) this.l1).get();
        int i = ((Bundle) this.l2).getInt("mode", -1);
        int i2 = ((Bundle) this.l2).getInt("width");
        int i3 = ((Bundle) this.l2).getInt("height");
        int i4 = ((Bundle) this.l2).getInt("fps");
        boolean z = ((Bundle) this.l2).getBoolean("hardwareEncode", true);
        String string = ((Bundle) this.l2).getString("outputPathOrigin");
        String string2 = ((Bundle) this.l2).getString("outputPathWithEffect");
        ((C1272090jCx) this.l3).LLLIIIL = ((Bundle) this.l2).getInt("frameCount");
        if (i == 0 && ((Bundle) this.l2).containsKey("duration")) {
            ((C1272090jCx) this.l3).LLLIIIL = (int) (((Bundle) this.l2).getFloat("duration") * i4);
        }
        ((C1272090jCx) this.l3).LLLIIL = (int) (((Bundle) this.l2).getFloat("interval") * 1000.0f);
        ((C1272090jCx) this.l3).LLLILZ = (InterfaceC1267390j5N) this.l0;
        if (!TextUtils.isEmpty(string)) {
            ((C1272090jCx) this.l3).LLLIIII = new C1271450jBv();
            C1272090jCx c1272090jCx2 = (C1272090jCx) this.l3;
            c1272090jCx2.LLLIIII.LJII(i, i2, i3, i4, z, string, c1272090jCx2, mediaEngineFactory, c1272090jCx2.LLILZLL);
        }
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        ((C1272090jCx) this.l3).LLLIIIIL = new C1271450jBv();
        C1272090jCx c1272090jCx3 = (C1272090jCx) this.l3;
        c1272090jCx3.LLLIIIIL.LJII(i, i2, i3, i4, z, string2, c1272090jCx3, mediaEngineFactory, c1272090jCx3.LLILZLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0234 A[Catch: all -> 0x03b1, TryCatch #0 {all -> 0x03b1, blocks: (B:92:0x01c0, B:94:0x01ce, B:96:0x01d2, B:100:0x01d9, B:102:0x01de, B:104:0x01e4, B:106:0x01ee, B:109:0x0212, B:110:0x0218, B:112:0x0220, B:114:0x0224, B:116:0x022e, B:119:0x023a, B:121:0x023e, B:123:0x0242, B:125:0x0246, B:127:0x0250, B:118:0x0234, B:128:0x0258, B:130:0x0262, B:132:0x026d, B:134:0x0271, B:136:0x0275, B:137:0x027d, B:138:0x0285, B:140:0x0289, B:142:0x028d, B:144:0x029b), top: B:223:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b3 A[PHI: r10
      0x02b3: PHI (r10v5 int) = (r10v3 int), (r10v8 int) binds: [B:147:0x02a8, B:135:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b7 A[Catch: all -> 0x03b3, TryCatch #1 {all -> 0x03b3, blocks: (B:149:0x02af, B:152:0x02b7, B:153:0x02ca, B:155:0x02ce, B:157:0x02dc, B:159:0x02e2, B:161:0x02e8, B:163:0x02f0, B:165:0x02f5, B:167:0x02f9, B:168:0x0303, B:170:0x0307, B:172:0x030d, B:173:0x0315, B:175:0x031e, B:177:0x0324, B:178:0x032e, B:180:0x0334, B:182:0x0338, B:183:0x0344, B:185:0x0348, B:187:0x0369, B:197:0x0393, B:199:0x0397, B:201:0x039d, B:203:0x03a1, B:204:0x03aa, B:188:0x036f, B:189:0x0378, B:191:0x037c, B:192:0x0380, B:194:0x038c, B:145:0x029f, B:146:0x02a6, B:148:0x02aa), top: B:224:0x029f }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ce A[Catch: all -> 0x03b3, TryCatch #1 {all -> 0x03b3, blocks: (B:149:0x02af, B:152:0x02b7, B:153:0x02ca, B:155:0x02ce, B:157:0x02dc, B:159:0x02e2, B:161:0x02e8, B:163:0x02f0, B:165:0x02f5, B:167:0x02f9, B:168:0x0303, B:170:0x0307, B:172:0x030d, B:173:0x0315, B:175:0x031e, B:177:0x0324, B:178:0x032e, B:180:0x0334, B:182:0x0338, B:183:0x0344, B:185:0x0348, B:187:0x0369, B:197:0x0393, B:199:0x0397, B:201:0x039d, B:203:0x03a1, B:204:0x03aa, B:188:0x036f, B:189:0x0378, B:191:0x037c, B:192:0x0380, B:194:0x038c, B:145:0x029f, B:146:0x02a6, B:148:0x02aa), top: B:224:0x029f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [X.0jBY, com.ss.ttlivestreamer.core.buffer.k] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            Method dump skipped, instruction units count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS28S0400000_20.LIZ$3():void");
    }

    public final void LIZ$4() {
        C1301140jxo c1301140jxo = (C1301140jxo) this.l0;
        c1301140jxo.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        while (true) {
            Pair<InterfaceC1301080jxi, Integer> pairPoll = c1301140jxo.LIZ.poll();
            if (pairPoll == null) {
                break;
            } else {
                arrayList.add(pairPoll);
            }
        }
        for (Pair pair : arrayList) {
            Object obj = pair.first;
            if (obj != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    LynxLog.i("Lynx", "load font success");
                    ((InterfaceC1301080jxi) pair.first).LIZIZ(((C1301070jxh) this.l1).LIZ(((Integer) pair.second).intValue()), ((Integer) pair.second).intValue());
                } else {
                    C1301090jxj c1301090jxj = (C1301090jxj) this.l3;
                    C1301070jxh c1301070jxh = (C1301070jxh) this.l1;
                    int iIntValue = ((Integer) pair.second).intValue();
                    c1301090jxj.getClass();
                    C1301090jxj.LJFF((Handler) this.l2, (InterfaceC1301080jxi) obj, c1301070jxh, iIntValue);
                }
            }
        }
    }

    public final void LIZ$5() {
        C1301140jxo c1301140jxo = (C1301140jxo) this.l0;
        c1301140jxo.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        while (true) {
            Pair<InterfaceC1301080jxi, Integer> pairPoll = c1301140jxo.LIZ.poll();
            if (pairPoll == null) {
                break;
            } else {
                arrayList.add(pairPoll);
            }
        }
        for (Pair pair : arrayList) {
            Object obj = pair.first;
            if (obj != null) {
                C1301090jxj c1301090jxj = (C1301090jxj) this.l3;
                Handler handler = (Handler) this.l1;
                InterfaceC1301080jxi interfaceC1301080jxi = (InterfaceC1301080jxi) obj;
                C1301070jxh c1301070jxh = (C1301070jxh) this.l2;
                Integer num = (Integer) pair.second;
                c1301090jxj.getClass();
                int iIntValue = num == null ? 0 : num.intValue();
                if (Build.VERSION.SDK_INT >= 28) {
                    LynxLog.i("FontFaceManager", "Lynx load font success.");
                    interfaceC1301080jxi.LIZIZ(c1301070jxh.LIZ(iIntValue), iIntValue);
                } else {
                    C1301090jxj.LJFF(handler, interfaceC1301080jxi, c1301070jxh, iIntValue);
                }
            }
        }
    }

    public final void LIZ$6() {
        try {
            String str = ((C1317710kOX) this.l0).LJFF;
            if (str != null && str.startsWith("asset")) {
                C1317700kOW c1317700kOWLJIIIIZZ = ((C1317680kOU) this.l3).LJIIIIZZ((Context) this.l1, (C1317710kOX) this.l0);
                if (c1317700kOWLJIIIIZZ != null) {
                    C1317680kOU c1317680kOU = (C1317680kOU) this.l3;
                    C786410Ut5.LJJZZIII(c1317680kOU.LIZJ, new ARunnableS89S0200000_20(c1317680kOU, c1317700kOWLJIIIIZZ, 130));
                    return;
                }
                return;
            }
            C1317700kOW c1317700kOWLJIIIZ = ((C1317680kOU) this.l3).LJIIIZ((C1317710kOX) this.l0);
            if (c1317700kOWLJIIIZ == null) {
                ((C1317680kOU) this.l3).LJIIJ((Context) this.l1, (C1317710kOX) this.l2);
            } else {
                C1317680kOU c1317680kOU2 = (C1317680kOU) this.l3;
                C786410Ut5.LJJZZIII(c1317680kOU2.LIZJ, new ARunnableS89S0200000_20(c1317680kOU2, c1317700kOWLJIIIZ, 130));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadOriginBitmap failed: ");
            sbLIZ.append(th.toString());
            LynxLog.e("BigImageDrawingHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ$7() {
        C1271390jBp c1271390jBp;
        float[] fArrLIZIZ;
        C1270610jAZ c1270610jAZ = (C1270610jAZ) this.l3;
        if (c1270610jAZ.LLJJJ <= 0 || ((GlRenderDrawer) this.l0) == null || (c1271390jBp = (C1271390jBp) this.l1) == null || c1271390jBp.LIZ <= 0) {
            return;
        }
        int i = c1271390jBp.LIZJ;
        int i2 = c1270610jAZ.LLILZLL;
        if (i != i2 || c1271390jBp.LIZLLL != c1270610jAZ.LLIZ) {
            try {
                c1271390jBp.LIZLLL(i2, c1270610jAZ.LLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("frameBuffer setSize failed (");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(") w ");
                sbLIZ.append(((C1270610jAZ) this.l3).LLILZLL);
                sbLIZ.append(" h ");
                sbLIZ.append(((C1270610jAZ) this.l3).LLIZ);
                AVLog.e("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        if (((C1270610jAZ) this.l3).LLIFFJFJJ()) {
            C1270610jAZ c1270610jAZ2 = (C1270610jAZ) this.l3;
            c1270610jAZ2.LLJLLL = 0;
            int i3 = c1270610jAZ2.LLJZ;
            if (i3 == 1 || i3 == 3) {
                int i4 = (i3 - 2) * 90;
                c1270610jAZ2.LLJLLL = i4;
                c1270610jAZ2.LLJLLL = (i4 + 180) % 360;
            } else if (i3 == 2) {
                c1270610jAZ2.LLJLLL = 180;
            }
        }
        if (C1273520jFG.LIZJ) {
            C1270610jAZ c1270610jAZ3 = (C1270610jAZ) this.l3;
            C1270330jA7 c1270330jA7 = c1270610jAZ3.LLLLZI;
            int i5 = c1270610jAZ3.LLJLLL;
            float[] fArr = c1270610jAZ3.LLLF;
            boolean zLLIFFJFJJ = c1270610jAZ3.LLIFFJFJJ();
            if (c1270330jA7.LIZ == null || c1270330jA7.LIZIZ != i5 || !Arrays.equals(fArr, c1270330jA7.LIZJ) || c1270330jA7.LIZLLL != zLLIFFJFJJ) {
                c1270330jA7.LIZIZ = i5;
                c1270330jA7.LIZJ = Arrays.copyOf(fArr, fArr.length);
                c1270330jA7.LIZLLL = zLLIFFJFJJ;
                Matrix matrixLIZJ = C1273010jER.LIZJ(0, fArr);
                if (i5 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.reset();
                    matrix.preTranslate(0.5f, 0.5f);
                    matrix.preRotate(-i5);
                    matrix.preTranslate(-0.5f, -0.5f);
                    if (zLLIFFJFJJ) {
                        matrix.postConcat(matrixLIZJ);
                    } else {
                        matrix.preConcat(matrixLIZJ);
                    }
                    matrixLIZJ = matrix;
                }
                c1270330jA7.LIZ = C1273010jER.LIZIZ(matrixLIZJ);
            }
            fArrLIZIZ = ((C1270610jAZ) this.l3).LLLLZI.LIZ;
        } else {
            Matrix matrixLIZJ2 = C1273010jER.LIZJ(0, ((C1270610jAZ) this.l3).LLLF);
            if (((C1270610jAZ) this.l3).LLJLLL != 0) {
                Matrix matrixLIZIZ = C1273520jFG.LIZIZ(1, false, null);
                matrixLIZIZ.reset();
                matrixLIZIZ.preTranslate(0.5f, 0.5f);
                matrixLIZIZ.preRotate(-((C1270610jAZ) this.l3).LLJLLL);
                matrixLIZIZ.preTranslate(-0.5f, -0.5f);
                if (((C1270610jAZ) this.l3).LLIFFJFJJ()) {
                    matrixLIZIZ.postConcat(matrixLIZJ2);
                } else {
                    matrixLIZIZ.preConcat(matrixLIZJ2);
                }
                matrixLIZJ2 = matrixLIZIZ;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CopyFrame CameraType ");
            sbLIZ2.append(((C1270610jAZ) this.l3).LLJJJJ.LLILLJJLI);
            sbLIZ2.append(" mRotation ");
            sbLIZ2.append(((C1270610jAZ) this.l3).LLJLLL);
            sbLIZ2.append(" dpyRotation ");
            sbLIZ2.append(((C1270610jAZ) this.l3).LLJZ);
            AVLog.iod("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2));
            fArrLIZIZ = C1273010jER.LIZIZ(matrixLIZJ2);
        }
        try {
            GLES20.glBindFramebuffer(36160, ((C1271390jBp) this.l1).LIZ);
            GlRenderDrawer glRenderDrawer = (GlRenderDrawer) this.l0;
            C1270610jAZ c1270610jAZ4 = (C1270610jAZ) this.l3;
            glRenderDrawer.drawOes(c1270610jAZ4.LLJJJ, null, fArrLIZIZ, 0, 0, c1270610jAZ4.LLILZLL, c1270610jAZ4.LLIZ);
            if (((C1270610jAZ) this.l3).LLLI) {
                GLES20.glFinish();
            } else {
                GLES20.glFlush();
            }
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glGetError();
            ((boolean[]) this.l2)[0] = true;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("copyCurrentFrame error: ");
            sbLIZ3.append(e2.toString());
            AVLog.ioe("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final void LIZ$8() {
        try {
            ((TTLHAbnormalDetectorJava) this.l2).processTexture(((com.ss.bytertc.engine.video.VideoFrame) this.l1).getTextureID(), ((com.ss.bytertc.engine.video.VideoFrame) this.l1).getWidth(), ((com.ss.bytertc.engine.video.VideoFrame) this.l1).getHeight(), ((EnumC1274530jGt) this.l3) == EnumC1274530jGt.TEXTURE_OES, new C1275590jIb(((VideoPixelFormat) this.l0).toString(), -1, ((com.ss.bytertc.engine.video.VideoFrame) this.l1).getTextureMatrix(), null));
            ((com.ss.bytertc.engine.video.VideoFrame) this.l1).release();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((com.ss.bytertc.engine.video.VideoFrame) this.l1).release();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [V, java.lang.Object] */
    public static final void run$0(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ThreadUtils@6564.invokeAtFrontUninterruptibly$9");
        try {
            try {
                ((C1283080jUg) aRunnableS28S0400000_20.l0).LIZ = ((Callable) aRunnableS28S0400000_20.l1).call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((C1283070jUf) aRunnableS28S0400000_20.l2).LIZ = e;
            }
            ((CountDownLatch) aRunnableS28S0400000_20.l3).countDown();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadUtils@6564.invokeAtFrontUninterruptibly$9");
    }

    public static final void run$1(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.switchCamera$2");
        try {
            ((b0) aRunnableS28S0400000_20.l3).switchCamera((TECameraCapture) aRunnableS28S0400000_20.l0, (C1DJ6) aRunnableS28S0400000_20.l1, (Cert) aRunnableS28S0400000_20.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.switchCamera$2");
    }

    public static final void run$10(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS28S0400000_20.l0;
        Context context = (Context) aRunnableS28S0400000_20.l1;
        JSONObject jSONObject = (JSONObject) aRunnableS28S0400000_20.l2;
        InterfaceC1283880jVy interfaceC1283880jVy = (InterfaceC1283880jVy) aRunnableS28S0400000_20.l3;
        c1272090jCx.getClass();
        C1C7U.LIZ("FilterManager@d45d.initVideoDenoiseFilter$1L");
        c1272090jCx.LLJJIII(context, jSONObject, interfaceC1283880jVy);
        C1C7U.LIZIZ("FilterManager@d45d.initVideoDenoiseFilter$1L");
    }

    public static final void run$11(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.processInternal$1");
        try {
            aRunnableS28S0400000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.processInternal$1");
    }

    public static final void run$12(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        Integer numValueOf;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS28S0400000_20.l0;
        GLTexture[] gLTextureArr = (GLTexture[]) aRunnableS28S0400000_20.l1;
        GLTexture gLTexture = (GLTexture) aRunnableS28S0400000_20.l2;
        VideoFrame[] videoFrameArr = (VideoFrame[]) aRunnableS28S0400000_20.l3;
        C1C7U.LIZ("VideoEffectNode@5e69.mixFrame$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            VideoFrame videoFrame = null;
            if (interfaceC1272120jD0 != null) {
                numValueOf = Integer.valueOf(interfaceC1272120jD0.mixFrame(gLTextureArr, gLTextureArr.length, gLTexture));
            } else {
                numValueOf = null;
            }
            if (numValueOf != null && numValueOf.intValue() == 0) {
                videoFrame = new VideoFrame(new k(gLTexture.getWidth(), gLTexture.getHeight(), EnumC1273550jFJ.RGB, gLTexture.getTextureId(), null, null, null, null, null, 0L), 0, System.nanoTime());
            }
            videoFrameArr[0] = videoFrame;
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.mixFrame$1L");
    }

    public static final void run$13(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FontFaceManager@c8f5.loadTypeface$1");
        try {
            aRunnableS28S0400000_20.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FontFaceManager@c8f5.loadTypeface$1");
    }

    public static final void run$14(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FontFaceManager@c8f5.loadTypefaceWithGenericLynxResourceFetcher$1");
        try {
            aRunnableS28S0400000_20.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FontFaceManager@c8f5.loadTypefaceWithGenericLynxResourceFetcher$1");
    }

    public static final void run$15(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("BigImageDrawingHelper@4170.loadOriginBitmap$1");
        try {
            aRunnableS28S0400000_20.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BigImageDrawingHelper@4170.loadOriginBitmap$1");
    }

    public static final void run$16(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxImageManager$ImageRequestHandle@b296.onSuccess$1");
        try {
            ((C1316590kMj) aRunnableS28S0400000_20.l3).LIZ.LIZ((C1315930kLf) aRunnableS28S0400000_20.l0, (C1315700kLI) aRunnableS28S0400000_20.l1, (C1316350kML) aRunnableS28S0400000_20.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxImageManager$ImageRequestHandle@b296.onSuccess$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$17(Y.ARunnableS28S0400000_20 r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS28S0400000_20.run$17(Y.ARunnableS28S0400000_20):void");
    }

    public static final void run$18(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("VeLivePusherHelper@bd6f.fromAVFVideoFrame$1L$1");
        try {
            if (C1272060jCu.LIZIZ((LiveSdkSetting) aRunnableS28S0400000_20.l0)) {
                ((InterfaceC1271560jC6) aRunnableS28S0400000_20.l1).release("PusherEncode");
            } else {
                ((InterfaceC1271560jC6) aRunnableS28S0400000_20.l1).release();
            }
            C1269940j9U c1269940j9U = (C1269940j9U) aRunnableS28S0400000_20.l2;
            if (c1269940j9U != null) {
                c1269940j9U.LIZ(12, ((VideoFrame) aRunnableS28S0400000_20.l3).getBuffer().getCaptureMs());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VeLivePusherHelper@bd6f.fromAVFVideoFrame$1L$1");
    }

    public static final void run$19(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        C1270180j9s c1270180j9s = (C1270180j9s) aRunnableS28S0400000_20.l0;
        Bundle bundle = (Bundle) aRunnableS28S0400000_20.l1;
        C777170UeB c777170UeB = (C777170UeB) aRunnableS28S0400000_20.l2;
        final InterfaceC1270140j9o interfaceC1270140j9o = (InterfaceC1270140j9o) aRunnableS28S0400000_20.l3;
        C1C7U.LIZ("ScreenVideoNode@5892.catchVideoFrame$1L");
        if (c1270180j9s.LLJJJJLIIL == null) {
            c1270180j9s.LLJJJJLIIL = new C1271450jBv();
            c1270180j9s.LLJJLIIIJLLLLLLLZ = bundle.getInt("max_border", 0);
            c1270180j9s.LLJL = bundle.getFloat("rotation", 0.0f);
            c1270180j9s.LLJLIL = bundle.getInt("width", 0);
            int i = bundle.getInt("height", 0);
            c1270180j9s.LLJLILLLLZIIL = i;
            c1270180j9s.LLJJL = c777170UeB;
            int[] iArrLJIIJ = C1270180j9s.LJIIJ(c1270180j9s.LLJJ, c1270180j9s.LLJJI, c1270180j9s.LLJLIL, i, c1270180j9s.LLJJLIIIJLLLLLLLZ);
            C1271450jBv c1271450jBv = c1270180j9s.LLJJJJLIIL;
            if (c1271450jBv != null) {
                int i2 = iArrLJIIJ[0];
                int i3 = iArrLJIIJ[1];
                float f = c1270180j9s.LLJL;
                InterfaceC1271470jBx interfaceC1271470jBx = new InterfaceC1271470jBx() { // from class: X.0j9n
                    @Override // X.InterfaceC1271470jBx
                    public final void onError(int i4, String str) {
                    }

                    @Override // X.InterfaceC1271470jBx
                    public final void LJJLIIIJJIZ(C1271450jBv c1271450jBv2) {
                        interfaceC1270140j9o.LIZIZ(c1271450jBv2.LIZIZ(), c1271450jBv2.LLJILLL, c1271450jBv2.LLJJ);
                    }
                };
                Handler handler = c1270180j9s.LLILZ;
                c1271450jBv.LLJJIII = f;
                c1271450jBv.LJII(1, i2, i3, 0, false, null, interfaceC1271470jBx, null, handler);
            }
        }
        C1C7U.LIZIZ("ScreenVideoNode@5892.catchVideoFrame$1L");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [V, java.lang.Object] */
    public static final void run$2(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ThreadUtils@eac9.invokeAtFrontUninterruptibly$9");
        try {
            try {
                ((C1283120jUk) aRunnableS28S0400000_20.l0).LIZ = ((Callable) aRunnableS28S0400000_20.l1).call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((C1283110jUj) aRunnableS28S0400000_20.l2).LIZ = e;
            }
            ((CountDownLatch) aRunnableS28S0400000_20.l3).countDown();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadUtils@eac9.invokeAtFrontUninterruptibly$9");
    }

    public static final void run$20(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.copyCurrentFrame$1");
        try {
            aRunnableS28S0400000_20.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.copyCurrentFrame$1");
    }

    public static final void run$21(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LyraxVideoRendererWrapper@5a1e.processTextureFrame$1");
        try {
            aRunnableS28S0400000_20.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LyraxVideoRendererWrapper@5a1e.processTextureFrame$1");
    }

    public static final void run$3(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamVideoCapture@20b1.catchVideoFrame$1");
        try {
            aRunnableS28S0400000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamVideoCapture@20b1.catchVideoFrame$1");
    }

    public static final void run$4(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LyraxProbeWrapper@46b1.initLyraxProbeAsync$1");
        try {
            ((C1282870jUL) aRunnableS28S0400000_20.l3).LIZIZ((C1282880jUM) aRunnableS28S0400000_20.l0, (C2250071D4z) aRunnableS28S0400000_20.l1, (InterfaceC1282910jUP) aRunnableS28S0400000_20.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LyraxProbeWrapper@46b1.initLyraxProbeAsync$1");
    }

    public static final void run$5(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.mixFrame$1");
        try {
            aRunnableS28S0400000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.mixFrame$1");
    }

    public static final void run$6(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        C1271550jC5 c1271550jC5 = (C1271550jC5) aRunnableS28S0400000_20.l0;
        Context context = (Context) aRunnableS28S0400000_20.l1;
        JSONObject jSONObject = (JSONObject) aRunnableS28S0400000_20.l2;
        InterfaceC1283880jVy interfaceC1283880jVy = (InterfaceC1283880jVy) aRunnableS28S0400000_20.l3;
        C1C7U.LIZ("BmfDenoiseNode@fe75.initVideoDenoiseFilter$1L");
        c1271550jC5.LJIIJ(context, jSONObject, interfaceC1283880jVy);
        C1C7U.LIZIZ("BmfDenoiseNode@fe75.initVideoDenoiseFilter$1L");
    }

    public static final void run$7(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        C1271540jC4 c1271540jC4 = (C1271540jC4) aRunnableS28S0400000_20.l0;
        Context context = (Context) aRunnableS28S0400000_20.l1;
        JSONObject jSONObject = (JSONObject) aRunnableS28S0400000_20.l2;
        InterfaceC1273880jFq interfaceC1273880jFq = (InterfaceC1273880jFq) aRunnableS28S0400000_20.l3;
        C1C7U.LIZ("BmfStreamHDNode@28e0.initVideoStreamHDFilter$1L");
        if (c1271540jC4.LLIZ == null) {
            c1271540jC4.LLIZ = new BmfVideoStreamHDFilterImpl(context, jSONObject, interfaceC1273880jFq, c1271540jC4.LLILZLL, c1271540jC4.LLILZIL, c1271540jC4.LLILLL);
        }
        C1C7U.LIZIZ("BmfStreamHDNode@28e0.initVideoStreamHDFilter$1L");
    }

    public static final void run$8(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS28S0400000_20.l0;
        Context context = (Context) aRunnableS28S0400000_20.l1;
        JSONObject jSONObject = (JSONObject) aRunnableS28S0400000_20.l2;
        InterfaceC1273880jFq interfaceC1273880jFq = (InterfaceC1273880jFq) aRunnableS28S0400000_20.l3;
        c1272090jCx.getClass();
        C1C7U.LIZ("FilterManager@d45d.initVideoStreamHDFilter$1L");
        c1272090jCx.LLJJIJI(context, jSONObject, interfaceC1273880jFq);
        C1C7U.LIZIZ("FilterManager@d45d.initVideoStreamHDFilter$1L");
    }

    public static final void run$9(ARunnableS28S0400000_20 aRunnableS28S0400000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.catchVideo$1");
        try {
            aRunnableS28S0400000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.catchVideo$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS28S0400000_20(android.os.Handler r2, X.C1301140jxo r3, X.C1301090jxj r4, X.C1301070jxh r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 13 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l3 = r4
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r5
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l3 = r4
            r0.l0 = r3
            r0.l1 = r5
            r0.l2 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS28S0400000_20.<init>(android.os.Handler, X.0jxo, X.0jxj, X.0jxh, int):void");
    }

    public ARunnableS28S0400000_20(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public ARunnableS28S0400000_20(C1273620jFQ c1273620jFQ, C1273630jFR c1273630jFR, C1272590jDl c1272590jDl, boolean z, C013C c013c, int i) {
        this.$t = i;
        this.l0 = c1273620jFQ;
        this.l1 = c1273630jFR;
        this.l2 = c1272590jDl;
        this.l3 = c013c;
    }

    public ARunnableS28S0400000_20(C1317680kOU c1317680kOU, C1317710kOX c1317710kOX, Context context, C1325710kbR c1325710kbR, C1317710kOX c1317710kOX2, int i) {
        this.$t = i;
        this.l3 = c1317680kOU;
        this.l0 = c1317710kOX;
        this.l1 = context;
        this.l2 = c1317710kOX2;
    }
}
