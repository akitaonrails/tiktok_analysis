package Y;

import X.C09JN;
import X.C1152850g6d;
import X.C11JF;
import X.C11PQ;
import X.C1283340jV6;
import X.C1286510jaD;
import X.C1304660k3U;
import X.C151O;
import X.C15B8;
import X.C1628270sTR;
import X.C1C7U;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1309510kBJ;
import X.InterfaceC1283360jV8;
import X.InterfaceC769940UIe;
import X.InterfaceC772190UQv;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class AfS189S0100000_20 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
        }
    }

    public AfS189S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        EnumC1309510kBJ enumC1309510kBJ = (EnumC1309510kBJ) afS189S0100000_20.l0;
        enumC1309510kBJ.getClass();
        C1C7U.LIZ("LiveCameraResManager@5b6f.loadResources$1L");
        enumC1309510kBJ.isLoadedRes.setValue(Boolean.TRUE);
        C1C7U.LIZIZ("LiveCameraResManager@5b6f.loadResources$1L");
    }

    public static final void accept$1(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        EnumC1309510kBJ enumC1309510kBJ = (EnumC1309510kBJ) afS189S0100000_20.l0;
        Boolean bool = (Boolean) obj;
        enumC1309510kBJ.getClass();
        C1C7U.LIZ("LiveCameraResManager@5b6f.loadResources$3L");
        if (bool.booleanValue()) {
            enumC1309510kBJ.LLILLL = false;
            InterfaceC772190UQv.d3.LJFF("0.0.21");
            enumC1309510kBJ.isLoadedRes.setValue(Boolean.TRUE);
            C20441214yg.LIZIZ("LiveCameraResManager", "all resources loaded");
        } else {
            enumC1309510kBJ.LLILLL = false;
            enumC1309510kBJ.isLoadedRes.setValue(Boolean.FALSE);
        }
        if (!bool.booleanValue()) {
            ((HashMap) enumC1309510kBJ.LL).put("error_code", 10001);
            ((HashMap) enumC1309510kBJ.LL).put("error_msg", "load_res_error");
        }
        C1CC2.LJII(!bool.booleanValue() ? 1 : 0, "ttlive_start_live_resource_load_all", enumC1309510kBJ.LL);
        ((HashMap) enumC1309510kBJ.LL).clear();
        C1C7U.LIZIZ("LiveCameraResManager@5b6f.loadResources$3L");
    }

    public static final void accept$10(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        C1C7U.LIZ("GameKeyTimeInferAudio@ae81.sendHighLightRequestNew$dispose$1");
        C20441214yg.LJIIIZ("Sonava#GameKeyTimeInferAudio", "audio sendHighLightRequestNew. succeeded");
        ((C151O) afS189S0100000_20.l0).LIZIZ(0, "high_light_request");
        C1C7U.LIZIZ("GameKeyTimeInferAudio@ae81.sendHighLightRequestNew$dispose$1");
    }

    public static final void accept$11(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        C1C7U.LIZ("GameKeyTimeInferAudio@ae81.sendHighLightRequestNew$dispose$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio sendHighLightRequestNew throwable, message=");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("Sonava#GameKeyTimeInferAudio", C2188811AlT.LIZIZ(sbLIZ));
        ((C151O) afS189S0100000_20.l0).LIZIZ(1, "high_light_request");
        C1C7U.LIZIZ("GameKeyTimeInferAudio@ae81.sendHighLightRequestNew$dispose$2");
    }

    public static final void accept$2(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        EnumC1309510kBJ enumC1309510kBJ = (EnumC1309510kBJ) afS189S0100000_20.l0;
        Throwable th = (Throwable) obj;
        enumC1309510kBJ.getClass();
        C1C7U.LIZ("LiveCameraResManager@5b6f.loadResources$4L");
        enumC1309510kBJ.isLoadedRes.setValue(Boolean.FALSE);
        enumC1309510kBJ.LLILLL = false;
        enumC1309510kBJ.LLILLJJLI = th.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error occurred when load resources: ");
        sbLIZ.append(th.toString());
        C20441214yg.LJ("LiveCameraResManager", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LJ("LiveCameraResManager", th.toString());
        ((HashMap) enumC1309510kBJ.LL).put("load_function_error", th.toString());
        ((HashMap) enumC1309510kBJ.LL).put("error_code", 10002);
        ((HashMap) enumC1309510kBJ.LL).put("error_msg", "load_function_error");
        C1CC2.LJII(1, "ttlive_start_live_resource_load_all", enumC1309510kBJ.LL);
        ((HashMap) enumC1309510kBJ.LL).clear();
        C1C7U.LIZIZ("LiveCameraResManager@5b6f.loadResources$4L");
    }

    public static final void accept$3(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        C1C7U.LIZ("SlideSlipEffectGroupComponent@6915.observeCameraLayoutState$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("allowShowingByLayout: after debounce: ");
        sbLIZ.append(obj);
        C1628270sTR.LIZIZ("SlideSlipStickerComponent", C2188811AlT.LIZIZ(sbLIZ));
        ((C11PQ) afS189S0100000_20.l0).onNext(obj);
        C1C7U.LIZIZ("SlideSlipEffectGroupComponent@6915.observeCameraLayoutState$3");
    }

    public static final void accept$4(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        Handler handler = (Handler) afS189S0100000_20.l0;
        C1C7U.LIZ("RoomManager@6c79.getLiveBubble$2L");
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(43);
            messageObtainMessage.obj = obj;
            C786410Ut5.LJLJJL(handler, messageObtainMessage);
        }
        C1C7U.LIZIZ("RoomManager@6c79.getLiveBubble$2L");
    }

    public static final void accept$5(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        Handler handler = (Handler) afS189S0100000_20.l0;
        C1C7U.LIZ("RoomManager@6c79.pressLiveBubble$2L");
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(44);
            messageObtainMessage.obj = obj;
            C786410Ut5.LJLJJL(handler, messageObtainMessage);
        }
        C1C7U.LIZIZ("RoomManager@6c79.pressLiveBubble$2L");
    }

    public static final void accept$6(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        C1C7U.LIZ("GuestShowdownAnimationCalculator@dc77.newTimer$2");
        Throwable th = (Throwable) obj;
        C15B8 c15b8 = (C15B8) afS189S0100000_20.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error=");
        sbLIZ.append(th);
        C15B8.LJIIL(c15b8, C2188811AlT.LIZIZ(sbLIZ));
        C1304660k3U.LIZ.LIZ(110001, String.valueOf(th.getMessage()), null);
        ((C15B8) afS189S0100000_20.l0).LJFF();
        ((C15B8) afS189S0100000_20.l0).LJIILIIL();
        C1C7U.LIZIZ("GuestShowdownAnimationCalculator@dc77.newTimer$2");
    }

    public static final void accept$7(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        C1C7U.LIZ("CaptureImageUploadController@8178.resume$2");
        C1286510jaD c1286510jaD = (C1286510jaD) afS189S0100000_20.l0;
        InterfaceC769940UIe interfaceC769940UIe = c1286510jaD.LJII;
        if (interfaceC769940UIe != null) {
            C20441214yg.LIZIZ("CaptureImageUploadController", "capture start");
            Bundle bundle = new Bundle();
            long jCurrentTimeMillis = System.currentTimeMillis();
            bundle.putInt("mode", 1);
            bundle.putBoolean("outputPixelBufferOrigin", true);
            bundle.putBoolean("outputPixelBufferWithEffect", false);
            bundle.putInt("frameCount", 1);
            bundle.putBoolean("keepVideoCatcherAlive", true);
            interfaceC769940UIe.m3(bundle, new C1152850g6d(c1286510jaD, jCurrentTimeMillis));
        }
        C1C7U.LIZIZ("CaptureImageUploadController@8178.resume$2");
    }

    public static final void accept$8(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        C11JF c11jf;
        C1C7U.LIZ("CaptureImageUploadController@8178.stop$1");
        C20441214yg.LIZIZ("CaptureImageUploadController", "stop");
        C1286510jaD c1286510jaD = (C1286510jaD) afS189S0100000_20.l0;
        c1286510jaD.LJFF = false;
        c1286510jaD.LJIIIZ = true;
        C11JF c11jf2 = c1286510jaD.LIZJ;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = ((C1286510jaD) afS189S0100000_20.l0).LIZJ) != null) {
            c11jf.dispose();
        }
        C1286510jaD c1286510jaD2 = (C1286510jaD) afS189S0100000_20.l0;
        synchronized (c1286510jaD2) {
            try {
                c1286510jaD2.LJ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ((C1286510jaD) afS189S0100000_20.l0).LJII = null;
        C1C7U.LIZIZ("CaptureImageUploadController@8178.stop$1");
    }

    public static final void accept$9(AfS189S0100000_20 afS189S0100000_20, Object obj) {
        C1C7U.LIZ("LiveRecordController@ca2e.startRecord$3");
        Throwable th = (Throwable) obj;
        InterfaceC1283360jV8 interfaceC1283360jV8 = ((C1283340jV6) afS189S0100000_20.l0).LIZLLL;
        if (interfaceC1283360jV8 != null) {
            interfaceC1283360jV8.LIZIZ(-100, new Exception(th.getMessage()));
        }
        C1C7U.LIZIZ("LiveRecordController@ca2e.startRecord$3");
    }
}
