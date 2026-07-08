package Y;

import X.C0STY;
import X.C1266350j3h;
import X.C1266970j4h;
import X.C1269780j9E;
import X.C1272090jCx;
import X.C1272100jCy;
import X.C1272260jDE;
import X.C1274810jHL;
import X.C1274830jHN;
import X.C1274890jHT;
import X.C1277540jLk;
import X.C1289620jfE;
import X.C1299280juo;
import X.C1312420kG0;
import X.C1331900klQ;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1266360j3i;
import X.InterfaceC1299290jup;
import X.InterfaceC658750Psf;
import X.TextureViewSurfaceTextureListenerC1288630jdd;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.component.svg.UISvg;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import java.lang.ref.Reference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS5S1110000_20 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    public final void LIZ$2() {
        AVLog.debugTrace(this.s0, Boolean.valueOf(this.z2));
        C1274830jHN c1274830jHN = ((C1274810jHL) this.l1).LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this);
        sbLIZ.append(", interactId ");
        sbLIZ.append(this.s0);
        sbLIZ.append(", mute ");
        sbLIZ.append(this.z2);
        c1274830jHN.LJIIIIZZ("muteRemoteAudioStream", C2188811AlT.LIZIZ(sbLIZ));
        C1274890jHT c1274890jHT = ((C1274810jHL) this.l1).LJI;
        if (c1274890jHT != null) {
            if (this.z2) {
                c1274890jHT.unsubscribeStream(this.s0, MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
            } else {
                c1274890jHT.subscribeStream(this.s0, MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
            }
        }
        ((C1274810jHL) this.l1).LLIIJI(false, false);
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            if (((UISvg) this.l1).LLJ != null) {
                C1289620jfE.LIZJ(new ARunnableS89S0200000_20(this, new C1312420kG0(((UISvg) this.l1).LLJ.renderPicture(this.s0, new Rect(0, 0, ((UISvg) this.l1).getWidth(), ((UISvg) this.l1).getHeight()))), 32));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setDrawable: the content: ");
            sbLIZ.append(((UISvg) this.l1).LLILLJJLI);
            sbLIZ.append(", the error message: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ$1() {
        InterfaceC1299290jup interfaceC1299290jup;
        LynxTemplateRender lynxTemplateRender;
        if (((LynxView) this.l1).mLynxTemplateRender == null) {
            return;
        }
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("lifecycle", this.s0);
            TraceEvent.LIZJ("TriggerEmbeddedModeLifecycle", map);
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("method", this.s0);
        if (this.z2 && (lynxTemplateRender = ((LynxView) this.l1).mLynxTemplateRender) != null) {
            javaOnlyMap.put("args", lynxTemplateRender.LJJLJLI.LJIJ());
        }
        LynxTemplateRender lynxTemplateRender2 = ((LynxView) this.l1).mLynxTemplateRender;
        if (lynxTemplateRender2 != null && (interfaceC1299290jup = lynxTemplateRender2.LJIJJ) != null) {
            ((C1299280juo) interfaceC1299290jup).LIZ(lynxTemplateRender2.LJJ(), javaOnlyMap);
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII("TriggerEmbeddedModeLifecycle");
        }
    }

    public final void LIZ$3() {
        AVLog.ioi("LiveStream", "final dostop live stream!");
        C1266350j3h c1266350j3h = (C1266350j3h) this.l1;
        C1269780j9E c1269780j9E = c1266350j3h.LLLILZLLLI;
        if (c1269780j9E != null && c1269780j9E.LLJ.LIZIZ.LJJIJLIJ.LIZ) {
            C1266970j4h.LIZ.LIZJ = true;
        }
        c1266350j3h.LL();
        AVLog.ioi("LiveStream", "final dostop live stream end!");
        InterfaceC1266360j3i interfaceC1266360j3i = ((C1266350j3h) this.l1).LLIZ;
        if (interfaceC1266360j3i != null) {
            if (this.z2) {
                interfaceC1266360j3i.stopPush(true);
            } else {
                interfaceC1266360j3i.LJJIIZ(this.s0);
                interfaceC1266360j3i.enableCalculateAudioLoudness(false);
            }
        }
    }

    public static final void run$0(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        InterfaceC658750Psf interfaceC658750Psf;
        String str = aRunnableS5S1110000_20.s0;
        boolean z = aRunnableS5S1110000_20.z2;
        JSONObject jSONObject = (JSONObject) aRunnableS5S1110000_20.l1;
        C1C7U.LIZ("MonitorListenerManager@618b.onImageLoaded$1L");
        Reference reference = (Reference) ((HashMap) C1331900klQ.LIZ).get(str);
        if (reference != null && (interfaceC658750Psf = (InterfaceC658750Psf) reference.get()) != null) {
            interfaceC658750Psf.onImageLoaded(z, str, jSONObject);
            if (str != null) {
                C0STY.LIZ.execute(new ARunnableS12S1000000_20(str, 0));
            }
        }
        C1C7U.LIZIZ("MonitorListenerManager@618b.onImageLoaded$1L");
    }

    public static final void run$1(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS5S1110000_20.l1;
        String str = aRunnableS5S1110000_20.s0;
        boolean z = aRunnableS5S1110000_20.z2;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.startPush$1L");
        c1277540jLk.LJIILLIIL(new String[]{str}, z);
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.startPush$1L");
    }

    public static final void run$2(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        boolean zLIZ;
        C1C7U.LIZ("UISvg@3a70.setServalSVGDrawable$1");
        try {
            aRunnableS5S1110000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UISvg@3a70.setServalSVGDrawable$1");
    }

    public static final void run$3(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxView@80d.triggerEmbeddedModeLifecycle$1");
        try {
            aRunnableS5S1110000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxView@80d.triggerEmbeddedModeLifecycle$1");
    }

    public static final void run$4(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$1$1");
        try {
            ((TextureViewSurfaceTextureListenerC1288630jdd) aRunnableS5S1110000_20.l1).setJson(aRunnableS5S1110000_20.s0);
            ((TextureViewSurfaceTextureListenerC1288630jdd) aRunnableS5S1110000_20.l1).setLoop(aRunnableS5S1110000_20.z2);
            ((TextureViewSurfaceTextureListenerC1288630jdd) aRunnableS5S1110000_20.l1).stop();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$1$1");
    }

    public static final void run$5(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$2$1");
        try {
            ((TextureViewSurfaceTextureListenerC1288630jdd) aRunnableS5S1110000_20.l1).setJson(aRunnableS5S1110000_20.s0);
            ((TextureViewSurfaceTextureListenerC1288630jdd) aRunnableS5S1110000_20.l1).setLoop(aRunnableS5S1110000_20.z2);
            ((TextureViewSurfaceTextureListenerC1288630jdd) aRunnableS5S1110000_20.l1).stop();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$2$1");
    }

    public static final void run$6(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        boolean zLIZ;
        int iNotifyKeyboardHide;
        C1C7U.LIZ("FilterManager@d45d.notifyKeyboardHide$1");
        try {
            if (((C1272090jCx) aRunnableS5S1110000_20.l1).isValid() && (iNotifyKeyboardHide = ((C1272090jCx) aRunnableS5S1110000_20.l1).LLJJIJIIJIL.notifyKeyboardHide(aRunnableS5S1110000_20.z2)) != 0) {
                ((C1272090jCx) aRunnableS5S1110000_20.l1).LLJZIJLIL.onError(iNotifyKeyboardHide, aRunnableS5S1110000_20.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.notifyKeyboardHide$1");
    }

    public static final void run$7(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        C1272100jCy c1272100jCy;
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS5S1110000_20.l1;
        boolean z = aRunnableS5S1110000_20.z2;
        String str = aRunnableS5S1110000_20.s0;
        C1C7U.LIZ("EffectManager@a3e3.setEffect$1L");
        if (c1272260jDE.isValid()) {
            if (!c1272260jDE.LLILLL.LIZIZ.LJI && (c1272100jCy = c1272260jDE.LLIZ) != null) {
                c1272100jCy.LLJLLIL = z;
            }
            int effect = c1272260jDE.LLIZLLLIL.setEffect(str);
            if (effect != 0) {
                c1272260jDE.LLJILJIL.onError(effect, "setEffect");
            }
        }
        C1C7U.LIZIZ("EffectManager@a3e3.setEffect$1L");
    }

    public static final void run$8(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.muteRemoteAudioStream$1");
        try {
            aRunnableS5S1110000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.muteRemoteAudioStream$1");
    }

    public static final void run$9(ARunnableS5S1110000_20 aRunnableS5S1110000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.stop$1");
        try {
            aRunnableS5S1110000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.stop$1");
    }

    public ARunnableS5S1110000_20(C1272090jCx c1272090jCx, String str, int i) {
        this.$t = i;
        this.l1 = c1272090jCx;
        this.z2 = true;
        this.s0 = str;
    }

    public ARunnableS5S1110000_20(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}
