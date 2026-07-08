package Y;

import X.C098200Yq;
import X.C1267940j6G;
import X.C1269940j9U;
import X.C1270620jAa;
import X.C1270690jAh;
import X.C1274330jGZ;
import X.C1274340jGa;
import X.C1274830jHN;
import X.C1277550jLl;
import X.C1277680jLy;
import X.C1278260jMu;
import X.C1278740jNg;
import X.C1279540jOy;
import X.C1290750jh3;
import X.C1291190jhl;
import X.C1317100kNY;
import X.C1317650kOR;
import X.C1317750kOb;
import X.C1317760kOc;
import X.C1317790kOf;
import X.C1317810kOh;
import X.C1317860kOm;
import X.C1521660phU;
import X.C1698860uJI;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1279390jOj;
import X.InterfaceC1272490jDb;
import X.InterfaceC1317630kOP;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.sdui.serializedData.common.PollingResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.performance.PerformanceController;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.audio.LyraxAudioStallDetectConfig;
import com.ss.lyrax.engine.LyraxAttributeKey;
import com.ss.lyrax.utils.LyraxValue;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS17S0200100_20 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    public static final void run$8(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        PerformanceController.LJIIIIZZ((PerformanceController) aRunnableS17S0200100_20.l0, aRunnableS17S0200100_20.j2, (Map) aRunnableS17S0200100_20.l1);
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l1;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j2, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j2, "rtc_interact_connection_time");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from_live_broadcast_to_interact", ((long[]) this.l0)[0]).put("from_interact_to_live_broadcast", ((long[]) this.l0)[1]);
            jSONObjectLIZIZ.put("message", C786410Ut5.J3(jSONObject));
            if (((C1274830jHN) this.l1).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_interact_connection_time");
            }
            ((C1274830jHN) this.l1).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public static final void run$0(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS17S0200100_20.l0;
        long j = aRunnableS17S0200100_20.j2;
        JSONObject jSONObject = (JSONObject) aRunnableS17S0200100_20.l1;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.reportPushStreamResult$1L");
        JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(jSONObject, j);
        if (jSONObjectLIZIZ != null) {
            try {
                jSONObjectLIZIZ.put("event_key", "push_stream_result");
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.reportPushStreamResult$1L");
    }

    public static final void run$1(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxBlankDetectorDefault@b215.detect$2");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1521660phU c1521660phULIZIZ = ((C1317790kOf) aRunnableS17S0200100_20.l0).LIZIZ();
            ((InterfaceC1317630kOP) aRunnableS17S0200100_20.l1).LIZ(new C1317650kOR(aRunnableS17S0200100_20.j2, System.currentTimeMillis() - jCurrentTimeMillis, c1521660phULIZIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxBlankDetectorDefault@b215.detect$2");
    }

    public static final void run$10(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        C1270620jAa c1270620jAa = (C1270620jAa) aRunnableS17S0200100_20.l0;
        C1267940j6G c1267940j6G = (C1267940j6G) aRunnableS17S0200100_20.l1;
        long j = aRunnableS17S0200100_20.j2;
        C1C7U.LIZ("CameraCaptureManager@b43e.updateParams$1L");
        int cameraState = c1270620jAa.LLJJ.getCameraState(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateParams TECameraCapture: ");
        sbLIZ.append(c1270620jAa.LLJJ);
        sbLIZ.append(" updateParams, params = ");
        sbLIZ.append(c1267940j6G);
        sbLIZ.append(", CameraCaptureManager: ");
        sbLIZ.append(c1270620jAa);
        sbLIZ.append('}');
        C1270690jAh.LIZJ(1, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ));
        if (j != c1270620jAa.LLJIJIL.get()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateParams: skip stale params = ");
            sbLIZ2.append(c1267940j6G);
            sbLIZ2.append(" version = ");
            sbLIZ2.append(j);
            sbLIZ2.append(" latest = ");
            sbLIZ2.append(c1270620jAa.LLJIJIL.get());
            C1270690jAh.LIZJ(1, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            c1270620jAa.LLJ.LJIIIZ = c1267940j6G.LIZLLL;
            if (Intrinsics.LJFF(c1270620jAa.LLJI, c1267940j6G)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateParams: params is same, no need to update, params = ");
                sbLIZ3.append(c1267940j6G);
                C1270690jAh.LIZJ(1, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ3));
            } else {
                c1270620jAa.LLJI = c1267940j6G;
                if (cameraState == 3) {
                    c1270620jAa.LJIIJJI("param_changed");
                    if (j != c1270620jAa.LLJIJIL.get()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("updateParams: skip start preview for stale params = ");
                        sbLIZ4.append(c1267940j6G);
                        sbLIZ4.append(" version = ");
                        sbLIZ4.append(j);
                        sbLIZ4.append(" latest = ");
                        sbLIZ4.append(c1270620jAa.LLJIJIL.get());
                        C1270690jAh.LIZJ(1, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ4));
                    } else {
                        c1270620jAa.LJIIJ("param_changed");
                    }
                }
            }
        }
        C1C7U.LIZIZ("CameraCaptureManager@b43e.updateParams$1L");
    }

    public static final void run$2(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setShutterTime$1");
        try {
            ((b0) aRunnableS17S0200100_20.l1).setShutterTime((TECameraCapture) aRunnableS17S0200100_20.l0, aRunnableS17S0200100_20.j2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setShutterTime$1");
    }

    public static final void run$3(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        Object c098200Yq;
        String str;
        byte[] bArr;
        Integer numValueOf;
        C1317760kOc c1317760kOc = (C1317760kOc) aRunnableS17S0200100_20.l0;
        C1317860kOm c1317860kOm = (C1317860kOm) aRunnableS17S0200100_20.l1;
        long j = aRunnableS17S0200100_20.j2;
        C1C7U.LIZ("SDUINetworkHandler@66f6.handleRenderMsg$1L");
        try {
            c1317760kOc.LJIIJ = true;
            C1317100kNY c1317100kNY = c1317760kOc.LIZ.LLJJJJ;
            c1317100kNY.LJIIJJI = c1317100kNY.LIZ.LLJJ.LJFF;
            if (!c1317100kNY.LJ) {
                c1317100kNY.LJ = true;
                c1317100kNY.LIZIZ(-1, -1, "first_response");
            }
            if (C1317810kOh.LIZIZ > 0) {
                C1290750jh3.LIZIZ(c1317760kOc.LJIILJJIL);
            }
            if (C1317810kOh.LIZJ > 0) {
                C1290750jh3.LIZIZ(c1317760kOc.LJIILL);
            }
            if (C1317810kOh.LIZJ > 0) {
                C1290750jh3.LIZIZ(c1317760kOc.LJIILLIIL);
            }
            c098200Yq = null;
            numValueOf = null;
            c098200Yq = null;
            if (c1317860kOm == null) {
                str = null;
            } else {
                str = c1317860kOm.LIZIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (Intrinsics.LJFF(str, "string")) {
            c1317760kOc.LIZIZ.LIZJ(new C1291190jhl(-4, new String(c1317860kOm.LIZ, Charsets.UTF_8)));
            C1C7U.LIZIZ("SDUINetworkHandler@66f6.handleRenderMsg$1L");
        }
        System.currentTimeMillis();
        if (c1317860kOm != null && (bArr = c1317860kOm.LIZ) != null) {
            PollingResponse pollingResponseLJFF = C1317750kOb.LJFF(C1317760kOc.LJII(c1317860kOm.LIZJ, bArr));
            System.currentTimeMillis();
            C1317100kNY c1317100kNY2 = c1317760kOc.LIZ.LLJJJJ;
            byte[] bArr2 = c1317860kOm.LIZ;
            if (bArr2 != null) {
                numValueOf = Integer.valueOf(bArr2.length);
            }
            numValueOf.intValue();
            c1317100kNY2.getClass();
            c1317760kOc.LJFF(pollingResponseLJFF, j);
            c098200Yq = Unit.LIZ;
        }
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c1317760kOc.LIZIZ.LIZJ(new C1291190jhl(-5, thM5exceptionOrNullimpl.getMessage()));
        }
        C1C7U.LIZIZ("SDUINetworkHandler@66f6.handleRenderMsg$1L");
    }

    public static final void run$4(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        C1698860uJI c1698860uJI = (C1698860uJI) aRunnableS17S0200100_20.l0;
        Surface surface = (Surface) aRunnableS17S0200100_20.l1;
        long j = aRunnableS17S0200100_20.j2;
        c1698860uJI.getClass();
        C1C7U.LIZ("TTKLivePlayer2@97f4.timeoutSetSurface$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("async setSurface with handler: ");
        sbLIZ.append(surface);
        c1698860uJI.LJJLIIIIJ(C2188811AlT.LIZIZ(sbLIZ));
        VideoLiveManager videoLiveManager = c1698860uJI.LLILZ;
        if (videoLiveManager != null) {
            videoLiveManager.LLLLZIL(j, surface);
        }
        C1C7U.LIZIZ("TTKLivePlayer2@97f4.timeoutSetSurface$1L");
    }

    public static final void run$5(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        Handler handler;
        C1277550jLl c1277550jLl;
        boolean z;
        String str;
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS17S0200100_20.l0;
        long j = aRunnableS17S0200100_20.j2;
        C1278260jMu c1278260jMu = (C1278260jMu) aRunnableS17S0200100_20.l1;
        C1C7U.LIZ("LyraxPlayerImpl@d373.play$1L");
        EnumC1279390jOj enumC1279390jOj = c1277680jLy.LJJIFFI;
        EnumC1279390jOj enumC1279390jOj2 = EnumC1279390jOj.PLAYED;
        if (enumC1279390jOj != enumC1279390jOj2) {
            if (c1277680jLy.LJIJJ) {
                ILyraxEngine iLyraxEngine = c1277680jLy.LIZIZ;
                String str2 = "";
                if (iLyraxEngine != null) {
                    LyraxAttributeKey lyraxAttributeKey = LyraxAttributeKey.ACCESS_GROUP_ID;
                    String str3 = c1277680jLy.LJIIL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    iLyraxEngine.setLyraxAttribute(lyraxAttributeKey, new LyraxValue(str3));
                }
                ILyraxEngine iLyraxEngine2 = c1277680jLy.LIZIZ;
                if (iLyraxEngine2 != null) {
                    iLyraxEngine2.setLyraxAttribute(LyraxAttributeKey.LIVE_ROLE, new LyraxValue("audience"));
                }
                ILyraxEngine iLyraxEngine3 = c1277680jLy.LIZIZ;
                if (iLyraxEngine3 != null) {
                    LyraxAttributeKey lyraxAttributeKey2 = LyraxAttributeKey.LIVE_ROOM_ID;
                    String str4 = c1277680jLy.LJIIL;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    iLyraxEngine3.setLyraxAttribute(lyraxAttributeKey2, new LyraxValue(str2));
                }
                ILyraxEngine iLyraxEngine4 = c1277680jLy.LIZIZ;
                if (iLyraxEngine4 != null) {
                    iLyraxEngine4.setLyraxAttribute(LyraxAttributeKey.AB_LABEL, new LyraxValue(c1277680jLy.LJIIJJI.LIZLLL));
                }
                ILyraxEngine iLyraxEngine5 = c1277680jLy.LIZIZ;
                if (iLyraxEngine5 != null) {
                    iLyraxEngine5.setBusinessID("ecommerce_auction_audience_lowlatency");
                }
            }
            C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
            if (c1279540jOy != null) {
                if (c1278260jMu == null) {
                    c1279540jOy.LIZLLL = true;
                    c1279540jOy.LIZ = new C1278260jMu();
                } else {
                    c1279540jOy.LIZLLL = false;
                    c1279540jOy.LIZ = c1278260jMu;
                    if (c1278260jMu.LIZJ != 0) {
                        c1279540jOy.LJIIJ();
                    }
                    if (c1279540jOy.LIZ.LIZJ != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1279540jOy.LJ = z;
                }
                C1278260jMu c1278260jMu2 = c1279540jOy.LIZ;
                if (c1278260jMu2 != null && (str = c1278260jMu2.LIZ) != null && str.length() != 0) {
                    C1278260jMu c1278260jMu3 = c1279540jOy.LIZ;
                    if (c1278260jMu3 != null) {
                        c1278260jMu3.LIZ = c1278260jMu3.LIZ;
                    }
                } else {
                    String str5 = c1279540jOy.LJIIIZ;
                    if (str5 != null && str5.length() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C1278260jMu c1278260jMu4 = c1279540jOy.LIZ;
                        if (c1278260jMu4 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(c1279540jOy.LJIIIZ);
                            sbLIZ.append('.');
                            sbLIZ.append(jCurrentTimeMillis);
                            sbLIZ.append('.');
                            sbLIZ.append(c1279540jOy.hashCode());
                            c1278260jMu4.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                }
                c1279540jOy.LJIILIIL = j;
                C1278260jMu c1278260jMu5 = c1279540jOy.LIZ;
                if (c1278260jMu5 != null && c1278260jMu5.LIZIZ == 0) {
                    c1278260jMu5.LIZIZ = j;
                    c1279540jOy.LJII(new JSONObject().put("event_key", "start_play"));
                }
            }
            ILyraxSubscriber iLyraxSubscriber = c1277680jLy.LIZ;
            if (iLyraxSubscriber != null) {
                iLyraxSubscriber.subscribe();
            }
            ILyraxSubscriber iLyraxSubscriber2 = c1277680jLy.LIZ;
            if (iLyraxSubscriber2 != null) {
                iLyraxSubscriber2.enableAudioRenderStallDetect(new LyraxAudioStallDetectConfig(true, 200));
            }
            if (c1277680jLy.LJJIFFI == EnumC1279390jOj.PAUSED && (c1277550jLl = c1277680jLy.LJ) != null) {
                c1277550jLl.LIZLLL();
            }
            c1277680jLy.LJJIFFI = enumC1279390jOj2;
            int i = c1277680jLy.LJIILL;
            if (i > 0) {
                if (c1277680jLy.LJIJ == null) {
                    c1277680jLy.LJIJ = new ARunnableS120S0100000_20(c1277680jLy, 229);
                }
                ARunnableS120S0100000_20 aRunnableS120S0100000_20 = c1277680jLy.LJIJ;
                if (aRunnableS120S0100000_20 != null && (handler = c1277680jLy.LJI) != null) {
                    C786410Ut5.LJLIIL(((long) i) * 1000, handler, aRunnableS120S0100000_20);
                }
            }
        }
        C1C7U.LIZIZ("LyraxPlayerImpl@d373.play$1L");
    }

    public static final void run$6(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        C1274340jGa c1274340jGa = (C1274340jGa) aRunnableS17S0200100_20.l0;
        long j = aRunnableS17S0200100_20.j2;
        InterfaceC1272490jDb interfaceC1272490jDb = (InterfaceC1272490jDb) aRunnableS17S0200100_20.l1;
        c1274340jGa.getClass();
        C1C7U.LIZ("ClientImpl@5fd5.initRtcVideoCallback$1$updateVideoFrame$1L");
        GLThreadManager.getMainGlHandle();
        c1274340jGa.LJFF.LJLJL.LJZL();
        C1269940j9U c1269940j9U = c1274340jGa.LJFF.LJLLI;
        if (c1269940j9U != null) {
            c1269940j9U.LIZ(12, j);
        }
        if (c1274340jGa.LJFF.LJZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RtcEncode_");
            sbLIZ.append(c1274340jGa.hashCode());
            interfaceC1272490jDb.release(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            interfaceC1272490jDb.release();
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.initRtcVideoCallback$1$updateVideoFrame$1L");
    }

    public static final void run$7(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        C1274330jGZ c1274330jGZ = (C1274330jGZ) aRunnableS17S0200100_20.l0;
        InterfaceC1272490jDb interfaceC1272490jDb = (InterfaceC1272490jDb) aRunnableS17S0200100_20.l1;
        long j = aRunnableS17S0200100_20.j2;
        c1274330jGZ.getClass();
        C1C7U.LIZ("ClientImpl@5fd5.initRtcVideoSink$1$updateVideoFrame$1L");
        GLThreadManager.getMainGlHandle();
        c1274330jGZ.LLJI.LJLJL.LJZL();
        C1269940j9U c1269940j9U = c1274330jGZ.LLJI.LJLLI;
        if (c1269940j9U != null) {
            c1269940j9U.LIZ(12, j);
        }
        if (c1274330jGZ.LLJI.LJZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RtcEncode_");
            sbLIZ.append(c1274330jGZ.hashCode());
            interfaceC1272490jDb.release(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            interfaceC1272490jDb.release();
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.initRtcVideoSink$1$updateVideoFrame$1L");
    }

    public static final void run$9(ARunnableS17S0200100_20 aRunnableS17S0200100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onInteractConnectionTimeCount$1");
        try {
            aRunnableS17S0200100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onInteractConnectionTimeCount$1");
    }

    public ARunnableS17S0200100_20(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
    }
}
