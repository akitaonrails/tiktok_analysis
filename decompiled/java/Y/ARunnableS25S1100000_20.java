package Y;

import X.AbstractC1298860ju8;
import X.C098200Yq;
import X.C1168400gVi;
import X.C1266350j3h;
import X.C1267280j5C;
import X.C1267870j69;
import X.C1270500jAO;
import X.C1271010jBD;
import X.C1272090jCx;
import X.C1272260jDE;
import X.C1273190jEj;
import X.C1274810jHL;
import X.C1274830jHN;
import X.C1274850jHP;
import X.C1274890jHT;
import X.C1274930jHX;
import X.C1277540jLk;
import X.C1277680jLy;
import X.C1279540jOy;
import X.C1285630jYn;
import X.C1285920jZG;
import X.C1286970jax;
import X.C1288370jdD;
import X.C1289620jfE;
import X.C1290750jh3;
import X.C1294030jmL;
import X.C1301430jyH;
import X.C1309670kBZ;
import X.C1312310kFp;
import X.C1312390kFx;
import X.C1321480kUc;
import X.C1321490kUd;
import X.C1321510kUf;
import X.C1323410kXj;
import X.C1324260kZ6;
import X.C1331900klQ;
import X.C1338670kwL;
import X.C14NO;
import X.C1507970pLP;
import X.C189200o6;
import X.C1909880zne;
import X.C1C7U;
import X.C21323718cd;
import X.C2188811AlT;
import X.C2257191DWj;
import X.C328930Cux;
import X.C742060T8y;
import X.C786410Ut5;
import X.EnumC1275210jHz;
import X.EnumC1276080jJO;
import X.EnumC1277920jMM;
import X.EnumC1325870kbh;
import X.InterfaceC1270540jAS;
import X.InterfaceC1274230jGP;
import X.InterfaceC1289180jeW;
import X.InterfaceC1301370jyB;
import X.InterfaceC442640HXi;
import X.InterfaceC658750Psf;
import X.RunnableC1323420kXk;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.lynx.tasm.service.ILynxTrailService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS25S1100000_20 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    public final void LIZ$6() {
        AVLog.debugTrace(this.s0);
        C1274830jHN c1274830jHN = ((C1274810jHL) this.l1).LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this);
        sbLIZ.append(", message ");
        sbLIZ.append(this.s0);
        c1274830jHN.LJIIIIZZ("sendRoomMessage", C2188811AlT.LIZIZ(sbLIZ));
        C1274890jHT c1274890jHT = ((C1274810jHL) this.l1).LJI;
        if (c1274890jHT != null) {
            c1274890jHT.sendRoomMessage(this.s0);
        }
    }

    public final void LIZ$7() {
        AVLog.debugTrace(this.s0);
        InterfaceC1274230jGP interfaceC1274230jGPLJLLI = ((C1274810jHL) this.l1).LJLLI();
        if (interfaceC1274230jGPLJLLI != null) {
            interfaceC1274230jGPLJLLI.LJIILIIL(false);
        }
        if (((C1274810jHL) this.l1).LJI.LJJIIZI()) {
            C1274890jHT c1274890jHT = ((C1274810jHL) this.l1).LJI;
            if ((c1274890jHT.LJIILLIIL() ? c1274890jHT.LJIJI.LJI.LJJIJ() : EnumC1276080jJO.None) == EnumC1276080jJO.Live) {
                AVLog.iow("ClientImpl", "updateRtcExtInfo in LIVE, return");
                return;
            }
        }
        C1274830jHN c1274830jHN = ((C1274810jHL) this.l1).LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this);
        sbLIZ.append(", config ");
        sbLIZ.append(this.s0);
        c1274830jHN.LJIIIIZZ("updateRtcExtInfo", C2188811AlT.LIZIZ(sbLIZ));
        ((C1274810jHL) this.l1).LLIIJLIL(this.s0);
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
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strLJFF = C1301430jyH.LJFF(this.s0);
        try {
            Bitmap bitmapLIZIZ = C1301430jyH.LIZIZ(this.s0);
            if (bitmapLIZIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Decode base64 image success with image: ");
                sbLIZ.append(strLJFF);
                C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                ((InterfaceC1301370jyB) this.l1).LIZ(bitmapLIZIZ);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Empty base64 image: ");
            sbLIZ2.append(strLJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", strLIZIZ);
            ((InterfaceC1301370jyB) this.l1).reject(strLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Decode base64 image: ");
            sbLIZ3.append(strLJFF);
            sbLIZ3.append(" with error: ");
            sbLIZ3.append(e.getMessage());
            ((InterfaceC1301370jyB) this.l1).reject(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final void LIZ$1() {
        try {
            C2257191DWj c2257191DWjLIZJ = C2257191DWj.LIZJ(this.s0);
            C14NO c14no = (C14NO) this.l1;
            c14no.getClass();
            C328930Cux.LIZ(new ARunnableS89S0200000_20(c14no, c2257191DWjLIZJ, 2));
        } catch (C1324260kZ6 e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("myna  svg parse error, ");
            sbLIZ.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ExecutorService executorService = C1909880zne.LIZ;
            C1909880zne.LIZJ(((C14NO) this.l1).LIZ.LLILZLL, "svg_error", strLIZIZ, 24);
        }
    }

    public final void LIZ$10() {
        Integer num;
        Integer num2;
        RunnableC1323420kXk runnableC1323420kXk;
        if (((C1323410kXj) this.l1).LJLI) {
            return;
        }
        if (((C1323410kXj) this.l1).LJJLIIIJLLLLLLLZ && (num2 = ((C1323410kXj) this.l1).LJJLIIIJL.lynxImageUpdate) != null && num2.intValue() == 0) {
            ((C1323410kXj) this.l1).LJJLIIIJLLLLLLLZ = false;
            C1323410kXj c1323410kXj = (C1323410kXj) this.l1;
            if (!c1323410kXj.LJJLIIJ && (runnableC1323420kXk = c1323410kXj.LJJLJ) != null) {
                runnableC1323420kXk.run();
            }
            c1323410kXj.LJJLJ = null;
        }
        if (!((C1323410kXj) this.l1).LJJLIIJ || (num = ((C1323410kXj) this.l1).LJJLIIIJL.lynxImageClearRun) == null || num.intValue() != 0 || Intrinsics.LJFF(this.s0, "onPageResumed")) {
            return;
        }
        C1323410kXj c1323410kXj2 = (C1323410kXj) this.l1;
        C786410Ut5.LJJZZIII(c1323410kXj2.LJJLL, c1323410kXj2.LJJLJLI);
    }

    public final void LIZ$2() {
        if (((C1312310kFp) this.l1).LJIJJLI) {
            ((C1312310kFp) this.l1).LJIILL = false;
            return;
        }
        C1312310kFp c1312310kFp = (C1312310kFp) this.l1;
        String str = this.s0;
        c1312310kFp.getClass();
        String str2 = new String(Base64.decode(str.substring(26).getBytes(StandardCharsets.UTF_8), 0), StandardCharsets.UTF_8);
        if (TextUtils.isEmpty(str2)) {
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(c1312310kFp, 206));
        } else {
            c1312310kFp.LJIIL = str2;
            c1312310kFp.LJIIIIZZ();
        }
    }

    public final void LIZ$3() {
        if (((C1309670kBZ) this.l1).LJIJJLI.get(this.s0) == null) {
            return;
        }
        if (((C1309670kBZ) this.l1).LJIJJLI.get(this.s0).LIZ.get() != null) {
            ((C1309670kBZ) this.l1).LJIJJLI.remove(this.s0);
        }
        if (((C1309670kBZ) this.l1).LJIJJLI.isEmpty()) {
            C1309670kBZ c1309670kBZ = (C1309670kBZ) this.l1;
            c1309670kBZ.getClass();
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1309670kBZ, 61));
        }
    }

    public final void LIZ$4() {
        try {
            super/*com.ss.ttlivestreamer.core.utils.NativeHandlerThread*/.setThreadName(this.s0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Set name failed.current:");
            sbLIZ.append(((SafeHandlerThread) this.l1).getName());
            sbLIZ.append(",new:");
            sbLIZ.append(this.s0);
            AVLog.logKibana(6, "SafeHandlerThread", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    public final void LIZ$5() {
        Object c098200Yq;
        C1321480kUc c1321480kUc = (C1321480kUc) this.l1;
        try {
            c098200Yq = c1321480kUc.LJLLILLLL(this.s0, c1321480kUc.LLZZZZ, c1321480kUc.a, c1321480kUc.LLZZJLIL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1321480kUc c1321480kUc2 = (C1321480kUc) this.l1;
        String str = this.s0;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            Drawable drawable = (Drawable) c098200Yq;
            if (Intrinsics.LJFF(c1321480kUc2.LLZZZIL, str)) {
                C742060T8y.LIZ(new ARunnableS89S0200000_20(drawable, c1321480kUc2, 93));
            }
        }
        C1321480kUc c1321480kUc3 = (C1321480kUc) this.l1;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c1321480kUc3.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SVG render failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1168400gVi.LIZIZ(new C1321490kUd(strLIZIZ));
            new C1338670kwL(EnumC1325870kbh.RENDER_ERROR, 5005, strLIZIZ, null, 24).LIZJ(C21323718cd.LIZ(c1321480kUc3.LL));
            C742060T8y.LIZ(new ARunnableS89S0200000_20((Object) null, c1321480kUc3, 93));
        }
    }

    public final void LIZ$8() {
        int i;
        int i2;
        C1274850jHP c1274850jHP;
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.s0), "PushBase");
            if (!jSONObject.isNull("mixOnClient") && (c1274850jHP = ((C1274810jHL) this.l1).LIZLLL) != null) {
                c1274850jHP.LJIIJJI = JSONObjectProtectorUtils.getJSONObject(jSONObject, "mixOnClient");
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update Sdk Params:");
        sbLIZ.append(this.s0);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update Sdk Params:");
        sbLIZ2.append(this.s0);
        AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ2));
        C1274930jHX c1274930jHXLIZ = ((C1274810jHL) this.l1).LJIILJJIL.LIZ();
        if (!((C1274810jHL) this.l1).LJIILJJIL.LJJJJJ) {
            try {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.s0), "PushBase");
                if (!jSONObject2.isNull("width") && !jSONObject2.isNull("height")) {
                    int i3 = JSONObjectProtectorUtils.getInt(jSONObject2, "width");
                    int i4 = JSONObjectProtectorUtils.getInt(jSONObject2, "height");
                    if (((C1274810jHL) this.l1).LJIILJJIL.LJJIFFI != EnumC1275210jHz.RTC_CLIENT_MIX && (c1274930jHXLIZ.LIZ != i3 || c1274930jHXLIZ.LIZIZ != i4)) {
                        c1274930jHXLIZ.LJIIJ(i3, i4);
                    }
                }
                if (!jSONObject2.isNull("defaultBitrate") && (i2 = JSONObjectProtectorUtils.getInt(jSONObject2, "defaultBitrate")) > 10000) {
                    c1274930jHXLIZ.LJI(i2);
                }
                if (!jSONObject2.isNull("fps") && (i = JSONObjectProtectorUtils.getInt(jSONObject2, "fps")) > 0 && i <= 60 && c1274930jHXLIZ.LJ != i) {
                    c1274930jHXLIZ.LJII(i);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        ((C1274810jHL) this.l1).LLIIJI(true, false);
    }

    public final void LIZ$9() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_key", "create_interact_client_fail");
            jSONObject.put("message", this.s0);
            C1271010jBD c1271010jBD = ((C1274850jHP) this.l1).LJIILL;
            if (c1271010jBD != null) {
                c1271010jBD.LIZ("live_client_monitor_log", jSONObject);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public static final void run$0(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxKryptonLoaderServiceImpl@6a62.handleBase64Image$1");
        try {
            aRunnableS25S1100000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxKryptonLoaderServiceImpl@6a62.handleBase64Image$1");
    }

    public static final void run$1(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        String str = aRunnableS25S1100000_20.s0;
        InterfaceC658750Psf interfaceC658750Psf = (InterfaceC658750Psf) aRunnableS25S1100000_20.l1;
        C1C7U.LIZ("MonitorListenerManager@618b.registerMonitorListener$1L");
        ((HashMap) C1331900klQ.LIZ).put(str, new WeakReference(interfaceC658750Psf));
        C1C7U.LIZIZ("MonitorListenerManager@618b.registerMonitorListener$1L");
    }

    public static final void run$10(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        LynxBackgroundRuntime lynxBackgroundRuntime = (LynxBackgroundRuntime) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        lynxBackgroundRuntime.getClass();
        C1C7U.LIZ("LynxBackgroundRuntime@265f.onEvaluateJavaScriptEnd$1L");
        Iterator<AbstractC1298860ju8> it2 = lynxBackgroundRuntime.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(str);
        }
        C1C7U.LIZIZ("LynxBackgroundRuntime@265f.onEvaluateJavaScriptEnd$1L");
    }

    public static final void run$11(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SafeHandlerThread@c81f.setThreadName$1");
        try {
            aRunnableS25S1100000_20.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SafeHandlerThread@c81f.setThreadName$1");
    }

    public static final void run$12(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TTLHAdaptive@ddd0.sendStrategyEvent$1");
        try {
            ((C1267280j5C) aRunnableS25S1100000_20.l1).LIZIZ(aRunnableS25S1100000_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLHAdaptive@ddd0.sendStrategyEvent$1");
    }

    public static final void run$13(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TTLHAdaptive@ddd0.sendStrategyEvent$2");
        try {
            ((C1267280j5C) aRunnableS25S1100000_20.l1).LIZIZ(aRunnableS25S1100000_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLHAdaptive@ddd0.sendStrategyEvent$2");
    }

    public static final void run$14(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("MynaSVGElementViewManager@4fec.scheduleRenderSvg$1");
        try {
            aRunnableS25S1100000_20.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaSVGElementViewManager@4fec.scheduleRenderSvg$1");
    }

    public static final void run$15(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.pauseEffect$1");
        try {
            if (((C1272090jCx) aRunnableS25S1100000_20.l1).isValid()) {
                int iPauseEffect = ((C1272090jCx) aRunnableS25S1100000_20.l1).LLJJIJIIJIL.pauseEffect();
                C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS25S1100000_20.l1;
                c1272090jCx.LLJLILLLLZIIL = true;
                if (iPauseEffect != 0) {
                    c1272090jCx.LLJZIJLIL.onError(iPauseEffect, aRunnableS25S1100000_20.s0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.pauseEffect$1");
    }

    public static final void run$16(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.resumeEffect$1");
        try {
            if (((C1272090jCx) aRunnableS25S1100000_20.l1).isValid()) {
                int iResumeEffect = ((C1272090jCx) aRunnableS25S1100000_20.l1).LLJJIJIIJIL.resumeEffect();
                C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS25S1100000_20.l1;
                c1272090jCx.LLJLILLLLZIIL = false;
                if (iResumeEffect != 0) {
                    c1272090jCx.LLJZIJLIL.onError(iResumeEffect, aRunnableS25S1100000_20.s0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.resumeEffect$1");
    }

    public static final void run$17(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.setLicenseToEffect$2");
        try {
            if (((C1272090jCx) aRunnableS25S1100000_20.l1).isValid()) {
                ((C1272090jCx) aRunnableS25S1100000_20.l1).LLJJIJIIJIL.insertEffectLicense(aRunnableS25S1100000_20.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.setLicenseToEffect$2");
    }

    public static final void run$18(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        C1C7U.LIZ("EffectManager@a3e3.setLicenseToEffect$1L");
        if (c1272260jDE.isValid()) {
            c1272260jDE.LLIZLLLIL.insertEffectLicense(str);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.setLicenseToEffect$1L");
    }

    public static final void run$19(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        C1C7U.LIZ("LyraxPlayerImpl@d373.setLiveUniqueId$1L");
        c1277680jLy.LJIIL = str;
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LJIIIIZZ = str;
        }
        C1C7U.LIZIZ("LyraxPlayerImpl@d373.setLiveUniqueId$1L");
    }

    public static final void run$2(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("MynaLottieElementViewManager@499.applySourceWithResolver$handled$1$2");
        try {
            ((C1321510kUf) aRunnableS25S1100000_20.l1).getView().setSource(aRunnableS25S1100000_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaLottieElementViewManager@499.applySourceWithResolver$handled$1$2");
    }

    public static final void run$20(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        C1C7U.LIZ("LyraxPlayerImpl@d373.setBizSessionId$1L");
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LJIIJ = str;
        }
        C1C7U.LIZIZ("LyraxPlayerImpl@d373.setBizSessionId$1L");
    }

    public static final void run$21(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.sendRoomMessage$1");
        try {
            aRunnableS25S1100000_20.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.sendRoomMessage$1");
    }

    public static final void run$22(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.updateRtcExtInfo$1");
        try {
            aRunnableS25S1100000_20.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.updateRtcExtInfo$1");
    }

    public static final void run$23(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.updateSdkParams$1");
        try {
            aRunnableS25S1100000_20.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.updateSdkParams$1");
    }

    public static final void run$24(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractEngineImpl@b747.reportCreateClientFailed$1");
        try {
            aRunnableS25S1100000_20.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractEngineImpl@b747.reportCreateClientFailed$1");
    }

    public static final void run$25(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ECPreloadTaskDispatcherV2@b531.cancelTask$1");
        try {
            C1507970pLP.LIZJ(aRunnableS25S1100000_20.s0, ((C1507970pLP) aRunnableS25S1100000_20.l1).LJ);
            C1507970pLP.LIZJ(aRunnableS25S1100000_20.s0, ((C1507970pLP) aRunnableS25S1100000_20.l1).LJFF);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECPreloadTaskDispatcherV2@b531.cancelTask$1");
    }

    public static final void run$26(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("UISvg@cb14.setContent$1");
        try {
            C2257191DWj c2257191DWjLIZJ = C2257191DWj.LIZJ(aRunnableS25S1100000_20.s0);
            C1312390kFx c1312390kFx = (C1312390kFx) aRunnableS25S1100000_20.l1;
            c1312390kFx.getClass();
            C1290750jh3.LIZLLL(new ARunnableS89S0200000_20(c1312390kFx, c2257191DWjLIZJ, 194));
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("UISvg@cb14.setContent$1");
    }

    public static final void run$27(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("EcomLoadRetreatLynxImageManager@8e4f.onPageRetreatAwake$1");
        try {
            aRunnableS25S1100000_20.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcomLoadRetreatLynxImageManager@8e4f.onPageRetreatAwake$1");
    }

    public static final void run$28(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        C1273190jEj c1273190jEj = (C1273190jEj) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        C1C7U.LIZ("InteractMixManager@3e6d.removeInteractTexture$1L");
        VideoFrame videoFrame = c1273190jEj.LLJ.get(str);
        if (videoFrame != null) {
            videoFrame.release();
        }
        c1273190jEj.LLJ.remove(str);
        C1C7U.LIZIZ("InteractMixManager@3e6d.removeInteractTexture$1L");
    }

    public static final void run$29(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoPlayerImpl@6079.reportError$1");
        try {
            C1285630jYn c1285630jYn = (C1285630jYn) aRunnableS25S1100000_20.l1;
            String str = aRunnableS25S1100000_20.s0;
            c1285630jYn.LLILZLL++;
            c1285630jYn.LLIZLLLIL = false;
            if (c1285630jYn.LLILZIL) {
                c1285630jYn.LIZIZ(str);
            } else {
                c1285630jYn.LLILZIL = true;
                c1285630jYn.LIZLLL(str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoPlayerImpl@6079.reportError$1");
    }

    public static final void run$3(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("NimbleSvgViewManage@7fe7.setContent$1");
        try {
            aRunnableS25S1100000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NimbleSvgViewManage@7fe7.setContent$1");
    }

    public static final void run$30(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.startRecorder$1");
        try {
            C1266350j3h c1266350j3h = (C1266350j3h) aRunnableS25S1100000_20.l1;
            MediaEncodeStream mediaEncodeStream = c1266350j3h.LLJIJIL;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.startRecord(aRunnableS25S1100000_20.s0);
            } else {
                C1270500jAO c1270500jAO = c1266350j3h.LLJLLL;
                if (c1270500jAO != null) {
                    InterfaceC1270540jAS interfaceC1270540jAS = c1270500jAO.LL;
                    if (interfaceC1270540jAS instanceof C1267870j69) {
                        ((C1267870j69) interfaceC1270540jAS).LIZJ(11, 0, 0L, "EncodeStream is null, maybe publish no start.");
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.startRecorder$1");
    }

    public static final void run$31(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        C1C7U.LIZ("LightenHelper@aa44.getFirstAvailableDownloadedImageUrlAsync$1L$2L");
        interfaceC442640HXi.onResult(str);
        C1C7U.LIZIZ("LightenHelper@aa44.getFirstAvailableDownloadedImageUrlAsync$1L$2L");
    }

    public static final void run$32(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        String strLIZ;
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) aRunnableS25S1100000_20.l1;
        final String str = aRunnableS25S1100000_20.s0;
        int i = LynxAlphaVideo.LLJJIJI;
        C1C7U.LIZ("LynxAlphaVideo@e3ce.setSrc$1L");
        String strStringValueForTrailKey = null;
        lynxAlphaVideo.LLILLL = null;
        lynxAlphaVideo.LLJI = "";
        if (lynxAlphaVideo.LLIZ) {
            strLIZ = C1294030jmL.LIZ(lynxAlphaVideo.mContext, str, false);
        } else {
            strLIZ = str;
        }
        C1289620jfE.LIZJ(new ARunnableS25S1100000_20(lynxAlphaVideo, URLDecoder.decode(strLIZ, "UTF-8"), 33));
        if (str != null && str.length() != 0 && lynxAlphaVideo.mContext != null && !lynxAlphaVideo.LLJJIII) {
            ILynxTrailService iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class);
            if (iLynxTrailService != null) {
                strStringValueForTrailKey = iLynxTrailService.stringValueForTrailKey("enable_motion_ui_report");
            }
            if (Intrinsics.LJFF(strStringValueForTrailKey, "true")) {
                lynxAlphaVideo.LLJJIII = true;
                LynxEventReporter.onEvent("lynxsdk_motion_ui_event", lynxAlphaVideo.mContext.LLJLILLLLZIIL, new InterfaceC1289180jeW() { // from class: X.0jg3
                    @Override // X.InterfaceC1289180jeW
                    public final Map build() {
                        String str2 = str;
                        int i2 = LynxAlphaVideo.LLJJIJI;
                        C13DA c13da = new C13DA();
                        c13da.put("component_name", "x-alpha-video");
                        c13da.put("src", str2);
                        return c13da.build();
                    }
                });
            }
        }
        C1C7U.LIZIZ("LynxAlphaVideo@e3ce.setSrc$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$33(Y.ARunnableS25S1100000_20 r6) {
        /*
            java.lang.Object r5 = r6.l1
            com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo r5 = (com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo) r5
            java.lang.String r4 = r6.s0
            int r0 = com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.LLJJIJI
            java.lang.String r3 = "LynxAlphaVideo@e3ce.setSrc$lambda-5$1L"
            X.C1C7U.LIZ(r3)
            r5.LLJI = r4
            X.07xp<X.0jgB> r2 = r5.LLIZLLLIL
            if (r2 == 0) goto L24
            X.0jgA r1 = new X.0jgA
            r1.<init>(r5, r4)
            X.0jex r0 = new X.0jex
            r0.<init>(r5, r4)
            r2.LIZ(r4, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L27
        L24:
            r5.LJJIJIL(r4)
        L27:
            X.C1C7U.LIZIZ(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS25S1100000_20.run$33(Y.ARunnableS25S1100000_20):void");
    }

    public static final void run$4(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.bindToRoom$1L");
        if (c1277540jLk.LIZ != null) {
            c1277540jLk.LIZ.bindToRoom(str);
        }
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.bindToRoom$1L");
    }

    public static final void run$5(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.unbindFromRoom$1L");
        if (c1277540jLk.LIZ != null) {
            c1277540jLk.LIZ.unbindFromRoom(str);
        }
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.unbindFromRoom$1L");
    }

    public static final void run$6(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS25S1100000_20.l1;
        String str = aRunnableS25S1100000_20.s0;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.switchSceneToLinkMic$1L");
        if (c1277540jLk.LIZ != null) {
            c1277540jLk.LJIJ = str;
            c1277540jLk.LJII = EnumC1276080jJO.LinkMic;
            if (c1277540jLk.LJIIJJI()) {
                c1277540jLk.LIZ.switchScene(EnumC1277920jMM.VeLivePushSceneLinkMic);
            } else {
                c1277540jLk.LIZ.bindToRoom(str);
                c1277540jLk.LIZ.switchScene(EnumC1277920jMM.VeLivePushSceneLinkMic);
            }
        }
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.switchSceneToLinkMic$1L");
    }

    public static final void run$7(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("RenderProcessUnresponsiveDetector@65c8.scheduleJsInjection$2$1");
        try {
            ((C1286970jax) aRunnableS25S1100000_20.l1).LJ.set(CastIntegerProtector.parseInt(aRunnableS25S1100000_20.s0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RenderProcessUnresponsiveDetector@65c8.scheduleJsInjection$2$1");
    }

    public static final void run$8(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SVGRenderer@6976.startRender$1");
        try {
            aRunnableS25S1100000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SVGRenderer@6976.startRender$1");
    }

    public static final void run$9(ARunnableS25S1100000_20 aRunnableS25S1100000_20) {
        boolean zLIZ;
        C1C7U.LIZ("UIExposure@d6e7.removeUIFromExposedMap$1");
        try {
            aRunnableS25S1100000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UIExposure@d6e7.removeUIFromExposedMap$1");
    }

    public ARunnableS25S1100000_20(C1272090jCx c1272090jCx, int i) {
        this.$t = i;
        this.l1 = c1272090jCx;
        this.s0 = "live";
    }

    public ARunnableS25S1100000_20(C1272260jDE c1272260jDE, int i) {
        this.$t = i;
        this.l1 = c1272260jDE;
        this.s0 = "live";
    }

    public ARunnableS25S1100000_20(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
