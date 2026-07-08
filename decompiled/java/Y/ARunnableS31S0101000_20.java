package Y;

import X.C0UHF;
import X.C1266350j3h;
import X.C1266420j3o;
import X.C1267280j5C;
import X.C1267940j6G;
import X.C1268550j7F;
import X.C1268560j7G;
import X.C1268630j7N;
import X.C1269160j8E;
import X.C1269500j8m;
import X.C1270170j9r;
import X.C1270180j9s;
import X.C1270350jA9;
import X.C1270500jAO;
import X.C1270610jAZ;
import X.C1270620jAa;
import X.C1271450jBv;
import X.C1271490jBz;
import X.C1272090jCx;
import X.C1272260jDE;
import X.C1272370jDP;
import X.C1274040jG6;
import X.C1274080jGA;
import X.C1274810jHL;
import X.C1274830jHN;
import X.C1274890jHT;
import X.C1277680jLy;
import X.C1279510jOv;
import X.C1279540jOy;
import X.C1279640jP8;
import X.C1289800jfW;
import X.C1298220jt6;
import X.C1298340jtI;
import X.C1318590kPx;
import X.C1321080kTy;
import X.C1321400kUU;
import X.C1338500kw4;
import X.C13LQ;
import X.C1C7U;
import X.C2188811AlT;
import X.C2348609Ie;
import X.C786410Ut5;
import X.EnumC1279500jOu;
import X.EnumC1279610jP5;
import X.InterfaceC1268540j7E;
import X.InterfaceC1270560jAU;
import X.InterfaceC1272120jD0;
import X.InterfaceC1272550jDh;
import X.InterfaceC1279380jOi;
import X.InterfaceC1312730kGV;
import X.InterfaceC634840OvC;
import X.RunnableC1271930jCh;
import X.RunnableC1271940jCi;
import X.ViewOnLayoutChangeListenerC1322990kX3;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.hardware.display.VirtualDisplay;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import com.google.gson.Gson;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bytertc.engine.type.AudioSceneType;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS31S0101000_20 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void run$13(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        LynxEventReporter.lambda$updateGenericInfo$3(aRunnableS31S0101000_20.i1, (Map) aRunnableS31S0101000_20.l0);
    }

    public static final void run$14(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        LynxEventReporter.lambda$putExtraParams$5(aRunnableS31S0101000_20.i1, (Map) aRunnableS31S0101000_20.l0);
    }

    public final void LIZ$4() {
        if (2 == this.i1) {
            boolean bool = ((C1270500jAO) this.l0).LLJJJJJIL.getBool("video_enable_accelera");
            String string = ((C1270500jAO) this.l0).LLJJJJJIL.getString("video_type");
            if (bool || !string.equalsIgnoreCase("video/bytevc0")) {
                ((C1270500jAO) this.l0).LLJJJJJIL.setString("video_type", "video/bytevc0");
                ((C1270500jAO) this.l0).LLJJJJJIL.setBool("video_enable_accelera", false);
                C1270500jAO c1270500jAO = (C1270500jAO) this.l0;
                MediaEncodeStream mediaEncodeStream = c1270500jAO.LLILLL;
                if (mediaEncodeStream != null) {
                    mediaEncodeStream.setParameter(c1270500jAO.LLJJJJJIL);
                }
                AVLog.d("RecorderManager", "Update recorder encoder to soft.");
                return;
            }
            ((C1270500jAO) this.l0).LLJJIII.set(3);
            InterfaceC1270560jAU interfaceC1270560jAU = ((C1270500jAO) this.l0).LLJJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Not found video encoder (");
            sbLIZ.append(string);
            sbLIZ.append("/");
            sbLIZ.append("w");
            sbLIZ.append(")");
            interfaceC1270560jAU.LIZIZ(-1, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        }
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
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
            case 43:
                run$43(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0UHF c0uhf = ((C1272370jDP) this.l0).LL.LLLLL;
        if (c0uhf != null) {
            c0uhf.onFaceDetectResultCallback(this.i1);
        }
        Iterator<WeakReference<InterfaceC1272550jDh>> it2 = ((C1272370jDP) this.l0).LL.LLLLJI.iterator();
        while (it2.hasNext()) {
            InterfaceC1272550jDh interfaceC1272550jDh = it2.next().get();
            if (interfaceC1272550jDh != null) {
                interfaceC1272550jDh.onFaceDetectResultCallback(this.i1);
            }
        }
    }

    public final void LIZ$1() {
        for (C1298220jt6 c1298220jt6 : ((C1298340jtI) this.l0).LJIJJLI) {
            if (c1298220jt6.LIZ == this.i1) {
                ((C1298340jtI) this.l0).LJIJJLI.remove(c1298220jt6);
                C1298340jtI c1298340jtI = (C1298340jtI) this.l0;
                if (c1298340jtI.LJJI && c1298340jtI.LJIJJLI.isEmpty()) {
                    ((C1298340jtI) this.l0).LIZJ();
                    return;
                }
                return;
            }
        }
    }

    public final void LIZ$2() {
        AudioSceneType audioSceneType;
        int i = this.i1;
        if (i == 0) {
            audioSceneType = AudioSceneType.AUDIO_SCENE_DEFAULT;
        } else if (i == 1) {
            audioSceneType = AudioSceneType.AUDIO_SCENE_CHATROOM;
        } else if (i == 2) {
            audioSceneType = AudioSceneType.AUDIO_SCENE_HIGH_QUALITY_CHATROOM;
        } else if (i == 3) {
            audioSceneType = AudioSceneType.AUDIO_SCENE_LOW_LATENCY;
        } else if (i != 4) {
            return;
        } else {
            audioSceneType = AudioSceneType.AUDIO_SCENE_KARAOKE;
        }
        C1274890jHT c1274890jHT = ((C1274810jHL) this.l0).LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setAudioScene(audioSceneType);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setAudioScene  sceneType:");
            sbLIZ.append(audioSceneType);
            sbLIZ.append(" ret:");
            sbLIZ.append(0);
            AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ$3() {
        C1274830jHN c1274830jHN = ((C1274810jHL) this.l0).LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("volume:");
        sbLIZ.append(this.i1);
        sbLIZ.append(" rtcEngineWrapper:");
        sbLIZ.append(((C1274810jHL) this.l0).LJI);
        c1274830jHN.LJIIIIZZ("setRemoteAudioPlaybackVolume", C2188811AlT.LIZIZ(sbLIZ));
        C1274890jHT c1274890jHT = ((C1274810jHL) this.l0).LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setRemoteRoomAudioPlaybackVolume(this.i1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS31S0101000_20.LIZ$5():void");
    }

    public final void LIZ$6() {
        if (!((C1268560j7G) this.l0).LLJILLL) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Try open status exception");
            C1274080jGA.LIZ.LIZ("LiveStreamAudioCapture.onTryOpenLater", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        ((C1268560j7G) this.l0).LLJIJIL(this.i1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Try open AudioCapture done and source ");
        sbLIZ.append(((C1268560j7G) this.l0).LLILZ);
        sbLIZ.append(" VS ");
        sbLIZ.append(this.i1);
        sbLIZ.append(" mode ");
        sbLIZ.append(((C1268560j7G) this.l0).getMode());
        AVLog.iod("LiveStreamAudioCapture", C2188811AlT.LIZIZ(sbLIZ));
        ((C1268560j7G) this.l0).LLJILLL = false;
    }

    public final void LIZ$7() {
        LiveStreamVideoCapture liveStreamVideoCapture;
        int i;
        LiveStreamVideoCapture liveStreamVideoCapture2 = (LiveStreamVideoCapture) this.l0;
        if (liveStreamVideoCapture2.LLJJL instanceof C1270610jAZ) {
            int i2 = liveStreamVideoCapture2.LLJLILLLLZIIL.getInt("videoCaptureMinFps", -1);
            if (i2 > 0 && i2 <= 30 && (i = (liveStreamVideoCapture = (LiveStreamVideoCapture) this.l0).LLJJ) > 0 && i <= 30 && i2 <= i) {
                ((C1270610jAZ) liveStreamVideoCapture.LLJJL).LLJL(i2, this.i1);
                return;
            }
            LiveStreamVideoCapture liveStreamVideoCapture3 = (LiveStreamVideoCapture) this.l0;
            C1270610jAZ c1270610jAZ = (C1270610jAZ) liveStreamVideoCapture3.LLJJL;
            int i3 = liveStreamVideoCapture3.LLJJ;
            c1270610jAZ.LLJL(i3 < 30 ? i3 : 7, i3);
        }
    }

    public static final void run$0(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreImpl@e164.setPublishMixBgColor$1");
        try {
            C1266350j3h c1266350j3h = ((C1268630j7N) aRunnableS31S0101000_20.l0).LLJI;
            if (c1266350j3h != null) {
                c1266350j3h.LJJLIIIJL(aRunnableS31S0101000_20.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreImpl@e164.setPublishMixBgColor$1");
    }

    public static final void run$1(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("PlatformRendererContext@8b81.destroyTextBundle$1");
        try {
            InterfaceC1312730kGV interfaceC1312730kGV = (InterfaceC1312730kGV) ((PlatformRendererContext) aRunnableS31S0101000_20.l0).LJII.remove(Integer.valueOf(aRunnableS31S0101000_20.i1));
            if (interfaceC1312730kGV != null) {
                interfaceC1312730kGV.destroy();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlatformRendererContext@8b81.destroyTextBundle$1");
    }

    public static final void run$10(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("EffectManager@a3e3.faceDetectListenerProxy$lambda$2$1L");
        C0UHF c0uhf = c1272260jDE.LLJJI;
        if (c0uhf != null) {
            c0uhf.onFaceDetectResultCallback(i);
        }
        Iterator<WeakReference<InterfaceC1272550jDh>> it2 = c1272260jDE.LLJJIII.iterator();
        while (it2.hasNext()) {
            InterfaceC1272550jDh interfaceC1272550jDh = it2.next().get();
            if (interfaceC1272550jDh != null) {
                interfaceC1272550jDh.onFaceDetectResultCallback(i);
            } else {
                it2.remove();
            }
        }
        C1C7U.LIZIZ("EffectManager@a3e3.faceDetectListenerProxy$lambda$2$1L");
    }

    public static final void run$11(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        EffectWrapper effectWrapper;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("EffectManager@a3e3.setClientState$1L");
        if (c1272260jDE.isValid() && (effectWrapper = c1272260jDE.LLIZLLLIL) != null && c1272260jDE.LLJJ != i && effectWrapper.setClientState(i) == 0) {
            c1272260jDE.LLJJ = i;
        }
        C1C7U.LIZIZ("EffectManager@a3e3.setClientState$1L");
    }

    public static final void run$12(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("HardwareGyroscope@f564.init$1");
        try {
            if (!C1289800jfW.LLILZIL.isEmpty()) {
                InterfaceC634840OvC interfaceC634840OvC = (InterfaceC634840OvC) aRunnableS31S0101000_20.l0;
                Gson gson = C2348609Ie.LIZ;
                interfaceC634840OvC.sendEvent("onGyroscopeChange", C2348609Ie.LIZLLL(C1289800jfW.LLILZIL));
            }
            BPEAHandler bPEAHandler = C1289800jfW.LLILLL;
            if (bPEAHandler != null) {
                C786410Ut5.LJLIIL(aRunnableS31S0101000_20.i1, bPEAHandler, aRunnableS31S0101000_20);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HardwareGyroscope@f564.init$1");
    }

    public static final void run$15(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxIntersectionObserverManager@1299.removeIntersectionObserver$1");
        try {
            aRunnableS31S0101000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxIntersectionObserverManager@1299.removeIntersectionObserver$1");
    }

    public static final void run$16(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("LyraxPlayerImpl$registerListener$1@37cf.onVideoDecoderError$1L");
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LIZIZ(EnumC1279610jP5.LyraxPlayerPullLocation_Decode, i);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl$registerListener$1@37cf.onVideoDecoderError$1L");
    }

    public static final void run$17(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onRenderError$1L");
        InterfaceC1279380jOi interfaceC1279380jOi = c1277680jLy.LJJI;
        if (interfaceC1279380jOi != null) {
            ((C1279640jP8) interfaceC1279380jOi).LIZIZ(new C1279510jOv(EnumC1279500jOu.RENDER_ERROR, i, 4));
        }
        C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
        if (c1279540jOy != null) {
            c1279540jOy.LIZIZ(EnumC1279610jP5.LyraxPlayerPullLocation_Render, i);
        }
        C1C7U.LIZIZ("LyraxPlayerImpl$setupLyraxSurfaceRender$1@b0d9.onRenderError$1L");
    }

    public static final void run$18(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        RunnableC1271940jCi runnableC1271940jCi = (RunnableC1271940jCi) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        runnableC1271940jCi.getClass();
        C1C7U.LIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$2L");
        C1270350jA9 c1270350jA9 = runnableC1271940jCi.LLJILJIL;
        Handler handler = c1270350jA9.LLJILJILJ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(i, runnableC1271940jCi, 19));
        } else {
            C786410Ut5.LJJZZIII(c1270350jA9.LLJILJIL, new ARunnableS120S0100000_20(runnableC1271940jCi, 239));
        }
        C1C7U.LIZIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$2L");
    }

    public static final void run$19(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        RunnableC1271940jCi runnableC1271940jCi = (RunnableC1271940jCi) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        runnableC1271940jCi.getClass();
        C1C7U.LIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$2L$1L");
        runnableC1271940jCi.LLJILJIL.LLJJ(i);
        C1C7U.LIZIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$2L$1L");
    }

    public static final void run$2(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("PdpBodyPowerList@e14.smoothScrollToPosition$1");
        try {
            C1338500kw4 c1338500kw4 = (C1338500kw4) aRunnableS31S0101000_20.l0;
            c1338500kw4.setCurrentSubRecyclerView(c1338500kw4.getNestedRc());
            ((C1338500kw4) aRunnableS31S0101000_20.l0).LJJII();
            super/*androidx.recyclerview.widget.RecyclerView*/.smoothScrollToPosition(aRunnableS31S0101000_20.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpBodyPowerList@e14.smoothScrollToPosition$1");
    }

    public static final void run$20(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        RunnableC1271930jCh runnableC1271930jCh = (RunnableC1271930jCh) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        runnableC1271930jCh.getClass();
        C1C7U.LIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$1L");
        C1270350jA9 c1270350jA9 = runnableC1271930jCh.LLJILJILJ;
        Handler handler = c1270350jA9.LLJILJILJ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(i, runnableC1271930jCh, 21));
        } else {
            C786410Ut5.LJJZZIII(c1270350jA9.LLJILJIL, new ARunnableS120S0100000_20(runnableC1271930jCh, 240));
        }
        C1C7U.LIZIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$1L");
    }

    public static final void run$21(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        RunnableC1271930jCh runnableC1271930jCh = (RunnableC1271930jCh) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        runnableC1271930jCh.getClass();
        C1C7U.LIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$1L$1L");
        runnableC1271930jCh.LLJILJILJ.LLJJ(i);
        C1C7U.LIZIZ("ExternalVideoCapturer@358d.pushVideoFrame$1$1L$1L");
    }

    public static final void run$22(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1270170j9r c1270170j9r = (C1270170j9r) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        c1270170j9r.getClass();
        C1C7U.LIZ("ScreenVideoCapturer@130c.changeScreenCaptureOrientation$1L");
        c1270170j9r.LLJJJIL = i;
        int i2 = c1270170j9r.LLJ;
        int i3 = c1270170j9r.LLJI;
        if (i % 180 != 0) {
            i3 = i2;
            i2 = i3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeScreenCaptureOrientation before this.width:");
        sbLIZ.append(c1270170j9r.LLJ);
        sbLIZ.append(" this height:");
        sbLIZ.append(c1270170j9r.LLJI);
        sbLIZ.append(" after, resizeWidth:");
        sbLIZ.append(i2);
        sbLIZ.append(" resizeHeight:");
        sbLIZ.append(i3);
        AVLog.ioi("ScreenVideoCapturer", C2188811AlT.LIZIZ(sbLIZ));
        c1270170j9r.LLJILJIL.getSurfaceTexture().setDefaultBufferSize(i2, i3);
        c1270170j9r.LLJIJIL.resize(i2, i3, 400);
        C1C7U.LIZIZ("ScreenVideoCapturer@130c.changeScreenCaptureOrientation$1L");
    }

    public static final void run$23(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SurfaceWrapper@1798.release$1");
        try {
            GLES20.glDeleteTextures(1, new int[]{aRunnableS31S0101000_20.i1}, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release glDeleteTextures ");
            sbLIZ.append(aRunnableS31S0101000_20.i1);
            AVLog.logKibana(4, "SurfaceWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SurfaceWrapper@1798.release$1");
    }

    public static final void run$24(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("ECMynaAsyncImageElementView@131.setVisibility$1");
        try {
            Drawable imageDrawable = ((ViewOnLayoutChangeListenerC1322990kX3) aRunnableS31S0101000_20.l0).getImageDrawable();
            if (imageDrawable != null) {
                if (aRunnableS31S0101000_20.i1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                imageDrawable.setVisible(z, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECMynaAsyncImageElementView@131.setVisibility$1");
    }

    public static final void run$25(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.setAudioScene$1");
        try {
            aRunnableS31S0101000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.setAudioScene$1");
    }

    public static final void run$26(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.setRemoteRoomAudioPlaybackVolume$1");
        try {
            aRunnableS31S0101000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.setRemoteRoomAudioPlaybackVolume$1");
    }

    public static final void run$27(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("RecorderManager@dfee.onMediaEncodeStreamEvent$1");
        try {
            aRunnableS31S0101000_20.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecorderManager@dfee.onMediaEncodeStreamEvent$1");
    }

    public static final void run$28(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoPlayerImpl@6079.updateSurface$1");
        try {
            aRunnableS31S0101000_20.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoPlayerImpl@6079.updateSurface$1");
    }

    public static final void run$29(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("MynaAsyncImageElementView@fc00.setVisibility$1");
        try {
            Drawable drawable = ((C1321080kTy) aRunnableS31S0101000_20.l0).getDrawable();
            if (drawable != null) {
                if (aRunnableS31S0101000_20.i1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setVisible(z, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaAsyncImageElementView@fc00.setVisibility$1");
    }

    public static final void run$3(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TTLHAdaptive@ddd0.start$4");
        try {
            ((C1267280j5C) aRunnableS31S0101000_20.l0).LIZ(aRunnableS31S0101000_20.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLHAdaptive@ddd0.start$4");
    }

    public static final void run$30(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.onCalculatePcmPowerEvent$1");
        try {
            InterfaceC1268540j7E interfaceC1268540j7E = ((C1266350j3h) aRunnableS31S0101000_20.l0).LLJJIJIIJIL;
            if (interfaceC1268540j7E != null) {
                interfaceC1268540j7E.LIZ(aRunnableS31S0101000_20.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.onCalculatePcmPowerEvent$1");
    }

    public static final void run$31(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.updateSdkParams$1");
        try {
            C1269160j8E c1269160j8E = ((C1266350j3h) aRunnableS31S0101000_20.l0).LLILZLL;
            c1269160j8E.LIZ.mPushBase.LJJJJJ(aRunnableS31S0101000_20.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.updateSdkParams$1");
    }

    public static final void run$32(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1266350j3h c1266350j3h = (C1266350j3h) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        c1266350j3h.getClass();
        C1C7U.LIZ("LiveStream@24e7.switchVideoCapture$1L");
        C1266420j3o c1266420j3o = c1266350j3h.LLJJJIL;
        if (c1266420j3o != null) {
            c1266420j3o.LJ(c1266350j3h.LLILZLL.LJJII(), i);
        }
        c1266350j3h.U = -1;
        c1266350j3h.LLILZLL.LJJIIZ().LIZ = i;
        C1C7U.LIZIZ("LiveStream@24e7.switchVideoCapture$1L");
    }

    public static final void run$33(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean z;
        C1266350j3h c1266350j3h = (C1266350j3h) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        c1266350j3h.getClass();
        C1C7U.LIZ("LiveStream@24e7.switchVideoCapture$2L");
        C1269160j8E c1269160j8E = c1266350j3h.LLILZLL;
        if (c1266350j3h.LLJZ.get() != 7 && c1269160j8E != null) {
            if (i == 5) {
                z = true;
            } else {
                z = false;
            }
            c1266350j3h.LLLLIILL = z;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Call switchVideoCapture. from ");
            sbLIZ.append(c1266350j3h.LLILZLL.LJJII());
            sbLIZ.append(", to ");
            sbLIZ.append(i);
            AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
            c1269160j8E.LJJIIZ().LIZ = i;
            LiveStreamVideoCapture liveStreamVideoCapture = c1266350j3h.LLJJIJIL;
            if (liveStreamVideoCapture != null) {
                if (liveStreamVideoCapture.LLJJIII != 2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Switch video capture to ");
                    sbLIZ2.append(i);
                    AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ2));
                    LiveStreamVideoCapture liveStreamVideoCapture2 = c1266350j3h.LLJJIJIL;
                    if (liveStreamVideoCapture2 != null) {
                        liveStreamVideoCapture2.LLJJJIL(i, c1269160j8E.LJJ);
                    }
                } else {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("mVideoCapturer status error.");
                    C1274080jGA.LIZ.LIZ("LiveStream.switchVideoCapture", androidRuntimeException);
                    if (!C1274040jG6.LIZ()) {
                        AVLog.logKibana(6, "LiveStream-VideoCapture", "mVideoCapturer status error.", null);
                    } else {
                        throw androidRuntimeException;
                    }
                }
            } else {
                AVLog.logKibana(6, "LiveStream-VideoCapture", "Maybe video capture already to stopped.", null);
            }
            C1C7U.LIZIZ("LiveStream@24e7.switchVideoCapture$2L");
            return;
        }
        C1C7U.LIZIZ("LiveStream@24e7.switchVideoCapture$2L");
    }

    public static final void run$34(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("MynaFlattenImageView@e577.setVisibility$1");
        try {
            Drawable drawable = ((C1321400kUU) aRunnableS31S0101000_20.l0).getDrawable();
            if (drawable != null) {
                if (aRunnableS31S0101000_20.i1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setVisible(z, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaFlattenImageView@e577.setVisibility$1");
    }

    public static final void run$35(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1270180j9s c1270180j9s = (C1270180j9s) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("ScreenVideoNode@5892.changeScreenCaptureOrientation$1L");
        c1270180j9s.LLJILLL = i;
        int i2 = c1270180j9s.LLJJ;
        int i3 = c1270180j9s.LLJJI;
        if (i % 180 != 0) {
            i3 = i2;
            i2 = i3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeScreenCaptureOrientation before this.width:");
        sbLIZ.append(c1270180j9s.LLJJ);
        sbLIZ.append(" this height:");
        sbLIZ.append(c1270180j9s.LLJJI);
        sbLIZ.append(" after, resizeWidth:");
        sbLIZ.append(i2);
        sbLIZ.append(" resizeHeight:");
        sbLIZ.append(i3);
        AVLog.ioi("ScreenVideoNode", C2188811AlT.LIZIZ(sbLIZ));
        SurfaceTexture surfaceTexture = c1270180j9s.LLIZ;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
        VirtualDisplay virtualDisplay = c1270180j9s.LLJJJIL;
        if (virtualDisplay != null) {
            virtualDisplay.resize(i2, i3, 400);
        }
        C1C7U.LIZIZ("ScreenVideoNode@5892.changeScreenCaptureOrientation$1L");
    }

    public static final void run$36(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean z;
        C1270620jAa c1270620jAa = (C1270620jAa) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("CameraCaptureManager@b43e.setCameraCaptureDevice$1L");
        C1267940j6G c1267940j6G = c1270620jAa.LLJI;
        if (c1267940j6G.LJ != i) {
            z = true;
        } else {
            z = false;
        }
        if (i != 1) {
            if (i == 2) {
                c1267940j6G.LJ = 0;
            }
        } else {
            c1267940j6G.LJ = 1;
        }
        int cameraState = c1270620jAa.LLJJ.getCameraState(true);
        if (z && C13LQ.LJLIIL(new Integer[]{1, 2, 3}).contains(Integer.valueOf(cameraState))) {
            C1269500j8m.LJI(c1270620jAa.LLJJ, c1270620jAa.LLJI.LJ);
        }
        C1C7U.LIZIZ("CameraCaptureManager@b43e.setCameraCaptureDevice$1L");
    }

    public static final void run$37(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamAudioCapture@15cc.switchAudioMode$1");
        try {
            ((C1268560j7G) aRunnableS31S0101000_20.l0).setMode(aRunnableS31S0101000_20.i1);
            C1268560j7G c1268560j7G = (C1268560j7G) aRunnableS31S0101000_20.l0;
            c1268560j7G.LLJIJIL(c1268560j7G.LL());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamAudioCapture@15cc.switchAudioMode$1");
    }

    public static final void run$38(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamAudioCapture@15cc.onTryOpenLater$1");
        try {
            aRunnableS31S0101000_20.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamAudioCapture@15cc.onTryOpenLater$1");
    }

    public static final void run$39(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("LiveStreamAudioCaptureFromADM@ad4b.switchAudioMode$1");
        try {
            if (!((C1268550j7F) aRunnableS31S0101000_20.l0).LLJJIII) {
                if (7 == aRunnableS31S0101000_20.i1) {
                    z = true;
                } else {
                    z = false;
                }
                String str = C1268550j7F.LLJJIJIIJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("switch to VoIP ");
                sbLIZ.append(z);
                AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamAudioCaptureFromADM@ad4b.switchAudioMode$1");
    }

    public static final void run$4(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TTLHAdaptive@ddd0.scheduleStrategyEventHandler$1");
        try {
            ((C1267280j5C) aRunnableS31S0101000_20.l0).LIZ(aRunnableS31S0101000_20.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLHAdaptive@ddd0.scheduleStrategyEventHandler$1");
    }

    public static final void run$40(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1270620jAa c1270620jAa = (C1270620jAa) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("CameraCaptureManager@b43e.setCameraCaptureRotation$1L");
        c1270620jAa.LLJJ.setDeviceRotation(i);
        C1C7U.LIZIZ("CameraCaptureManager@b43e.setCameraCaptureRotation$1L");
    }

    public static final void run$41(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1270620jAa c1270620jAa = (C1270620jAa) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("CameraCaptureManager@b43e.onCaptureStarted$1L");
        AVLog.logKibana(4, "CameraCaptureManager", "onCaptureStarted: thread is not LiveCoreVideoCaptureThread, switch to LiveCoreVideoCaptureThread", null);
        c1270620jAa.LLIIL(i, 0);
        C1C7U.LIZIZ("CameraCaptureManager@b43e.onCaptureStarted$1L");
    }

    public static final void run$42(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamVideoCapture@20b1.updateCaptureVideoResolution$2");
        try {
            aRunnableS31S0101000_20.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamVideoCapture@20b1.updateCaptureVideoResolution$2");
    }

    public static final void run$43(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        int i = aRunnableS31S0101000_20.i1;
        C1270180j9s c1270180j9s = (C1270180j9s) aRunnableS31S0101000_20.l0;
        C1C7U.LIZ("ScreenVideoNode@5892.changeScreenCaptureFps$1L");
        int i2 = LSPassThroughRecordSizeConfig.DEFAULT / i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeScreenCaptureFps before this.width:");
        sbLIZ.append(c1270180j9s.LLJJ);
        sbLIZ.append(" this height:");
        sbLIZ.append(c1270180j9s.LLJJI);
        sbLIZ.append(", this.fps: ");
        sbLIZ.append(c1270180j9s.LLJJIII);
        sbLIZ.append(" frameInterval: ");
        sbLIZ.append(c1270180j9s.LLJILJILJ);
        sbLIZ.append(" after, changeFps:");
        sbLIZ.append(i);
        sbLIZ.append(", changeFrameInterval: ");
        sbLIZ.append(i2);
        AVLog.logKibana(4, "ScreenVideoNode", C2188811AlT.LIZIZ(sbLIZ), null);
        c1270180j9s.LLJJIII = i;
        c1270180j9s.LLJILJILJ = i2;
        C1C7U.LIZIZ("ScreenVideoNode@5892.changeScreenCaptureFps$1L");
    }

    public static final void run$5(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1318590kPx c1318590kPx = (C1318590kPx) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("LynxInputScrollHelper@703d.applyScrollTo$1L");
        c1318590kPx.LJII(0, (-i) + c1318590kPx.getScrollY(), true);
        C1C7U.LIZIZ("LynxInputScrollHelper@703d.applyScrollTo$1L");
    }

    public static final void run$6(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        markdownShadowNode.getClass();
        C1C7U.LIZ("MarkdownShadowNode@bccc.resumeAnimation$1L");
        synchronized (markdownShadowNode) {
            try {
                markdownShadowNode.LJJIZ = false;
                if (i >= 0) {
                    markdownShadowNode.LJJIJIL = i;
                    if (markdownShadowNode.LJJIJIIJIL == 2) {
                        int iLJJIIZ = markdownShadowNode.LJJIIZ(i);
                        markdownShadowNode.LJJJIL = iLJJIIZ;
                        markdownShadowNode.LJJIJIL = markdownShadowNode.LJJIIZI(iLJJIIZ);
                    }
                }
                markdownShadowNode.LJJLIIIJLJLI = false;
                markdownShadowNode.LJJLIIIJLLLLLLLZ = false;
                markdownShadowNode.LJJLIIJ = 0L;
                markdownShadowNode.LJJLIL = 0;
                markdownShadowNode.LJIILLIIL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resumeAnimation applied: ");
                sbLIZ.append(markdownShadowNode.LJJIII());
                LynxLog.i("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("MarkdownShadowNode@bccc.resumeAnimation$1L");
    }

    public static final void run$7(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.<field>$1$onFaceDetectResultCallback$1");
        try {
            aRunnableS31S0101000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.<field>$1$onFaceDetectResultCallback$1");
    }

    public static final void run$8(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        C1271490jBz c1271490jBz = (C1271490jBz) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        C1C7U.LIZ("OriginFrameCatchNode@4b44.stopCatchTask$1L");
        C1271450jBv c1271450jBv = c1271490jBz.LLILLL;
        if (c1271450jBv != null) {
            c1271450jBv.LJIIIIZZ(i);
            c1271490jBz.LLILLL = null;
        }
        c1271490jBz.LLILZ = 0;
        C1C7U.LIZIZ("OriginFrameCatchNode@4b44.stopCatchTask$1L");
    }

    public static final void run$9(ARunnableS31S0101000_20 aRunnableS31S0101000_20) {
        InterfaceC1272120jD0 interfaceC1272120jD0;
        C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS31S0101000_20.l0;
        int i = aRunnableS31S0101000_20.i1;
        c1272090jCx.getClass();
        C1C7U.LIZ("FilterManager@d45d.setClientState$1L");
        if (c1272090jCx.isValid() && (interfaceC1272120jD0 = c1272090jCx.LLJJIJIIJIL) != null && c1272090jCx.LLZZZZ != i && interfaceC1272120jD0.setClientState(i) == 0) {
            c1272090jCx.LLZZZZ = i;
        }
        C1C7U.LIZIZ("FilterManager@d45d.setClientState$1L");
    }

    public ARunnableS31S0101000_20(C1270620jAa c1270620jAa, int i) {
        this.$t = i;
        this.l0 = c1270620jAa;
        this.i1 = -1;
    }

    public ARunnableS31S0101000_20(C1266350j3h c1266350j3h, int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case 30:
            case 31:
                this.l0 = c1266350j3h;
                this.i1 = i;
                break;
            default:
                this.l0 = c1266350j3h;
                this.i1 = i;
                break;
        }
    }

    public ARunnableS31S0101000_20(int i, C1270180j9s c1270180j9s, int i2) {
        this.$t = i2;
        if (35 - i2 != 0) {
            this.i1 = i;
            this.l0 = c1270180j9s;
        } else {
            this.l0 = c1270180j9s;
            this.i1 = i;
        }
    }

    public ARunnableS31S0101000_20(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public ARunnableS31S0101000_20(C1271490jBz c1271490jBz, int i, String str, int i2) {
        this.$t = i2;
        this.l0 = c1271490jBz;
        this.i1 = i;
    }
}
